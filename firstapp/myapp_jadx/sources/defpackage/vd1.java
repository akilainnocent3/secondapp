package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vd1 implements uby<ktb.e.AbstractC0794e> {
    public static final vd1 a = new vd1();
    public static final hjh b = hjh.a("platform");
    public static final hjh c = hjh.a("version");
    public static final hjh d = hjh.a("buildVersion");
    public static final hjh e = hjh.a("jailbroken");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.AbstractC0794e abstractC0794e = (ktb.e.AbstractC0794e) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.e(b, abstractC0794e.b());
        vbyVar2.a(c, abstractC0794e.c());
        vbyVar2.a(d, abstractC0794e.a());
        vbyVar2.d(e, abstractC0794e.d());
    }
}
