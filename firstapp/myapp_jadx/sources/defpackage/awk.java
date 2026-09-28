package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public enum awk implements xag<Integer> {
    None(0),
    Cash(1),
    Discount(2),
    FreeBet(3),
    LuckyWheel(4),
    BetslipTheme(6);

    public final int a;

    awk(int i) {
        this.a = i;
    }

    @Override // defpackage.xag
    public final Integer getValue() {
        return Integer.valueOf(this.a);
    }
}
