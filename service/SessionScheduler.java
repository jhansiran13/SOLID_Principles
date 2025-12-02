package SOLID_principle.service;

import SOLID_principle.model.Member;
import SOLID_principle.model.Session;

import java.util.List;

public class SessionScheduler {
    private final NotificationService notificationService; 

    public SessionScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void schedule(Session session, List<Member> members) {
        for (Member m : members) {
            notificationService.notifyMember(m, session);
        }
    }
}
