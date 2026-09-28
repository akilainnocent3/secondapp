package defpackage;

import android.view.View;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class biu extends d.c implements l2l, qcf, ya80, mfy {
    public Function1<? super mmd, gly> D;
    public Function1<? super k7f, Unit> E;
    public float F;
    public boolean G;
    public long H;
    public float I;
    public float J;
    public boolean K;
    public jj10 L;
    public View M;
    public mmd N;
    public ij10 O;
    public mae Q;
    public jxo S;
    public tb5 T;
    public final ytw P = m.a(null, epx.a);
    public long R = 9205357640488583168L;

    @c0d(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return biu.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x0024  */
        /* JADX WARN: Code duplicated, block: B:16:0x002d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002f -> B:11:0x0020). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0049 -> B:21:0x004c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 2
                r3 = 1
                biu r4 = defpackage.biu.this
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                defpackage.uj50.b(r7)
                goto L4c
            L12:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L19:
                defpackage.uj50.b(r7)
                goto L2d
            L1d:
                defpackage.uj50.b(r7)
            L20:
                tb5 r7 = r4.T
                if (r7 == 0) goto L2d
                r6.a = r3
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L2d
                goto L4b
            L2d:
                ij10 r7 = r4.O
                if (r7 == 0) goto L20
                zuk r7 = new zuk
                r7.<init>(r3)
                r6.a = r2
                kotlin.coroutines.CoroutineContext r1 = r6.getContext()
                r4w r1 = defpackage.t4w.a(r1)
                s4w r5 = new s4w
                r5.<init>(r7)
                java.lang.Object r7 = r1.P(r5, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                ij10 r7 = r4.O
                if (r7 == 0) goto L20
                r7.b()
                goto L20
            */
            throw new UnsupportedOperationException("Method not decompiled: biu.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public biu(zif0 zif0Var, ajf0 ajf0Var, float f, boolean z, long j, float f2, float f3, boolean z2, jj10 jj10Var) {
        this.D = zif0Var;
        this.E = ajf0Var;
        this.F = f;
        this.G = z;
        this.H = j;
        this.I = f2;
        this.J = f3;
        this.K = z2;
        this.L = jj10Var;
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        wsrVar.b2();
        tb5 tb5Var = this.T;
        if (tb5Var != null) {
            tb5Var.c(Unit.a);
        }
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        pb80Var.b(ciu.a, new aiu(this, 0));
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        t0();
        this.T = d77.b(0, 7, null);
        ej5.c(d2(), null, a6b.d, new a(null), 1);
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        ij10 ij10Var = this.O;
        if (ij10Var != null) {
            ij10Var.dismiss();
        }
        this.O = null;
    }

    public final long p2() {
        mae maeVarB = this.Q;
        if (maeVarB == null) {
            maeVarB = a6a0.b(new yib(this, 1));
            this.Q = maeVarB;
        }
        return ((gly) maeVarB.getValue()).a;
    }

    public final void q2() {
        ij10 ij10Var = this.O;
        if (ij10Var != null) {
            ij10Var.dismiss();
        }
        View viewA = this.M;
        if (viewA == null) {
            viewA = qkd.a(this);
        }
        View view = viewA;
        this.M = view;
        mmd mmdVar = this.N;
        if (mmdVar == null) {
            mmdVar = pkd.f(this).N;
        }
        mmd mmdVar2 = mmdVar;
        this.N = mmdVar2;
        this.O = this.L.b(view, this.G, this.H, this.I, this.J, this.K, mmdVar2, this.F);
        s2();
    }

    @Override // defpackage.l2l
    public final void r0(ywx ywxVar) {
        ((x5a0) this.P).setValue(ywxVar);
    }

    public final void r2() {
        mmd mmdVar = this.N;
        if (mmdVar == null) {
            mmdVar = pkd.f(this).N;
            this.N = mmdVar;
        }
        long j = this.D.invoke(mmdVar).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & p2()) == 9205357640488583168L) {
            this.R = 9205357640488583168L;
            ij10 ij10Var = this.O;
            if (ij10Var != null) {
                ij10Var.dismiss();
                return;
            }
            return;
        }
        this.R = gly.f(p2(), j);
        if (this.O == null) {
            q2();
        }
        ij10 ij10Var2 = this.O;
        if (ij10Var2 != null) {
            ij10Var2.c(this.F, this.R, 9205357640488583168L);
        }
        s2();
    }

    public final void s2() {
        mmd mmdVar;
        ij10 ij10Var = this.O;
        if (ij10Var == null || (mmdVar = this.N) == null) {
            return;
        }
        if (jxo.a(this.S, ij10Var.a())) {
            return;
        }
        Function1<? super k7f, Unit> function1 = this.E;
        if (function1 != null) {
            function1.invoke(new k7f(mmdVar.O(kc6.d(ij10Var.a()))));
        }
        this.S = new jxo(ij10Var.a());
    }

    @Override // defpackage.mfy
    public final void t0() {
        nfy.a(this, new zhu(this, 0));
    }
}
