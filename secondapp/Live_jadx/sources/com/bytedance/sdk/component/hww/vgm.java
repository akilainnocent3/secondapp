package com.bytedance.sdk.component.hww;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class vgm {
    private nod hww;

    private vgm(nod nodVar) {
        this.hww = nodVar;
    }

    public static vgm hww(nod nodVar) {
        return new vgm(nodVar);
    }

    public <T> T hww(String str, Type type) throws JSONException {
        hww(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.hww.hww(str, type);
    }

    public <T> String hww(T t10) {
        String string;
        if (t10 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.hww.hww(t10);
        } else {
            string = t10.toString();
        }
        hww(string);
        return string;
    }

    private static void hww(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        ok.hww(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
