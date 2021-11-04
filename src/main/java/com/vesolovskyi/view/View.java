package com.vesolovskyi.view;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.controller.impl.*;
import com.vesolovskyi.model.entities.*;
import lombok.SneakyThrows;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    private static final String KEY_EXIT = "Q";

    private static final String ERROR_NO_SUCH_OPTION = "No such option found. Try again.";

    private static final String TEXT_SELECT_MENU_OPTION = "Please choose menu option: ";
    private static final String TEXT_GO_BACK = "Go back or quit";

    private static Scanner input = new Scanner(System.in, "UTF-8");

    public View() {
    }

    public void show() {
        showTablesMenu();
    }

    private void showTablesMenu() {
        Map<String, String> tablesMenu = generateTablesMenu();
        Map<String, Printable> tablesMenuMethods = generateTablesMenuMethods();
        showMenuFromMaps(tablesMenu, tablesMenuMethods);
    }

    private Map<String, String> generateTablesMenu() {
        Map<String, String> tablesMenu = new LinkedHashMap<String, String>();
        tablesMenu.put("1", "Table: Delivery");
        tablesMenu.put("2", "Table: Pizza");
        tablesMenu.put("3", "Table: Additives for pizza");
        tablesMenu.put("4", "Table: Address");
        tablesMenu.put("5", "Table: City");
        tablesMenu.put("6", "Table: Client");
        tablesMenu.put("7", "Table: Client has delivery");
        tablesMenu.put("8", "Table: Courier");
        tablesMenu.put("9", "Table: Delivery has courier");
        tablesMenu.put("10", "Table: Drink");
        tablesMenu.put("11", "Table: Pizza composition");
        tablesMenu.put("12", "Table: Salad");
        tablesMenu.put("13", "Table: Street");
        return tablesMenu;
    }

    private Map<String, Printable> generateTablesMenuMethods() {
        Map<String, Printable> tableMenuMethods = new LinkedHashMap<String, Printable>();
        tableMenuMethods.put("1", this::showDeliveryMenu);
        tableMenuMethods.put("2", this::showPizzaMenu);
        tableMenuMethods.put("3", this::showAdditivesForPizzaMenu);
        tableMenuMethods.put("4", this::showAddressMenu);
        tableMenuMethods.put("5", this::showCityMenu);
        tableMenuMethods.put("6", this::showClientMenu);
        tableMenuMethods.put("7", this::showClientHasDeliveryMenu);
        tableMenuMethods.put("8", this::showCourierMenu);
        tableMenuMethods.put("9", this::showDeliveryHasCourierMenu);
        tableMenuMethods.put("10", this::showDrinkMenu);
        tableMenuMethods.put("11", this::showPizzaCompositionMenu);
        tableMenuMethods.put("12", this::showSaladMenu);
        tableMenuMethods.put("13", this::showStreetMenu);

        return tableMenuMethods;
    }

    private void showDeliveryMenu() {
        Map<String, String> menu = generateDeliveryMenu();
        Map<String, Printable> menuMethods = generateDeliveryMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }


    private void showPizzaMenu() {
        Map<String, String> menu = generatePizzaMenu();
        Map<String, Printable> menuMethods = generatePizzaMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showAdditivesForPizzaMenu() {
        Map<String, String> menu = generateAdditivesForPizzaMenu();
        Map<String, Printable> menuMethods = generateAdditivesForPizzaMenuMethods();
        showMenuFromMaps(menu, menuMethods);

    }

    private void showAddressMenu() {
        Map<String, String> menu = generateAddressMenu();
        Map<String, Printable> menuMethods = generateAddressMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showCityMenu() {
        Map<String, String> menu = generateCityMenu();
        Map<String, Printable> menuMethods = generateCityMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showClientMenu() {
        Map<String, String> menu = generateClientMenu();
        Map<String, Printable> menuMethods = generateClientMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showClientHasDeliveryMenu() {
        Map<String, String> menu = generateClientHasDeliveryMenu();
        Map<String, Printable> menuMethods = generateClientHasDeliveryMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showCourierMenu() {
        Map<String, String> menu = generateCourierMenu();
        Map<String, Printable> menuMethods = generateCourierMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showDeliveryHasCourierMenu() {
        Map<String, String> menu = generateDeliveryHasCourierMenu();
        Map<String, Printable> menuMethods = generateDeliveryHasCourierMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showDrinkMenu() {
        Map<String, String> menu = generateDrinkMenu();
        Map<String, Printable> menuMethods = generateDrinkMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showPizzaCompositionMenu() {
        Map<String, String> menu = generatePizzaCompositionMenu();
        Map<String, Printable> menuMethods = generatePizzaCompositionMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showSaladMenu() {
        Map<String, String> menu = generateSaladMenu();
        Map<String, Printable> menuMethods = generateSaladMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showStreetMenu() {
        Map<String, String> menu = generateStreetMenu();
        Map<String, Printable> menuMethods = generateStreetMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }


    private Map<String, String> generateDeliveryMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Delivery");
        menu.put("2", "Select Delivery");
        menu.put("3", "Create Delivery");
        menu.put("4", "Update Delivery");
        menu.put("5", "Delete Delivery");
        return menu;
    }


    private Map<String, String> generatePizzaMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Pizza");
        menu.put("2", "Select Pizza");
        menu.put("3", "Create Pizza");
        menu.put("4", "Update Pizza");
        menu.put("5", "Delete Pizza");
        return menu;
    }


    private Map<String, String> generateAdditivesForPizzaMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Additives for pizza");
        menu.put("2", "Select Additives for pizza");
        menu.put("3", "Create Additives for pizza");
        menu.put("4", "Update Additives for pizza");
        menu.put("5", "Delete Additives for pizza");
        return menu;
    }

    private Map<String, String> generateAddressMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Addresses");
        menu.put("2", "Select Address");
        menu.put("3", "Create Address");
        menu.put("4", "Update Address");
        menu.put("5", "Delete Address");
        return menu;
    }

    private Map<String, String> generateCityMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Cities");
        menu.put("2", "Select City");
        menu.put("3", "Create City");
        menu.put("4", "Update City");
        menu.put("5", "Delete City");
        return menu;
    }

    private Map<String, String> generateClientMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Clients");
        menu.put("2", "Select Client");
        menu.put("3", "Create Client");
        menu.put("4", "Update Client");
        menu.put("5", "Delete Client");
        return menu;
    }

    private Map<String, String> generateClientHasDeliveryMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Clients has delivery");
        menu.put("2", "Select Client has delivery");
        menu.put("3", "Create Client has delivery");
        menu.put("4", "Update Client has delivery");
        menu.put("5", "Delete Client has delivery");
        return menu;
    }

    private Map<String, String> generateCourierMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Couriers");
        menu.put("2", "Select Courier");
        menu.put("3", "Create Courier");
        menu.put("4", "Update Courier");
        menu.put("5", "Delete Courier");
        return menu;
    }

    private Map<String, String> generateDeliveryHasCourierMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Delivery has couriers");
        menu.put("2", "Select Delivery has courier");
        menu.put("3", "Create Delivery has courier");
        menu.put("4", "Update Delivery has courier");
        menu.put("5", "Delete Delivery has courier");
        return menu;
    }

    private Map<String, String> generateDrinkMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Drinks");
        menu.put("2", "Select Drink");
        menu.put("3", "Create Drink");
        menu.put("4", "Update Drink");
        menu.put("5", "Delete Drink");
        return menu;
    }

    private Map<String, String> generatePizzaCompositionMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Pizza compositions");
        menu.put("2", "Select Pizza composition");
        menu.put("3", "Create Pizza composition");
        menu.put("4", "Update Pizza composition");
        menu.put("5", "Delete Pizza composition");
        return menu;
    }

    private Map<String, String> generateSaladMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Salads");
        menu.put("2", "Select Salad");
        menu.put("3", "Create Salad");
        menu.put("4", "Update Salad");
        menu.put("5", "Delete Salad");
        return menu;
    }

    private Map<String, String> generateStreetMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all Streets");
        menu.put("2", "Select Street");
        menu.put("3", "Create Street");
        menu.put("4", "Update Street");
        menu.put("5", "Delete Street");
        return menu;
    }


    private Map<String, Printable> generateDeliveryMenuMethods() {
        Controller<DeliveryEntity, Integer> DeliveryController = new DeliveryControllerImpl();
        Formatter<DeliveryEntity, Integer> formatter = new Formatter<>(DeliveryEntity.class);
        ViewOperations<DeliveryEntity, Integer> DeliveryOperation = new ViewOperations<>(DeliveryController, formatter,
                DeliveryEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", DeliveryOperation::findAll);
        menuMethods.put("2", DeliveryOperation::findById);
        menuMethods.put("3", DeliveryOperation::create);
        menuMethods.put("4", DeliveryOperation::update);
        menuMethods.put("5", DeliveryOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generatePizzaMenuMethods() {
        Controller<PizzaEntity, Integer> pizzaController = new PizzaControllerImpl();
        Formatter<PizzaEntity, Integer> formatter = new Formatter<>(PizzaEntity.class);
        ViewOperations<PizzaEntity, Integer> pizzaOperation = new ViewOperations<>(pizzaController, formatter,
                PizzaEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", pizzaOperation::findAll);
        menuMethods.put("2", pizzaOperation::findById);
        menuMethods.put("3", pizzaOperation::create);
        menuMethods.put("4", pizzaOperation::update);
        menuMethods.put("5", pizzaOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateAdditivesForPizzaMenuMethods() {
        Controller<AdditivesForPizzaEntity, Integer> AdditivesForPizzaController = new AdditivesForPizzaControllerImpl();
        Formatter<AdditivesForPizzaEntity, Integer> formatter = new Formatter<>(AdditivesForPizzaEntity.class);
        ViewOperations<AdditivesForPizzaEntity, Integer> AdditivesForPizzaOperation = new ViewOperations<>(AdditivesForPizzaController, formatter,
                AdditivesForPizzaEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", AdditivesForPizzaOperation::findAll);
        menuMethods.put("2", AdditivesForPizzaOperation::findById);
        menuMethods.put("3", AdditivesForPizzaOperation::create);
        menuMethods.put("4", AdditivesForPizzaOperation::update);
        menuMethods.put("5", AdditivesForPizzaOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateAddressMenuMethods() {
        Controller<AddressEntity, Integer> AddressController = new AddressControllerImpl();
        Formatter<AddressEntity, Integer> formatter = new Formatter<>(AddressEntity.class);
        ViewOperations<AddressEntity, Integer> AddressOperation = new ViewOperations<>(AddressController,
                formatter, AddressEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", AddressOperation::findAll);
        menuMethods.put("2", AddressOperation::findById);
        menuMethods.put("3", AddressOperation::create);
        menuMethods.put("4", AddressOperation::update);
        menuMethods.put("5", AddressOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateCityMenuMethods() {
        Controller<CityEntity, Integer> CityController = new CityControllerImpl();
        Formatter<CityEntity, Integer> formatter = new Formatter<>(CityEntity.class);
        ViewOperations<CityEntity, Integer> CityOperation = new ViewOperations<>(CityController,
                formatter, CityEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", CityOperation::findAll);
        menuMethods.put("2", CityOperation::findById);
        menuMethods.put("3", CityOperation::create);
        menuMethods.put("4", CityOperation::update);
        menuMethods.put("5", CityOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateClientMenuMethods() {
        Controller<ClientEntity, Integer> ClientController = new ClientControllerImpl();
        Formatter<ClientEntity, Integer> formatter = new Formatter<>(ClientEntity.class);
        ViewOperations<ClientEntity, Integer> ClientOperation = new ViewOperations<>(ClientController, formatter,
                ClientEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", ClientOperation::findAll);
        menuMethods.put("2", ClientOperation::findById);
        menuMethods.put("3", ClientOperation::create);
        menuMethods.put("4", ClientOperation::update);
        menuMethods.put("5", ClientOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateClientHasDeliveryMenuMethods() {
        Controller<ClientHasDeliveryEntity, Integer> ClientHasDeliveryController = new ClientHasDeliveryControllerImpl();
        Formatter<ClientHasDeliveryEntity, Integer> formatter = new Formatter<>(ClientHasDeliveryEntity.class);
        ViewOperations<ClientHasDeliveryEntity, Integer> ClientHasDeliveryOperation = new ViewOperations<>(ClientHasDeliveryController, formatter, ClientHasDeliveryEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", ClientHasDeliveryOperation::findAll);
        menuMethods.put("2", ClientHasDeliveryOperation::findById);
        menuMethods.put("3", ClientHasDeliveryOperation::create);
        menuMethods.put("4", ClientHasDeliveryOperation::update);
        menuMethods.put("5", ClientHasDeliveryOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateCourierMenuMethods() {
        Controller<CourierEntity, Integer> CourierController = new CourierControllerImpl();
        Formatter<CourierEntity, Integer> formatter = new Formatter<>(CourierEntity.class);
        ViewOperations<CourierEntity, Integer> CourierOperation = new ViewOperations<>(CourierController, formatter,
                CourierEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", CourierOperation::findAll);
        menuMethods.put("2", CourierOperation::findById);
        menuMethods.put("3", CourierOperation::create);
        menuMethods.put("4", CourierOperation::update);
        menuMethods.put("5", CourierOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateDeliveryHasCourierMenuMethods() {
        Controller<DeliveryHasCourierEntity, Integer> DeliveryHasCourierController = new DeliveryHasCourierControllerImpl();
        Formatter<DeliveryHasCourierEntity, Integer> formatter = new Formatter<>(DeliveryHasCourierEntity.class);
        ViewOperations<DeliveryHasCourierEntity, Integer> DeliveryHasCourierOperation = new ViewOperations<>(DeliveryHasCourierController, formatter,
                DeliveryHasCourierEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", DeliveryHasCourierOperation::findAll);
        menuMethods.put("2", DeliveryHasCourierOperation::findById);
        menuMethods.put("3", DeliveryHasCourierOperation::create);
        menuMethods.put("4", DeliveryHasCourierOperation::update);
        menuMethods.put("5", DeliveryHasCourierOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateDrinkMenuMethods() {
        Controller<DrinkEntity, Integer> DrinkController = new DrinkControllerImpl();
        Formatter<DrinkEntity, Integer> formatter = new Formatter<>(DrinkEntity.class);
        ViewOperations<DrinkEntity, Integer> DrinkOperation = new ViewOperations<>(DrinkController, formatter,
                DrinkEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", DrinkOperation::findAll);
        menuMethods.put("2", DrinkOperation::findById);
        menuMethods.put("3", DrinkOperation::create);
        menuMethods.put("4", DrinkOperation::update);
        menuMethods.put("5", DrinkOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generatePizzaCompositionMenuMethods() {
        Controller<PizzaCompositionEntity, Integer> PizzaCompositionController = new PizzaCompositionControllerImpl();
        Formatter<PizzaCompositionEntity, Integer> formatter = new Formatter<>(PizzaCompositionEntity.class);
        ViewOperations<PizzaCompositionEntity, Integer> PizzaCompositionOperation = new ViewOperations<>(PizzaCompositionController, formatter,
                PizzaCompositionEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", PizzaCompositionOperation::findAll);
        menuMethods.put("2", PizzaCompositionOperation::findById);
        menuMethods.put("3", PizzaCompositionOperation::create);
        menuMethods.put("4", PizzaCompositionOperation::update);
        menuMethods.put("5", PizzaCompositionOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateSaladMenuMethods() {
        Controller<SaladEntity, Integer> SaladController = new SaladControllerImpl();
        Formatter<SaladEntity, Integer> formatter = new Formatter<>(SaladEntity.class);
        ViewOperations<SaladEntity, Integer> SaladOperation = new ViewOperations<>(SaladController, formatter,
                SaladEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", SaladOperation::findAll);
        menuMethods.put("2", SaladOperation::findById);
        menuMethods.put("3", SaladOperation::create);
        menuMethods.put("4", SaladOperation::update);
        menuMethods.put("5", SaladOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateStreetMenuMethods() {
        Controller<StreetEntity, Integer> StreetController = new StreetControllerImpl();
        Formatter<StreetEntity, Integer> formatter = new Formatter<>(StreetEntity.class);
        ViewOperations<StreetEntity, Integer> StreetOperation = new ViewOperations<>(StreetController, formatter,
                StreetEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", StreetOperation::findAll);
        menuMethods.put("2", StreetOperation::findById);
        menuMethods.put("3", StreetOperation::create);
        menuMethods.put("4", StreetOperation::update);
        menuMethods.put("5", StreetOperation::delete);
        return menuMethods;
    }


    @SneakyThrows
    private void showMenuFromMaps(Map<String, String> keyName, Map<String, Printable> keyMethod) {
        String keyMenu;
        do {
            printMenu(keyName);
            System.out.println(TEXT_SELECT_MENU_OPTION);
            keyMenu = input.nextLine().toUpperCase();
            Printable method = keyMethod.get(keyMenu);
            if (method != null) {
                method.print();
            } else if (!keyMenu.equals(KEY_EXIT)) {
                System.out.println(ERROR_NO_SUCH_OPTION);
            }
        } while (!keyMenu.equals(KEY_EXIT));
    }

    private void printMenu(Map<String, String> keyName) {
        for (String key : keyName.keySet()) {
            System.out.format("%3s - %s%n", key, keyName.get(key));
        }
        System.out.format("%3s - %s%n", KEY_EXIT, TEXT_GO_BACK);
    }
}
