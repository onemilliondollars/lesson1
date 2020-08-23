package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Human;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class HumanServiceTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Test
    public void greet() {
        Human human = new Human();
        HumanService humanService = new HumanService(human);
        human.setName("Alex");
        human.setAge(25);
        String expected = "Name: Alex, Age: 25";
        humanService.greet();
        assertEquals(expected, systemOutRule.getLog());
    }
}