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

/* JADX INFO: loaded from: classes4.dex */
public final class bxk {
    public static final void a(final int i, a aVar, final d dVar, final Function0 function0) {
        int i2;
        b bVar;
        b bVarI = aVar.i(458138075);
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
            eVarZ.d = new Function2() { // from class: qwk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bxk.a(qj40.a(i | 1), (a) obj, dVar, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ayk aykVar, final Function0 function0, final Function0 function1, final Function1 function2, final Function0 function3, final Function0 function4, final Function0 function5, a aVar, final int i) {
        b bVarI = aVar.i(-1868146061);
        int i2 = i | (bVarI.M(aykVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | (bVarI.A(function5) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            long j = ((lib0) bVarI.O(oib0.a)).i0;
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.b(aVar3, j, aVar2), 20.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new um7(1);
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarF, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            e(0, bVarI);
            d dVarJ = h.j(j.g(aVar3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            String str = aykVar.e;
            dyk dykVar = aykVar.f;
            int i3 = i2 << 6;
            c((i3 & 7168) | 6, bVarI, dVarJ, str, function0, dykVar instanceof dyk.a);
            d dVarJ2 = h.j(j.g(aVar3, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z = dykVar instanceof dyk.b;
            dyk.b bVar = z ? (dyk.b) dykVar : null;
            if (bVar == null) {
                bVar = new dyk.b((ijf0) null, 3);
            }
            UiText uiText = aykVar.i;
            boolean z2 = (i2 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: owk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var = (ijf0) obj;
                        ijf0Var.getClass();
                        function2.invoke(ijf0Var);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d(dVarJ2, bVar, uiText, z, function1, (Function1) objY2, bVarI, 6 | (57344 & i3));
            l9z.a(h.j(j.g(aVar3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), cb40.a(R.string.common_functions__cancel, new Object[0], bVarI), cb40.a(R.string.gift__use, new Object[0], bVarI), aykVar.h ? uxs.ENABLE : uxs.DISABLE, null, null, function3, function4, bVarI, (3670016 & i3) | 6 | (i3 & 29360128), 48);
            bVarI = bVarI;
            if (aykVar.g) {
                bVarI.N(-1542676121);
                a(((i2 >> 15) & 112) | 6, bVarI, j.i(h.j(j.g(aVar3, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), 44.0f), function5);
                bVarI.X(false);
            } else {
                bVarI.N(-1542432027);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, i) { // from class: pwk
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bxk.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, a aVar, final d dVar, final String str, final Function0 function0, final boolean z) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-55248214);
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
            g((i3 & 112) | 6, bVarI, g3w.h(aVar3, "gift_value_editor_use_all_radio_button"), z);
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
            eVarZ.d = new Function2() { // from class: rwk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bxk.c(qj40.a(i | 1), (a) obj, dVar, str, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final d dVar, final dyk.b bVar, final UiText uiText, final boolean z, final Function0 function0, final Function1 function1, a aVar, final int i) {
        int i2;
        UiText uiText2;
        Function1 function2;
        b bVarI = aVar.i(-428922750);
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
            g((i3 & 112) | 6, bVarI, g3w.h(aVar3, "gift_value_editor_use_partial_radio_button"), z);
            lkf0.d(cb40.a(R.string.common_functions__partial, new Object[0], bVarI), h.j(aVar3, 12.0f, 0.0f, 0.0f, 0.0f, 14), ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 48, 0, 131064);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            bVarI = bVarI;
            jyk.a(g3w.h(j.w(aVar3, 120.0f), "gift_value_editor_partial_gift_value_text_field"), bVar, uiText2, function2, function0, bVarI, (i2 & 57344) | (i3 & 7168) | 6 | (i2 & 112) | (i2 & 896));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: twk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bxk.d(dVar, bVar, uiText, z, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(-1480368158);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.component_coupon__gift_value, new Object[0], bVarI), j.g(d.a.b, 1.0f), ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVar, 48, 0, 130040);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new swk();
        }
    }

    public static final void f(final ayk aykVar, final Function0 function0, final Function0 function1, final Function1 function2, final Function0 function3, final Function0 function4, final Function0 function5, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-2021899137);
        int i2 = (bVarI.A(function5) ? 1048576 : 524288) | i | (bVarI.M(aykVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536);
        if (!bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            bVar = bVarI;
            bVar.G();
        } else if (aykVar.a) {
            bVarI.N(-1775513387);
            bVar = bVarI;
            u60.a(function3, null, pp8.b(2028868785, new Function2() { // from class: zwk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ayk aykVar2 = ayk.j;
                        bxk.b(aykVar, function0, function1, function2, function3, function4, function5, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i2 >> 12) & 14) | 384, 2);
            bVar.X(false);
        } else {
            bVar = bVarI;
            bVar.N(-1775069405);
            bVar.X(false);
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, i) { // from class: axk
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bxk.f(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final int i, a aVar, final d dVar, final boolean z) {
        int i2;
        b bVarI = aVar.i(1326726198);
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
            eVarZ.d = new Function2() { // from class: uwk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bxk.g(qj40.a(i | 1), (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }
}
