package nextfly.play.contenido;

import java.time.LocalDate;

//Listamos las clases "pelicula"
public abstract class Contenido {

    // Listamos los atributos (caracteristicas de la clase) de la clase "pelicula"
    private String titulo;
    private String descripcion;
    private int duracion;
    private Genero genero;
    private LocalDate fechaEstreno;
    private double calificacion;
    private boolean disponible;

    // creando un constructor, el cual recibe parametros desde su creación
    //this._______ sirve para señalar que hace referencia a los atributos de la clase
    public Contenido(String titulo, int duracion, Genero genero){
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.fechaEstreno = LocalDate.now();
        this.disponible = true;
    }

    // se crea constructor a partir de generar automaticamente
    public Contenido(String titulo, int duracion, Genero genero, double calificacion) {
        //Teniendo en cuenta que ya existian los valores de mi constructor, solamente los llamo usando this
        this(titulo, duracion, genero);
        this.calificar(calificacion);
    }

    // Listamos los metodos (que puede hacer la clase) de la clase "pelicula"
    public abstract void reproducir();

    // se introduce el simbolo (\n), el cual sirve para saltar a una nueva linea de texto
    public String obtenerFichaTecnica(){
        return titulo + "(" + fechaEstreno.getYear() + ")\n" +
                "Género: " + genero + "\n" +
                "Calificación: " + calificacion + "/5";
    }

    // calificar recibe un parametro double
    public void calificar(double calificacion){
        // Se usa el primer condicional
        // Se introduce un simbolo && que significa y dentro del condicional
        if (calificacion >=0 && calificacion <=5){
            // calificacion color blanco hace referencia al parametro que recibimos en el metodo
            // this.calificacion azul/morado hace referencia al atributo del objeto
            this.calificacion =calificacion;
        }
    }

    public boolean esPopular(){
        return calificacion >=4;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
