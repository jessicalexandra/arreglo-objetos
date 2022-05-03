package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // write your code here
        List<Empleado> empleados = new ArrayList<>();

        boolean menu = true;

        while (menu) {
            System.out.println("empleado (1=insertar ,2=leer,3=Actualizar,4=eliminar,5=Buscar, 6=Salir )");
            int opt = Integer.parseInt(entrada.nextLine());

            switch (opt) {
                case 1:
                    Empleado empleado = new Empleado();
                    System.out.println("ingrese el nombre del empleado");
                    empleado.setNombre(entrada.nextLine());
                    System.out.println("ingresa la edad");
                    empleado.setEdad(Integer.parseInt(entrada.nextLine()));
                    System.out.println("ingrese el email");
                    empleado.setEmail(entrada.nextLine());
                    System.out.println("ingrese el salario ");
                    empleado.setSalario(Double.parseDouble(entrada.nextLine()));
                    empleados.add(empleado);
                    break;
                case 2:
                    for (Empleado emp : empleados) {
                        System.out.println("el nombre del empleado es " + emp.getNombre());
                        System.out.println("la edad del empleado " + emp.getEdad());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del empleado a actualizar");
                    String nom = entrada.nextLine();
                    boolean vacio = false;
                    for (Empleado emp : empleados) {
                        if (emp.getNombre().equalsIgnoreCase(nom)) {
                            System.out.println("ingrese el nombre del empleado");
                            emp.setNombre(entrada.nextLine());
                            System.out.println("ingresa la edad");
                            emp.setEdad(Integer.parseInt(entrada.nextLine()));
                            System.out.println("ingrese el email");
                            emp.setEmail(entrada.nextLine());
                            System.out.println("ingrese el salario ");
                            emp.setSalario(Double.parseDouble(entrada.nextLine()));

                            vacio = true;
                            break;
                        }
                    }
                    if (!vacio) {
                        System.out.println("el empleado no esta registrado");
                    }
                    break;

                case  4:
                    System.out.println("Ingrese el nombre del empleado a eliminar");
                    String nomb = entrada.nextLine();
                     boolean eliminado= true;
                    for (Empleado emp : empleados) {
                        if (emp.getNombre().equalsIgnoreCase(nomb)) {
                            empleados.remove(emp);
                            System.out.println("el empleado "+emp.getNombre()+" fue eliminado");
                            eliminado = false;
                            break;
                        }
                    }
                    if (eliminado) {
                        System.out.println("el empleado no esta registrado");
                    }
                    break;

                case  5:
                    System.out.println("Ingrese el nombre del empleado a buscar");
                    String nombr = entrada.nextLine();
                    boolean buscar= false;
                    for (Empleado emp : empleados) {
                        if (emp.getNombre().equalsIgnoreCase(nombr)) {
                            System.out.println("nombre del empleado "+emp.getNombre());
                            buscar = true;
                            break;
                        }
                    }
                    if (!buscar) {
                        System.out.println("el empleado no esta registrado");
                    }
                    break;

                case 6:
                    menu=false;
                    break;

            }

        }

    }
}
