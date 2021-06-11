package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {
    @Test
    public void secondPatternRightOperandShouldBe_1() {
        Captcha captcha = new Captcha(2,2,1,1);
        assertEquals("1", captcha.getRight().toString());
    }
    @Test
    public void secondPatternRightOperandShouldBe_9() {
        Captcha captcha = new Captcha(2,1,1,9);
        assertEquals("9", captcha.getRight().toString());
    }
    @Test
    public void secondPatternRightOperandShouldBe_5() {
        Captcha captcha = new Captcha(2,1,1,5);
        assertEquals("5", captcha.getRight().toString());
    }
    @Test
    public void secondPatterLeftOperandShouldBeOne() {
        Captcha captcha = new Captcha(2, 1, 1, 1);
        assertEquals("One", captcha.getLeft().toString());
    }
    @Test
    public void secondPatternLeftOperandShouldBeFive() {
        Captcha captcha = new Captcha(2, 5, 1, 1);
        assertEquals("Five", captcha.getLeft().toString());
    }
    @Test
    public void secondPatternLeftOperandShouldBeNine() {
        Captcha captcha = new Captcha(2, 9 , 1, 1);
        assertEquals("Nine", captcha.getLeft().toString());
    }

    @Test
    public void rightOperandShouldBeOne() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("One", captcha.getRight().toString());
    }

    @Test
    public void rightOperandShouldBeFive() {
        Captcha captcha = new Captcha(1, 1, 1, 5);
        assertEquals("Five", captcha.getRight().toString());
    }

    @Test
    public void rightOperandShouldBeNine() {
        Captcha captcha = new Captcha( 1,1,1,9);
        assertEquals("Nine",captcha.getRight().toString());
    }

    @Test
    public void leftOperandShouldBe_1() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("1", captcha.getLeft().toString());
    }

    @Test
    public void leftOperandShouldBe_5() {
        Captcha captcha = new Captcha(1, 5, 1, 1);
        assertEquals("5", captcha.getLeft().toString());
    }

    @Test
    public void leftOperandShouldBe_9() {
        Captcha captcha = new Captcha(1, 9, 1, 1);
        assertEquals("9", captcha.getLeft().toString());
    }
}
