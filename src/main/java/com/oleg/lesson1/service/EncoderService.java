package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Encoder;

public class EncoderService {
    private Encoder encoder;

    public EncoderService(Encoder encoder) {
        this.encoder = encoder;
    }

    public void decode(char symbol){
        System.out.print(symbol +" => "+((int)symbol));
        encoder.setCode(symbol);
    }

    public void encode(short hexCode) {
        System.out.print(hexCode +" => " +((char)hexCode));
        //encoder.setSymbol((char)hexCode);
    }
}
