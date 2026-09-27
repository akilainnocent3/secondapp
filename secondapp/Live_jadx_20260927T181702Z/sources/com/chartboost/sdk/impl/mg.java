package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.LGPD;
import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mg {
    public final boolean A;
    public final a B;
    public b C;
    public final String D;
    public final long E;
    public final long F;
    public final ci G;
    public final dk H;
    public final wd I;
    public final List J;
    public final boolean K;
    public final z6 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f40021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f40027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f40028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f40029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f40030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f40031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f40032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f40033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f40034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f40035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f40036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f40037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f40038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f40039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f40040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f40041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f40042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f40043z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f40044a;

        public boolean a() {
            return this.f40044a;
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f40044a = jSONObject.optBoolean("bannerEnable", true);
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet f40045a;

        public static void a(HashSet hashSet, int i10) {
            if (i10 == 0) {
                hashSet.clear();
            }
        }

        public HashSet a() {
            return this.f40045a;
        }

        public static void a(JSONArray jSONArray, HashSet hashSet, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                hashSet.add(jSONArray.getString(i11));
            }
        }

        public static b a(JSONObject jSONObject) {
            b bVar = new b();
            HashSet hashSet = new HashSet();
            hashSet.add(CCPA.CCPA_STANDARD);
            hashSet.add(COPPA.COPPA_STANDARD);
            hashSet.add(LGPD.LGPD_STANDARD);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                a(jSONArrayOptJSONArray, hashSet, length);
                a(hashSet, length);
            }
            bVar.f40045a = hashSet;
            return bVar;
        }
    }

    public mg(JSONObject jSONObject) {
        List arrayList;
        this.f40018a = jSONObject.optString("configVariant");
        this.f40019b = jSONObject.optBoolean("prefetchDisable");
        this.f40020c = jSONObject.optBoolean("publisherDisable");
        this.B = a.a(jSONObject);
        try {
            this.C = b.a(jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.D = jSONObject.optString("publisherWarning", null);
        this.E = jSONObject.optLong("maxBytes", 104857600L);
        this.F = jSONObject.optLong("ttl", ne.e.f116460d);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (!strOptString.isEmpty()) {
                    arrayList2.add(strOptString);
                }
            }
        }
        this.f40021d = Collections.unmodifiableList(arrayList2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("trackingLevels");
        jSONObjectOptJSONObject = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f40022e = jSONObjectOptJSONObject.optBoolean("critical", true);
        this.f40029l = jSONObjectOptJSONObject.optBoolean("includeStackTrace", true);
        this.f40023f = jSONObjectOptJSONObject.optBoolean("error");
        this.f40024g = jSONObjectOptJSONObject.optBoolean("debug");
        this.f40025h = jSONObjectOptJSONObject.optBoolean(nk.h.f117418b);
        this.f40026i = jSONObjectOptJSONObject.optBoolean("system");
        this.f40027j = jSONObjectOptJSONObject.optBoolean("timing");
        this.f40028k = jSONObjectOptJSONObject.optBoolean("user");
        this.f40030m = jSONObjectOptJSONObject.optBoolean("loggerCallerInfoCache", true);
        this.G = di.b(jSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.H = dk.a(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("omSdk");
        this.I = xd.b(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(C4235d4.i.K);
        jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4;
        this.f40031n = jSONObjectOptJSONObject4.optInt("cacheMaxBytes", 104857600);
        int iOptInt = jSONObjectOptJSONObject4.optInt("cacheMaxUnits", 10);
        this.f40032o = iOptInt > 0 ? iOptInt : 10;
        this.f40033p = (int) TimeUnit.SECONDS.toDays(jSONObjectOptJSONObject4.optInt("cacheTTLs", q2.f40480a));
        ArrayList arrayList3 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("directories");
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String strOptString2 = jSONArrayOptJSONArray2.optString(i11);
                if (!strOptString2.isEmpty()) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        this.f40034q = Collections.unmodifiableList(arrayList3);
        this.f40035r = jSONObjectOptJSONObject4.optBoolean("enabled", l());
        this.f40036s = jSONObjectOptJSONObject4.optBoolean("inplayEnabled", true);
        this.f40037t = jSONObjectOptJSONObject4.optBoolean("interstitialEnabled", true);
        int iOptInt2 = jSONObjectOptJSONObject4.optInt("invalidatePendingImpression", 3);
        this.f40038u = iOptInt2 <= 0 ? 3 : iOptInt2;
        this.f40039v = jSONObjectOptJSONObject4.optBoolean("lockOrientation", true);
        this.f40040w = jSONObjectOptJSONObject4.optInt("prefetchSession", 3);
        this.f40041x = jSONObjectOptJSONObject4.optBoolean("rewardVideoEnabled", true);
        String strOptString3 = jSONObjectOptJSONObject4.optString("version", "v2");
        this.f40042y = strOptString3;
        this.f40043z = String.format("%s/%s%s", C4235d4.i.K, strOptString3, "/prefetch");
        this.A = jSONObjectOptJSONObject4.optBoolean("redirectOpenToNativeBrowser", false);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("event_trackers");
        if (jSONObject.has("event_trackers") && jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else if (!jSONObject.has("event_trackers") || jSONArrayOptJSONArray3 == null) {
            arrayList = null;
        } else {
            try {
                List listA = p7.a(jSONArrayOptJSONArray3);
                arrayList = (listA == null || listA.isEmpty()) ? Collections.EMPTY_LIST : new ArrayList(listA);
            } catch (Exception unused) {
                arrayList = Collections.EMPTY_LIST;
            }
        }
        this.J = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        this.K = jSONObject.optBoolean("nrp_waterfall_enabled", false);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("nrp_waterfall_endpoints");
        if (jSONObjectOptJSONObject5 != null) {
            this.L = new z6(jSONObjectOptJSONObject5.has("banner") ? jSONObjectOptJSONObject5.optString("banner", "https://da.chartboost.com/unified/v1/sdk/banner") : "https://da.chartboost.com/unified/v1/sdk/banner", jSONObjectOptJSONObject5.has("interstitial") ? jSONObjectOptJSONObject5.optString("interstitial", "https://da.chartboost.com/unified/v1/sdk/interstitial") : "https://da.chartboost.com/unified/v1/sdk/interstitial", jSONObjectOptJSONObject5.has("rewarded") ? jSONObjectOptJSONObject5.optString("rewarded", "https://da.chartboost.com/unified/v1/sdk/rewarded") : "https://da.chartboost.com/unified/v1/sdk/rewarded");
        } else {
            this.L = z6.Companion.a();
        }
    }

    public static boolean l() {
        int[] iArr = {4, 4, 2};
        String strA = j1.b().a();
        if (strA != null && strA.length() > 0) {
            String[] strArrSplit = strA.replaceAll("[^\\d.]", "").split("\\.");
            for (int i10 = 0; i10 < strArrSplit.length && i10 < 3; i10++) {
                try {
                    if (Integer.parseInt(strArrSplit[i10]) > iArr[i10]) {
                        return true;
                    }
                    if (Integer.parseInt(strArrSplit[i10]) < iArr[i10]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public a a() {
        return this.B;
    }

    public List b() {
        return this.J;
    }

    public z6 c() {
        return this.L;
    }

    public wd d() {
        return this.I;
    }

    public dk e() {
        return this.H;
    }

    public boolean f() {
        return this.f40019b;
    }

    public boolean g() {
        return this.f40020c;
    }

    public String h() {
        return this.D;
    }

    public ci i() {
        return this.G;
    }

    public boolean j() {
        return this.K;
    }

    public boolean k() {
        return this.f40035r;
    }

    public boolean m() {
        return this.f40039v;
    }

    public e5 n() {
        return new e5(this.f40018a, this.f40035r, this.f40042y, this.K, this.L);
    }
}
