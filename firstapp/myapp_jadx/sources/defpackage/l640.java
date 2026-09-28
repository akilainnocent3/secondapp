package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.data.db.RealBetHistoryOrderDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class l640 extends tv50 {
    public final /* synthetic */ RealBetHistoryOrderDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l640(RealBetHistoryOrderDatabase_Impl realBetHistoryOrderDatabase_Impl) {
        super(1, "b7fb4fdf215f4011608088d5ef86822b", "9f051344e033cbc7608d52935003ad18");
        this.d = realBetHistoryOrderDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `real_bet_history_order_table` (`order_id` TEXT NOT NULL, `user_id` TEXT, `order_type` INTEGER, `share_code` TEXT, `currency` TEXT, `total_stake` TEXT, `winning_status` INTEGER, `total_winnings` TEXT, `create_time` INTEGER, `selections` TEXT NOT NULL, `combination_size` INTEGER, `min_to_win` INTEGER, `selection_size` INTEGER, `odds_boosted` INTEGER, `odds_lfb_boosted` INTEGER, `feature_tags` TEXT, `is_editable` INTEGER, `bet_ids` TEXT, `is_one_cut_win` INTEGER, `is_bulk_delete_performing` INTEGER NOT NULL, `remix_bet_enabled` INTEGER NOT NULL, `show_remix_bet_red_dot` INTEGER NOT NULL, `is_selected_for_bulk_delete` INTEGER NOT NULL, `user_note` TEXT, `is_payment_in_progress` INTEGER NOT NULL, `has_pending_event` INTEGER, PRIMARY KEY(`order_id`))", vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b7fb4fdf215f4011608088d5ef86822b')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        vp60Var.getClass();
        up60.a(vp60Var, "DROP TABLE IF EXISTS `real_bet_history_order_table`");
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
        linkedHashMap.put(AnalyticsParam.SOCIAL_ORDER_ID, new o3f0.a(1, 1, AnalyticsParam.SOCIAL_ORDER_ID, "TEXT", null, true));
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_USER_ID, new o3f0.a(0, 1, AnalyticsParam.EVENT_PARAM_USER_ID, "TEXT", null, false));
        linkedHashMap.put("order_type", new o3f0.a(0, 1, "order_type", "INTEGER", null, false));
        linkedHashMap.put("share_code", new o3f0.a(0, 1, "share_code", "TEXT", null, false));
        linkedHashMap.put("currency", new o3f0.a(0, 1, "currency", "TEXT", null, false));
        linkedHashMap.put("total_stake", new o3f0.a(0, 1, "total_stake", "TEXT", null, false));
        linkedHashMap.put("winning_status", new o3f0.a(0, 1, "winning_status", "INTEGER", null, false));
        linkedHashMap.put("total_winnings", new o3f0.a(0, 1, "total_winnings", "TEXT", null, false));
        linkedHashMap.put("create_time", new o3f0.a(0, 1, "create_time", "INTEGER", null, false));
        linkedHashMap.put("selections", new o3f0.a(0, 1, "selections", "TEXT", null, true));
        linkedHashMap.put("combination_size", new o3f0.a(0, 1, "combination_size", "INTEGER", null, false));
        linkedHashMap.put("min_to_win", new o3f0.a(0, 1, "min_to_win", "INTEGER", null, false));
        linkedHashMap.put("selection_size", new o3f0.a(0, 1, "selection_size", "INTEGER", null, false));
        linkedHashMap.put("odds_boosted", new o3f0.a(0, 1, "odds_boosted", "INTEGER", null, false));
        linkedHashMap.put("odds_lfb_boosted", new o3f0.a(0, 1, "odds_lfb_boosted", "INTEGER", null, false));
        linkedHashMap.put("feature_tags", new o3f0.a(0, 1, "feature_tags", "TEXT", null, false));
        linkedHashMap.put("is_editable", new o3f0.a(0, 1, "is_editable", "INTEGER", null, false));
        linkedHashMap.put("bet_ids", new o3f0.a(0, 1, "bet_ids", "TEXT", null, false));
        linkedHashMap.put("is_one_cut_win", new o3f0.a(0, 1, "is_one_cut_win", "INTEGER", null, false));
        linkedHashMap.put("is_bulk_delete_performing", new o3f0.a(0, 1, "is_bulk_delete_performing", "INTEGER", null, true));
        linkedHashMap.put("remix_bet_enabled", new o3f0.a(0, 1, "remix_bet_enabled", "INTEGER", null, true));
        linkedHashMap.put("show_remix_bet_red_dot", new o3f0.a(0, 1, "show_remix_bet_red_dot", "INTEGER", null, true));
        linkedHashMap.put("is_selected_for_bulk_delete", new o3f0.a(0, 1, "is_selected_for_bulk_delete", "INTEGER", null, true));
        linkedHashMap.put("user_note", new o3f0.a(0, 1, "user_note", "TEXT", null, false));
        linkedHashMap.put("is_payment_in_progress", new o3f0.a(0, 1, "is_payment_in_progress", "INTEGER", null, true));
        o3f0 o3f0Var = new o3f0("real_bet_history_order_table", linkedHashMap, yy.b(linkedHashMap, "has_pending_event", new o3f0.a(0, 1, "has_pending_event", "INTEGER", null, false)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "real_bet_history_order_table");
        return !o3f0Var.equals(o3f0VarA) ? new tv50.a(false, dvj0.a("real_bet_history_order_table(com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA)) : new tv50.a(true, null);
    }
}
