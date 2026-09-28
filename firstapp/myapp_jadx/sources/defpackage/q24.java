package defpackage;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class q24 {
    public static final void a(final String str, final Function1<? super i04, Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        str.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1172119);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__earn_repair_tool_mission);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_loyalty__accept_mission);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new m24(0, function1);
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            uxs uxsVar = uxs.ENABLE;
            m2g m2gVar = m2g.a;
            m2gVar.getClass();
            function0.getClass();
            z45.c cVar = new z45.c(new w45.c("bottom_sheet_primary_button", resourceUiText2, uxsVar, m2gVar, function0));
            boolean z2 = i3 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: n24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(i04.g.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            bVar = bVarI;
            jib0.d(null, resourceUiText, null, 0L, 0L, 0L, null, null, cVar, null, null, null, (Function0) objY2, null, null, null, pp8.b(-1316990965, new gaj() { // from class: o24
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        nj5.a(null, 0L, str, null, null, null, 12.0f, null, null, aVar2, 1572864, 443);
                        ty0.a(aVar2, j.i(d.a.b, ((cjb0) aVar2.O(ejb0.a)).d));
                        nj5.a(null, 0L, cb40.a(R.string.page_loyalty__streak_repair_tool_mission_cashout_not_counted, new Object[0], aVar2), null, null, null, 12.0f, null, null, aVar2, 1572864, 443);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 0, 1572864, 61181);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    q24.a(str, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
