package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f148053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx f148054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb f148055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b03 f148056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g9 f148057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v42 f148058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qa3 f148059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f148060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f148061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f148062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qq1 f148063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f148064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f148065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f148066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f148067o;

    public /* synthetic */ d4(e00 e00Var) {
        this(e00Var, new qx(), new hb(), new b03());
    }

    public final e00 a() {
        return this.f148053a;
    }

    public final rd b() {
        return this.f148054b.f154649b;
    }

    public final jm0 c() {
        return this.f148054b.f154648a;
    }

    public final a03 d() {
        return this.f148056d.f147002a;
    }

    public final void e() {
        this.f148058f = v42.f156736c;
    }

    public final void a(g9 g9Var) {
        this.f148057e = g9Var;
    }

    public final void a(String str) {
        hb hbVar = this.f148055c;
        hbVar.getClass();
        if (str != null && !cv.p0.O3(str)) {
            String str2 = hbVar.f150038a;
            if (str2 != null && !kotlin.jvm.internal.m0.g(str2, str)) {
                lc1.c("Ad Unit Id can't be set twice.", new Object[0]);
                return;
            } else {
                hbVar.f150038a = str;
                return;
            }
        }
        lc1.c("Ad Unit Id can't be null or empty.", new Object[0]);
    }

    public d4(e00 e00Var, qx qxVar, hb hbVar, b03 b03Var) {
        this.f148053a = e00Var;
        this.f148054b = qxVar;
        this.f148055c = hbVar;
        this.f148056d = b03Var;
        this.f148065m = true;
        this.f148067o = x11.f157618b;
    }
}
