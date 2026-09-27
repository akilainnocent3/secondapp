package io.appmetrica.analytics.impl;

import com.ironsource.C4253e4;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.he, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5098he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f97513a;

    public C5098he() {
        HashMap map = new HashMap();
        this.f97513a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", "h");
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", "pc");
        map.put("retry_policy", "rp");
        map.put("cache_control", t1.c.f135980f);
        map.put(C4253e4.f61605c, "at");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f97513a.containsKey(str) ? (String) this.f97513a.get(str) : str;
    }
}
