package school.sptech;

public class Triangulo extends Figura {
    //Atributos

    private Double base;
    private Double altura;

    //constructor

    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }
    //Métodos

    @Override
    public Double calcularArea() {
        return base*altura/2.0;
    }

    // getter setter

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


    // to string


    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
