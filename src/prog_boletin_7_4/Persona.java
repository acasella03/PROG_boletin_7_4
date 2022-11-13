package prog_boletin_7_4;

public class Persona {

    private String nombre;
    private float peso;

    public Persona() {

    }

    public Persona(String nom, float p) {
        nombre = nom;
        peso = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", peso=" + peso + '}';
    }

    public void personaMasPesada(String nombre, float peso) {
        if (this.peso >= peso) {
            System.out.println("Con " + this.peso + "Kg pesa más " + this.nombre + "\nLa diferencia de peso es: " + (this.peso - peso));
        } else {
            System.out.println("Con " + peso + "Kg pesa más " + nombre + "\nLa diferencia de peso es: " + (peso - this.peso));
        }
    }
    
    public void personaMasPesada2(Persona persona2){
        if(this.peso>=persona2.getPeso()){
            System.out.println("Con " + this.peso + "Kg pesa más " + this.nombre + "\nLa diferencia de peso es: " + (this.peso - persona2.getPeso()));
                } else {
            System.out.println("Con " + persona2.getPeso() + "Kg pesa más " + persona2.getNombre() + "\nLa diferencia de peso es: " + (persona2.getPeso() - this.peso));
        }
    }

}
