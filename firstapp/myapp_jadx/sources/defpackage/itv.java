package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
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
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class itv implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ itv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        d.a aVar = d.a.b;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                UiText uiText = (UiText) obj4;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar2.q(1 & iIntValue, (iIntValue & 17) != 16)) {
                    String strA = cb40.a(R.string.page_loyalty__streak_repair_info_header, new Object[0], aVar2);
                    qyd0 qyd0Var = kjb0.a;
                    imf0 imf0Var = ((ijb0) aVar2.O(qyd0Var)).l;
                    qyd0 qyd0Var2 = oib0.a;
                    lkf0.d(strA, j.g(aVar, 1.0f), ((lib0) aVar2.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, imf0Var, aVar2, 48, 0, 130040);
                    ty0.a(aVar2, j.i(aVar, 8.0f));
                    StringUiText stringUiText = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__streak_repair_condition_reach_vdays, ay0.S(new Object[]{uiText}));
                    qyd0 qyd0Var3 = AndroidCompositionLocals_androidKt.b;
                    nj5.a(null, 0L, resourceUiText.g((Context) aVar2.O(qyd0Var3)), null, null, null, 12.0f, null, null, aVar2, 1572864, 443);
                    ty0.a(aVar2, j.i(aVar, 8.0f));
                    nj5.a(null, 0L, new ResourceUiText(R.string.page_loyalty__streak_repair_condition_monthly_vdays, ay0.S(new Object[]{uiText})).g((Context) aVar2.O(qyd0Var3)), null, null, null, 12.0f, null, null, aVar2, 1572864, 443);
                    qyd0 qyd0Var4 = ejb0.a;
                    ty0.a(aVar2, j.i(aVar, ((cjb0) aVar2.O(qyd0Var4)).f));
                    lkf0.d(cb40.a(R.string.page_loyalty__repair_tool_mission, new Object[0], aVar2), j.g(aVar, 1.0f), ((lib0) aVar2.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(qyd0Var)).d, aVar2, 48, 0, 130040);
                    ty0.a(aVar2, j.i(aVar, ((cjb0) aVar2.O(qyd0Var4)).f));
                    nj5.a(null, 0L, cb40.a(R.string.page_loyalty__streak_repair_mission_info_description, new Object[0], aVar2), null, null, null, 12.0f, null, null, aVar2, 1572864, 443);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                op8 op8Var = (op8) obj4;
                r75 r75Var = (r75) obj;
                a aVar3 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                r75Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= aVar3.M(r75Var) ? 4 : 2;
                }
                if (aVar3.q(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    d dVarJ = h.j(androidx.compose.foundation.a.a(j.g(aVar, 1.0f), new hfs(b.k(new j58(r58.d(4279898624L)), new j58(r58.d(4289755905L)), new j58(r58.d(4279898624L))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(((mmd) aVar3.O(kna.h)).C1(r75Var.d()))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0), j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), 0.0f, 4), 0.0f, 1.0f, 0.0f, 0.0f, 13);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar3.m());
                    ne00 ne00VarO = aVar3.o();
                    d dVarC = c.c(aVar3, dVarJ);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar4);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, aivVarC, yka.a.f);
                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                    }
                    hlh0.a(aVar3, dVarC, yka.a.d);
                    fc0.a(0, op8Var, aVar3);
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}
