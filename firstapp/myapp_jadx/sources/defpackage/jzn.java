package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jzn[], still in use, count: 1, list:
  (r0v1 jzn[]) from 0x005f: CONSTRUCTOR (r0v1 jzn[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:97) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class jzn {
    WINNER("winner"),
    PLACE("place"),
    SHOW("show"),
    /* JADX INFO: Fake field, exist only in values array */
    ODD_EVEN(dqvOSm.ooSzkfawSHYAdu),
    /* JADX INFO: Fake field, exist only in values array */
    OVER_UNDER("ou"),
    /* JADX INFO: Fake field, exist only in values array */
    EXACTA("exacta"),
    /* JADX INFO: Fake field, exist only in values array */
    QUINELLA("quinella"),
    /* JADX INFO: Fake field, exist only in values array */
    TRIFECTA("trifecta");

    public static final /* synthetic */ uag f;
    public final String a;

    public jzn(String str) {
        super(str, i);
        this.a = str;
    }

    public static jzn valueOf(String str) {
        return (jzn) Enum.valueOf(jzn.class, str);
    }

    public static jzn[] values() {
        return (jzn[]) e.clone();
    }

    static {
        f = new uag(jznVarArr);
    }
}
