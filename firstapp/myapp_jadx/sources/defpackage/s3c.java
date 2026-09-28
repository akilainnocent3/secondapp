package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class s3c implements ltg0 {
    public final aug0 a;
    public final dbn b;
    public final int c;

    public static final class a implements ltg0.a {
        public final int b;

        public a(int i) {
            this.b = i;
            if (i > 0) {
                return;
            }
            hb5.a("durationMillis must be > 0.");
            throw null;
        }

        @Override // ltg0.a
        public final ltg0 a(aug0 aug0Var, dbn dbnVar) {
            if (dbnVar instanceof dfe0) {
                return ((dfe0) dbnVar).c == bqc.a ? new zxx(aug0Var, dbnVar) : new s3c(aug0Var, dbnVar, this.b);
            }
            return new zxx(aug0Var, dbnVar);
        }
    }

    public s3c(aug0 aug0Var, dbn dbnVar, int i) {
        this.a = aug0Var;
        this.b = dbnVar;
        this.c = i;
        if (i > 0) {
            return;
        }
        hb5.a("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.ltg0
    public final void a() {
        aug0 aug0Var = this.a;
        Drawable drawableD = aug0Var.d();
        dbn dbnVar = this.b;
        u7n u7nVarT = dbnVar.t();
        boolean z = dbnVar instanceof dfe0;
        f3c f3cVar = new f3c(drawableD, u7nVarT != null ? zbn.a(u7nVarT, aug0Var.getView().getResources()) : null, dbnVar.a().r, this.c, (z && ((dfe0) dbnVar).g) ? false : true);
        if (z) {
            aug0Var.b(zbn.b(f3cVar));
        } else if (dbnVar instanceof tcg) {
            aug0Var.c(zbn.b(f3cVar));
        } else {
            uhc.a();
        }
    }
}
