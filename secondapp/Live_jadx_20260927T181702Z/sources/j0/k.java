package j0;

import n0.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class k extends i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f99362w = "KeyCycle";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f99363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f99364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f99365u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f99366v;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public k(int i10, String str) {
        super(i10, str);
        this.f99363s = null;
        this.f99364t = Float.NaN;
        this.f99365u = Float.NaN;
        this.f99366v = Float.NaN;
        this.f99312a = "KeyCycle";
    }

    public float N() {
        return this.f99365u;
    }

    public float O() {
        return this.f99364t;
    }

    public float P() {
        return this.f99366v;
    }

    public a Q() {
        return this.f99363s;
    }

    public void R(float f10) {
        this.f99365u = f10;
    }

    public void S(float f10) {
        this.f99364t = f10;
    }

    public void T(float f10) {
        this.f99366v = f10;
    }

    public void U(a aVar) {
        this.f99363s = aVar;
    }

    @Override // j0.i
    public void g(StringBuilder sb2) {
        super.g(sb2);
        if (this.f99363s != null) {
            sb2.append("shape:'");
            sb2.append(this.f99363s);
            sb2.append("',\n");
        }
        a(sb2, w.c.Q, this.f99364t);
        a(sb2, "offset", this.f99365u);
        a(sb2, w.c.S, this.f99366v);
    }
}
