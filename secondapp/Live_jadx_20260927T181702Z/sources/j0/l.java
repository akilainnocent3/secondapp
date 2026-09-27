package j0;

import n0.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class l extends j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f99374s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float[] f99375t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float[] f99376u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f99377v;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public l(int i10, String... strArr) {
        super(i10, strArr);
        this.f99374s = null;
        this.f99375t = null;
        this.f99376u = null;
        this.f99377v = null;
        this.f99337a = "KeyCycle";
    }

    public float[] N() {
        return this.f99376u;
    }

    public float[] O() {
        return this.f99375t;
    }

    public float[] P() {
        return this.f99377v;
    }

    public a Q() {
        return this.f99374s;
    }

    public void R(float... fArr) {
        this.f99376u = fArr;
    }

    public void S(float... fArr) {
        this.f99375t = fArr;
    }

    public void T(float... fArr) {
        this.f99377v = fArr;
    }

    public void U(a aVar) {
        this.f99374s = aVar;
    }

    @Override // j0.j
    public void g(StringBuilder sb2) {
        super.g(sb2);
        if (this.f99374s != null) {
            sb2.append("shape:'");
            sb2.append(this.f99374s);
            sb2.append("',\n");
        }
        d(sb2, w.c.Q, this.f99375t);
        d(sb2, "offset", this.f99376u);
        d(sb2, w.c.S, this.f99377v);
    }
}
