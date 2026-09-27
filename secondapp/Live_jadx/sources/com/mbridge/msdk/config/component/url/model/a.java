package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f65720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<Object, Object> f65723d;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("160"));
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get(c.a("151"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("109"));
            if (obj3 instanceof Map) {
                b((Map<Object, Object>) obj3);
            }
        }
    }

    public void b(String str) {
        this.f65722c = str;
    }

    public String c() {
        return this.f65721b;
    }

    public String d() {
        return this.f65722c;
    }

    public Map<Object, Object> b() {
        return this.f65723d;
    }

    public void b(Map<Object, Object> map) {
        this.f65723d = map;
    }

    public Context a() {
        return this.f65720a;
    }

    public void a(Context context) {
        this.f65720a = context;
    }

    public void a(String str) {
        this.f65721b = str;
    }
}
