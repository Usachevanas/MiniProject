package MP;

public class ContactService {

    Contact [] contacts;
    public ContactService(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void createContact (String name, String value) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts [i] == null) {
                contacts [i] = new Contact(name, value);
                return;
            }
            if( i == contacts.length-1 ) {
                System.out.println("Массив контактов переполнен, новый контакт не создан!");
                return;
            }
        }
    }
    public void editContact(int index, String name, String value) {
        if (contacts [index] != null) {
            contacts [index].setName(name);
            contacts [index].setValue(value);
            System.out.println("Контакт изменен!");
        } else {
            System.out.println("Контакт под индексом " + index + " отсутствует!");
        }
    }
    public void deleteContact(int index) {
        if (contacts [index] == null) {
            System.out.println("Контакт под индексом " + index + " отсутствует!");
        }  else {
            contacts[index] = null;
            System.out.println("Контакт удален!");
        }
    }

    public void showAllContacts(){
        System.out.println("Список контактов:");
        for(int i = 0; i < contacts.length; i++) {
            if(contacts[i] == null) {
                System.out.printf("%d. ...%n", i+1);
            } else {
                System.out.printf("%d. %s %s%n", i+1, contacts[i].getName(), contacts[i].getValue());
            }
        }
    }
    public void showMenu () {
        System.out.println("1. Новый контакт");
        System.out.println("2. Редактировать контакт");
        System.out.println("3. Удалить контакт");
        System.out.println("4. Выйти");
    }
}

