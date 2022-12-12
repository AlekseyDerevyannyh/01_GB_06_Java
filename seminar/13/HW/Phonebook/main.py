from model import user
from model import contact
from model import file_operation
from model import repository
from controller import controller

if __name__ == '__main__':
    # contact1 = contact.Contact(user.User('Ivan', 'Ivanov', 'Ivanovich'), '+79311234567', '1')
    # print(contact1)
    # user1 = user.User('Ivan', 'Ivanov', 'Ivanovich')
    # print(user1)
    # file = file_operation.FileOperation('tst.csv')
    # lines = ['1234', '5678']
    # file.save_all_lines(lines)
    # print(file.read_all_lines())
    file = file_operation.FileOperation('tst.csv')
    repo = repository.Repository(file)
    control = controller.Controller(repo)
    # control.save_contact(contact.Contact(user.User('Ivan', 'Ivanov', 'Ivanovich'), '+79311234567', '0'))
    contacts = control.read_contacts()
    for _contact in contacts:
        print(_contact)
