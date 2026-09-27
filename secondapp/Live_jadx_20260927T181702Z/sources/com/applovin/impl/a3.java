package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a3 extends m3 implements MaxAd {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f26378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f26379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f26380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c3 f26381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected com.applovin.impl.mediation.h f26382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f26383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MaxAdWaterfallInfo f26384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f26385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f26386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f26387t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f26388u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f26389v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f26390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f26391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f26392y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f26393z;

    public a3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.l lVar) {
        super(c3Var.e(), jSONObject, jSONObject2, lVar);
        this.f26378k = new AtomicBoolean();
        this.f26379l = new AtomicBoolean();
        this.f26380m = new AtomicBoolean();
        this.f26381n = c3Var;
        this.f26382o = hVar;
        this.f26383p = hVar != null ? hVar.b() : null;
    }

    private long M() {
        return a("load_started_time_ms", 0L);
    }

    public static a3 a(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.d.f52079b, null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new d3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new f3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (fromString.isFullscreenAd()) {
            return new e3(c3Var, jSONObject, jSONObject2, lVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(j5 j5Var) {
        JSONObject jSONObjectA;
        if (j5Var.a("credentials")) {
            jSONObjectA = j5Var.a("credentials", new JSONObject());
        } else {
            jSONObjectA = j5Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", U());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(j5 j5Var) {
        return Double.valueOf(JsonUtils.getDouble(j5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(j5 j5Var) {
        return JsonUtils.getString(j5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public String A() {
        return this.f26383p;
    }

    public com.applovin.impl.mediation.h B() {
        return this.f26382o;
    }

    public String C() {
        return a("bcode", "");
    }

    public long D() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String E() {
        return a("bid_response", (String) null);
    }

    public Bundle F() {
        JSONObject jSONObjectA;
        j5 j5Var = this.f27549h;
        if (j5Var != null) {
            return (Bundle) j5Var.a(new w.a() { // from class: com.applovin.impl.v8
                @Override // w.a
                public final Object apply(Object obj) {
                    return this.f29398a.c((j5) obj);
                }
            });
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", U());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public long G() {
        return this.f26391x;
    }

    public double H() {
        return a("ecpm", -1.0f);
    }

    public long I() {
        if (M() > 0) {
            return L() - M();
        }
        return -1L;
    }

    public double J() {
        return a("floor", -1.0d);
    }

    public long K() {
        return this.f26389v;
    }

    public long L() {
        return a("load_completed_time_ms", 0L);
    }

    public String N() {
        return this.f26392y;
    }

    public int O() {
        return a("mspc", ((Integer) this.f27542a.a(t3.f29246m8)).intValue());
    }

    public JSONObject P() {
        j5 j5Var = this.f27549h;
        return j5Var != null ? (JSONObject) j5Var.a(new w.a() { // from class: com.applovin.impl.x8
            @Override // w.a
            public final Object apply(Object obj) {
                return a3.d((j5) obj);
            }
        }) : a("publisher_extra_info", new JSONObject());
    }

    public c3 Q() {
        return this.f26381n;
    }

    public String R() {
        return JsonUtils.getString(S(), "revenue_event", "");
    }

    public JSONObject S() {
        j5 j5Var = this.f27549h;
        return j5Var != null ? (JSONObject) j5Var.a(new w.a() { // from class: com.applovin.impl.y8
            @Override // w.a
            public final Object apply(Object obj) {
                return a3.f((j5) obj);
            }
        }) : a("revenue_parameters", new JSONObject());
    }

    public String T() {
        return b("event_id", "");
    }

    public String U() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public long V() {
        return this.f26390w;
    }

    public List W() {
        return b("mwf_info_urls");
    }

    public String X() {
        return b("waterfall_name", "");
    }

    public String Y() {
        return b("waterfall_test_name", "");
    }

    public boolean Z() {
        return StringUtils.isValidString(E());
    }

    public abstract a3 a(com.applovin.impl.mediation.h hVar);

    public boolean a0() {
        com.applovin.impl.mediation.h hVar = this.f26382o;
        return hVar != null && hVar.k() && this.f26382o.j();
    }

    public boolean b0() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean c0() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void d0() {
        this.f26391x = SystemClock.elapsedRealtime() - this.f26387t;
    }

    public void e0() {
        this.f26386s = SystemClock.elapsedRealtime();
        this.f26388u = this.f27542a.o0().getTotalBackgroundDurationMillis();
    }

    public void f0() {
        long totalBackgroundDurationMillis = this.f27542a.o0().getTotalBackgroundDurationMillis() - this.f26388u;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f26386s;
        this.f26390w = jElapsedRealtime;
        this.f26389v = jElapsedRealtime - totalBackgroundDurationMillis;
    }

    public void g0() {
        this.f26387t = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f26393z;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a(CampaignEx.JSON_KEY_CREATIVE_ID, (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a(FirebaseAnalytics.d.f52079b, b(FirebaseAnalytics.d.f52079b, (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.f26382o;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(U());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f26385r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f27542a.a(t3.f29252r8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            j5 j5Var = this.f27549h;
            return j5Var != null ? ((Double) j5Var.a(new w.a() { // from class: com.applovin.impl.w8
                @Override // w.a
                public final Object apply(Object obj) {
                    return a3.e((j5) obj);
                }
            })).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f27542a.Q();
        if (!com.applovin.impl.sdk.p.a()) {
            return 0.0d;
        }
        this.f27542a.Q().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        j5 j5Var = this.f27549h;
        return j5Var != null ? (String) j5Var.a(new w.a() { // from class: com.applovin.impl.u8
            @Override // w.a
            public final Object apply(Object obj) {
                return a3.g((j5) obj);
            }
        }) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        return (iA == -3 || iA2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iA, iA2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f26384q;
    }

    public void h(String str) {
        this.f26393z = str;
    }

    public void h0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void i(String str) {
        this.f26392y = str;
    }

    public void i0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean j0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    public Boolean k0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public Boolean l0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.impl.m3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + U() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public View z() {
        com.applovin.impl.mediation.h hVar;
        if (!a0() || (hVar = this.f26382o) == null) {
            return null;
        }
        return hVar.d();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectY = y();
        if (jSONObjectY.has(str)) {
            return JsonUtils.getString(jSONObjectY, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectP = P();
        return jSONObjectP.has(str) ? JsonUtils.getString(jSONObjectP, str, str2) : a(str, str2);
    }

    public void t() {
        this.f26382o = null;
        this.f26384q = null;
    }

    public AtomicBoolean u() {
        return this.f26378k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f26380m;
    }

    public AtomicBoolean x() {
        return this.f26379l;
    }

    public JSONObject y() {
        j5 j5Var = this.f27549h;
        return j5Var != null ? (JSONObject) j5Var.a(new w.a() { // from class: com.applovin.impl.z8
            @Override // w.a
            public final Object apply(Object obj) {
                return a3.b((j5) obj);
            }
        }) : a("ad_values", new JSONObject());
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f26384q = maxAdWaterfallInfo;
    }

    public void a(long j10) {
        this.f26385r = j10;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectP = P();
        JsonUtils.putAll(jSONObjectP, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectP);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && !c(CampaignEx.JSON_KEY_CREATIVE_ID)) {
            c(CampaignEx.JSON_KEY_CREATIVE_ID, BundleUtils.getString(CampaignEx.JSON_KEY_CREATIVE_ID, bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i10 = BundleUtils.getInt("ad_width", bundle);
            int i11 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i10);
            c("ad_height", i11);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
