package j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f99472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f99473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f99474g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f99468a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99469b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99470c = 400;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f99471d = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f99475h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f99476i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f99477j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f99478k = 400;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f99479l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f99480m = new m();

    public t(String str, String str2) {
        this.f99472e = null;
        this.f99473f = null;
        this.f99474g = null;
        this.f99472e = "default";
        this.f99474g = str;
        this.f99473f = str2;
    }

    public String a() {
        return this.f99472e;
    }

    public void b(int i10) {
        this.f99478k = i10;
    }

    public void c(String str) {
        this.f99474g = str;
    }

    public void d(String str) {
        this.f99472e = str;
    }

    public void e(p pVar) {
        this.f99480m.a(pVar);
    }

    public void f(r rVar) {
        this.f99468a = rVar;
    }

    public void g(float f10) {
        this.f99479l = f10;
    }

    public void h(String str) {
        this.f99473f = str;
    }

    public String i() {
        return toString();
    }

    public String toString() {
        String str = this.f99472e + ":{\nfrom:'" + this.f99474g + "',\nto:'" + this.f99473f + "',\n";
        if (this.f99478k != 400) {
            str = str + "duration:" + this.f99478k + ",\n";
        }
        if (this.f99479l != 0.0f) {
            str = str + "stagger:" + this.f99479l + ",\n";
        }
        if (this.f99468a != null) {
            str = str + this.f99468a.toString();
        }
        return (str + this.f99480m.toString()) + "},\n";
    }

    public t(String str, String str2, String str3) {
        this.f99472e = null;
        this.f99473f = null;
        this.f99474g = null;
        this.f99472e = str;
        this.f99474g = str2;
        this.f99473f = str3;
    }
}
