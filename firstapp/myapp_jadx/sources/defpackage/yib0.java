package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.core.database.SportyBetPersistentDB_Impl;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class yib0 extends tv50 {
    public final /* synthetic */ SportyBetPersistentDB_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yib0(SportyBetPersistentDB_Impl sportyBetPersistentDB_Impl) {
        super(1, "bd8040c9043b95acc786ba555770a8a8", "e91d344de755fe1a7c2bf8de43c967a3");
        this.d = sportyBetPersistentDB_Impl;
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        vp60Var.getClass();
        up60.a(vp60Var, "DROP TABLE IF EXISTS `CMSResponseEntity`");
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
        linkedHashMap.put("key", new o3f0.a(1, 1, "key", "TEXT", null, true));
        linkedHashMap.put(AnalyticsParam.MINI_GAMES_PAGE, new o3f0.a(2, 1, AnalyticsParam.MINI_GAMES_PAGE, "TEXT", null, true));
        linkedHashMap.put("countryCode", new o3f0.a(3, 1, "countryCode", "TEXT", null, true));
        linkedHashMap.put("locale", new o3f0.a(4, 1, "locale", "TEXT", null, true));
        linkedHashMap.put("value", new o3f0.a(0, 1, "value", "TEXT", null, false));
        o3f0 o3f0Var = new o3f0("CMSResponseEntity", linkedHashMap, yy.b(linkedHashMap, "type", new o3f0.a(0, 1, "type", "TEXT", null, false)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "CMSResponseEntity");
        return !o3f0Var.equals(o3f0VarA) ? new tv50.a(false, dvj0.a("CMSResponseEntity(com.sportybet.core.database.entity.CMSResponseEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA)) : new tv50.a(true, null);
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, dLRYz.hDYX, vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bd8040c9043b95acc786ba555770a8a8')");
    }
}
