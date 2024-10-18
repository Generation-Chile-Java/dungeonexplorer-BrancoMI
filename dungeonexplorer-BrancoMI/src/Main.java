import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre de jugador: ");

        String name = sc.nextLine();

        Player player = new Player (name, 8);

        ROOM[] rooms = {
                new Salas.empty(),
                new Salas.cocina (new Objetos("Cuchara")),
                new Salas.sotano ("Max",2),
                new Salas.empty(),
                new Salas.sotano("Gordon",1),
                new Salas.sotano( "Gusto",1),
                new Salas.cocina(new Objetos("Cacerola")),
                new Salas.empty(),
                new Salas.empty(),
                new Salas.cocina(new Objetos("ELSilencioEterno")),
                new Salas.sotano ("Vnaiba",3),
                new Salas.cocina(new Objetos("Princesa"))
        };

        int roomIndex = 0;
        while (player.vidas() && roomIndex< rooms.length) {
            System.out.println("\n");
            player.showStatus();

            System.out.print("Elige una sala (1 o 2): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            if (choice == 1) {
                rooms[roomIndex].enter(player);
                roomIndex++;
            } else if (choice == 2 && roomIndex + 1 < rooms.length) {
                rooms[roomIndex + 1].enter(player);
                roomIndex += 2; // Avanza dos salas
            } else {
                System.out.println("Opción no válida. Elige nuevamente.");
            }
        }

        if (player.vidas()) {
            System.out.println("¡Has explorado todas las salas!");
        } else {
            System.out.println("¡Has muerto! Fin del juego.");
        }

        sc.close();
        }


    }