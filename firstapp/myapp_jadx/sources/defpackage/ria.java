package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ria implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ria(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        boolean z = true;
        Object subscribedEventEntity = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(snapshotStateList.size(), null, new uia.b(snapshotStateList), new op8(2039820996, new uia.c(snapshotStateList, (mz1) obj2), true));
                return Unit.a;
            default:
                String str = (String) obj3;
                String str2 = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM subscribed_event_table WHERE (? IS NOT NULL AND account = ? AND event_id = ?)");
                try {
                    hq60VarH1.L(1, str);
                    hq60VarH1.L(2, str);
                    hq60VarH1.L(3, str2);
                    int iB = l0b.b(hq60VarH1, "account");
                    int iB2 = l0b.b(hq60VarH1, "remote_index");
                    int iB3 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_EVENT_ID);
                    int iB4 = l0b.b(hq60VarH1, "home_team_name");
                    int iB5 = l0b.b(hq60VarH1, "away_team_name");
                    int iB6 = l0b.b(hq60VarH1, "fixture_start_time");
                    int iB7 = l0b.b(hq60VarH1, "notification_enabled");
                    if (hq60VarH1.D1()) {
                        String strK1 = hq60VarH1.k1(iB);
                        int i2 = (int) hq60VarH1.getLong(iB2);
                        String strK2 = hq60VarH1.k1(iB3);
                        String strK3 = hq60VarH1.isNull(iB4) ? null : hq60VarH1.k1(iB4);
                        String strK4 = hq60VarH1.isNull(iB5) ? null : hq60VarH1.k1(iB5);
                        Long lValueOf = hq60VarH1.isNull(iB6) ? null : Long.valueOf(hq60VarH1.getLong(iB6));
                        Integer numValueOf = hq60VarH1.isNull(iB7) ? null : Integer.valueOf((int) hq60VarH1.getLong(iB7));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            subscribedEventEntity = Boolean.valueOf(z);
                        }
                        subscribedEventEntity = new SubscribedEventEntity(strK1, i2, strK2, strK3, strK4, lValueOf, subscribedEventEntity);
                    }
                    return subscribedEventEntity;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
