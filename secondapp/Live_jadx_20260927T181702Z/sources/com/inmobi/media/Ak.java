package com.inmobi.media;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T9 f54359a;

    public Ak(T9 mConfigIncludeIdMaskMap) {
        kotlin.jvm.internal.m0.p(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        this.f54359a = mConfigIncludeIdMaskMap;
    }

    public final HashMap a() {
        C4003t1 c4003t1;
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            if (this.f54359a.a() && (c4003t1 = AbstractC4172zk.f58284a) != null && (str = c4003t1.f57687b) != null) {
                kotlin.jvm.internal.m0.m(str);
                map2.put("GPID", str);
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.m0.o(Ak.class.getSimpleName(), "getSimpleName(...)");
        }
        String string = new JSONObject(map2).toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        map.put("u-id-map", string);
        return map;
    }
}
