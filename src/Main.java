public class Main {
    public static void main(String[] args) {
        Ogro ogro = new Ogro("OgroFeo", "Ogro líder de la horda", 250, 110, 180, "Jefe de guerra");
        Duende duende = new Duende("DuendeFeo", "Duende travieso de la selva encantada", 90, 60, 80, "Hechicero");

        System.out.println("Ogro: " + ogro.getType());
        System.out.println("Duende: " + duende.getType());

        Elfo elfo = new Elfo("ElfoChilero", "Príncipe elfo de Elfitos", 180, 80, 100, "Arquero");
        Enano enano = new Enano("EnanoGigante", "Hijo de EnanoMediano, de la Compañía del Anillo", 140, 90, 120, "Guerrero");
        Humano humano = new Humano("HumanoRaro", "El rey renuente de Jalapita", 185, 95, 150, "Esgrimista");


        elfo.atacar();
        enano.defender();
        humano.recibirAtaque();

        ogro.desplazarse();
        ogro.mostrarPoder();
        ogro.atacar();
        ogro.destruir();

        duende.desplazarse();
        duende.mostrarPoder();
        duende.atacar();
        duende.destruir();
    }
}
