package com.SkyServants;

public class CocheCRUDlmpl implements CocheCRUD {


    // Metodos que son definidos por la interfaz
    @Override
    public void save() {
        System.out.println("Metodo Save");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo FindAll");
    }

    @Override
    public void delete() {
        System.out.println("Metodo Delete");
    }
}
