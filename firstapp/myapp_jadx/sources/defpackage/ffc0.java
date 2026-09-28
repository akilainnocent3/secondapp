package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ffc0[], still in use, count: 1, list:
  (r0v1 ffc0[]) from 0x0020: CONSTRUCTOR (r0v1 ffc0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:33) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ffc0 {
    COMBO("combo"),
    NONE("none");

    public static final /* synthetic */ uag e;
    public final String a;

    static {
        e = new uag(ffc0VarArr);
    }

    public ffc0(String str) {
        super(str, i);
        this.a = str;
    }

    public static ffc0 valueOf(String str) {
        return (ffc0) Enum.valueOf(ffc0.class, str);
    }

    public static ffc0[] values() {
        return (ffc0[]) d.clone();
    }
}
