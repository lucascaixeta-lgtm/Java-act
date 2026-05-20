public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // construtor vazio
    public Circulo(){

    }

    // metodo getter
    public double getRaio() {
        return raio;
    }

    // metodo setter
    public void setRaio(double raio) {
        if(raio > 0){
            this.raio = raio;
        } else {
            System.out.println("O raio deve ser um valor positivo.");
        }
    }

    // metodo para calcular a área
        public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // metodo para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void mostrarDados(){
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}