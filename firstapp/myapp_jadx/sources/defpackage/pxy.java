package defpackage;

import java.security.SecureRandom;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pxy extends j8i0 {
    public final kxy a;
    public final msx b;
    public final b5 c;
    public final wwd0 d;
    public final v340 e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;
    public final v340 w;
    public final wwd0 y;
    public final v340 z;

    public pxy(kxy kxyVar, msx msxVar, b5 b5Var) {
        kxyVar.getClass();
        msxVar.getClass();
        b5Var.getClass();
        this.a = kxyVar;
        this.b = msxVar;
        this.c = b5Var;
        wwd0 wwd0VarA = xwd0.a(0L);
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.f = wwd0VarA2;
        this.i = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.v = wwd0VarA3;
        this.w = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a("");
        this.y = wwd0VarA4;
        this.z = e1i.b(wwd0VarA4);
    }

    public final void x1() {
        int iIntValue;
        List list = (List) ga7.a.get(this.c.fetchCountry());
        SecureRandom secureRandom = new SecureRandom();
        if (list == null || list.size() < 2) {
            iIntValue = 20;
        } else {
            iIntValue = ((Number) list.get(0)).intValue() + secureRandom.nextInt(((Number) list.get(1)).intValue() - ((Number) list.get(0)).intValue());
        }
        Long lValueOf = Long.valueOf(iIntValue);
        wwd0 wwd0Var = this.d;
        wwd0Var.getClass();
        wwd0Var.k(null, lValueOf);
    }
}
