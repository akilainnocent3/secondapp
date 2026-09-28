package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f51 implements uby<vft> {
    public static final f51 a = new f51();
    public static final hjh b = hjh.a("requestTimeMs");
    public static final hjh c = hjh.a("requestUptimeMs");
    public static final hjh d = hjh.a("clientInfo");
    public static final hjh e = hjh.a("logSource");
    public static final hjh f = hjh.a("logSourceName");
    public static final hjh g = hjh.a("logEvent");
    public static final hjh h = hjh.a("qosTier");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        vft vftVar = (vft) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.g(b, vftVar.f());
        vbyVar2.g(c, vftVar.g());
        vbyVar2.a(d, vftVar.a());
        vbyVar2.a(e, vftVar.c());
        vbyVar2.a(f, vftVar.d());
        vbyVar2.a(g, vftVar.b());
        vbyVar2.a(h, vftVar.e());
    }
}
