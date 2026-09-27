package com.bytedance.adsdk.ugeno.vy;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny {
    public static hu.hww hww(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        hu.hww hwwVar = new hu.hww();
        String strHww = com.bytedance.adsdk.ugeno.sd.tq.hww(str, jSONObject);
        if (strHww.contains("#")) {
            strHww = strHww.replace("#", "%23");
        }
        Uri uri = Uri.parse(strHww);
        if (uri == null) {
            return null;
        }
        hwwVar.sd(strHww);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            hwwVar.hww(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        hwwVar.tq(authority);
        hwwVar.vy(hwwVar.hww() + "://" + hwwVar.tq());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.sd.tq.hww(uri.getQueryParameter(str2), jSONObject));
            }
        }
        hwwVar.hww(map);
        return hwwVar;
    }
}
