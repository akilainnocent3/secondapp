package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class gf1 implements uby<fg80> {
    public static final gf1 a = new gf1();
    public static final hjh b = hjh.a("eventType");
    public static final hjh c = hjh.a("sessionData");
    public static final hjh d = hjh.a("applicationInfo");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        fg80 fg80Var = (fg80) obj;
        vby vbyVar2 = vbyVar;
        fg80Var.getClass();
        vbyVar2.a(b, nrg.SESSION_START);
        vbyVar2.a(c, fg80Var.a);
        vbyVar2.a(d, fg80Var.b);
    }
}
