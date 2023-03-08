package StartProg;

public class Prog2 {

	public static void main(String[] args) {
		String name1 = " Rohani ";
		String name2= "Rohani";
		String name3 = new String ("Rohani");
		
		if (name1==name2)
			System.out.println("EQUAL");
		else
			System.out.println("Not EQUAL");
		if(name1 == name3)
			System.out.println("EQUAL");
		else
			System.out.println("Not-EQUAL");
	}

}
