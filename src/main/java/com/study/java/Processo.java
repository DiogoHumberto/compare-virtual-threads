package com.study.java;

import java.time.Duration;

public class Processo {

    public Runnable executar(int processId) {

        return () -> {

            System.out.println(Thread.currentThread() + "Executando process Id : " + processId);

            try {

                Thread.sleep(Duration.ofSeconds(1));

            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread() + "-> Finalizando process Id : " + processId);

        };

    }
}
