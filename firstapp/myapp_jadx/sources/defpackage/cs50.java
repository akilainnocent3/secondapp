package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cs50[], still in use, count: 1, list:
  (r0v1 cs50[]) from 0x0036: CONSTRUCTOR (r0v1 cs50[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:55) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cs50 {
    MAJOR_WIN("MAJOR"),
    MINOR_WIN("MINOR"),
    GOLDEN_RAIN("GOLD_RAIN"),
    UNKNOWN("UNKNOWN");

    public static final /* synthetic */ uag i;
    public final String a;

    static {
        i = new uag(cs50VarArr);
    }

    public cs50(String str) {
        super(str, i);
        this.a = str;
    }

    public static cs50 valueOf(String str) {
        return (cs50) Enum.valueOf(cs50.class, str);
    }

    public static cs50[] values() {
        return (cs50[]) f.clone();
    }
}
