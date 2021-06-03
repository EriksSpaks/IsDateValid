package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //я загуглил, в общем я сделал setLenient, чтобы никакие другие форматы не учитывались, чтобы правильным был только dd/MM/yyyy
        format.setLenient(false);
        String date = scanner.nextLine();
        try {
            format.parse(date);
            System.out.println("Дата " + date + " правильна и существует ");
        } catch (ParseException e) {
            System.out.println("Дата " + date + " неправильна и не существует ");

        }
    }
}