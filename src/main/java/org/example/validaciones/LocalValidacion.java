package org.example.validaciones;

public class LocalValidacion {
    //metodos ordinarios

    public Boolean validarNIT(String nit) throws Exception{
        return nit != null && nit.matches("\\d{10}");

    }

    public Boolean validarNombre(String nombre){
        return true;
    }




}
