package lang;

public class TestStringBuilder3 {
	public static void main(String[] args) {
		String str = "";
		long mem1 = Runtime.getRuntime().freeMemory();
		long time1 = System.currentTimeMillis();
		for(int i=0; i<5000; i++) {
			str = str + i;
		}
		long mem2 = Runtime.getRuntime().freeMemory();
		long time2 = System.currentTimeMillis();
		System.out.println("内存占用： "+(mem1-mem2));
		System.out.println("运行时间：	"+(time2 - time1));
		
		StringBuilder str1 = new StringBuilder("");
		long mem3 = Runtime.getRuntime().freeMemory();
		long time3 = System.currentTimeMillis();
		for(int i=0; i<5000; i++) {
			str1.append(i);
		}
		long mem4 = Runtime.getRuntime().freeMemory();
		long time4 = System.currentTimeMillis();
		System.out.println("内存占用： "+(mem3-mem4));
		System.out.println("运行时间：	"+(time4 - time3));
		
	}
}
