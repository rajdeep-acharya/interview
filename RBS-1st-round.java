public class ArrayList<T>{

	private static int LIST_SIZE = 20;
	private Object arr[] = {};
	private int currentSize = 0;
	
	public ArrayList(){
		arr = new Object[LIST_SIZE];
	}

	pulic void add(T value) {
		if(currentSize < LIST_SIZE) {
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i];
				currentSize++;
			}
		} else {
			int newSize = arr.length * 2;
           newSize = Arrays.copyOf(arr, newSize);
		}
		
	}
	
}




list.stream().collect(Collections.groupingBy(Funtion.identity(), TreeMap<Integer, Integer>::new)).get(3);



