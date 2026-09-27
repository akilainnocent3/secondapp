package com.mbridge.msdk.config.component.nori.model;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f65591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f65592b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f65594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f65595e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f65598h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f65602l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65593c = "HTTP";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f65596f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65597g = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f65599i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f65600j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f65601k = 9377;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.a("165"));
                if (obj instanceof List) {
                    b((List<String>) obj);
                } else if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj.toString());
                    b(arrayList);
                }
                Object obj2 = map.get(c.a("151"));
                if (obj2 != null) {
                    c(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.a("170"));
                if (obj3 != null) {
                    a(String.valueOf(obj3));
                }
                Object obj4 = map.get(c.a("168"));
                if (obj4 instanceof Map) {
                    b((Map<String, Object>) obj4);
                }
                Object obj5 = map.get(c.a("172"));
                if (obj5 != null) {
                    c(Integer.parseInt(String.valueOf(obj5)));
                }
                Object obj6 = map.get(c.a("171"));
                if (obj6 instanceof Map) {
                    d((Map) obj6);
                }
                Object obj7 = map.get(c.a("174"));
                if (obj7 != null) {
                    try {
                        a(Integer.parseInt(String.valueOf(obj7)));
                    } catch (Exception e10) {
                        q0.b("NetworkRequestModel", e10.getMessage());
                    }
                }
                Object obj8 = map.get(c.a("175"));
                if (obj8 != null) {
                    try {
                        b(Integer.parseInt(String.valueOf(obj8)));
                    } catch (Exception e11) {
                        q0.b("NetworkRequestModel", e11.getMessage());
                    }
                }
                Object obj9 = map.get(c.a("162"));
                if (obj9 != null) {
                    try {
                        a(Long.parseLong(String.valueOf(obj9)));
                    } catch (Exception e12) {
                        q0.b("NetworkRequestModel", e12.getMessage());
                    }
                }
                Object obj10 = map.get(c.a("169"));
                if (obj10 instanceof Map) {
                    c((Map<String, Object>) obj10);
                }
                Object obj11 = map.get(c.a("173"));
                if (obj11 instanceof List) {
                    a((List<String>) obj11);
                } else if (obj11 instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj11.toString());
                    a(arrayList2);
                }
                Object obj12 = map.get(c.a("request_type"));
                if (obj12 != null) {
                    b(String.valueOf(obj12));
                }
            } catch (Exception e13) {
                q0.b("NetworkRequestModel", e13.getMessage(), e13);
            }
        }
    }

    public void b(List<String> list) {
        this.f65592b = list;
    }

    public void c(String str) {
        this.f65593c = str;
    }

    public Map<String, String> d() {
        return this.f65594d;
    }

    public String e() {
        return this.f65599i;
    }

    public String f() {
        return this.f65602l;
    }

    public int g() {
        return this.f65596f;
    }

    public int h() {
        return this.f65597g;
    }

    public String i() {
        return this.f65593c;
    }

    public int j() {
        return this.f65601k;
    }

    public long k() {
        return this.f65600j;
    }

    public List<String> l() {
        return this.f65592b;
    }

    public Map<String, Object> b() {
        return this.f65595e;
    }

    public void c(Map<String, Object> map) {
        this.f65595e = map;
    }

    public void d(Map<String, String> map) {
        this.f65594d = map;
    }

    public void b(Map<String, Object> map) {
        this.f65598h = map;
    }

    public void c(int i10) {
        this.f65601k = i10;
    }

    public void b(int i10) {
        this.f65597g = i10;
    }

    public List<String> c() {
        return this.f65591a;
    }

    public void b(String str) {
        this.f65602l = str;
    }

    public void a(int i10) {
        this.f65596f = i10;
    }

    public Map<String, Object> a() {
        return this.f65598h;
    }

    public void a(String str) {
        this.f65599i = str;
    }

    public void a(long j10) {
        this.f65600j = j10;
    }

    public void a(List<String> list) {
        this.f65591a = list;
    }
}
