
class Program {
	public static void main(String[] args) {
		int a[] = {-1, 5, -3, 20, 11, 0, 2, 6};
		int i, x, j, z;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
			for (i = a.length; i > -1; i--) {
				for (z = 1; z < a.length; z++) {   // - 1 0 0 0 0 0 2 6
					if (a[z] < a[z - 1]) {
						j = a[z];
						x = a[z - 1];
						a[z - 1] = j;
						a[z] = x;
					} 
				}
			}
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}