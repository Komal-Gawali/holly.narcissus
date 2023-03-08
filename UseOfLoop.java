package StartProg;

public class UseOfLoop {
// by using loop we can execute the set of method or instruction in single program 
// it reduce the number of lines of code 
// in java we have four types of loop
	//1) for loop, 2) do-while loop, 3) while loop, 4) for each loop
	public static void main(String[] args) {
		for(int i=2; i<=99; i=i+5)
		{
			System.out.println(i);
		}
		int k =3;
		do {
			System.out.println(k);
			k=k+4;
		}
		while(k<=533);
	}

}
