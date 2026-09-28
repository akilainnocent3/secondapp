package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class h8e0 implements snh0.b<g8e0, i8e0, h8e0> {
    public final ftw a;

    public h8e0(ftw ftwVar) {
        this.a = ftwVar;
        wg1 wg1Var = h5f0.w;
        Class cls = (Class) ftwVar.b(wg1Var, null);
        if (cls != null && !cls.equals(g8e0.class)) {
            nrh0.a(this, "Invalid target class configuration for ", ": ", cls);
            throw null;
        }
        ftwVar.Y(snh0.I, tnh0.b.e);
        ftwVar.Y(wg1Var, g8e0.class);
        wg1 wg1Var2 = h5f0.v;
        if (ftwVar.b(wg1Var2, null) == null) {
            ftwVar.Y(wg1Var2, g8e0.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // defpackage.v1h
    public final csw a() {
        return this.a;
    }

    @Override // snh0.b
    public final snh0 d() {
        return new i8e0(w2z.U(this.a));
    }
}
