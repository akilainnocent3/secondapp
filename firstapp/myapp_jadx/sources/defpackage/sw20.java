package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sw20 extends tdb0 {
    public final long a;
    public final long b;

    public sw20(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // defpackage.tdb0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return nrz.a(this.b, " }", sb);
    }
}
