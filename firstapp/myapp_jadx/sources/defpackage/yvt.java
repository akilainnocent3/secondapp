package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yvt[], still in use, count: 1, list:
  (r0v1 yvt[]) from 0x004e: CONSTRUCTOR (r0v1 yvt[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:79) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yvt implements su6 {
    /* JADX INFO: Fake field, exist only in values array */
    DiamondDecoRightBadge("https://s.sporty.net/cms/diamond_deco_right_badge_4x_e1f3c35d4e.png"),
    LoyaltyBannerOshoala("https://s.sporty.net/cms/loyalty_banner_oshoala_aba9f16da3.png"),
    LoyaltyBannerMccarthy("https://s.sporty.net/cms/loyalty_banner_mccarthy_ef3e6cbe85.png"),
    LoyaltyBannerMccarthyKolbe("https://s.sporty.net/cms/loyalty_banner_mccarthy_kolbe_6f1a49af94.png"),
    LoyaltyBannerMourinho("https://s.sporty.net/cms/loyalty_banner_int_3f2b15aa60.png"),
    LoyaltyBannerGH("https://s.sporty.net/cms/bg_banner_3_gh_5a84088928.png");

    public static final /* synthetic */ uag v;
    public final String a;

    static {
        v = new uag(yvtVarArr);
    }

    public yvt(String str) {
        super(str, i);
        this.a = str;
    }

    public static yvt valueOf(String str) {
        return (yvt) Enum.valueOf(yvt.class, str);
    }

    public static yvt[] values() {
        return (yvt[]) i.clone();
    }

    @Override // defpackage.su6
    public final String getUrl() {
        return this.a;
    }
}
