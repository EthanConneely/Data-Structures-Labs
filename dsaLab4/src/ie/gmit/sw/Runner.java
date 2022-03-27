package ie.gmit.sw;

public class Runner
{

	public static void main(String[] args) throws Exception
	{
		var words = new Dictionary().getSortedWords();

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < words.length; i++)
		{
			stack.push(words[i]);
		}

		while (!stack.isEmpty())
		{
			var word = stack.pop();
			if (word.length() > 3 && word.charAt(1) == 'a' && word.charAt(3) == 'e')
			{
				System.out.println(word);
			}
		}
	}

}
