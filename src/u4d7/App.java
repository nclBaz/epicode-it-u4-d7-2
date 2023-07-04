package u4d7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import u4d7.entities.Student;

public class App {

	public static void main(String[] args) {

		// *************************** ARRAY LIST **************************
		Random rndm = new Random();

		Student aldo = new Student("Aldo", "Baglio", 20, rndm.nextInt());
		Student aldo2 = new Student("Aldo", "Baglio", 20, rndm.nextInt());
		Student giovanni = new Student("Giovanni", "Storti", 30, rndm.nextInt());
		Student giacomo = new Student("Giacomo", "Poretti", 40, rndm.nextInt());
//
//		// DA ARRAY A LISTA
//		Student[] studentsArray = { aldo, giovanni, giacomo };
//
//		List<Student> lista = new ArrayList<>(Arrays.asList(studentsArray)); // UPCASTING
//
//		// DA LISTA AD ARRAY
//		// Student[] studentsArray2 = (Student[]) lista.toArray();
//
//		System.out.println("La lista ha " + lista.size() + " elementi");
//		lista.add(aldo);
//		lista.add(giovanni);
//		lista.add(giacomo);
//
//		System.out.println("La lista ha " + lista.size() + " elementi");
//
//
//		lista.add(0, new Student("Ajeje", "Brazorf", 50));
//
//		for (Student student : lista) {
//			System.out.println(student);
//		}
//
//		try {
//			System.out.println("--------------- GET --------------------");
//			Student found = lista.get(1);
//			System.out.println("Il secondo elemento della lista è: " + found);
//			System.out.println("Il suo indice è: " + lista.indexOf(aldo));
//		} catch (IndexOutOfBoundsException e) {
//			System.err.println("Elemento non trovato");
//		}
//
//		System.out.println("--------------- CONTAINS --------------------");
//
//		if (lista.contains(aldo2)) { // <-- .contains() internamente utilizza .equals()
//			System.out.println("La lista contiene Aldo");
//		} else {
//			System.err.println("La lista non contiene Aldo");
//		}
//
//		// lista.remove(0);
//		lista.remove(giacomo);
//
//		System.out.println("--------------- REMOVE --------------------");
//
//		for (Student student : lista) {
//			System.out.println(student);
//		}
//
//		System.out.println("La lista è vuota? " + lista.isEmpty());
//		lista.clear();
//
//		System.out.println("--------------- CLEAR --------------------");
//
//		for (Student student : lista) {
//			System.out.println(student);
//		}
//
//		System.out.println("La lista è vuota? " + lista.isEmpty());
//		
//
//		System.out.println("--------------- ADD ALL --------------------");
//		lista.addAll(new ArrayList<>(Arrays.asList(studentsArray)));
//
//		for (Student student : lista) {
//			System.out.println(student);
//		}
//
//		System.out.println("La lista è vuota? " + lista.isEmpty());
//
//		System.out.println("--------------- REMOVE ALL --------------------");
//		lista.add(new Student("Ajeje", "Brazorf", 50));
//		lista.removeAll(new ArrayList<>(Arrays.asList(studentsArray)));
		// A partire dall'array ho creato una lista di 3 studenti da rimuovere da
		// "lista"
//
//		for (Student student : lista) {
//			System.out.println(student);
//		}
//
//		System.out.println("La lista è vuota? " + lista.isEmpty());

		// *********************** LINKED LIST ****************************
//
//		LinkedList<Student> linkedStudents = new LinkedList<>();
		// Qua non sto usando l'UPCASTING, il che significa che potrò usare i metodi
		// specifici di LL
		// e non solo quelli comuni a tutte le List. Di contro però non potrò sostituire
		// cambiando un'
		// unica riga di codice una LL con un ArrayList ad es.
//		linkedStudents.push(giacomo);
//		linkedStudents.pop();

		// ************************** LISTE E TIPI PRIMITIVI *****************
//		List<Integer> interi = new ArrayList<>(); // Integer è la WRAPPER CLASS per gli interi
//		// Nelle liste non posso salvare tipi primitivi ma solo oggetti
//		interi.add(2);
//		interi.add(10);

		// ************************* ITERATORS ******************************
//		ArrayList<String> lettere = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

//		for (String lettera : lettere) {
//			if (lettera.equals("a")) {
//				lettere.remove(lettera); 
		// Java lancia un'eccezione ConcurrentModificationException nel caso
		// io provassi a modificare la lista (rimuovendo elementi) durante l'iterazione
//			}
//			System.out.println(lettera);
//		}

//		lettere.forEach(lettera -> {
//			if (lettera.equals("a")) {
//				lettere.remove(lettera);
//			}
//			System.out.println(lettera);
//		});
//		Iterator<String> i = lettere.iterator();
//		while (i.hasNext()) {
//			String current = i.next(); // "a"
//			if (current.equals("b")) {
//				i.remove();
//				// N.B. non vado a fare lettere.remove(), bensì devo usare il metodo remove
//				// dell'iteratore
//			}
//		}
//
//		for (String string : lettere) {
//			System.out.println(string);
//		}

		// ******************************* SET *****************************
		// Abbiamo 3 tipi di Set: HashSet, LinkedHashSet, TreeSet
//		Set<String> lettere = new TreeSet<>();
//		lettere.add("f");
//		lettere.add("c");
//		lettere.add("x");
//		lettere.add("a");
//
//		for (String string : lettere) {
//			System.out.println(string);
//		}
//
//		Set<Student> studentsSet = new TreeSet<>();
//		// Se uso TreeSet con oggetti, essi devono essere dei Comparable (ovvero
//		// implementare suddetta interfaccia)
//		studentsSet.add(aldo);
//		studentsSet.add(giovanni);
//		studentsSet.add(giacomo);
//		studentsSet.add(aldo);
//
//		for (Student student : studentsSet) {
//			System.out.println(student);
//		}
		// ******************************* MAP *****************************
		Map<Integer, Student> students = new HashMap<>();

		students.put(aldo.getId(), aldo);
		students.put(giovanni.getId(), giovanni);
		students.put(giacomo.getId(), giacomo);

		students.remove(aldo.getId());

//		students.replace(aldo.getId(), giacomo);
//		Student aldoFromMap = students.get(aldo.getId());
//		System.out.println(aldoFromMap);

		Set<Integer> ids = students.keySet(); // Mi ritorna l'elenco (Set) di tutte le chiavi della mappa

		for (Integer id : ids) {
			System.out.println(students.get(id));
		}

		Collection<Student> studentValues = students.values(); // Mi ritorna l'elenco (Collection) di tutti i valori
																// della mappa

		for (Student student : studentValues) {
			System.out.println(student);
		}

		Set<Map.Entry<Integer, Student>> chiaviValori = students.entrySet();
		// EntrySet mi ritorna l'elenco (Set) di chiavi=valore di tutto ciò che c'è

		Iterator i = chiaviValori.iterator();
		// nella mappa
		while (i.hasNext()) {
			System.out.println(i.next());

		}


	}

}
