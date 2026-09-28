package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class kd1 implements uby<ktb.e.d.a.b.AbstractC0787b> {
    public static final kd1 a = new kd1();
    public static final hjh b = hjh.a("type");
    public static final hjh c = hjh.a("reason");
    public static final hjh d = hjh.a("frames");
    public static final hjh e = hjh.a("causedBy");
    public static final hjh f = hjh.a("overflowCount");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.a.b.AbstractC0787b abstractC0787b = (ktb.e.d.a.b.AbstractC0787b) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, abstractC0787b.e());
        vbyVar2.a(c, abstractC0787b.d());
        vbyVar2.a(d, abstractC0787b.b());
        vbyVar2.a(e, abstractC0787b.a());
        vbyVar2.e(f, abstractC0787b.c());
    }
}
