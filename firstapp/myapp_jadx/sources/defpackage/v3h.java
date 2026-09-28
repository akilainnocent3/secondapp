package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v3h extends t3h<m1k.d> {
    @Override // defpackage.t3h
    public final void a(Map.Entry entry) {
        ((m1k.d) entry.getKey()).getClass();
    }

    @Override // defpackage.t3h
    public final m1k.e b(q3h q3hVar, xnv xnvVar, int i) {
        return q3hVar.a.get(new q3h.a(i, xnvVar));
    }

    @Override // defpackage.t3h
    public final mjh<m1k.d> c(Object obj) {
        return ((m1k.c) obj).extensions;
    }

    @Override // defpackage.t3h
    public final mjh<m1k.d> d(Object obj) {
        m1k.c cVar = (m1k.c) obj;
        mjh<m1k.d> mjhVar = cVar.extensions;
        if (!mjhVar.b) {
            return mjhVar;
        }
        mjh mjhVarClone = mjhVar.clone();
        cVar.extensions = mjhVarClone;
        return mjhVarClone;
    }

    @Override // defpackage.t3h
    public final boolean e(xnv xnvVar) {
        return xnvVar instanceof m1k.c;
    }

    @Override // defpackage.t3h
    public final void f(Object obj) {
        ((m1k.c) obj).extensions.h();
    }

    @Override // defpackage.t3h
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.t3h
    public final void h(Object obj) {
        throw null;
    }

    @Override // defpackage.t3h
    public final void i(Object obj) {
        throw null;
    }

    @Override // defpackage.t3h
    public final void j(Map.Entry entry) {
        ((m1k.d) entry.getKey()).getClass();
        throw null;
    }
}
