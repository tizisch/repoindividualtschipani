public class Main  {
    public static void main(String[] args) {
        torneo miTorneo = new torneo();

        miTorneo.iniciartorneo();
        miTorneo.agregarusuarios("Juan", 50);
        miTorneo.agregarusuarios("Manu", 80);
        System.out.println("Lista de usuarios:");
        miTorneo.mostrarususarios();
        int puntos = miTorneo.buscarusuario("Juan");
        System.out.println("\nEl puntaje de Juan es: " + puntos);
        int max=miTorneo.puntajemaximo();
        System.out.println("\nEl puntaje mas alto del torneo es: "+max);
    }
}

