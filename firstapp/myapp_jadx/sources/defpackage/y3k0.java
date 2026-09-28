package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly3k0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y3k0 extends j8i0 {
    public boolean A;
    public boolean B;
    public final b3k0 a;
    public final uti b;
    public final psm c;
    public final uy0 d;
    public final i2k0 e;
    public final rdd0 f;
    public final wwd0 i;
    public final v340 v;
    public final ku90<k2k0> w;
    public final t340 y;
    public boolean z;

    @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.presentation.WorldCupPassViewModel$emit$1", f = "WorldCupPassViewModel.kt", l = {241}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ k2k0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k2k0 k2k0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = k2k0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return y3k0.this.new a(this.c, v1bVar);
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
                ku90<k2k0> ku90Var = y3k0.this.w;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    public y3k0(b3k0 b3k0Var, uti utiVar, psm psmVar, uy0 uy0Var, i2k0 i2k0Var, rdd0 rdd0Var) {
        b3k0Var.getClass();
        psmVar.getClass();
        uy0Var.getClass();
        i2k0Var.getClass();
        rdd0Var.getClass();
        this.a = b3k0Var;
        this.b = utiVar;
        this.c = psmVar;
        this.d = uy0Var;
        this.e = i2k0Var;
        this.f = rdd0Var;
        wwd0 wwd0VarA = xwd0.a(new w3k0(0));
        this.i = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
        ku90<k2k0> ku90Var = new ku90<>();
        this.w = ku90Var;
        this.y = e1i.a(ku90Var);
    }

    public final void A1(s2k0 s2k0Var) {
        this.f.a(s2k0Var, k00.d);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object x1(r3k0 r3k0Var, x1b x1bVar) {
        x3k0 x3k0Var;
        r3k0 r3k0Var2;
        String str;
        String str2;
        wwd0 wwd0Var;
        boolean z;
        boolean z2;
        boolean z3;
        Object value;
        w3k0 w3k0Var;
        w3k0.a.c cVar;
        boolean z4;
        AssetsInfo assetsInfoC;
        r3k0 r3k0Var3 = r3k0Var;
        if (x1bVar instanceof x3k0) {
            x3k0Var = (x3k0) x1bVar;
            int i = x3k0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                x3k0Var.e = i - Integer.MIN_VALUE;
            } else {
                x3k0Var = new x3k0(this, x1bVar);
            }
        } else {
            x3k0Var = new x3k0(this, x1bVar);
        }
        Object objF = x3k0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = x3k0Var.e;
        uti utiVar = this.b;
        psm psmVar = this.c;
        if (i2 == 0) {
            uj50.b(objF);
            if (r3k0Var3 instanceof r3k0.d) {
                y1(k2k0.c.a);
                return Unit.a;
            }
            String strE = s5y.e(new Long(r3k0Var3.a()));
            String strB = psmVar.B();
            uti.a[] aVarArr = uti.a.a;
            x3k0Var.a = r3k0Var3;
            x3k0Var.e = 1;
            objF = uti.f(utiVar, strE, strB, x3k0Var);
            if (objF != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            r3k0Var3 = x3k0Var.a;
            uj50.b(objF);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = x3k0Var.b;
            r3k0 r3k0Var4 = x3k0Var.a;
            uj50.b(objF);
            str = str3;
            r3k0Var2 = r3k0Var4;
        }
        str2 = (String) objF;
        wwd0Var = this.i;
        if (((w3k0) wwd0Var.getValue()).h && (r3k0Var2 instanceof r3k0.b)) {
            z = true;
        } else {
            z = false;
        }
        if (z || (assetsInfoC = this.d.c()) == null || assetsInfoC.balance >= ((r3k0.b) r3k0Var2).b) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!((w3k0) wwd0Var.getValue()).f || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        do {
            value = wwd0Var.getValue();
            w3k0Var = (w3k0) value;
            cVar = w3k0.a.c.a;
            if (!w3k0Var.h || z) {
                z4 = true;
            } else {
                z4 = false;
            }
        } while (!wwd0Var.g(value, w3k0.a(w3k0Var, cVar, r3k0Var2, str, str2, false, z3, null, z4, 80)));
        if (r3k0Var2 instanceof r3k0.b) {
            if (!this.z) {
                A1(s2k0.p.a);
                this.z = true;
            }
        } else if (r3k0Var2 instanceof r3k0.a) {
            if (!this.A) {
                A1(s2k0.x.a);
                A1(s2k0.v.a);
                this.A = true;
            }
        } else if (!(r3k0Var2 instanceof r3k0.c) && !Intrinsics.g(r3k0Var2, r3k0.d.a)) {
            uhc.a();
            return null;
        }
        if (z3 && !this.B) {
            A1(s2k0.f.a);
            this.B = true;
        }
        return Unit.a;
        String str4 = (String) objF;
        String strE2 = s5y.e(new Long(r3k0Var3.b()));
        String strB2 = psmVar.B();
        uti.a[] aVarArr2 = uti.a.a;
        x3k0Var.a = r3k0Var3;
        x3k0Var.b = str4;
        x3k0Var.e = 2;
        Object objF2 = uti.f(utiVar, strE2, strB2, x3k0Var);
        if (objF2 != y5bVar) {
            r3k0Var2 = r3k0Var3;
            str = str4;
            objF = objF2;
            str2 = (String) objF;
            wwd0Var = this.i;
            if (((w3k0) wwd0Var.getValue()).h) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (((w3k0) wwd0Var.getValue()).f) {
                z3 = true;
            } else {
                z3 = true;
            }
            do {
                value = wwd0Var.getValue();
                w3k0Var = (w3k0) value;
                cVar = w3k0.a.c.a;
                if (w3k0Var.h) {
                    z4 = true;
                } else {
                    z4 = true;
                }
            } while (!wwd0Var.g(value, w3k0.a(w3k0Var, cVar, r3k0Var2, str, str2, false, z3, null, z4, 80)));
            if (r3k0Var2 instanceof r3k0.b) {
                if (!this.z) {
                    A1(s2k0.p.a);
                    this.z = true;
                }
            } else if (r3k0Var2 instanceof r3k0.a) {
                if (!this.A) {
                    A1(s2k0.x.a);
                    A1(s2k0.v.a);
                    this.A = true;
                }
            } else if (!(r3k0Var2 instanceof r3k0.c)) {
                uhc.a();
                return null;
            }
            if (z3) {
                A1(s2k0.f.a);
                this.B = true;
            }
            return Unit.a;
        }
        return y5bVar;
    }

    public final void y1(k2k0 k2k0Var) {
        ej5.c(o8i0.d(this), null, null, new a(k2k0Var, null), 3);
    }

    public final void z1(g1k0 g1k0Var) {
        Object value;
        Object value2;
        Object value3;
        g1k0Var.getClass();
        if (g1k0Var.equals(g1k0.h.a) || g1k0Var.equals(g1k0.k.a)) {
            ej5.c(o8i0.d(this), null, null, new z3k0(this, null), 3);
            return;
        }
        if (g1k0Var.equals(g1k0.b.a)) {
            A1(s2k0.o.a);
            ej5.c(o8i0.d(this), null, null, new a4k0(this, null), 3);
            return;
        }
        if (g1k0Var.equals(g1k0.m.a)) {
            A1(s2k0.w.a);
            y1(k2k0.a.a);
            return;
        }
        if (g1k0Var.equals(g1k0.c.a)) {
            A1(s2k0.u.a);
            y1(k2k0.e.a);
            return;
        }
        if (g1k0Var.equals(g1k0.l.a)) {
            y1(k2k0.g.a);
            return;
        }
        if (g1k0Var.equals(g1k0.j.a)) {
            y1(k2k0.f.a);
            return;
        }
        if (g1k0Var.equals(g1k0.a.a)) {
            y1(k2k0.b.a);
            return;
        }
        if (g1k0Var.equals(g1k0.f.a)) {
            y1(k2k0.c.a);
            return;
        }
        if (g1k0Var.equals(g1k0.g.a)) {
            wwd0 wwd0Var = this.i;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, w3k0.a((w3k0) value3, null, null, null, null, false, false, null, false, 223)));
            this.B = false;
            return;
        }
        if (!g1k0Var.equals(g1k0.d.a)) {
            if (g1k0Var.equals(g1k0.e.a)) {
                wwd0 wwd0Var2 = this.i;
                do {
                    value = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value, w3k0.a((w3k0) value, null, null, null, null, false, false, null, false, 191)));
                return;
            } else if (g1k0Var.equals(g1k0.i.a)) {
                y1(k2k0.b.a);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        A1(s2k0.e.a);
        wwd0 wwd0Var3 = this.i;
        do {
            value2 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value2, w3k0.a((w3k0) value2, null, null, null, null, false, false, null, false, 223)));
        i2k0 i2k0Var = this.e;
        String str = ((w3k0) this.i.getValue()).c;
        i2k0Var.getClass();
        str.getClass();
        i2k0Var.a = new i2k0.a(System.currentTimeMillis(), str);
        y1(k2k0.d.a);
    }
}
