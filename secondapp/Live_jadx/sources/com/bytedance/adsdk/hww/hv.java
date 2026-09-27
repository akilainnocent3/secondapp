package com.bytedance.adsdk.hww;

import android.text.TextUtils;
import fw.b;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv implements rs {
    @Override // com.bytedance.adsdk.hww.rs
    public Object hww(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, b.f85379f)) {
                    return strValueOf;
                }
            }
        }
        return null;
    }
}
