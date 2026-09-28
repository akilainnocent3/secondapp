package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ujb0 {
    public static final void a(vjb0 vjb0Var, final ijf0 ijf0Var, final Function1<? super ijf0, Unit> function1, final Function0<Unit> function0, a aVar, final int i) {
        vjb0 vjb0Var2;
        d.a aVar2;
        b bVarI = aVar.i(906700868);
        int i2 = i | (bVarI.M(vjb0Var) ? 4 : 2) | (bVarI.M(ijf0Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d.a aVar3 = d.a.b;
            d dVarC = op70.c(h.h(j.g(aVar3, 1.0f), 16.0f, 0.0f, 2), op70.a(bVarI), 14);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            hlh0.a(bVarI, dVarC2, cVar);
            UiText uiText = vjb0Var.b;
            if (uiText == null) {
                bVarI.N(-759024358);
                bVarI.X(false);
                aVar2 = aVar3;
            } else {
                bVarI.N(-759024357);
                aVar2 = aVar3;
                o400.a(48, bVarI, h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), uiText);
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            d.a aVar5 = aVar2;
            h9n.a(erz.a(R.drawable.sportybet_voucher_logo, 0, bVarI), null, h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13), null, null, 0.0f, null, bVarI, 432, 120);
            d dVarJ = h.j(j.g(aVar5, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            lkf0.d(cb40.a(R.string.page_payment__voucher_pin_number, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 131066);
            vjb0Var2 = vjb0Var;
            k600.b(vjb0Var2.d, vjb0Var2.e, new LayoutWeightElement(1.0f, true), 0, bVarI, 0, 8);
            bVarI.X(true);
            String strA = cb40.a(R.string.page_payment__enter_the_sporty_bet_voucher_pin_number, new Object[0], bVarI);
            z900 z900Var = vjb0Var2.i;
            d dVarJ2 = h.j(j.g(aVar5, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new nu20(1);
                bVarI.r(objY);
            }
            uoi0.a(strA, ijf0Var, z900Var, dVarJ2, function1, (Function0) objY, bVarI, (i2 & 112) | 1597824 | ((i2 << 9) & 458752));
            bVarI = bVarI;
            v900.a(vjb0Var2.g, c9j.d(h.j(aVar5, 0.0f, 20.0f, 0.0f, 0.0f, 13), "deposit__redeem_voucher__btn"), cb40.a(R.string.page_payment__redeem_voucher, new Object[0], bVarI), function0, bVarI, i2 & 7168, 0);
            r200.a(48, bVarI, h.j(aVar5, 0.0f, 40.0f, 0.0f, 16.0f, 5), vjb0Var2.c);
            bVarI.X(true);
        } else {
            vjb0Var2 = vjb0Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final vjb0 vjb0Var3 = vjb0Var2;
            eVarZ.d = new Function2(ijf0Var, function1, function0, i) { // from class: ojb0
                public final /* synthetic */ ijf0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ujb0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(hkb0 hkb0Var, Function1 function1, a aVar, int i) {
        final hkb0 hkb0Var2;
        int i2;
        function1.getClass();
        b bVarI = aVar.i(394077872);
        int i3 = i | 2 | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-15);
                    hkb0Var2 = (hkb0) p8i0.a(jq40.a(hkb0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-15);
                hkb0Var2 = hkb0Var;
            }
            bVarI.Y();
            final ytw ytwVarC = wyh.c(hkb0Var2.Y, bVarI, 0, 7);
            wg8 wg8Var = ((vjb0) ytwVarC.getValue()).f;
            vc8 vc8Var = ((vjb0) ytwVarC.getValue()).h;
            boolean zA = bVarI.A(hkb0Var2);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new pjb0(1, hkb0Var2, hkb0.class, "onCommonPayDialogAction", "onCommonPayDialogAction(Lcom/sportybet/android/globalpay/base/CommonPayDialogUiAction;)V", 0);
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) ((chp) objY);
            boolean zA2 = bVarI.A(hkb0Var2);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new qjb0(1, hkb0Var2, hkb0.class, "onCommonDepositDialogAction", "onCommonDepositDialogAction(Lcom/sportybet/android/globalpay/base/deposit/CommonDepositDialogUiAction;)V", 0);
                bVarI.r(objY2);
            }
            op8 op8VarB = pp8.b(-1544842801, new Function2() { // from class: njb0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        vjb0 vjb0Var = (vjb0) ytwVarC.getValue();
                        hkb0 hkb0Var3 = hkb0Var2;
                        ijf0 ijf0Var = (ijf0) ((x5a0) hkb0Var3.h0).getValue();
                        boolean zA3 = aVar2.A(hkb0Var3);
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zA3 || objY3 == c0042a2) {
                            rjb0 rjb0Var = new rjb0(1, hkb0Var3, hkb0.class, "onPinTextChanged", "onPinTextChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                            aVar2.r(rjb0Var);
                            objY3 = rjb0Var;
                        }
                        Function1 function3 = (Function1) ((chp) objY3);
                        boolean zA4 = aVar2.A(hkb0Var3);
                        Object objY4 = aVar2.y();
                        if (zA4 || objY4 == c0042a2) {
                            sjb0 sjb0Var = new sjb0(0, hkb0Var3, hkb0.class, "onDepositButtonClicked", "onDepositButtonClicked()V", 0);
                            aVar2.r(sjb0Var);
                            objY4 = sjb0Var;
                        }
                        ujb0.a(vjb0Var, ijf0Var, function3, (Function0) ((chp) objY4), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            ResourceUiText resourceUiText = hkb0.i0;
            d7e.a(hkb0Var2, wg8Var, vc8Var, function1, function2, (Function1) ((chp) objY2), op8VarB, bVarI, ((i2 << 6) & 7168) | 1572872);
            if (((vjb0) ytwVarC.getValue()).j) {
                bVarI.N(1829232761);
                String strA = cb40.a(R.string.page_payment__pending_request, new Object[0], bVarI);
                String strA2 = cb40.a(R.string.page_payment__you_deposit_request_has_been_submitted_tip, new Object[0], bVarI);
                boolean zA3 = bVarI.A(hkb0Var2);
                Object objY3 = bVarI.y();
                if (zA3 || objY3 == c0042a) {
                    objY3 = new tjb0(0, hkb0Var2, hkb0.class, "onPendingRequestDialogDismissRequested", "onPendingRequestDialogDismissRequested()V", 0);
                    bVarI.r(objY3);
                }
                ga2.a(strA, strA2, null, (Function0) ((chp) objY3), null, null, bVarI, 0, 52);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(1829533554);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
            hkb0Var2 = hkb0Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new mnk(hkb0Var2, function1, i, 2);
        }
    }
}
