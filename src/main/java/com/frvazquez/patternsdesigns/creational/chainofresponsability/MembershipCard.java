package com.frvazquez.patternsdesigns.creational.chainofresponsability;

public class MembershipCard implements ApproveLoanChain {

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

        Gold gold = new Gold();
        this.setNext(gold);

        Platinum platinum = new Platinum();
        gold.setNext(platinum);

        Black black = new Black();
        platinum.setNext(black);

        next.creditCardRequest(totalLoan);
        if (null != gold.getValue()) {
            this.message = gold.getValue();
        } else if (null != platinum.getValue()) {
            this.message = platinum.getValue();
        } else {
            this.message = black.getValue();
        }

    }

    @Override
    public String getValue() {
        return message;
    }
}
