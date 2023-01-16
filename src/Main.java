public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Luis");
        persona.setEdad(43);
        persona.setTelefono("04126613112");

        System.out.println(persona.getNombre()+" tiene "+persona.getEdad()+" años y su telefono es "+persona.getTelefono());

    }
}
