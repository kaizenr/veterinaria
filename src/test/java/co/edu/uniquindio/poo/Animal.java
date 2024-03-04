package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {

    public String nombre;
    public float peso;
    public String color;
    public String raza;
    public String especie;

    public static List<Animal> listofAnimal = new ArrayList<>();

    public Animal(String nombre, float peso, String color, String raza, String especie) {
        this.nombre = nombre;
        this.peso = peso;
        this.color = color;
        this.raza = raza;
        this.especie = especie;
    }

    public static void agregarAnimal(String nombre, float peso, String color, String raza, String especie) {
        try {            
            Animal tipoAnimal = new Animal(nombre, peso, color, raza, especie);
            listofAnimal.add(tipoAnimal);
            System.out.println("Animal agregado correctamente");
        } catch (Exception e) {
            System.out.println("Error al agregar el animal: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        int salida=1;

        while (salida!=0) {
            System.out.println("Bienvenido a la veterinaria");

            Scanner sc = new Scanner(System.in);

            System.out.print("Nombre:");
            String nombre=sc.nextLine();                    
            
            System.out.print("Color:");
            String color=sc.nextLine();
            
            System.out.print("Raza:");
            String raza=sc.nextLine();

            System.out.print("Especie:");
            String especie=sc.nextLine();  
            
            System.out.print("Peso:");
            float peso=sc.nextFloat();

            Animal.agregarAnimal(nombre, peso, color, raza, especie);

            System.out.println("Los animales en la veterinaria son:");
            for (Animal recorrer : listofAnimal) {
                System.out.println(recorrer.nombre);
                System.out.println(recorrer.especie);
                System.out.println(recorrer.peso);
                System.out.println(recorrer.raza);
                System.out.println(recorrer.color);
            }
        }      
    }
}