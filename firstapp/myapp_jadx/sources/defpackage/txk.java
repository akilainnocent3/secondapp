package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class txk {
    public static final void a(final int i, a aVar, final d dVar, final Function0 function0) {
        int i2;
        b bVar;
        b bVarI = aVar.i(834962096);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarH = g3w.h(g3w.f(dVar, true, function0), "gift_value_editor_choose_other_gifts_button");
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
            lkf0.d(cb40.a(R.string.component_coupon__choose_other_gifts, new Object[0], bVarI), null, ((lib0) bVarI.O(oib0.a)).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).j, bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ixk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    txk.a(qj40.a(i | 1), (a) obj, dVar, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final boolean z, final Function1 function1, a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(686506515);
        int i2 = (bVarI.b(z) ? 32 : 16) | i | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            d.a aVar3 = d.a.b;
            d dVarR = j.r(aVar3, 20.0f);
            crz crzVarA = erz.a(R.drawable.ic__gift, 0, bVarI);
            qyd0 qyd0Var = oib0.a;
            h9n.a(crzVarA, "ic_gift", dVarR, null, null, 0.0f, new gf4(((lib0) bVarI.O(qyd0Var)).O, 5), bVarI, 432, 56);
            lkf0.d(cb40.a(R.string.component_coupon__add_to_stake, new Object[0], bVarI), h.j(aVar3, 3.0f, 0.0f, 0.0f, 0.0f, 14), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 48, 0, 131064);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            icd0.b(g3w.h(j.i(aVar3, 24.0f), "gift_value_editor_add_to_stake_switch"), z, function1, false, null, null, bVarI, (i2 & 896) | (i2 & 112) | 6, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function1, i) { // from class: jxk
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    txk.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final byk bykVar, final Function0 function0, final Function0 function1, final Function1 function2, final Function1 function3, final Function0 function4, final Function0 function5, final Function0 function6, a aVar, final int i) {
        b bVar;
        boolean z;
        int i2;
        bykVar.getClass();
        function0.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        b bVarA = v2g.a(function5, function6, aVar, 707194981);
        int i3 = i | (bVarA.A(bykVar) ? 4 : 2) | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128) | (bVarA.A(function2) ? 2048 : 1024) | (bVarA.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarA.A(function4) ? 131072 : 65536) | (bVarA.A(function5) ? 1048576 : 524288) | (bVarA.A(function6) ? 8388608 : 4194304);
        if (bVarA.q(i3 & 1, (4793491 & i3) != 4793490)) {
            long j = ((lib0) bVarA.O(oib0.a)).i0;
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.b(aVar3, j, aVar2), 20.0f);
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new fxk();
                bVarA.r(objY);
            }
            d dVarB = xa80.b(dVarF, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarA, 0);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar4);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, i78VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            f(null, bVarA, 0);
            d dVarJ = h.j(j.g(aVar3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            String str = bykVar.b;
            cyk cykVar = bykVar.c;
            int i4 = i3 << 6;
            d((i4 & 7168) | 6, bVarA, dVarJ, str, function0, cykVar instanceof cyk.a);
            d dVarJ2 = h.j(j.g(aVar3, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z2 = cykVar instanceof cyk.b;
            cyk.b bVar2 = z2 ? (cyk.b) cykVar : null;
            if (bVar2 == null) {
                bVar2 = new cyk.b(0);
            }
            UiText uiText = bykVar.i;
            boolean z3 = (i3 & 7168) == 2048;
            Object objY2 = bVarA.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: gxk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var = (ijf0) obj;
                        ijf0Var.getClass();
                        function2.invoke(ijf0Var);
                        return Unit.a;
                    }
                };
                bVarA.r(objY2);
            }
            e(dVarJ2, bVar2, uiText, z2, function1, (Function1) objY2, bVarA, 6 | (i4 & 57344));
            if (bykVar.e) {
                bVarA.N(15247443);
                d dVarJ3 = h.j(j.g(aVar3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                boolean z4 = bykVar.d;
                boolean z5 = (i3 & 57344) == 16384;
                Object objY3 = bVarA.y();
                if (z5 || objY3 == c0042a) {
                    z = true;
                    objY3 = new gkb(function3, 1);
                    bVarA.r(objY3);
                } else {
                    z = true;
                }
                b(dVarJ3, z4, (Function1) objY3, bVarA, 6);
                h(6, bVarA, h.j(j.g(aVar3, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), bykVar.h);
                i2 = 0;
                bVarA.X(false);
            } else {
                z = true;
                i2 = 0;
                bVarA.N(15758695);
                bVarA.X(false);
            }
            d dVarJ4 = h.j(j.g(aVar3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            String strA = cb40.a(R.string.common_functions__cancel, new Object[i2], bVarA);
            String strA2 = cb40.a(R.string.gift__use, new Object[i2], bVarA);
            int i5 = i3 << 3;
            l9z.a(dVarJ4, strA, strA2, bykVar.g ? uxs.ENABLE : uxs.DISABLE, null, null, function4, function5, bVarA, (3670016 & i5) | 6 | (i5 & 29360128), 48);
            bVar = bVarA;
            if (bykVar.f) {
                bVar.N(16333001);
                a(((i3 >> 18) & 112) | 6, bVar, j.i(h.j(j.g(aVar3, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), 44.0f), function6);
                bVar.X(false);
            } else {
                bVar.N(16577095);
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, function6, i) { // from class: hxk
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    txk.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, a aVar, final d dVar, final String str, final Function0 function0, final boolean z) {
        int i2;
        b bVar;
        b bVarI = aVar.i(2015261441);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarF = g3w.f(j.g(dVar, 1.0f), true, function0);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            d.a aVar3 = d.a.b;
            int i3 = i2 >> 3;
            i((i3 & 112) | 6, bVarI, g3w.h(aVar3, "gift_value_editor_use_all_radio_button"), z);
            d dVarJ = h.j(aVar3, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            String strA = cb40.a(R.string.common_functions__all, new Object[0], bVarI);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).o;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(strA, dVarJ, ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 48, 0, 131064);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            lkf0.d(str, g3w.h(aVar3, "gift_value_editor_total_gift_value_text"), ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, (i3 & 14) | 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mxk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    txk.d(qj40.a(i | 1), (a) obj, dVar, str, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final d dVar, final cyk.b bVar, final UiText uiText, final boolean z, final Function0 function0, final Function1 function1, a aVar, final int i) {
        int i2;
        UiText uiText2;
        Function1 function2;
        b bVarI = aVar.i(1141211689);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            uiText2 = uiText;
            i2 |= bVarI.M(uiText2) ? 256 : 128;
        } else {
            uiText2 = uiText;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            function2 = function1;
            i2 |= bVarI.A(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d dVarF = g3w.f(j.g(dVar, 1.0f), true, function0);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            d.a aVar3 = d.a.b;
            int i3 = i2 >> 6;
            i((i3 & 112) | 6, bVarI, g3w.h(aVar3, "gift_value_editor_use_partial_radio_button"), z);
            lkf0.d(cb40.a(R.string.common_functions__partial, new Object[0], bVarI), h.j(aVar3, 12.0f, 0.0f, 0.0f, 0.0f, 14), ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 48, 0, 131064);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            bVarI = bVarI;
            kyk.a(g3w.h(j.w(aVar3, 120.0f), "gift_value_editor_partial_gift_value_text_field"), bVar, uiText2, function2, function0, bVarI, (i2 & 57344) | (i3 & 7168) | 6 | (i2 & 112) | (i2 & 896));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nxk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    txk.e(dVar, bVar, uiText, z, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(d dVar, a aVar, int i) {
        b bVar;
        int i2;
        d dVar2;
        b bVarI = aVar.i(2133096768);
        int i3 = i | 6;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            String strA = cb40.a(R.string.component_coupon__gift_value, new Object[0], bVarI);
            long jF = d2l.f(16);
            t9i t9iVar = t9i.E;
            long j = ((lib0) bVarI.O(oib0.a)).a;
            gdf0 gdf0Var = new gdf0(3);
            dVar2 = d.a.b;
            bVar = bVarI;
            i2 = 1;
            lkf0.d(strA, dVar2, j, null, jF, null, t9iVar, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, null, bVar, 1597488, 0, 261032);
        } else {
            bVar = bVarI;
            i2 = 1;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new gp7(i, i2, dVar2);
        }
    }

    public static final void g(final byk bykVar, final Function0 function0, final Function0 function1, final Function1 function2, final Function1 function3, final Function0 function4, final Function0 function5, final Function0 function6, a aVar, final int i) {
        b bVar;
        bykVar.getClass();
        function0.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        b bVarA = v2g.a(function5, function6, aVar, -1485250599);
        int i2 = i | (bVarA.A(bykVar) ? 4 : 2) | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128) | (bVarA.A(function2) ? 2048 : 1024) | (bVarA.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarA.A(function4) ? 131072 : 65536) | (bVarA.A(function5) ? 1048576 : 524288) | (bVarA.A(function6) ? 8388608 : 4194304);
        if (!bVarA.q(i2 & 1, (4793491 & i2) != 4793490)) {
            bVar = bVarA;
            bVar.G();
        } else if (bykVar.a) {
            bVarA.N(-347145243);
            bVar = bVarA;
            o0z.a(null, null, null, null, null, pp8.b(-1107795633, new Function2() { // from class: rxk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final byk bykVar2 = bykVar;
                        final Function0 function7 = function0;
                        final Function0 function8 = function1;
                        final Function0 function9 = function4;
                        final Function0 function10 = function5;
                        final Function0 function11 = function6;
                        final Function1 function12 = function2;
                        final Function1 function13 = function3;
                        u60.a(function9, null, pp8.b(-1929002792, new Function2() { // from class: exk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    byk bykVar3 = byk.j;
                                    txk.c(bykVar2, function7, function8, function12, function13, function9, function10, function11, aVar3, 8);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 384, 2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVar, 196608);
            bVar.X(false);
        } else {
            bVar = bVarA;
            bVar.N(-346557111);
            bVar.X(false);
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, function6, i) { // from class: dxk
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    txk.g(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final int i, a aVar, final d dVar, final String str) {
        b bVar;
        b bVarI = aVar.i(-1796726672);
        int i2 = (bVarI.M(str) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarH = g3w.h(dVar, "gift_value_editor_potential_win_text");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(-341455437);
            nk0.b bVar2 = new nk0.b((Object) null);
            bVarI.N(-341454408);
            qyd0 qyd0Var = oib0.a;
            int iL = bVar2.l(new ora0(((lib0) bVarI.O(qyd0Var)).b, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
            try {
                bVar2.g(cb40.a(R.string.component_betslip__potential_win, new Object[0], bVarI));
                Unit unit = Unit.a;
                bVar2.i(iL);
                bVarI.X(false);
                bVar2.g(" ");
                int iL2 = bVar2.l(new ora0(((lib0) bVarI.O(qyd0Var)).a, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar2.g(str);
                    bVar2.i(iL2);
                    nk0 nk0VarM = bVar2.m();
                    bVarI.X(false);
                    lkf0.e(nk0VarM, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 262142);
                    bVar = bVarI;
                    bVar.X(true);
                } catch (Throwable th) {
                    bVar2.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar2.i(iL);
                throw th2;
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: kxk
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;

                {
                    this.a = dVar;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    txk.h(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final int i, a aVar, final d dVar, final boolean z) {
        int i2;
        b bVarI = aVar.i(-2006410251);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            h9n.a(erz.a(z ? R.drawable.gift_radio_btn_selected : R.drawable.gift_radio_btn, 0, bVarI), null, j.r(dVar, 24.0f), null, null, 0.0f, null, bVarI, 48, 120);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: oxk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    txk.i(qj40.a(i | 1), (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }
}
