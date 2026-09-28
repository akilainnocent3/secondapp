package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 lr00[], still in use, count: 1, list:
  (r0v19 lr00[]) from 0x00ef: CONSTRUCTOR (r0v19 lr00[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:240) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class lr00 {
    Winning("recent_winning_order"),
    GiftUsable("GiftUsablePush"),
    /* JADX INFO: Fake field, exist only in values array */
    MissionStart("NewMissionStartNotify"),
    /* JADX INFO: Fake field, exist only in values array */
    MissionComplete("NewMissionCompleteNotify"),
    /* JADX INFO: Fake field, exist only in values array */
    ChallengeStart("ChallengeStartNotify"),
    /* JADX INFO: Fake field, exist only in values array */
    ChallengeWin("ChallengeWinNotify"),
    /* JADX INFO: Fake field, exist only in values array */
    TicketUsable("TicketUsablePush"),
    /* JADX INFO: Fake field, exist only in values array */
    NameUpdateSuccess("PUSH_TYPE_NAME_UPDATE_SUCCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    LoyaltyGiftClaimable("ProgramClaimableCount"),
    /* JADX INFO: Fake field, exist only in values array */
    LoyaltyTierUpgrade("LoyaltyTierUpgrade"),
    /* JADX INFO: Fake field, exist only in values array */
    LoyaltyTierDowngrade("LoyaltyTierProbation"),
    /* JADX INFO: Fake field, exist only in values array */
    NewDeviceLogin("PUSH_TYPE_NEW_DEVICE_LOGIN"),
    /* JADX INFO: Fake field, exist only in values array */
    VerifyIdentityOtpResetPassword("PUSH_TYPE_VERIFY_IDENTITY_OTP_RESET_PASSWORD"),
    /* JADX INFO: Fake field, exist only in values array */
    NinDobReverifyFailed("PUSH_TYPE_NIN_DOB_RE_VERIFY_FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    LoyaltyBettingStreakUpgrade("LoyaltyBettingStreakUpgradeNotification"),
    /* JADX INFO: Fake field, exist only in values array */
    DeviceBlocked("PUSH_TYPE_DEVICE_BLOCKED"),
    /* JADX INFO: Fake field, exist only in values array */
    AutoBetOrderResult("auto_bet_order_result"),
    /* JADX INFO: Fake field, exist only in values array */
    BoostGift("BoostGiftUsablePush"),
    /* JADX INFO: Fake field, exist only in values array */
    LoyaltyBettingStreakMission("LoyaltyBettingStreakMissionNotification");

    public static final a b = new a();
    public static final /* synthetic */ uag f;
    public final String a;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
    }

    static {
        f = new uag(new lr00[]{r1, r2, new lr00("NewMissionStartNotify"), new lr00("NewMissionCompleteNotify"), new lr00("ChallengeStartNotify"), new lr00("ChallengeWinNotify"), new lr00("TicketUsablePush"), new lr00("PUSH_TYPE_NAME_UPDATE_SUCCESS"), new lr00("ProgramClaimableCount"), new lr00("LoyaltyTierUpgrade"), new lr00("LoyaltyTierProbation"), new lr00("PUSH_TYPE_NEW_DEVICE_LOGIN"), new lr00("PUSH_TYPE_VERIFY_IDENTITY_OTP_RESET_PASSWORD"), new lr00("PUSH_TYPE_NIN_DOB_RE_VERIFY_FAILED"), new lr00("LoyaltyBettingStreakUpgradeNotification"), new lr00("PUSH_TYPE_DEVICE_BLOCKED"), new lr00("auto_bet_order_result"), new lr00("BoostGiftUsablePush"), new lr00("LoyaltyBettingStreakMissionNotification")});
    }

    public lr00(String str) {
        super(str, i);
        this.a = str;
    }

    public static lr00 valueOf(String str) {
        return (lr00) Enum.valueOf(lr00.class, str);
    }

    public static lr00[] values() {
        return (lr00[]) e.clone();
    }
}
