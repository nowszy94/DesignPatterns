package com.szymon.chain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmergencyChain {

    private List<ChainElement> chain;

    public EmergencyChain() {
        chain = new ArrayList<>();
        chain.add(new PoliceChainElement());
        chain.add(new FirefightersChainElement());
        chain.add(new AmbulanceChainElement());
    }

    public void invoke(int phoneNumber) {
        Iterator<ChainElement> iterator = chain.iterator();
        ChainElement chainElement = null;
        boolean flag = false;
        while (!flag && iterator.hasNext()) {
            ChainElement next = iterator.next();
            if (next.isMyResponsibility(phoneNumber)) {
                chainElement = next;
                flag = true;
            }
        }
        invoke(chainElement);
    }

    private void invoke(ChainElement chainElement) {
        if (chainElement != null) {
            chainElement.doAction();
        } else {
            System.out.println("Nie znaleziono odpowiedniego elementu");
        }
    }
}
