package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qzd0[], still in use, count: 1, list:
  (r0v1 qzd0[]) from 0x001c: CONSTRUCTOR (r0v1 qzd0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:29) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qzd0 {
    /* JADX INFO: Fake field, exist only in values array */
    UP("+"),
    /* JADX INFO: Fake field, exist only in values array */
    DOWN("-");

    public static final a b = new a();
    public static final /* synthetic */ uag d = new uag(new qzd0[]{new qzd0("+"), new qzd0("-")});
    public final String a;

    public static final class a {
    }

    static {
    }

    public qzd0(String str) {
        super(str, i);
        this.a = str;
    }

    public static qzd0 valueOf(String str) {
        return (qzd0) Enum.valueOf(qzd0.class, str);
    }

    public static qzd0[] values() {
        return (qzd0[]) c.clone();
    }
}
