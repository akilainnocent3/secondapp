package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iqp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final c2d0 c2d0Var, final eb00 eb00Var, Function0 function0, a aVar, final int i) throws FileNotFoundException {
        int i2;
        b bVar;
        fmt fmtVar;
        Object gqpVar;
        boolean z;
        ytw ytwVar;
        boolean z2;
        boolean z3;
        final Function0 function1 = function0;
        function1.getClass();
        b bVarI = aVar.i(-191056384);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(c2d0Var) : bVarI.A(c2d0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(eb00Var) : bVarI.A(eb00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            ont ontVarC = i350.c(new pnt.f("https://s.sporty.net/cms/GK_idle_7e623b53be.json"), bVarI, 0);
            String str = c2d0Var.a;
            str.getClass();
            ont ontVarC2 = i350.c(new pnt.f(str), bVarI, 0);
            String str2 = c2d0Var.b;
            str2.getClass();
            ont ontVarC3 = i350.c(new pnt.f(str2), bVarI, 0);
            String str3 = c2d0Var.c;
            str3.getClass();
            ont ontVarC4 = i350.c(new pnt.f(str3), bVarI, 0);
            String str4 = c2d0Var.d;
            str4.getClass();
            ont ontVarC5 = i350.c(new pnt.f(str4), bVarI, 0);
            boolean zM = bVarI.M(ontVarC) | bVarI.M(ontVarC2) | bVarI.M(ontVarC3) | bVarI.M(ontVarC4) | bVarI.M(ontVarC5);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                ub00 ub00Var = new ub00(ontVarC, ontVarC2, ontVarC3, ontVarC4, ontVarC5);
                bVarI.r(ub00Var);
                objY = ub00Var;
            }
            ub00 ub00Var2 = (ub00) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            fmt fmtVarA = lmt.a(bVarI);
            fmt fmtVarA2 = lmt.a(bVarI);
            fmt fmtVarA3 = lmt.a(bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(wpp.a);
                bVarI.r(objY3);
            }
            ytw ytwVar3 = (ytw) objY3;
            twd0 twd0VarB = xe0.b(((wpp) ytwVar3.getValue()) == wpp.d ? 1.0f : 0.0f, yi0.e(300, 0, null, 6), "finished_layer_alpha", null, bVarI, 3120, 20);
            bVar = bVarI;
            boolean zM2 = ((i2 & 7168) == 2048) | bVar.M(ub00Var2) | bVar.M(fmtVarA2) | bVar.M(fmtVarA3) | bVar.M(fmtVarA);
            Object objY4 = bVar.y();
            if (zM2 || objY4 == c0042a) {
                fmtVar = fmtVarA3;
                z = false;
                gqpVar = new gqp(ub00Var2, fmtVarA2, fmtVar, fmtVarA, function1, ytwVar2, ytwVar3, null);
                ytwVar = ytwVar3;
                bVar.r(gqpVar);
            } else {
                fmtVar = fmtVarA3;
                gqpVar = objY4;
                ytwVar = ytwVar3;
                z = false;
            }
            xvf.e(bVar, c2d0Var, (Function2) gqpVar);
            d dVarE = j.e(r21, 1.0f);
            aiv aivVarC = g75.c(ht.a.b, z);
            int iHashCode = Long.hashCode(bVar.T);
            ne00 ne00VarS = bVar.S();
            d dVarC = c.c(bVar, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, aivVarC, yka.a.f);
            hlh0.a(bVar, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            }
            hlh0.a(bVar, dVarC, yka.a.d);
            bVar.N(913706140);
            float f = eb00Var.a;
            d dVarE2 = j.e(r21, 1.0f);
            fmt fmtVar2 = fmtVar;
            d dVarT = j.t(h.j(aVar2, 0.0f, f, 0.0f, 0.0f, 13), eb00Var.b, eb00Var.c);
            int iOrdinal = ((wpp) ytwVar.getValue()).ordinal();
            if (iOrdinal != 0) {
                z2 = true;
                if (iOrdinal == 1) {
                    bVar.N(914221762);
                    b850 b850Var = (b850) ytwVar2.getValue();
                    d(dVarE2, b850Var != null ? b850Var.a : null, fmtVarA2, bVar, 6);
                    b850 b850Var2 = (b850) ytwVar2.getValue();
                    z3 = false;
                    e(dVarT, b850Var2 != null ? b850Var2.e : null, bVar, 0);
                    b850 b850Var3 = (b850) ytwVar2.getValue();
                    d(dVarT, b850Var3 != null ? b850Var3.c : null, fmtVar2, bVar, 0);
                    bVar.X(false);
                } else if (iOrdinal == 2) {
                    bVar.N(914930391);
                    b850 b850Var4 = (b850) ytwVar2.getValue();
                    d(dVarE2, b850Var4 != null ? b850Var4.b : null, fmtVarA2, bVar, 6);
                    b850 b850Var5 = (b850) ytwVar2.getValue();
                    z3 = false;
                    d(dVarT, b850Var5 != null ? b850Var5.e : null, fmtVarA, bVar, 0);
                    b850 b850Var6 = (b850) ytwVar2.getValue();
                    d(dVarT, b850Var6 != null ? b850Var6.d : null, fmtVar2, bVar, 0);
                    bVar.X(false);
                } else {
                    if (iOrdinal != 3) {
                        throw igf0.a(bVar, -524703126, false);
                    }
                    bVar.N(915672996);
                    d dVarA = dw.a(dVarE2, ((Number) twd0VarB.getValue()).floatValue());
                    b850 b850Var7 = (b850) ytwVar2.getValue();
                    z3 = false;
                    e(dVarA, b850Var7 != null ? b850Var7.a : null, bVar, 0);
                    d dVarA2 = dw.a(dVarT, ((Number) twd0VarB.getValue()).floatValue());
                    b850 b850Var8 = (b850) ytwVar2.getValue();
                    e(dVarA2, b850Var8 != null ? b850Var8.c : null, bVar, 0);
                    bVar.X(false);
                }
            } else {
                z2 = true;
                z3 = false;
                bVar.N(914054548);
                if (((b850) ytwVar2.getValue()) == null) {
                    bVar.X(false);
                } else {
                    bVar.X(false);
                }
            }
            bVar.X(z3);
            bVar.X(z2);
        } else {
            bVar = bVarI;
            function1 = function1;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zpp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    iqp.a(c2d0Var, eb00Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final g2d0 g2d0Var, final eb00 eb00Var, a aVar, final int i) throws FileNotFoundException {
        int i2;
        b bVarI = aVar.i(191826900);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(g2d0Var) : bVarI.A(g2d0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(eb00Var) : bVarI.A(eb00Var) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            ont ontVarC = i350.c(new pnt.f("https://s.sporty.net/cms/GK_idle_7e623b53be.json"), bVarI, 0);
            ont ontVarC2 = i350.c(new pnt.f(g2d0Var.a), bVarI, 0);
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            float f = eb00Var.a;
            d dVarE2 = j.e(aVar2, 1.0f);
            d dVarT = j.t(h.j(aVar2, 0.0f, f, 0.0f, 0.0f, 13), eb00Var.b, eb00Var.c);
            e(dVarE2, ontVarC.getValue(), bVarI, 6);
            e(dVarT, ontVarC2.getValue(), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: aqp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    iqp.b(g2d0Var, eb00Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(d dVar, final h2d0 h2d0Var, final eb00 eb00Var, final Function0 function0, a aVar, final int i) {
        h2d0Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-5666976);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(h2d0Var) : bVarI.A(h2d0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(eb00Var) : bVarI.A(eb00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            if (h2d0Var instanceof c2d0) {
                bVarI.N(-1150986189);
                a((c2d0) h2d0Var, eb00Var, function0, bVarI, i2 & 8190);
                bVarI.X(false);
            } else if (h2d0Var instanceof g2d0) {
                bVarI.N(-1150977636);
                b((g2d0) h2d0Var, eb00Var, bVarI, i2 & 1022);
                bVarI.X(false);
            } else {
                bVarI.N(-1320412478);
                bVarI.X(false);
            }
            dVar = d.a.b;
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ypp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iqp.c(dVar2, h2d0Var, eb00Var, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final d dVar, final xmt xmtVar, final fmt fmtVar, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(492803521);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.A(xmtVar) ? 32 : 16) | (bVarI.M(fmtVar) ? 256 : 128);
        if (!bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            bVar = bVarI;
            bVar.G();
        } else {
            if (xmtVar == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: dqp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            iqp.d(dVar, xmtVar, fmtVar, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z = (i3 & 896) == 256;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new ynf(fmtVar, 1);
                bVarI.r(objY);
            }
            bVar = bVarI;
            mmt.b(xmtVar, (Function0) objY, dVar, false, false, false, false, null, false, null, null, d0b.a.d, false, false, null, null, false, bVar, ((i3 >> 3) & 14) | ((i3 << 6) & 896), 48, 129016);
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: eqp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    iqp.d(dVar, xmtVar, fmtVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final d dVar, final xmt xmtVar, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-969274716);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.A(xmtVar) ? 32 : 16);
        if (!bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            bVar = bVarI;
            bVar.G();
        } else {
            if (xmtVar == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: bqp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            iqp.e(dVar, xmtVar, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new cqp(0);
                bVarI.r(objY);
            }
            bVar = bVarI;
            mmt.b(xmtVar, (Function0) objY, dVar, false, false, false, false, null, false, null, null, d0b.a.d, false, false, null, null, false, bVar, ((i3 >> 3) & 14) | 48 | ((i3 << 6) & 896), 48, 129016);
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new x27(dVar, i, 1, xmtVar);
        }
    }

    public static final b850 f(ub00 ub00Var) {
        xmt value = ub00Var.a.getValue();
        if (value == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value2 = ub00Var.b.getValue();
        if (value2 == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value3 = ub00Var.c.getValue();
        if (value3 == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value4 = ub00Var.d.getValue();
        if (value4 == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value5 = ub00Var.e.getValue();
        if (value5 != null) {
            return new b850(value, value2, value3, value4, value5);
        }
        ib5.a("Required value was null.");
        return null;
    }
}
