package gb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f86388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86389b;

    public void a(float f10) {
        float f11 = this.f86388a + f10;
        this.f86388a = f11;
        int i10 = this.f86389b + 1;
        this.f86389b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f86388a = f11 / 2.0f;
            this.f86389b = i10 / 2;
        }
    }

    public float b() {
        int i10 = this.f86389b;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f86388a / i10;
    }
}
