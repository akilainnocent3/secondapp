package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportygames.newcms.c;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class sf80 {
    public static final void a(final dp20 dp20Var, final mxs mxsVar, final boolean z, final jaj jajVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-464807753);
        int i3 = i & 6;
        d dVar = d.a;
        if (i3 == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dp20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(mxsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(jajVar) ? 16384 : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) bVarI.O(c.a);
            androidx.compose.ui.d dVarB = d35.b(androidx.compose.foundation.a.a(ls7.a(j.D(h.j(dVar.b(androidx.compose.ui.d.a.b, ht.a.i), 0.0f, 0.0f, 12.0f, 12.0f, 3), null, 3), j060.c(12.0f)), ya5.a.d(kotlin.collections.b.k(new j58(r58.d(4280399872L)), new j58(r58.d(4280580608L))), 0L, 0L, 14), null, 0.0f, 6), 1.0f, ya5.a.d(kotlin.collections.b.k(new j58(r58.d(4282579458L)), new j58(r58.d(4282305284L))), 0L, 0L, 14), j060.c(12.0f));
            boolean zA = ((i2 & 7168) == 2048) | bVarI.A(bVar) | ((57344 & i2) == 16384) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: mf80
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z) {
                            bVar.c(lu00.b2.R1);
                        }
                        dp20 dp20Var2 = dp20Var;
                        jajVar.l(Double.valueOf(dp20Var2.e), Long.valueOf(dp20Var2.a), dp20Var2.b, dp20Var2.c, dp20Var2.i);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY, 15);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarD);
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
            b(dp20Var, mxsVar, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nf80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sf80.a(dp20Var, mxsVar, z, jajVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(dp20 dp20Var, mxs mxsVar, a aVar, final int i) {
        int i2;
        final dp20 dp20Var2 = dp20Var;
        final mxs mxsVar2 = mxsVar;
        b bVarI = aVar.i(1234570858);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dp20Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(mxsVar2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            kw0.i iVar = new kw0.i(4.0f, true, new hw0());
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarF = h.f(aVar2, 10.0f);
            i78 i78VarA = g78.a(iVar, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            String strC = c.c(lu00.b2.q, new String[0], bVarI);
            long jB = i7f.b(16.0f, bVarI);
            t9i t9iVar = t9i.e;
            long j = j58.f;
            int i3 = ((i2 << 15) & 3670016) | 196992;
            lkf0.b(strC, null, j, jB, null, t9iVar, mxsVar2, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3, 0, 130962);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.l, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String upperCase = dp20Var.c.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            dp20Var2 = dp20Var;
            mxsVar2 = mxsVar;
            lkf0.b(upperCase, null, j, i7f.b(10.0f, bVarI), null, t9iVar, mxsVar2, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3, 0, 130962);
            NumberFormat numberFormat = d6f.a;
            lkf0.b(d6f.a(dp20Var2.e), null, j, i7f.b(12.0f, bVarI), null, t9iVar, mxsVar2, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3, 0, 130962);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pf80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    sf80.b(dp20Var2, mxsVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final dp20 dp20Var, final mxs mxsVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(669782151);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dp20Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(mxsVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(d35.a(ls7.a(h.j(aVar2, 0.0f, 0.0f, 0.0f, 12.0f, 7), j060.c(4.0f)), 1.0f, r58.d(4290941506L), j060.c(4.0f)), r58.d(4279637526L), zk40.a);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mw90.a(c.c(lu00.b2.t, new String[0], bVarI), "Groups Icon", j.r(h.j(aVar2, 12.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), null, null, d0b.a.b, null, bVarI, 1573296, 1976);
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            lkf0.b(m58.a(dp20Var.f, " Online"), null, j58.f, i7f.b(10.0f, bVarI), null, t9i.e, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i2 << 15) & 3670016) | 196992, 0, 130962);
            bVarI = bVarI;
            dd3.b(aVar2, 12.0f, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: of80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    sf80.c(dp20Var, mxsVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final dp20 dp20Var, a aVar, final int i) {
        int i2;
        lu00 lu00Var;
        String strC;
        b bVarI = aVar.i(1340457804);
        int i3 = i & 6;
        d dVar = d.a;
        if (i3 == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dp20Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarJ = h.j(j.i(aVar2, 150.0f), 60.0f, 0.0f, 0.0f, 0.0f, 14);
            n54 n54Var = ht.a.h;
            androidx.compose.ui.d dVarB = dVar.b(dVarJ, n54Var);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            int iOrdinal = dp20Var.i.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(2103551871);
                lu00Var = lu00.b2;
                strC = c.c(lu00Var.c, new String[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal == 1) {
                bVarI.N(2103556417);
                lu00Var = lu00.b2;
                strC = c.c(lu00Var.e, new String[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal == 2) {
                bVarI.N(2103554112);
                lu00Var = lu00.b2;
                strC = c.c(lu00Var.d, new String[0], bVarI);
                bVarI.X(false);
            } else {
                if (iOrdinal != 3) {
                    throw igf0.a(bVarI, 2103550486, false);
                }
                bVarI.N(2103558819);
                lu00Var = lu00.b2;
                strC = c.c(lu00Var.g, new String[0], bVarI);
                bVarI.X(false);
            }
            String str = strC;
            String strC2 = c.c(lu00Var.s, new String[0], bVarI);
            androidx.compose.ui.d dVarB2 = dVar.b(j.i(aVar2, 50.0f), n54Var);
            d0b.a.e eVar = d0b.a.b;
            mw90.a(strC2, "Coin stack", dVarB2, null, null, eVar, null, bVarI, 1572912, 1976);
            mw90.a(str, "Pig character", dVar.b(j.i(aVar2, 120.0f), ht.a.e), null, null, eVar, null, bVarI, 1572912, 1976);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jf80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    sf80.d(dp20Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x0166  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:58:0x0177  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0191  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x0224  */
    /* JADX WARN: Code duplicated, block: B:73:0x0231  */
    /* JADX WARN: Code duplicated, block: B:75:0x024f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0259  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void e(final dp20 dp20Var, boolean z, final jaj<? super Double, ? super Long, ? super String, ? super String, ? super ap20, Unit> jajVar, a aVar, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        final boolean z4;
        e eVarZ;
        lu00 lu00Var;
        mxs mxsVarA;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int iOrdinal;
        boolean z5;
        String strC;
        int i4;
        dp20Var.getClass();
        cp20 cp20Var = dp20Var.h;
        jajVar.getClass();
        b bVarI = aVar.i(636586139);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dp20Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if (bVarI.A(jajVar)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                lu00Var = lu00.b2;
                mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarB = d35.b(ls7.a(j.i(j.g(aVar3, 1.0f), 150.0f), j060.c(12.0f)), 2.0f, (cp20Var != cp20.c || cp20Var == cp20.a) ? new hfs(kotlin.collections.b.k(new j58(r58.d(4286436348L)), new j58(r58.d(4289170426L)), new j58(r58.d(4286436348L))), null, 0L, 9187343241974906880L, 0) : new hfs(kotlin.collections.b.k(new j58(r58.d(4294488832L)), new j58(r58.d(4294963712L))), null, 0L, 9187343241974906880L, 0), j060.c(12.0f));
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                iOrdinal = cp20Var.ordinal();
                if (iOrdinal != 0) {
                    z5 = true;
                    if (iOrdinal != 1) {
                        bVarI.N(-484393833);
                        strC = c.c(lu00Var.l, new String[0], bVarI);
                        bVarI.X(false);
                    } else if (iOrdinal != 2) {
                        bVarI.N(-484396872);
                        strC = c.c(lu00Var.k, new String[0], bVarI);
                        bVarI.X(false);
                    } else {
                        if (iOrdinal == 3) {
                            throw igf0.a(bVarI, -484404584, false);
                        }
                        bVarI.N(-484403050);
                        strC = c.c(lu00Var.i, new String[0], bVarI);
                        bVarI.X(false);
                    }
                } else {
                    z5 = true;
                    bVarI.N(-484399975);
                    strC = c.c(lu00Var.j, new String[0], bVarI);
                    bVarI.X(false);
                }
                boolean z6 = z5;
                mw90.a(strC, "Theme background", ls7.a(j.e(aVar3, 1.0f), j060.c(12.0f)), null, null, d0b.a.a, null, bVarI, 1572912, 1976);
                g75.a(androidx.compose.foundation.a.b(d.a.f(aVar3), j58.c(0.4f, j58.b), zk40.a), bVarI, 0);
                f(dp20Var, mxsVarA, bVarI, i3 & 14);
                int i6 = ((i3 << 3) & 112) | 6;
                d(dp20Var, bVarI, i6);
                if (dp20Var.g) {
                    bVarI.N(909920211);
                    g(mxsVarA, bVarI, 6);
                } else {
                    bVarI.N(906699745);
                }
                bVarI.X(false);
                int i7 = i3 << 6;
                a(dp20Var, mxsVarA, z4, jajVar, bVarI, i6 | (i7 & 7168) | (i7 & 57344));
                bVarI.X(z6);
            } else {
                bVarI.G();
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: rf80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        sf80.e(dp20Var, z4, jajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) != 0) {
            if (bVarI.A(jajVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i5 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            lu00Var = lu00.b2;
            mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
            androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB2 = d35.b(ls7.a(j.i(j.g(aVar4, 1.0f), 150.0f), j060.c(12.0f)), 2.0f, (cp20Var != cp20.c || cp20Var == cp20.a) ? new hfs(kotlin.collections.b.k(new j58(r58.d(4286436348L)), new j58(r58.d(4289170426L)), new j58(r58.d(4286436348L))), null, 0L, 9187343241974906880L, 0) : new hfs(kotlin.collections.b.k(new j58(r58.d(4294488832L)), new j58(r58.d(4294963712L))), null, 0L, 9187343241974906880L, 0), j060.c(12.0f));
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarB2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            iOrdinal = cp20Var.ordinal();
            if (iOrdinal != 0) {
                z5 = true;
                if (iOrdinal != 1) {
                    bVarI.N(-484393833);
                    strC = c.c(lu00Var.l, new String[0], bVarI);
                    bVarI.X(false);
                } else if (iOrdinal != 2) {
                    bVarI.N(-484396872);
                    strC = c.c(lu00Var.k, new String[0], bVarI);
                    bVarI.X(false);
                } else {
                    if (iOrdinal == 3) {
                        throw igf0.a(bVarI, -484404584, false);
                    }
                    bVarI.N(-484403050);
                    strC = c.c(lu00Var.i, new String[0], bVarI);
                    bVarI.X(false);
                }
            } else {
                z5 = true;
                bVarI.N(-484399975);
                strC = c.c(lu00Var.j, new String[0], bVarI);
                bVarI.X(false);
            }
            boolean z7 = z5;
            mw90.a(strC, "Theme background", ls7.a(j.e(aVar4, 1.0f), j060.c(12.0f)), null, null, d0b.a.a, null, bVarI, 1572912, 1976);
            g75.a(androidx.compose.foundation.a.b(d.a.f(aVar4), j58.c(0.4f, j58.b), zk40.a), bVarI, 0);
            f(dp20Var, mxsVarA, bVarI, i3 & 14);
            int i8 = ((i3 << 3) & 112) | 6;
            d(dp20Var, bVarI, i8);
            if (dp20Var.g) {
                bVarI.N(909920211);
                g(mxsVarA, bVarI, 6);
            } else {
                bVarI.N(906699745);
            }
            bVarI.X(false);
            int i9 = i3 << 6;
            a(dp20Var, mxsVarA, z4, jajVar, bVarI, i8 | (i9 & 7168) | (i9 & 57344));
            bVarI.X(z7);
        } else {
            bVarI.G();
            z4 = z2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rf80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sf80.e(dp20Var, z4, jajVar, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final dp20 dp20Var, final mxs mxsVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-967913284);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dp20Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(mxsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarD = j.D(j.c(aVar2, 1.0f), null, 3);
            i78 i78VarA = g78.a(kw0.g, ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.b(dp20Var.b, h.j(aVar2, 12.0f, 12.0f, 0.0f, 0.0f, 12), r58.d(4294956800L), i7f.b(14.0f, bVarI), null, t9i.e, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i3 << 15) & 3670016) | 197040, 0, 130960);
            bVarI = bVarI;
            int i4 = i3 & WebSocketProtocol.PAYLOAD_SHORT;
            h(dp20Var, mxsVar, bVarI, i4);
            c(dp20Var, mxsVar, bVarI, i4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kf80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    sf80.f(dp20Var, mxsVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final mxs mxsVar, a aVar, final int i) {
        b bVarI = aVar.i(-1851856466);
        int i2 = i | (bVarI.M(mxsVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            n54 n54Var = ht.a.c;
            d dVar = d.a;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.a.a(dVar.b(aVar2, n54Var), new hfs(kotlin.collections.b.k(new j58(r58.d(4293194234L)), new j58(r58.d(4292918241L))), null, 0L, 9187343241974906880L, 0), null, 0.0f, 6);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
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
            lkf0.b(c.c(lu00.b2.r, new String[0], bVarI), h.h(aVar2, 16.0f, 0.0f, 2), r58.d(4284565905L), i7f.b(10.0f, bVarI), null, t9i.e, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i2 << 15) & 3670016) | 197040, 0, 130960);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: lf80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    sf80.g(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(dp20 dp20Var, mxs mxsVar, a aVar, final int i) {
        int i2;
        final dp20 dp20Var2 = dp20Var;
        final mxs mxsVar2 = mxsVar;
        b bVarI = aVar.i(167655066);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dp20Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(mxsVar2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            hfs hfsVar = new hfs(kotlin.collections.b.k(new j58(j58.c(0.7f, r58.d(4294225176L))), new j58(j58.c(0.0f, r58.d(4294225176L)))), null, 0L, 9187343241974906880L, 0);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.a.a(aVar2, hfsVar, null, 0.0f, 6);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarI = h.i(aVar2, 12.0f, 8.0f, 20.0f, 8.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String strC = c.c(lu00.b2.p, new String[0], bVarI);
            long jB = i7f.b(10.0f, bVarI);
            t9i t9iVar = t9i.e;
            long j = j58.f;
            int i3 = ((i2 << 15) & 3670016) | 196992;
            lkf0.b(strC, null, j, jB, null, t9iVar, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3, 0, 130962);
            ty0.a(bVarI, j.i(aVar2, 4.0f));
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            dp20Var2 = dp20Var;
            mxsVar2 = mxsVar;
            lkf0.b(dp20Var2.c, null, j, i7f.b(16.0f, bVarI), null, t9iVar, mxsVar2, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3, 0, 130962);
            NumberFormat numberFormat = d6f.a;
            lkf0.b(d6f.a(dp20Var2.d), null, r58.d(4294956800L), i7f.b(16.0f, bVarI), null, t9iVar, mxsVar2, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3, 0, 130962);
            bVarI = bVarI;
            f30.a(bVarI, true, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qf80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    sf80.h(dp20Var2, mxsVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
