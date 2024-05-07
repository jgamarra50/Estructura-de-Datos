/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaGestionHorasLibres;

public class Estudiante {
    private String nombre;
    private String carrera;
    private List<HoraLibre> horasLibres;
    private List<Evento> eventos;

    // Getters and setters

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.horasLibres = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarHoraLibre(HoraLibre horaLibre) {
        horasLibres.add(horaLibre);
    }

    public void eliminarHoraLibre(HoraLibre horaLibre) {
        horasLibres.remove(horaLibre);
    }

    public List<HoraLibre> getHorasLibres() {
        return horasLibres;
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}

public class HoraLibre {

    private int duracion;
    private String tipo;
    private LocalDate fecha;
    private LocalTime hora;

    // Getters and setters

    public HoraLibre(int duracion, String tipo, LocalDate fecha, LocalTime hora) {
        this.duracion = duracion;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
    }
}

public class Evento {

    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private int duracion;
    private String tipo;

    // Getters and setters

    public Evento(String nombre, LocalDate fecha, LocalTime hora, int duracion, String tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.tipo = tipo;
    }
}
}
