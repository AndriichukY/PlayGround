package com.Brackets;

import static org.junit.Assert.*;
import com.Brackets.Brackets;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class BracketsTest {
    @Test
    public void testServiceCanVerifyBrackets() {
        Brackets service = new Brackets();
        Assertions.assertTrue(service.verifyBrackets("(test)"));}
}