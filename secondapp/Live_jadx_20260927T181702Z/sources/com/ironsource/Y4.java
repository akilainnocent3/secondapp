package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Y4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60340h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f60341i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f60342j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f60343k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f60344l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f60348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O9 f60351g;

    public Y4(String str, String str2, Map<String, String> map, Hc hc2) {
        this.f60347c = -1;
        this.f60346b = str;
        this.f60345a = str2;
        this.f60348d = map;
        this.f60349e = 0;
        this.f60350f = false;
        this.f60351g = null;
    }

    public void a(boolean z10) {
        this.f60350f = z10;
    }

    public synchronized void b(int i10) {
        this.f60349e = i10;
    }

    public O9 c() {
        return this.f60351g;
    }

    public boolean d() {
        return this.f60350f;
    }

    public int e() {
        return this.f60349e;
    }

    public String f() {
        return this.f60345a;
    }

    public Map<String, String> g() {
        return this.f60348d;
    }

    public String h() {
        return this.f60346b;
    }

    public Hc i() {
        if (this.f60351g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f60347c;
    }

    public boolean k() {
        Map<String, String> map = this.f60348d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f60348d.get("rewarded"));
    }

    public boolean a(int i10) {
        return this.f60347c == i10;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f60346b);
        map.put("demandSourceName", this.f60345a);
        Map<String, String> map2 = this.f60348d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void c(int i10) {
        this.f60347c = i10;
    }

    public void a() {
        Map<String, String> map = this.f60348d;
        if (map != null) {
            map.clear();
        }
        this.f60348d = null;
    }

    public Y4(O9 o10) {
        this(o10.e(), o10.g(), o10.a(), o10.b());
        this.f60351g = o10;
    }
}
