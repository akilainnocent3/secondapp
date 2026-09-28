package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vva extends uva implements b580 {
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public vva(int i, int i2, long j, long j2, boolean z) {
        super(i, i2, j, j2, z);
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j == -1 ? -1L : j;
    }

    @Override // defpackage.b580
    public final long f() {
        return this.l;
    }

    @Override // defpackage.b580
    public final long h(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.b580
    public final int j() {
        return this.i;
    }
}
