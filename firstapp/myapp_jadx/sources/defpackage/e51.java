package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e51 implements uby<gft> {
    public static final e51 a = new e51();
    public static final hjh b = hjh.a("eventTimeMs");
    public static final hjh c = hjh.a("eventCode");
    public static final hjh d = hjh.a("complianceData");
    public static final hjh e = hjh.a("eventUptimeMs");
    public static final hjh f = hjh.a("sourceExtension");
    public static final hjh g = hjh.a("sourceExtensionJsonProto3");
    public static final hjh h = hjh.a("timezoneOffsetSeconds");
    public static final hjh i = hjh.a("networkConnectionInfo");
    public static final hjh j = hjh.a("experimentIds");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        gft gftVar = (gft) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.g(b, gftVar.c());
        vbyVar2.a(c, gftVar.b());
        vbyVar2.a(d, gftVar.a());
        vbyVar2.g(e, gftVar.d());
        vbyVar2.a(f, gftVar.g());
        vbyVar2.a(g, gftVar.h());
        vbyVar2.g(h, gftVar.i());
        vbyVar2.a(i, gftVar.f());
        vbyVar2.a(j, gftVar.e());
    }
}
