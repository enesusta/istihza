package com.github.enesusta.istihza.human.exception;

import java.util.function.Supplier;

public class HumanNotFoundException extends Exception implements Supplier<HumanNotFoundException> {
    public HumanNotFoundException() {
        super("Human not found");
    }

    @Override
    public HumanNotFoundException get() {
        return new HumanNotFoundException();
    }
}
