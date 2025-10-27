package pekan5;

public class tugasPekan5 {

	public static void main(String[] args) {
		for (int line = 1; line<=5; line++) {
			for (int j=1; j<=(-1*line+5); j++) {
				System.out.print(".");
			}
			System.out.print(line);
			for  (int i=1; i<=(line-1); i++) {
				System.out.print(".");
		}

			System.out.println();
		}
	}

}
