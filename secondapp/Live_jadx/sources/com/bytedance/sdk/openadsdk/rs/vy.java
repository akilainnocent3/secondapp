package com.bytedance.sdk.openadsdk.rs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.yt;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class vy extends hww {
    public static sd hww;

    public static String hww(com.bytedance.sdk.component.vgm.tq.sd sdVar, String str) {
        sd sdVarHww;
        Map map;
        if (!yt.sd() || (sdVarHww = tq.hww("net")) == null || (map = (Map) sdVarHww.hww(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                sdVar.tq(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
