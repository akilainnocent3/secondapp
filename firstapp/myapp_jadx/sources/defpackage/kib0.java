package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.roomcache.SportyBetCacheDB_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class kib0 extends tv50 {
    public final /* synthetic */ SportyBetCacheDB_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kib0(SportyBetCacheDB_Impl sportyBetCacheDB_Impl) {
        super(5, "c56df9b745d2b4d1c2fd9f76adf4a5d5", "8419f5867e4e85d095b8fcb5b14b599c");
        this.d = sportyBetCacheDB_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `CacheEvent` (`eventId` TEXT NOT NULL, `productType` INTEGER NOT NULL, `language` TEXT NOT NULL, `event` TEXT NOT NULL, PRIMARY KEY(`eventId`, `productType`, `language`))", vp60Var, "CREATE TABLE IF NOT EXISTS `CacheMarketGroup` (`eventId` TEXT NOT NULL, `productType` INTEGER NOT NULL, `language` TEXT NOT NULL, `marketGroups` TEXT NOT NULL, PRIMARY KEY(`eventId`, `productType`, `language`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `CacheFavoriteMarketIds` (`sportId` TEXT NOT NULL, `productType` INTEGER NOT NULL, `favoriteMarketIds` TEXT NOT NULL, PRIMARY KEY(`sportId`, `productType`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `CacheBetBuilderMarkets` (`sportId` TEXT NOT NULL, `availableMarkets` TEXT NOT NULL, PRIMARY KEY(`sportId`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS `sporty_bet_table` (`end_point` TEXT NOT NULL, `extra_identifier` TEXT NOT NULL, `by_user` INTEGER NOT NULL, `response_json_string` TEXT NOT NULL, PRIMARY KEY(`end_point`, `extra_identifier`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c56df9b745d2b4d1c2fd9f76adf4a5d5')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `CacheEvent`", vp60Var, "DROP TABLE IF EXISTS `CacheMarketGroup`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `CacheFavoriteMarketIds`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `CacheBetBuilderMarkets`");
        up60.a(vp60Var, "DROP TABLE IF EXISTS `sporty_bet_table`");
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
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, new o3f0.a(1, 1, AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "TEXT", null, true));
        linkedHashMap.put("productType", new o3f0.a(2, 1, "productType", "INTEGER", null, true));
        linkedHashMap.put("language", new o3f0.a(3, 1, "language", "TEXT", null, true));
        o3f0 o3f0Var = new o3f0("CacheEvent", linkedHashMap, yy.b(linkedHashMap, AnalyticsEvent.BI_TRACKING_KIND_EVENT, new o3f0.a(0, 1, AnalyticsEvent.BI_TRACKING_KIND_EVENT, "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "CacheEvent");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("CacheEvent(com.sportybet.roomcache.entity.event.CacheEvent).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, new o3f0.a(1, 1, AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "TEXT", null, true));
        linkedHashMap2.put("productType", new o3f0.a(2, 1, "productType", "INTEGER", null, true));
        linkedHashMap2.put("language", new o3f0.a(3, 1, "language", "TEXT", null, true));
        o3f0 o3f0Var2 = new o3f0("CacheMarketGroup", linkedHashMap2, yy.b(linkedHashMap2, "marketGroups", new o3f0.a(0, 1, "marketGroups", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "CacheMarketGroup");
        if (!o3f0Var2.equals(o3f0VarA2)) {
            return new tv50.a(false, dvj0.a("CacheMarketGroup(com.sportybet.roomcache.entity.event.CacheMarketGroup).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("sportId", new o3f0.a(1, 1, "sportId", "TEXT", null, true));
        linkedHashMap3.put("productType", new o3f0.a(2, 1, "productType", "INTEGER", null, true));
        o3f0 o3f0Var3 = new o3f0("CacheFavoriteMarketIds", linkedHashMap3, yy.b(linkedHashMap3, "favoriteMarketIds", new o3f0.a(0, 1, "favoriteMarketIds", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA3 = o3f0.b.a(vp60Var, "CacheFavoriteMarketIds");
        if (!o3f0Var3.equals(o3f0VarA3)) {
            return new tv50.a(false, dvj0.a("CacheFavoriteMarketIds(com.sportybet.roomcache.entity.event.CacheFavoriteMarketIds).\n Expected:\n", o3f0Var3, "\n Found:\n", o3f0VarA3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("sportId", new o3f0.a(1, 1, "sportId", "TEXT", null, true));
        o3f0 o3f0Var4 = new o3f0("CacheBetBuilderMarkets", linkedHashMap4, yy.b(linkedHashMap4, "availableMarkets", new o3f0.a(0, 1, "availableMarkets", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA4 = o3f0.b.a(vp60Var, "CacheBetBuilderMarkets");
        if (!o3f0Var4.equals(o3f0VarA4)) {
            return new tv50.a(false, dvj0.a("CacheBetBuilderMarkets(com.sportybet.roomcache.entity.event.CacheBetBuilderMarkets).\n Expected:\n", o3f0Var4, "\n Found:\n", o3f0VarA4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("end_point", new o3f0.a(1, 1, "end_point", "TEXT", null, true));
        linkedHashMap5.put("extra_identifier", new o3f0.a(2, 1, "extra_identifier", "TEXT", null, true));
        linkedHashMap5.put("by_user", new o3f0.a(0, 1, "by_user", "INTEGER", null, true));
        o3f0 o3f0Var5 = new o3f0("sporty_bet_table", linkedHashMap5, yy.b(linkedHashMap5, "response_json_string", new o3f0.a(0, 1, "response_json_string", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA5 = o3f0.b.a(vp60Var, "sporty_bet_table");
        return !o3f0Var5.equals(o3f0VarA5) ? new tv50.a(false, dvj0.a("sporty_bet_table(com.sportybet.core.database.entity.SportyBetAPIEntity).\n Expected:\n", o3f0Var5, "\n Found:\n", o3f0VarA5)) : new tv50.a(true, null);
    }
}
