package org.example;

import org.example.MODELOS.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.print("Digita tu direccion: ");
        apartamento.setDireccion(lea.nextLine());

        System.out.print("Digita el tipo: ");
        apartamento.setTipo(lea.nextLine());

        System.out.print("Digita tu id: ");
        apartamento.setId(lea.nextLong());

        System.out.print("Digita el numero de habitaciones: ");
        apartamento.setNumeroHabitaciones(lea.nextInt());

        System.out.print("Digita el numero de banos: ");
        apartamento.setNumeroBanos(lea.nextInt());

        System.out.print("Digita el tamaño: ");
        apartamento.setTamano(lea.nextDouble());

        System.out.print("Digita el precio: ");
        apartamento.setPrecio(lea.nextDouble());



        System.out.println(apartamento);


    }
}