package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class t2f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final w2f w2fVar, final i0f i0fVar, d2f d2fVar, final Function0 function0, final Function0 function1, a aVar, final int i) {
        int i2;
        d2f d2fVar2;
        fmt fmtVar;
        boolean z;
        boolean z2;
        i0fVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(899809995);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(w2fVar) : bVarI.A(w2fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(i0fVar) : bVarI.A(i0fVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.d(d2fVar == null ? -1 : d2fVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            ont ontVarC = i350.c(new pnt.f("https://s.sporty.net/cms/GK_idle_7e623b53be.json"), bVarI, 0);
            String str = w2fVar.a;
            str.getClass();
            ont ontVarC2 = i350.c(new pnt.f(str), bVarI, 0);
            ont ontVarC3 = i350.c(new pnt.f("https://s.sporty.net/cms/PL_idle_39f33c3038.json"), bVarI, 0);
            ont ontVarC4 = i350.c(new pnt.f("https://s.sporty.net/cms/PL_kick_ceb91b0891.json"), bVarI, 0);
            String str2 = w2fVar.b;
            str2.getClass();
            ont ontVarC5 = i350.c(new pnt.f(str2), bVarI, 0);
            boolean zM = bVarI.M(ontVarC) | bVarI.M(ontVarC2) | bVarI.M(ontVarC3) | bVarI.M(ontVarC4) | bVarI.M(ontVarC5);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new vb00(ontVarC, ontVarC2, ontVarC3, ontVarC4, ontVarC5);
                bVarI.r(objY);
            }
            vb00 vb00Var = (vb00) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar = (ytw) objY2;
            fmt fmtVarA = lmt.a(bVarI);
            fmt fmtVarA2 = lmt.a(bVarI);
            fmt fmtVarA3 = lmt.a(bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(xpp.a);
                bVarI.r(objY3);
            }
            ytw ytwVar2 = (ytw) objY3;
            int i3 = i2;
            boolean zA = ((i2 & 7168) == 2048) | bVarI.A(vb00Var) | bVarI.M(fmtVarA2) | bVarI.M(fmtVarA3) | ((i3 & 57344) == 16384) | bVarI.M(fmtVarA) | ((i3 & 458752) == 131072);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                fmtVar = fmtVarA2;
                z = false;
                d2fVar2 = d2fVar;
                objY4 = new s2f(vb00Var, d2fVar2, fmtVar, fmtVarA3, function0, fmtVarA, function1, ytwVar, ytwVar2, null);
                bVarI.r(objY4);
            } else {
                fmtVar = fmtVarA2;
                z = false;
                d2fVar2 = d2fVar;
            }
            xvf.g(w2fVar, d2fVar2, (Function2) objY4, bVarI);
            d dVarE = j.e(dVar, 1.0f);
            aiv aivVarC = g75.c(ht.a.b, z);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            d.a aVar3 = d.a.b;
            d dVarE2 = j.e(aVar3, 1.0f);
            d dVarT = j.t(h.j(aVar3, 0.0f, i0fVar.f, 0.0f, 0.0f, 13), i0fVar.g, i0fVar.h);
            int iOrdinal = ((xpp) ytwVar2.getValue()).ordinal();
            if (iOrdinal != 0) {
                z2 = true;
                if (iOrdinal == 1) {
                    bVarI.N(267283337);
                    c850 c850Var = (c850) ytwVar.getValue();
                    b(dVarE2, c850Var != null ? c850Var.b : null, fmtVar, bVarI, 6);
                    c850 c850Var2 = (c850) ytwVar.getValue();
                    b(dVarT, c850Var2 != null ? c850Var2.e : null, fmtVarA, bVarI, 0);
                    c850 c850Var3 = (c850) ytwVar.getValue();
                    b(dVarT, c850Var3 != null ? c850Var3.d : null, fmtVarA3, bVarI, 0);
                    bVarI.X(false);
                } else {
                    if (iOrdinal != 2) {
                        throw igf0.a(bVarI, 2086808818, false);
                    }
                    bVarI.N(268027213);
                    c850 c850Var4 = (c850) ytwVar.getValue();
                    c(dVarE2, c850Var4 != null ? c850Var4.a : null, bVarI, 6);
                    c850 c850Var5 = (c850) ytwVar.getValue();
                    c(dVarT, c850Var5 != null ? c850Var5.c : null, bVarI, 0);
                    bVarI.X(false);
                }
            } else {
                z2 = true;
                bVarI.N(266572693);
                c850 c850Var6 = (c850) ytwVar.getValue();
                b(dVarE2, c850Var6 != null ? c850Var6.a : null, fmtVar, bVarI, 6);
                c850 c850Var7 = (c850) ytwVar.getValue();
                c(dVarT, c850Var7 != null ? c850Var7.e : null, bVarI, 0);
                c850 c850Var8 = (c850) ytwVar.getValue();
                b(dVarT, c850Var8 != null ? c850Var8.c : null, fmtVarA3, bVarI, 0);
                bVarI.X(false);
            }
            bVarI.X(z2);
        } else {
            d2fVar2 = d2fVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d2f d2fVar3 = d2fVar2;
            eVarZ.d = new Function2() { // from class: r2f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2f.a(dVar, w2fVar, i0fVar, d2fVar3, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final xmt xmtVar, final fmt fmtVar, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-2128084783);
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
                    eVarZ.d = new Function2() { // from class: p2f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            t2f.b(dVar, xmtVar, fmtVar, (a) obj, iA);
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
                objY = new xla(fmtVar, 1);
                bVarI.r(objY);
            }
            bVar = bVarI;
            mmt.b(xmtVar, (Function0) objY, dVar, false, false, false, false, null, false, null, null, d0b.a.d, false, false, null, null, false, bVar, ((i3 >> 3) & 14) | ((i3 << 6) & 896), 48, 129016);
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: q2f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    t2f.b(dVar, xmtVar, fmtVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final xmt xmtVar, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-1521809228);
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
                    eVarZ.d = new Function2() { // from class: m2f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            t2f.c(dVar, xmtVar, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new n2f(0);
                bVarI.r(objY);
            }
            bVar = bVarI;
            mmt.b(xmtVar, (Function0) objY, dVar, false, false, false, false, null, false, null, null, d0b.a.d, false, false, null, null, false, bVar, ((i3 >> 3) & 14) | 48 | ((i3 << 6) & 896), 48, 129016);
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: o2f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    t2f.c(dVar, xmtVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
