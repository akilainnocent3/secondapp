package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 f3q[], still in use, count: 1, list:
  (r0v1 f3q[]) from 0x0022: CONSTRUCTOR (r0v1 f3q[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:35) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class f3q {
    /* JADX INFO: Fake field, exist only in values array */
    Same("Same"),
    None("None"),
    /* JADX INFO: Fake field, exist only in values array */
    Additional("Additional");

    public static final /* synthetic */ uag d;
    public final String a;

    static {
        d = new uag(f3qVarArr);
    }

    public f3q(String str) {
        super(str, i);
        this.a = str;
    }

    public static f3q valueOf(String str) {
        return (f3q) Enum.valueOf(f3q.class, str);
    }

    public static f3q[] values() {
        return (f3q[]) c.clone();
    }
}
