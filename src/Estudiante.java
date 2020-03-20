public class Estudiante extends Persona{

    public Estudiante(String name, int age) {
        super(name, age, "Estudiante");
    }

    @Override
    public String hacerLoSuyo() {
        return super.getNombre()+" se quedó dormide y va tarde a clases. Ah! verdad que es online y no tiene que ir a la U, bien por "+super.getNombre()+", va a seguir durmiendo.";
    }
}
