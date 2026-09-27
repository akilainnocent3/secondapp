package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f25598c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @zzj
    public static final class PendingPurchaseUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JSONObject f25599a;

        public PendingPurchaseUpdate(JSONObject jSONObject) {
            this.f25599a = jSONObject;
        }

        @NonNull
        public List<String> getProducts() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.f25599a.has("productIds") && (jSONArrayOptJSONArray = this.f25599a.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.f25599a.optString("purchaseToken");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f25596a = str;
        this.f25597b = str2;
        this.f25598c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f25598c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f25598c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f25598c.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(this.f25598c.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f25596a, purchase.getOriginalJson()) && TextUtils.equals(this.f25597b, purchase.getSignature());
    }

    @Nullable
    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.f25598c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f25598c.optString("developerPayload");
    }

    @Nullable
    public String getOrderId() {
        String strOptString = this.f25598c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public String getOriginalJson() {
        return this.f25596a;
    }

    @NonNull
    public String getPackageName() {
        return this.f25598c.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @Nullable
    @zzj
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject jSONObjectOptJSONObject = this.f25598c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    @NonNull
    public List<String> getProducts() {
        return a();
    }

    public int getPurchaseState() {
        return this.f25598c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.f25598c.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f25598c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f25598c.optInt(FirebaseAnalytics.d.C, 1);
    }

    @NonNull
    public String getSignature() {
        return this.f25597b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f25596a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.f25598c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.f25598c.optBoolean("autoRenewing");
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f25596a));
    }
}
