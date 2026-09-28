package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qde0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qde0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bw50 bw50Var = (bw50) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(bw50Var.a);
                bw50Var.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, "account");
                    int iB2 = l0b.b(hq60VarH1, "remote_index");
                    int iB3 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_EVENT_ID);
                    int iB4 = l0b.b(hq60VarH1, "home_team_name");
                    int iB5 = l0b.b(hq60VarH1, "away_team_name");
                    int iB6 = l0b.b(hq60VarH1, "fixture_start_time");
                    int iB7 = l0b.b(hq60VarH1, "notification_enabled");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        String strK1 = hq60VarH1.k1(iB);
                        int i2 = (int) hq60VarH1.getLong(iB2);
                        String strK2 = hq60VarH1.k1(iB3);
                        String strK3 = hq60VarH1.isNull(iB4) ? null : hq60VarH1.k1(iB4);
                        String strK4 = hq60VarH1.isNull(iB5) ? null : hq60VarH1.k1(iB5);
                        Long lValueOf = hq60VarH1.isNull(iB6) ? null : Long.valueOf(hq60VarH1.getLong(iB6));
                        Integer numValueOf = hq60VarH1.isNull(iB7) ? null : Integer.valueOf((int) hq60VarH1.getLong(iB7));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        arrayList.add(new SubscribedEventEntity(strK1, i2, strK2, strK3, strK4, lValueOf, boolValueOf));
                        break;
                    }
                    return arrayList;
                } finally {
                    hq60VarH1.close();
                }
            default:
                ((Boolean) obj).booleanValue();
                ((Function0) obj2).invoke();
                return Unit.a;
        }
    }
}
