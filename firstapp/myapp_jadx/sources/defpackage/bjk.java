package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bjk[], still in use, count: 1, list:
  (r0v1 bjk[]) from 0x0040: CONSTRUCTOR (r0v1 bjk[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:65) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class bjk implements su6 {
    DiscountGiftCard("https://s.sporty.net/cms/gift_discount_card_bg_4eacc09528.png"),
    CashGiftCard("https://s.sporty.net/cms/gift_cash_card_bg_3d802252ba.png"),
    FreeBetGiftCard("https://s.sporty.net/cms/gift_freebet_card_bg_6206e234a7.png"),
    WagerBoostCard("https://s.sporty.net/cms/gift_discount_card_bg_4eacc09528.png"),
    RakeBackBoostCard("https://s.sporty.net/cms/gift_discount_card_bg_4eacc09528.png");

    public static final /* synthetic */ uag v;
    public final String a;

    static {
        v = new uag(bjkVarArr);
    }

    public bjk(String str) {
        super(str, i);
        this.a = str;
    }

    public static bjk valueOf(String str) {
        return (bjk) Enum.valueOf(bjk.class, str);
    }

    public static bjk[] values() {
        return (bjk[]) i.clone();
    }

    @Override // defpackage.su6
    public final String getUrl() {
        return this.a;
    }
}
