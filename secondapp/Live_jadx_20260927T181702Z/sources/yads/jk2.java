package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f151140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f151141d;

    public jk2(int i10, float[] fArr, float[] fArr2, int i11) {
        this.f151138a = i10;
        ni.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f151140c = fArr;
        this.f151141d = fArr2;
        this.f151139b = i11;
    }

    public final int a() {
        return this.f151140c.length / 3;
    }
}
