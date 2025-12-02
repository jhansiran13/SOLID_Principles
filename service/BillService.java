package SOLID_principle.service;

import SOLID_principle.model.Bill;
import SOLID_principle.roles.VotingMember;

import java.util.List;

public class BillService {
    public void debateAndVote(Bill bill, List<VotingMember> members) {
        for (VotingMember m : members) {
            m.speakOnBill(bill);
        }
        for (VotingMember m : members) {
            m.voteFor(bill); 
        }
        System.out.println("Bill " + bill.getTitle() + " is now passed: " + bill.isPassed());
    }
}
