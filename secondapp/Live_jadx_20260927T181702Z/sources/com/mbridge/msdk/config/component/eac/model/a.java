package com.mbridge.msdk.config.component.eac.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f65278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65280c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("135"));
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get(c.a("136"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("137"));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f65279b;
    }

    public Object c() {
        return this.f65278a;
    }

    public void b(String str) {
        this.f65279b = str;
    }

    public void a(Object obj) {
        this.f65278a = obj;
    }

    public String a() {
        return this.f65280c;
    }

    public void a(String str) {
        this.f65280c = str;
    }
}
