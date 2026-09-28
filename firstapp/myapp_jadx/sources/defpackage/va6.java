package defpackage;

import com.sporty.android.core.antest.room.CampaignVariantDB_Impl;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class va6 extends tv50 {
    public final /* synthetic */ CampaignVariantDB_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va6(CampaignVariantDB_Impl campaignVariantDB_Impl) {
        super(2, "58941ce1df8461861c02dc508a2105da", "db61520a4721bdf3067af722d2130c2d");
        this.d = campaignVariantDB_Impl;
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `an_test_campaign_table`", vp60Var, "DROP TABLE IF EXISTS `an_test_campaign_variant`");
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
        linkedHashMap.put("campaign_id", new o3f0.a(2, 1, "campaign_id", "INTEGER", null, true));
        linkedHashMap.put("campaign_status", new o3f0.a(0, 1, "campaign_status", "TEXT", null, true));
        linkedHashMap.put("variant_id", new o3f0.a(0, 1, "variant_id", "INTEGER", null, true));
        linkedHashMap.put("variant_value", new o3f0.a(0, 1, "variant_value", "TEXT", null, false));
        o3f0 o3f0Var = new o3f0("an_test_campaign_table", linkedHashMap, yy.b(linkedHashMap, "current_round", new o3f0.a(0, 1, "current_round", "INTEGER", null, false)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "an_test_campaign_table");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("an_test_campaign_table(com.sporty.android.core.antest.room.entity.CampaignEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("campaign_code", new o3f0.a(1, 1, "campaign_code", "TEXT", null, true));
        linkedHashMap2.put("campaign_id", new o3f0.a(2, 1, "campaign_id", "INTEGER", null, true));
        linkedHashMap2.put("variant_id", new o3f0.a(0, 1, "variant_id", "INTEGER", null, true));
        linkedHashMap2.put("variant_value", new o3f0.a(0, 1, "variant_value", "TEXT", null, true));
        linkedHashMap2.put("variant_name", new o3f0.a(0, 1, "variant_name", "TEXT", null, true));
        linkedHashMap2.put("can_convert", new o3f0.a(0, 1, "can_convert", "INTEGER", null, true));
        o3f0 o3f0Var2 = new o3f0("an_test_campaign_variant", linkedHashMap2, yy.b(linkedHashMap2, "expire_time", new o3f0.a(0, 1, "expire_time", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "an_test_campaign_variant");
        return !o3f0Var2.equals(o3f0VarA2) ? new tv50.a(false, dvj0.a("an_test_campaign_variant(com.sporty.android.core.antest.room.entity.CampaignVariantEntity).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2)) : new tv50.a(true, null);
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `an_test_campaign_table` (`campaign_code` TEXT NOT NULL, `campaign_id` INTEGER NOT NULL, `campaign_status` TEXT NOT NULL, `variant_id` INTEGER NOT NULL, `variant_value` TEXT, `current_round` INTEGER, PRIMARY KEY(`campaign_code`, `campaign_id`))", vp60Var, "CREATE TABLE IF NOT EXISTS `an_test_campaign_variant` (`campaign_code` TEXT NOT NULL, `campaign_id` INTEGER NOT NULL, `variant_id` INTEGER NOT NULL, `variant_value` TEXT NOT NULL, `variant_name` TEXT NOT NULL, `can_convert` INTEGER NOT NULL, `expire_time` INTEGER NOT NULL, PRIMARY KEY(`campaign_code`, `campaign_id`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, tYcQsJyaojE.CtMRvDS);
    }
}
