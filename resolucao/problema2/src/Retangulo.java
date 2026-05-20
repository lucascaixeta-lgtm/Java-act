public class Retangulo {

    private double comprimento;
    private double largura;

    // construtor ----------------------
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public Retangulo() {
        // construtor vazio
    }

    // Getters ----------------------
    public double getCOmprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    // Setters ----------------------
    public void setComprimento(double comprimento) {
        if(comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Valor inválido para comprimento. Deve ser maior que zero.");
        }
    }

    public void setLargura(double largura) {
        if(largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Valor inválido para largura. Deve ser maior que zero.");
        }
    }

    public  void exibirDimensoes() {
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
    }

}