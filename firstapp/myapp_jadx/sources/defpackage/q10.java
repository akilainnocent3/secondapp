package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q10<T> extends h9f {
    public i20<T> O;
    public i3z P;
    public Boolean Q;
    public svh R;
    public svh S;
    public mmd T;

    @c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {435, 437}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ q10<T> b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q10<T> q10Var, long j, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = q10Var;
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                q10<T> q10Var = this.b;
                boolean zC2 = q10Var.C2();
                long jF = exh0.f(zC2 ? -1.0f : 1.0f, this.c);
                float fC = q10Var.P == i3z.a ? exh0.c(jF) : exh0.b(jF);
                this.a = 1;
                if (q10Var.B2(fC, this) == y5bVar) {
                    return y5bVar;
                }
            } else if (i == 1) {
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                Unit unit = Unit.a;
            }
            return Unit.a;
        }
    }

    public q10() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object B2(float f, x1b x1bVar) {
        o10 o10Var;
        aq40 aq40Var;
        if (x1bVar instanceof o10) {
            o10Var = (o10) x1bVar;
            int i = o10Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o10Var.d = i - Integer.MIN_VALUE;
            } else {
                o10Var = new o10(this, x1bVar);
            }
        } else {
            o10Var = new o10(this, x1bVar);
        }
        o10 o10Var2 = o10Var;
        Object obj = o10Var2.b;
        Object obj2 = y5b.a;
        int i2 = o10Var2.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (this.O.c()) {
                i20<T> i20Var = this.O;
                o10Var2.d = 1;
                if (!i20Var.c()) {
                    zkn.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                }
                Object value = ((x5a0) i20Var.g).getValue();
                n9f<T> n9fVarB = i20Var.b();
                float fE = i20Var.e();
                Function1<? super Float, Float> function1 = i20Var.b;
                if (function1 == null) {
                    Intrinsics.n("positionalThreshold");
                    throw null;
                }
                zle0 zle0Var = i20Var.c;
                if (zle0Var == null) {
                    Intrinsics.n("velocityThreshold");
                    throw null;
                }
                Object objH = androidx.compose.foundation.gestures.a.h(n9fVarB, fE, f, function1, zle0Var);
                Object objG = i20Var.a.invoke(objH).booleanValue() ? androidx.compose.foundation.gestures.a.g(i20Var, objH, f, null, o10Var2, 12) : androidx.compose.foundation.gestures.a.g(i20Var, value, f, null, o10Var2, 12);
                if (objG != obj2) {
                    return objG;
                }
            } else {
                aq40 aq40Var2 = new aq40();
                aq40Var2.a = f;
                i20<T> i20Var2 = this.O;
                p10 p10Var = new p10(this, aq40Var2, f, null);
                o10Var2.a = aq40Var2;
                o10Var2.d = 2;
                huw huwVar = huw.a;
                puw puwVar = i20Var2.f;
                b20 b20Var = new b20(i20Var2, null, p10Var);
                puwVar.getClass();
                Object objD = w5b.d(new muw(huwVar, puwVar, b20Var, null), o10Var2);
                if (objD != obj2) {
                    objD = Unit.a;
                }
                if (objD != obj2) {
                    aq40Var = aq40Var2;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return obj;
        }
        if (i2 != 2) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aq40Var = o10Var2.a;
        uj50.b(obj);
        return new Float(aq40Var.a);
    }

    public final boolean C2() {
        Boolean bool = this.Q;
        if (bool == null) {
            return pkd.f(this).O == asr.b && this.P == i3z.b;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void D2(svh svhVar) {
        if (svhVar == null) {
            gzg0 gzg0Var = v00.a;
            u00 u00Var = v00.b;
            mmd mmdVar = pkd.f(this).N;
            this.T = mmdVar;
            svhVar = new t4a0(new a10(this.O, u00Var, new z00(mmdVar, 0)), androidx.compose.foundation.gestures.a.b, gzg0Var);
        }
        this.S = svhVar;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        D2(this.R);
    }

    @Override // defpackage.h9f
    public final Object t2(g9f.a aVar, g9f g9fVar) {
        i20<T> i20Var = this.O;
        n10 n10Var = new n10(aVar, this, null);
        huw huwVar = huw.a;
        puw puwVar = i20Var.f;
        b20 b20Var = new b20(i20Var, null, n10Var);
        puwVar.getClass();
        Object objD = w5b.d(new muw(huwVar, puwVar, b20Var, null), g9fVar);
        y5b y5bVar = y5b.a;
        if (objD != y5bVar) {
            objD = Unit.a;
        }
        return objD == y5bVar ? objD : Unit.a;
    }

    @Override // defpackage.h9f
    public final void v2(long j) {
        if (this.C) {
            ej5.c(d2(), null, null, new a(this, j, null), 3);
        }
    }

    @Override // defpackage.okd, defpackage.s020
    public final void x() {
        n1();
        if (this.C) {
            mmd mmdVar = pkd.f(this).N;
            mmd mmdVar2 = this.T;
            if (mmdVar2 == null || !mmdVar2.equals(mmdVar)) {
                this.T = mmdVar;
                D2(this.R);
            }
        }
    }

    @Override // defpackage.h9f
    public final boolean z2() {
        return ((x5a0) this.O.l).getValue() != null;
    }

    @Override // defpackage.h9f
    public final void u2(long j) {
    }
}
