package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class j2h implements zig0 {
    public static final j2h a = new j2h();

    public static final class a implements l3h {
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

        @Override // defpackage.l3h, defpackage.qqa0
        public final l3h h(m0b m0bVar) {
            this.a = oqa0.i(m0bVar).b();
            return this;
        }

        @Override // defpackage.l3h, defpackage.qqa0
        /* JADX INFO: renamed from: a */
        public final qqa0 f(e21 e21Var, Object obj) {
            return this;
        }

        @Override // defpackage.l3h, defpackage.qqa0
        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public final void mo101c(wgh0 wgh0Var) {
        }

        @Override // defpackage.l3h, defpackage.qqa0
        public final qqa0 e(long j) {
            return this;
        }

        @Override // defpackage.l3h, defpackage.qqa0
        public final qqa0 g(wqa0 wqa0Var) {
            return this;
        }

        @Override // defpackage.l3h, defpackage.qqa0
        public final qqa0 h(m0b m0bVar) {
            this.a = oqa0.i(m0bVar).b();
            return this;
        }

        @Override // defpackage.l3h
        /* JADX INFO: renamed from: c */
        public final l3h mo101c(wgh0 wgh0Var) {
            return this;
        }

        @Override // defpackage.l3h, defpackage.qqa0
        public final l3h e(long j) {
            return this;
        }

        @Override // defpackage.l3h, defpackage.qqa0
        public final l3h g(wqa0 wqa0Var) {
            return this;
        }

        @Override // defpackage.l3h, defpackage.qqa0
        /* JADX INFO: renamed from: a */
        public final l3h f(e21 e21Var, Object obj) {
            return this;
        }
    }

    @Override // defpackage.zig0
    public final qqa0 a(String str) {
        return new a();
    }
}
