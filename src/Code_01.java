/**
 * @author wangchong
 * @date 2019/6/5 2:06
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe 另类加法，不是用相关数学运算符号
 */
public class Code_01 {
    public int addAB(int A, int B) {
        int sum  = A;
        while (B != 0) {
            sum = A ^ B;
            B = (A & B) << 1;
            A = sum;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
