package com.tiktok.appevents;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76075a = "com.tiktok.appevents.f0";

    public static JSONObject a(String sku, JSONObject skuDetails) throws JSONException {
        double dDoubleValue;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectPut = new JSONObject().put("content_id", sku);
        if (skuDetails != null) {
            jSONObjectPut.put("content_type", c(skuDetails, "type"));
            jSONObject.put("currency", c(skuDetails, "price_currency_code"));
            jSONObjectPut.put(FirebaseAnalytics.d.C, 1);
            try {
                dDoubleValue = new BigDecimal(skuDetails.optLong("price_amount_micros", 0L) / 1000000.0d).doubleValue();
            } catch (Exception unused) {
                dDoubleValue = 0.0d;
            }
            jSONObjectPut.put("price", dDoubleValue);
            jSONObject.put("value", dDoubleValue);
        }
        jSONObject.put(fp.f.c.f85054f, new JSONArray().put(jSONObjectPut));
        return jSONObject;
    }

    public static JSONObject b(h0 purchaseInfo) {
        try {
            JSONObject jSONObjectA = a(purchaseInfo.b().getString(InAppPurchaseMetaData.KEY_PRODUCT_ID), purchaseInfo.c());
            if (purchaseInfo.d() && jSONObjectA != null) {
                jSONObjectA.putOpt("type", "auto");
                jSONObjectA.putOpt(fp.f.c.f85055g, purchaseInfo.b().optString("orderId"));
            }
            return jSONObjectA;
        } catch (JSONException e10) {
            c0.b(f76075a, e10, 2);
            return null;
        }
    }

    public static String c(JSONObject jsonObject, String key) {
        try {
            return jsonObject.get(key).toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
