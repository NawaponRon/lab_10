public class PiAppoximate {

	public static void main(String[] args) {
		int i;
		double pi=0;
		
		for (i=1;i<=100000;i++) {
			pi = pi + (Math.pow(-1,i+1)/((2*i)-1));
			if ((i % 10000)==0) {
				System.out.printf("i = %d, Pi = %10.20f\n",i, 4 * pi);
			}
		}
	}
}