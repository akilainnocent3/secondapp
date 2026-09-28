package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m970[], still in use, count: 1, list:
  (r0v1 m970[]) from 0x0018: CONSTRUCTOR (r0v1 m970[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:25) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class m970 {
    /* JADX INFO: Fake field, exist only in values array */
    BET_OPEN("BET_OPEN"),
    /* JADX INFO: Fake field, exist only in values array */
    RESULT_READY("RESULT_READY");

    public static final a b = new a();
    public static final /* synthetic */ uag d = new uag(new m970[]{new m970("BET_OPEN"), new m970("RESULT_READY")});
    public final String a;

    public static final class a {
    }

    static {
    }

    public m970(String str) {
        super(str, i);
        this.a = str;
    }

    public static m970 valueOf(String str) {
        return (m970) Enum.valueOf(m970.class, str);
    }

    public static m970[] values() {
        return (m970[]) c.clone();
    }
}
