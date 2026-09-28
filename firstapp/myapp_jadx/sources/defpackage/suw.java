package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class suw implements gaj {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ suw(tuw tuwVar, tuw.a aVar) {
        this.b = tuwVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                tuw tuwVar = (tuw) obj4;
                tuw.w.set(tuwVar, null);
                tuwVar.f(null);
                return Unit.a;
            default:
                UiText uiText = (UiText) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d.a aVar2 = d.a.b;
                    d dVarH = g3w.h(aVar2, "streak_repair_dialog_content");
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarH);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    lkf0.d(cb40.a(R.string.page_loyalty__streak_repair_info_header, new Object[0], aVar), j.g(aVar2, 1.0f), ((lib0) aVar.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).l, aVar, 48, 0, 130040);
                    ty0.a(aVar, j.i(aVar2, 8.0f));
                    StringUiText stringUiText = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__streak_repair_condition_reach_vdays, ay0.S(new Object[]{uiText}));
                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                    nj5.a(null, 0L, resourceUiText.g((Context) aVar.O(qyd0Var)), null, null, null, 12.0f, null, null, aVar, 1572864, 443);
                    ty0.a(aVar, j.i(aVar2, 8.0f));
                    nj5.a(null, 0L, new ResourceUiText(R.string.page_loyalty__streak_repair_condition_monthly_vdays, ay0.S(new Object[]{uiText})).g((Context) aVar.O(qyd0Var)), null, null, null, 12.0f, null, null, aVar, 1572864, 443);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
