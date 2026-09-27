package com.bytedance.adsdk.ugeno.vy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod {
    private static Map<String, vgm> hww = new HashMap();

    public static void hww(List<vgm> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (vgm vgmVar : list) {
            if (vgmVar != null) {
                hww.put(vgmVar.hww(), vgmVar);
            }
        }
    }

    public static vgm hww(String str) {
        return hww.get(str);
    }
}
