package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public enum dag implements bag {
    REGISTER("register"),
    LOYALTY("loyalty"),
    INSUFFICIENT_BALANCE("insufficient_balance"),
    ME("me"),
    BALANCE_ICON("balance_icon"),
    FOOTER_PAYMENT("footer_payment"),
    NAV_BAR("navbar"),
    PAYDAY_PROMO("payday_promo");

    public final String a;

    dag(String str) {
        this.a = str;
    }

    @Override // defpackage.bag
    public final String K0() {
        return this.a;
    }
}
