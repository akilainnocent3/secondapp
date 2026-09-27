package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements CharSequence {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final char[] f85449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85450c;

    public i(@oy.l char[] buffer) {
        kotlin.jvm.internal.m0.p(buffer, "buffer");
        this.f85449b = buffer;
        this.f85450c = buffer.length;
    }

    public char a(int i10) {
        return this.f85449b[i10];
    }

    @oy.l
    public final char[] b() {
        return this.f85449b;
    }

    public int c() {
        return this.f85450c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public void d(int i10) {
        this.f85450c = i10;
    }

    @oy.l
    public final String e(int i10, int i11) {
        return cv.k0.M1(this.f85449b, i10, Math.min(i11, length()));
    }

    public final void f(int i10) {
        d(Math.min(this.f85449b.length, i10));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    @oy.l
    public CharSequence subSequence(int i10, int i11) {
        return cv.k0.M1(this.f85449b, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    @oy.l
    public String toString() {
        return e(0, length());
    }
}
