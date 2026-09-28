package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s470[], still in use, count: 1, list:
  (r0v1 s470[]) from 0x0024: CONSTRUCTOR (r0v1 s470[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:37) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s470 {
    HOME("HOME"),
    AWAY("AWAY"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE");

    public static final a b = new a();
    public static final /* synthetic */ uag f;
    public final String a;

    public static final class a {
    }

    static {
        f = new uag(new s470[]{r0, r1, new s470("NONE")});
    }

    public s470(String str) {
        super(str, i);
        this.a = str;
    }

    public static s470 valueOf(String str) {
        return (s470) Enum.valueOf(s470.class, str);
    }

    public static s470[] values() {
        return (s470[]) e.clone();
    }
}
