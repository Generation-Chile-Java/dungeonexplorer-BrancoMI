import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private int health;
    private List<gameObjects> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " recibiste " + damage + " puntos de daño. Te quedan " + health + " Puntos de vida");
    }
    public void colection(gameObjects objetos){
        inventory.add(objetos);
        System.out.println(name + " recogiste " + objetos.getName());
    }
    public boolean vidas() {
        return health > 0;
    }
    public void showStatus (){
        System.out.println(name + " tienes " + health + " puntos de vida");
    }
}
