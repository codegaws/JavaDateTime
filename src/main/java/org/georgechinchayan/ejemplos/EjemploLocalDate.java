package org.georgechinchayan.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());
        System.out.println("Mes: " + fechaActual.getMonth());


        LocalDate fechaActual2 = LocalDate.of(2023,12,25);
        System.out.println("fechaActual = " + fechaActual2);

        fechaActual = LocalDate.of(2020, Month.NOVEMBER,1);
        System.out.println("fechaActual = " + fechaActual );

        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diademañana = LocalDate.now().plusDays(1);
        System.out.println("diademañana = " + diademañana);
        
        LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);
        
        int once = LocalDate.of(2020,11,11).getDayOfMonth();
        System.out.println("once = " + once);

        //bisiesto

        boolean esBisiesto=LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);
        
        boolean esAntes = LocalDate.of(2020,11,11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);
        
        boolean esdespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-12"));
        System.out.println("esdespues = " + esdespues);




    }
}