package ie.gmit.sw;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Runner
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("---------- SW2 - DSA Lab 2: Lists & Collections ----------");
		Dictionary dictionary = new Dictionary();
		dictionary.load();
		System.out.println("Dictionary contains " + dictionary.size() + " words.");

		String[] words = dictionary.getSortedWords();
		long startTime = System.nanoTime();

		// Start writing the lab exercises after this line:
		List<String> list = new LinkedList<String>();

//		ArrayList<String> list = new ArrayList<String>(); // Okay but too specific and verbose
//		ArrayList<String> list = new ArrayList<>(); // Okay but still too specific
//		List<String> list = new ArrayList<>(); // Much better. Can be assigned any list
//		Collection<String> col = new ArrayList<>(); // Most flexible, but maybe too general
//		var list = new ArrayList<String>(); // Can use var as type can be inferred (but it’s fixed!)

		list = new LinkedList<String>(); // Swap the ArrayList for a LinkedList
		list = new Vector<String>(); // Swap the LinkedList for a Vector

		for (String word : words)
		{
			list.add(word); // Adds the element word to the end of the collection called list.
		}

		System.out.println("Running time (ns): " + (System.nanoTime() - startTime));
	}
}