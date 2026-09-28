package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class jo0 implements f0n {
    public final k52 a;
    public final zbi0 b;

    public jo0(k52 k52Var, zbi0 zbi0Var) {
        k52Var.getClass();
        zbi0Var.getClass();
        this.a = k52Var;
        this.b = zbi0Var;
    }

    public static kk50 h(ik50 ik50Var) {
        if (ik50Var instanceof ik50.c) {
            return new kk50.c(((ik50.c) ik50Var).a);
        }
        if (ik50Var instanceof ik50.a) {
            ik50.a aVar = (ik50.a) ik50Var;
            return new kk50.a(aVar.a, aVar.b);
        }
        if (Intrinsics.g(ik50Var, ik50.b.a)) {
            return kk50.b.a;
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f0n
    public final Object a(x1b x1bVar) {
        bo0 bo0Var;
        if (x1bVar instanceof bo0) {
            bo0Var = (bo0) x1bVar;
            int i = bo0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bo0Var.d = i - Integer.MIN_VALUE;
            } else {
                bo0Var = new bo0(this, x1bVar);
            }
        } else {
            bo0Var = new bo0(this, x1bVar);
        }
        Object objA = bo0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = bo0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            co0 co0Var = new co0(this, null);
            bo0Var.a = this;
            bo0Var.d = 1;
            objA = this.a.a(oddVar, co0Var, bo0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = bo0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return h((ik50) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f0n
    public final Object b(x1b x1bVar) {
        vn0 vn0Var;
        if (x1bVar instanceof vn0) {
            vn0Var = (vn0) x1bVar;
            int i = vn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vn0Var.d = i - Integer.MIN_VALUE;
            } else {
                vn0Var = new vn0(this, x1bVar);
            }
        } else {
            vn0Var = new vn0(this, x1bVar);
        }
        Object objA = vn0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = vn0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            wn0 wn0Var = new wn0(this, null);
            vn0Var.a = this;
            vn0Var.d = 1;
            objA = this.a.a(oddVar, wn0Var, vn0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = vn0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return h((ik50) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f0n
    public final Object c(x1b x1bVar) {
        do0 do0Var;
        if (x1bVar instanceof do0) {
            do0Var = (do0) x1bVar;
            int i = do0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                do0Var.d = i - Integer.MIN_VALUE;
            } else {
                do0Var = new do0(this, x1bVar);
            }
        } else {
            do0Var = new do0(this, x1bVar);
        }
        Object objA = do0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = do0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            eo0 eo0Var = new eo0(this, null);
            do0Var.a = this;
            do0Var.d = 1;
            objA = this.a.a(oddVar, eo0Var, do0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = do0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return h((ik50) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f0n
    public final Object d(x1b x1bVar) {
        tn0 tn0Var;
        if (x1bVar instanceof tn0) {
            tn0Var = (tn0) x1bVar;
            int i = tn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn0Var.d = i - Integer.MIN_VALUE;
            } else {
                tn0Var = new tn0(this, x1bVar);
            }
        } else {
            tn0Var = new tn0(this, x1bVar);
        }
        Object objA = tn0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = tn0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            un0 un0Var = new un0(this, null);
            tn0Var.a = this;
            tn0Var.d = 1;
            objA = this.a.a(oddVar, un0Var, tn0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = tn0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return h((ik50) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f0n
    public final Object e(String str, x1b x1bVar) {
        xn0 xn0Var;
        if (x1bVar instanceof xn0) {
            xn0Var = (xn0) x1bVar;
            int i = xn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xn0Var.d = i - Integer.MIN_VALUE;
            } else {
                xn0Var = new xn0(this, x1bVar);
            }
        } else {
            xn0Var = new xn0(this, x1bVar);
        }
        Object objA = xn0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = xn0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            yn0 yn0Var = new yn0(this, str, null);
            xn0Var.a = this;
            xn0Var.d = 1;
            objA = this.a.a(oddVar, yn0Var, xn0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = xn0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return h((ik50) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f0n
    public final Object f(x1b x1bVar) {
        zn0 zn0Var;
        if (x1bVar instanceof zn0) {
            zn0Var = (zn0) x1bVar;
            int i = zn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zn0Var.d = i - Integer.MIN_VALUE;
            } else {
                zn0Var = new zn0(this, x1bVar);
            }
        } else {
            zn0Var = new zn0(this, x1bVar);
        }
        Object objA = zn0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = zn0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            ao0 ao0Var = new ao0(this, null);
            zn0Var.a = this;
            zn0Var.d = 1;
            objA = this.a.a(oddVar, ao0Var, zn0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = zn0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return h((ik50) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f0n
    public final Object g(x1b x1bVar) {
        fo0 fo0Var;
        if (x1bVar instanceof fo0) {
            fo0Var = (fo0) x1bVar;
            int i = fo0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo0Var.d = i - Integer.MIN_VALUE;
            } else {
                fo0Var = new fo0(this, x1bVar);
            }
        } else {
            fo0Var = new fo0(this, x1bVar);
        }
        Object objA = fo0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = fo0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            go0 go0Var = new go0(this, null);
            fo0Var.a = this;
            fo0Var.d = 1;
            objA = this.a.a(oddVar, go0Var, fo0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = fo0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return h((ik50) objA);
    }
}
