package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gyc0[], still in use, count: 1, list:
  (r0v1 gyc0[]) from 0x002c: CONSTRUCTOR (r0v1 gyc0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:45) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gyc0 {
    COMBO("combo"),
    NONE("none"),
    PENALTY_WINNER_AND_TOTAL("penaltyWinnerAndTotal");

    public static final /* synthetic */ uag f;
    public final String a;

    static {
        f = new uag(gyc0VarArr);
    }

    public gyc0(String str) {
        super(str, i);
        this.a = str;
    }

    public static gyc0 valueOf(String str) {
        return (gyc0) Enum.valueOf(gyc0.class, str);
    }

    public static gyc0[] values() {
        return (gyc0[]) e.clone();
    }
}
