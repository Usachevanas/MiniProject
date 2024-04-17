package MP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactService contactService = new ContactService(new Contact[10]);
        contactService.showMenu();
        while (true) {
            contactService.showAllContacts();
            System.out.println("Введите номер команды:");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            if (menu == 1) {
                System.out.print("Введите имя: ");
                String name = scanner.next();
                System.out.print("Введите номер: ");
                String value = scanner.next();
                contactService.createContact(name, value);
            } else if(menu == 2) {
                System.out.print("Введите индекс: ");
                int index = scanner.nextInt();
                System.out.print("Введите имя: ");
                String name = scanner.next();
                System.out.print("Введите номер: ");
                String value = scanner.next();
                contactService.editContact(index, name, value);
            } else if(menu == 3) {
                System.out.print("Введите индекс: ");
                int index = scanner.nextInt();
                contactService.deleteContact(index);
            } else if(menu == 4) {
                return;
            } else {
                System.out.println("Некорректная команда!");
            }
        }
    }
}
