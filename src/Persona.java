public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String name, int age, String ocupation){
        this.nombre = name;
        this.ocupacion = ocupation;
        this.edad = age;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return this.getNombre()+" es feliz siendo "+this.getOcupacion()+".";
    }
}
