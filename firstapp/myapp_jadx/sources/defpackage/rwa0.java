package defpackage;

import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventPagingCursorEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rwa0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rwa0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        SubscribedEventPagingCursorEntity subscribedEventPagingCursorEntity;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j5i j5iVar = (j5i) obj;
                j5iVar.getClass();
                ((ytw) obj2).setValue(Boolean.valueOf(j5iVar.a()));
                return Unit.a;
            default:
                String str = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM match_alert_cursor_table WHERE (? IS NOT NULL AND account = ?) ");
                try {
                    hq60VarH1.L(1, str);
                    hq60VarH1.L(2, str);
                    int iB = l0b.b(hq60VarH1, "account");
                    int iB2 = l0b.b(hq60VarH1, "pageNo");
                    int iB3 = l0b.b(hq60VarH1, "pageSize");
                    if (hq60VarH1.D1()) {
                        subscribedEventPagingCursorEntity = new SubscribedEventPagingCursorEntity(hq60VarH1.k1(iB), (int) hq60VarH1.getLong(iB2), (int) hq60VarH1.getLong(iB3));
                        break;
                    } else {
                        subscribedEventPagingCursorEntity = null;
                    }
                    return subscribedEventPagingCursorEntity;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
