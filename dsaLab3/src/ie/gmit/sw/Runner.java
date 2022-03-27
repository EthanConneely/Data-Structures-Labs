package ie.gmit.sw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Runner
{

	public static void main(String[] args)
	{
		List<Ninja> list = new LinkedList<>();

		list.add(new Ninja("Joe", 7, 100.0f));
		list.add(new Ninja("Kat", 9, 40.0f));
		list.add(new Ninja("Bob", 1, 8.0f));

		Ninja key = new Ninja("Joe", 7, 100.0f);
		System.out.println(list.contains(key));

		Iterator<Ninja> i = list.iterator();
		while (i.hasNext())
		{
			var t = i.next();
			System.out.println(t);
		}

	}

}
