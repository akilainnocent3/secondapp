package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class hd1 implements uby<ktb.e.d.a> {
    public static final hd1 a = new hd1();
    public static final hjh b = hjh.a("execution");
    public static final hjh c = hjh.a("customAttributes");
    public static final hjh d = hjh.a("internalKeys");
    public static final hjh e = hjh.a("background");
    public static final hjh f = hjh.a("currentProcessDetails");
    public static final hjh g = hjh.a("appProcessDetails");
    public static final hjh h = hjh.a("uiOrientation");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.a aVar = (ktb.e.d.a) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, aVar.e());
        vbyVar2.a(c, aVar.d());
        vbyVar2.a(d, aVar.f());
        vbyVar2.a(e, aVar.b());
        vbyVar2.a(f, aVar.c());
        vbyVar2.a(g, aVar.a());
        vbyVar2.e(h, aVar.g());
    }
}
