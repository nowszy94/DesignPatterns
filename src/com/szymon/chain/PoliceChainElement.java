package com.szymon.chain;

public class PoliceChainElement implements ChainElement {
    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 997;
    }

    @Override
    public void doAction() {
        System.out.println("Calling police");
    }
}
