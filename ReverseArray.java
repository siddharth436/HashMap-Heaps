
class matrixChainMultiplication {
	public static void main(String[] args) {
		int arr [] = {1,4,3,2,0};
		int arr2[] = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			int position = arr[i];
			arr2[position] = i;
			
		}
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i]);
		}
		
	}
    
}