package defpackage;

import com.sporty.android.platform.features.cms.db.RealtimeCMSDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class gb40 extends tv50 {
    public final /* synthetic */ RealtimeCMSDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb40(RealtimeCMSDatabase_Impl realtimeCMSDatabase_Impl) {
        super(1, "2203ccf2a9974aa55184082f9249dbab", "688be83d6cb86df54cdc0f56b61e53d0");
        this.d = realtimeCMSDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `realtime_cms` (`apiPageName` TEXT NOT NULL, `stringKey` TEXT NOT NULL, `language` TEXT NOT NULL, `value` TEXT NOT NULL, `version` INTEGER NOT NULL, `isPageUpdating` INTEGER NOT NULL, PRIMARY KEY(`apiPageName`, `stringKey`, `language`))", vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2203ccf2a9974aa55184082f9249dbab')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        vp60Var.getClass();
        up60.a(vp60Var, "DROP TABLE IF EXISTS `realtime_cms`");
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
        linkedHashMap.put("apiPageName", new o3f0.a(1, 1, "apiPageName", "TEXT", null, true));
        linkedHashMap.put("stringKey", new o3f0.a(2, 1, "stringKey", "TEXT", null, true));
        linkedHashMap.put("language", new o3f0.a(3, 1, "language", "TEXT", null, true));
        linkedHashMap.put("value", new o3f0.a(0, 1, "value", "TEXT", null, true));
        linkedHashMap.put("version", new o3f0.a(0, 1, "version", "INTEGER", null, true));
        o3f0 o3f0Var = new o3f0("realtime_cms", linkedHashMap, yy.b(linkedHashMap, "isPageUpdating", new o3f0.a(0, 1, "isPageUpdating", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "realtime_cms");
        return !o3f0Var.equals(o3f0VarA) ? new tv50.a(false, dvj0.a("realtime_cms(com.sporty.android.platform.features.cms.db.RealtimeCMSEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA)) : new tv50.a(true, null);
    }
}
