package defpackage;

import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class pde0 implements kde0 {
    public final lv50 a;
    public final aag<SubscribedEventEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            SubscribedEventEntity subscribedEventEntity = (SubscribedEventEntity) obj;
            hq60Var.getClass();
            subscribedEventEntity.getClass();
            hq60Var.L(1, subscribedEventEntity.getAccount());
            hq60Var.q(2, subscribedEventEntity.getRemoteIndex());
            hq60Var.L(3, subscribedEventEntity.getEventId());
            String homeTeamName = subscribedEventEntity.getHomeTeamName();
            if (homeTeamName == null) {
                hq60Var.r(4);
            } else {
                hq60Var.L(4, homeTeamName);
            }
            String awayTeamName = subscribedEventEntity.getAwayTeamName();
            if (awayTeamName == null) {
                hq60Var.r(5);
            } else {
                hq60Var.L(5, awayTeamName);
            }
            Long fixtureStartTime = subscribedEventEntity.getFixtureStartTime();
            if (fixtureStartTime == null) {
                hq60Var.r(6);
            } else {
                hq60Var.q(6, fixtureStartTime.longValue());
            }
            Boolean notificationEnabled = subscribedEventEntity.getNotificationEnabled();
            Integer numValueOf = notificationEnabled != null ? Integer.valueOf(notificationEnabled.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                hq60Var.r(7);
            } else {
                hq60Var.q(7, numValueOf.intValue());
            }
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `subscribed_event_table` (`account`,`remote_index`,`event_id`,`home_team_name`,`away_team_name`,`fixture_start_time`,`notification_enabled`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            SubscribedEventEntity subscribedEventEntity = (SubscribedEventEntity) obj;
            hq60Var.getClass();
            subscribedEventEntity.getClass();
            hq60Var.L(1, subscribedEventEntity.getAccount());
            hq60Var.q(2, subscribedEventEntity.getRemoteIndex());
            hq60Var.L(3, subscribedEventEntity.getEventId());
            String homeTeamName = subscribedEventEntity.getHomeTeamName();
            if (homeTeamName == null) {
                hq60Var.r(4);
            } else {
                hq60Var.L(4, homeTeamName);
            }
            String awayTeamName = subscribedEventEntity.getAwayTeamName();
            if (awayTeamName == null) {
                hq60Var.r(5);
            } else {
                hq60Var.L(5, awayTeamName);
            }
            Long fixtureStartTime = subscribedEventEntity.getFixtureStartTime();
            if (fixtureStartTime == null) {
                hq60Var.r(6);
            } else {
                hq60Var.q(6, fixtureStartTime.longValue());
            }
            Boolean notificationEnabled = subscribedEventEntity.getNotificationEnabled();
            Integer numValueOf = notificationEnabled != null ? Integer.valueOf(notificationEnabled.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                hq60Var.r(7);
            } else {
                hq60Var.q(7, numValueOf.intValue());
            }
            hq60Var.L(8, subscribedEventEntity.getAccount());
            hq60Var.L(9, subscribedEventEntity.getEventId());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `subscribed_event_table` SET `account` = ?,`remote_index` = ?,`event_id` = ?,`home_team_name` = ?,`away_team_name` = ?,`fixture_start_time` = ?,`notification_enabled` = ? WHERE `account` = ? AND `event_id` = ?";
        }
    }

    public pde0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.kde0
    public final rde0 a(final String str) {
        return new rde0(new bw50("SELECT * FROM subscribed_event_table WHERE (? IS NOT NULL AND account = ?) ORDER BY remote_index ASC", new Function1() { // from class: ode0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                String str2 = str;
                if (str2 == null) {
                    hq60Var.r(1);
                } else {
                    hq60Var.L(1, str2);
                }
                if (str2 == null) {
                    hq60Var.r(2);
                } else {
                    hq60Var.L(2, str2);
                }
                return Unit.a;
            }
        }), this, this.a, new String[]{"subscribed_event_table"});
    }

    @Override // defpackage.kde0
    public final Object b(String str, kuu kuuVar) {
        Object objC = qlc.c(kuuVar, this.a, new m51(str, 2), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.kde0
    public final Object c(final ArrayList arrayList, kuu kuuVar) {
        Object objC = qlc.c(kuuVar, this.a, new Function1() { // from class: nde0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.b(vp60Var, arrayList);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.kde0
    public final Object d(final String str, final boolean z, wvu wvuVar) {
        Object objC = qlc.c(wvuVar, this.a, new Function1() { // from class: mde0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                boolean z2 = z;
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("UPDATE subscribed_event_table SET notification_enabled = ? WHERE (? IS NOT NULL AND account = ?)");
                try {
                    hq60VarH1.q(1, z2 ? 1L : 0L);
                    hq60VarH1.L(2, str2);
                    hq60VarH1.L(3, str2);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.kde0
    public final Object e(String str, String str2, suu suuVar) {
        return qlc.c(suuVar, this.a, new ria(1, str, str2), true, false);
    }

    @Override // defpackage.kde0
    public final Object f(final String str, final String str2, final boolean z, suu suuVar) {
        Object objC = qlc.c(suuVar, this.a, new Function1() { // from class: lde0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                boolean z2 = z;
                String str3 = str2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("UPDATE subscribed_event_table SET notification_enabled = ? WHERE (? IS NOT NULL AND account = ? AND event_id = ?)");
                try {
                    hq60VarH1.q(1, z2 ? 1L : 0L);
                    String str4 = str;
                    if (str4 == null) {
                        hq60VarH1.r(2);
                    } else {
                        hq60VarH1.L(2, str4);
                    }
                    if (str4 == null) {
                        hq60VarH1.r(3);
                    } else {
                        hq60VarH1.L(3, str4);
                    }
                    hq60VarH1.L(4, str3);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
