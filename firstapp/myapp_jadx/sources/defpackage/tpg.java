package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tpg extends k5b {
    public static final /* synthetic */ int e = 0;
    public long b;
    public boolean c;
    public gx0<bse<?>> d;

    @Override // defpackage.k5b
    public final k5b g0(int i) {
        wcs.a(i);
        return this;
    }

    public final void h0(boolean z) {
        long j = this.b - (z ? 4294967296L : 1L);
        this.b = j;
        if (j <= 0 && this.c) {
            A0();
        }
    }

    public final void l0(bse<?> bseVar) {
        gx0<bse<?>> gx0Var = this.d;
        if (gx0Var == null) {
            gx0Var = new gx0<>();
            this.d = gx0Var;
        }
        gx0Var.addLast(bseVar);
    }

    public final void n0(boolean z) {
        this.b = (z ? 4294967296L : 1L) + this.b;
        if (z) {
            return;
        }
        this.c = true;
    }

    public long u0() {
        return !z0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean z0() {
        gx0<bse<?>> gx0Var = this.d;
        if (gx0Var == null) {
            return false;
        }
        bse<?> bseVarRemoveFirst = gx0Var.isEmpty() ? null : gx0Var.removeFirst();
        if (bseVarRemoveFirst == null) {
            return false;
        }
        bseVarRemoveFirst.run();
        return true;
    }

    public void A0() {
    }
}
