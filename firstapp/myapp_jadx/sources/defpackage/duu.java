package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.MatchAlertDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class duu extends tv50 {
    public final /* synthetic */ MatchAlertDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duu(MatchAlertDatabase_Impl matchAlertDatabase_Impl) {
        super(1, "4e87442e0c445cbe600f6a777633fe46", "15da1a453779c5034e22264ccccb6c2f");
        this.d = matchAlertDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `subscribed_event_table` (`account` TEXT NOT NULL, `remote_index` INTEGER NOT NULL, `event_id` TEXT NOT NULL, `home_team_name` TEXT, `away_team_name` TEXT, `fixture_start_time` INTEGER, `notification_enabled` INTEGER, PRIMARY KEY(`account`, `event_id`))", vp60Var, "CREATE TABLE IF NOT EXISTS `match_alert_cursor_table` (`account` TEXT NOT NULL, `pageNo` INTEGER NOT NULL, `pageSize` INTEGER NOT NULL, PRIMARY KEY(`account`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4e87442e0c445cbe600f6a777633fe46')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `subscribed_event_table`", vp60Var, "DROP TABLE IF EXISTS `match_alert_cursor_table`");
    }

    @Override // defpackage.tv50
    public final void c(vp60 vp60Var) {
        vp60Var.getClass();
    }

    @Override // defpackage.tv50
    public final void d(vp60 vp60Var) {
        vp60Var.getClass();
        this.d.s(vp60Var);
    }

    @Override // defpackage.tv50
    public final void e(vp60 vp60Var) {
        vp60Var.getClass();
    }

    @Override // defpackage.tv50
    public final void f(vp60 vp60Var) {
        vp60Var.getClass();
        klc.a(vp60Var);
    }

    @Override // defpackage.tv50
    public final tv50.a g(vp60 vp60Var) {
        vp60Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("account", new o3f0.a(1, 1, "account", "TEXT", null, true));
        linkedHashMap.put("remote_index", new o3f0.a(0, 1, "remote_index", "INTEGER", null, true));
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_EVENT_ID, new o3f0.a(2, 1, AnalyticsParam.EVENT_PARAM_EVENT_ID, "TEXT", null, true));
        linkedHashMap.put("home_team_name", new o3f0.a(0, 1, "home_team_name", "TEXT", null, false));
        linkedHashMap.put("away_team_name", new o3f0.a(0, 1, "away_team_name", "TEXT", null, false));
        linkedHashMap.put("fixture_start_time", new o3f0.a(0, 1, "fixture_start_time", "INTEGER", null, false));
        o3f0 o3f0Var = new o3f0("subscribed_event_table", linkedHashMap, yy.b(linkedHashMap, "notification_enabled", new o3f0.a(0, 1, "notification_enabled", "INTEGER", null, false)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "subscribed_event_table");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("subscribed_event_table(com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("account", new o3f0.a(1, 1, "account", "TEXT", null, true));
        linkedHashMap2.put("pageNo", new o3f0.a(0, 1, "pageNo", "INTEGER", null, true));
        o3f0 o3f0Var2 = new o3f0("match_alert_cursor_table", linkedHashMap2, yy.b(linkedHashMap2, "pageSize", new o3f0.a(0, 1, "pageSize", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "match_alert_cursor_table");
        return !o3f0Var2.equals(o3f0VarA2) ? new tv50.a(false, dvj0.a("match_alert_cursor_table(com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventPagingCursorEntity).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2)) : new tv50.a(true, null);
    }
}
