package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5377sg {
    public static K7 a(String str) {
        HashMap map;
        HashMap mapB = b(str);
        if (mapB.isEmpty()) {
            mapB = b(Uri.decode(str));
        }
        String strDecode = Uri.decode((String) mapB.get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(strDecode)) {
            map = null;
        } else {
            HashMap mapB2 = b(strDecode);
            map = new HashMap(mapB2.size());
            for (Map.Entry entry : mapB2.entrySet()) {
                map.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new K7(strDecode, map, str);
    }

    public static HashMap b(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf(63);
            if (iLastIndexOf >= 0) {
                str = str.substring(iLastIndexOf + 1);
            }
            if (str.contains(C4235d4.j.f61456b)) {
                for (String str2 : str.split("&")) {
                    int iIndexOf = str2.indexOf(C4235d4.j.f61456b);
                    if (iIndexOf >= 0) {
                        map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                    } else {
                        map.put(str2, "");
                    }
                }
            }
        }
        return map;
    }
}
