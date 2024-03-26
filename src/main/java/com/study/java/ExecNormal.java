package com.study.java;

import java.time.Duration;
import java.util.Scanner;

public class ExecNormal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Envie a quantidade de request : ");
        var qtReqs = Integer.valueOf(scanner.nextLine());
        scanner.close();

        long tempInit = System.currentTimeMillis();

        for (int i = 0; i < qtReqs; i++) {
           new Processo().executar(i).run();

        }

        System.out.println(Duration.ofMillis(System.currentTimeMillis() -tempInit).toSeconds() + "segundos");
    }
}