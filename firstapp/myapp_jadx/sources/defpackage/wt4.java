package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wt4[], still in use, count: 1, list:
  (r0v1 wt4[]) from 0x0026: CONSTRUCTOR (r0v1 wt4[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:39) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class wt4 {
    /* JADX INFO: Fake field, exist only in values array */
    STACKER("BONUS_STACKER"),
    /* JADX INFO: Fake field, exist only in values array */
    BONUS_CUP("BONUS_CUP"),
    UNKNOWN("Unknown");

    public static final /* synthetic */ uag d;
    public final String a;

    static {
        d = new uag(wt4VarArr);
    }

    public wt4(String str) {
        super(str, i);
        this.a = str;
    }

    public static wt4 valueOf(String str) {
        return (wt4) Enum.valueOf(wt4.class, str);
    }

    public static wt4[] values() {
        return (wt4[]) c.clone();
    }
}
