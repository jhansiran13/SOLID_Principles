package SOLID_principle.service;

import SOLID_principle.model.Member;
import SOLID_principle.model.Session;

public interface NotificationService {
    void notifyMember(Member member, Session session);
}
