package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 iag[], still in use, count: 1, list:
  (r0v1 iag[]) from 0x002f: CONSTRUCTOR (r0v1 iag[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:48) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class iag {
    /* JADX INFO: Fake field, exist only in values array */
    SportyBetGives("sportyBetGives", R.string.page_payment__sportybet_gives__KE),
    /* JADX INFO: Fake field, exist only in values array */
    YouWillReceive("youWillReceive", R.string.page_payment__you_will_receive__KE),
    /* JADX INFO: Fake field, exist only in values array */
    AdditionalFees("additionalFees", R.string.page_payment__additional_fees__KE);

    public static final a c = new a();
    public static final /* synthetic */ uag e = new uag(new iag[]{new iag("sportyBetGives", R.string.page_payment__sportybet_gives__KE), new iag("youWillReceive", R.string.page_payment__you_will_receive__KE), new iag("additionalFees", R.string.page_payment__additional_fees__KE)});
    public final String a;
    public final int b;

    public static final class a {
    }

    static {
    }

    public iag(String str, int i) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static iag valueOf(String str) {
        return (iag) Enum.valueOf(iag.class, str);
    }

    public static iag[] values() {
        return (iag[]) d.clone();
    }
}
