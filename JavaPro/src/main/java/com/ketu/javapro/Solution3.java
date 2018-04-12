package com.ketu.javapro;

/**
 * <p/>
 * 功能 :
 * <p/>
 * <p>
 * <p>Copyright sohu.com 2017 All right reserved</p>
 *
 * @author ketu 时间 2018/4/12
 * @version 2.0
 *          <p>
 *          最后修改人 无
 * @email ketu@sohu-inc.com
 */

public class Solution3 {


    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if (n <= 0){
            return 0;
        }

        if (n == 1 || n== 2){
            return 1;
        }

        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    /**
     * 非递归
     *
     * @param n
     * @return
     */
    public int Fibonacci1(int n) {

        if (n == 1 || n == 2){
            return 1;
        }

        int f1 = 1;
        int f2 = 1;
        int f3 = 1;

        while ( n > 2){

            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;

            n--;
        }

        return f3;

    }




}
