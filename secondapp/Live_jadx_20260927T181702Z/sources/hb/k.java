package hb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f88110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f88111b;

    public k(float f10, float f11) {
        this.f88110a = f10;
        this.f88111b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f88110a == f10 && this.f88111b == f11;
    }

    public float b() {
        return this.f88110a;
    }

    public float c() {
        return this.f88111b;
    }

    public void d(float f10, float f11) {
        this.f88110a = f10;
        this.f88111b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public k() {
        this(1.0f, 1.0f);
    }
}
