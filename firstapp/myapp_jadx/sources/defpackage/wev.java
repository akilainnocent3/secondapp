package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wev implements tev {
    public final fbh0 a;

    public wev(fbh0 fbh0Var) {
        this.a = fbh0Var;
    }

    @Override // defpackage.tev
    public final op8 a(final ErrorDataInfo errorDataInfo, final Function0 function0) {
        function0.getClass();
        return new op8(457661331, new Function2() { // from class: uev
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wev wevVar = this;
                    boolean zA = aVar.A(wevVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new vev(wevVar, i);
                        aVar.r(objY);
                    }
                    knf.a(errorDataInfo, true, function0, (Function1) objY, aVar, 48);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true);
    }

    @Override // defpackage.tev
    public final void b(Context context) {
        wsv wsvVar = wsv.a;
        context.getClass();
        int i = LoyaltyMissionBottomSheetActivity.b;
        LoyaltyMissionBottomSheetActivity.a.a(new LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.RegularMission(wsvVar, null), context);
    }
}
