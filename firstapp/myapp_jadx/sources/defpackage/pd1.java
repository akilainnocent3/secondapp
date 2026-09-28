package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class pd1 implements uby<ktb.e.d.c> {
    public static final pd1 a = new pd1();
    public static final hjh b = hjh.a("batteryLevel");
    public static final hjh c = hjh.a("batteryVelocity");
    public static final hjh d = hjh.a("proximityOn");
    public static final hjh e = hjh.a("orientation");
    public static final hjh f = hjh.a("ramUsed");
    public static final hjh g = hjh.a("diskUsed");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.c cVar = (ktb.e.d.c) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, cVar.a());
        vbyVar2.e(c, cVar.b());
        vbyVar2.d(d, cVar.f());
        vbyVar2.e(e, cVar.d());
        vbyVar2.g(f, cVar.e());
        vbyVar2.g(g, cVar.c());
    }
}
