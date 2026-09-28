package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qw1 {
    public static final void a(final d dVar, final jw1 jw1Var, final Function0 function0, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(1088602656);
        int i2 = (bVarI.M(jw1Var) ? 32 : 16) | i | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarA = androidx.compose.ui.platform.d.a(dVar, jw1Var != null ? "deposit_bank_selected" : "deposit_bank_unselected");
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            d.a aVar3 = d.a.b;
            d dVarF = dVar2.f(aVar3);
            String str = jw1Var != null ? jw1Var.c : null;
            if (str == null) {
                str = "";
            }
            tyx.c(dVarF, new ijf0(str, 0L, 6), rr8.a, pp8.b(-903182334, new Function2() { // from class: nw1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    d.a aVar4;
                    String str2;
                    int i3;
                    int i4;
                    a aVar5 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar5, 0);
                        int iHashCode2 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO = aVar5.o();
                        d.a aVar6 = d.a.b;
                        d dVarC2 = c.c(aVar5, aVar6);
                        yka.k.getClass();
                        tsr.a aVar7 = yka.a.b;
                        Unit unit = null;
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar7);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, d160VarA, yka.a.f);
                        hlh0.a(aVar5, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar5, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar5, dVarC2, yka.a.d);
                        jw1 jw1Var2 = jw1Var;
                        String str3 = jw1Var2 != null ? jw1Var2.d : null;
                        if (str3 == null) {
                            aVar5.N(467965130);
                            aVar5.H();
                            i4 = R.color.text_type1_secondary;
                            i3 = R.drawable.arrow_down_16dp;
                            aVar4 = aVar6;
                            str2 = "deposit_bank_selector_arrow_icon";
                        } else {
                            aVar5.N(467965131);
                            aVar4 = aVar6;
                            mw90.b(str3, null, androidx.compose.ui.platform.d.a(j.r(aVar6, 24.0f), "deposit_selected_bank_icon"), erz.a(R.drawable.ic_payment_bank, 0, aVar5), erz.a(R.drawable.ic_payment_bank, 0, aVar5), null, null, null, null, 0.0f, null, aVar5, 432, 0, 32736);
                            ty0.a(aVar5, j.w(aVar4, 12.0f));
                            str2 = "deposit_bank_selector_arrow_icon";
                            d dVarA2 = androidx.compose.ui.platform.d.a(h.j(j.r(aVar4, 20.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13), str2);
                            i3 = R.drawable.arrow_down_16dp;
                            crz crzVarA = erz.a(R.drawable.arrow_down_16dp, 0, aVar5);
                            i4 = R.color.text_type1_secondary;
                            h6n.b(crzVarA, null, dVarA2, c68.a(R.color.text_type1_secondary, aVar5), aVar5, 432, 0);
                            ty0.a(aVar5, j.w(aVar4, 12.0f));
                            aVar5.H();
                            unit = Unit.a;
                        }
                        if (unit == null) {
                            aVar5 = aVar5;
                            aVar5.N(469104939);
                            h6n.b(erz.a(i3, 0, aVar5), null, androidx.compose.ui.platform.d.a(j.r(aVar4, 20.0f), str2), c68.a(i4, aVar5), aVar5, 432, 0);
                            aVar5.H();
                        } else {
                            aVar5 = aVar5;
                            aVar5.N(1816210659);
                            aVar5.H();
                        }
                        aVar5.s();
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), false, null, false, true, cb40.a(R.string.page_payment__select_a_bank, new Object[0], bVarI), null, kff0.a(bVarI), null, null, 0, null, null, null, bVarI, 12586368, 0, 129648);
            bVar = bVarI;
            d dVarF2 = dVar2.f(g3w.f(aVar3, true, function0));
            Unit unit = Unit.a;
            Object objY = bVar.y();
            if (objY == a.C0041a.a) {
                objY = pw1.a;
                bVar.r(objY);
            }
            g75.a(wje0.a(dVarF2, unit, (PointerInputEventHandler) objY), bVar, 0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(jw1Var, function0, i) { // from class: ow1
                public final /* synthetic */ jw1 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    qw1.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
