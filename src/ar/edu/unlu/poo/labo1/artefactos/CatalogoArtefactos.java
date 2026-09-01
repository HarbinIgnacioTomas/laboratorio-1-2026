package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> catalogo = new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto){
        catalogo.add(artefacto);
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> artefactosPorTipo = new ArrayList<>();
        for (Artefacto a : catalogo){
            if (a.getTipo().equals(tipo)){
                artefactosPorTipo.add(a);
            }
        }
        return artefactosPorTipo;
    }



    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> artefactosPorTipo = new HashMap<>();
        for (Artefacto a : catalogo){
            artefactosPorTipo.put(a.getTipo(), artefactosPorTipo.get(a.getTipo())+1);
        }
        //catalogo.stream().filter().
        return artefactosPorTipo;
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        return catalogo;
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        if (catalogo == null){
            return null;
        }
        int maximo = 0;
        Artefacto masPoderoso = null;
        for (Artefacto a : catalogo){
            if (a.getPoder() > maximo){
                maximo = a.getPoder();
                masPoderoso = a;
            }
        }
        return masPoderoso;
    }
}
