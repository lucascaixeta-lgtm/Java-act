package medidaTrinagulo;

public class LadosTriangulo {

	double ladoA;
	double ladoB;
	double ladoC;
	
	public double calcularArea() {
		double semiperimetro = (ladoA + ladoB + ladoC)/2.0;
		return Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));                    
	}
	 
}
