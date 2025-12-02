package SOLID_principle.roles;

import SOLID_principle.model.Bill;
import SOLID_principle.model.Session;

public interface SpeakerRole extends MemberRole {
    void startSession(Session session);
    void callForVote(Bill bill);
}
