package com.tiktok.appevents;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f76077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f76078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f76080d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public h0(JSONObject purchase, JSONObject skuDetails) throws a {
        if (!e(purchase)) {
            throw new a("Not a valid purchase object");
        }
        if (!f(skuDetails)) {
            throw new a("Not a valid skuDetails Object");
        }
        if (!purchase.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID).equals(skuDetails.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new a("Product Id does not match");
        }
        this.f76077a = purchase;
        this.f76078b = skuDetails;
    }

    public String a() {
        return this.f76079c;
    }

    public JSONObject b() {
        return this.f76077a;
    }

    public JSONObject c() {
        return this.f76078b;
    }

    public boolean d() {
        return this.f76080d;
    }

    public final boolean e(JSONObject purchase) {
        return (purchase.isNull("orderId") || purchase.isNull(InAppPurchaseMetaData.KEY_PRODUCT_ID)) ? false : true;
    }

    public final boolean f(JSONObject skuDetails) {
        return (skuDetails.isNull("price") || skuDetails.isNull(InAppPurchaseMetaData.KEY_PRODUCT_ID)) ? false : true;
    }

    public void g(boolean autoTrack) {
        this.f76080d = autoTrack;
    }

    public h0(JSONObject purchase, JSONObject skuDetails, String eventId) throws a {
        this(purchase, skuDetails);
        this.f76079c = eventId;
    }
}
