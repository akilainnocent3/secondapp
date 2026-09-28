package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iqz {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public iqz(int i, int i2, boolean z, int i3, int i4, int i5) {
        i2 = (i5 & 2) != 0 ? i : i2;
        z = (i5 & 4) != 0 ? true : z;
        i3 = (i5 & 8) != 0 ? i * 3 : i3;
        i4 = (i5 & 16) != 0 ? Integer.MAX_VALUE : i4;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = i4;
        if (!z && i2 == 0) {
            hb5.a("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
            throw null;
        }
        if (i4 == Integer.MAX_VALUE || i4 >= (i2 * 2) + i) {
            return;
        }
        StringBuilder sbA = dy5.a("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", i, i2, ", prefetchDist=", ", maxSize=");
        sbA.append(i4);
        throw new IllegalArgumentException(sbA.toString());
    }
}
