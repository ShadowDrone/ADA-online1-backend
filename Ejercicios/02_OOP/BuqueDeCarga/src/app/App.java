package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Un buque de carga traslada 100 contenedores a tres diferentes puertos del
 * país. Los puertos se identifican con los números 1, 2 y 3. De cada contenedor
 * que el buque traslade se registran los siguientes datos: - Identificación del
 * contenedor - Peso del contenedor en kg - Puerto de arribo(un valor de 1 a 3).
 * Se pide calcular e informar: 1) El peso total que el buque debe trasladar 2)
 * La identificación del contenedor de mayor peso 3) La cantidad de contenedores
 * que debe trasladar a cada puerto
 */

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static List<Puerto> Puertos = new ArrayList();

    public static void main(String[] args) throws Exception {

        // Inicializo los puertos principales;
        GenerarPuertosPorDefecto();

        Buque buque = new Buque();

        for (int i = 0; i < 6; i++) {
            Contenedor contenedor = new Contenedor();
            System.out.println("Ingrese ID del contenedor: ");
            String idContenedor = Teclado.nextLine();
            contenedor.setIdContenedor(idContenedor);
            System.out.println("Ingrese peso del contenedor: ");
            double pesoContenedor = Teclado.nextDouble();
            Teclado.nextLine();
            contenedor.setPesoContenendor(pesoContenedor);
            System.out.println("Ingrese puerto de destino: 1 - 2 o 3");
            int numeroPuerto = Teclado.nextInt();
            Teclado.nextLine();
            // buscar puerto, esto puede ser un metodo fuera del for
            for (Puerto p : Puertos) {
                if (p.getNumeroPuerto() == numeroPuerto) {
                    contenedor.setPuerto(p);
                }
            }
            buque.getContenedores().add(contenedor);
        }

        System.out.println("El peso que debe trasladar el buque es " + buque.calcularPeso());
        System.out.println("El contenedor de mayor peso es: " + buque.identificarMaximo().getIdContenedor());

        for (Puerto p : Puertos) {

            System.out.println(
                    "La cantidad de contenedores a trasladar es: " + buque.contarContenedores(p.getNumeroPuerto()));

        }
    }

    public static void GenerarPuertosPorDefecto() {
        Puerto puerto = new Puerto();
        puerto.setNumeroPuerto(1);
        puerto.setNombrePuerto("Puerto San Martín");
        Puertos.add(puerto);

        puerto = new Puerto();
        puerto.setNumeroPuerto(2);
        puerto.setNombrePuerto("Puerto Madryn");
        Puertos.add(puerto);

        puerto = new Puerto();
        puerto.setNumeroPuerto(3);
        puerto.setNombrePuerto("Puerto San Blas");
        Puertos.add(puerto);
    }
}