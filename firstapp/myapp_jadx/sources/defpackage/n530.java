package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n530[], still in use, count: 1, list:
  (r0v1 n530[]) from 0x001e: CONSTRUCTOR (r0v1 n530[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:31) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class n530 {
    Ongoing(30),
    /* JADX INFO: Fake field, exist only in values array */
    Ended(90);

    public static final a b = new a();
    public static final /* synthetic */ uag e;
    public final int a;

    public static final class a {
    }

    static {
        e = new uag(new n530[]{r0, new n530(90)});
    }

    public n530(int i) {
        super(str, i);
        this.a = i;
    }

    public static n530 valueOf(String str) {
        return (n530) Enum.valueOf(n530.class, str);
    }

    public static n530[] values() {
        return (n530[]) d.clone();
    }
}
