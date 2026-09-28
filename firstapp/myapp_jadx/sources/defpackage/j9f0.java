package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j9f0 {
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final int i2, a aVar, final String str, boolean z) {
        final boolean z2;
        boolean z3;
        b bVar;
        e eVarZ;
        boolean z4;
        imf0 imf0Var;
        b bVarI = aVar.i(1476410994);
        int i3 = (bVarI.M(str) ? 32 : 16) | i;
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i4 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (0.7f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true);
                long j = ((lib0) bVarI.O(oib0.a)).o;
                if (z4) {
                    bVarI.N(1491765973);
                    imf0Var = ((ijb0) bVarI.O(kjb0.a)).m;
                } else {
                    bVarI.N(1491766613);
                    imf0Var = ((ijb0) bVarI.O(kjb0.a)).n;
                }
                bVarI.X(false);
                bVar = bVarI;
                lkf0.d(str, layoutWeightElement, j, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVar, (i3 >> 3) & 14, 0, 130040);
                z2 = z4;
            } else {
                bVar = bVarI;
                bVar.G();
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: i9f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j9f0.a(qj40.a(i | 1), i2, (a) obj, str, z2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i4 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            if (0.7f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true);
            long j2 = ((lib0) bVarI.O(oib0.a)).o;
            if (z4) {
                bVarI.N(1491765973);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).m;
            } else {
                bVarI.N(1491766613);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).n;
            }
            bVarI.X(false);
            bVar = bVarI;
            lkf0.d(str, layoutWeightElement2, j2, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVar, (i3 >> 3) & 14, 0, 130040);
            z2 = z4;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: i9f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j9f0.a(qj40.a(i | 1), i2, (a) obj, str, z2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void b(d dVar, final k9f0 k9f0Var, a aVar, final int i) {
        final d dVar2;
        ?? r11;
        k9f0Var.getClass();
        b bVarI = aVar.i(1613889175);
        int i2 = i | 6 | (bVarI.M(k9f0Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(aVar2, 0.0f, 6.0f, 1);
            kw0.j jVar = kw0.a;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (2.6f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.6f, true);
            d160 d160VarA2 = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String str = k9f0Var.b;
            String str2 = k9f0Var.c;
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).o;
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).n, bVarI, 0, 0, 131066);
            ty0.a(bVarI, j.w(aVar2, 6.0f));
            mw90.a(k9f0Var.l, null, j.r(aVar2, 18.0f), null, null, d0b.a.g, null, bVarI, 1573296, 1976);
            ty0.a(bVarI, j.w(aVar2, 6.0f));
            String strB = cb40.b(str2, new Object[0], bVarI);
            lkf0.d(strB == null ? str2 : strB, null, ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 0, 24960, 110586);
            bVarI = bVarI;
            if (k9f0Var.m) {
                yqg.a(bVarI, 109758595, aVar2, 6.0f, bVarI);
                r11 = 0;
                h6n.b(erz.a(R.drawable.ic__star_fill, 0, bVarI), null, j.r(aVar2, 14.0f), ((lib0) bVarI.O(qyd0Var)).k, bVarI, 432, 0);
                bVarI.X(false);
            } else {
                r11 = 0;
                bVarI.N(110081491);
                bVarI.X(false);
            }
            bVarI.X(true);
            a(6, 2, bVarI, k9f0Var.d, r11);
            a(6, 2, bVarI, k9f0Var.e, r11);
            a(6, 2, bVarI, k9f0Var.f, r11);
            a(6, 2, bVarI, k9f0Var.g, r11);
            a(6, 2, bVarI, k9f0Var.h, r11);
            a(6, 2, bVarI, k9f0Var.i, r11);
            a(6, 2, bVarI, k9f0Var.j, r11);
            a(390, r11, bVarI, k9f0Var.k, true);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(k9f0Var, i) { // from class: h9f0
                public final /* synthetic */ k9f0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j9f0.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
