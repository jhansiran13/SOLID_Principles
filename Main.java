package SOLID_principle;

import SOLID_principle.model.Bill;
import SOLID_principle.model.Member;
import SOLID_principle.model.Session;
import SOLID_principle.roles.Backbencher;
import SOLID_principle.roles.Minister;
import SOLID_principle.roles.Speaker;
import SOLID_principle.roles.VotingMember;
import SOLID_principle.service.BillService;
import SOLID_principle.service.NotificationService;
import SOLID_principle.service.SessionScheduler;
import SOLID_principle.service.SmsNotificationService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Member speakerMember = new Member("S1", "Speaker of AP", "Nominated");
        Member ministerMember = new Member("M1", "IT Minister", "Mangalagiri");
        Member mlaMember = new Member("B1", "Local MLA", "Nellore");

        Speaker speaker = new Speaker(speakerMember);
        VotingMember minister = new Minister(ministerMember);
        VotingMember backbencher = new Backbencher(mlaMember);

        List<VotingMember> votingMembers = Arrays.asList(minister, backbencher);
        List<Member> allMembers = Arrays.asList(speakerMember, ministerMember, mlaMember);

        Bill budgetBill = new Bill("AP‑B001", "Andhra Pradesh Budget Bill");
        Session budgetSession = new Session("Budget Session", LocalDate.now());

        NotificationService notificationService = new SmsNotificationService();
        SessionScheduler scheduler = new SessionScheduler(notificationService);
        BillService billService = new BillService();

        scheduler.schedule(budgetSession, allMembers);
        speaker.startSession(budgetSession);
        speaker.speakOnBill(budgetBill);
        billService.debateAndVote(budgetBill, votingMembers);
        speaker.callForVote(budgetBill);
    }
}