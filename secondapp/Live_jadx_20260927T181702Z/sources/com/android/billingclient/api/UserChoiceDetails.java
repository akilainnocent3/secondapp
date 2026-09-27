package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@zzk
public final class UserChoiceDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f25620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Product> f25621c;

    public UserChoiceDetails(String str) throws JSONException {
        this.f25619a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f25620b = jSONObject;
        this.f25621c = a(jSONObject.optJSONArray("products"));
    }

    public static List<Product> a(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f25620b.optString("externalTransactionToken");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String strOptString = this.f25620b.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.f25621c;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @zzk
    public static class Product {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f25624c;

        public Product(String str, String str2, @Nullable String str3) {
            this.f25622a = str;
            this.f25623b = str2;
            this.f25624c = str3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f25622a.equals(product.getId()) && this.f25623b.equals(product.getType()) && Objects.equals(this.f25624c, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.f25622a;
        }

        @Nullable
        public String getOfferToken() {
            return this.f25624c;
        }

        @NonNull
        public String getType() {
            return this.f25623b;
        }

        public int hashCode() {
            return Objects.hash(this.f25622a, this.f25623b, this.f25624c);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f25622a, this.f25623b, this.f25624c);
        }

        public Product(JSONObject jSONObject) {
            this.f25622a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.f25623b = jSONObject.optString(C4235d4.i.f61426m);
            String strOptString = jSONObject.optString("offerToken");
            this.f25624c = true == strOptString.isEmpty() ? null : strOptString;
        }
    }
}
