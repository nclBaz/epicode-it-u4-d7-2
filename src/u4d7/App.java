package u4d7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import u4d7.entities.Student;

public class App {

	public static void main(String[] args) {

		// *************************** ARRAY LIST **************************
		Student aldo = new Student("Aldo", "Baglio", 20);
		Student aldo2 = new Student("Aldo", "Baglio", 20);
		Student giovanni = new Student("Giovanni", "Storti", 30);
		Student giacomo = new Student("Giacomo", "Poretti", 40);

		// DA ARRAY A LISTA
		Student[] studentsArray = { aldo, giovanni, giacomo };

		List<Student> lista = new ArrayList<>(Arrays.asList(studentsArray));

		// DA LISTA AD ARRAY
		// Student[] studentsArray2 = (Student[]) lista.toArray();

		System.out.println("La lista ha " + lista.size() + " elementi");
		lista.add(aldo);
		lista.add(giovanni);
		lista.add(giacomo);

		System.out.println("La lista ha " + lista.size() + " elementi");


		lista.add(0, new Student("Ajeje", "Brazorf", 50));

		for (Student student : lista) {
			System.out.println(student);
		}

		try {
			System.out.println("--------------- GET --------------------");
			Student found = lista.get(1);
			System.out.println("Il secondo elemento della lista è: " + found);
			System.out.println("Il suo indice è: " + lista.indexOf(aldo));
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Elemento non trovato");
		}

		System.out.println("--------------- CONTAINS --------------------");

		if (lista.contains(aldo2)) { // <-- .contains() internamente utilizza .equals()
			System.out.println("La lista contiene Aldo");
		} else {
			System.err.println("La lista non contiene Aldo");
		}

		// lista.remove(0);
		lista.remove(giacomo);

		System.out.println("--------------- REMOVE --------------------");

		for (Student student : lista) {
			System.out.println(student);
		}

		System.out.println("La lista è vuota? " + lista.isEmpty());
		lista.clear();

		System.out.println("--------------- CLEAR --------------------");

		for (Student student : lista) {
			System.out.println(student);
		}

		System.out.println("La lista è vuota? " + lista.isEmpty());
		

		System.out.println("--------------- ADD ALL --------------------");
		lista.addAll(new ArrayList<>(Arrays.asList(studentsArray)));

		for (Student student : lista) {
			System.out.println(student);
		}

		System.out.println("La lista è vuota? " + lista.isEmpty());

		System.out.println("--------------- REMOVE ALL --------------------");
		lista.add(new Student("Ajeje", "Brazorf", 50));
		lista.removeAll(new ArrayList<>(Arrays.asList(studentsArray)));
		// A partire dall'array ho creato una lista di 3 studenti da rimuovere da
		// "lista"

		for (Student student : lista) {
			System.out.println(student);
		}

		System.out.println("La lista è vuota? " + lista.isEmpty());

	}

}
