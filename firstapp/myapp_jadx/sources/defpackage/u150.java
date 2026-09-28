package defpackage;

import androidx.compose.animation.e;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.book.domain.entity.RelatedBet;
import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.gp.tz.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u150 {
    public static final void a(final UIState uIState, final boolean z, final Function1 function1, final Function1 function2, a aVar, final int i) {
        int i2;
        uIState.getClass();
        b bVarI = aVar.i(1075431932);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(uIState) : bVarI.A(uIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(j.i(e.a(aVar2), z ? 144.0f : 0.0f), 1.0f);
            boolean z2 = uIState instanceof UIState.Idle;
            zk40.a aVar3 = zk40.a;
            n54 n54Var = ht.a.e;
            if (z2 || (uIState instanceof UIState.Loading)) {
                bVarI.N(-1597017454);
                d dVarB = androidx.compose.foundation.a.b(dVarG, c68.a(R.color.background_type1_primary, bVarI), aVar3);
                aiv aivVarC = g75.c(n54Var, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarB);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
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
                q330.a(null, c68.a(R.color.brand_secondary_disable, bVarI), 0.0f, 0L, 0, 0.0f, bVarI, 0, 61);
                bVarI.X(true);
                bVarI.X(false);
            } else if (!(uIState instanceof UIState.Success) || ((Collection) ((UIState.Success) uIState).getData()).isEmpty()) {
                bVarI.N(-1596981710);
                d dVarB2 = androidx.compose.foundation.a.b(dVarG, c68.a(R.color.background_type1_primary, bVarI), aVar3);
                aiv aivVarC2 = g75.c(n54Var, false);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB2);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                lkf0.d(cb40.a(R.string.component_betslip__no_recommendations, new Object[0], bVarI), j.g(aVar2, 0.66f), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(gah0.a)).l, bVarI, 48, 0, 130040);
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(false);
            } else {
                bVarI.N(2032465171);
                kw0.i iVar = new kw0.i(4.0f, true, new hw0());
                umz umzVar = new umz(8.0f, 8.0f, 8.0f, 8.0f);
                boolean z3 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(uIState))) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objY = bVarI.y();
                if (z3 || objY == a.C0041a.a) {
                    objY = new Function1() { // from class: r150
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            szr szrVar = (szr) obj;
                            szrVar.getClass();
                            final UIState uIState2 = uIState;
                            UIState.Success success = (UIState.Success) uIState2;
                            Iterable iterable = (Iterable) success.getData();
                            final boolean z4 = false;
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                Iterator it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (((RelatedBet) it.next()).isLoading()) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                            int size = ((List) success.getData()).size();
                            final Function1 function3 = function1;
                            final Function1 function4 = function2;
                            szr.f(szrVar, size, null, new op8(-1505132495, new iaj() { // from class: t150
                                @Override // defpackage.iaj
                                public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    a aVar6 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((gwr) obj2).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= aVar6.d(iIntValue) ? 32 : 16;
                                    }
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        q150.a((RelatedBet) ((List) ((UIState.Success) uIState2).getData()).get(iIntValue), z4, function3, function4, aVar6, RelatedBet.$stable);
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                aur.b(dVarG, null, umzVar, iVar, null, null, false, null, (Function1) objY, bVarI, 24960, 490);
                bVarI = bVarI;
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: s150
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u150.a(uIState, z, function1, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
