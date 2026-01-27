package project1.pst;
public class oddoreven {

	public static void main(String[] args) {
		int[] arr = {10,12,11,34,47,50};
		for(int i = 0;i< arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+"is even");
				
			}else {
				System.out.println(arr[i]+"is odd");
			
			}
		}
	}	
}
