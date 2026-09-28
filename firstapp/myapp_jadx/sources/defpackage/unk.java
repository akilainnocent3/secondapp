package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.gift.gift.presentation.b;
import com.sportybet.feature.gift.gift.presentation.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class unk {
    public static final void a(final c.a aVar, final Function1<? super b, Unit> function1, a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        aVar.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar2.i(-1670763756);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ResourceUiText resourceUiText = aVar.c;
            iyf0 iyf0Var = iyf0.a;
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.gift__bet_now);
            int i3 = i2 & 112;
            boolean z = ((i2 & 14) == 4) | (i3 == 32);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new qnk(0, aVar, function1);
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            uxs uxsVar = uxs.ENABLE;
            m2g m2gVar = m2g.a;
            m2gVar.getClass();
            function0.getClass();
            z45.d dVar = new z45.d(new w45.c("bottom_sheet_primary_button", resourceUiText2, uxsVar, m2gVar, function0), new w45.b(pp8.b(1919178094, new rnk(function1, aVar), bVarI)));
            boolean z2 = i3 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new vb7(function1, 1);
                bVarI.r(objY2);
            }
            bVar = bVarI;
            jib0.d(null, resourceUiText, null, 0L, 0L, 0L, iyf0Var, null, dVar, null, null, null, (Function0) objY2, null, null, null, pp8.b(1890533810, new gaj() { // from class: snk
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        c.a aVar4 = aVar;
                        lkf0.d(aVar4.d.g((Context) aVar3.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) aVar3.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar3.O(kjb0.a)).l, aVar3, 0, 0, 131066);
                        mw90.a(aVar4.f, "intro image", j.t(d.a.b, 312.0f, 293.0f), null, null, null, null, aVar3, 432, 2040);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 1572864, 1575936, 52925);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tnk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    unk.a(aVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
