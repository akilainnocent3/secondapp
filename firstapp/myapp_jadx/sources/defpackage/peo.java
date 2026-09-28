package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class peo {
    public static final void a(final int i, final long j, final i060 i060Var, String str, a aVar, final int i2) {
        String str2;
        b bVarI = aVar.i(-1060126883);
        int i3 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.e(j) ? 32 : 16) | (bVarI.M(i060Var) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            str2 = str;
            d dVarH = g3w.h(androidx.compose.foundation.a.b(j.r(aVar2, 10.0f), j, i060Var), str2);
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(i, i3 & 14, bVarI), null, j.r(aVar2, 8.0f), ((lib0) bVarI.O(oib0.a)).i0, bVarI, 432, 0);
            bVarI.X(true);
        } else {
            str2 = str;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str3 = str2;
            eVarZ.d = new Function2(i, j, i060Var, str3, i2) { // from class: meo
                public final /* synthetic */ int a;
                public final /* synthetic */ long b;
                public final /* synthetic */ i060 c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3073);
                    peo.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final qeo qeoVar, n54 n54Var, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        n54 n54Var2;
        b bVar;
        b bVar2;
        i060 i060Var;
        int i4;
        qeoVar.getClass();
        b bVarI = aVar.i(-1265773957);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i6 = i3 | (bVarI.M(qeoVar) ? 32 : 16);
        if (bVarI.q(i6 & 1, (i6 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            if (i5 != 0) {
                dVar2 = aVar2;
            }
            i060 i060VarC = j060.c(20.0f);
            d dVarG = j.g(dVar2, 1.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new keo();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarG, false, (Function1) objY);
            n54Var2 = n54Var;
            aiv aivVarC = g75.c(n54Var2, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar3);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarA = ls7.a(aVar2, i060VarC);
            qyd0 qyd0Var = oib0.a;
            d dVarH = g3w.h(androidx.compose.foundation.a.b(d35.a(dVarA, 1.0f, ((lib0) bVarI.O(qyd0Var)).A, i060VarC), ((lib0) bVarI.O(qyd0Var)).l0, zk40.a), "football_score_info_row");
            kw0.c cVar2 = kw0.e;
            n54.b bVar4 = ht.a.k;
            d160 d160VarA = b160.a(cVar2, bVar4, bVarI, 54);
            d.a aVar4 = aVar2;
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            d dVar4 = dVar2;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            d dVarH2 = g3w.h(h.j(op70.b(ls7.a(yy.a(bVarI, dVarC2, cVar, 1.0f, false), i060VarC), op70.a(bVarI), false, true, false), 6.0f, 0.0f, 0.0f, 0.0f, 14), "football_score_info_scrollable_row");
            d160 d160VarA2 = b160.a(cVar2, bVar4, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            bVarI.N(1493282064);
            for (jeo jeoVar : qeoVar.a) {
                d.a aVar5 = aVar4;
                d dVarH3 = g3w.h(aVar5, "football_score_info_item_row");
                d160 d160VarA3 = b160.a(kw0.a, bVar4, bVarI, 48);
                int iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarH3);
                yka.k.getClass();
                tsr.a aVar6 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, yka.a.f);
                hlh0.a(bVarI, ne00VarS4, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                }
                hlh0.a(bVarI, dVarC4, yka.a.d);
                if (jeoVar instanceof jeo.c) {
                    bVarI.N(528713318);
                    bVar2 = bVarI;
                    a(R.drawable.ic__home, ((lib0) bVarI.O(oib0.a)).E0, j060.c(1.0f), "football_score_info_home_goal_icon", bVar2, 3072);
                    i4 = 0;
                    bVar2.X(false);
                    i060Var = i060VarC;
                } else {
                    bVar2 = bVarI;
                    if (jeoVar instanceof jeo.a) {
                        bVar2.N(529209163);
                        i060 i060Var2 = i060VarC;
                        a(R.drawable.ic__away, ((lib0) bVar2.O(oib0.a)).H0, i060Var2, "football_score_info_away_goal_icon", bVar2, 3072);
                        i060Var = i060Var2;
                        i4 = 0;
                        bVar2.X(false);
                    } else {
                        i060Var = i060VarC;
                        if (!(jeoVar instanceof jeo.b)) {
                            throw igf0.a(bVar2, -260041381, false);
                        }
                        bVar2.N(529709999);
                        c(((jeo.b) jeoVar).a, i060Var, new umz(6.0f, 2.0f, 6.0f, 2.0f), "football_score_info_half_time_score_chip", bVar2, 3456);
                        bVar2 = bVar2;
                        i4 = 0;
                        bVar2.X(false);
                    }
                }
                d(i4, bVar2);
                bVar2.X(true);
                i060VarC = i060Var;
                bVarI = bVar2;
                aVar4 = aVar5;
            }
            b bVar5 = bVarI;
            bVar5.X(false);
            bVar5.X(true);
            c(qeoVar.b, j060.e(0.0f, 20.0f, 20.0f, 0.0f, 9), new umz(6.0f, 4.0f, 6.0f, 4.0f), "football_score_info_full_time_score_chip", bVarI, 3456);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
            dVar2 = dVar4;
        } else {
            n54Var2 = n54Var;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final n54 n54Var3 = n54Var2;
            eVarZ.d = new Function2() { // from class: leo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    peo.b(dVar2, qeoVar, n54Var3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final UiText uiText, final i060 i060Var, final umz umzVar, final String str, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(368364726);
        int i2 = i | (bVarI.M(uiText) ? 4 : 2) | (bVarI.M(i060Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarA = ls7.a(d.a.b, i060Var);
            qyd0 qyd0Var = oib0.a;
            d dVarH = g3w.h(h.e(androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var)).A, zk40.a), umzVar), str);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            uiText.getClass();
            lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(0L, mla.m(10.0f, bVarI), t9i.E, null, null, 0L, null, null, 0, 0L, null, null, 16777209), bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i060Var, umzVar, str, i) { // from class: oeo
                public final /* synthetic */ i060 b;
                public final /* synthetic */ umz c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3457);
                    peo.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, a aVar) {
        b bVarI = aVar.i(1517370723);
        if (bVarI.q(i & 1, i != 0)) {
            ute.b(j.w(d.a.b, 6.0f), 1.0f, ((lib0) bVarI.O(oib0.a)).A, bVarI, 54, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new neo();
        }
    }
}
