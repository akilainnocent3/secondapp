package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class qt {
    private static volatile qt hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Map<String, Map<String, String>> f36614tq = new ConcurrentHashMap();

    private qt() {
    }

    public static qt hww() {
        if (hww == null) {
            synchronized (qt.class) {
                try {
                    if (hww == null) {
                        hww = new qt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    public boolean sd(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f36614tq;
        if (map2 == null || !map2.containsKey(str) || (map = this.f36614tq.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public boolean tq(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f36614tq;
        if (map2 == null || !map2.containsKey(str) || (map = this.f36614tq.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public void hww(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.f36614tq;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.f36614tq.put(str, concurrentHashMap);
    }

    public String hww(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f36614tq;
        if (map2 == null || !map2.containsKey(str) || (map = this.f36614tq.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void hww(String str) {
        Map<String, Map<String, String>> map = this.f36614tq;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.f36614tq.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.f36614tq.remove(str);
        }
    }
}
