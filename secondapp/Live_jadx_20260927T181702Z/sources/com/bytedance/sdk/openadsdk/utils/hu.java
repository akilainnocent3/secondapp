package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    public static String hww(String str) {
        if (!com.bytedance.sdk.component.utils.weu.vy() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.nod nodVar = new com.bytedance.sdk.openadsdk.core.model.nod(com.bytedance.sdk.openadsdk.core.rs.tq().ed());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = nodVar.tq().iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append("&");
                    sb2.append(nodVar.hww());
                } else {
                    sb2.append("?");
                    sb2.append(nodVar.hww());
                }
            }
        }
        return sb2.toString();
    }
}
