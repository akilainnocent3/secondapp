package defpackage;

import android.app.Activity;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventPagingCursorEntity;
import com.sportybet.feature.gift.gift.data.remote.dto.BoostGiftUsablePushData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e420 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e420(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final i420 i420Var = (i420) obj3;
                final m420 m420Var = (m420) obj2;
                final BoostGiftUsablePushData boostGiftUsablePushData = (BoostGiftUsablePushData) obj;
                boostGiftUsablePushData.getClass();
                mq00 mq00Var = i420Var.b;
                mq00.b(new Function0() { // from class: h420
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        i420 i420Var2 = i420Var;
                        m420 m420Var2 = m420Var;
                        BoostGiftUsablePushData boostGiftUsablePushData2 = boostGiftUsablePushData;
                        try {
                            Activity activityE = oti.c().e();
                            if (activityE != null && !activityE.isFinishing()) {
                                i420Var2.d.a(activityE, boostGiftUsablePushData2);
                                i420Var2.a.c(m420Var2.b);
                                return Unit.a;
                            }
                            itf0.a aVar = itf0.a;
                            aVar.q("PopupDisplayCoordinator");
                            aVar.a("Boost gift callback: no valid activity, skipping", new Object[0]);
                            i420Var2.a.k(m420Var2.b);
                            return Unit.a;
                        } catch (Exception e) {
                            itf0.a aVar2 = itf0.a;
                            aVar2.q("PopupDisplayCoordinator");
                            aVar2.f(e, "Failed to process boost gift", new Object[0]);
                            i420Var2.a.k(m420Var2.b);
                        }
                    }
                });
                break;
            default:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                ((ude0) obj3).b.c(vp60Var, (SubscribedEventPagingCursorEntity) obj2);
                break;
        }
        return Unit.a;
    }
}
