package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r470[], still in use, count: 1, list:
  (r0v1 r470[]) from 0x0036: CONSTRUCTOR (r0v1 r470[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:55) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class r470 {
    /* JADX INFO: Fake field, exist only in values array */
    START("START"),
    GOAL("GOAL"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_GOAL("NO_GOAL"),
    HALF_TIME("HALF_TIME"),
    FULL_TIME("FULL_TIME");

    public static final a b = new a();
    public static final /* synthetic */ uag i;
    public final String a;

    public static final class a {
    }

    static {
        i = new uag(new r470[]{r0, r1, r2, r3, r4});
    }

    public r470(String str) {
        super(str, i);
        this.a = str;
    }

    public static r470 valueOf(String str) {
        return (r470) Enum.valueOf(r470.class, str);
    }

    public static r470[] values() {
        return (r470[]) f.clone();
    }
}
