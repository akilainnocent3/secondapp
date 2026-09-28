package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gji0[], still in use, count: 1, list:
  (r0v1 gji0[]) from 0x003d: CONSTRUCTOR (r0v1 gji0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:63) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class gji0 {
    /* JADX INFO: Fake field, exist only in values array */
    TITLE("title"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBTITLE("subtitle"),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT("text"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("image"),
    REDIRECT_BUTTON("redirectButton");

    public static final a b = new a();
    public static final /* synthetic */ uag e;
    public final String a;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
    }

    public gji0(String str) {
        super(str, i);
        this.a = str;
    }

    public static gji0 valueOf(String str) {
        return (gji0) Enum.valueOf(gji0.class, str);
    }

    public static gji0[] values() {
        return (gji0[]) d.clone();
    }

    static {
        e = new uag(new gji0[]{r0, r1, r2, r3, r4});
    }
}
