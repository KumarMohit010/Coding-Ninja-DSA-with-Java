public class typecasting {
    public static void main(String[] args) {
		// char c = 'a';
		//System.out.println(c + 3);
		
		// int i = c + 10;
		// //System.out.println(i);
		
		int i = 'c';
		// char abc = (char)i;
		
		// long l = i;
		// l = 12345654321L;
		// i = (int)l;
		// System.out.println(l);
		// System.out.println(i);
		
		// double d = i;
		// //i = d;
		
		// float f = 1.23f;
		// //f = d;
		// d = f;
		
		// int j = 100;
        System.out.println(i);
		public class DataType {

			public static void main(String[] args) {
				char c = 'a';
				//System.out.println(c + 3);
				
				int i = c + 10;
				//System.out.println(i);
				
				i = c;
				char abc = (char)i;
				
				long l = i;
				l = 12345654321L;
				i = (int)l; // if the range is bigger than int range it will loose data but it will copy the data 
				// when we copy a long into a integer we get sometimes negative numbers when the first byte is 1
				System.out.println(l);
				System.out.println(i);
				
				double d = i;
				//i = d;
				
				float f = 1.23f;
				//f = d;
				d = f;
				
				int j = 100;
			}
		
		}
	}

}

    

