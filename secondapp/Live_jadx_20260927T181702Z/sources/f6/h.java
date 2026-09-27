package f6;

import java.util.Arrays;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class h implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f83483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f83484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f83485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f83486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f83487f;

    public h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f83483b = iArr;
        this.f83484c = jArr;
        this.f83485d = jArr2;
        this.f83486e = jArr3;
        int length = iArr.length;
        this.f83482a = length;
        if (length > 0) {
            this.f83487f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f83487f = 0L;
        }
    }

    public int b(long j10) {
        return b2.n(this.f83486e, j10, true, true);
    }

    @Override // f6.w0
    public /* synthetic */ boolean e() {
        return v0.a(this);
    }

    @Override // f6.w0
    public long getDurationUs() {
        return this.f83487f;
    }

    @Override // f6.w0
    public w0.a getSeekPoints(long j10) {
        int iB = b(j10);
        x0 x0Var = new x0(this.f83486e[iB], this.f83484c[iB]);
        if (x0Var.f83663a >= j10 || iB == this.f83482a - 1) {
            return new w0.a(x0Var);
        }
        int i10 = iB + 1;
        return new w0.a(x0Var, new x0(this.f83486e[i10], this.f83484c[i10]));
    }

    @Override // f6.w0
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f83482a + ", sizes=" + Arrays.toString(this.f83483b) + ", offsets=" + Arrays.toString(this.f83484c) + ", timeUs=" + Arrays.toString(this.f83486e) + ", durationsUs=" + Arrays.toString(this.f83485d) + gi.j.f86771d;
    }
}
