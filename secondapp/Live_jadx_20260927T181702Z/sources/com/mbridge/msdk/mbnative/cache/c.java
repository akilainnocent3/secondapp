package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f67919a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (f67919a.containsKey(Integer.valueOf(i10))) {
            return f67919a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        f67919a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
