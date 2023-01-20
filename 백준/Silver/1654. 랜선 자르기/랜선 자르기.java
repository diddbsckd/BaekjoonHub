import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt(); 		// 가지고 있는 랜선의 개수
		int N = sc.nextInt();		// 만들어야하는 랜선의 개수
		long[] arr = new long[K];		// 가지고 있는 랜선들의 길이를 담은 배열
		
		long start = 1;		// 시작값
		long end = 0;		// 끝값
		long mid = 0;		// 중간값
		long result = 0;		// 결과값
		long sum = 0;
		
		for(int i=0; i<K; i++) {
			arr[i] = sc.nextLong();
			if(arr[i] > end) {
				end = arr[i];
			}
		}
		
		while(start <= end) {
			mid = (start+end)/2;
			sum = 0;
			
			for(int i=0; i<K; i++) {
				sum += arr[i]/mid;
			}
			
			if(sum >= N){
                start = mid + 1;
                if(result < mid){
                    result = mid;
                }
            } else {
                end = mid-1;
            }
		}
		
		System.out.println(result);
		
	}

}


