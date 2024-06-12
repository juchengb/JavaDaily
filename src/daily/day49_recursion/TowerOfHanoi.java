package daily.day49_recursion;

public class TowerOfHanoi {
	// 計算移動 n 個盤子所需的總步數
    public static int countStep(int n) {
        // 如果沒有盤子，步數為 0
        if (n == 0) {
            return 0;
        } else {
            // 遞迴關係：移動 n 個盤子需要 2 * 移動 n-1 個盤子的步數 + 1 步
            return 2 * countStep(n - 1) + 1;
        }
    }

    // 打印移動每個盤子的詳細步驟
    public static void printStepDetail(char start, char buffer, char end, int n) {
        // 如果只有一個盤子，直接從起始柱移動到目標柱
        if (n == 1) {
            System.out.println("Move disk from " + start + " to " + end);
        } else {
            // 將前 n-1 個盤子從起始柱移動到輔助柱
            printStepDetail(start, end, buffer, n - 1);
            // 將第 n 個盤子從起始柱移動到目標柱
            printStepDetail(start, buffer, end, 1);
            // 將前 n-1 個盤子從輔助柱移動到目標柱
            printStepDetail(buffer, start, end, n - 1);
        }
    }

    // 解決河內塔問題，並打印總步數和詳細步驟
    public static void towerOfHanoi(int n) {
        // 首先打印總步數
        System.out.println("Total count step: " + countStep(n));
        // 然後打印每一步的移動詳情
        printStepDetail('A', 'B', 'C', n);
    }

    public static void main(String[] args) {
    	int n = 3;
    	towerOfHanoi(n);
    }
}
