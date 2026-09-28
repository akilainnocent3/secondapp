package defpackage;

import android.content.Context;
import com.sporty.android.core.antest.room.CampaignVariantDB;

/* JADX INFO: loaded from: classes5.dex */
public final class ry implements l730 {
    public static CampaignVariantDB a(Context context) {
        lv50.a aVarA = dv50.a(context, CampaignVariantDB.class, "an_test_campaign.db");
        aVarA.c();
        return (CampaignVariantDB) aVarA.b();
    }
}
