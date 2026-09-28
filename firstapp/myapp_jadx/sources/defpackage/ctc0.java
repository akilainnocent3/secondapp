package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ctc0 extends j8i0 {
    public final xtc0 a;
    public final wwd0 b;
    public final v340 c;
    public final wwd0 d;
    public final v340 e;
    public final b390 f;
    public final t340 i;
    public String v;
    public boolean w;

    public ctc0(xtc0 xtc0Var, String str) {
        str.getClass();
        this.a = xtc0Var;
        wwd0 wwd0VarA = xwd0.a(jce0.b.a);
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(fzs.a.a);
        this.d = wwd0VarA2;
        this.e = e1i.b(wwd0VarA2);
        b390 b390VarB = d390.b(0, 10, pb5.b, 1);
        this.f = b390VarB;
        this.i = e1i.a(b390VarB);
        this.v = "";
        this.w = true;
        xtc0Var.b(o8i0.d(this), str, "", new btc0(this, ""));
    }

    public final void x1(dsc0 dsc0Var) {
        boolean z = dsc0Var instanceof dsc0.a;
        b390 b390Var = this.f;
        if (z) {
            b390Var.a(atc0.a.a);
            return;
        }
        if (dsc0Var instanceof dsc0.b) {
            b390Var.a(atc0.b.a);
            return;
        }
        if (!(dsc0Var instanceof dsc0.c)) {
            uhc.a();
            return;
        }
        dsc0.c cVar = (dsc0.c) dsc0Var;
        String str = cVar.a;
        String str2 = cVar.b;
        if (str2 == null) {
            str2 = "";
        }
        b390Var.a(new atc0.c(str, str2));
    }
}
