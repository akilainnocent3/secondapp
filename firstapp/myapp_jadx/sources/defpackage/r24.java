package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r24[], still in use, count: 1, list:
  (r0v1 r24[]) from 0x003e: CONSTRUCTOR (r0v1 r24[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:63) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class r24 {
    /* JADX INFO: Fake field, exist only in values array */
    NotApplicable("NOT_APPLICABLE"),
    Acceptable("ACCEPTABLE"),
    InProgress("IN_PROGRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    Completed("COMPLETED"),
    /* JADX INFO: Fake field, exist only in values array */
    Expired("EXPIRED");

    public static final /* synthetic */ uag e;
    public final String a;

    static {
        e = new uag(r24VarArr);
    }

    public r24(String str) {
        super(str, i);
        this.a = str;
    }

    public static r24 valueOf(String str) {
        return (r24) Enum.valueOf(r24.class, str);
    }

    public static r24[] values() {
        return (r24[]) d.clone();
    }
}
