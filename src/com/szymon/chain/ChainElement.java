package com.szymon.chain;

public interface ChainElement {

    boolean isMyResponsibility(int phoneNumber);

    void doAction();
}
