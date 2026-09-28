package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
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
public final class svd0 {
    public static final void a(d dVar, a aVar, final int i) {
        b bVar;
        final d dVar2;
        b bVarI = aVar.i(1414744663);
        int i2 = i | 6;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(aVar2, 0.0f, 6.0f, 1);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (2.6f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.d(cb40.a(R.string.world_cup_tournament__group_team, new Object[0], bVarI), new LayoutWeightElement(2.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.6f, true), ((lib0) bVarI.O(oib0.a)).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 131064);
            bVar = bVarI;
            b(6, 2, bVar, cb40.a(R.string.world_cup_tournament__group_matches_played, new Object[0], bVar), false);
            b(6, 2, bVar, cb40.a(R.string.world_cup_tournament__group_wins, new Object[0], bVar), false);
            b(6, 2, bVar, cb40.a(R.string.world_cup_tournament__group_draws, new Object[0], bVar), false);
            b(6, 2, bVar, cb40.a(R.string.world_cup_tournament__group_losses, new Object[0], bVar), false);
            b(6, 2, bVar, cb40.a(R.string.world_cup_tournament__group_goals_for, new Object[0], bVar), false);
            b(6, 2, bVar, cb40.a(R.string.world_cup_tournament__group_goals_against, new Object[0], bVar), false);
            b(6, 2, bVar, cb40.a(R.string.world_cup_tournament__group_goal_difference, new Object[0], bVar), false);
            b(390, 0, bVar, cb40.a(R.string.world_cup_tournament__group_points, new Object[0], bVar), true);
            bVar.X(true);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: qvd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    svd0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

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
    public static final void b(final int i, final int i2, a aVar, final String str, boolean z) {
        final boolean z2;
        boolean z3;
        b bVar;
        e eVarZ;
        boolean z4;
        imf0 imf0Var;
        b bVarI = aVar.i(710390234);
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
                long j = ((lib0) bVarI.O(oib0.a)).q;
                if (z4) {
                    bVarI.N(-214776643);
                    imf0Var = ((ijb0) bVarI.O(kjb0.a)).m;
                } else {
                    bVarI.N(-214776003);
                    imf0Var = ((ijb0) bVarI.O(kjb0.a)).o;
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
                eVarZ.d = new Function2() { // from class: rvd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        svd0.b(qj40.a(i | 1), i2, (a) obj, str, z2);
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
            long j2 = ((lib0) bVarI.O(oib0.a)).q;
            if (z4) {
                bVarI.N(-214776643);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).m;
            } else {
                bVarI.N(-214776003);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).o;
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
            eVarZ.d = new Function2() { // from class: rvd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    svd0.b(qj40.a(i | 1), i2, (a) obj, str, z2);
                    return Unit.a;
                }
            };
        }
    }
}
