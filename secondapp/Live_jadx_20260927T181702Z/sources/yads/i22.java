package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f150392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f150394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d12 f150395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t22 f150396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q22 f150397f;

    public /* synthetic */ i22(d4 d4Var, String str, v9 v9Var, d12 d12Var, t22 t22Var) {
        this(d4Var, str, v9Var, d12Var, t22Var, null);
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f150396e.a(this.f150394c, this.f150392a, this.f150395d);
        q22 q22Var = this.f150397f;
        if (q22Var != null) {
            fo2VarA.b(q22Var.f154240b, "bind_type");
        }
        fo2VarA.a(this.f150393b, "native_ad_type");
        a03 a03Var = this.f150392a.f148056d.f147002a;
        if (a03Var != null) {
            fo2VarA.b(a03Var.b().f159117b, "size_type");
            fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        fo2VarA.f149197b = this.f150394c.f156830i;
        return fo2VarA;
    }

    public i22(d4 d4Var, String str, v9 v9Var, d12 d12Var, t22 t22Var, q22 q22Var) {
        this.f150392a = d4Var;
        this.f150393b = str;
        this.f150394c = v9Var;
        this.f150395d = d12Var;
        this.f150396e = t22Var;
        this.f150397f = q22Var;
    }
}
