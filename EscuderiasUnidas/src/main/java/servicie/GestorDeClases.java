package servicie;

import java.util.ArrayList;
import logica.Auto;
import logica.Carrera;
import logica.Circuito;
import logica.Escuderia;
import logica.Mecanico;
import logica.Pais;
import logica.Piloto;
/**
 * Representa una base de datos del campeonato. 
 * crea varias listas utilizadas para el funcionamiento y menejo del programa
 */
public class GestorDeClases {

    private ArrayList<Auto> autos;
    private ArrayList<Carrera> carreras;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Mecanico> mecanicos;
    private ArrayList<Pais> paises;
    private ArrayList<Piloto> pilotos;

     /** constructor por defecto */ 
    public GestorDeClases() {
        autos = new ArrayList<>();
        carreras = new ArrayList<>();
        circuitos = new ArrayList<>();
        escuderias = new ArrayList<>();
        mecanicos = new ArrayList<>();
        paises = new ArrayList<>();
        pilotos = new ArrayList<>();
    }

       /**  
        * agrega un auto
        * @param a Auto que se va a gregar
       */
    public void agregarAuto(Auto a) {
        autos.add(a);
    }

    /**
     * Elimina un auto de la lista.
     * @param a Auto que se desea eliminar.
     */
    public void eliminarAuto(Auto a) {
        autos.remove(a);
    }

    /**
     * Busca un auto por modelo.
     * @param modelo Modelo del auto buscado.
     * @return Auto encontrado o null si no existe.
     */
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

        /**
     * Agrega una carrera.
     * @param c Carrera que se desea agregar.
     */
    public void agregarCarrera(Carrera c) {
        carreras.add(c);
    }

    /**
     * Elimina una carrera.
     * @param c Carrera a eliminar.
     */
    public void eliminarCarrera(Carrera c) {
        carreras.remove(c);
    }

     /**
     * Agrega un circuito.
     * @param c Circuito que se desea agregar.
     */
    public void agregarCircuito(Circuito c) {
        circuitos.add(c);
    }

    /**
     * Elimina un circuito.
     * @param c Circuito a eliminar.
     */
    public void eliminarCircuito(Circuito c) {
        circuitos.remove(c);
    }
    /**
     * Busca una carrera según fecha y hora.
     * @param d Fecha de realización.
     * @param h Hora de realización.
     * @return Carrera encontrada o null.
     */
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

    /**
     * Busca un circuito por nombre.
     * @param nombre Nombre del circuito.
     * @return Circuito encontrado o null.
     */
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

    /**
     * Agrega una escudería.
     * @param e Escudería a agregar.
     */
    public void agregarEscuderia(Escuderia e) {
        escuderias.add(e);
    }

    /**
     * Elimina una escudería.
     * @param e Escudería a eliminar.
     */
    public void eliminarEscuderia(Escuderia e) {
        escuderias.remove(e);
    }

    /**
     * Busca una escudería por nombre.
     * @param nombre Nombre de la escudería.
     * @return Escudería encontrada o null.
     */
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

    /**
     * Agrega un mecánico.
     * @param m Mecánico a agregar.
     */
    public void agregarMecanico(Mecanico m) {
        mecanicos.add(m);
    }

    /**
     * Elimina un mecánico.
     * @param m Mecánico a eliminar.
     */
    public void eliminarMecanico(Mecanico m) {
        mecanicos.remove(m);
    }

    /**
     * Agrega un país.
     * @param p País a agregar.
     */
    public void agregarPais(Pais p) {
        paises.add(p);
    }

    /**
     * Elimina un país.
     * @param p País a eliminar.
     */
    public void eliminarPais(Pais p) {
        paises.remove(p);
    }

    /**
     * Busca un país por ID.
     * @param id ID del país.
     * @return País encontrado o null.
     */
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
    
    /**
     * Agrega un piloto.
     * @param p Piloto a agregar.
     */
    public void agregarPiloto(Piloto p) {
        pilotos.add(p);
    }

    /**
     * Busca un piloto por DNI.
     * @param dni DNI del piloto.
     * @return Piloto encontrado o null.
     */
    public Piloto buscarPiloto(String dni) {
        Piloto p = new Piloto();

        boolean encontrado = false;
        for (Piloto x : pilotos) {
            if (x.getDni().equalsIgnoreCase(dni)) {
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

    /**
     * Busca un mecánico por DNI.
     * @param dni DNI del mecánico.
     * @return Mecánico encontrado o null.
     */
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

    /**
     * Elimina un piloto.
     * @param p Piloto a eliminar.
     */
    public void eliminarPiloto(Piloto p) {
        pilotos.remove(p);
    }

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
