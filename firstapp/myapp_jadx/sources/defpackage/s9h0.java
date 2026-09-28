package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s9h0 {
    public final twd0<Object> a;
    public final s9h0 b;
    public final Object c;

    public s9h0(twd0<? extends Object> twd0Var, s9h0 s9h0Var) {
        this.a = twd0Var;
        this.b = s9h0Var;
        this.c = twd0Var.getValue();
    }

    public final boolean a() {
        if (this.a.getValue() != this.c) {
            return true;
        }
        s9h0 s9h0Var = this.b;
        return s9h0Var != null && s9h0Var.a();
    }
}
