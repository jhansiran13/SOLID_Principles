package SOLID_principle.model;

public class Bill {
    private final String billNumber;
    private final String title;
    private boolean passed;

    public Bill(String billNumber, String title) {
        this.billNumber = billNumber;
        this.title = title;
    }

    public String getBillNumber() { return billNumber; }
    public String getTitle() { return title; }
    public boolean isPassed() { return passed; }
    public void markPassed() { this.passed = true; }
}
