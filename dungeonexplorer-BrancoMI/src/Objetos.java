public class Objetos implements gameObjects {
    private String name;

    public Objetos(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

}
