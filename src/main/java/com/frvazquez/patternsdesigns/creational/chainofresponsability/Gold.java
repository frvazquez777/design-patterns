package com.frvazquez.patternsdesigns.creational.chainofresponsability;

public class Gold implements ApproveLoanChain {

    private ApproveLoanChain next;
    private String message;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if (totalLoan <= 10000) {
           this.message = "Credito Gold";
        } else {
            next.creditCardRequest(totalLoan);
        }
    }

    @Override
    public String getValue() {
        return message;
    }
}
