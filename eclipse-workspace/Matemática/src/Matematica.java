
public class Matematica implements Interface {

		public float Somar(float n1, float n2){
		float res = n1+n2;
		return res;
		}
		 
		public float Subtrair (float n1, float n2){
		float res= n1-n2;
		return res;
		}

		public float Multiplicar (float n1, float n2){
		float res= n1*n2;
		return res;
		}


		public float Dividir (float divisor, float dividendo){
		float res= divisor/dividendo;
		return res;
		}

		public double Raiz (double num){
		double res= (Math.sqrt(num));
		return res;
		}
		
	}

