package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class irq {
    public static final void a(szr szrVar, final UiText uiText, qcn<hsq> qcnVar, final Function1<? super hsq, Unit> function1, final Function1<? super String, Unit> function2) {
        uiText.getClass();
        qcnVar.getClass();
        szr.h(szrVar, "tag_title", new op8(-1099059577, new gaj() { // from class: frq
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                gwr gwrVar = (gwr) obj;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gwrVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar.M(gwrVar) ? 4 : 2;
                }
                if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d dVarJ = h.j(gwrVar.c(d.a.b, yi0.e(300, 0, null, 6), yi0.d(0.0f, 200.0f, null, 5), yi0.e(300, 0, null, 6)), 8.0f, 12.0f, 0.0f, 8.0f, 4);
                    UiText uiText2 = uiText;
                    uiText2.getClass();
                    lkf0.d(uiText2.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), dVarJ, ((lib0) aVar.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).j, aVar, 0, 0, 131064);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true), 2);
        for (final hsq hsqVar : qcnVar) {
            szrVar.i(inm.a("lottery_", hsqVar.a), "lottery", new op8(760983962, new gaj() { // from class: grq
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    gwr gwrVar = (gwr) obj;
                    a aVar = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gwrVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar.M(gwrVar) ? 4 : 2;
                    }
                    if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d dVarC = gwrVar.c(d.a.b, yi0.e(300, 0, null, 6), yi0.d(0.0f, 200.0f, null, 5), yi0.e(300, 0, null, 6));
                        final Function1 function3 = function1;
                        boolean zM = aVar.M(function3);
                        final hsq hsqVar2 = hsqVar;
                        boolean zA = zM | aVar.A(hsqVar2);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            objY = new Function0() { // from class: hrq
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function3.invoke(hsqVar2);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        bmt.b(dVarC, hsqVar2, (Function0) objY, function2, null, null, aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }
}
