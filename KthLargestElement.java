import java.util.*;
class matrixChainMultiplication {
	public static void main(String[] args) {
		int arr [] = {1,4,3,2,0};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i : arr) {
			pq.add(i);
		}
		System.out.println(pq);
		
}
}