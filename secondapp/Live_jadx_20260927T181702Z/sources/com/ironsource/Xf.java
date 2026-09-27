package com.ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f60321a;

    public Xf(E0 e10) {
        this.f60321a = e10;
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f60321a.a(B0.COLLECT_TOKENS_COMPLETED, map);
    }

    public void b(Map<String, Object> map, long j10) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f60321a.a(B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f60321a.a(B0.COLLECT_TOKENS_FAILED, map);
    }

    public void a() {
        this.f60321a.a(B0.COLLECT_TOKEN, new HashMap());
    }

    public void a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f60321a.a(B0.INSTANCE_COLLECT_TOKEN, map2);
    }

    public void a(Map<String, Object> map, long j10) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f60321a.a(B0.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    public void a(Map<String, Object> map, long j10, String str) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f60321a.a(B0.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }
}
