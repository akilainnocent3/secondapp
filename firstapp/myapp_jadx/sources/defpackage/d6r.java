package defpackage;

import com.sportybet.feature.luckynumber.search.data.LNRecentSearchDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class d6r extends tv50 {
    public final /* synthetic */ LNRecentSearchDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6r(LNRecentSearchDatabase_Impl lNRecentSearchDatabase_Impl) {
        super(1, "88001b676c7cf3cf04d8c2fbf4a8eb6f", "4d1f7e6407d2339cec820217cec89544");
        this.d = lNRecentSearchDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `recent_search` (`name` TEXT NOT NULL, `modifyTime` INTEGER NOT NULL, PRIMARY KEY(`name`))", vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '88001b676c7cf3cf04d8c2fbf4a8eb6f')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        vp60Var.getClass();
        up60.a(vp60Var, "DROP TABLE IF EXISTS `recent_search`");
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
        linkedHashMap.put("name", new o3f0.a(1, 1, "name", "TEXT", null, true));
        o3f0 o3f0Var = new o3f0("recent_search", linkedHashMap, yy.b(linkedHashMap, "modifyTime", new o3f0.a(0, 1, "modifyTime", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "recent_search");
        return !o3f0Var.equals(o3f0VarA) ? new tv50.a(false, dvj0.a("recent_search(com.sportybet.feature.luckynumber.search.data.LNRecentSearchEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA)) : new tv50.a(true, null);
    }
}
