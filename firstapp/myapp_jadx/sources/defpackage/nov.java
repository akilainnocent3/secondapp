package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nov<T> implements bn70<T> {
    public final xnv a;
    public final bgh0<?, ?> b;
    public final boolean c;
    public final t3h<?> d;

    public nov(bgh0<?, ?> bgh0Var, t3h<?> t3hVar, xnv xnvVar) {
        this.b = bgh0Var;
        this.c = t3hVar.e(xnvVar);
        this.d = t3hVar;
        this.a = xnvVar;
    }

    @Override // defpackage.bn70
    public final int a(c4 c4Var) {
        bgh0<?, ?> bgh0Var = this.b;
        int i = bgh0Var.i(bgh0Var.g(c4Var));
        if (this.c) {
            q1a0 q1a0Var = this.d.c(c4Var).a;
            if (q1a0Var.a.size() > 0) {
                mjh.d(q1a0Var.d(0));
                throw null;
            }
            Iterator<T> it = q1a0Var.e().iterator();
            if (it.hasNext()) {
                mjh.d((Map.Entry) it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.bn70
    public final boolean b(m1k m1kVar, m1k m1kVar2) {
        bgh0<?, ?> bgh0Var = this.b;
        if (!bgh0Var.g(m1kVar).equals(bgh0Var.g(m1kVar2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        t3h<?> t3hVar = this.d;
        return t3hVar.c(m1kVar).equals(t3hVar.c(m1kVar2));
    }

    @Override // defpackage.bn70
    public final void c(Object obj, p08 p08Var, q3h q3hVar) {
        bgh0<?, ?> bgh0Var = this.b;
        dgh0 dgh0VarF = bgh0Var.f(obj);
        t3h<?> t3hVar = this.d;
        mjh<T> mjhVarD = t3hVar.d(obj);
        while (p08Var.a() != Integer.MAX_VALUE) {
            try {
                nov<T> novVar = this;
                p08 p08Var2 = p08Var;
                q3h q3hVar2 = q3hVar;
                if (!novVar.f(p08Var2, q3hVar2, t3hVar, mjhVarD, bgh0Var, dgh0VarF)) {
                    return;
                }
                this = novVar;
                p08Var = p08Var2;
                q3hVar = q3hVar2;
            } finally {
                bgh0Var.n(obj, dgh0VarF);
            }
        }
    }

    @Override // defpackage.bn70
    public final int d(m1k m1kVar) {
        int iHashCode = this.b.g(m1kVar).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.c(m1kVar).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.bn70
    public final void e(T t, z7k0 z7k0Var) {
        Iterator itG = this.d.c(t).g();
        if (itG.hasNext()) {
            ((mjh.a) ((Map.Entry) itG.next()).getKey()).getLiteJavaType();
            throw null;
        }
        bgh0<?, ?> bgh0Var = this.b;
        bgh0Var.q(bgh0Var.g(t), z7k0Var);
    }

    public final boolean f(p08 p08Var, q3h q3hVar, t3h t3hVar, mjh mjhVar, bgh0 bgh0Var, Object obj) throws e0p {
        int i = p08Var.b;
        xnv xnvVar = this.a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return p08Var.x();
            }
            m1k.e eVarB = t3hVar.b(q3hVar, xnvVar, i >>> 3);
            if (eVarB == null) {
                return bgh0Var.l(0, p08Var, obj);
            }
            t3hVar.h(eVarB);
            throw null;
        }
        m1k.e eVarB2 = null;
        pl5 pl5VarE = null;
        int iV = 0;
        while (p08Var.a() != Integer.MAX_VALUE) {
            int i2 = p08Var.b;
            if (i2 == 16) {
                p08Var.w(0);
                iV = p08Var.a.v();
                eVarB2 = t3hVar.b(q3hVar, xnvVar, iV);
            } else if (i2 == 26) {
                if (eVarB2 != null) {
                    t3hVar.h(eVarB2);
                    throw null;
                }
                pl5VarE = p08Var.e();
            } else if (!p08Var.x()) {
                break;
            }
        }
        if (p08Var.b != 12) {
            throw new e0p("Protocol message end-group tag did not match expected tag.");
        }
        if (pl5VarE == null) {
            return true;
        }
        if (eVarB2 == null) {
            bgh0Var.d(obj, iV, pl5VarE);
            return true;
        }
        t3hVar.i(eVarB2);
        throw null;
    }

    @Override // defpackage.bn70
    public final boolean isInitialized(T t) {
        this.d.c(t).e();
        return true;
    }

    @Override // defpackage.bn70
    public final void makeImmutable(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // defpackage.bn70
    public final void mergeFrom(T t, T t2) {
        Class<?> cls = on70.a;
        bgh0<?, ?> bgh0Var = this.b;
        bgh0Var.o(t, bgh0Var.k(bgh0Var.g(t), bgh0Var.g(t2)));
        if (this.c) {
            on70.k(this.d, t, t2);
        }
    }

    @Override // defpackage.bn70
    public final T newInstance() {
        xnv xnvVar = this.a;
        return xnvVar instanceof m1k ? (T) ((m1k) xnvVar).k() : (T) xnvVar.newBuilderForType().c();
    }
}
