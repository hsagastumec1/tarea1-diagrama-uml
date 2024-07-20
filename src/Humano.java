public class Humano extends Personaje implements Heroe {
    private String type;

    public Humano(String nombre, String descripcion, long tamaño, int poder, int vida, String type) {
        super(nombre, descripcion, tamaño, poder, vida);
        this.type = type;
    }

    @Override
    public void desplazarse() {
        System.out.println("El humano se desplaza con versatilidad por distintos terrenos.");
    }

    @Override
    public void mostrarPoder() {
        System.out.println("El poder del humano es: " + poder);
    }

    @Override
    public void atacar() {
        System.out.println("El humano utiliza su espada en un rápido ataque.");
    }

    @Override
    public void defender() {
        System.out.println("El humano bloquea con su escudo para defenderse.");
    }

    @Override
    public void recibirAtaque() {
        System.out.println("El humano recibe un golpe y retrocede.");
        vida -= 12;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
