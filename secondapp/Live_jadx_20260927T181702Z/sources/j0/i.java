package j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f99313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f99315d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f99312a = "KeyAttributes";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f99316e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f99317f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f99318g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f99319h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f99320i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f99321j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f99322k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f99323l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f99324m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f99325n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f99326o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f99327p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f99328q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f99329r = Float.NaN;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        SPLINE,
        LINEAR
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public i(int i10, String str) {
        this.f99313b = str;
        this.f99314c = i10;
    }

    public void A(float f10) {
        this.f99323l = f10;
    }

    public void B(float f10) {
        this.f99319h = f10;
    }

    public void C(float f10) {
        this.f99320i = f10;
    }

    public void D(float f10) {
        this.f99321j = f10;
    }

    public void E(float f10) {
        this.f99325n = f10;
    }

    public void F(float f10) {
        this.f99326o = f10;
    }

    public void G(String str) {
        this.f99313b = str;
    }

    public void H(String str) {
        this.f99315d = str;
    }

    public void I(float f10) {
        this.f99324m = f10;
    }

    public void J(float f10) {
        this.f99327p = f10;
    }

    public void K(float f10) {
        this.f99328q = f10;
    }

    public void L(float f10) {
        this.f99329r = f10;
    }

    public void M(b bVar) {
        this.f99317f = bVar;
    }

    public void g(StringBuilder sb2) {
        c(sb2, "target", this.f99313b);
        sb2.append("frame:");
        sb2.append(this.f99314c);
        sb2.append(",\n");
        c(sb2, "easing", this.f99315d);
        if (this.f99316e != null) {
            sb2.append("fit:'");
            sb2.append(this.f99316e);
            sb2.append("',\n");
        }
        if (this.f99317f != null) {
            sb2.append("visibility:'");
            sb2.append(this.f99317f);
            sb2.append("',\n");
        }
        a(sb2, "alpha", this.f99318g);
        a(sb2, "rotationX", this.f99320i);
        a(sb2, "rotationY", this.f99321j);
        a(sb2, "rotationZ", this.f99319h);
        a(sb2, "pivotX", this.f99322k);
        a(sb2, "pivotY", this.f99323l);
        a(sb2, "pathRotate", this.f99324m);
        a(sb2, "scaleX", this.f99325n);
        a(sb2, "scaleY", this.f99326o);
        a(sb2, "translationX", this.f99327p);
        a(sb2, "translationY", this.f99328q);
        a(sb2, "translationZ", this.f99329r);
    }

    public float h() {
        return this.f99318g;
    }

    public a i() {
        return this.f99316e;
    }

    public float j() {
        return this.f99322k;
    }

    public float k() {
        return this.f99323l;
    }

    public float l() {
        return this.f99319h;
    }

    public float m() {
        return this.f99320i;
    }

    public float n() {
        return this.f99321j;
    }

    public float o() {
        return this.f99325n;
    }

    public float p() {
        return this.f99326o;
    }

    public String q() {
        return this.f99313b;
    }

    public String r() {
        return this.f99315d;
    }

    public float s() {
        return this.f99324m;
    }

    public float t() {
        return this.f99327p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f99312a);
        sb2.append(":{\n");
        g(sb2);
        sb2.append("},\n");
        return sb2.toString();
    }

    public float u() {
        return this.f99328q;
    }

    public float v() {
        return this.f99329r;
    }

    public b w() {
        return this.f99317f;
    }

    public void x(float f10) {
        this.f99318g = f10;
    }

    public void y(a aVar) {
        this.f99316e = aVar;
    }

    public void z(float f10) {
        this.f99322k = f10;
    }
}
