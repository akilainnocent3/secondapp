package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h9f extends tkd implements s020 {
    public i3z F;
    public Function1<? super m020, Boolean> G;
    public boolean H;
    public psw I;
    public tb5 J;
    public i9f.b K;
    public boolean L;
    public long M = 0;
    public yje0 N;

    public h9f(Function1<? super m020, Boolean> function1, boolean z, psw pswVar, i3z i3zVar) {
        this.F = i3zVar;
        this.G = function1;
        this.H = z;
        this.I = pswVar;
    }

    public final void A2(Function1<? super m020, Boolean> function1, boolean z, psw pswVar, i3z i3zVar, boolean z2) {
        yje0 yje0Var;
        this.G = function1;
        boolean z3 = true;
        if (this.H != z) {
            this.H = z;
            if (!z) {
                s2();
                yje0 yje0Var2 = this.N;
                if (yje0Var2 != null) {
                    q2(yje0Var2);
                }
                this.N = null;
            }
            z2 = true;
        }
        if (!Intrinsics.g(this.I, pswVar)) {
            s2();
            this.I = pswVar;
        }
        if (this.F != i3zVar) {
            this.F = i3zVar;
        } else {
            z3 = z2;
        }
        if (!z3 || (yje0Var = this.N) == null) {
            return;
        }
        yje0Var.O0();
    }

    public void W(b020 b020Var, c020 c020Var, long j) {
        if (this.H && this.N == null) {
            c9f c9fVar = new c9f(this);
            b020 b020Var2 = wje0.a;
            cke0 cke0Var = new cke0(null, null, null, c9fVar);
            p2(cke0Var);
            this.N = cke0Var;
        }
        yje0 yje0Var = this.N;
        if (yje0Var != null) {
            yje0Var.W(b020Var, c020Var, j);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        this.L = false;
        s2();
        this.M = 0L;
    }

    @Override // defpackage.s020
    public final void n1() {
        yje0 yje0Var = this.N;
        if (yje0Var != null) {
            yje0Var.n1();
        }
    }

    public final void s2() {
        i9f.b bVar = this.K;
        if (bVar != null) {
            psw pswVar = this.I;
            if (pswVar != null) {
                pswVar.c(new i9f.a(bVar));
            }
            this.K = null;
        }
    }

    public abstract Object t2(g9f.a aVar, g9f g9fVar);

    public abstract void u2(long j);

    public abstract void v2(long j);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w2(x1b x1bVar) {
        d9f d9fVar;
        if (x1bVar instanceof d9f) {
            d9fVar = (d9f) x1bVar;
            int i = d9fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d9fVar.c = i - Integer.MIN_VALUE;
            } else {
                d9fVar = new d9f(this, x1bVar);
            }
        } else {
            d9fVar = new d9f(this, x1bVar);
        }
        Object obj = d9fVar.a;
        y5b y5bVar = y5b.a;
        int i2 = d9fVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            i9f.b bVar = this.K;
            if (bVar != null) {
                psw pswVar = this.I;
                if (pswVar != null) {
                    i9f.a aVar = new i9f.a(bVar);
                    d9fVar.c = 1;
                    if (pswVar.a(aVar, d9fVar) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            v2(0L);
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        this.K = null;
        v2(0L);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x2(v7f.c cVar, x1b x1bVar) {
        e9f e9fVar;
        psw pswVar;
        i9f.b bVar;
        v7f.c cVar2;
        i9f.b bVar2;
        if (x1bVar instanceof e9f) {
            e9fVar = (e9f) x1bVar;
            int i = e9fVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                e9fVar.e = i - Integer.MIN_VALUE;
            } else {
                e9fVar = new e9f(this, x1bVar);
            }
        } else {
            e9fVar = new e9f(this, x1bVar);
        }
        Object obj = e9fVar.c;
        y5b y5bVar = y5b.a;
        int i2 = e9fVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            i9f.b bVar3 = this.K;
            if (bVar3 != null && (pswVar = this.I) != null) {
                i9f.a aVar = new i9f.a(bVar3);
                e9fVar.a = cVar;
                e9fVar.e = 1;
                if (pswVar.a(aVar, e9fVar) != y5bVar) {
                }
                return y5bVar;
            }
            this.K = bVar;
            u2(cVar.a);
            return Unit.a;
        }
        if (i2 == 1) {
            cVar = e9fVar.a;
            uj50.b(obj);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = e9fVar.b;
            cVar2 = e9fVar.a;
            uj50.b(obj);
        }
        bVar = bVar2;
        cVar = cVar2;
        this.K = bVar;
        u2(cVar.a);
        return Unit.a;
        bVar = new i9f.b();
        psw pswVar2 = this.I;
        if (pswVar2 != null) {
            e9fVar.a = cVar;
            e9fVar.b = bVar;
            e9fVar.e = 2;
            if (pswVar2.a(bVar, e9fVar) != y5bVar) {
                cVar2 = cVar;
                bVar2 = bVar;
                bVar = bVar2;
                cVar = cVar2;
            }
            return y5bVar;
        }
        this.K = bVar;
        u2(cVar.a);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y2(v7f.d dVar, x1b x1bVar) {
        f9f f9fVar;
        if (x1bVar instanceof f9f) {
            f9fVar = (f9f) x1bVar;
            int i = f9fVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9fVar.d = i - Integer.MIN_VALUE;
            } else {
                f9fVar = new f9f(this, x1bVar);
            }
        } else {
            f9fVar = new f9f(this, x1bVar);
        }
        Object obj = f9fVar.b;
        y5b y5bVar = y5b.a;
        int i2 = f9fVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            i9f.b bVar = this.K;
            if (bVar != null) {
                psw pswVar = this.I;
                if (pswVar != null) {
                    i9f.c cVar = new i9f.c(bVar);
                    f9fVar.a = dVar;
                    f9fVar.d = 1;
                    if (pswVar.a(cVar, f9fVar) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            v2(dVar.a);
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dVar = f9fVar.a;
        uj50.b(obj);
        this.K = null;
        v2(dVar.a);
        return Unit.a;
    }

    public abstract boolean z2();
}
