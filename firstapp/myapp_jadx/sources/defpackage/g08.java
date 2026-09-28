package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 g08[], still in use, count: 1, list:
  (r0v28 g08[]) from 0x02b2: CONSTRUCTOR (r0v28 g08[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:692) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class g08 {
    UNKNOWN(0),
    SINGLE_PREMATCH_BET(0),
    SINGLE_LIVE_BET(0),
    COMBO_PREMATCH_BET(0),
    COMBO_LIVE_BET(0),
    SINGLE_BET_BUILDER_MATCH_PAGE(0),
    SINGLE_PRE_CANNED_BET_BUILDER_MATCH_PAGE(0),
    COMBO_BET_BUILDER_MATCH_PAGE(0),
    COMBO_PRE_CANNED_BET_BUILDER_MATCH_PAGE(0),
    PRE_CANNED_BET_BUILDER(25),
    FEATURED_BET_BUILDER(28),
    FEATURED_BOOKING_CODE_EMPTY_BETSLIP(12),
    LOAD_BOOKING_CODE_EMPTY_BETSLIP(3),
    LOAD_BOOKING_CODE_REMOVE_MATCH(3),
    RECOMMENDED_BOOKING_CODE_SUCCESSFUL(14),
    RECOMMENDED_CODE_PREMATCH_EVENT_DETAIL_TAB(19),
    REBET_SUCCESSFUL_SAME(20),
    REBET_SUCCESSFUL_REMOVED_SELECTIONS(20),
    REBET_FROM_OPEN_BETS(27),
    REBET_FROM_HISTORY(24),
    BOOK_BET_LOAD_CODE(21),
    SHARE_BOOKING_CODE_LOAD_CODE(21),
    REBET_ON_CASHOUT_SUCCESSFUL_POPUP(29),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_LOADED_CODE_CODEHUB_REMOVE_MATCH(8),
    FEATURED_CODE_HOME_REBET(20),
    LOAD_CODE_FROM_CODEHUB(1),
    LOAD_CODE_FROM_CODEHUB_REMOVE_MATCH(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(22),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_LOADED_CODE_CODEHUB_REMOVE_MATCH(22),
    /* JADX INFO: Fake field, exist only in values array */
    CODEHUB_RECOMMENDED_CODES(7),
    CODEHUB_POPULAR_CODES(7),
    PRE_CANNED_BET_BUILDER_CODEHUB(17),
    FOLLOWING_AT_CODEHUB(23),
    /* JADX INFO: Fake field, exist only in values array */
    ANY_EVENT_COMMENTS_LOAD_CODE(15),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE_PREMATCH_CHAT_LOAD_CODE(15),
    REMIX_BET_RECOMMENDED_CODES(26),
    WINNING_POPUP_REMIX_BET(33),
    /* JADX INFO: Fake field, exist only in values array */
    LIABILITY_SMART_REMIX(32),
    /* JADX INFO: Fake field, exist only in values array */
    EDIT_BET_SAVE(null),
    /* JADX INFO: Fake field, exist only in values array */
    HISTORY_EDIT_BET_SAVE(null),
    /* JADX INFO: Fake field, exist only in values array */
    MISSION_REMINDER(18);

    public static final /* synthetic */ uag W;
    public final Integer a;

    public g08(Integer num) {
        super(str, i);
        this.a = num;
    }

    public static g08 valueOf(String str) {
        return (g08) Enum.valueOf(g08.class, str);
    }

    public static g08[] values() {
        return (g08[]) V.clone();
    }

    static {
        W = new uag(g08VarArr);
    }
}
