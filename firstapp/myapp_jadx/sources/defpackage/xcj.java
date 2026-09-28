package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xcj[], still in use, count: 1, list:
  (r0v1 xcj[]) from 0x0033: CONSTRUCTOR (r0v1 xcj[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:53) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xcj implements csm<xcj> {
    CURRENT("0"),
    /* JADX INFO: Fake field, exist only in values array */
    EF20("1"),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECT("2"),
    /* JADX INFO: Fake field, exist only in values array */
    BET("3");

    public static final /* synthetic */ uag d;
    public final String a;

    public xcj(String str) {
        super(str, i);
        this.a = str;
    }

    public static xcj valueOf(String str) {
        return (xcj) Enum.valueOf(xcj.class, str);
    }

    public static xcj[] values() {
        return (xcj[]) c.clone();
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return CURRENT;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }

    static {
        d = new uag(xcjVarArr);
    }
}
