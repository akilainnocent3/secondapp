package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ou30[], still in use, count: 1, list:
  (r0v1 ou30[]) from 0x0032: CONSTRUCTOR (r0v1 ou30[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:51) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ou30 {
    /* JADX INFO: Fake field, exist only in values array */
    WAP("Mobile"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB("Desktop"),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID("Android"),
    UNKNOWN("");

    public static final a b = new a();
    public static final /* synthetic */ uag e;
    public final String a;

    public static final class a {
    }

    static {
        e = new uag(new ou30[]{r0, r1, r2, r3});
    }

    public ou30(String str) {
        super(str, i);
        this.a = str;
    }

    public static ou30 valueOf(String str) {
        return (ou30) Enum.valueOf(ou30.class, str);
    }

    public static ou30[] values() {
        return (ou30[]) d.clone();
    }
}
