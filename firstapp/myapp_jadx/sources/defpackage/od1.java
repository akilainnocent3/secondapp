package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class od1 implements uby<ktb.e.d.a.c> {
    public static final od1 a = new od1();
    public static final hjh b = hjh.a("processName");
    public static final hjh c = hjh.a("pid");
    public static final hjh d = hjh.a("importance");
    public static final hjh e = hjh.a("defaultProcess");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.a.c cVar = (ktb.e.d.a.c) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, cVar.c());
        vbyVar2.e(c, cVar.b());
        vbyVar2.e(d, cVar.a());
        vbyVar2.d(e, cVar.d());
    }
}
