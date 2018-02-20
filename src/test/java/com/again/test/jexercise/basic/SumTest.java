package com.again.test.jexercise.basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dogrex on 2018/2/20.
 */
public class SumTest extends Sum {

    @Test
    public void test() {
        Assert.assertEquals(1, sum(1));

        Assert.assertEquals(55, sum(10));

        Assert.assertEquals(5050, sum(100));
    }
}
