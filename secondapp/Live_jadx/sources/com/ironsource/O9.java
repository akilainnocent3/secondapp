package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f59715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f59716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f59717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4329i8 f59718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f59719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Hc f59720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f59721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f59722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59723j;

    public O9(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, Map<String, String> map, Hc hc2, C4329i8 c4329i8) {
        this.f59715b = str;
        this.f59716c = str2;
        this.f59714a = z10;
        this.f59717d = z11;
        this.f59719f = map;
        this.f59720g = hc2;
        this.f59718e = c4329i8;
        this.f59722i = z12;
        this.f59723j = z13;
        this.f59721h = str3;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f59715b);
        map.put("instanceName", this.f59716c);
        map.put("rewarded", Boolean.toString(this.f59714a));
        map.put("inAppBidding", Boolean.toString(this.f59717d));
        map.put("isOneFlow", Boolean.toString(this.f59722i));
        map.put(C4235d4.f61275s, String.valueOf(2));
        C4329i8 c4329i8 = this.f59718e;
        map.put("width", c4329i8 != null ? Integer.toString(c4329i8.c()) : "0");
        C4329i8 c4329i9 = this.f59718e;
        map.put("height", c4329i9 != null ? Integer.toString(c4329i9.a()) : "0");
        C4329i8 c4329i10 = this.f59718e;
        map.put("label", c4329i10 != null ? c4329i10.b() : "");
        map.put(C4235d4.f61279w, Boolean.toString(i()));
        if (this.f59723j) {
            map.put("isMultipleAdObjects", "true");
        }
        String str = this.f59721h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f59719f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final Hc b() {
        return this.f59720g;
    }

    public String c() {
        return this.f59721h;
    }

    public Map<String, String> d() {
        return this.f59719f;
    }

    public String e() {
        return this.f59715b;
    }

    public String f() {
        return this.f59716c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f59716c;
    }

    public C4329i8 h() {
        return this.f59718e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.f59717d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.f59723j;
    }

    public boolean m() {
        return this.f59722i;
    }

    public boolean n() {
        return this.f59714a;
    }

    public void a(Hc hc2) {
        this.f59720g = hc2;
    }

    public void a(String str) {
        this.f59721h = str;
    }
}
