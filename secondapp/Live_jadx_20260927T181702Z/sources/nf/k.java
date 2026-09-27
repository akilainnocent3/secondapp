package nf;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f116608f = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116610b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116611c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f116612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116613e;

    public k() {
        int[] iArr = new int[16];
        this.f116612d = iArr;
        this.f116613e = iArr.length - 1;
    }

    public void a(int i10) {
        if (this.f116611c == this.f116612d.length) {
            d();
        }
        int i11 = (this.f116610b + 1) & this.f116613e;
        this.f116610b = i11;
        this.f116612d[i11] = i10;
        this.f116611c++;
    }

    public int b() {
        return this.f116612d.length;
    }

    public void c() {
        this.f116609a = 0;
        this.f116610b = -1;
        this.f116611c = 0;
    }

    public final void d() {
        int[] iArr = this.f116612d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f116609a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f116612d, 0, iArr2, i11, i10);
        this.f116609a = 0;
        this.f116610b = this.f116611c - 1;
        this.f116612d = iArr2;
        this.f116613e = iArr2.length - 1;
    }

    public boolean e() {
        return this.f116611c == 0;
    }

    public int f() {
        int i10 = this.f116611c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f116612d;
        int i11 = this.f116609a;
        int i12 = iArr[i11];
        this.f116609a = (i11 + 1) & this.f116613e;
        this.f116611c = i10 - 1;
        return i12;
    }

    public int g() {
        return this.f116611c;
    }
}
