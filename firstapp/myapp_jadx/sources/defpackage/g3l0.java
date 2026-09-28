package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class g3l0 {
    public final g3l0 a;
    public final pqk0 b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public g3l0(g3l0 g3l0Var, pqk0 pqk0Var) {
        this.a = g3l0Var;
        this.b = pqk0Var;
    }

    public final ipk0 a(ipk0 ipk0Var) {
        return this.b.b(this, ipk0Var);
    }

    public final ipk0 b(pnk0 pnk0Var) {
        ipk0 ipk0VarB = ipk0.o;
        Iterator itI = pnk0Var.i();
        while (itI.hasNext()) {
            ipk0VarB = this.b.b(this, pnk0Var.k(((Integer) itI.next()).intValue()));
            if (ipk0VarB instanceof ynk0) {
                break;
            }
        }
        return ipk0VarB;
    }

    public final g3l0 c() {
        return new g3l0(this, this.b);
    }

    public final boolean d(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        g3l0 g3l0Var = this.a;
        if (g3l0Var != null) {
            return g3l0Var.d(str);
        }
        return false;
    }

    public final void e(String str, ipk0 ipk0Var) {
        g3l0 g3l0Var;
        HashMap map = this.c;
        if (!map.containsKey(str) && (g3l0Var = this.a) != null && g3l0Var.d(str)) {
            g3l0Var.e(str, ipk0Var);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (ipk0Var == null) {
                map.remove(str);
            } else {
                map.put(str, ipk0Var);
            }
        }
    }

    public final void f(String str, ipk0 ipk0Var) {
        if (this.d.containsKey(str)) {
            return;
        }
        HashMap map = this.c;
        if (ipk0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ipk0Var);
        }
    }

    public final ipk0 g(String str) {
        HashMap map = this.c;
        if (map.containsKey(str)) {
            return (ipk0) map.get(str);
        }
        g3l0 g3l0Var = this.a;
        if (g3l0Var != null) {
            return g3l0Var.g(str);
        }
        hb5.a(yk10.a(str, " is not defined"));
        return null;
    }
}
