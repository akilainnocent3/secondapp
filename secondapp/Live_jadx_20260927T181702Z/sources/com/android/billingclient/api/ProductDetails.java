package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class ProductDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f25548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f25555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List f25556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List f25557k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @zzi
    public static final class InstallmentPlanDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25559b;

        public InstallmentPlanDetails(JSONObject jSONObject) throws JSONException {
            this.f25558a = jSONObject.getInt("commitmentPaymentsCount");
            this.f25559b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzi
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.f25558a;
        }

        @zzi
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.f25559b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class OneTimePurchaseOfferDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f25562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f25563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f25564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final zzcs f25565f;

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f25560a = jSONObject.optString("formattedPrice");
            this.f25561b = jSONObject.optLong("priceAmountMicros");
            this.f25562c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f25563d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            com.google.android.gms.internal.play_billing.zzco.zzk(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f25564e = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f25565f = jSONObjectOptJSONObject6 != null ? new zzcs(jSONObjectOptJSONObject6) : null;
        }

        @Nullable
        public final String a() {
            return this.f25564e;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f25560a;
        }

        public long getPriceAmountMicros() {
            return this.f25561b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f25562c;
        }

        @Nullable
        public final zzcs zza() {
            return this.f25565f;
        }

        @Nullable
        public final String zzb() {
            return this.f25563d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class PricingPhase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f25568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f25569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f25570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f25571f;

        public PricingPhase(JSONObject jSONObject) {
            this.f25569d = jSONObject.optString("billingPeriod");
            this.f25568c = jSONObject.optString("priceCurrencyCode");
            this.f25566a = jSONObject.optString("formattedPrice");
            this.f25567b = jSONObject.optLong("priceAmountMicros");
            this.f25571f = jSONObject.optInt("recurrenceMode");
            this.f25570e = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.f25570e;
        }

        @NonNull
        public String getBillingPeriod() {
            return this.f25569d;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f25566a;
        }

        public long getPriceAmountMicros() {
            return this.f25567b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f25568c;
        }

        public int getRecurrenceMode() {
            return this.f25571f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class PricingPhases {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f25572a;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f25572a = arrayList;
        }

        @NonNull
        public List<PricingPhase> getPricingPhaseList() {
            return this.f25572a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SubscriptionOfferDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f25574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f25575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PricingPhases f25576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f25577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final InstallmentPlanDetails f25578f;

        public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f25573a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f25574b = true == strOptString.isEmpty() ? null : strOptString;
            this.f25575c = jSONObject.getString("offerIdToken");
            this.f25576d = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f25578f = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f25577e = arrayList;
        }

        @NonNull
        public String getBasePlanId() {
            return this.f25573a;
        }

        @Nullable
        @zzi
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f25578f;
        }

        @Nullable
        public String getOfferId() {
            return this.f25574b;
        }

        @NonNull
        public List<String> getOfferTags() {
            return this.f25577e;
        }

        @NonNull
        public String getOfferToken() {
            return this.f25575c;
        }

        @NonNull
        public PricingPhases getPricingPhases() {
            return this.f25576d;
        }
    }

    public ProductDetails(String str) throws JSONException {
        this.f25547a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f25548b = jSONObject;
        String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f25549c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f25550d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f25551e = jSONObject.optString("title");
        this.f25552f = jSONObject.optString("name");
        this.f25553g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f25554h = jSONObject.optString("skuDetailsToken");
        this.f25555i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f25556j = arrayList;
        } else {
            this.f25556j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f25548b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f25548b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f25557k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f25557k = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.f25557k = arrayList2;
        }
    }

    public final String a() {
        return this.f25554h;
    }

    @Nullable
    public final List b() {
        return this.f25557k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f25547a, ((ProductDetails) obj).f25547a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f25553g;
    }

    @NonNull
    public String getName() {
        return this.f25552f;
    }

    @Nullable
    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.f25557k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) this.f25557k.get(0);
    }

    @NonNull
    public String getProductId() {
        return this.f25549c;
    }

    @NonNull
    public String getProductType() {
        return this.f25550d;
    }

    @Nullable
    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.f25556j;
    }

    @NonNull
    public String getTitle() {
        return this.f25551e;
    }

    public int hashCode() {
        return this.f25547a.hashCode();
    }

    @NonNull
    public String toString() {
        List list = this.f25556j;
        return "ProductDetails{jsonString='" + this.f25547a + "', parsedJson=" + this.f25548b.toString() + ", productId='" + this.f25549c + "', productType='" + this.f25550d + "', title='" + this.f25551e + "', productDetailsToken='" + this.f25554h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }

    @NonNull
    public final String zza() {
        return this.f25548b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @Nullable
    public String zzc() {
        return this.f25555i;
    }
}
