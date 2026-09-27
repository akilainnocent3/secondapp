package com.bytedance.adsdk.hww.tq.tq.hww;

import android.text.TextUtils;
import com.ironsource.C4235d4;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class kv implements com.bytedance.adsdk.hww.tq.tq.hww {
    private final String hww;

    public kv(String str) {
        this.hww = str;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        Object objHww;
        if (map == null || map.size() <= 0 || (objHww = hww(this.hww, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objHww;
    }

    public String toString() {
        return "VariableNode [literals=" + this.hww + C4235d4.j.f61462e;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public String tq() {
        return this.hww;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public com.bytedance.adsdk.hww.tq.vy.hv hww() {
        return com.bytedance.adsdk.hww.tq.vy.hu.VARIABLE;
    }

    public Object hww(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return hww(str.split("\\."), 0, jSONObject);
    }

    private Object hww(String[] strArr, int i10, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf(C4235d4.j.f61460d);
            int iIndexOf2 = str.indexOf(C4235d4.j.f61462e);
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i10 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return hww(strArr, i10 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return hww(strArr, i10 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
