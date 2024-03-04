package daily.day01;

// 九九乘法表
public class MultipleTable {
	public static void main(String[] args){
		for(int i=2; i<=9; i++){
			for(int j=1; j<=9; j++){
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}