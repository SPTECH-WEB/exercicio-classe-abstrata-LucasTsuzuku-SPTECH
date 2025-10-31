package school.sptech;

public class Retangulo extends Figura {

    // Atributos
    private Double base;
    private Double altura;
    //Construtores

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }

    //Métodos

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    //getter e setter

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


    //To String


    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
