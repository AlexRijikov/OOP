package oop.model.infrastructure;

import oop.model.Client.Client;
import oop.model.employee.Cashier;
import oop.model.employee.Manager;
import oop.model.employee.Security;

public class Store {
    public Store(String nemeGoods, int priceProduct, String nameStore, String storeAddress, Manager manager, Cashier cashier, Security security, Client client) {
        this.nemeGoods = nemeGoods;
        this.priceProduct = priceProduct;
        this.nameStore = nameStore;
        this.storeAddress = storeAddress;
        this.manager = manager;
        this.cashier = cashier;
        this.security = security;
        this.client = client;
    }

    private String nemeGoods;
    private int priceProduct;
    private String nameStore = "AТБ";
    private String storeAddress;

    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Client client;

    public String getNemeGoods() {
        return nemeGoods;
    }

    public void setNemeGoods(String nemeGoods) {
        this.nemeGoods = nemeGoods;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void open() {
        System.out.println("       Магазин отрыт!!!!!!");
    }

    public void dinner() {
        System.out.println("   Магазин на обеде.");
    }

    public void sell() {
        System.out.println("  Магазин продайот товар.");
    }

    public void сlose() {
        System.out.println("      Магазин закрыт!!!!!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store)) return false;

        Store store = (Store) o;

        if (getPriceProduct() != store.getPriceProduct()) return false;
        if (getNemeGoods() != null ? !getNemeGoods().equals(store.getNemeGoods()) : store.getNemeGoods() != null)
            return false;
        if (getNameStore() != null ? !getNameStore().equals(store.getNameStore()) : store.getNameStore() != null)
            return false;
        if (getStoreAddress() != null ? !getStoreAddress().equals(store.getStoreAddress()) : store.getStoreAddress() != null)
            return false;
        if (getManager() != null ? !getManager().equals(store.getManager()) : store.getManager() != null) return false;
        if (getCashier() != null ? !getCashier().equals(store.getCashier()) : store.getCashier() != null) return false;
        if (getSecurity() != null ? !getSecurity().equals(store.getSecurity()) : store.getSecurity() != null)
            return false;
        return getClient() != null ? getClient().equals(store.getClient()) : store.getClient() == null;
    }

    @Override
    public int hashCode() {
        int result = getNemeGoods() != null ? getNemeGoods().hashCode() : 0;
        result = 31 * result + getPriceProduct();
        result = 31 * result + (getNameStore() != null ? getNameStore().hashCode() : 0);
        result = 31 * result + (getStoreAddress() != null ? getStoreAddress().hashCode() : 0);
        result = 31 * result + (getManager() != null ? getManager().hashCode() : 0);
        result = 31 * result + (getCashier() != null ? getCashier().hashCode() : 0);
        result = 31 * result + (getSecurity() != null ? getSecurity().hashCode() : 0);
        result = 31 * result + (getClient() != null ? getClient().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Store{" +
                "nemeGoods='" + nemeGoods + '\'' +
                ", priceProduct=" + priceProduct +
                ", nameStore='" + nameStore + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", security=" + security +
                ", client=" + client +
                '}';
    }

    public void sellGoods(String nemeGoods, String priceProduct) {
        System.out.println("Магазин продал " + priceProduct + " покупателю " + nemeGoods);
    }


}
