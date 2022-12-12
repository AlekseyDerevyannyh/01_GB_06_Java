from model import contact_mapper_csv
from model import file_operation
from model import contact


class Repository:
    def __init__(self, _file_operation):
        self.__mapper = contact_mapper_csv.ContactMapperCsv()
        self.__file_operation = _file_operation

    def get_all_contact(self):
        contacts = []
        if isinstance(self.__file_operation, file_operation.FileOperation):
            lines = self.__file_operation.read_all_lines()
            for line in lines:
                contacts.append(self.__mapper.map_from_str(line))
        return contacts

    def get_max_id(self, contacts):
        id = 0
        for _contact in contacts:
            if isinstance(_contact, contact.Contact):
                if int(_contact.get_id()) > id:
                    id = int(_contact.get_id())
        return id

    def create_contact(self, _contact):
        contacts = Repository.get_all_contact(self)
        id = Repository.get_max_id(self, contacts)
        id += 1
        if isinstance(_contact, contact.Contact):
            _contact.set_id(id)
        Repository.save_contact(_contact, contacts)
        return str(id)

    def save_contact(self, _contact, contacts):
        contacts.append(_contact)
        Repository.save_contacts(contacts)

    def save_contacts(self, contacts):
        lines = []
        for _contact in contacts:
            lines.append(self.__mapper.map_to_str(_contact))
        if isinstance(self.__file_operation, file_operation.FileOperation):
            self.__file_operation.save_all_lines(lines)
