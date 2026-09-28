package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class hf1 implements uby<rg80> {
    public static final hf1 a = new hf1();
    public static final hjh b = hjh.a("sessionId");
    public static final hjh c = hjh.a("firstSessionId");
    public static final hjh d = hjh.a("sessionIndex");
    public static final hjh e = hjh.a("eventTimestampUs");
    public static final hjh f = hjh.a("dataCollectionStatus");
    public static final hjh g = hjh.a("firebaseInstallationId");
    public static final hjh h = hjh.a("firebaseAuthenticationToken");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        rg80 rg80Var = (rg80) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, rg80Var.a);
        vbyVar2.a(c, rg80Var.b);
        vbyVar2.e(d, rg80Var.c);
        vbyVar2.g(e, rg80Var.d);
        vbyVar2.a(f, rg80Var.e);
        vbyVar2.a(g, rg80Var.f);
        vbyVar2.a(h, rg80Var.g);
    }
}
