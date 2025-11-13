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

    public Auto buscarAuto(String modelo) {
        Auto a = new Auto();

        boolean encontrado = false;
        for (Auto x : autos) {
            if (x.getModelo().equalsIgnoreCase(modelo)) {
                a = x;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return a;
        } else {
            return null;
        }
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

    public Carrera buscarCarrera(String d, String h) {
        Carrera c = new Carrera();

        boolean encontrado = false;
        for (Carrera i : carreras) {
            if (i.getFechaRealizacion().equals(d) && i.getHoraRealizacion().equals(h)) {
                c = i;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return c;
        } else {
            return null;
        }
    }

    public Circuito buscarCircuito(String nombre) {
        Circuito c = new Circuito();

        boolean encontrado = false;
        for (Circuito x : circuitos) {
            if (x.getNombre().equals(nombre)) {
                c = x;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return c;
        } else {
            return null;
        }
    }

    public void agregarEscuderia(Escuderia e) {
        escuderias.add(e);
    }

    public void eliminarEscuderia(Escuderia e) {
        escuderias.remove(e);
    }

    public Escuderia buscarEscuderia(String nombre) {
        Escuderia e = new Escuderia();

        boolean encontrado = false;
        for (Escuderia x : escuderias) {
            if (x.getNombre().equals(nombre)) {
                e = x;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return e;
        } else {
            return null;
        }
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
        Pais p = new Pais();

        boolean encontrado = false;
        for (Pais x : paises) {
            if (x.getIdPais() == id) {
                p = x;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return p;
        } else {
            return null;
        }
    }

    public void agregarPiloto(Piloto p) {
        pilotos.add(p);
    }

    public Piloto buscarPiloto(String dni) throws PilotoNoEncontradoException {
        Piloto p = new Piloto();

        boolean encontrado = false;
        for (Piloto x : pilotos) {
            if (x.getDni().equals(dni)) {
                p = x;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return p;
        } else {
            return null;
        }
    }

    public Mecanico buscarMecanico(String dni) {
        Mecanico m = new Mecanico();

        boolean encontrado = false;
        for (Mecanico i : mecanicos) {
            if (i.getDni().equals(dni)) {
                m = i;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            return m;
        } else {
            return null;
        }
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
