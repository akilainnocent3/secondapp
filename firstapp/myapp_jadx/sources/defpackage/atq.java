package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 atq[], still in use, count: 1, list:
  (r0v1 atq[]) from 0x0050: CONSTRUCTOR (r0v1 atq[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:81) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class atq {
    SNM("snm"),
    SNB("snb"),
    SNMBA("snmba"),
    SFN("sfn"),
    PBC("pbc"),
    PSO("pso");

    public static final /* synthetic */ uag w;
    public final String a;

    static {
        w = new uag(atqVarArr);
    }

    public atq(String str) {
        super(str, i);
        this.a = str;
    }

    public static atq valueOf(String str) {
        return (atq) Enum.valueOf(atq.class, str);
    }

    public static atq[] values() {
        return (atq[]) v.clone();
    }
}
