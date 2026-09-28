package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xvt[], still in use, count: 1, list:
  (r0v1 xvt[]) from 0x000d: CONSTRUCTOR (r0v1 xvt[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:14) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xvt implements su6 {
    /* JADX INFO: Fake field, exist only in values array */
    BoostActiveAnim;

    public static final /* synthetic */ uag b;

    static {
        b = new uag(xvtVarArr);
    }

    public xvt() {
        super("BoostActiveAnim", 0);
    }

    public static xvt valueOf(String str) {
        return (xvt) Enum.valueOf(xvt.class, str);
    }

    public static xvt[] values() {
        return (xvt[]) a.clone();
    }

    @Override // defpackage.su6
    public final String getUrl() {
        return "https://s.sporty.net/cms/ic_boost_active_anim_bd84e16358.gif";
    }
}
