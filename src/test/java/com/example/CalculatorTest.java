package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Calculator类的单元测试
 */
public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();
    
    @Test
    @DisplayName("测试加法操作")
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 应该等于 5");
    }
    
    @Test
    @DisplayName("测试减法操作")
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 应该等于 2");
    }
    
    @Test
    @DisplayName("测试乘法操作")
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 应该等于 6");
    }
    
    @Test
    @DisplayName("测试除法操作")
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 应该等于 2");
    }
    
    @Test
    @DisplayName("测试除以零的异常")
    public void testDivideByZero() {
        // 期望抛出ArithmeticException异常
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
    
    // 故意添加一个失败的测试，用于后续缺陷管理演示
    @Test
    @DisplayName("测试已修复")
    public void testFailingTest() {
        assertEquals(2, calculator.add(1, 1), "1 + 1 应该等于 2");
    }
}