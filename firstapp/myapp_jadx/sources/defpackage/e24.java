package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.BettingStreakMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.a;
import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e24 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e24(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BettingStreakMissionBottomSheetActivity.d;
                ((c) ((BettingStreakMissionBottomSheetActivity) obj).b.getValue()).x1(a.b.a);
                break;
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(b.a.j.a);
                function1.invoke(b.a.d.a);
                break;
        }
        return Unit.a;
    }
}
