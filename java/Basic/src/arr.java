/*public class Main {
    public static void main(String[] args) {
        String[] names = {"1", "2", "3"};
        String s = names[1];
        names[1] = "5";
        System.out.println(s); // s是"5"还是"2"?
		System.out.println(names[2]);
		//2
    }
}
*/
public class arr {
    public static void main(String[] args) {
        int[] ns = {1,2,3,4,5};
		//倒序打印元素
		for (int i=(ns.length-1);i>0;i-- ) {
            System.out.println(ns); 
        }
    }
}