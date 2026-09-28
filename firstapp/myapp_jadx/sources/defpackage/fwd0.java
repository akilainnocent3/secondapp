package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwd0 implements m4h {
    public final long a;
    public final m4h b;

    public class a extends hui {
        public final /* synthetic */ p480 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p480 p480Var, p480 p480Var2) {
            super(p480Var);
            this.b = p480Var2;
        }

        @Override // defpackage.hui, defpackage.p480
        public final p480.a d(long j) {
            p480.a aVarD = this.b.d(j);
            r480 r480Var = aVarD.a;
            long j2 = r480Var.a;
            long j3 = r480Var.b;
            long j4 = fwd0.this.a;
            r480 r480Var2 = new r480(j2, j3 + j4);
            r480 r480Var3 = aVarD.b;
            return new p480.a(r480Var2, new r480(r480Var3.a, r480Var3.b + j4));
        }
    }

    public fwd0(long j, m4h m4hVar) {
        this.a = j;
        this.b = m4hVar;
    }

    @Override // defpackage.m4h
    public final void k(p480 p480Var) {
        this.b.k(new a(p480Var, p480Var));
    }

    @Override // defpackage.m4h
    public final void n() {
        this.b.n();
    }

    @Override // defpackage.m4h
    public final njg0 r(int i, int i2) {
        return this.b.r(i, i2);
    }
}
