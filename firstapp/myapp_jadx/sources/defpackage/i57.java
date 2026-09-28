package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li57;", "Lj8i0;", "password-entry"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i57 extends j8i0 {
    public final lyz a;
    public final psm b;
    public final evz c;
    public final wwd0 d;
    public final v340 e;
    public final ku90<xuz> f;
    public final ku90 i;
    public final String v;
    public g57 w;

    public i57(lyz lyzVar, psm psmVar, vu60 vu60Var) {
        lyzVar.getClass();
        psmVar.getClass();
        vu60Var.getClass();
        this.a = lyzVar;
        this.b = psmVar;
        this.c = new evz();
        wwd0 wwd0VarA = xwd0.a(new tvz(null, null, 255));
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        ku90<xuz> ku90Var = new ku90<>();
        this.f = ku90Var;
        this.i = ku90Var;
        String str = (String) vu60Var.b("token");
        this.v = str == null ? "" : str;
    }
}
