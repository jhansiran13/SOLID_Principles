package SOLID_principle.roles;

import SOLID_principle.model.Bill;

public interface VotingMember extends MemberRole {
    void voteFor(Bill bill);
    void voteAgainst(Bill bill);
}
