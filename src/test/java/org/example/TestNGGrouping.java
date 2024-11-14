package org.example;

import org.testng.annotations.Test;

public class TestNGGrouping {

    @Test(groups = {"apple"})
    public void apple1() {
        System.out.println("APPLE");
    }

    @Test(groups = {"apple"})
    public void apple2() {
        System.out.println("APPLE");
    }

    @Test(groups = {"moto"})
    public void moto1() {

        System.out.println("MOTO");
    }

    @Test(groups = {"moto"})
    public void moto2() {

        System.out.println("MOTO");
    }

}
