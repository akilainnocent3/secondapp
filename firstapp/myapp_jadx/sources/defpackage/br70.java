package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.ui.focus.FocusTargetNode;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class br70 extends h9f implements imp, ya80, yma {
    public sfz O;
    public svh P;
    public final glx Q;
    public final qq70 R;
    public final pcd S;
    public final wr70 T;
    public final wq70 U;
    public final nza V;
    public xq70 W;
    public er70 X;
    public k6w Y;

    @c0d(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {351}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return br70.this.new a(this.c, v1bVar);
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
                wr70 wr70Var = br70.this.T;
                this.a = 1;
                if (wr70Var.b(this.c, false, this) == y5bVar) {
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

    @c0d(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {485}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        @c0d(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<olx, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = j;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(olx olxVar, v1b<? super Unit> v1bVar) {
                return ((a) create(olxVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ((olx) this.a).a(this.b);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return br70.this.new b(this.c, v1bVar);
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
                wr70 wr70Var = br70.this.T;
                huw huwVar = huw.b;
                a aVar = new a(this.c, null);
                this.a = 1;
                if (wr70Var.f(huwVar, aVar, this) == y5bVar) {
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

    public br70(qa5 qa5Var, svh svhVar, psw pswVar, i3z i3zVar, sfz sfzVar, fr70 fr70Var, boolean z, boolean z2) {
        super(androidx.compose.foundation.gestures.b.a, z, pswVar, i3zVar);
        this.O = sfzVar;
        this.P = svhVar;
        glx glxVar = new glx();
        this.Q = glxVar;
        qq70 qq70Var = new qq70(z);
        p2(qq70Var);
        this.R = qq70Var;
        pcd pcdVar = new pcd(new i4d(new ydb0(androidx.compose.foundation.gestures.b.d)));
        this.S = pcdVar;
        sfz sfzVar2 = this.O;
        svh svhVar2 = this.P;
        wr70 wr70Var = new wr70(fr70Var, sfzVar2, svhVar2 == null ? pcdVar : svhVar2, i3zVar, z2, glxVar, this, new cfg(this, 2));
        this.T = wr70Var;
        wq70 wq70Var = new wq70(wr70Var, z);
        this.U = wq70Var;
        nza nzaVar = new nza(i3zVar, wr70Var, z2, qa5Var);
        p2(nzaVar);
        this.V = nzaVar;
        p2(new llx(wq70Var, glxVar));
        p2(new FocusTargetNode(2, null, 4));
        pa5 pa5Var = new pa5();
        pa5Var.D = nzaVar;
        p2(pa5Var);
        p2(new w5i(new dfg(this, 1)));
    }

    public final void B2(qa5 qa5Var, svh svhVar, psw pswVar, i3z i3zVar, sfz sfzVar, fr70 fr70Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.H != z) {
            this.U.b = z;
            this.R.E = z;
            z3 = true;
        } else {
            z3 = false;
        }
        svh svhVar2 = svhVar == null ? this.S : svhVar;
        wr70 wr70Var = this.T;
        if (!Intrinsics.g(wr70Var.a, fr70Var)) {
            wr70Var.a = fr70Var;
            z5 = true;
        }
        wr70Var.b = sfzVar;
        i3z i3zVar2 = wr70Var.d;
        if (i3zVar2 != i3zVar) {
            wr70Var.d = i3zVar;
            i3zVar2 = i3zVar;
            z5 = true;
        }
        if (wr70Var.e != z2) {
            wr70Var.e = z2;
        } else {
            z4 = z5;
        }
        wr70Var.c = svhVar2;
        wr70Var.f = this.Q;
        nza nzaVar = this.V;
        nzaVar.D = i3zVar;
        nzaVar.F = z2;
        nzaVar.G = qa5Var;
        this.O = sfzVar;
        this.P = svhVar;
        sq70 sq70Var = androidx.compose.foundation.gestures.b.a;
        i3z i3zVar3 = i3z.a;
        if (i3zVar2 != i3zVar3) {
            i3zVar3 = i3z.b;
        }
        A2(sq70Var, z, pswVar, i3zVar3, z4);
        if (z3) {
            this.W = null;
            this.X = null;
            pkd.f(this).R();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [xq70] */
    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        if (this.H && (this.W == null || this.X == null)) {
            this.W = new Function2() { // from class: xq70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj).floatValue();
                    float fFloatValue2 = ((Float) obj2).floatValue();
                    br70 br70Var = this.a;
                    ej5.c(br70Var.d2(), null, null, new dr70(br70Var, fFloatValue, fFloatValue2, null), 3);
                    return Boolean.TRUE;
                }
            };
            this.X = new er70(this, null);
        }
        xq70 xq70Var = this.W;
        if (xq70Var != null) {
            ohp<Object>[] ohpVarArr = lb80.a;
            pb80Var.b(ra80.d, new c6(null, xq70Var));
        }
        er70 er70Var = this.X;
        if (er70Var != null) {
            ohp<Object>[] ohpVarArr2 = lb80.a;
            pb80Var.b(ra80.e, er70Var);
        }
    }

    @Override // defpackage.imp
    public final boolean R0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.h9f, defpackage.s020
    public final void W(b020 b020Var, c020 c020Var, long j) {
        br70 br70Var;
        long j2;
        boolean zE;
        List<m020> list = b020Var.a;
        List<m020> list2 = b020Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (this.G.invoke(list.get(i)).booleanValue()) {
                super.W(b020Var, c020Var, j);
                break;
            }
        }
        if (this.H) {
            if (c020Var == c020.a && b020Var.e == 6) {
                k6w k6wVar = this.Y;
                if (k6wVar == null) {
                    br70Var = this;
                    k6wVar = new k6w(br70Var.T, new c60(ViewConfiguration.get(qkd.a(this).getContext())), new ar70(2, br70Var, br70.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), pkd.f(br70Var).N);
                    br70Var.Y = k6wVar;
                } else {
                    br70Var = this;
                }
                v5b v5bVarD2 = br70Var.d2();
                if (k6wVar.g == null) {
                    k6wVar.g = ej5.c(v5bVarD2, null, null, new r6w(k6wVar, null), 3);
                }
            } else {
                br70Var = this;
            }
            k6w k6wVar2 = br70Var.Y;
            if (k6wVar2 != null && c020Var == c020.b && b020Var.e == 6) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (list2.get(i2).b()) {
                        return;
                    }
                }
                c60 c60Var = k6wVar2.b;
                mmd mmdVar = k6wVar2.d;
                ViewConfiguration viewConfiguration = c60Var.a;
                int i3 = Build.VERSION.SDK_INT;
                float f = -(i3 > 26 ? a7i0.b(viewConfiguration) : mmdVar.C1(64.0f));
                float f2 = -(i3 > 26 ? a7i0.a(viewConfiguration) : mmdVar.C1(64.0f));
                gly glyVar = new gly(0L);
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    j2 = glyVar.a;
                    if (i4 >= size3) {
                        break;
                    }
                    glyVar = new gly(gly.f(j2, list2.get(i4).j));
                    i4++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f)) & 4294967295L);
                wr70 wr70Var = k6wVar2.a;
                float fG = wr70Var.g(wr70Var.e(jFloatToRawIntBits));
                if (fG == 0.0f) {
                    zE = false;
                } else {
                    fr70 fr70Var = wr70Var.a;
                    zE = fG > 0.0f ? fr70Var.e() : fr70Var.d();
                }
                if (zE ? !(k6wVar2.e.c(new k6w.a(false, jFloatToRawIntBits, ((m020) CollectionsKt.T(list2)).b)) instanceof h77.b) : k6wVar2.f) {
                    int size4 = list2.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        list2.get(i5).a();
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // defpackage.imp
    public final boolean h1(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.H || ((!olp.a(emp.a(keyEvent), olp.p) && !olp.a(qnp.b(keyEvent.getKeyCode()), olp.o)) || emp.b(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.T.d == i3z.a;
        nza nzaVar = this.V;
        if (z) {
            int i = (int) (nzaVar.L & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(olp.a(qnp.b(keyEvent.getKeyCode()), olp.o) ? i : -i)));
        } else {
            int i2 = (int) (nzaVar.L >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(olp.a(qnp.b(keyEvent.getKeyCode()), olp.o) ? i2 : -i2)) << 32);
        }
        ej5.c(d2(), null, null, new b(jFloatToRawIntBits, null), 3);
        return true;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        if (this.C) {
            mmd mmdVar = pkd.f(this).N;
            pcd pcdVar = this.S;
            pcdVar.getClass();
            pcdVar.a = new i4d(new ydb0(mmdVar));
        }
        k6w k6wVar = this.Y;
        if (k6wVar != null) {
            k6wVar.d = pkd.f(this).N;
        }
    }

    @Override // defpackage.h9f
    public final Object t2(g9f.a aVar, g9f g9fVar) {
        huw huwVar = huw.b;
        wr70 wr70Var = this.T;
        Object objF = wr70Var.f(huwVar, new zq70(aVar, wr70Var, null), g9fVar);
        return objF == y5b.a ? objF : Unit.a;
    }

    @Override // defpackage.h9f
    public final void v2(long j) {
        ej5.c(this.Q.c(), null, null, new a(j, null), 3);
    }

    @Override // defpackage.okd, defpackage.s020
    public final void x() {
        n1();
        if (this.C) {
            mmd mmdVar = pkd.f(this).N;
            pcd pcdVar = this.S;
            pcdVar.getClass();
            pcdVar.a = new i4d(new ydb0(mmdVar));
        }
        k6w k6wVar = this.Y;
        if (k6wVar != null) {
            k6wVar.d = pkd.f(this).N;
        }
    }

    @Override // defpackage.h9f
    public final boolean z2() {
        wr70 wr70Var = this.T;
        if (wr70Var.a.c()) {
            return true;
        }
        sfz sfzVar = wr70Var.b;
        return sfzVar != null ? sfzVar.b() : false;
    }

    @Override // defpackage.h9f
    public final void u2(long j) {
    }
}
