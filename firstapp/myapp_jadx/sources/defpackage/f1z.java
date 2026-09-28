package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 f1z[], still in use, count: 1, list:
  (r0v1 f1z[]) from 0x001c: CONSTRUCTOR (r0v1 f1z[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:29) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class f1z {
    OpenBets(0),
    BetHistory(1);

    public static final a b = new a();
    public static final /* synthetic */ uag f;
    public final int a;

    public static final class a {
    }

    static {
        f = new uag(new f1z[]{r0, r1});
    }

    public f1z(int i) {
        super(str, i);
        this.a = i;
    }

    public static f1z valueOf(String str) {
        return (f1z) Enum.valueOf(f1z.class, str);
    }

    public static f1z[] values() {
        return (f1z[]) e.clone();
    }
}
