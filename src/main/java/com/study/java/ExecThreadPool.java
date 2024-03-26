package com.study.java;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecThreadPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---->>> Iniciando com Threads Pool <<<----");
        System.out.print("Envie a quantidade de request : ");
        var qtReqs = Integer.valueOf(scanner.nextLine());
        System.out.print("Qual a quantidade de Threads : ");
        var qtThreads = Integer.valueOf(scanner.nextLine());
        scanner.close();

        long tempInit = System.currentTimeMillis();

        try(ExecutorService executorService = Executors.newFixedThreadPool(qtThreads)) {

            for (int i = 0; i < qtReqs; i++) {
                var process = new Processo().executar(i);
                executorService.submit(process);

            }
        }

        System.out.println(Duration.ofMillis(System.currentTimeMillis() -tempInit).toSeconds() + "segundos");
    }
}