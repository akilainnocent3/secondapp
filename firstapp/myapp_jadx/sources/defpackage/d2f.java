package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 d2f[], still in use, count: 1, list:
  (r0v1 d2f[]) from 0x0030: CONSTRUCTOR (r0v1 d2f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:49) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class d2f {
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_LEFT(0),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEFT(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_CENTER(2),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_RIGHT(3),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_RIGHT(4);

    public static final /* synthetic */ uag c;
    public final int a;

    static {
        c = new uag(d2fVarArr);
    }

    public d2f(int i) {
        super(str, i);
        this.a = i;
    }

    public static d2f valueOf(String str) {
        return (d2f) Enum.valueOf(d2f.class, str);
    }

    public static d2f[] values() {
        return (d2f[]) b.clone();
    }
}
