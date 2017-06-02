package com.szymon.chain;

public class FirefightersChainElement implements ChainElement {
    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 998;
    }

    @Override
    public void doAction() {
        System.out.println("Calling Firefighters");
    }
}
