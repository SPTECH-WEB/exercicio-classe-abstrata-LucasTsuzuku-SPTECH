package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    //Atributos
    private List<Figura> figuras;
    //Constructor

    public Imagem() {

        figuras = new ArrayList<>();
    }

    //Métodos

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double acumuladorAreas = 0.0;
        for (int i = 0; i < figuras.size(); i++) {
            acumuladorAreas += figuras.get(i).calcularArea();
        }
        return acumuladorAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> acumuladorAreasMaiorQue20 = new ArrayList<Figura>();
        for (int i = 0; i < figuras.size(); i++) {
            if(figuras.get(i).calcularArea() > 20.0){
                acumuladorAreasMaiorQue20.add(figuras.get(i));
            }
        }
        return acumuladorAreasMaiorQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> acumuladorQuadrados = new ArrayList<Figura>();
        for (int i = 0; i < figuras.size(); i++) {
            if(figuras.get(i) instanceof  Quadrado){
                acumuladorQuadrados.add(figuras.get(i));
            }
        }
        return acumuladorQuadrados;
    }

}
