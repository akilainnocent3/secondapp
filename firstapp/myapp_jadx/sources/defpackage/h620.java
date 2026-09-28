package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v12 h620[], still in use, count: 1, list:
  (r0v12 h620[]) from 0x012d: CONSTRUCTOR (r0v12 h620[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:302) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class h620 {
    c("Winning", false),
    d("LuckyNumber", false),
    e("DobGift", false),
    f("DobVerifiedGift", false),
    i("Gift", false),
    v("LuckyWheel", false),
    w("PaydayGift", true),
    y("BoostGift", false),
    z("LoyaltyMissionInvitation", false),
    A("LoyaltyMissionComplete", false),
    B("BetslipThemeMissionInvitation", false),
    C("WorldCupPassInvitation", true),
    D("BettingStreakMission", false),
    E("ChallengeStartNotify", true),
    F("ChallengeWinNotify", true),
    G("LoyaltyProgramClaimable", true),
    H("LoyaltyTierUpgradeNotify", true),
    I("LoyaltyTierDowngradeNotify", true),
    J("NameVerifySuccess", true),
    K("AutoBetOrderResult", true),
    L("LoyaltyBettingStreakUpgrade", true);

    public static final /* synthetic */ uag N;
    public final int a;
    public final boolean b;

    static {
        N = new uag(h620VarArr);
    }

    public h620(String str, boolean z2) {
        super(str, i);
        this.a = i;
        this.b = z2;
    }

    public static h620 valueOf(String str) {
        return (h620) Enum.valueOf(h620.class, str);
    }

    public static h620[] values() {
        return (h620[]) M.clone();
    }
}
