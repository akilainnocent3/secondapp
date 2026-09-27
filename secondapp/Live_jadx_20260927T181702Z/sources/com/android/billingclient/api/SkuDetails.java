package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f25614b;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.f25613a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f25614b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.f25614b.optString("skuDetailsToken");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f25613a, ((SkuDetails) obj).f25613a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f25614b.optString("description");
    }

    @NonNull
    public String getFreeTrialPeriod() {
        return this.f25614b.optString("freeTrialPeriod");
    }

    @NonNull
    public String getIconUrl() {
        return this.f25614b.optString("iconUrl");
    }

    @NonNull
    public String getIntroductoryPrice() {
        return this.f25614b.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.f25614b.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.f25614b.optInt("introductoryPriceCycles");
    }

    @NonNull
    public String getIntroductoryPricePeriod() {
        return this.f25614b.optString("introductoryPricePeriod");
    }

    @NonNull
    public String getOriginalJson() {
        return this.f25613a;
    }

    @NonNull
    public String getOriginalPrice() {
        return this.f25614b.has("original_price") ? this.f25614b.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        return this.f25614b.has("original_price_micros") ? this.f25614b.optLong("original_price_micros") : getPriceAmountMicros();
    }

    @NonNull
    public String getPrice() {
        return this.f25614b.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.f25614b.optLong("price_amount_micros");
    }

    @NonNull
    public String getPriceCurrencyCode() {
        return this.f25614b.optString("price_currency_code");
    }

    @NonNull
    public String getSku() {
        return this.f25614b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    @NonNull
    public String getSubscriptionPeriod() {
        return this.f25614b.optString("subscriptionPeriod");
    }

    @NonNull
    public String getTitle() {
        return this.f25614b.optString("title");
    }

    @NonNull
    public String getType() {
        return this.f25614b.optString("type");
    }

    public int hashCode() {
        return this.f25613a.hashCode();
    }

    @NonNull
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f25613a));
    }

    public int zza() {
        return this.f25614b.optInt(CampaignEx.JSON_KEY_OFFER_TYPE);
    }

    @NonNull
    public String zzb() {
        return this.f25614b.optString("offer_id");
    }

    @NonNull
    public String zzc() {
        String strOptString = this.f25614b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f25614b.optString("offer_id_token") : strOptString;
    }

    @NonNull
    public final String zzd() {
        return this.f25614b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @NonNull
    public String zze() {
        return this.f25614b.optString("serializedDocid");
    }
}
