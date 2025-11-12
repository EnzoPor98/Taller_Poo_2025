package servicie;
import exceptions.*;
import java.util.ArrayList;
import logica.Auto;
import logica.Carrera;
import logica.Circuito;
import logica.Escuderia;
import logica.Mecanico;
import logica.Pais;
import logica.Piloto;

public class GestorDeClases {

    private ArrayList<Auto> autos;
    private ArrayList<Carrera> carreras;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Mecanico> mecanicos;
    private ArrayList<Pais> paises;
    private ArrayList<Piloto> pilotos;

    public GestorDeClases() {
        autos = new ArrayList<>();
        carreras = new ArrayList<>();
        circuitos = new ArrayList<>();
        escuderias = new ArrayList<>();
        mecanicos = new ArrayList<>();
        paises = new ArrayList<>();
        pilotos = new ArrayList<>();
    }

    // METODOS DE LISTAS.
    public void agregarAuto(Auto a) {
        autos.add(a);
    }

    public void eliminarAuto(Auto a) {
        autos.remove(a);
    }

    public Auto buscarAuto(String modelo) throws AutoNoEncontradoException{
        Auto a = null;

        for (Auto x : autos) {
            if (x.getModelo().equals(modelo)) {
                a = x;
                return a;
            }
        }
        throw new AutoNoEncontradoException("No se encontro un auto del modelo:" + modelo);
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
    
     public Carrera buscarCarrera(String f , String h) throws CarreraNoEncontradaException {
        Carrera c = null;

        for (Carrera i : carreras) {
            if (i.getFechaRealizacion().equals(f) && i.getHoraRealizacion().equals(h)) {
                c = i;
                return c;
            }
        }

         throw new CarreraNoEncontradaException("No se encontro una carrera en la fecha:" + f + "-" + "y en la hora:" + h);
    }

    public Circuito buscarCircuito(String nombre) throws CircuitoNoEncontradoException {
        Circuito c = null;

        for (Circuito x : circuitos) {
            if (x.getNombre().equals(nombre)) {
                c = x;
                return c;
            }
        }
         throw new CircuitoNoEncontradoException("No se encontro un circuito con el nombre:" + nombre);
    }

    public void agregarEscuderia(Escuderia e) {
        escuderias.add(e);
    }

    public void eliminarEscuderia(Escuderia e) {
        escuderias.remove(e);
    }

    public Escuderia buscarEscuderia(String nombre) throws EscuderiaNoEncontradaException{
        Escuderia e = null;
        for (Escuderia x : escuderias) {
            if (x.getNombre().equals(nombre)) {
                e = x;
                return e;
            }
        }
        throw new EscuderiaNoEncontradaException("No se la escuderia con nombreI: " + nombre);
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

    public Pais buscarPais(int id) {
        Pais p = null;

        for (Pais x : paises) {
            if (x.getIdPais() == id) {
                p = x;
                break;
            }
        }

        return p;
    }

    public void agregarPiloto(Piloto p) {
        pilotos.add(p);
    }

    public Piloto buscarPiloto(String dni) throws PilotoNoEncontradoException{
        Piloto p = null;

        for (Piloto x : pilotos) {
            if (x.getDni().equals(dni)) {
                p = x;
                return p;
            }
        }

        throw new PilotoNoEncontradoException("No se encontro el piloto con DNI: " + dni);
    }

    public Mecanico buscarMecanico(String dni) throws MecanicoNoEncontradoException{
        Mecanico m = null;
        for (Mecanico i : mecanicos) {
            if (i.getDni().equals(dni)) {
                m = i;
                return m;
            }
        }
         throw new MecanicoNoEncontradoException("No se encontro el mecanico con DNI: " + dni);
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
