package logica;

import java.util.ArrayList;

public class GestorDeClases {

    private ArrayList<Auto> autos;
    private ArrayList<Carrera> carreras;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Mecanico> mecanicos;
    private ArrayList<Pais> paises;
    private ArrayList<Piloto> pilotos;

    public GestorDeClases() {
        autos = new ArrayList<Auto>();
        carreras = new ArrayList<Carrera>();
        circuitos = new ArrayList<Circuito>();
        escuderias = new ArrayList<Escuderia>();
        mecanicos = new ArrayList<Mecanico>();
        paises = new ArrayList<Pais>();
        pilotos = new ArrayList<Piloto>();
    }

    // METODOS DE LISTAS.
    public void agregarAuto(Auto a) {
        autos.add(a);
    }

    public void eliminarAuto(Auto a) {
        autos.remove(a);
    }

    public void agregarCarrera(Carrera c) {
        carreras.add(c);
    }

    public void eliminarCarrera(Carrera c) {
        carreras.remove(c);
    }

    public void agregarCircuito(Circuito c) {
        circuitos.add(c);
    }

    public void eliminarCircuito(Circuito c) {
        circuitos.remove(c);
    }

    public void agregarEscuderia(Escuderia e) {
        escuderias.add(e);
    }

    public void eliminarEscuderia(Escuderia e) {
        escuderias.remove(e);
    }

    public void agregarMecanico(Mecanico m) {
        mecanicos.add(m);
    }

    public void eliminarMecanico(Mecanico m) {
        mecanicos.remove(m);
    }

    public void agregarPais(Pais p) {
        paises.add(p);
    }

    public void eliminarPais(Pais p) {
        paises.remove(p);
    }

    public void agregarPiloto(Piloto p) {
        pilotos.add(p);
    }

    public Piloto buscarPiloto(String dni) {
        Piloto p = null;

        for (Piloto x : pilotos) {
            if (x.getDni().equals(dni)) {
                p = x;
                break;
            }
        }

        return p;
    }
    
    public Mecanico buscarMecanico(String dni) {
        Mecanico m = null;
        for (Mecanico  i : mecanicos) {
            if (i.getDni().equals(dni)) {
                m = i;
                break;
            }
        }
        return m;
    }
    
    
    
    
    
    

    public void eliminarPiloto(Piloto p) {
        pilotos.remove(p);
    }

    // GETTERS & SETTERS.
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Circuito> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(ArrayList<Circuito> circuitos) {
        this.circuitos = circuitos;
    }

    public ArrayList<Escuderia> getEscuderias() {
        return escuderias;
    }

    public void setEscuderias(ArrayList<Escuderia> escuderias) {
        this.escuderias = escuderias;
    }

    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(ArrayList<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }
}
