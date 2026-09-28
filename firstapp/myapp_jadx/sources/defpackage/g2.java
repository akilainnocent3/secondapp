package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g2 extends tkd implements s020, imp, ya80, hvg0, yma, mfy {
    public static final a Y = new a();
    public psw F;
    public mfn G;
    public boolean H;
    public String I;
    public su50 J;
    public boolean K;
    public Function0<Unit> L;
    public final t5i M;
    public mfn N;
    public yje0 O;
    public okd P;
    public mp20.b Q;
    public vkm R;
    public final vsw<mp20.b> S;
    public long T;
    public psw U;
    public boolean V;
    public jvd0 W;
    public final a X;

    public static final class a {
    }

    public /* synthetic */ class b extends saj implements Function1<Boolean, Unit> {
        /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x0063 A[LOOP:0: B:10:0x0021->B:20:0x0063, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:25:0x0066 A[EDGE_INSN: B:25:0x0066->B:21:0x0066 BREAK  A[LOOP:0: B:10:0x0021->B:20:0x0063], SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            g2 g2Var = (g2) this.receiver;
            vsw<mp20.b> vswVar = g2Var.S;
            if (zBooleanValue) {
                g2Var.x2();
            } else {
                if (g2Var.F != null) {
                    Object[] objArr = vswVar.c;
                    long[] jArr = vswVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        ej5.c(g2Var.d2(), null, null, new o2(g2Var, (mp20.b) objArr[(i << 3) + i3], null), 3);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                                if (i != length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
                vswVar.a();
                g2Var.y2();
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", f = "Clickable.kt", l = {1706}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ mp20.b b;
        public final /* synthetic */ psw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, psw pswVar, mp20.b bVar) {
            super(2, v1bVar);
            this.b = bVar;
            this.c = pswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(v1bVar, this.c, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                mp20.a aVar = new mp20.a(this.b);
                this.a = 1;
                if (this.c.a(aVar, this) == y5bVar) {
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

    @c0d(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1592}, m = "invokeSuspend")
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ mp20.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mp20.b bVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g2.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                psw pswVar = g2.this.F;
                if (pswVar != null) {
                    this.a = 1;
                    if (pswVar.a(this.c, this) == y5bVar) {
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

    @c0d(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {1603}, m = "invokeSuspend")
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ mp20.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mp20.b bVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g2.this.new e(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                psw pswVar = g2.this.F;
                if (pswVar != null) {
                    mp20.c cVar = new mp20.c(this.c);
                    this.a = 1;
                    if (pswVar.a(cVar, this) == y5bVar) {
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

    @c0d(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g2.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g2 g2Var = g2.this;
            if (g2Var.R == null) {
                vkm vkmVar = new vkm();
                psw pswVar = g2Var.F;
                if (pswVar != null) {
                    ej5.c(g2Var.d2(), null, null, new h2(pswVar, vkmVar, null), 3);
                }
                g2Var.R = vkmVar;
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g2.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g2 g2Var = g2.this;
            vkm vkmVar = g2Var.R;
            if (vkmVar != null) {
                wkm wkmVar = new wkm(vkmVar);
                psw pswVar = g2Var.F;
                if (pswVar != null) {
                    ej5.c(g2Var.d2(), null, null, new i2(pswVar, wkmVar, null), 3);
                }
                g2Var.R = null;
            }
            return Unit.a;
        }
    }

    public g2(psw pswVar, mfn mfnVar, boolean z, boolean z2, String str, su50 su50Var, Function0<Unit> function0) {
        this.F = pswVar;
        this.G = mfnVar;
        this.H = z;
        this.I = str;
        this.J = su50Var;
        this.K = z2;
        this.L = function0;
        this.M = new t5i(pswVar, 0, new b(1, this, g2.class, "onFocusChange", "onFocusChange(Z)V", 0));
        int i = fkt.a;
        this.S = new vsw<>(6);
        this.T = 0L;
        psw pswVar2 = this.F;
        this.U = pswVar2;
        this.V = pswVar2 == null;
        this.X = Y;
    }

    public abstract void A2(KeyEvent keyEvent);

    public final void B2(psw pswVar, mfn mfnVar, boolean z, boolean z2, String str, su50 su50Var, Function0<Unit> function0) {
        boolean z3;
        boolean z4;
        okd okdVar;
        boolean z5 = true;
        if (Intrinsics.g(this.U, pswVar)) {
            z3 = false;
        } else {
            v2();
            this.U = pswVar;
            this.F = pswVar;
            z3 = true;
        }
        if (!Intrinsics.g(this.G, mfnVar)) {
            this.G = mfnVar;
            z3 = true;
        }
        if (this.H != z) {
            this.H = z;
            if (z) {
                t0();
            }
            z3 = true;
        }
        boolean z6 = this.K;
        t5i t5iVar = this.M;
        if (z6 != z2) {
            if (z2) {
                p2(t5iVar);
            } else {
                q2(t5iVar);
                v2();
            }
            pkd.f(this).R();
            this.K = z2;
        }
        if (!Intrinsics.g(this.I, str)) {
            this.I = str;
            pkd.f(this).R();
        }
        if (!Intrinsics.g(this.J, su50Var)) {
            this.J = su50Var;
            pkd.f(this).R();
        }
        this.L = function0;
        boolean z7 = this.V;
        psw pswVar2 = this.U;
        if (z7 == (pswVar2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = pswVar2 == null;
            this.V = z4;
            if (z4 || this.P != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((okdVar = this.P) != null || !z4)) {
            if (okdVar != null) {
                q2(okdVar);
            }
            this.P = null;
            x2();
        }
        t5iVar.u2(this.F);
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        su50 su50Var = this.J;
        if (su50Var != null) {
            lb80.h(pb80Var, su50Var.a);
        }
        String str = this.I;
        f2 f2Var = new f2(this, 0);
        ohp<Object>[] ohpVarArr = lb80.a;
        pb80Var.b(ra80.b, new c6(str, f2Var));
        if (this.K) {
            this.M.G0(pb80Var);
        } else {
            pb80Var.b(hb80.i, Unit.a);
        }
        s2(pb80Var);
    }

    @Override // defpackage.hvg0
    public final Object J() {
        return this.X;
    }

    @Override // defpackage.imp
    public final boolean R0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.s020
    public void W(b020 b020Var, c020 c020Var, long j) {
        yje0 yje0VarT2;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.T = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        x2();
        if (this.K && c020Var == c020.b) {
            int i = b020Var.e;
            if (i == 4) {
                ej5.c(d2(), null, null, new f(null), 3);
            } else if (i == 5) {
                ej5.c(d2(), null, null, new g(null), 3);
            }
        }
        if (this.O == null && (yje0VarT2 = t2()) != null) {
            p2(yje0VarT2);
            this.O = yje0VarT2;
        }
        yje0 yje0Var = this.O;
        if (yje0Var != null) {
            yje0Var.W(b020Var, c020Var, j);
        }
    }

    @Override // defpackage.ya80
    public final boolean Y1() {
        return true;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    @Override // defpackage.imp
    public final boolean h1(KeyEvent keyEvent) {
        boolean z;
        x2();
        long jA = emp.a(keyEvent);
        boolean z2 = this.K;
        vsw<mp20.b> vswVar = this.S;
        if (z2 && emp.b(keyEvent) == 2 && androidx.compose.foundation.d.f(keyEvent)) {
            if (vswVar.b(jA)) {
                z = false;
            } else {
                mp20.b bVar = new mp20.b(this.T);
                vswVar.g(bVar, jA);
                if (this.F != null) {
                    ej5.c(d2(), null, null, new d(bVar, null), 3);
                }
                z = true;
            }
            if (z2(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.K && emp.b(keyEvent) == 1 && androidx.compose.foundation.d.f(keyEvent)) {
            mp20.b bVarF = vswVar.f(jA);
            if (bVarF != null) {
                if (this.F != null) {
                    ej5.c(d2(), null, null, new e(bVarF, null), 3);
                }
                A2(keyEvent);
            }
            if (bVarF != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        t0();
        if (!this.V) {
            x2();
        }
        if (this.K) {
            p2(this.M);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        v2();
        if (this.U == null) {
            this.F = null;
        }
        okd okdVar = this.P;
        if (okdVar != null) {
            q2(okdVar);
        }
        this.P = null;
    }

    @Override // defpackage.s020
    public void n1() {
        vkm vkmVar;
        psw pswVar = this.F;
        if (pswVar != null && (vkmVar = this.R) != null) {
            pswVar.c(new wkm(vkmVar));
        }
        this.R = null;
        yje0 yje0Var = this.O;
        if (yje0Var != null) {
            yje0Var.n1();
        }
    }

    @Override // defpackage.mfy
    public final void t0() {
        if (this.H) {
            nfy.a(this, new e2(this, 0));
        }
    }

    public abstract yje0 t2();

    public final boolean u2() {
        yp40 yp40Var = new yp40();
        obl0.b(this, qq70.F, new or7(yp40Var, 0));
        if (yp40Var.a) {
            return true;
        }
        int i = zr7.b;
        ViewParent parent = qkd.a(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[LOOP:0: B:13:0x002b->B:23:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:24:0x006a BREAK  A[LOOP:0: B:13:0x002b->B:23:0x0067], SYNTHETIC] */
    public final void v2() {
        psw pswVar = this.F;
        vsw<mp20.b> vswVar = this.S;
        if (pswVar != null) {
            mp20.b bVar = this.Q;
            if (bVar != null) {
                pswVar.c(new mp20.a(bVar));
            }
            vkm vkmVar = this.R;
            if (vkmVar != null) {
                pswVar.c(new wkm(vkmVar));
            }
            Object[] objArr = vswVar.c;
            long[] jArr = vswVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                pswVar.c(new mp20.a((mp20.b) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.Q = null;
        this.R = null;
        vswVar.a();
    }

    public final void w2() {
        psw pswVar = this.F;
        if (pswVar != null) {
            jvd0 jvd0Var = this.W;
            if (jvd0Var == null || !jvd0Var.isActive()) {
                mp20.b bVar = this.Q;
                if (bVar != null) {
                    ej5.c(d2(), null, null, new c(null, pswVar, bVar), 3);
                }
            } else {
                jvd0 jvd0Var2 = this.W;
                if (jvd0Var2 != null) {
                    jvd0Var2.cancel((CancellationException) null);
                }
            }
            this.Q = null;
        }
    }

    public final void x2() {
        if (this.P != null) {
            return;
        }
        mfn mfnVar = this.H ? this.N : this.G;
        if (mfnVar != null) {
            psw qswVar = this.F;
            if (qswVar == null) {
                qswVar = new qsw();
                this.F = qswVar;
            }
            this.M.u2(qswVar);
            psw pswVar = this.F;
            pswVar.getClass();
            okd okdVarA = mfnVar.a(pswVar);
            p2(okdVarA);
            this.P = okdVarA;
        }
    }

    public abstract boolean z2(KeyEvent keyEvent);

    public void y2() {
    }

    public void s2(pb80 pb80Var) {
    }
}
