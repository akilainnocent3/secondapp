package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xie0[], still in use, count: 1, list:
  (r0v1 xie0[]) from 0x0019: CONSTRUCTOR (r0v1 xie0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:26) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xie0 {
    /* JADX INFO: Fake field, exist only in values array */
    Real(1),
    /* JADX INFO: Fake field, exist only in values array */
    Fake(2);

    public static final a b = new a();
    public static final /* synthetic */ uag d = new uag(new xie0[]{new xie0(1), new xie0(2)});
    public final int a;

    public static final class a {
    }

    static {
    }

    public xie0(int i) {
        super(str, i);
        this.a = i;
    }

    public static xie0 valueOf(String str) {
        return (xie0) Enum.valueOf(xie0.class, str);
    }

    public static xie0[] values() {
        return (xie0[]) c.clone();
    }
}
