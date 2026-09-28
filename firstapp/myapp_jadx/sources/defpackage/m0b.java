package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface m0b {
    static m0b current() {
        m0b m0bVarCurrent = w0s.b.current();
        return m0bVarCurrent != null ? m0bVarCurrent : bx0.b;
    }

    bx0 a(nbd nbdVar, Object obj);

    <V> V b(nbd nbdVar);

    default m0b c(oqa0 oqa0Var) {
        return oqa0Var.d(this);
    }

    default rn70 d() {
        return w0s.b.d(this);
    }
}
