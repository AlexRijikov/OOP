package oop;

import oop.model.Client.Client;
import oop.model.employee.Cashier;
import oop.model.employee.Manager;
import oop.model.employee.Security;
import oop.model.infrastructure.Store;

public class Maine {
    public static void main(String[] args) {
        Manager manager = new Manager("Иванович", "Иван", "Иванов",
                10, 10, 2010,
                "0988675261",
                "10", "10", "2010",
                2000, '1', " Fod");
        Cashier cashier = new Cashier("Олеговна", "Катя", "Иванова",
                12, 11, 2010,
                "0962871134",
                "12", "12", "2012",
                1900, '2', "2");
        Security security = new Security("Пупкин", "Павел", "Иванович", 8, 3,
                1998, "050320854", "21", "11", "2019", 1000,
                '1');
        Client client = new Client("Иванович", "Николай", "Иванов", 9, 2, 1996,
                "0976585664", "213455", 100000);
        Store store = new Store("Meat", 2, "АТБ", "Навгородская", manager, cashier, security, client);


        store.setCashier(cashier);
        store.setManager(manager);
        store.setSecurity(security);
        store.setClient(client);

        store.open();

        manager.comeToWork();
        cashier.comeToWork();
        security.comeToWork();

        cashier.receipts();
        store.sell();

        client.сameToTheStore();
        security.rabota();
        client.infoTovar();
        manager.toDoWork();
        manager.consult();
        manager.rotateAboutDiscounts();

        client.buy();
        cashier.toDoWork();
        security.toDoWork();
        store.sellGoods("Васе", " Банан");
        client.leftTheStore();

        store.dinner();
        manager.comeForLunch();
        cashier.comeForLunch();
        security.comeForLunch();

        manager.goOutForLunch();
        cashier.goOutForLunch();
        security.goOutForLunch();

        store.open();

        cashier.receipts();
        store.sell();

        client.сameToTheStore();
        security.rabota();
        client.infoTovar();
        manager.toDoWork();
        manager.consult();
        manager.rotateAboutDiscounts();

        client.buy();
        cashier.toDoWork();
        security.toDoWork();
        store.sellGoods("Коле", "Водку");
        client.leftTheStore();

        manager.closeDepartament();
        cashier.closeCassa();
        security.checkBypass();

        store.сlose();

        manager.leaveTheJob();
        cashier.leaveTheJob();
        security.leaveTheJob();


    }
}
