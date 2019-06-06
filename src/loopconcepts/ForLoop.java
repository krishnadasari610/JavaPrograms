package loopconcepts;

public class ForLoop {

	public static void main(String[] args) {
		//using for loop print numbers
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		//using while loop
		System.out.println("-------------------------");
		int j=1;
		while(j<=10) {
			System.out.println(j);
		j++;
		}
		System.out.println("-------------------------");

		//using do while loop
		int count=5;
		int k=0;
		do {
			System.out.println(k);
			k++;
		}while(k<=count);
		System.out.println("-------------------------");

		
		//
		int c=5;
		for(int i=0;i<=c;i++) {
			for(int l=0;l<=i;l++) {
				System.out.println(l);
			//System.out.println("B");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		String books[] = {"Java", "C", "C++", "Selenium", "QTP/UFT"};
		for(String b : books) {
			System.out.println(b);
		}
		System.out.println("-------------------------");

	}

}
