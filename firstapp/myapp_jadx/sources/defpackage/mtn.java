package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mtn[], still in use, count: 1, list:
  (r0v1 mtn[]) from 0x0026: CONSTRUCTOR (r0v1 mtn[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:39) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mtn {
    SIMPLE(0),
    MULTI_BET_BONUS(1),
    DYNAMIC_MULTI_BET_BONUS(2);

    public static final /* synthetic */ uag f;
    public final int a;

    static {
        f = new uag(mtnVarArr);
    }

    public mtn(int i) {
        super(str, i);
        this.a = i;
    }

    public static mtn valueOf(String str) {
        return (mtn) Enum.valueOf(mtn.class, str);
    }

    public static mtn[] values() {
        return (mtn[]) e.clone();
    }
}
