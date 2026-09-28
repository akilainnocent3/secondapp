package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ye1 implements uby<uu50> {
    public static final ye1 a = new ye1();
    public static final hjh b = hjh.a("rolloutId");
    public static final hjh c = hjh.a("variantId");
    public static final hjh d = hjh.a("parameterKey");
    public static final hjh e = hjh.a("parameterValue");
    public static final hjh f = hjh.a("templateVersion");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        uu50 uu50Var = (uu50) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, uu50Var.c());
        vbyVar2.a(c, uu50Var.e());
        vbyVar2.a(d, uu50Var.a());
        vbyVar2.a(e, uu50Var.b());
        vbyVar2.g(f, uu50Var.d());
    }
}
