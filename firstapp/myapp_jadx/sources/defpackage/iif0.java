package defpackage;

import androidx.compose.runtime.m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class iif0 {
    public final c A;
    public final b B;
    public boolean C;
    public final odh0 a;
    public mly b;
    public Function1<? super ijf0, Unit> c;
    public n6s d;
    public final ytw<ijf0> e;
    public uni0 f;
    public Function0<Unit> g;
    public ms7 h;
    public v5b i;
    public vj10 j;
    public jmf0 k;
    public zdl l;
    public b5i m;
    public final ytw n;
    public final ytw o;
    public long p;
    public ulf0 q;
    public long r;
    public final ytw s;
    public final ytw t;
    public int u;
    public ijf0 v;
    public cw90 w;
    public ulf0 x;
    public final ytw y;
    public final yzf0 z;

    @c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {539}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vj10 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ ulf0 e;
        public final /* synthetic */ iif0 f;
        public final /* synthetic */ mly i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vj10 vj10Var, String str, long j, ulf0 ulf0Var, iif0 iif0Var, mly mlyVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = vj10Var;
            this.c = str;
            this.d = j;
            this.e = ulf0Var;
            this.f = iif0Var;
            this.i = mlyVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            String str = this.c;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                obj = this.b.b(str, this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ulf0 ulf0Var = (ulf0) obj;
            if (ulf0Var == null) {
                return Unit.a;
            }
            long j = ulf0Var.a;
            mly mlyVar = this.i;
            long jA = vlf0.a(mlyVar.a((int) (j >> 32)), mlyVar.a((int) (j & 4294967295L)));
            if (!ulf0.a(this.e, jA)) {
                iif0 iif0Var = this.f;
                if (Intrinsics.g(iif0Var.j().a.b, str) && mlyVar == iif0Var.b) {
                    iif0Var.c.invoke(iif0.b(iif0Var.j().a, jA));
                    iif0Var.x = new ulf0(jA);
                }
            }
            return Unit.a;
        }
    }

    public static final class b implements g6w {
        public boolean a = true;
        public ulf0 b;

        public b() {
        }

        @Override // defpackage.g6w
        public final void a() {
            if (this.a) {
                iif0.this.l(this.b);
            }
        }

        @Override // defpackage.g6w
        public final boolean b(long j, w780 w780Var) {
            n6s n6sVar;
            iif0 iif0Var = iif0.this;
            if (!iif0Var.g() || iif0Var.j().a.b.length() == 0 || (n6sVar = iif0Var.d) == null || n6sVar.d() == null) {
                return false;
            }
            d(iif0Var.j(), j, false, w780Var);
            return true;
        }

        @Override // defpackage.g6w
        public final boolean c(long j, w780 w780Var, int i) {
            n6s n6sVar;
            iif0 iif0Var = iif0.this;
            if (!iif0Var.g() || iif0Var.j().a.b.length() == 0 || (n6sVar = iif0Var.d) == null || n6sVar.d() == null) {
                return false;
            }
            b5i b5iVar = iif0Var.m;
            if (b5iVar != null) {
                b5i.b(b5iVar);
            }
            iif0Var.p = j;
            iif0Var.u = -1;
            iif0Var.e(true);
            long jD = d(iif0Var.j(), iif0Var.p, true, w780Var);
            if (i >= 2) {
                this.a = true;
                this.b = new ulf0(jD);
            }
            return true;
        }

        public final long d(ijf0 ijf0Var, long j, boolean z, w780 w780Var) {
            iif0 iif0Var = iif0.this;
            long jU = iif0Var.u(ijf0Var, j, z, false, w780Var, false);
            if (!ulf0.a(this.b, jU)) {
                this.a = false;
            }
            iif0Var.q(ulf0.c(jU) ? ocl.c : ocl.b);
            return jU;
        }
    }

    public iif0(odh0 odh0Var) {
        this.a = odh0Var;
        this.b = luh0.a;
        this.c = new zhf0();
        this.e = m.b(new ijf0((String) null, 0L, 7));
        this.f = uni0.a.a;
        Boolean bool = Boolean.TRUE;
        this.n = m.b(bool);
        this.o = m.b(bool);
        this.p = 0L;
        this.r = 0L;
        this.s = m.b(null);
        this.t = m.b(null);
        this.u = -1;
        this.v = new ijf0((String) null, 0L, 7);
        this.y = m.b(null);
        this.z = new yzf0();
        this.A = new c();
        this.B = new b();
    }

    public static ijf0 b(nk0 nk0Var, long j) {
        return new ijf0(nk0Var, j, (ulf0) null);
    }

    public final jvd0 a(boolean z) {
        v5b v5bVar = this.i;
        if (v5bVar != null) {
            return ej5.c(v5bVar, null, a6b.d, new eif0(this, z, null), 1);
        }
        return null;
    }

    public final void c() {
        v5b v5bVar = this.i;
        if (v5bVar != null) {
            ej5.c(v5bVar, null, a6b.d, new gif0(this, null), 1);
        }
    }

    public final void d(gly glyVar) {
        if (!ulf0.c(j().b)) {
            n6s n6sVar = this.d;
            vkf0 vkf0VarD = n6sVar != null ? n6sVar.d() : null;
            int iE = (glyVar == null || vkf0VarD == null) ? ulf0.e(j().b) : this.b.a(vkf0VarD.b(glyVar.a, true));
            ijf0 ijf0VarA = ijf0.a(j(), null, vlf0.a(iE, iE), 5);
            this.c.invoke(ijf0VarA);
            this.x = new ulf0(ijf0VarA.b);
        }
        q((glyVar == null || j().a.b.length() <= 0) ? ocl.a : ocl.c);
        t(false);
    }

    public final void e(boolean z) {
        b5i b5iVar;
        n6s n6sVar = this.d;
        if (n6sVar != null && !n6sVar.b() && (b5iVar = this.m) != null) {
            b5i.b(b5iVar);
        }
        this.v = j();
        t(z);
        q(ocl.b);
    }

    public final gly f() {
        return (gly) ((x5a0) this.t).getValue();
    }

    public final boolean g() {
        return ((Boolean) ((x5a0) this.o).getValue()).booleanValue();
    }

    public final long h(boolean z) {
        vkf0 vkf0VarD;
        long j;
        n6s n6sVar = this.d;
        if (n6sVar == null || (vkf0VarD = n6sVar.d()) == null) {
            return 9205357640488583168L;
        }
        ukf0 ukf0Var = vkf0VarD.a;
        zjw zjwVar = ukf0Var.b;
        nk0 nk0VarI = i();
        if (nk0VarI == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.g(nk0VarI.b, ukf0Var.a.a.b)) {
            return 9205357640488583168L;
        }
        ijf0 ijf0VarJ = j();
        if (z) {
            long j2 = ijf0VarJ.b;
            int i = ulf0.c;
            j = j2 >> 32;
        } else {
            long j3 = ijf0VarJ.b;
            int i2 = ulf0.c;
            j = j3 & 4294967295L;
        }
        int iB = this.b.b((int) j);
        boolean zG = ulf0.g(j().b);
        long j4 = ukf0Var.c;
        int iD = zjwVar.d(iB);
        if (iD >= zjwVar.f) {
            return 9205357640488583168L;
        }
        boolean z2 = ukf0Var.a(((!z || zG) && (z || !zG)) ? Math.max(iB + (-1), 0) : iB) == ukf0Var.j(iB);
        zjwVar.k(iB);
        int length = zjwVar.a.a.b.length();
        ArrayList arrayList = zjwVar.h;
        jrz jrzVar = (jrz) arrayList.get(iB == length ? arrayList.size() - 1 : kf9.b(iB, arrayList));
        return (((long) Float.floatToRawIntBits(f.d(zjwVar.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f.d(jrzVar.a.e(jrzVar.d(iB), z2), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final nk0 i() {
        n6s n6sVar = this.d;
        if (n6sVar != null) {
            return n6sVar.a.a;
        }
        return null;
    }

    public final ijf0 j() {
        return (ijf0) ((x5a0) this.e).getValue();
    }

    public final void k() {
        jvd0 jvd0Var;
        xef0 xef0Var = this.z.a;
        if (xef0Var == null || (jvd0Var = xef0Var.J) == null) {
            return;
        }
        jvd0Var.cancel((CancellationException) null);
        xef0Var.J = null;
    }

    public final void l(ulf0 ulf0Var) {
        nk0 nk0VarI;
        String str;
        v5b v5bVar;
        if (ulf0Var == null) {
            return;
        }
        long j = ulf0Var.a;
        vj10 vj10Var = this.j;
        if (vj10Var == null || (nk0VarI = i()) == null || (str = nk0VarI.b) == null) {
            return;
        }
        mly mlyVar = this.b;
        long jA = vlf0.a(mlyVar.b((int) (j >> 32)), mlyVar.b((int) (j & 4294967295L)));
        if (str.length() <= 0 || ulf0.c(jA) || (v5bVar = this.i) == null) {
            return;
        }
        ej5.c(v5bVar, null, null, new a(vj10Var, str, jA, ulf0Var, this, mlyVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(x1b x1bVar) {
        jif0 jif0Var;
        String str;
        ulf0 ulf0Var;
        if (x1bVar instanceof jif0) {
            jif0Var = (jif0) x1bVar;
            int i = jif0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jif0Var.c = i - Integer.MIN_VALUE;
            } else {
                jif0Var = new jif0(this, x1bVar);
            }
        } else {
            jif0Var = new jif0(this, x1bVar);
        }
        Object obj = jif0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jif0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            nk0 nk0VarI = i();
            if (nk0VarI != null && (str = nk0VarI.b) != null && (ulf0Var = this.x) != null) {
                long j = ulf0Var.a;
                vj10 vj10Var = this.j;
                if (vj10Var != null) {
                    long jA = vlf0.a(this.b.b((int) (j >> 32)), this.b.b((int) (j & 4294967295L)));
                    jif0Var.c = 1;
                    if (vj10Var.a(str, jA, jif0Var) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    public final void n() {
        v5b v5bVar = this.i;
        if (v5bVar != null) {
            ej5.c(v5bVar, null, a6b.d, new kif0(this, null), 1);
        }
    }

    public final void o(gly glyVar) {
        ((x5a0) this.t).setValue(glyVar);
    }

    public final void p(lcl lclVar) {
        ((x5a0) this.s).setValue(lclVar);
    }

    public final void q(ocl oclVar) {
        n6s n6sVar = this.d;
        if (n6sVar != null) {
            if (n6sVar.a() == oclVar) {
                n6sVar = null;
            }
            if (n6sVar != null) {
                ((x5a0) n6sVar.k).setValue(oclVar);
            }
        }
    }

    public final void r() {
        n6s n6sVar;
        oef0 oef0Var;
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            if (g() && ((n6sVar = this.d) == null || ((Boolean) ((x5a0) n6sVar.q).getValue()).booleanValue())) {
                Unit unit = Unit.a;
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                xef0 xef0Var = this.z.a;
                if (xef0Var == null) {
                    zkn.d("ToolbarRequester is not initialized.");
                    fkd.a();
                    return;
                } else {
                    if (xef0Var.C) {
                        jvd0 jvd0Var = xef0Var.J;
                        if ((jvd0Var == null || !jvd0Var.isActive()) && (oef0Var = (oef0) zma.a(xef0Var, ref0.b)) != null) {
                            xef0Var.J = ej5.c(xef0Var.d2(), null, a6b.d, new wef0(xef0Var, oef0Var, null), 1);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(x1b x1bVar) {
        lif0 lif0Var;
        if (x1bVar instanceof lif0) {
            lif0Var = (lif0) x1bVar;
            int i = lif0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lif0Var.d = i - Integer.MIN_VALUE;
            } else {
                lif0Var = new lif0(this, x1bVar);
            }
        } else {
            lif0Var = new lif0(this, x1bVar);
        }
        Object objA = lif0Var.b;
        Object obj = y5b.a;
        int i2 = lif0Var.d;
        ks7 ks7Var = null;
        if (i2 == 0) {
            uj50.b(objA);
            ms7 ms7Var = this.h;
            if (ms7Var != null) {
                lif0Var.a = this;
                lif0Var.d = 1;
                objA = ms7Var.a();
                if (objA == obj) {
                    return obj;
                }
            }
            ((x5a0) this.y).setValue(ks7Var);
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = lif0Var.a;
        uj50.b(objA);
        ks7Var = (ks7) objA;
        ((x5a0) this.y).setValue(ks7Var);
        return Unit.a;
    }

    public final void t(boolean z) {
        n6s n6sVar = this.d;
        if (n6sVar != null) {
            ((x5a0) n6sVar.l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            k();
        }
    }

    public final long u(ijf0 ijf0Var, long j, boolean z, boolean z2, w780 w780Var, boolean z3) {
        vkf0 vkf0VarD;
        long j2;
        s780 s780Var;
        boolean z4;
        boolean z5;
        zdl zdlVar;
        n6s n6sVar = this.d;
        if (n6sVar == null || (vkf0VarD = n6sVar.d()) == null) {
            return ulf0.b;
        }
        mly mlyVar = this.b;
        long j3 = ijf0Var.b;
        nk0 nk0Var = ijf0Var.a;
        int i = ulf0.c;
        long jA = vlf0.a(mlyVar.b((int) (j3 >> 32)), this.b.b((int) (j3 & 4294967295L)));
        int iB = vkf0VarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jA >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jA & 4294967295L);
        cw90 cw90Var = this.w;
        int i4 = -1;
        if (z || cw90Var == null) {
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i5 = this.u;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        ukf0 ukf0Var = vkf0VarD.a;
        if (z) {
            s780Var = null;
        } else {
            int i6 = (int) (jA >> 32);
            int i7 = (int) (jA & j2);
            s780Var = new s780(new s780.a(jh8.a(ukf0Var, i6), i6, 1L), new s780.a(jh8.a(ukf0Var, i7), i7, 1L), ulf0.g(jA));
        }
        cw90 cw90Var2 = new cw90(z2, s780Var, new j780(i2, i3, i4, ukf0Var));
        if (s780Var != null && cw90Var != null && z2 == cw90Var.a) {
            j780 j780Var = cw90Var.c;
            if (i2 == j780Var.a && i3 == j780Var.b) {
                return j3;
            }
        }
        this.w = cw90Var2;
        this.u = iB;
        s780 s780VarA = w780Var.a(cw90Var2);
        long jA2 = vlf0.a(this.b.a(s780VarA.a.b), this.b.a(s780VarA.b.b));
        if (ulf0.b(jA2, j3)) {
            return j3;
        }
        boolean z6 = ulf0.g(jA2) != ulf0.g(j3) && ulf0.b(vlf0.a((int) (jA2 & j2), (int) (jA2 >> 32)), j3);
        boolean z7 = ulf0.c(jA2) && ulf0.c(j3);
        if (z3 && nk0Var.b.length() > 0 && !z6 && !z7 && (zdlVar = this.l) != null) {
            zdlVar.a(9);
        }
        this.c.invoke(b(nk0Var, jA2));
        this.x = new ulf0(jA2);
        if (!z3) {
            t(!ulf0.c(jA2));
        }
        n6s n6sVar2 = this.d;
        if (n6sVar2 != null) {
            ((x5a0) n6sVar2.q).setValue(Boolean.valueOf(z3));
        }
        n6s n6sVar3 = this.d;
        if (n6sVar3 != null) {
            ((x5a0) n6sVar3.m).setValue(Boolean.valueOf(!ulf0.c(jA2) && nif0.b(this, true)));
        }
        n6s n6sVar4 = this.d;
        if (n6sVar4 != null) {
            if (ulf0.c(jA2)) {
                z4 = false;
            } else {
                z4 = false;
                if (nif0.b(this, false)) {
                    z5 = true;
                }
                ((x5a0) n6sVar4.n).setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            ((x5a0) n6sVar4.n).setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        n6s n6sVar5 = this.d;
        if (n6sVar5 != null) {
            if (ulf0.c(jA2) && nif0.b(this, true)) {
                z4 = true;
            }
            ((x5a0) n6sVar5.o).setValue(Boolean.valueOf(z4));
        }
        return jA2;
    }

    public static final class c implements fff0 {
        public boolean a = true;

        public c() {
        }

        @Override // defpackage.fff0
        public final void b(long j) {
            long j2;
            vkf0 vkf0VarD;
            vkf0 vkf0VarD2;
            iif0 iif0Var = iif0.this;
            if (iif0Var.g() && ((lcl) ((x5a0) iif0Var.s).getValue()) == null) {
                iif0Var.p(lcl.c);
                iif0Var.u = -1;
                this.a = true;
                iif0Var.k();
                n6s n6sVar = iif0Var.d;
                if (n6sVar == null || (vkf0VarD2 = n6sVar.d()) == null || !vkf0VarD2.c(j)) {
                    j2 = j;
                    n6s n6sVar2 = iif0Var.d;
                    if (n6sVar2 != null && (vkf0VarD = n6sVar2.d()) != null) {
                        int iA = iif0Var.b.a(vkf0VarD.b(j2, true));
                        ijf0 ijf0VarB = iif0.b(iif0Var.j().a, vlf0.a(iA, iA));
                        iif0Var.e(false);
                        zdl zdlVar = iif0Var.l;
                        if (zdlVar != null) {
                            zdlVar.a(9);
                        }
                        iif0Var.c.invoke(ijf0VarB);
                        iif0Var.x = new ulf0(ijf0VarB.b);
                    }
                    this.a = false;
                } else {
                    if (iif0Var.j().a.b.length() == 0) {
                        return;
                    }
                    iif0Var.e(false);
                    j2 = j;
                    iif0Var.q = new ulf0(iif0Var.u(ijf0.a(iif0Var.j(), null, ulf0.b, 5), j, true, false, w780.a.b, true));
                }
                iif0Var.q(ocl.a);
                iif0Var.p = j2;
                iif0Var.o(new gly(j2));
                iif0Var.r = 0L;
            }
        }

        @Override // defpackage.fff0
        public final void c() {
            f();
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0089  */
        /* JADX WARN: Code duplicated, block: B:21:0x008d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0094  */
        @Override // defpackage.fff0
        public final void e(long j) {
            vkf0 vkf0VarD;
            ulf0 ulf0Var;
            int iB;
            long jU;
            iif0 iif0Var = iif0.this;
            if (!iif0Var.g() || iif0Var.j().a.b.length() == 0) {
                return;
            }
            iif0Var.r = gly.f(iif0Var.r, j);
            n6s n6sVar = iif0Var.d;
            if (n6sVar != null && (vkf0VarD = n6sVar.d()) != null) {
                iif0Var.o(new gly(gly.f(iif0Var.p, iif0Var.r)));
                ulf0 ulf0Var2 = iif0Var.q;
                w780 w780Var = w780.a.b;
                if (ulf0Var2 == null) {
                    gly glyVarF = iif0Var.f();
                    glyVarF.getClass();
                    if (vkf0VarD.c(glyVarF.a)) {
                        ulf0Var = iif0Var.q;
                        if (ulf0Var != null) {
                            iB = (int) (ulf0Var.a >> 32);
                        } else {
                            iB = vkf0VarD.b(iif0Var.p, false);
                        }
                        gly glyVarF2 = iif0Var.f();
                        glyVarF2.getClass();
                        int iB2 = vkf0VarD.b(glyVarF2.a, false);
                        if (iif0Var.q != null && iB == iB2) {
                            return;
                        }
                        ijf0 ijf0VarJ = iif0Var.j();
                        gly glyVarF3 = iif0Var.f();
                        glyVarF3.getClass();
                        jU = iif0Var.u(ijf0VarJ, glyVarF3.a, false, false, w780Var, true);
                    } else {
                        int iA = iif0Var.b.a(vkf0VarD.b(iif0Var.p, true));
                        mly mlyVar = iif0Var.b;
                        gly glyVarF4 = iif0Var.f();
                        glyVarF4.getClass();
                        if (iA == mlyVar.a(vkf0VarD.b(glyVarF4.a, true))) {
                            w780Var = w780.a.a;
                        }
                        ijf0 ijf0VarJ2 = iif0Var.j();
                        gly glyVarF5 = iif0Var.f();
                        glyVarF5.getClass();
                        jU = iif0Var.u(ijf0VarJ2, glyVarF5.a, false, false, w780Var, true);
                    }
                } else {
                    ulf0Var = iif0Var.q;
                    if (ulf0Var != null) {
                        iB = (int) (ulf0Var.a >> 32);
                    } else {
                        iB = vkf0VarD.b(iif0Var.p, false);
                    }
                    gly glyVarF6 = iif0Var.f();
                    glyVarF6.getClass();
                    int iB3 = vkf0VarD.b(glyVarF6.a, false);
                    if (iif0Var.q != null) {
                    }
                    ijf0 ijf0VarJ3 = iif0Var.j();
                    gly glyVarF7 = iif0Var.f();
                    glyVarF7.getClass();
                    jU = iif0Var.u(ijf0VarJ3, glyVarF7.a, false, false, w780Var, true);
                }
                if (!ulf0.a(iif0Var.q, jU)) {
                    this.a = false;
                }
            }
            iif0Var.t(false);
        }

        public final void f() {
            iif0 iif0Var = iif0.this;
            iif0Var.p(null);
            iif0Var.o(null);
            iif0Var.t(true);
            boolean zC = ulf0.c(iif0Var.j().b);
            iif0Var.q(zC ? ocl.c : ocl.b);
            n6s n6sVar = iif0Var.d;
            if (n6sVar != null) {
                ((x5a0) n6sVar.m).setValue(Boolean.valueOf(!zC && nif0.b(iif0Var, true)));
            }
            n6s n6sVar2 = iif0Var.d;
            if (n6sVar2 != null) {
                ((x5a0) n6sVar2.n).setValue(Boolean.valueOf(!zC && nif0.b(iif0Var, false)));
            }
            n6s n6sVar3 = iif0Var.d;
            if (n6sVar3 != null) {
                ((x5a0) n6sVar3.o).setValue(Boolean.valueOf(zC && nif0.b(iif0Var, true)));
            }
            if (this.a) {
                iif0Var.l(iif0Var.q);
            }
            iif0Var.q = null;
        }

        @Override // defpackage.fff0
        public final void onCancel() {
            f();
        }

        @Override // defpackage.fff0
        public final void a() {
        }

        @Override // defpackage.fff0
        public final void d() {
        }
    }

    public iif0() {
        this(null);
    }
}
