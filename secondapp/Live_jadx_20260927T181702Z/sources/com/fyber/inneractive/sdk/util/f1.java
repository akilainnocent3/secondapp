package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 {
    public static String a(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder(str);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(z10 ? "?" : "&");
            sb2.append((String) entry.getKey());
            sb2.append(C4235d4.j.f61456b);
            sb2.append(Uri.encode((String) entry.getValue()));
            z10 = false;
        }
        return sb2.toString();
    }
}
