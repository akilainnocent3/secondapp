package com.bytedance.adsdk.hww;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hu implements rs {
    @Override // com.bytedance.adsdk.hww.rs
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public String hww(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objHww = com.bytedance.adsdk.hww.tq.hww.hww(strValueOf2).hww(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objHww))) {
                return String.valueOf(objHww);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
