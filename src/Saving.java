import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


  		

class Saving {
	
	public static void main(String[] args) throws IOException {
		double deposit, interest, amount=0;
		int month;
		
		Reader.init(new FileInputStream(new File("data/input.txt")));
		Reader.setDelimeter("\t ,");
		
		deposit = Reader.nextDouble();
		interest = Reader.nextDouble() / 1200;
		month = Reader.nextInt();
		for (int m = 0; m < args.length; m++) {
			amount = (deposit+ amount)*(1*interest);
			System.out.printf("Month %d, Saving : %10.2f\n", m ,amount);
		}
		
	}
	

}