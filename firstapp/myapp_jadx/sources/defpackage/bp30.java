package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bp30[], still in use, count: 1, list:
  (r0v1 bp30[]) from 0x001e: CONSTRUCTOR (r0v1 bp30[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:31) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class bp30 {
    ORANGE("A"),
    /* JADX INFO: Fake field, exist only in values array */
    WHITE("B");

    public static final /* synthetic */ uag d;
    public final String a;

    static {
        d = new uag(bp30VarArr);
    }

    public bp30(String str) {
        super(str, i);
        this.a = str;
    }

    public static bp30 valueOf(String str) {
        return (bp30) Enum.valueOf(bp30.class, str);
    }

    public static bp30[] values() {
        return (bp30[]) c.clone();
    }
}
