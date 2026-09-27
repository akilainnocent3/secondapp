package com.mbridge.msdk.config.component.common.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import gp.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static Map<String, Object> a(com.mbridge.msdk.config.component.base.b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> mapA;
        Map<String, Object> mapA2;
        Map<String, Object> mapA3;
        Map<String, Object> mapA4;
        Object obj;
        HashMap map = new HashMap();
        try {
            boolean zA = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("20"));
            boolean zA2 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("21"));
            boolean zA3 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("22"));
            boolean zA4 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("23"));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("key"), bVar.c());
            if (zA && (mapA4 = a(aVar.b(com.mbridge.msdk.config.component.common.util.c.a("50")))) != null && (obj = mapA4.get(com.mbridge.msdk.config.component.common.util.c.a("event_name"))) != null) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("e_s_name"), String.valueOf(obj));
            }
            Map<String, Object> mapA5 = a(bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("50")));
            if (zA2 && mapA5 != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, Object> entry : mapA5.entrySet()) {
                    if (entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.a("500"))) {
                        map.put(com.mbridge.msdk.config.component.common.util.c.a("result"), entry.getValue());
                    } else if (entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.a(e.f87280s))) {
                        map.put(com.mbridge.msdk.config.component.common.util.c.a(e.f87280s), entry.getValue());
                    } else if (entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.a("reason"))) {
                        map.put(com.mbridge.msdk.config.component.common.util.c.a("reason"), entry.getValue());
                    } else {
                        map2.put(entry.getKey(), entry.getValue());
                    }
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.a("other"), map2);
            }
            if (zA3) {
                Map<String, Object> mapA6 = a(bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("52")));
                Map<String, Object> mapA7 = mapA6 != null ? a(mapA6.get(com.mbridge.msdk.config.component.common.util.c.a("13"))) : null;
                map.put(com.mbridge.msdk.config.component.common.util.c.a("execute_c_config"), a(mapA6));
                if (mapA7 != null && !mapA7.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("execute_e_config"), mapA7);
                }
            }
            if (zA4 && (mapA2 = a(bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("51")))) != null && (mapA3 = a(mapA2.get(com.mbridge.msdk.config.component.common.util.c.a("metrics")))) != null && !mapA3.isEmpty()) {
                map.putAll(mapA3);
            }
            if (mapA5 != null && mapA5.containsKey(com.mbridge.msdk.config.component.common.util.c.a("24")) && (mapA = a(mapA5.get(com.mbridge.msdk.config.component.common.util.c.a("24")))) != null && !mapA.isEmpty()) {
                map.putAll(mapA);
            }
            return map;
        } catch (Throwable th2) {
            q0.b("MetricsUtil", th2.getMessage());
            return map;
        }
    }

    private static boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return true;
        }
        return String.valueOf(obj).equals("1");
    }

    private static Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
        }
        return null;
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.a("25")) && !entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.a("13"))) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }
}
