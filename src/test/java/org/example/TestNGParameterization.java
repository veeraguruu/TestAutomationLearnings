package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterization {

    @Test
    @Parameters("Name")
    public void apple1(String name) {
        System.out.println(name);
    }

}
