package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class fd1 implements uby<ktb.e.c> {
    public static final fd1 a = new fd1();
    public static final hjh b = hjh.a("arch");
    public static final hjh c = hjh.a("model");
    public static final hjh d = hjh.a("cores");
    public static final hjh e = hjh.a("ram");
    public static final hjh f = hjh.a("diskSpace");
    public static final hjh g = hjh.a("simulator");
    public static final hjh h = hjh.a("state");
    public static final hjh i = hjh.a("manufacturer");
    public static final hjh j = hjh.a("modelClass");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.c cVar = (ktb.e.c) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.e(b, cVar.a());
        vbyVar2.a(c, cVar.e());
        vbyVar2.e(d, cVar.b());
        vbyVar2.g(e, cVar.g());
        vbyVar2.g(f, cVar.c());
        vbyVar2.d(g, cVar.i());
        vbyVar2.e(h, cVar.h());
        vbyVar2.a(i, cVar.d());
        vbyVar2.a(j, cVar.f());
    }
}
