package SOLID_principle.roles;

import SOLID_principle.model.Bill;
import SOLID_principle.model.Member;

public class Minister implements VotingMember {
    private final Member member;

    public Minister(Member member) {
        this.member = member;
    }

    @Override
    public void speakOnBill(Bill bill) {
        System.out.println("Minister " + member.getName() +
                " presents government view on " + bill.getTitle());
    }

    @Override
    public void voteFor(Bill bill) {
        System.out.println("Minister " + member.getName() + " votes FOR " + bill.getTitle());
        bill.markPassed();
    }

    @Override
    public void voteAgainst(Bill bill) {
        System.out.println("Minister " + member.getName() + " rarely votes AGAINST.");
    }
}

