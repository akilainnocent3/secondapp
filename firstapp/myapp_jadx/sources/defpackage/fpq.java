package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 fpq[], still in use, count: 1, list:
  (r0v1 fpq[]) from 0x002c: CONSTRUCTOR (r0v1 fpq[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:45) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class fpq {
    b("Lottery"),
    c("Results");

    public static final /* synthetic */ uag e;
    public final ResourceUiText a;

    static {
        e = new uag(fpqVarArr);
    }

    public fpq(String str) {
        super(str, i);
        this.a = resourceUiText;
    }

    public static fpq valueOf(String str) {
        return (fpq) Enum.valueOf(fpq.class, str);
    }

    public static fpq[] values() {
        return (fpq[]) d.clone();
    }
}
