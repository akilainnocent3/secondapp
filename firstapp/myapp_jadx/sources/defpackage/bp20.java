package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bp20[], still in use, count: 1, list:
  (r0v1 bp20[]) from 0x0044: CONSTRUCTOR (r0v1 bp20[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:69) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
public final class bp20 {
    /* JADX INFO: Fake field, exist only in values array */
    LAUGH("😂"),
    /* JADX INFO: Fake field, exist only in values array */
    LIKE("👍"),
    /* JADX INFO: Fake field, exist only in values array */
    LOVE("😍"),
    /* JADX INFO: Fake field, exist only in values array */
    ANGRY("😠"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRE("🔥"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_HUNDRED("💯");

    public static final /* synthetic */ uag c;
    public final String a;

    static {
        c = new uag(bp20VarArr);
    }

    public bp20(String str) {
        super(str, i);
        this.a = str;
    }

    public static bp20 valueOf(String str) {
        return (bp20) Enum.valueOf(bp20.class, str);
    }

    public static bp20[] values() {
        return (bp20[]) b.clone();
    }
}
