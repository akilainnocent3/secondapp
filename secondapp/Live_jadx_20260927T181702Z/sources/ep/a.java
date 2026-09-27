package ep;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum a {
    ACHIEVE_LEVEL("AchieveLevel"),
    ADD_PAYMENT_INFO("AddPaymentInfo"),
    COMPLETE_TUTORIAL("CompleteTutorial"),
    CREATE_GROUP("CreateGroup"),
    CREATE_ROLE("CreateRole"),
    GENERATE_LEAD("GenerateLead"),
    IN_APP_AD_CLICK("InAppADClick"),
    IN_APP_AD_IMPR("InAppAdImpr"),
    INSTALL_APP("InstallApp"),
    JOIN_GROUP("JoinGroup"),
    LAUNCH_APP("LaunchAPP"),
    LOAN_APPLICATION("LoanApplication"),
    LOAN_APPROVAL("LoanApproval"),
    LOAN_DISBURSAL("LoanDisbursal"),
    LOGIN("Login"),
    RATE("Rate"),
    REGISTRATION("Registration"),
    SEARCH("Search"),
    SPEND_CREDITS("SpendCredits"),
    START_TRIAL("StartTrial"),
    SUBSCRIBE("Subscribe"),
    IMPRESSION_LEVEL_AD_REVENUE("ImpressionLevelAdRevenue"),
    UNLOCK_ACHIEVEMENT("UnlockAchievement");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f81493b;

    a(String eventName) {
        this.f81493b = eventName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f81493b;
    }
}
