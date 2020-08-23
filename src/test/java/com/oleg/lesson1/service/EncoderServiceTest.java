package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Encoder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class EncoderServiceTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void decode() {
        Encoder encoder = new Encoder();
        EncoderService encoderService = new EncoderService(encoder);
        String expected = "A => 65";
        encoderService.decode('A');
        assertEquals(expected,systemOutRule.getLog());
    }

    @Test
    public void encode() {
        Encoder encoder = new Encoder();
        EncoderService encoderService = new EncoderService(encoder);
        String expected = "65 => A";
        encoderService.encode((short) 65);
        assertEquals(expected,systemOutRule.getLog());
    }
}