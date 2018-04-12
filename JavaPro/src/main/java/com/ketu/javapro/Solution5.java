package com.ketu.javapro;


/*
* 数值的整数次方
*
* 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
* */

public class Solution5 {


   public double Power(double base, int ex) throws Exception {
       double  result = 1;

       if (base == 0){
           throw new Exception("底数不能为0");
       }else if (ex == 0) {
           return 1;
       }

       int n = ex < 0 ? -ex : ex;

       result = Power(base , n >> 1);

       result *= result;

       if ((ex & 0x01) == 1){
           result *= base;
       }

       return ex > 0 ? result : 1.0/result ;

   }


}
