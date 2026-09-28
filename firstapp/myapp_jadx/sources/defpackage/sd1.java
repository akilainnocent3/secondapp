package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class sd1 implements uby<ktb.e.d.AbstractC0793e> {
    public static final sd1 a = new sd1();
    public static final hjh b = hjh.a("rolloutVariant");
    public static final hjh c = hjh.a("parameterKey");
    public static final hjh d = hjh.a("parameterValue");
    public static final hjh e = hjh.a("templateVersion");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.AbstractC0793e abstractC0793e = (ktb.e.d.AbstractC0793e) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, abstractC0793e.c());
        vbyVar2.a(c, abstractC0793e.a());
        vbyVar2.a(d, abstractC0793e.b());
        vbyVar2.g(e, abstractC0793e.d());
    }
}
