package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public enum c25 implements xag<Integer> {
    /* JADX INFO: Fake field, exist only in values array */
    All(0),
    Usable(1),
    UsedOrExpired(2);

    public final int a;

    c25(int i) {
        this.a = i;
    }

    @Override // defpackage.xag
    public final Integer getValue() {
        return Integer.valueOf(this.a);
    }
}
