package school.sptech;

public class Circulo extends Figura {

    //Atributos

    private Double raio;

    //Constructor

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    public Circulo() {
    }

    //Métodos

    @Override
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }


    //Getter e Setters

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


    //To String


    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
