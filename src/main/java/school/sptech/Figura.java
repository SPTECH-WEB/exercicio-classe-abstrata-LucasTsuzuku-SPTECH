package school.sptech;

public abstract class Figura {

    // Atributos figura
    private String cor;
    private Integer espessura;

    // Constructor figuras


    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public Figura() {
    }

    // Método abstrato
    public abstract Double calcularArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }
}
