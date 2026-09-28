package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class whj0 {
    public static final void a(d dVar, final ijf0 ijf0Var, final Function1 function1, final BigDecimal bigDecimal, final xhj0 xhj0Var, Function1 function2, a aVar, final int i) {
        b bVar;
        final d dVar2;
        final Function1 function3;
        String strA;
        ycg bVar2;
        boolean z;
        ijf0Var.getClass();
        xhj0Var.getClass();
        b bVarI = aVar.i(976857727);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(ijf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(bigDecimal) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? bVarI.M(xhj0Var) : bVarI.A(xhj0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = i2 | 196608;
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new uhj0();
                bVarI.r(objY);
            }
            final Function1 function4 = (Function1) objY;
            d.a aVar2 = d.a.b;
            d dVarV = j.v(j.g(aVar2, 1.0f), 0.0f, 48.0f, 0.0f, 13);
            gop gopVar = new gop(3, 0, 123);
            if (bigDecimal == null) {
                bVarI.N(-1129085450);
                bVarI.X(false);
                strA = null;
            } else {
                bVarI.N(-1129085449);
                strA = cb40.a(R.string.page_payment__min_vnum, new Object[]{n4d.a(bigDecimal)}, bVarI);
                bVarI.X(false);
            }
            String strA2 = "";
            if (strA == null) {
                strA = "";
            }
            boolean z2 = ((xhj0Var instanceof xhj0.i) || (xhj0Var instanceof xhj0.d)) ? false : true;
            lff0 lff0VarA = kff0.a(bVarI);
            int i4 = i3 >> 12;
            boolean z3 = xhj0Var instanceof xhj0.b;
            if (z3) {
                bVarI.N(-1794714739);
                UiText uiText = ((xhj0.b) xhj0Var).a;
                uiText.getClass();
                nk0 nk0VarA = uiText.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                boolean z4 = (((i4 & 112) ^ 48) > 32 && bVarI.M(function4)) | ((((i4 & 14) ^ 6) > 4 && bVarI.A(xhj0Var)) || (i4 & 6) == 4);
                Object objY2 = bVarI.y();
                if (z4 || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: thj0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((Integer) obj).intValue();
                            function4.invoke(((xhj0.b) xhj0Var).b);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                bVar2 = new ycg.a(nk0VarA, (Function1) objY2);
                z = false;
                bVarI.X(false);
            } else {
                bVarI.N(-1794708385);
                if (xhj0Var instanceof xhj0.a) {
                    bVarI.N(845286382);
                    xhj0.a aVar3 = (xhj0.a) xhj0Var;
                    strA2 = cb40.a(R.string.page_withdraw__insufficient_balance_to_withdral_vcurrency_vnum_with_withdrawal_vfee__NG, new Object[]{bVarI.O(bij0.b), n4d.a(aVar3.a), n4d.a(aVar3.b)}, bVarI);
                    z = false;
                    bVarI.X(false);
                } else if (z3) {
                    bVarI.N(845295576);
                    UiText uiText2 = ((xhj0.b) xhj0Var).a;
                    uiText2.getClass();
                    strA2 = uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    z = false;
                    bVarI.X(false);
                } else {
                    z = false;
                    if (xhj0Var instanceof xhj0.e) {
                        bVarI.N(845297540);
                        strA2 = cb40.a(R.string.common_feedback__your_balance_is_insufficient, new Object[0], bVarI);
                        bVarI.X(false);
                    } else if (xhj0Var instanceof xhj0.f) {
                        bVarI.N(845302354);
                        strA2 = cb40.a(R.string.page_withdraw__amount_exceeds_your_withdrawable_balance_vcurrency_vbalance, new Object[]{bVarI.O(bij0.b), n4d.a(((xhj0.f) xhj0Var).a)}, bVarI);
                        z = false;
                        bVarI.X(false);
                    } else if (xhj0Var instanceof xhj0.g) {
                        bVarI.N(845310236);
                        strA2 = cb40.a(R.string.page_withdraw__the_maximum_withdrawal_amount_is_vcurrency_vnum, new Object[]{bVarI.O(bij0.b), n4d.a(((xhj0.g) xhj0Var).a)}, bVarI);
                        z = false;
                        bVarI.X(false);
                    } else if (xhj0Var instanceof xhj0.h) {
                        bVarI.N(845317468);
                        strA2 = cb40.a(R.string.page_withdraw__the_minimum_withdrawal_amount_is_vcurrency_vnum, new Object[]{bVarI.O(bij0.b), n4d.a(((xhj0.h) xhj0Var).a)}, bVarI);
                        z = false;
                        bVarI.X(false);
                    } else {
                        z = false;
                        if (xhj0Var.equals(xhj0.j.a)) {
                            bVarI.N(845324480);
                            strA2 = cb40.a(R.string.common_feedback__something_went_wrong_tip, new Object[0], bVarI);
                            bVarI.X(false);
                        } else if (xhj0Var.equals(xhj0.i.a) || xhj0Var.equals(xhj0.d.a)) {
                            z = false;
                            bVarI.N(435419342);
                            bVarI.X(false);
                        } else {
                            if (!xhj0Var.equals(xhj0.c.a)) {
                                throw igf0.a(bVarI, 845285335, false);
                            }
                            bVarI.N(845331585);
                            z = false;
                            strA2 = cb40.a(R.string.page_payment__please_enter_a_valid_integer, new Object[0], bVarI);
                            bVarI.X(false);
                        }
                    }
                }
                bVar2 = new ycg.b(strA2);
                bVarI.X(z);
            }
            if ((i3 & 896) == 256) {
                z = true;
            }
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new n22(function1, 2);
                bVarI.r(objY3);
            }
            int i5 = (i3 & 112) | 805306752;
            dVar2 = aVar2;
            bVar = bVarI;
            jr7.a(dVarV, ijf0Var, a1a.a, z2, bVar2, false, strA, null, lff0VarA, gopVar, null, 6, null, null, (Function1) objY3, bVar, i5, 0, 13472);
            function3 = function4;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            function3 = function2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vhj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    whj0.a(dVar2, ijf0Var, function1, bigDecimal, xhj0Var, function3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
