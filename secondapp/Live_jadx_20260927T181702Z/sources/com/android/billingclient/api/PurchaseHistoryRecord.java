package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f25602c;

    public PurchaseHistoryRecord(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f25600a = str;
        this.f25601b = str2;
        this.f25602c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f25602c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f25602c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f25602c.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(this.f25602c.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f25600a, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.f25601b, purchaseHistoryRecord.getSignature());
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f25602c.optString("developerPayload");
    }

    @NonNull
    public String getOriginalJson() {
        return this.f25600a;
    }

    @NonNull
    public List<String> getProducts() {
        return a();
    }

    public long getPurchaseTime() {
        return this.f25602c.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f25602c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f25602c.optInt(FirebaseAnalytics.d.C, 1);
    }

    @NonNull
    public String getSignature() {
        return this.f25601b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f25600a.hashCode();
    }

    @NonNull
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f25600a));
    }
}
