package SOLID_principle.roles;

import SOLID_principle.model.Bill;
import SOLID_principle.model.Member;
import SOLID_principle.model.Session;

public class Speaker implements SpeakerRole {
    private final Member member;

    public Speaker(Member member) {
        this.member = member;
    }

    @Override
    public void speakOnBill(Bill bill) {
        System.out.println("Speaker " + member.getName() +
                " summarizes discussion on " + bill.getTitle());
    }

    @Override
    public void startSession(Session session) {
        System.out.println("Speaker " + member.getName() +
                " starts session: " + session.getName() + " on " + session.getDate());
    }

    @Override
    public void callForVote(Bill bill) {
        System.out.println("Speaker " + member.getName() + " calls for vote on " + bill.getTitle());
    }
}
