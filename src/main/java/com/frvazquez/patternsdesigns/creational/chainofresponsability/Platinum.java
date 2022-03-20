package com.frvazquez.patternsdesigns.creational.chainofresponsability;

public class Platinum implements ApproveLoanChain {

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
        if (totalLoan > 10000 && totalLoan <= 50000) {
            this.message = "Credito Platinum";
        } else {
            next.creditCardRequest(totalLoan);
        }
    }

    @Override
    public String getValue() {
        return message;
    }

}
