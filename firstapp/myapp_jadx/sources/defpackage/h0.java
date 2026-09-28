package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements r8i0.c {
    @Override // r8i0.c
    public final <T extends j8i0> T c(Class<T> cls) {
        if (cls.isAssignableFrom(g0.class)) {
            return new g0((nih) fnd.c.getValue(), (qc80) fnd.d.getValue(), (fc80) fnd.e.getValue());
        }
        hb5.a("Unknown ViewModel class");
        return null;
    }
}
