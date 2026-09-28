package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class lp20 implements ip20, mmd {
    public final /* synthetic */ mmd a;
    public boolean b;
    public boolean c;
    public final tuw d = new tuw(false);

    public lp20(mmd mmdVar) {
        this.a = mmdVar;
    }

    @Override // defpackage.mmd
    public final float C1(float f) {
        return this.a.C1(f);
    }

    @Override // defpackage.mmd
    public final float D0(long j) {
        return this.a.D0(j);
    }

    @Override // defpackage.mmd
    public final int I1(long j) {
        return this.a.I1(j);
    }

    @Override // defpackage.mmd
    public final long N(float f) {
        return this.a.N(f);
    }

    @Override // defpackage.mmd
    public final long O(long j) {
        return this.a.O(j);
    }

    @Override // defpackage.mmd
    public final long U1(long j) {
        return this.a.U1(j);
    }

    @Override // defpackage.mmd
    public final float X(long j) {
        return this.a.X(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ip20
    public final Object Y(x1b x1bVar) {
        kp20 kp20Var;
        if (x1bVar instanceof kp20) {
            kp20Var = (kp20) x1bVar;
            int i = kp20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp20Var.c = i - Integer.MIN_VALUE;
            } else {
                kp20Var = new kp20(this, x1bVar);
            }
        } else {
            kp20Var = new kp20(this, x1bVar);
        }
        Object obj = kp20Var.a;
        y5b y5bVar = y5b.a;
        int i2 = kp20Var.c;
        tuw tuwVar = this.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (!this.b && !this.c) {
                kp20Var.c = 1;
                if (tuwVar.d(kp20Var) == y5bVar) {
                    return y5bVar;
                }
            }
            return Boolean.valueOf(this.b);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        tuwVar.f(null);
        return Boolean.valueOf(this.b);
    }

    public final void e() {
        this.c = true;
        tuw tuwVar = this.d;
        if (tuwVar.e()) {
            tuwVar.f(null);
        }
    }

    public final void g() {
        this.b = true;
        tuw tuwVar = this.d;
        if (tuwVar.e()) {
            tuwVar.f(null);
        }
    }

    @Override // defpackage.mmd
    public final long g0(float f) {
        return this.a.g0(f);
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.a.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(x1b x1bVar) {
        jp20 jp20Var;
        if (x1bVar instanceof jp20) {
            jp20Var = (jp20) x1bVar;
            int i = jp20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jp20Var.c = i - Integer.MIN_VALUE;
            } else {
                jp20Var = new jp20(this, x1bVar);
            }
        } else {
            jp20Var = new jp20(this, x1bVar);
        }
        Object obj = jp20Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jp20Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            jp20Var.c = 1;
            if (this.d.d(jp20Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.b = false;
        this.c = false;
        return Unit.a;
    }

    @Override // defpackage.mmd
    public final float u1(int i) {
        return this.a.u1(i);
    }

    @Override // defpackage.mmd
    public final float v1(float f) {
        return this.a.v1(f);
    }

    @Override // defpackage.mmd
    public final int y0(float f) {
        return this.a.y0(f);
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.a.y1();
    }
}
