package com.bytedance.adsdk.hww;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vhb implements rs {
    @Override // com.bytedance.adsdk.hww.rs
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public Integer hww(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr != null && objArr.length != 0 && (obj = objArr[0]) != null) {
            if (obj instanceof String) {
                return Integer.valueOf(((String) obj).length());
            }
            if (obj instanceof Set) {
                return Integer.valueOf(((Set) obj).size());
            }
            if (obj instanceof List) {
                return Integer.valueOf(((List) obj).size());
            }
            if (obj instanceof Map) {
                return Integer.valueOf(((Map) obj).size());
            }
            if (obj.getClass().isArray()) {
                return Integer.valueOf(Array.getLength(obj));
            }
            if (obj instanceof Number) {
                return Integer.valueOf(obj.toString().length());
            }
            if (obj instanceof JSONObject) {
                return Integer.valueOf(((JSONObject) obj).length());
            }
            if (obj instanceof JSONArray) {
                return Integer.valueOf(((JSONArray) obj).length());
            }
        }
        return 0;
    }
}
