package com.example.tema9;

public class tema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Alice";
        System.out.println("CLIENTE");
        System.out.println("Su nombre es " + cliente.nombre);
        cliente.edad = 31;
        System.out.println("Tiene " + cliente.edad + " años");
        cliente.telefono = 123456;
        System.out.println("Su número de teléfono es " + cliente.telefono);
        cliente.credito = 792.3;
        System.out.println("Tiene un crédito de " + cliente.credito + "$");

        trabajador.nombre = "Paco";
        trabajador.edad = 24;
        trabajador.telefono = 225132;
        trabajador.salario = 1200.7;
        System.out.println("TRABAJADOR");
        System.out.println("Su nombre es "+ trabajador.nombre + ", tiene " + trabajador.edad + " años y  su teléfono es "
        + trabajador.telefono + " y tiene un salario de " + trabajador.salario + "$");
    }
}
class Persona {
    String nombre;
    int edad;
    int telefono;
}
class Cliente extends Persona {
    double credito;
}
class Trabajador extends Persona {
    double salario;
}