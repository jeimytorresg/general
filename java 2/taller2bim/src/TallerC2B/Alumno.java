
package TallerC2B;

public class Alumno extends Persona{
    float[] calif;

    public Alumno(int id_, String nom, char sex, float[] notas) {
        super(id_, nom, sex);
        this.calif = notas;
    }
    
    public float getPromedio(){
        float sum = 0;
        for(float nota : calif){
            sum += nota;
        }
        return sum/3;
    }
}
