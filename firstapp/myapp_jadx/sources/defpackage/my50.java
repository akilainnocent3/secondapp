package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 my50[], still in use, count: 1, list:
  (r0v1 my50[]) from 0x0022: CONSTRUCTOR (r0v1 my50[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:35) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
public final class my50 {
    /* JADX INFO: Fake field, exist only in values array */
    LATE_PHASE_RANDOM_END("LATE_PHASE_RANDOM_END"),
    /* JADX INFO: Fake field, exist only in values array */
    BREAK_REACHED("BREAK_REACHED"),
    UNKNOWN("UNKNOWN");

    public static final /* synthetic */ uag d;
    public final String a;

    static {
        d = new uag(my50VarArr);
    }

    public my50(String str) {
        super(str, i);
        this.a = str;
    }

    public static my50 valueOf(String str) {
        return (my50) Enum.valueOf(my50.class, str);
    }

    public static my50[] values() {
        return (my50[]) c.clone();
    }
}
