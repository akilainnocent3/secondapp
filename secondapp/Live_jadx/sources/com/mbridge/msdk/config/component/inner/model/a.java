package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f65335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f65336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f65337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f65338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f65339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Map<String, Object> f65340f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("117"));
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get(c.a("116"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("159"));
            if (obj3 instanceof Map) {
                Map<String, Object> map2 = (Map) obj3;
                b(map2);
                if (!map2.isEmpty()) {
                    c(String.valueOf(map2.get(c.a("160"))));
                }
            }
            Object obj4 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.f65337c = str;
    }

    public void c(String str) {
        this.f65338d = str;
    }

    public void d(String str) {
        this.f65336b = str;
    }

    public String e() {
        return this.f65338d;
    }

    public String f() {
        return this.f65336b;
    }

    public Map<String, Object> b() {
        return this.f65340f;
    }

    public String c() {
        return this.f65339e;
    }

    public String d() {
        return this.f65337c;
    }

    public void b(Map<String, Object> map) {
        this.f65340f = map;
    }

    public Context a() {
        return this.f65335a;
    }

    public void a(Context context) {
        this.f65335a = context;
    }

    public void a(String str) {
        this.f65339e = str;
    }
}
