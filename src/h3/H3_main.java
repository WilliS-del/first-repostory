package h3;

public class H3_main {
	public static void main(String[] args) {
		int i=140,j=150,k=12;
		if (i>j) {
			if (j>100) {
				k=3;
			} else {
				if (i>200) {
					k=2;
				} else {
					k=1;
				}
			}
		} else {
			if (j<100) {
				k=4;
			} else {
			k=-10;
}
}
		System.out.println(k);
}
}