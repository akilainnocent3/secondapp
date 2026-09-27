package af;

import eh.o1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e implements d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f4902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f4903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f4904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f4905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f4906i;

    public e(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4902e = iArr;
        this.f4903f = jArr;
        this.f4904g = jArr2;
        this.f4905h = jArr3;
        int length = iArr.length;
        this.f4901d = length;
        if (length > 0) {
            this.f4906i = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4906i = 0L;
        }
    }

    public int b(long j10) {
        return o1.n(this.f4905h, j10, true, true);
    }

    @Override // af.d0
    public long getDurationUs() {
        return this.f4906i;
    }

    @Override // af.d0
    public d0.a getSeekPoints(long j10) {
        int iB = b(j10);
        e0 e0Var = new e0(this.f4905h[iB], this.f4903f[iB]);
        if (e0Var.f4908a >= j10 || iB == this.f4901d - 1) {
            return new d0.a(e0Var);
        }
        int i10 = iB + 1;
        return new d0.a(e0Var, new e0(this.f4905h[i10], this.f4903f[i10]));
    }

    @Override // af.d0
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f4901d + ", sizes=" + Arrays.toString(this.f4902e) + ", offsets=" + Arrays.toString(this.f4903f) + ", timeUs=" + Arrays.toString(this.f4905h) + ", durationsUs=" + Arrays.toString(this.f4904g) + gi.j.f86771d;
    }
}
