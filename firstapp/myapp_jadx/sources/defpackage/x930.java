package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.compose.runtime.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class x930 extends tkd implements flx {
    public boolean F;
    public Function0<Unit> G;
    public boolean H;
    public ca30 I;
    public float J;
    public final llx K = new llx(this, null);
    public final isw L = j.a(0.0f);
    public final isw M = j.a(0.0f);

    @c0d(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", l = {260}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x930.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                x930 x930Var = x930.this;
                ca30 ca30Var = x930Var.I;
                float f = x930Var.F ? 1.0f : 0.0f;
                this.a = 1;
                if (ca30Var.c(f, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefresh.kt", l = {288}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x930.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                x930 x930Var = x930.this;
                if (!x930Var.I.b()) {
                    ca30 ca30Var = x930Var.I;
                    float fJ = ((t5a0) x930Var.L).j() / x930Var.v2();
                    this.a = 1;
                    if (ca30Var.c(fJ, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {298}, m = "onPreFling-QWom1Mo")
    public static final class c extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public c(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return x930.this.k1(0L, this);
        }
    }

    public x930(boolean z, Function0<Unit> function0, boolean z2, ca30 ca30Var, float f) {
        this.F = z;
        this.G = function0;
        this.H = z2;
        this.I = ca30Var;
        this.J = f;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        if (!this.I.b() && this.H && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return u2(j);
        }
        return 0L;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        p2(this.K);
        ej5.c(d2(), null, null, new a(null), 3);
        y2(this.F ? v2() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.flx
    public final Object k1(long j, v1b<? super exh0> v1bVar) {
        c cVar;
        if (v1bVar instanceof c) {
            cVar = (c) v1bVar;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c((x1b) v1bVar);
            }
        } else {
            cVar = new c((x1b) v1bVar);
        }
        Object objW2 = cVar.a;
        Object obj = y5b.a;
        int i2 = cVar.c;
        if (i2 == 0) {
            uj50.b(objW2);
            float fC = exh0.c(j);
            cVar.c = 1;
            objW2 = w2(fC, cVar);
            if (objW2 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objW2);
        }
        return new exh0(fxh0.a(0.0f, ((Number) objW2).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object t2(x1b x1bVar) {
        w930 w930Var;
        if (x1bVar instanceof w930) {
            w930Var = (w930) x1bVar;
            int i = w930Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w930Var.c = i - Integer.MIN_VALUE;
            } else {
                w930Var = new w930(this, x1bVar);
            }
        } else {
            w930Var = new w930(this, x1bVar);
        }
        w930 w930Var2 = w930Var;
        Object obj = w930Var2.a;
        Object obj2 = y5b.a;
        int i2 = w930Var2.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                ca30 ca30Var = this.I;
                w930Var2.c = 1;
                Object objA = wd0.a(ca30Var.a, new Float(1.0f), null, null, null, w930Var2, 14);
                if (objA != y5b.a) {
                    objA = Unit.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (this.C) {
                x2(v2());
                y2(v2());
            }
            return Unit.a;
        } catch (Throwable th) {
            if (!this.C) {
                throw th;
            }
            x2(v2());
            y2(v2());
            throw th;
        }
    }

    public final long u2(long j) {
        float fJ;
        float fV2;
        if (this.F) {
            fJ = 0.0f;
        } else {
            isw iswVar = this.M;
            t5a0 t5a0Var = (t5a0) iswVar;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + t5a0Var.j();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fJ = fIntBitsToFloat - t5a0Var.j();
            x2(fIntBitsToFloat);
            if (((t5a0) iswVar).j() * 0.5f <= v2()) {
                fV2 = ((t5a0) iswVar).j() * 0.5f;
            } else {
                float fD = f.d(Math.abs((((t5a0) iswVar).j() * 0.5f) / v2()) - 1.0f, 0.0f, 2.0f);
                fV2 = v2() + (v2() * (fD - (((float) Math.pow(fD, 2.0d)) / 4.0f)));
            }
            y2(fV2);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fJ)) & 4294967295L);
    }

    public final int v2() {
        return pkd.f(this).N.y0(this.J);
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        if (this.I.b() || !this.H || i != 1) {
            return 0L;
        }
        long jU2 = u2(j2);
        ej5.c(d2(), null, null, new b(null), 3);
        return jU2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w2(float f, x1b x1bVar) {
        y930 y930Var;
        if (x1bVar instanceof y930) {
            y930Var = (y930) x1bVar;
            int i = y930Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y930Var.d = i - Integer.MIN_VALUE;
            } else {
                y930Var = new y930(this, x1bVar);
            }
        } else {
            y930Var = new y930(this, x1bVar);
        }
        Object obj = y930Var.b;
        Object obj2 = y5b.a;
        int i2 = y930Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (this.F) {
                return new Float(0.0f);
            }
            isw iswVar = this.M;
            if (((t5a0) iswVar).j() * 0.5f > v2()) {
                this.G.invoke();
            }
            if (((t5a0) iswVar).j() == 0.0f || f < 0.0f) {
                f = 0.0f;
            }
            y930Var.a = f;
            y930Var.d = 1;
            if (s2(y930Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = y930Var.a;
            uj50.b(obj);
        }
        x2(0.0f);
        return new Float(f);
    }

    public final void x2(float f) {
        ((t5a0) this.M).A(f);
    }

    public final void y2(float f) {
        ((t5a0) this.L).A(f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object s2(x1b x1bVar) {
        v930 v930Var;
        if (x1bVar instanceof v930) {
            v930Var = (v930) x1bVar;
            int i = v930Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v930Var.c = i - Integer.MIN_VALUE;
            } else {
                v930Var = new v930(this, x1bVar);
            }
        } else {
            v930Var = new v930(this, x1bVar);
        }
        v930 v930Var2 = v930Var;
        Object obj = v930Var2.a;
        Object obj2 = y5b.a;
        int i2 = v930Var2.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                ca30 ca30Var = this.I;
                v930Var2.c = 1;
                Object objA = wd0.a(ca30Var.a, new Float(0.0f), null, null, null, v930Var2, 14);
                if (objA != y5b.a) {
                    objA = Unit.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    ib5.a(sgwpmp.jSJXmLaS);
                    return null;
                }
                uj50.b(obj);
            }
            x2(0.0f);
            y2(0.0f);
            return Unit.a;
        } catch (Throwable th) {
            x2(0.0f);
            y2(0.0f);
            throw th;
        }
    }
}
