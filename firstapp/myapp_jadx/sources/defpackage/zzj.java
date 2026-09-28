package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public enum zzj implements xag<Integer> {
    /* JADX INFO: Fake field, exist only in values array */
    All(0),
    Valid(1),
    /* JADX INFO: Fake field, exist only in values array */
    Usable(2),
    UsedOrExpired(3);

    public final int a;

    zzj(int i) {
        this.a = i;
    }

    @Override // defpackage.xag
    public final Integer getValue() {
        return Integer.valueOf(this.a);
    }
}
