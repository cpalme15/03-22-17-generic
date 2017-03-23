import java.util.ArrayList;

public class Main
{

	public static <T> void prntarr (T[] i)
	{
		for(T element:i)
		{
			System.out.print(element+"\t");
		}
		System.out.println();
		
	}
	public static <T>int count(T[] j, T item)
	{
		int counter=0;
		for(T element:j)
		{
			if(element.equals(item))
			{
				counter++;
			}
		}
		return counter;
	}
	public static <T extends Comparable> T Max(T x, T y, T z)
	{
		T max=x;
		if(y.compareTo(max)>0)
			max=y;

		if(z.compareTo(max)>0)
			max=z;
		
		return max;
	}
	public static void printList(ArrayList<?> ls)
	{
		for(Object obj:ls)
		{
			System.out.println(obj);
		}
	}
	public static void main(String[] args)
	{
		Integer [] grades={83,78,88,88,90,69};
		Double [] GPA={3.2,2.87,3.4,3.4,3.75,2.0};
		Character[] States={'M','I','S','S','I','S','S','I','P','P','I'};
		prntarr(grades);
		prntarr(GPA);
		prntarr(States); 
		System.out.println(count(States,'I'));
		System.out.println(count(grades,88));
		System.out.println(Max(33,99,102));
		System.out.println(Max("MI","OK","OH"));
		System.out.println(Max('I','J','K'));
		System.out.println(Max(3.14,5.7,5.75));
		Pair<String,Integer> statepop= new Pair<>("MI",8);
		Pair<Integer,Character> gr=new Pair<>(90,'A');
		System.out.println(gr.getValue());
		System.out.println(statepop.getValue());
		System.out.println(gr);
		ArrayList<Object>cars=new ArrayList<>();
		ArrayList<String> states=new ArrayList<>();
		cars.add(new Object());
		cars.add(states);
		states.add("MI");
		printList(cars);
		printList(states);
	}

}
