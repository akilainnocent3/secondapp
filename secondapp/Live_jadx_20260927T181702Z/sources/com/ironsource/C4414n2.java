package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4414n2 {
    public static final String A = "nurl";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f63069o = "adMarkup";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f63070p = "instance";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f63071q = "adData";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f63072r = "price";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f63073s = "serverData";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f63074t = "loadTimeout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f63075u = "order";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f63076v = "show";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f63077w = "price";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f63078x = "notifications";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f63079y = "burl";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f63080z = "lurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f63083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private Integer f63085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f63089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f63090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<String> f63091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONObject f63092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bb f63093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f63094n;

    public C4414n2(String str) {
        this.f63081a = null;
        this.f63082b = "";
        this.f63083c = null;
        this.f63084d = "";
        this.f63085e = null;
        this.f63086f = -1;
        this.f63087g = -1;
        this.f63088h = -1;
        this.f63089i = new ArrayList();
        this.f63090j = new ArrayList();
        this.f63091k = new ArrayList();
        this.f63092l = null;
        this.f63093m = null;
        this.f63094n = true;
        this.f63081a = str;
    }

    public Z8 a(String str) {
        return null;
    }

    public List<String> b() {
        return this.f63089i;
    }

    public String c() {
        return this.f63081a;
    }

    public Bb d() {
        return this.f63093m;
    }

    public int e() {
        return this.f63086f;
    }

    @oy.m
    public Integer f() {
        return this.f63085e;
    }

    public List<String> g() {
        return this.f63090j;
    }

    public List<String> h() {
        return this.f63091k;
    }

    public String i() {
        return this.f63084d;
    }

    public int j() {
        return this.f63088h;
    }

    public String k() {
        return this.f63082b;
    }

    public int l() {
        return this.f63087g;
    }

    public JSONObject m() {
        return this.f63092l;
    }

    public boolean n() {
        return this.f63094n;
    }

    private void a(@oy.m JSONObject jSONObject, int i10) {
        this.f63086f = i10;
        this.f63087g = i10;
        this.f63088h = i10;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("show", i10);
            this.f63087g = iOptInt;
            this.f63088h = jSONObject.optInt("price", iOptInt);
        }
    }

    @oy.m
    public JSONObject a() {
        return this.f63083c;
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C4384la.b(jSONObject.getJSONArray(str)));
        }
    }

    public C4414n2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C4414n2(JSONObject jSONObject, int i10, JSONObject jSONObject2) {
        this.f63081a = null;
        this.f63082b = "";
        this.f63083c = null;
        this.f63084d = "";
        this.f63085e = null;
        this.f63086f = -1;
        this.f63087g = -1;
        this.f63088h = -1;
        ArrayList arrayList = new ArrayList();
        this.f63089i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f63090j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f63091k = arrayList3;
        this.f63092l = null;
        this.f63093m = null;
        this.f63094n = true;
        try {
            if (jSONObject.has("instance")) {
                this.f63081a = jSONObject.getString("instance");
            }
            if (jSONObject.has("adMarkup")) {
                this.f63082b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(f63073s)) {
                this.f63082b = jSONObject.getJSONObject(f63073s).toString();
            }
            this.f63083c = jSONObject.optJSONObject("adData");
            this.f63084d = jSONObject.optString("price", "0");
            if (jSONObject.has(f63078x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(f63078x);
                a(jSONObject3, f63079y, arrayList);
                a(jSONObject3, f63080z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.f63092l = C4384la.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f62453d));
            this.f63093m = jSONObject.has(com.ironsource.mediationsdk.d.f62454e) ? Bb.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f62454e)) : null;
            this.f63085e = jSONObject.has(f63074t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f63074t))) : null;
            a(jSONObject.optJSONObject(f63075u), i10);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            this.f63094n = false;
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
    }
}
