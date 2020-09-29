//Paquetes necesarios para utilizar JOption y Scanner
import javax.swing.*;
import java.util.*;
//Clase principal
public class Recursividad_Factorial{
	
	public static void main(String[] args) {
		String respuesta;
		
		Scanner entrada=new Scanner(System.in);
		do{

		int numero;
		int resultado;
		
		//Inicio del Factorial de un  número mediante el modo recursivo
		//Instancia de la clase Recurividad_Factorial
		Recursividad_Factorial uno=new Recursividad_Factorial();

		System.out.println("Digite un numero para calcular el factorial en consola");

		numero=entrada.nextInt();
		//Se traslada el valor de la variable al método getter y retorna un valor que se guarda en la variable resultado
		resultado=uno.dime_factorial(numero);
		//Imprime el resultado
		System.out.println("El factorial de " + numero + " es igual a " + resultado);
		//Fin del Factorial de un  número mediante el modo recursivo

		//Inicio de pausa del programa
		String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Presiona enter para continuar...");
        try{
            seguir = teclado.nextLine();
            }catch(Exception e){}  
        //Fin de pausa del programa

		//Inicio del Factorial de un  número mediante el modo iterativo
		int factorial=1;
		//Se imprime un mensaje mediante una ventana para que el usuario teclee un numero
		String num = JOptionPane.showInputDialog("Digite un numero para calcular el factorial");

		//convierte el tipo de dato anterior(String) a entero
		int n= Integer.parseInt(num);

		for (int i=n; i>=1; i--) {
			//Recorre el factorial para ir multiplicando sus numeros antecesores
			factorial = factorial*i;
		}
		//Imprime el resultado en una ventana JOption
		JOptionPane.showMessageDialog(null, "El factorial del numero es: " + factorial, "Respuesta", 1);
		//Fin del Factorial de un  número mediante el modo iterativo
		
		//Pide al usuario por consola si desea o no calcular el factorial de otro numero
		System.out.println("¿Desea calcular el factorial de otro numero?\n Si \t\t No");
		
			respuesta=teclado.nextLine();
			//En caso de que si, se ejecuta de nuevo el codigo anterior
		}while(respuesta.equals("Si"));
		

	}

	public Recursividad_Factorial(){//Constructor sin ningun estado inicial

	}

	public int dime_factorial(int n){//Método getter que recibe por parametro un entero que es tecleado por el usuario

		int factorial=1;
		//Si n==0 o n<0 retorna el factorial que ahora es uno 
		if (n==0 || n<0) {
			
			return factorial;
		}
		else {//Si no se cumple lo anterior se calcula el factorial por el método recursivo

			//Es aqui donde el valor de n va disminuyendo cada vez que se manda a llamar la misma función
			factorial= n*dime_factorial(n-1);
			//Retorna el valor del factorial que se ha acumulado
			return factorial;	
		}
	}
}