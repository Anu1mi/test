package com.example;

/**
 * 简单计算器类，用于演示测试管理
 */
public class Calculator {
    
    /**
     * 两数相加
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * 两数相减
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * 两数相乘
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * 两数相除
     * @throws ArithmeticException 如果除数为零
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    /**
     * 主方法，用于演示计算器功能
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 * 3 = " + calc.multiply(5, 3));
        System.out.println("6 / 3 = " + calc.divide(6, 3));
    }
}