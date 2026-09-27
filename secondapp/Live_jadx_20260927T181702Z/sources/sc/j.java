package sc;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.r f129871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f129872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f129873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k.b f129874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f129875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k.b f129876f;

    public j() {
        this.f129871a = null;
        this.f129872b = null;
        this.f129873c = null;
        this.f129874d = null;
        this.f129875e = null;
        this.f129876f = null;
    }

    public static j a() {
        return new j();
    }

    public j b(String str) {
        this.f129871a = new c(c.u.RenderOptions).d(str);
        return this;
    }

    public boolean c() {
        c.r rVar = this.f129871a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean d() {
        return this.f129872b != null;
    }

    public boolean e() {
        return this.f129873c != null;
    }

    public boolean f() {
        return this.f129875e != null;
    }

    public boolean g() {
        return this.f129874d != null;
    }

    public boolean h() {
        return this.f129876f != null;
    }

    public j i(h hVar) {
        this.f129872b = hVar;
        return this;
    }

    public j j(String str) {
        this.f129873c = str;
        return this;
    }

    public j k(String str) {
        this.f129875e = str;
        return this;
    }

    public j l(float f10, float f11, float f12, float f13) {
        this.f129874d = new k.b(f10, f11, f12, f13);
        return this;
    }

    public j m(float f10, float f11, float f12, float f13) {
        this.f129876f = new k.b(f10, f11, f12, f13);
        return this;
    }

    public j(j jVar) {
        this.f129871a = null;
        this.f129872b = null;
        this.f129873c = null;
        this.f129874d = null;
        this.f129875e = null;
        this.f129876f = null;
        if (jVar == null) {
            return;
        }
        this.f129871a = jVar.f129871a;
        this.f129872b = jVar.f129872b;
        this.f129874d = jVar.f129874d;
        this.f129875e = jVar.f129875e;
        this.f129876f = jVar.f129876f;
    }
}
