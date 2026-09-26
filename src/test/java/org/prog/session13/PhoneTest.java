package org.prog.session13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//TODO: Write test that will create a phone with a color. Assert that color is black.

public class PhoneTest {

    @Test
    public void phoneColorTest() {
        Phone phone = new Phone("black");

        Assertions.assertEquals("black", phone.getColor(),
                "Expected phone color is black");

        System.out.println(phone.getColor().equals("black"));
    }
}
