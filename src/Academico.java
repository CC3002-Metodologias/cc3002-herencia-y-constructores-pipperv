public class Academico extends Persona{

    protected String paper;

    public Academico(String name, int age, String peiper) {
        super(name, age, "Academico");
        this.paper = peiper;
    }

    public String getPaper() {
        return paper;
    }

    @Override
    public String hacerLoSuyo() {
        return super.getNombre()+" esta preparando la clase online, no te voy a mentir se ve comode haciando clases desde su escritorio.";
    }

    public String publicarPaper() {
        return super.getNombre()+" va a publicar su Paper "+this.getPaper()+" despues de 5 años de mucho esfuerzo, mucha suerte profe.";
    }
}
