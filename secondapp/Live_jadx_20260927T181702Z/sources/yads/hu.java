package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hu implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f150299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f150300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f150301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f150302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f150303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f150304f;

    public hu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f150300b = iArr;
        this.f150301c = jArr;
        this.f150302d = jArr2;
        this.f150303e = jArr3;
        int length = iArr.length;
        this.f150299a = length;
        if (length <= 0) {
            this.f150304f = 0L;
        } else {
            int i10 = length - 1;
            this.f150304f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f150304f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f150299a + ", sizes=" + Arrays.toString(this.f150300b) + ", offsets=" + Arrays.toString(this.f150301c) + ", timeUs=" + Arrays.toString(this.f150303e) + ", durationsUs=" + Arrays.toString(this.f150302d) + gi.j.f86771d;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iB = ib3.b(this.f150303e, j10, true);
        long[] jArr = this.f150303e;
        long j11 = jArr[iB];
        long[] jArr2 = this.f150301c;
        xw2 xw2Var = new xw2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == this.f150299a - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var, new xw2(jArr[i10], jArr2[i10]));
    }
}
