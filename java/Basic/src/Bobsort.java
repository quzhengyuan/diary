import java.util.Arrays;

public class Bobsort {
	public static void main(String[] args){
		int[] ns = {5,2,3,1,4};
		//排序前：
		System.out.println(Arrays.toString(ns));
	
		//升序
		for (int i=0; i < ns.length - 1; i++) {
			for (int j=0; j < ns.length - i -1;j++ ) {
				if (ns[j] > ns[j+1]) {
					//交换ns[j]和ns[j+1]
					int tmp = ns[j];
					ns[j] = ns[j+1];
					ns[j+1] = tmp;
				}
			}	
		}
		System.out.println(Arrays.toString(ns));
		/*
		//降序
		for (int i=0; i < ns.length - 1; i++) {
			for (int j=0; j < ns.length - i - 1; j++) {
				if(ns[j] < ns[j+1]){
					int tmp = ns[j];
					ns[j] = ns[j+1];
					ns[j+1] = tmp;
				}
			}
		}
		//排序后：
		System.out.println("排序后："+Arrays.toString(ns));
		*/
	}
}

