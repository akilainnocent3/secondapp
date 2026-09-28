package defpackage;

import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.data.repository.MatchAlertRepositoryImpl$getSubscribedEventsPaging$2$1", f = "MatchAlertRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class quu extends tje0 implements Function2<SubscribedEventEntity, v1b<? super jde0>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        quu quuVar = new quu(2, v1bVar);
        quuVar.a = obj;
        return quuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SubscribedEventEntity subscribedEventEntity, v1b<? super jde0> v1bVar) {
        return ((quu) create(subscribedEventEntity, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SubscribedEventEntity subscribedEventEntity = (SubscribedEventEntity) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        subscribedEventEntity.getClass();
        String eventId = subscribedEventEntity.getEventId();
        Long fixtureStartTime = subscribedEventEntity.getFixtureStartTime();
        Date date = new Date(fixtureStartTime != null ? fixtureStartTime.longValue() : 0L);
        Boolean notificationEnabled = subscribedEventEntity.getNotificationEnabled();
        return new jde0(eventId, date, notificationEnabled != null ? notificationEnabled.booleanValue() : false, subscribedEventEntity.getHomeTeamName(), subscribedEventEntity.getAwayTeamName());
    }
}
