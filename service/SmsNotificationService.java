package SOLID_principle.service;

import SOLID_principle.model.Member;
import SOLID_principle.model.Session;

public class SmsNotificationService implements NotificationService {
    @Override
    public void notifyMember(Member member, Session session) {
        System.out.println("SMS to " + member.getName() + " about session " + session.getName());
    }
}
