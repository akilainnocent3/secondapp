package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t24[], still in use, count: 1, list:
  (r0v1 t24[]) from 0x001e: CONSTRUCTOR (r0v1 t24[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:31) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class t24 {
    PlaceWagerMissionEarned("LOYALTY_BETTING_STREAK_PLACE_WAGER_MISSION_EARNED"),
    /* JADX INFO: Fake field, exist only in values array */
    PlaceWagerMissionCompleted("LOYALTY_BETTING_STREAK_PLACE_WAGER_MISSION_COMPLETED");

    public static final /* synthetic */ uag d;
    public final String a;

    static {
        d = new uag(t24VarArr);
    }

    public t24(String str) {
        super(str, i);
        this.a = str;
    }

    public static t24 valueOf(String str) {
        return (t24) Enum.valueOf(t24.class, str);
    }

    public static t24[] values() {
        return (t24[]) c.clone();
    }
}
