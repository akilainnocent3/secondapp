package defpackage;

import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.notificationcenter.db.NCDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class g3x extends tv50 {
    public final /* synthetic */ NCDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3x(NCDatabase_Impl nCDatabase_Impl) {
        super(1, "fd772abbd06c01e4b6a38e5f6a6a328b", "69e07f91806eccffc2d10b2780f2ee0b");
        this.d = nCDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `notification_center` (`id` INTEGER NOT NULL, `cursor` TEXT NOT NULL, `category` INTEGER NOT NULL, `sendTime` TEXT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `bannerImageUrl` TEXT NOT NULL, `buttonText` TEXT NOT NULL, `buttonLink` TEXT NOT NULL, PRIMARY KEY(`id`, `category`))", vp60Var, "CREATE TABLE IF NOT EXISTS `notification_cursor` (`category` INTEGER NOT NULL, `forwardCursor` TEXT NOT NULL, `backwardCursor` TEXT NOT NULL, PRIMARY KEY(`category`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fd772abbd06c01e4b6a38e5f6a6a328b')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `notification_center`", vp60Var, "DROP TABLE IF EXISTS `notification_cursor`");
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
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_ID, new o3f0.a(1, 1, AnalyticsParam.EVENT_PARAM_ID, "INTEGER", null, true));
        linkedHashMap.put("cursor", new o3f0.a(0, 1, "cursor", "TEXT", null, true));
        linkedHashMap.put(Category.CATEGORY_ID, new o3f0.a(2, 1, Category.CATEGORY_ID, "INTEGER", null, true));
        linkedHashMap.put("sendTime", new o3f0.a(0, 1, "sendTime", "TEXT", null, true));
        linkedHashMap.put("title", new o3f0.a(0, 1, "title", "TEXT", null, true));
        linkedHashMap.put("content", new o3f0.a(0, 1, "content", "TEXT", null, true));
        linkedHashMap.put("bannerImageUrl", new o3f0.a(0, 1, "bannerImageUrl", "TEXT", null, true));
        linkedHashMap.put("buttonText", new o3f0.a(0, 1, "buttonText", "TEXT", null, true));
        o3f0 o3f0Var = new o3f0("notification_center", linkedHashMap, yy.b(linkedHashMap, "buttonLink", new o3f0.a(0, 1, "buttonLink", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "notification_center");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("notification_center(com.sportybet.feature.notificationcenter.db.NCEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Category.CATEGORY_ID, new o3f0.a(1, 1, Category.CATEGORY_ID, "INTEGER", null, true));
        linkedHashMap2.put("forwardCursor", new o3f0.a(0, 1, "forwardCursor", "TEXT", null, true));
        o3f0 o3f0Var2 = new o3f0("notification_cursor", linkedHashMap2, yy.b(linkedHashMap2, "backwardCursor", new o3f0.a(0, 1, "backwardCursor", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "notification_cursor");
        return !o3f0Var2.equals(o3f0VarA2) ? new tv50.a(false, dvj0.a("notification_cursor(com.sportybet.feature.notificationcenter.db.NCCursorEntity).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2)) : new tv50.a(true, null);
    }
}
