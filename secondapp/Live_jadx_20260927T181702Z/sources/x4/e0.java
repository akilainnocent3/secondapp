package x4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f144267c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f144269b;

    public e0() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f144268a;
        long[] jArr = this.f144269b;
        if (i10 == jArr.length) {
            this.f144269b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f144269b;
        int i11 = this.f144268a;
        this.f144268a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f144268a + jArr.length;
        long[] jArr2 = this.f144269b;
        if (length > jArr2.length) {
            this.f144269b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f144269b, this.f144268a, jArr.length);
        this.f144268a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f144268a) {
            return this.f144269b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f144268a);
    }

    public int d() {
        return this.f144268a;
    }

    public long[] e() {
        return Arrays.copyOf(this.f144269b, this.f144268a);
    }

    public e0(int i10) {
        this.f144269b = new long[i10];
    }
}
