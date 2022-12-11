from model import user
from model import contact
from model import file_operation

if __name__ == '__main__':
    contact1 = contact.Contact(user.User('Ivan', 'Ivanov', 'Ivanovich'), '+79311234567', '1')
    print(contact1)
    # user1 = user.User('Ivan', 'Ivanov', 'Ivanovich')
    # print(user1)
    file = file_operation.FileOperation('tst.csv')
    # lines = ['1234', '5678']
    # file.save_all_lines(lines)
    print(file.read_all_lines())
