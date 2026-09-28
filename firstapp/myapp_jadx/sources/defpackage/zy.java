package defpackage;

import com.sporty.android.core.antest.room.AnTestOverrideDB_Impl;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zy extends tv50 {
    public final /* synthetic */ AnTestOverrideDB_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(AnTestOverrideDB_Impl anTestOverrideDB_Impl) {
        super(1, "8e08a27148684af6ee830229f4eb964f", "6a9ebf178c6771f671bd5dc1db70c255");
        this.d = anTestOverrideDB_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `an_test_variant_override` (`campaign_code` TEXT NOT NULL, `variant_value` TEXT NOT NULL, PRIMARY KEY(`campaign_code`))", vp60Var, "CREATE TABLE IF NOT EXISTS `an_test_override_setting` (`id` INTEGER NOT NULL, `enabled` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8e08a27148684af6ee830229f4eb964f')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `an_test_variant_override`", vp60Var, "DROP TABLE IF EXISTS `an_test_override_setting`");
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
        linkedHashMap.put("campaign_code", new o3f0.a(1, 1, "campaign_code", "TEXT", null, true));
        o3f0 o3f0Var = new o3f0("an_test_variant_override", linkedHashMap, yy.b(linkedHashMap, "variant_value", new o3f0.a(0, 1, "variant_value", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "an_test_variant_override");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("an_test_variant_override(com.sporty.android.core.antest.room.entity.VariantOverrideEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(AnalyticsParam.EVENT_PARAM_ID, new o3f0.a(1, 1, AnalyticsParam.EVENT_PARAM_ID, "INTEGER", null, true));
        o3f0 o3f0Var2 = new o3f0("an_test_override_setting", linkedHashMap2, yy.b(linkedHashMap2, "enabled", new o3f0.a(0, 1, "enabled", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "an_test_override_setting");
        return !o3f0Var2.equals(o3f0VarA2) ? new tv50.a(false, dvj0.a("an_test_override_setting(com.sporty.android.core.antest.room.entity.OverrideSettingEntity).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2)) : new tv50.a(true, null);
    }
}
