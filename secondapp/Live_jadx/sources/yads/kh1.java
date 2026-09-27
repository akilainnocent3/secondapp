package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f151539b;

    public kh1() {
        this(0);
    }

    public final void a(long j10) {
        int i10 = this.f151538a;
        long[] jArr = this.f151539b;
        if (i10 == jArr.length) {
            this.f151539b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f151539b;
        int i11 = this.f151538a;
        this.f151538a = i11 + 1;
        jArr2[i11] = j10;
    }

    public kh1(int i10) {
        this.f151539b = new long[32];
    }

    public final long a(int i10) {
        if (i10 >= 0 && i10 < this.f151538a) {
            return this.f151539b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f151538a);
    }

    public final long[] a() {
        return Arrays.copyOf(this.f151539b, this.f151538a);
    }
}
