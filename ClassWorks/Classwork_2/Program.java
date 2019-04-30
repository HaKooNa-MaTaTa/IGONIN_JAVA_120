class Program {
	public static void main(String[] args) {
		int a[] = {-1, 5, -3, 20, 11, 0, 2, 6};
		int tempNumber, minNumber;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < a.length-1; i++) {
			minNumber = i;
			tempNumber = a[i];
			for (int v = i + 1; v < a.length; v++)
				if (a[v] < a[minNumber])
					minNumber = v;
					a[i] = a[minNumber];
					a[minNumber] = tempNumber;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}