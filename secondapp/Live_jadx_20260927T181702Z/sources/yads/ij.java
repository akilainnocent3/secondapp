package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f150647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f150649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y9 f150650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i22 f150651e;

    public /* synthetic */ ij(o5 o5Var, e00 e00Var, String str) {
        this(e00Var, str, o5Var.a(), o5Var.b());
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f150650d.a();
        fo2VarA.b(this.f150647a.f148441b, "ad_type");
        fo2VarA.a(this.f150648b, "ad_id");
        fo2VarA.f149196a.putAll(this.f150649c.a());
        i22 i22Var = this.f150651e;
        return i22Var != null ? go2.a(fo2VarA, i22Var.a()) : fo2VarA;
    }

    public ij(e00 e00Var, String str, r2 r2Var, y9 y9Var) {
        this.f150647a = e00Var;
        this.f150648b = str;
        this.f150649c = r2Var;
        this.f150650d = y9Var;
    }
}
