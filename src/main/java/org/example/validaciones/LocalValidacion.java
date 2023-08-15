package org.example.validaciones;

public class LocalValidacion {
    //metodos ordinarios

    public Boolean validarNIT(String nit) throws Exception{
        if (nit == null){
            throw new Exception("El nit no puede ser nulo");
        }
        if (!nit.matches("\\d{10}")){
            throw new Exception("El nit debe de contener 10 digitos");
        }
        return true;
    }

    public Boolean validarNombre(String nombre)throws Exception {
        if (nombre == null){
            throw new Exception("El nombre no puede ser nulo");
        }
        if (nombre.length() > 30){
            throw new Exception("El nombre de la empresa no puede sobrepasar los 30 caracteres");
        }
        return true;
    }
}
