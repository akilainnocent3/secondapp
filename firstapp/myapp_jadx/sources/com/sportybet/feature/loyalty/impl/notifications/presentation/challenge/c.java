package com.sportybet.feature.loyalty.impl.notifications.presentation.challenge;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.c;
import defpackage.bx6;
import defpackage.cx6;
import defpackage.fx6;
import defpackage.gaj;
import defpackage.iyf0;
import defpackage.jib0;
import defpackage.lib0;
import defpackage.m2g;
import defpackage.oib0;
import defpackage.pp8;
import defpackage.qyd0;
import defpackage.uxs;
import defpackage.w45;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static final void a(final fx6 fx6Var, final Function1<? super a, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        fx6Var.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1775817846);
        int i2 = (bVarI.M(fx6Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            UiText uiText = fx6Var.a;
            iyf0 iyf0Var = iyf0.b;
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).i0;
            long j2 = ((lib0) bVarI.O(qyd0Var)).a;
            UiText uiText2 = fx6Var.d;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new bx6(0, function1);
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            uxs uxsVar = uxs.ENABLE;
            m2g m2gVar = m2g.a;
            uiText2.getClass();
            m2gVar.getClass();
            function0.getClass();
            z45.c cVar = new z45.c(new w45.c("bottom_sheet_primary_button", uiText2, uxsVar, m2gVar, function0));
            boolean z2 = i3 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new cx6(function1, 0);
                bVarI.r(objY2);
            }
            bVar = bVarI;
            jib0.d(null, uiText, null, j, j2, 0L, iyf0Var, null, cVar, null, null, null, (Function0) objY2, null, null, null, pp8.b(854086184, new gaj() { // from class: dx6
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        fx6 fx6Var2 = fx6Var;
                        String str = fx6Var2.b;
                        d.a aVar3 = d.a.b;
                        mw90.a(str, null, j.g(aVar3, 1.0f), null, null, d0b.a.d, null, aVar2, 1573296, 1976);
                        ty0.a(aVar2, j.i(aVar3, 16.0f));
                        UiText uiText3 = fx6Var2.c;
                        uiText3.getClass();
                        lkf0.d(uiText3.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), j.g(aVar3, 1.0f), ((lib0) aVar2.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar2, 48, 0, 130040);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 1572864, 1572864, 61093);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: ex6
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
