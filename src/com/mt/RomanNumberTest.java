package com.mt;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mthierry on 6/20/16.
 */
public class RomanNumberTest {
    @Test
    public void toArabic() throws Exception {
        RomanNumber rn = new RomanNumber();
        Assert.assertEquals("I", rn.toRoman(1));
        Assert.assertEquals("II", rn.toRoman(2));
        Assert.assertEquals("III", rn.toRoman(3));
        Assert.assertEquals("IV", rn.toRoman(4));
        Assert.assertEquals("V", rn.toRoman(5));
        Assert.assertEquals("VI", rn.toRoman(6));
        Assert.assertEquals("VII", rn.toRoman(7));
        Assert.assertEquals("VIII", rn.toRoman(8));
        Assert.assertEquals("IX", rn.toRoman(9));
        Assert.assertEquals("X", rn.toRoman(10));
        Assert.assertEquals("XI", rn.toRoman(11));
        Assert.assertEquals("XIV", rn.toRoman(14));
        Assert.assertEquals("XV", rn.toRoman(15));
        Assert.assertEquals("XXVI", rn.toRoman(26));
        Assert.assertEquals("XXXIII", rn.toRoman(33));
        Assert.assertEquals("XXXIX", rn.toRoman(39));
        Assert.assertEquals("L", rn.toRoman(50));
        Assert.assertEquals("LVI", rn.toRoman(56));
        Assert.assertEquals("LXI", rn.toRoman(61));
        Assert.assertEquals("LXXXVIII", rn.toRoman(88));


        Assert.assertEquals("M", rn.toRoman(1000));
    }

}