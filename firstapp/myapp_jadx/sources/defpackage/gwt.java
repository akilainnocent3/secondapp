package defpackage;

import android.app.Activity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetActivity;
import com.sportybet.feature.winning.WinningDialogActivity;
import com.sportybet.feature.winning.a;
import com.sportybet.feature.winning.b;
import com.sportybet.feature.winning.d;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gwt implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;

    public /* synthetic */ gwt(py1 py1Var, int i) {
        this.a = i;
        this.b = py1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        a aVar;
        a.C0417a c0417a;
        int i = this.a;
        py1 py1Var = this.b;
        switch (i) {
            case 0:
                int i2 = LoyaltyMissionBottomSheetActivity.b;
                ((LoyaltyMissionBottomSheetActivity) py1Var).finish();
                break;
            default:
                WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
                b bVar = ((WinningDialogActivity) py1Var).f;
                wwd0 wwd0Var = bVar.d;
                do {
                    value = wwd0Var.getValue();
                    aVar = (a) value;
                    c0417a = aVar.a;
                } while (!wwd0Var.g(value, a.a(aVar, new a.C0417a(!c0417a.a, c0417a.b), false, false, false, 30)));
                ej5.c(o8i0.d(bVar), null, null, new d(bVar, null), 3);
                break;
        }
        return Unit.a;
    }
}
