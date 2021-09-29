package com.pedelriomarron.users;

public class App {

    public static void main(String[] args) {

        User user = new UserBuilder()
                .withEmail("Nombre")
                .withName("Pedro","del Rio")
                .withPhone("555555")
                .withAddress("C// Fdez capitan")
                .build();

        System.out.println(user.getLastName());

    }
}
