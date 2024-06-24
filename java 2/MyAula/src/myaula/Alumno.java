
package myaula;

public class Alumno extends Persona{
    float[] calif;

    public Alumno(int id_, String nom, char sex, float[] notas) {
        super(id_, nom, sex);
        this.calif = notas;
    }
}
