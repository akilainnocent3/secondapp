package com.bytedance.adsdk.hww;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class weu implements rs {
    @Override // com.bytedance.adsdk.hww.rs
    public Object hww(JSONObject jSONObject, Object[] objArr) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[2]);
        String strValueOf2 = String.valueOf(objArr[1]);
        String strValueOf3 = String.valueOf(objArr[0]);
        if (!TextUtils.isEmpty(strValueOf3) && jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("i18n")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strValueOf2)) != null) {
            String strOptString = jSONObjectOptJSONObject2.optString(strValueOf3);
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
        }
        return strValueOf;
    }
}
