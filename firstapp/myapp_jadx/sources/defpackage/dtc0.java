package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dtc0 implements r8i0.c {
    public final xtc0 a;
    public final String b;

    public dtc0(xtc0 xtc0Var, String str) {
        str.getClass();
        this.a = xtc0Var;
        this.b = str;
    }

    @Override // r8i0.c
    public final <T extends j8i0> T c(Class<T> cls) {
        if (cls.isAssignableFrom(ctc0.class)) {
            return new ctc0(this.a, this.b);
        }
        hb5.a("Unknown ViewModel class");
        return null;
    }
}
