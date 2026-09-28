package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.time.b;
import kotlin.time.h;
import kotlin.time.i;

/* JADX INFO: loaded from: classes8.dex */
public final class qn70 {
    public final cb30 a;
    public final String b;
    public final boolean c;
    public final z8h0 d;
    public final krp e;
    public final ArrayList<qn70> f;
    public ThreadLocal<gx0<wrz>> g;

    public qn70(cb30 cb30Var, String str, z8h0 z8h0Var, krp krpVar, int i) {
        boolean z = (i & 4) == 0;
        z8h0Var = (i & 8) != 0 ? null : z8h0Var;
        cb30Var.getClass();
        this.a = cb30Var;
        this.b = str;
        this.c = z;
        this.d = z8h0Var;
        this.e = krpVar;
        this.f = new ArrayList<>();
        new LinkedHashSet();
    }

    public final Object a(dq7 dq7Var, wrz wrzVar, cb30 cb30Var) {
        String str;
        krp krpVar = this.e;
        b21 b21Var = krpVar.a;
        v6s v6sVar = v6s.a;
        if (((v6s) b21Var.b).compareTo(v6sVar) > 0) {
            return c(dq7Var, wrzVar, cb30Var);
        }
        if (cb30Var != null) {
            str = " with qualifier '" + cb30Var + '\'';
        } else {
            str = "";
        }
        String strA = this.c ? "" : j26.a(new StringBuilder(" - scope:'"), this.b, '\'');
        krpVar.a.e(v6sVar, "|- '" + zgp.a(dq7Var) + '\'' + str + strA + "...");
        i.a.a.getClass();
        h.a.getClass();
        oxf0 oxf0Var = new oxf0(c(dq7Var, wrzVar, cb30Var), i.a.C0776a.b(h.b()), null);
        b21 b21Var2 = krpVar.a;
        StringBuilder sb = new StringBuilder("|- '");
        sb.append(zgp.a(dq7Var));
        sb.append("' in ");
        b.a aVar = b.b;
        sb.append(b.j(oxf0Var.b, rgf.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        b21Var2.e(v6sVar, sb.toString());
        return oxf0Var.a;
    }

    public final <T> T b(uf50 uf50Var) throws dvx {
        String str;
        g3b g3bVar = this.e.b;
        g3bVar.getClass();
        T t = (T) g3bVar.a(this, uf50Var, true);
        if (t != null) {
            return t;
        }
        cb30 cb30Var = uf50Var.d;
        if (cb30Var != null) {
            str = " and qualifier '" + cb30Var + '\'';
        } else {
            str = "";
        }
        throw new dvx("No definition found for type '" + zgp.a(uf50Var.c) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!");
    }

    public final Object c(dq7 dq7Var, wrz wrzVar, cb30 cb30Var) {
        gx0<wrz> gx0Var;
        krp krpVar = this.e;
        uf50 uf50Var = new uf50(krpVar.a, this, dq7Var, cb30Var, wrzVar);
        if (wrzVar == null) {
            return b(uf50Var);
        }
        b21 b21Var = krpVar.a;
        v6s v6sVar = v6s.a;
        if (((v6s) b21Var.b).compareTo(v6sVar) <= 0) {
            b21Var.e(v6sVar, "| >> parameters " + wrzVar);
        }
        ThreadLocal<gx0<wrz>> threadLocal = this.g;
        if (threadLocal == null || (gx0Var = threadLocal.get()) == null) {
            gx0Var = new gx0<>();
            ThreadLocal<gx0<wrz>> threadLocal2 = new ThreadLocal<>();
            this.g = threadLocal2;
            threadLocal2.set(gx0Var);
        }
        gx0Var.addFirst(wrzVar);
        try {
            Object objB = b(uf50Var);
            krpVar.a.getClass();
            return objB;
        } finally {
            b21 b21Var2 = krpVar.a;
            b21Var2.getClass();
            b21Var2.f(v6s.a, "| << parameters");
            if (!gx0Var.isEmpty()) {
                gx0Var.removeFirst();
            }
            if (gx0Var.isEmpty()) {
                ThreadLocal<gx0<wrz>> threadLocal3 = this.g;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.g = null;
            }
        }
    }

    public final String toString() {
        return uf80.a(new StringBuilder("['"), this.b, "']");
    }
}
