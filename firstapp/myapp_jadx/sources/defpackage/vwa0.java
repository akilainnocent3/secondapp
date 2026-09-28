package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vwa0 {
    public static final void a(String str, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(1082750532);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            lff0 lff0VarB = wue.b(bVarI);
            bVar = bVarI;
            jr7.a(j.g(d.a.b, 1.0f), new ijf0(str, 0L, 6), dr9.a, false, null, false, null, pwo.e(R.string.page_withdraw__account_name, bVarI), lff0VarB.a(lff0VarB.a, lff0VarB.b, ((-1025) & 4) != 0 ? lff0VarB.c : 0L, lff0VarB.d, lff0VarB.e, lff0VarB.f, ((-1025) & 64) != 0 ? lff0VarB.g : c68.a(R.color.bg_disabled, bVarI), lff0VarB.h, lff0VarB.i, lff0VarB.j, ((-1025) & 1024) != 0 ? lff0VarB.k : null, ((-1025) & 2048) != 0 ? lff0VarB.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB.m : 0L, lff0VarB.n, lff0VarB.o, lff0VarB.p, lff0VarB.q, lff0VarB.r, lff0VarB.s, lff0VarB.t, lff0VarB.u, lff0VarB.v, lff0VarB.w, lff0VarB.x, lff0VarB.y, lff0VarB.z, lff0VarB.A, lff0VarB.B, lff0VarB.C, lff0VarB.D, lff0VarB.E, lff0VarB.F, lff0VarB.G, lff0VarB.H, lff0VarB.I, lff0VarB.J, lff0VarB.K, lff0VarB.L, lff0VarB.M, lff0VarB.N, lff0VarB.O, lff0VarB.P, lff0VarB.Q), null, null, 0, null, null, null, bVar, 196998, 0, 32344);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new s0y(str, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final ijf0 ijf0Var, final boolean z, final Function1<? super ijf0, Unit> function1, final fa faVar, a aVar, final int i) {
        int i2;
        long jA;
        int i3;
        int i4;
        long jA2;
        b bVarI = aVar.i(730971863);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(ijf0Var) ? 4 : 2) | i;
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
            i2 |= bVarI.M(faVar) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            if (z) {
                jA = rzg.a(bVarI, 65271503, R.color.warning_primary, bVarI, false);
            } else {
                jA = ((Boolean) ytwVar.getValue()).booleanValue() ? rzg.a(bVarI, 65273805, R.color.brand_quinary, bVarI, false) : rzg.a(bVarI, 65275892, R.color.line_type1_secondary, bVarI, false);
            }
            lff0 lff0VarB = wue.b(bVarI);
            d dVarG = j.g(aVar2, 1.0f);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                i3 = 0;
                objY2 = new rwa0(ytwVar, 0);
                bVarI.r(objY2);
            } else {
                i3 = 0;
            }
            d dVarA = androidx.compose.ui.focus.a.a(dVarG, (Function1) objY2);
            String strE = pwo.e(R.string.page_payment__account_number, bVarI);
            gop gopVar = new gop(3, i3, 123);
            final long j = jA;
            int i5 = i2 << 6;
            jr7.a(dVarA, ijf0Var, pp8.b(-633958734, new Function2() { // from class: swa0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h6n.b(erz.a(R.drawable.ic_payment_account, 0, aVar4), null, j.r(d.a.b, 24.0f), j, aVar4, 432, 0);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), z, null, false, null, strE, lff0VarB, gopVar, faVar, 0, null, null, function1, bVarI, (i5 & 7168) | ((i2 << 3) & 112) | 805306752, ((i2 >> 9) & 14) | (57344 & i5), 14448);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            if (z) {
                i4 = 0;
                jA2 = rzg.a(bVarI, 65309871, R.color.warning_primary, bVarI, false);
            } else {
                i4 = 0;
                jA2 = rzg.a(bVarI, 65311534, R.color.text_secondary, bVarI, false);
            }
            long j2 = jA2;
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
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
            h6n.b(erz.a(R.drawable.ic_info_vector, i4, bVarI), null, j.r(aVar2, 13.0f), j2, bVarI, 432, 0);
            lkf0.d(pwo.e(R.string.page_payment__stp_account_number_info, bVarI), h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: twa0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vwa0.b(ijf0Var, z, function1, faVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-2095637284);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            i060 i060VarC = j060.c(8.0f);
            d.a aVar2 = d.a.b;
            d dVarG = h.g(g3w.i(ls7.a(d35.a(j.g(aVar2, 1.0f), 1.0f, c68.a(R.color.border_primary, bVarI), i060VarC), i060VarC), function0), 18.0f, 16.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            h6n.b(erz.a(R.drawable.ic_recent_code, 0, bVarI), null, j.r(aVar2, 17.0f), c68.a(R.color.icon_secondary, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_payment__choose_recent_accounts, new Object[0], bVarI), h.h(aVar2, 8.0f, 0.0f, 2), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), null, j.r(aVar2, 12.0f), c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), bVarI, 432, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uwa0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    vwa0.c(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final wwa0 wwa0Var, final Function1<? super ijf0, Unit> function1, final fa faVar, final Function0<Unit> function0, a aVar, final int i) {
        d.a aVar2;
        wwa0Var.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1843474334);
        int i2 = i | (bVarI.M(wwa0Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.M(faVar) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            long jA = c68.a(R.color.background_general_primary, bVarI);
            zk40.a aVar3 = zk40.a;
            d.a aVar4 = d.a.b;
            d dVarH = h.h(androidx.compose.foundation.a.b(aVar4, jA, aVar3), 20.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
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
            UiText uiText = wwa0Var.a;
            if (uiText == null) {
                bVarI.N(-1543531472);
                bVarI.X(false);
                aVar2 = aVar4;
            } else {
                hnw.a(bVarI, -1543531471, aVar4, 12.0f, bVarI);
                aVar2 = aVar4;
                ac8.a(null, bt.b, new nk0(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b))), mla.l(R.style.B2_R, bVarI), 0, bVarI, 48, 17);
                bVarI.X(false);
            }
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            h9n.a(erz.a(R.drawable.spei_logo, 0, bVarI), null, j.w(aVar2, 83.0f), null, d0b.a.d, 0.0f, null, bVarI, 25008, 104);
            ty0.a(bVarI, j.i(aVar2, 20.0f));
            a(wwa0Var.b, bVarI, 0);
            ty0.a(bVarI, j.i(aVar2, 20.0f));
            b(wwa0Var.c, wwa0Var.e, function1, faVar, bVarI, (i2 << 3) & 8064);
            bVarI = bVarI;
            if (wwa0Var.d) {
                hnw.a(bVarI, -1542480943, aVar2, 8.0f, bVarI);
                c(function0, bVarI, (i2 >> 9) & 14);
                bVarI.X(false);
            } else {
                bVarI.N(-1542303158);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, faVar, function0, i) { // from class: qwa0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ fa c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vwa0.d(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
