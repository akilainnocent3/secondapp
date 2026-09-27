package s0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f128358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128359d;

    public boolean a(int i10, int i11) {
        int i12;
        int i13 = this.f128356a;
        return i10 >= i13 && i10 < i13 + this.f128358c && i11 >= (i12 = this.f128357b) && i11 < i12 + this.f128359d;
    }

    public int b() {
        return (this.f128356a + this.f128358c) / 2;
    }

    public int c() {
        return (this.f128357b + this.f128359d) / 2;
    }

    public void d(int i10, int i11) {
        this.f128356a -= i10;
        this.f128357b -= i11;
        this.f128358c += i10 * 2;
        this.f128359d += i11 * 2;
    }

    public boolean e(m mVar) {
        int i10;
        int i11;
        int i12 = this.f128356a;
        int i13 = mVar.f128356a;
        return i12 >= i13 && i12 < i13 + mVar.f128358c && (i10 = this.f128357b) >= (i11 = mVar.f128357b) && i10 < i11 + mVar.f128359d;
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f128356a = i10;
        this.f128357b = i11;
        this.f128358c = i12;
        this.f128359d = i13;
    }
}
