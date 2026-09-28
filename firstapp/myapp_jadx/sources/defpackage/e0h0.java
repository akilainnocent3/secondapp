package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e0h0 {
    public static final void a(final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        int i2;
        b bVarA = v2g.a(function0, function1, aVar, -268751267);
        if ((i & 6) == 0) {
            i2 = (bVarA.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function1) ? 32 : 16;
        }
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            qyd0 qyd0Var = ajb0.a;
            ihe0.a(dVarG, j060.e(((zib0) bVarA.O(qyd0Var)).d, ((zib0) bVarA.O(qyd0Var)).d, 0.0f, 0.0f, 12), ((lib0) bVarA.O(oib0.a)).i0, 0L, 0.0f, 0.0f, null, pp8.b(750579896, new Function2() { // from class: a0h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarJ = g3w.j(h.j(d.a.b, 0.0f, ((cjb0) aVar2.O(ejb0.a)).i, 0.0f, 0.0f, 13), 14);
                        StringUiText stringUiText = vch0.a;
                        ResourceUiText resourceUiText = new ResourceUiText(R.string.component_two_fa__secure_dialog_title);
                        iyf0 iyf0Var = iyf0.b;
                        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.component_two_fa__secure_dialog_primary_action);
                        uxs uxsVar = uxs.ENABLE;
                        m2g m2gVar = m2g.a;
                        m2gVar.getClass();
                        Function0 function2 = function0;
                        function2.getClass();
                        w45.c cVar = new w45.c("bottom_sheet_primary_button", resourceUiText2, uxsVar, m2gVar, function2);
                        final Function0 function3 = function1;
                        z45.d dVar = new z45.d(cVar, new w45.b(pp8.b(-1351452717, new gaj() { // from class: c0h0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((d) obj3).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    ddd0.a(g3w.h(j.g(d.a.b, 1.0f), "skip"), false, null, null, null, false, null, null, function3, xy9.a, aVar3, 805306374, 254);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2)));
                        Object objY = aVar2.y();
                        if (objY == a.C0041a.a) {
                            objY = new d0h0();
                            aVar2.r(objY);
                        }
                        jib0.e(dVarJ, resourceUiText, 0L, iyf0Var, null, dVar, null, null, (Function0) objY, null, xy9.b, aVar2, 100690944, 6, 708);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, 12582918, 120);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b0h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    e0h0.a(function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
