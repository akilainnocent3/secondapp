package defpackage;

import android.content.Intent;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.feature.notificationcenter.NotificationCenterActivity;
import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m51 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m51(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AutoBetActivity autoBetActivity = (AutoBetActivity) obj2;
                String str = (String) obj;
                int i2 = AutoBetActivity.f;
                str.getClass();
                Intent intent = new Intent(autoBetActivity, (Class<?>) RSportsBetTicketDetailsActivity.class);
                intent.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, str);
                autoBetActivity.e.b(intent);
                return Unit.a;
            case 1:
                NotificationCenterActivity notificationCenterActivity = (NotificationCenterActivity) obj2;
                String str2 = (String) obj;
                int i3 = NotificationCenterActivity.e;
                str2.getClass();
                f00 f00Var = vgb0.a;
                vgb0.c(AnalyticsEvent.NC_REDIRECT, jpu.b(new Pair("data", "update-".concat(str2))), false);
                yi5 yi5Var = notificationCenterActivity.c;
                if (yi5Var != null) {
                    yrh0.o(notificationCenterActivity, yi5Var);
                    return Unit.a;
                }
                Intrinsics.n("buildConfiguration");
                throw null;
            default:
                String str3 = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM subscribed_event_table WHERE (? IS NOT NULL AND account = ?)");
                try {
                    if (str3 == null) {
                        hq60VarH1.r(1);
                    } else {
                        hq60VarH1.L(1, str3);
                    }
                    if (str3 == null) {
                        hq60VarH1.r(2);
                    } else {
                        hq60VarH1.L(2, str3);
                    }
                    hq60VarH1.D1();
                    hq60VarH1.close();
                    return Unit.a;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
        }
    }
}
