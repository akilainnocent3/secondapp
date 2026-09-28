package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pag[], still in use, count: 1, list:
  (r0v1 pag[]) from 0x002f: CONSTRUCTOR (r0v1 pag[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:48) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pag {
    /* JADX INFO: Fake field, exist only in values array */
    WithdrawalTax("withdrawalTax", R.string.page_withdraw__withdrawal_tax),
    /* JADX INFO: Fake field, exist only in values array */
    WithdrawalFee("withdrawalFee", R.string.page_withdraw__withdrawal_fee),
    /* JADX INFO: Fake field, exist only in values array */
    YouWillReceive("youWillReceive", R.string.page_payment__you_will_receive);

    public static final a c = new a();
    public static final /* synthetic */ uag e = new uag(new pag[]{new pag("withdrawalTax", R.string.page_withdraw__withdrawal_tax), new pag("withdrawalFee", R.string.page_withdraw__withdrawal_fee), new pag("youWillReceive", R.string.page_payment__you_will_receive)});
    public final String a;
    public final int b;

    public static final class a {
    }

    static {
    }

    public pag(String str, int i) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static pag valueOf(String str) {
        return (pag) Enum.valueOf(pag.class, str);
    }

    public static pag[] values() {
        return (pag[]) d.clone();
    }
}
