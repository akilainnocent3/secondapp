package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class goc0 {
    public final wwd0 a = xwd0.a("");
    public final wwd0 b = xwd0.a(new xnc0((enc0) null, (enc0) null, 7));
    public final wwd0 c;
    public final wwd0 d;
    public final wwd0 e;

    public goc0() {
        n1a0 n1a0Var = n1a0.c;
        this.c = xwd0.a(n1a0Var);
        this.d = xwd0.a(n1a0Var);
        this.e = xwd0.a(new jqc0(0));
    }

    public static enc0 a(enc0 enc0Var, ArrayList arrayList) {
        Object obj;
        if (enc0Var.c.length() <= 0) {
            int size = arrayList.size();
            int i = 0;
            do {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
            } while (!((enc0) obj).a.equals(enc0Var.a));
            enc0 enc0Var2 = (enc0) obj;
            if (enc0Var2 != null) {
                return enc0Var2;
            }
        }
        return enc0Var;
    }

    public final v340 b() {
        return e1i.b(this.b);
    }

    public final v340 c() {
        return e1i.b(this.e);
    }

    public final void d(String str) {
        wwd0 wwd0Var = this.a;
        wwd0Var.getClass();
        wwd0Var.k(null, str);
    }

    public final void e(xnc0 xnc0Var) {
        wwd0 wwd0Var = this.b;
        wwd0Var.getClass();
        wwd0Var.k(null, xnc0Var);
    }

    public final void f(jqc0 jqc0Var) {
        wwd0 wwd0Var = this.e;
        wwd0Var.getClass();
        wwd0Var.k(null, jqc0Var);
    }
}
