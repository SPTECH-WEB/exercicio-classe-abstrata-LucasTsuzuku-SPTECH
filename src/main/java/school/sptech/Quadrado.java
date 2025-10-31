package school.sptech;

public class Quadrado extends Figura{

    // Atributo
    private Double lado;

    // Constructor quadrado


    public Quadrado() {
    }

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }

    // Método herdado
    @Override
    public Double calcularArea() {
        return lado*lado;
    }

    //Getters e setters


    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
