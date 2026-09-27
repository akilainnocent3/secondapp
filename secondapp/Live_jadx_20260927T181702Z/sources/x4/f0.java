package x4;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f144280f = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f144282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f144284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f144285e;

    public f0() {
        this(16);
    }

    public void a(long j10) {
        if (this.f144283c == this.f144284d.length) {
            d();
        }
        int i10 = (this.f144282b + 1) & this.f144285e;
        this.f144282b = i10;
        this.f144284d[i10] = j10;
        this.f144283c++;
    }

    @k.h1
    public int b() {
        return this.f144284d.length;
    }

    public void c() {
        this.f144281a = 0;
        this.f144282b = -1;
        this.f144283c = 0;
    }

    public final void d() {
        long[] jArr = this.f144284d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f144281a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f144284d, 0, jArr2, i11, i10);
        this.f144281a = 0;
        this.f144282b = this.f144283c - 1;
        this.f144284d = jArr2;
        this.f144285e = jArr2.length - 1;
    }

    public long e() {
        if (this.f144283c != 0) {
            return this.f144284d[this.f144281a];
        }
        throw new NoSuchElementException();
    }

    public boolean f() {
        return this.f144283c == 0;
    }

    public long g() {
        int i10 = this.f144283c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f144284d;
        int i11 = this.f144281a;
        long j10 = jArr[i11];
        this.f144281a = this.f144285e & (i11 + 1);
        this.f144283c = i10 - 1;
        return j10;
    }

    public int h() {
        return this.f144283c;
    }

    public f0(int i10) {
        zi.l0.d(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f144281a = 0;
        this.f144282b = -1;
        this.f144283c = 0;
        long[] jArr = new long[i10];
        this.f144284d = jArr;
        this.f144285e = jArr.length - 1;
    }
}
