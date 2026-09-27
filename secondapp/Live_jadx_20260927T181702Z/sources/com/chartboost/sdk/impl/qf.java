package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class qf {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f40578p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f40579q = b.FILL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f40582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j5 f40584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f40585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bj f40586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y8 f40587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f40588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f40589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f40590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f40591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f40592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f40593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f40594o;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final qf a(JSONObject jsonObject) throws JSONException {
            Iterator<String> itKeys;
            kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
            JSONObject jSONObject = jsonObject.getJSONObject("config");
            List listA = p7.a(jSONObject.optJSONArray("event_trackers"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("ext");
            if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kotlin.jvm.internal.m0.m(next);
                    Object obj = jSONObjectOptJSONObject.get(next);
                    kotlin.jvm.internal.m0.o(obj, "get(...)");
                    linkedHashMap.put(next, obj);
                }
            }
            String string = jsonObject.getString("adm");
            kotlin.jvm.internal.m0.o(string, "getString(...)");
            String string2 = jsonObject.getString("markup_type");
            kotlin.jvm.internal.m0.o(string2, "getString(...)");
            long jOptLong = jSONObject.optLong("auto_advance_time", -1L);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("countdown");
            Integer numValueOf = null;
            j5 j5VarA = jSONObjectOptJSONObject2 != null ? j5.f39552c.a(jSONObjectOptJSONObject2) : null;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("vast");
            bj bjVarA = jSONObjectOptJSONObject3 != null ? bj.f38310g.a(jSONObjectOptJSONObject3) : null;
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("html");
            y8 y8VarA = jSONObjectOptJSONObject4 != null ? y8.f41644g.a(jSONObjectOptJSONObject4) : null;
            int iOptInt = jSONObject.optInt("ignore_safe_area", 0);
            boolean zOptBoolean = jSONObject.optBoolean("dedupe_clicks", true);
            boolean zOptBoolean2 = jSONObject.optBoolean("reset_user_click_detector_after_click", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("optional", false);
            b bVarA = jSONObject.has("fit_type") ? b.f40595c.a(jSONObject.getString("fit_type")) : qf.f40579q;
            Integer numValueOf2 = (!jSONObject.has("height") || jSONObject.isNull("height")) ? null : Integer.valueOf(jSONObject.getInt("height"));
            if (jSONObject.has("width") && !jSONObject.isNull("width")) {
                numValueOf = Integer.valueOf(jSONObject.getInt("width"));
            }
            return new qf(string, string2, linkedHashMap, jOptLong, j5VarA, listA, bjVarA, y8VarA, iOptInt, zOptBoolean, zOptBoolean2, zOptBoolean3, bVarA, numValueOf2, numValueOf);
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        ASPECT("aspect"),
        FILL("fill"),
        FIXED("fixed");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f40601b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ sr.a f40600h = sr.c.c(a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40595c = new a(null);

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public a() {
            }

            public final b a(String str) {
                Object next;
                Iterator<E> it = b.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m0.g(((b) next).c(), str));
                b bVar = (b) next;
                return bVar == null ? b.FILL : bVar;
            }

            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }
        }

        b(String str) {
            this.f40601b = str;
        }

        public static sr.a b() {
            return f40600h;
        }

        public final String c() {
            return this.f40601b;
        }
    }

    public qf(String adm, String markupType, Map ext, long j10, j5 j5Var, List eventTrackers, bj bjVar, y8 y8Var, int i10, boolean z10, boolean z11, boolean z12, b fitType, Integer num, Integer num2) {
        kotlin.jvm.internal.m0.p(adm, "adm");
        kotlin.jvm.internal.m0.p(markupType, "markupType");
        kotlin.jvm.internal.m0.p(ext, "ext");
        kotlin.jvm.internal.m0.p(eventTrackers, "eventTrackers");
        kotlin.jvm.internal.m0.p(fitType, "fitType");
        this.f40580a = adm;
        this.f40581b = markupType;
        this.f40582c = ext;
        this.f40583d = j10;
        this.f40584e = j5Var;
        this.f40585f = eventTrackers;
        this.f40586g = bjVar;
        this.f40587h = y8Var;
        this.f40588i = i10;
        this.f40589j = z10;
        this.f40590k = z11;
        this.f40591l = z12;
        this.f40592m = fitType;
        this.f40593n = num;
        this.f40594o = num2;
    }

    public final String b() {
        return this.f40580a;
    }

    public final long c() {
        return this.f40583d;
    }

    public final j5 d() {
        return this.f40584e;
    }

    public final boolean e() {
        return this.f40589j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return kotlin.jvm.internal.m0.g(this.f40580a, qfVar.f40580a) && kotlin.jvm.internal.m0.g(this.f40581b, qfVar.f40581b) && kotlin.jvm.internal.m0.g(this.f40582c, qfVar.f40582c) && this.f40583d == qfVar.f40583d && kotlin.jvm.internal.m0.g(this.f40584e, qfVar.f40584e) && kotlin.jvm.internal.m0.g(this.f40585f, qfVar.f40585f) && kotlin.jvm.internal.m0.g(this.f40586g, qfVar.f40586g) && kotlin.jvm.internal.m0.g(this.f40587h, qfVar.f40587h) && this.f40588i == qfVar.f40588i && this.f40589j == qfVar.f40589j && this.f40590k == qfVar.f40590k && this.f40591l == qfVar.f40591l && this.f40592m == qfVar.f40592m && kotlin.jvm.internal.m0.g(this.f40593n, qfVar.f40593n) && kotlin.jvm.internal.m0.g(this.f40594o, qfVar.f40594o);
    }

    public final List f() {
        return this.f40585f;
    }

    public final Map g() {
        return this.f40582c;
    }

    public final b h() {
        return this.f40592m;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f40580a.hashCode() * 31) + this.f40581b.hashCode()) * 31) + this.f40582c.hashCode()) * 31) + f0.p.a(this.f40583d)) * 31;
        j5 j5Var = this.f40584e;
        int iHashCode2 = (((iHashCode + (j5Var == null ? 0 : j5Var.hashCode())) * 31) + this.f40585f.hashCode()) * 31;
        bj bjVar = this.f40586g;
        int iHashCode3 = (iHashCode2 + (bjVar == null ? 0 : bjVar.hashCode())) * 31;
        y8 y8Var = this.f40587h;
        int iHashCode4 = (((((((((((iHashCode3 + (y8Var == null ? 0 : y8Var.hashCode())) * 31) + this.f40588i) * 31) + g8.a.a(this.f40589j)) * 31) + g8.a.a(this.f40590k)) * 31) + g8.a.a(this.f40591l)) * 31) + this.f40592m.hashCode()) * 31;
        Integer num = this.f40593n;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f40594o;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Integer i() {
        return this.f40593n;
    }

    public final y8 j() {
        return this.f40587h;
    }

    public final int k() {
        return this.f40588i;
    }

    public final String l() {
        return this.f40581b;
    }

    public final boolean m() {
        return this.f40591l;
    }

    public final boolean n() {
        return this.f40590k;
    }

    public final bj o() {
        return this.f40586g;
    }

    public final Integer p() {
        return this.f40594o;
    }

    public String toString() {
        return "RenderableConfig(adm=" + this.f40580a + ", markupType=" + this.f40581b + ", ext=" + this.f40582c + ", autoAdvanceTime=" + this.f40583d + ", countdown=" + this.f40584e + ", eventTrackers=" + this.f40585f + ", vast=" + this.f40586g + ", html=" + this.f40587h + ", ignoreSafeAreaFlags=" + this.f40588i + ", dedupeClicks=" + this.f40589j + ", resetUserClickDetectorAfterClick=" + this.f40590k + ", optional=" + this.f40591l + ", fitType=" + this.f40592m + ", height=" + this.f40593n + ", width=" + this.f40594o + gi.j.f86771d;
    }

    public /* synthetic */ qf(String str, String str2, Map map, long j10, j5 j5Var, List list, bj bjVar, y8 y8Var, int i10, boolean z10, boolean z11, boolean z12, b bVar, Integer num, Integer num2, int i11, kotlin.jvm.internal.x xVar) {
        this(str, str2, (i11 & 4) != 0 ? fr.n1.z() : map, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? null : j5Var, (i11 & 32) != 0 ? fr.h0.J() : list, (i11 & 64) != 0 ? null : bjVar, (i11 & 128) != 0 ? null : y8Var, (i11 & 256) != 0 ? 0 : i10, (i11 & 512) != 0 ? true : z10, (i11 & 1024) != 0 ? false : z11, (i11 & 2048) != 0 ? false : z12, (i11 & 4096) != 0 ? b.FILL : bVar, (i11 & 8192) != 0 ? null : num, (i11 & 16384) != 0 ? null : num2);
    }
}
