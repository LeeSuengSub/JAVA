package array;

public class TowDimensionArray {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println();
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println();
		
		for(int i=0; i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);//0,0~0,2
			}
		}
		
	}
}