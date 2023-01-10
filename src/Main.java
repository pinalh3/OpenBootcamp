public class Main {
    public static void main(String[] args) {
        Coche miCoche= new Coche();
        miCoche.masPuertas();
        System.out.println(miCoche.puertas);

    }

    public static class Coche{
        int puertas;

        public Coche(){

        }

        public void masPuertas(){
            puertas++;
        }
    }
}