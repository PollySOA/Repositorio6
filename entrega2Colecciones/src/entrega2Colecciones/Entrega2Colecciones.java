package entrega2Colecciones;

// Pollyanna Soares da Silva

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class Paciente {
	String nombre;
	int codigo;
	int edad;
	double temperatura;
	double nivelColesterol;

	public Paciente(int codigo, String nombre, int edad, double temperaturaNoche, double nivelColesterol) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.nivelColesterol = nivelColesterol;

	}

	public String getNombre() {
		return nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEdad() {
		return edad;
	}

	public double getTemperaturaNoche() {
		return temperatura;
	}

	public double getNivelColesterol() {
		return nivelColesterol;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTemperaturaNoche(double temperaturaNoche) {
		this.temperatura = temperaturaNoche;
	}

	public void setNivelColesterol(double nivelColesterol) {
		this.nivelColesterol = nivelColesterol;
	}

}

public class Entrega2Colecciones {

	static void mostrarMenu() {
		System.out.println("1. Introducir todos los datos de un paciente: ");
		System.out.println("2. Obtener todos los datos del paciente, dado su codigo: ");
		System.out.println("3. Averiguar si el paciente tiene fiebre o no: ");
		System.out.println("4.Mostrar código y nombre de todos los pacientes mayores de 65:  ");
		System.out.println("5. Modificar el colesterol de un paciente concreto ");
		System.out.println("6.Mostrar el nº de pacientes que tienen colesterol alto (Superior a 300): ");
		System.out.println("7. Eliminar un paciente concreto: ");
		System.out.println("8. Salir del programa: ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
Random r = new Random(20);
HashMap<Integer,Paciente> paciente = new HashMap<>();
		int opcion;
		
		double colesterol = 0;
		int codigoPaciente;
		int codigo=0;
		String nombre;

		
		do {
			System.out.println("----------------------------------------------");
			mostrarMenu();
			opcion = s.nextInt();

	
	switch (opcion){
	
	case 1:System.out.println("Introduce el nombre del paciente: ");
nombre = s.nextLine();
System.out.println("Introduzca la edad del paciente: ");
int edad = s.nextInt();
s.nextLine();
System.out.println("Introduzca la temperatura del paciente: ");
double temperatura = s.nextDouble();
s.nextLine();
System.out.println("Introduzca el nivel del colesterol del paciente: ");
double nivelColest = s.nextDouble();
codigoPaciente = r.nextInt(50);


		break;
	case 2:
		System.out.println(paciente.keySet() + " ");
		
		break;
	case 3:
		System.out.println(paciente.get(temperatura));
		break;
	case 4:
		
		break;
	//5) Modificar el colesterol de un * paciente concreto.* paciente concreto.
	case 5:
		System.out.println(paciente.get(colesterol));
		
		break;
	case 6:
			for(int i = 0; i>300;i++)
			{
		System.out.println(paciente.containsKey(300));
			}
			
		break;
	case 7:
		System.out.println(paciente.remove(codigo));
		
		break;
	case 8:
		break;
		
	case 0:
		System.out.println("Salir");
		break;
		
	default:
		System.out.println("Opción Invalida ");
	}
			
		
	
	}while(opcion!=0);
	}
}

/*
 * Entrega Colecciones (Listas/HashMaps) Una clínica desea almacenar información
 * de sus pacientes. De cada paciente ingresado se conoce su código (que es
 * único para cada paciente y se usa para identificarlo), nombre, edad,
 * temperatura tomada la noche anterior y nivel actual de colesterol. Crea un
 * programa que tenga un menú con las siguientes opciones: 1) Introducir todos
 * los datos de un paciente nuevo. 2) Obtener todos los datos de un paciente,
 * dado su código. 3) (Con una función) Averiguar si un paciente concreto tiene
 * fiebre o no (temperatura superior a 37.5ºC) 4) Mostrar código y nombre de
 * todos los pacientes mayores de 65 años. 5) Modificar el colesterol de un
 * paciente concreto. 6) (Con una función) Mostrar el n.º de pacientes que
 * tienen colesterol alto (superior a 300). 7) Eliminar un paciente concreto. No
 * es necesario que controles si un paciente existe o no (se asume que las
 * búsquedas se hacen correctamente siempre). La entrega se realizará enviando
 * una invitación al repositorio público donde esté tu código. No se permiten
 * cambios después de la entrega.
 */
