package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u6j0 {
    public final ixa a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public final HashMap<String, gkc> p;

    public u6j0(u6j0 u6j0Var) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = 0;
        this.p = new HashMap<>();
        this.a = u6j0Var.a;
        this.b = u6j0Var.b;
        this.c = u6j0Var.c;
        a(u6j0Var);
    }

    public final void a(u6j0 u6j0Var) {
        if (u6j0Var == null) {
            return;
        }
        this.d = u6j0Var.d;
        this.e = u6j0Var.e;
        this.f = u6j0Var.f;
        this.g = u6j0Var.g;
        this.h = u6j0Var.h;
        this.i = u6j0Var.i;
        this.j = u6j0Var.j;
        this.k = u6j0Var.k;
        this.l = u6j0Var.l;
        this.m = u6j0Var.m;
        this.n = u6j0Var.n;
        this.o = u6j0Var.o;
        HashMap<String, gkc> map = this.p;
        map.clear();
        for (gkc gkcVar : u6j0Var.p.values()) {
            String str = gkcVar.a;
            gkc gkcVar2 = new gkc();
            gkcVar2.c = Integer.MIN_VALUE;
            gkcVar2.d = Float.NaN;
            gkcVar2.a = str;
            gkcVar2.b = gkcVar.b;
            gkcVar2.c = gkcVar.c;
            gkcVar2.d = gkcVar.d;
            map.put(str, gkcVar2);
        }
    }

    public u6j0(ixa ixaVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = 0;
        this.p = new HashMap<>();
        this.a = ixaVar;
    }

    public u6j0() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = 0;
        this.p = new HashMap<>();
    }
}
