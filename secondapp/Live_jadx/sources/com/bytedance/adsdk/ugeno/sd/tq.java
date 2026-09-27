package com.bytedance.adsdk.ugeno.sd;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.hv;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static String hww(String str, JSONObject jSONObject) {
        hww hwwVarSd;
        hww.InterfaceC0305hww interfaceC0305hwwHww;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (hwwVarSd = hv.hww().sd()) != null && (interfaceC0305hwwHww = hwwVarSd.hww(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0305hwwHww.hww(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
