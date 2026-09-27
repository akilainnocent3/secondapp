package com.mbridge.msdk.config.component.log.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f65528a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65529b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65530c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65531d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65532e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f65533f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65534g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f65535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f65536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f65537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f65538k;

    public void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.a("181"))) {
                this.f65528a = ((Integer) map.get(c.a("181"))).intValue();
            }
            if (map.containsKey(c.a("162"))) {
                this.f65529b = ((Integer) map.get(c.a("162"))).intValue();
            }
            if (map.containsKey(c.a("182"))) {
                this.f65530c = ((Integer) map.get(c.a("182"))).intValue();
            }
            if (map.containsKey(c.a("183"))) {
                this.f65531d = ((Integer) map.get(c.a("183"))).intValue();
            }
            if (map.containsKey(c.a("174"))) {
                this.f65532e = ((Integer) map.get(c.a("174"))).intValue();
            }
            if (map.containsKey(c.a("184"))) {
                this.f65533f = ((Integer) map.get(c.a("184"))).intValue();
            }
            if (map.containsKey(c.a("185"))) {
                this.f65534g = ((Integer) map.get(c.a("185"))).intValue();
            }
            if (map.containsKey(c.a("180"))) {
                this.f65535h = (Map) map.get(c.a("180"));
            }
            if (map.containsKey(c.a("179"))) {
                this.f65536i = (Map) map.get(c.a("179"));
            }
            if (map.containsKey(c.a("186"))) {
                this.f65537j = (Map) map.get(c.a("186"));
            }
            this.f65538k = map.containsKey(c.a("178")) ? ((Integer) map.get(c.a("178"))).intValue() : 0;
        }
    }

    public int b() {
        return this.f65529b;
    }

    public String c() {
        Map<String, Object> map = this.f65535h;
        return (map == null || !map.containsKey(c.a("116"))) ? "" : (String) this.f65535h.get(c.a("116"));
    }

    public int d() {
        return this.f65533f;
    }

    public int e() {
        return this.f65538k;
    }

    public int f() {
        Map<String, Object> map = this.f65535h;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f65532e;
    }

    public Map<String, Object> h() {
        return this.f65537j;
    }

    public String i() {
        Map<String, Object> map = this.f65536i;
        return (map == null || !map.containsKey(c.a("114"))) ? "" : (String) this.f65536i.get(c.a("114"));
    }

    public int j() {
        Map<String, Object> map = this.f65536i;
        if (map == null || !map.containsKey(c.a("172"))) {
            return 0;
        }
        return ((Integer) this.f65536i.get(c.a("172"))).intValue();
    }

    public int k() {
        return this.f65534g;
    }

    public int a() {
        return this.f65528a;
    }
}
