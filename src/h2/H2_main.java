package h2;

public class H2_main {
	public static void main(String[] args) {
		int i=10,j=2,k=3,min=4,max=5;
		if (i < j) {
			if (i < k) {
				min=i;
		}
		}
		if (j < i) {
			if (j < k) {
				min=j;
		}
		}
		if (k < i) {
			if (k < j) {
				min=k;
		}
		}

		if (i > j) {
			if (i > k) {
				max=i;
		}
		}
		if (j > i) {
			if (j > k) {
				max=j;
		}
		}
		if (k > i) {
			if (k > j) {
				max=k;
		}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
