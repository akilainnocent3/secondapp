package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zxx implements ltg0 {
    public final aug0 a;
    public final dbn b;

    public static final class a implements ltg0.a {
        @Override // ltg0.a
        public final ltg0 a(aug0 aug0Var, dbn dbnVar) {
            return new zxx(aug0Var, dbnVar);
        }
    }

    public zxx(aug0 aug0Var, dbn dbnVar) {
        this.a = aug0Var;
        this.b = dbnVar;
    }

    @Override // defpackage.ltg0
    public final void a() {
        dbn dbnVar = this.b;
        boolean z = dbnVar instanceof dfe0;
        aug0 aug0Var = this.a;
        if (z) {
            aug0Var.b(((dfe0) dbnVar).a);
        } else if (dbnVar instanceof tcg) {
            aug0Var.c(((tcg) dbnVar).a);
        } else {
            uhc.a();
        }
    }
}
