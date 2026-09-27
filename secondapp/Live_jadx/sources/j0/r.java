package j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f99412q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f99413r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f99414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f99415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f99416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f99417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f99418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f99419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f99420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f99421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f99422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f99423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f99424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f99425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f99426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f99427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f99428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f99429p;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        OVERSHOOT,
        BOUNCE_START,
        BOUNCE_END,
        BOUNCE_BOTH
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        START,
        END,
        CLOCKWISE,
        ANTICLOCKWISE
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        VELOCITY,
        SPRING
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        MIDDLE,
        START,
        END
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum e {
        AUTOCOMPLETE,
        TO_START,
        NEVER_COMPLETE_END,
        TO_END,
        STOP,
        DECELERATE,
        DECELERATE_COMPLETE,
        NEVER_COMPLETE_START
    }

    public r() {
        this.f99414a = null;
        this.f99415b = null;
        this.f99416c = null;
        this.f99417d = null;
        this.f99418e = null;
        this.f99419f = null;
        this.f99420g = Float.NaN;
        this.f99421h = Float.NaN;
        this.f99422i = Float.NaN;
        this.f99423j = Float.NaN;
        this.f99424k = Float.NaN;
        this.f99425l = Float.NaN;
        this.f99426m = Float.NaN;
        this.f99427n = Float.NaN;
        this.f99428o = null;
        this.f99429p = null;
    }

    public r A(float f10) {
        this.f99424k = f10;
        return this;
    }

    public r B(float f10) {
        this.f99425l = f10;
        return this;
    }

    public r C(float f10) {
        this.f99426m = f10;
        return this;
    }

    public r D(float f10) {
        this.f99427n = f10;
        return this;
    }

    public r E(String str) {
        this.f99416c = str;
        return this;
    }

    public r F(d dVar) {
        this.f99415b = dVar;
        return this;
    }

    public c a() {
        return this.f99429p;
    }

    public b b() {
        return this.f99414a;
    }

    public float c() {
        return this.f99422i;
    }

    public float d() {
        return this.f99423j;
    }

    public String e() {
        return this.f99417d;
    }

    public float f() {
        return this.f99421h;
    }

    public float g() {
        return this.f99420g;
    }

    public e h() {
        return this.f99418e;
    }

    public String i() {
        return this.f99419f;
    }

    public a j() {
        return this.f99428o;
    }

    public float k() {
        return this.f99424k;
    }

    public float l() {
        return this.f99425l;
    }

    public float m() {
        return this.f99426m;
    }

    public float n() {
        return this.f99427n;
    }

    public String o() {
        return this.f99416c;
    }

    public d p() {
        return this.f99415b;
    }

    public void q(c cVar) {
        this.f99429p = cVar;
    }

    public r r(b bVar) {
        this.f99414a = bVar;
        return this;
    }

    public r s(int i10) {
        this.f99422i = i10;
        return this;
    }

    public r t(int i10) {
        this.f99423j = i10;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OnSwipe:{\n");
        if (this.f99416c != null) {
            sb2.append("anchor:'");
            sb2.append(this.f99416c);
            sb2.append("',\n");
        }
        if (this.f99414a != null) {
            sb2.append("direction:'");
            sb2.append(this.f99414a.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.f99415b != null) {
            sb2.append("side:'");
            sb2.append(this.f99415b.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99422i)) {
            sb2.append("scale:'");
            sb2.append(this.f99422i);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99423j)) {
            sb2.append("threshold:'");
            sb2.append(this.f99423j);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99420g)) {
            sb2.append("maxVelocity:'");
            sb2.append(this.f99420g);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99421h)) {
            sb2.append("maxAccel:'");
            sb2.append(this.f99421h);
            sb2.append("',\n");
        }
        if (this.f99417d != null) {
            sb2.append("limitBounds:'");
            sb2.append(this.f99417d);
            sb2.append("',\n");
        }
        if (this.f99429p != null) {
            sb2.append("mode:'");
            sb2.append(this.f99429p.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.f99418e != null) {
            sb2.append("touchUp:'");
            sb2.append(this.f99418e.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99425l)) {
            sb2.append("springMass:'");
            sb2.append(this.f99425l);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99426m)) {
            sb2.append("springStiffness:'");
            sb2.append(this.f99426m);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99424k)) {
            sb2.append("springDamping:'");
            sb2.append(this.f99424k);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f99427n)) {
            sb2.append("stopThreshold:'");
            sb2.append(this.f99427n);
            sb2.append("',\n");
        }
        if (this.f99428o != null) {
            sb2.append("springBoundary:'");
            sb2.append(this.f99428o);
            sb2.append("',\n");
        }
        if (this.f99419f != null) {
            sb2.append("around:'");
            sb2.append(this.f99419f);
            sb2.append("',\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public r u(String str) {
        this.f99417d = str;
        return this;
    }

    public r v(int i10) {
        this.f99421h = i10;
        return this;
    }

    public r w(int i10) {
        this.f99420g = i10;
        return this;
    }

    public r x(e eVar) {
        this.f99418e = eVar;
        return this;
    }

    public r y(String str) {
        this.f99419f = str;
        return this;
    }

    public r z(a aVar) {
        this.f99428o = aVar;
        return this;
    }

    public r(String str, d dVar, b bVar) {
        this.f99417d = null;
        this.f99418e = null;
        this.f99419f = null;
        this.f99420g = Float.NaN;
        this.f99421h = Float.NaN;
        this.f99422i = Float.NaN;
        this.f99423j = Float.NaN;
        this.f99424k = Float.NaN;
        this.f99425l = Float.NaN;
        this.f99426m = Float.NaN;
        this.f99427n = Float.NaN;
        this.f99428o = null;
        this.f99429p = null;
        this.f99416c = str;
        this.f99415b = dVar;
        this.f99414a = bVar;
    }
}
