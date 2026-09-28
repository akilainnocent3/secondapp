package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 w870[], still in use, count: 1, list:
  (r0v1 w870[]) from 0x001e: CONSTRUCTOR (r0v1 w870[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:31) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class w870 {
    COMBO("combo"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");

    public static final a b = new a();
    public static final /* synthetic */ uag e;
    public final String a;

    public static final class a {
    }

    static {
        e = new uag(new w870[]{r0, new w870("none")});
    }

    public w870(String str) {
        super(str, i);
        this.a = str;
    }

    public static w870 valueOf(String str) {
        return (w870) Enum.valueOf(w870.class, str);
    }

    public static w870[] values() {
        return (w870[]) d.clone();
    }
}
