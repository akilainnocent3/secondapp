package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rug0<T> implements lug0<T> {
    public final ml1 a;
    public final String b;
    public final j4g c;
    public final xsg0<T, byte[]> d;
    public final dvg0 e;

    public rug0(ml1 ml1Var, String str, j4g j4gVar, xsg0 xsg0Var, dvg0 dvg0Var) {
        this.a = ml1Var;
        this.b = str;
        this.c = j4gVar;
        this.d = xsg0Var;
        this.e = dvg0Var;
    }

    public final void a(ei1 ei1Var, fvg0 fvg0Var) {
        String str = this.b;
        if (str == null) {
            bmy.a("Null transportName");
            return;
        }
        xsg0<T, byte[]> xsg0Var = this.d;
        if (xsg0Var == null) {
            bmy.a("Null transformer");
            return;
        }
        ok1 ok1Var = new ok1(this.a, str, ei1Var, xsg0Var, this.c);
        dvg0 dvg0Var = this.e;
        pm70 pm70Var = dvg0Var.c;
        ml1 ml1Var = ok1Var.a;
        ei1 ei1Var2 = ok1Var.c;
        ml1 ml1VarD = ml1Var.d(ei1Var2.b);
        fi1.a aVar = new fi1.a();
        aVar.f = new HashMap();
        aVar.d = Long.valueOf(dvg0Var.a.b());
        aVar.e = Long.valueOf(dvg0Var.b.b());
        String str2 = ok1Var.b;
        if (str2 == null) {
            bmy.a("Null transportName");
            return;
        }
        aVar.a = str2;
        aVar.c = new d4g(ok1Var.e, ok1Var.d.apply(ei1Var2.a));
        ei1Var2.getClass();
        aVar.b = null;
        ck1 ck1Var = ei1Var2.c;
        if (ck1Var != null && ck1Var.a() != null) {
            aVar.g = ei1Var2.c.a();
        }
        ei1Var2.getClass();
        pm70Var.a(ml1VarD, aVar.b(), fvg0Var);
    }
}
