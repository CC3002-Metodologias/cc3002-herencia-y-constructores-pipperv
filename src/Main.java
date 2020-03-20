public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Marcelo", 28,"ingeniero");
        Estudiante p2 = new Estudiante("Rodrigo", 20);
        Academico p3 = new Academico("Gabriela", 34, "'Machine Learning to found missing dogs'");
        System.out.println(p1.hacerLoSuyo());
        System.out.println(p2.hacerLoSuyo());
        System.out.println(p3.hacerLoSuyo());
        System.out.println(p3.publicarPaper());
    }
}
