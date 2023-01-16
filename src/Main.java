public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Luis");
        cliente.setEdad(43);
        cliente.setTelefono("04126613112");
        cliente.setCredito(true);

        System.out.println(cliente.getNombre()+" tiene "+cliente.getEdad()+" años y su telefono es "+cliente.getTelefono()+" y su credito es"+cliente.isCredito());


        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Jose");
        trabajador.setEdad(23);
        trabajador.setTelefono("0412698112");
        trabajador.setSalario(1000);

        System.out.println(trabajador.getNombre()+" tiene "+trabajador.getEdad()+" años y su telefono es "+trabajador.getTelefono()+" y su salario es "+trabajador.getSalario());
    }
}
