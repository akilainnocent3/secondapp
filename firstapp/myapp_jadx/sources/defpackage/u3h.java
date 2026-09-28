package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class u3h extends s3h<n1k.d> {
    @Override // defpackage.s3h
    public final void a(Map.Entry entry) {
        ((n1k.d) entry.getKey()).getClass();
    }

    @Override // defpackage.s3h
    public final n1k.e b(r3h r3hVar, wnv wnvVar, int i) {
        return r3hVar.a.get(new r3h.a(wnvVar, i));
    }

    @Override // defpackage.s3h
    public final njh<n1k.d> c(Object obj) {
        return ((n1k.c) obj).extensions;
    }

    @Override // defpackage.s3h
    public final njh<n1k.d> d(Object obj) {
        n1k.c cVar = (n1k.c) obj;
        njh<n1k.d> njhVar = cVar.extensions;
        if (!njhVar.b) {
            return njhVar;
        }
        njh njhVarClone = njhVar.clone();
        cVar.extensions = njhVarClone;
        return njhVarClone;
    }

    @Override // defpackage.s3h
    public final boolean e(wnv wnvVar) {
        return wnvVar instanceof n1k.c;
    }

    @Override // defpackage.s3h
    public final void f(Object obj) {
        ((n1k.c) obj).extensions.g();
    }

    @Override // defpackage.s3h
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.s3h
    public final void h(Object obj) {
        throw null;
    }

    @Override // defpackage.s3h
    public final void i(Object obj) {
        throw null;
    }

    @Override // defpackage.s3h
    public final void j(Map.Entry entry) {
        ((n1k.d) entry.getKey()).getClass();
        throw null;
    }
}
