public class Salas {
    public static class empty implements ROOM {
        @Override
        public void enter(Player player) {
            System.out.println("Entraste en un Piso vacia. no hay nada aqui.");
        }
    }
    public static class cocina implements ROOM {
        private gameObjects Tenedor;
        public cocina(gameObjects Tenedor) {
            this.Tenedor = Tenedor;
        }
        @Override
        public void enter(Player player) {
            System.out.println("Encontraste un " + Tenedor.getName() + ".");
            player.colection(Tenedor);
        }
    }
    public static class sotano implements ROOM {
        private String Ladron;
        private int Damage;
        public sotano(String Ladron, int Damage) {
            this.Ladron = Ladron;
            this.Damage = Damage;
        }
        @Override
        public void enter(Player player) {
            System.out.println("Que mala suerte te encontraste un " + Ladron + ".");
            player.takeDamage(Damage);
        }
    }


    }
