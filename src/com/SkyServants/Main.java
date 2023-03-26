package com.SkyServants;

public class Main {
    public static void main(String[] args) {

        //Creacion de objeto e implementacion de los metodos que se estipulan en interfaz

        CocheCRUDlmpl cocheCRUDlmpl = new CocheCRUDlmpl();


        cocheCRUDlmpl.save();
        cocheCRUDlmpl.findAll();
        cocheCRUDlmpl.delete();
    }
}
