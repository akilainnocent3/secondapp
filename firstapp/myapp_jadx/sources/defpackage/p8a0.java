package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.social.data.local.SocialDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class p8a0 extends tv50 {
    public final /* synthetic */ SocialDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8a0(SocialDatabase_Impl socialDatabase_Impl) {
        super(3, "83eb6bf7879bff11e2c406294440bf77", "36ddceb18be4ebf9ab07f87abb4ce2ae");
        this.d = socialDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `social_share_code_table` (`username` TEXT NOT NULL, `share_code` TEXT NOT NULL, `total_odds` REAL NOT NULL, `folds_amount` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `deadline` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `share_code_detail` TEXT NOT NULL, `note` TEXT, `popularity_level` TEXT, `is_creator_code` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`share_code`, `username`))", vp60Var, "CREATE TABLE IF NOT EXISTS `social_share_code_cursor_table` (`username` TEXT NOT NULL, `pageNo` INTEGER NOT NULL, `pageSize` INTEGER NOT NULL, PRIMARY KEY(`username`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `social_follower_table` (`account` TEXT NOT NULL, `nickname` TEXT NOT NULL, `avatar_url` TEXT NOT NULL, `is_followed` INTEGER NOT NULL, `user_type` TEXT NOT NULL, `page_index` INTEGER NOT NULL, PRIMARY KEY(`account`, `nickname`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `social_following_table` (`account` TEXT NOT NULL, `nickname` TEXT NOT NULL, `avatar_url` TEXT NOT NULL, `is_followed` INTEGER NOT NULL, `user_type` TEXT NOT NULL, `page_index` INTEGER NOT NULL, PRIMARY KEY(`account`, `nickname`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `social_follower_cursor_table` (`account` TEXT NOT NULL, `pageNo` INTEGER NOT NULL, `pageSize` INTEGER NOT NULL, PRIMARY KEY(`account`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `social_following_cursor_table` (`account` TEXT NOT NULL, `pageNo` INTEGER NOT NULL, `pageSize` INTEGER NOT NULL, PRIMARY KEY(`account`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `social_following_code_table` (`account` TEXT NOT NULL, `page_index` INTEGER NOT NULL, `nickname` TEXT NOT NULL, `avatar_url` TEXT NOT NULL, `country` TEXT NOT NULL, `user_type` TEXT NOT NULL, `share_code` TEXT NOT NULL, `total_odds` REAL NOT NULL, `folds_amount` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `deadline` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `share_code_detail` TEXT NOT NULL, PRIMARY KEY(`share_code`, `account`, `nickname`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `social_following_code_cursor_table` (`account` TEXT NOT NULL, `pageNo` INTEGER NOT NULL, PRIMARY KEY(`account`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '83eb6bf7879bff11e2c406294440bf77')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `social_share_code_table`", vp60Var, "DROP TABLE IF EXISTS `social_share_code_cursor_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `social_follower_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `social_following_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `social_follower_cursor_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `social_following_cursor_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `social_following_code_table`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `social_following_code_cursor_table`");
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
        linkedHashMap.put("username", new o3f0.a(2, 1, "username", "TEXT", null, true));
        linkedHashMap.put("share_code", new o3f0.a(1, 1, "share_code", "TEXT", null, true));
        linkedHashMap.put("total_odds", new o3f0.a(0, 1, "total_odds", "REAL", null, true));
        linkedHashMap.put("folds_amount", new o3f0.a(0, 1, "folds_amount", "INTEGER", null, true));
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_USER_ID, new o3f0.a(0, 1, AnalyticsParam.EVENT_PARAM_USER_ID, "TEXT", null, true));
        linkedHashMap.put("deadline", new o3f0.a(0, 1, "deadline", "INTEGER", null, true));
        linkedHashMap.put("create_time", new o3f0.a(0, 1, "create_time", "INTEGER", null, true));
        linkedHashMap.put("share_code_detail", new o3f0.a(0, 1, "share_code_detail", "TEXT", null, true));
        linkedHashMap.put("note", new o3f0.a(0, 1, "note", "TEXT", null, false));
        linkedHashMap.put("popularity_level", new o3f0.a(0, 1, "popularity_level", "TEXT", null, false));
        o3f0 o3f0Var = new o3f0("social_share_code_table", linkedHashMap, yy.b(linkedHashMap, "is_creator_code", new o3f0.a(0, 1, "is_creator_code", "INTEGER", "0", true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "social_share_code_table");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("social_share_code_table(com.sportybet.android.social.data.local.SocShareCodeEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("username", new o3f0.a(1, 1, "username", "TEXT", null, true));
        linkedHashMap2.put("pageNo", new o3f0.a(0, 1, "pageNo", "INTEGER", null, true));
        o3f0 o3f0Var2 = new o3f0("social_share_code_cursor_table", linkedHashMap2, yy.b(linkedHashMap2, "pageSize", new o3f0.a(0, 1, "pageSize", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "social_share_code_cursor_table");
        if (!o3f0Var2.equals(o3f0VarA2)) {
            return new tv50.a(false, dvj0.a("social_share_code_cursor_table(com.sportybet.android.social.data.local.SocShareCodeCursorEntity).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("account", new o3f0.a(1, 1, "account", "TEXT", null, true));
        linkedHashMap3.put("nickname", new o3f0.a(2, 1, "nickname", "TEXT", null, true));
        linkedHashMap3.put("avatar_url", new o3f0.a(0, 1, "avatar_url", "TEXT", null, true));
        linkedHashMap3.put("is_followed", new o3f0.a(0, 1, "is_followed", "INTEGER", null, true));
        linkedHashMap3.put("user_type", new o3f0.a(0, 1, "user_type", "TEXT", null, true));
        o3f0 o3f0Var3 = new o3f0("social_follower_table", linkedHashMap3, yy.b(linkedHashMap3, "page_index", new o3f0.a(0, 1, "page_index", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA3 = o3f0.b.a(vp60Var, "social_follower_table");
        if (!o3f0Var3.equals(o3f0VarA3)) {
            return new tv50.a(false, dvj0.a("social_follower_table(com.sportybet.android.social.data.local.SocialFollowerEntity).\n Expected:\n", o3f0Var3, "\n Found:\n", o3f0VarA3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("account", new o3f0.a(1, 1, "account", "TEXT", null, true));
        linkedHashMap4.put("nickname", new o3f0.a(2, 1, "nickname", "TEXT", null, true));
        linkedHashMap4.put("avatar_url", new o3f0.a(0, 1, "avatar_url", "TEXT", null, true));
        linkedHashMap4.put("is_followed", new o3f0.a(0, 1, "is_followed", "INTEGER", null, true));
        linkedHashMap4.put("user_type", new o3f0.a(0, 1, "user_type", "TEXT", null, true));
        o3f0 o3f0Var4 = new o3f0("social_following_table", linkedHashMap4, yy.b(linkedHashMap4, "page_index", new o3f0.a(0, 1, "page_index", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA4 = o3f0.b.a(vp60Var, "social_following_table");
        if (!o3f0Var4.equals(o3f0VarA4)) {
            return new tv50.a(false, dvj0.a("social_following_table(com.sportybet.android.social.data.local.SocialFollowingEntity).\n Expected:\n", o3f0Var4, "\n Found:\n", o3f0VarA4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("account", new o3f0.a(1, 1, "account", "TEXT", null, true));
        linkedHashMap5.put("pageNo", new o3f0.a(0, 1, "pageNo", "INTEGER", null, true));
        o3f0 o3f0Var5 = new o3f0("social_follower_cursor_table", linkedHashMap5, yy.b(linkedHashMap5, "pageSize", new o3f0.a(0, 1, "pageSize", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA5 = o3f0.b.a(vp60Var, "social_follower_cursor_table");
        if (!o3f0Var5.equals(o3f0VarA5)) {
            return new tv50.a(false, dvj0.a("social_follower_cursor_table(com.sportybet.android.social.data.local.SocialFollowerCursorEntity).\n Expected:\n", o3f0Var5, "\n Found:\n", o3f0VarA5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("account", new o3f0.a(1, 1, "account", "TEXT", null, true));
        linkedHashMap6.put("pageNo", new o3f0.a(0, 1, "pageNo", "INTEGER", null, true));
        o3f0 o3f0Var6 = new o3f0("social_following_cursor_table", linkedHashMap6, yy.b(linkedHashMap6, "pageSize", new o3f0.a(0, 1, "pageSize", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA6 = o3f0.b.a(vp60Var, "social_following_cursor_table");
        if (!o3f0Var6.equals(o3f0VarA6)) {
            return new tv50.a(false, dvj0.a("social_following_cursor_table(com.sportybet.android.social.data.local.SocialFollowingCursorEntity).\n Expected:\n", o3f0Var6, "\n Found:\n", o3f0VarA6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("account", new o3f0.a(2, 1, "account", "TEXT", null, true));
        linkedHashMap7.put("page_index", new o3f0.a(0, 1, "page_index", "INTEGER", null, true));
        linkedHashMap7.put("nickname", new o3f0.a(3, 1, "nickname", "TEXT", null, true));
        linkedHashMap7.put("avatar_url", new o3f0.a(0, 1, "avatar_url", "TEXT", null, true));
        linkedHashMap7.put("country", new o3f0.a(0, 1, "country", "TEXT", null, true));
        linkedHashMap7.put("user_type", new o3f0.a(0, 1, "user_type", "TEXT", null, true));
        linkedHashMap7.put("share_code", new o3f0.a(1, 1, "share_code", "TEXT", null, true));
        linkedHashMap7.put("total_odds", new o3f0.a(0, 1, "total_odds", "REAL", null, true));
        linkedHashMap7.put("folds_amount", new o3f0.a(0, 1, "folds_amount", "INTEGER", null, true));
        linkedHashMap7.put(AnalyticsParam.EVENT_PARAM_USER_ID, new o3f0.a(0, 1, AnalyticsParam.EVENT_PARAM_USER_ID, "TEXT", null, true));
        linkedHashMap7.put("deadline", new o3f0.a(0, 1, "deadline", "INTEGER", null, true));
        linkedHashMap7.put("create_time", new o3f0.a(0, 1, "create_time", "INTEGER", null, true));
        o3f0 o3f0Var7 = new o3f0("social_following_code_table", linkedHashMap7, yy.b(linkedHashMap7, "share_code_detail", new o3f0.a(0, 1, "share_code_detail", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA7 = o3f0.b.a(vp60Var, "social_following_code_table");
        if (!o3f0Var7.equals(o3f0VarA7)) {
            return new tv50.a(false, dvj0.a("social_following_code_table(com.sportybet.android.social.data.local.SocFollowingCodeEntity).\n Expected:\n", o3f0Var7, "\n Found:\n", o3f0VarA7));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("account", new o3f0.a(1, 1, "account", "TEXT", null, true));
        o3f0 o3f0Var8 = new o3f0("social_following_code_cursor_table", linkedHashMap8, yy.b(linkedHashMap8, "pageNo", new o3f0.a(0, 1, "pageNo", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA8 = o3f0.b.a(vp60Var, "social_following_code_cursor_table");
        return !o3f0Var8.equals(o3f0VarA8) ? new tv50.a(false, dvj0.a("social_following_code_cursor_table(com.sportybet.android.social.data.local.SocFollowingCodeCursorEntity).\n Expected:\n", o3f0Var8, "\n Found:\n", o3f0VarA8)) : new tv50.a(true, null);
    }
}
