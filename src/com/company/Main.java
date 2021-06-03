package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    enum Season {Winter, Spring, Summer, Autumn}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //я загуглил, в общем я сделал setLenient, чтобы никакие другие форматы не учитывались, чтобы правильным был только dd/MM/yyyy
        format.setLenient(false);
        System.out.println("Введите дату в формате dd/mm/yyyy");
        System.out.println();
        String date = scanner.nextLine();
        String[] dayMonthYear = date.split("/");
        try {
            format.parse(date);
            System.out.println("Дата " + date + " правильна и существует ");
        } catch (ParseException e) {
            System.out.println("Дата " + date + " неправильна и не существует ");
        }
        switch (dayMonthYear[1]){
            case "12":
            case "01":
            case "02":
                System.out.println("This is " + Season.Winter);
                return;
            case "03":
            case "04":
            case "05":
                System.out.println("This is " + Season.Spring);
                return;
            case "06":
            case "07":
            case "08":
                System.out.println("This is " + Season.Summer);
                return;
            case "09":
            case "10":
            case "11":
                System.out.println("This is " + Season.Autumn);
                return;
        }
    }
}
