package v6;

import x4.m1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f140203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f140204c;

    public a(long j10, byte[] bArr, long j11) {
        this.f140202a = j11;
        this.f140203b = j10;
        this.f140204c = bArr;
    }

    public static a b(v0 v0Var, int i10, long j10) {
        long jW = v0Var.W();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        v0Var.w(bArr, 0, i11);
        return new a(jW, bArr, j10);
    }

    @Override // v6.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f140202a + ", identifier= " + this.f140203b + " }";
    }
}
