package com.example.klep.kelael;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.klep.kelael.service.GoalService;
import com.example.klep.kelael.service.MatchService;
import com.example.klep.kelael.service.PlayerService;

@Component
public class MainApp implements CommandLineRunner {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private MatchService matchService;

    @Autowired
    private GoalService goalService;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Consultar jugadores");
            System.out.println("2. Consultar partidos");
            System.out.println("3. Registrar goles");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    playerService.mostrarJugadores();
                    break;

                case 2:
                    matchService.mostrarPartidos();
                    break;

                case 3:
                    goalService.registrarGol();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, intenta otra vez.");
            }
        }

        scanner.close();
    }
}
