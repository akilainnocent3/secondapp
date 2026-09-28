package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class id1 implements uby<ktb.e.d.a.b.AbstractC0786a> {
    public static final id1 a = new id1();
    public static final hjh b = hjh.a("baseAddress");
    public static final hjh c = hjh.a("size");
    public static final hjh d = hjh.a("name");
    public static final hjh e = hjh.a("uuid");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.a.b.AbstractC0786a abstractC0786a = (ktb.e.d.a.b.AbstractC0786a) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.g(b, abstractC0786a.a());
        vbyVar2.g(c, abstractC0786a.c());
        vbyVar2.a(d, abstractC0786a.b());
        String strD = abstractC0786a.d();
        vbyVar2.a(e, strD != null ? strD.getBytes(ktb.a) : null);
    }
}
