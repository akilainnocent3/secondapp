package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mth[], still in use, count: 1, list:
  (r0v1 mth[]) from 0x0028: CONSTRUCTOR (r0v1 mth[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:41) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mth {
    NO_DEPOSIT(90),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_DEPOSIT(91),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_FIRST_DEPOSIT(92);

    public static final a b = new a();
    public static final /* synthetic */ uag e;
    public final int a;

    public static final class a {
    }

    static {
        e = new uag(new mth[]{r0, new mth(91), new mth(92)});
    }

    public mth(int i) {
        super(str, i);
        this.a = i;
    }

    public static mth valueOf(String str) {
        return (mth) Enum.valueOf(mth.class, str);
    }

    public static mth[] values() {
        return (mth[]) d.clone();
    }
}
