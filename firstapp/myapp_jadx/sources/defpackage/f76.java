package defpackage;

import com.sporty.android.core.model.antest.CampaignVariantVO;

/* JADX INFO: loaded from: classes4.dex */
public final class f76 {
    public final wa6 a;

    public f76(wa6 wa6Var) {
        wa6Var.getClass();
        this.a = wa6Var;
    }

    public final Object a(CampaignVariantVO campaignVariantVO, String str, x1b x1bVar) {
        campaignVariantVO.getClass();
        str.getClass();
        int campaignId = campaignVariantVO.getCampaignId();
        int variantId = campaignVariantVO.getVariantId();
        String variantValue = campaignVariantVO.getVariantValue();
        String variantName = campaignVariantVO.getVariantName();
        boolean canConvert = campaignVariantVO.getCanConvert();
        Long expiryTime = campaignVariantVO.getExpiryTime();
        return this.a.a(new bb6(str, campaignId, variantId, variantValue, variantName, canConvert, expiryTime != null ? expiryTime.longValue() : 0L), x1bVar);
    }
}
