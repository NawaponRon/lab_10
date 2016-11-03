public class Pyramid {

	public static void main(String[] args) {
		int i, j, t;
		final int level = 8;
		String a,b;
		t = level;
		for (i=0; i<level; i++) {
			a = ""; b="";
			for (int k = 1; k<t; k++) 
				System.out.print("\t");
			for (j=0; j <= i; j++) {
				a = a + (int)Math.pow(2,j)+"\t";
				if (j<i) {
				b = (int)Math.pow(2,j)+"\t" + b; }
			}
			System.out.println(a+b);
			t--;
		}

	}

}