package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g51 implements uby<jmx> {
    public static final g51 a = new g51();
    public static final hjh b = hjh.a("networkType");
    public static final hjh c = hjh.a("mobileSubtype");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        jmx jmxVar = (jmx) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, jmxVar.b());
        vbyVar2.a(c, jmxVar.a());
    }
}
