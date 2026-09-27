package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f65283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f65284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f65285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65286e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f65287f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65288g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f65289h;

    public a(Map<String, Object> map) {
        a(map);
        f();
    }

    private void f() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f65286e, this.f65287f, this.f65288g);
        this.f65289h = aVar;
        aVar.c();
        this.f65289h.a();
        this.f65289h.b();
    }

    public List<String> a() {
        return this.f65285d;
    }

    public List<String> b() {
        return this.f65284c;
    }

    public Map<String, Object> c() {
        Map<String, Object> mapA = this.f65289h.a();
        Map<String, Object> mapB = this.f65289h.b();
        HashMap map = new HashMap();
        map.putAll(mapA);
        map.putAll(mapB);
        return map;
    }

    public List<String> d() {
        return this.f65283b;
    }

    public String e() {
        return this.f65282a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("138"));
            if (obj != null) {
                this.f65282a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.a("140"));
            if (obj2 instanceof List) {
                this.f65283b = (List) obj2;
            }
            Object obj3 = map.get(c.a("196"));
            if (obj3 instanceof List) {
                this.f65284c = (List) obj3;
            }
            Object obj4 = map.get(c.a("197"));
            if (obj4 instanceof List) {
                this.f65285d = (List) obj4;
            }
            Object obj5 = map.get(c.a("139"));
            if (obj5 != null) {
                this.f65286e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get(c.a("194"));
            if (obj6 != null) {
                this.f65287f = Integer.parseInt(String.valueOf(obj6));
            }
            Object obj7 = map.get(c.a("195"));
            if (obj7 != null) {
                this.f65288g = Integer.parseInt(String.valueOf(obj7));
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    private String a(String str) {
        return this.f65289h.a(str);
    }
}
