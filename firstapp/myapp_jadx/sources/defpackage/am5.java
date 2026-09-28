package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.social.data.local.CCPDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class am5 extends tv50 {
    public final /* synthetic */ CCPDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am5(CCPDatabase_Impl cCPDatabase_Impl) {
        super(1, "1a74bb9bc9efb95aa307d84c51417302", "e0f6df6795c3dddd89aed1b575aa7ed4");
        this.d = cCPDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `creator_credit_table` (`batch_id` TEXT NOT NULL, `claimed_amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `end_time` INTEGER NOT NULL, `last_claimed_time` INTEGER NOT NULL, `potential_reward` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `status` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `source_index` INTEGER NOT NULL, PRIMARY KEY(`batch_id`, `user_id`))", vp60Var, "CREATE TABLE IF NOT EXISTS `creator_credits_cursor_table` (`userId` TEXT NOT NULL, `pageNo` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `creator_credit_history_table` (`batch_id` TEXT NOT NULL, `claimed_amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `end_time` INTEGER NOT NULL, `last_claimed_time` INTEGER NOT NULL, `potential_reward` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `status` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `is_claimed` INTEGER NOT NULL, `source_index` INTEGER NOT NULL, PRIMARY KEY(`batch_id`, `user_id`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `creator_credits_history_cursor_table` (`userId` TEXT NOT NULL, `pageNo` INTEGER NOT NULL, `isClaimed` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1a74bb9bc9efb95aa307d84c51417302')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `creator_credit_table`", vp60Var, "DROP TABLE IF EXISTS `creator_credits_cursor_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `creator_credit_history_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `creator_credits_history_cursor_table`");
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
        linkedHashMap.put("batch_id", new o3f0.a(1, 1, "batch_id", "TEXT", null, true));
        linkedHashMap.put("claimed_amount", new o3f0.a(0, 1, "claimed_amount", "INTEGER", null, true));
        linkedHashMap.put("currency", new o3f0.a(0, 1, "currency", "TEXT", null, true));
        linkedHashMap.put("end_time", new o3f0.a(0, 1, "end_time", "INTEGER", null, true));
        linkedHashMap.put("last_claimed_time", new o3f0.a(0, 1, "last_claimed_time", "INTEGER", null, true));
        linkedHashMap.put("potential_reward", new o3f0.a(0, 1, "potential_reward", "INTEGER", null, true));
        linkedHashMap.put("start_time", new o3f0.a(0, 1, "start_time", "INTEGER", null, true));
        linkedHashMap.put(AnalyticsParam.EVENT_STATUS, new o3f0.a(0, 1, AnalyticsParam.EVENT_STATUS, "INTEGER", null, true));
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_USER_ID, new o3f0.a(2, 1, AnalyticsParam.EVENT_PARAM_USER_ID, "TEXT", null, true));
        o3f0 o3f0Var = new o3f0("creator_credit_table", linkedHashMap, yy.b(linkedHashMap, "source_index", new o3f0.a(0, 1, "source_index", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "creator_credit_table");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("creator_credit_table(com.sportybet.android.social.data.local.CreatorCreditEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("userId", new o3f0.a(1, 1, "userId", "TEXT", null, true));
        o3f0 o3f0Var2 = new o3f0("creator_credits_cursor_table", linkedHashMap2, yy.b(linkedHashMap2, "pageNo", new o3f0.a(0, 1, "pageNo", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "creator_credits_cursor_table");
        if (!o3f0Var2.equals(o3f0VarA2)) {
            return new tv50.a(false, dvj0.a("creator_credits_cursor_table(com.sportybet.android.social.data.local.CreatorCreditsCursorEntity).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("batch_id", new o3f0.a(1, 1, "batch_id", "TEXT", null, true));
        linkedHashMap3.put("claimed_amount", new o3f0.a(0, 1, "claimed_amount", "INTEGER", null, true));
        linkedHashMap3.put("currency", new o3f0.a(0, 1, "currency", "TEXT", null, true));
        linkedHashMap3.put("end_time", new o3f0.a(0, 1, "end_time", "INTEGER", null, true));
        linkedHashMap3.put("last_claimed_time", new o3f0.a(0, 1, "last_claimed_time", "INTEGER", null, true));
        linkedHashMap3.put("potential_reward", new o3f0.a(0, 1, "potential_reward", "INTEGER", null, true));
        linkedHashMap3.put("start_time", new o3f0.a(0, 1, "start_time", "INTEGER", null, true));
        linkedHashMap3.put(AnalyticsParam.EVENT_STATUS, new o3f0.a(0, 1, AnalyticsParam.EVENT_STATUS, "INTEGER", null, true));
        linkedHashMap3.put(AnalyticsParam.EVENT_PARAM_USER_ID, new o3f0.a(2, 1, AnalyticsParam.EVENT_PARAM_USER_ID, "TEXT", null, true));
        linkedHashMap3.put("is_claimed", new o3f0.a(0, 1, "is_claimed", "INTEGER", null, true));
        o3f0 o3f0Var3 = new o3f0("creator_credit_history_table", linkedHashMap3, yy.b(linkedHashMap3, "source_index", new o3f0.a(0, 1, "source_index", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA3 = o3f0.b.a(vp60Var, "creator_credit_history_table");
        if (!o3f0Var3.equals(o3f0VarA3)) {
            return new tv50.a(false, dvj0.a("creator_credit_history_table(com.sportybet.android.social.data.local.CreatorCreditHistoryEntity).\n Expected:\n", o3f0Var3, "\n Found:\n", o3f0VarA3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("userId", new o3f0.a(1, 1, "userId", "TEXT", null, true));
        linkedHashMap4.put("pageNo", new o3f0.a(0, 1, "pageNo", "INTEGER", null, true));
        o3f0 o3f0Var4 = new o3f0("creator_credits_history_cursor_table", linkedHashMap4, yy.b(linkedHashMap4, "isClaimed", new o3f0.a(0, 1, "isClaimed", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA4 = o3f0.b.a(vp60Var, "creator_credits_history_cursor_table");
        return !o3f0Var4.equals(o3f0VarA4) ? new tv50.a(false, dvj0.a("creator_credits_history_cursor_table(com.sportybet.android.social.data.local.CreatorCreditsHistoryCursorEntity).\n Expected:\n", o3f0Var4, "\n Found:\n", o3f0VarA4)) : new tv50.a(true, null);
    }
}
