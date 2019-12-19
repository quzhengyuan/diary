
public class Main {
	public static void main(String[] args) {
		//用二维数组表示的学生成绩：
		int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
		//
		double average = 0;
		double sum = 0;     //使用double 精确
		for (int[] arr : scores) {
			for(int n : arr) {
				sum += n;
			}
		}
		average = sum / (scores.length * scores[0].length) ;
		System.out.println(average);
 }
}

