package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dd1 implements uby<ktb.e.a> {
    public static final dd1 a = new dd1();
    public static final hjh b = hjh.a("identifier");
    public static final hjh c = hjh.a("version");
    public static final hjh d = hjh.a("displayVersion");
    public static final hjh e = hjh.a("organization");
    public static final hjh f = hjh.a("installationUuid");
    public static final hjh g = hjh.a("developmentPlatform");
    public static final hjh h = hjh.a("developmentPlatformVersion");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.a aVar = (ktb.e.a) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, aVar.d());
        vbyVar2.a(c, aVar.g());
        vbyVar2.a(d, aVar.c());
        vbyVar2.a(e, aVar.f());
        vbyVar2.a(f, aVar.e());
        vbyVar2.a(g, aVar.a());
        vbyVar2.a(h, aVar.b());
    }
}
