package lab2;

public class Empleados {

    private String nombre;
    private String apellido;
    private String color;
    private int edad;
    private String genero;
    private double altura;
    private double peso;
    private String titulo;
    private String cargo;

    public Empleados(String nombre, String apellido, String color, int edad, String genero, double altura, double peso, String titulo, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.color = color;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.titulo = titulo;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", color=" + color + ", edad=" + edad + ", genero=" + genero + ", altura=" + altura + ", peso=" + peso + ", titulo=" + titulo + ", cargo=" + cargo + '}';
    }

}
