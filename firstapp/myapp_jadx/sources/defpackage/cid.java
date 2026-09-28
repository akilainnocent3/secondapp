package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cid implements zig0 {
    public static final cid a = new cid();

    @Override // defpackage.zig0
    public final qqa0 a(String str) {
        return new a();
    }

    public static final class a implements qqa0 {
        public ui1 a;

        @Override // defpackage.qqa0
        public final oqa0 b() {
            ui1 ui1VarB = this.a;
            if (ui1VarB == null) {
                oqa0 oqa0Var = (oqa0) m0b.current().b(zre.c);
                if (oqa0Var == null) {
                    oqa0Var = z530.b;
                }
                ui1VarB = oqa0Var.b();
                this.a = ui1VarB;
            }
            if (ui1VarB != null) {
                return new z530(ui1VarB);
            }
            dp0.a();
            return z530.b;
        }

        @Override // defpackage.qqa0
        public final qqa0 h(m0b m0bVar) {
            this.a = oqa0.i(m0bVar).b();
            return this;
        }

        @Override // defpackage.qqa0
        /* JADX INFO: renamed from: c */
        public final void mo101c(wgh0 wgh0Var) {
        }

        @Override // defpackage.qqa0
        public final qqa0 e(long j) {
            return this;
        }

        @Override // defpackage.qqa0
        public final qqa0 g(wqa0 wqa0Var) {
            return this;
        }

        @Override // defpackage.qqa0
        /* JADX INFO: renamed from: a */
        public final qqa0 f(e21 e21Var, Object obj) {
            return this;
        }
    }
}
