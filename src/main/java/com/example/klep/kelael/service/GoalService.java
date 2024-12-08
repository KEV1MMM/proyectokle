package com.example.klep.kelael.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.klep.kelael.model.Goal;
import com.example.klep.kelael.repository.GoalRepositoryMongo;

@Service
public class GoalService {

    @Autowired
    private GoalRepositoryMongo goalRepository;

    // Obtener un gol por ID
    public Optional<Goal> getGoal(String id) {
        return goalRepository.findById(id);
    }

    // Guardar un nuevo gol
    public Goal saveGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    // Eliminar un gol por ID
    public void deleteGoal(String id) {
        goalRepository.deleteById(id);
    }

    // Registrar un gol manualmente desde consola
    public void registrarGol() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el ID del Jugador: ");
            String jugadorId = scanner.nextLine();

            System.out.print("Ingrese el ID del Partido: ");
            String partidoId = scanner.nextLine();

            System.out.print("Ingrese el Minuto del Gol: ");
            int minuto = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer después del nextInt()

            Goal goal = new Goal();
            goal.setJugadorId(jugadorId);
            goal.setPartidoId(partidoId);
            goal.setMinuto(minuto);

            goalRepository.save(goal);

            System.out.println("Gol registrado correctamente.");
        } catch (Exception e) {
            System.out.println("Hubo un error al registrar el gol: " + e.getMessage());
        }
    }
}
