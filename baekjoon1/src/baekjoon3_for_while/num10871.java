package baekjoon3_for_while;

import java.util.Scanner;

public class num10871 {

	public static void main(String[] args) {
		// X보다 작은 수
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		int X = in.nextInt();
		int arr[] = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		in.close();
        
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
