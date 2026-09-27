package eh;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80984c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f80986b;

    public i0() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f80985a;
        long[] jArr = this.f80986b;
        if (i10 == jArr.length) {
            this.f80986b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f80986b;
        int i11 = this.f80985a;
        this.f80985a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f80985a) {
            return this.f80986b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f80985a);
    }

    public int c() {
        return this.f80985a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f80986b, this.f80985a);
    }

    public i0(int i10) {
        this.f80986b = new long[i10];
    }
}
