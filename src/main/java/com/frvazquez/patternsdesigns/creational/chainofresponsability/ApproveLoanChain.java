package com.frvazquez.patternsdesigns.creational.chainofresponsability;

public interface ApproveLoanChain {
    
    public void setNext(ApproveLoanChain loan);

    public ApproveLoanChain getNext();

    public void creditCardRequest(int totalLoan);

    public String getValue();
    
}
