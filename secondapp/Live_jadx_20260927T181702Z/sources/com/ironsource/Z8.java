package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Z8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f60446c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f60447d = "auctionId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final String f60448e = "adUnit";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final String f60449f = "adFormat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final String f60450g = "mediationAdUnitName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final String f60451h = "mediationAdUnitId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final String f60452i = "country";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final String f60453j = "ab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    public static final String f60454k = "segmentName";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.l
    public static final String f60455l = "placement";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.l
    public static final String f60456m = "adNetwork";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oy.l
    public static final String f60457n = "instanceName";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.l
    public static final String f60458o = "instanceId";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oy.l
    public static final String f60459p = "revenue";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    public static final String f60460q = "precision";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oy.l
    public static final String f60461r = "encryptedCPM";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oy.l
    public static final String f60462s = "creativeId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final LevelPlayAdInfo f60463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final DecimalFormat f60464b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    public Z8(@oy.l LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.m0.p(adInfo, "adInfo");
        this.f60463a = adInfo;
        this.f60464b = new DecimalFormat("#.#####");
    }

    @oy.l
    public final String a() {
        return this.f60463a.getAb();
    }

    @oy.l
    public final String b() {
        return this.f60463a.getAdFormat();
    }

    @oy.l
    public final String c() {
        return this.f60463a.getAdNetwork();
    }

    @oy.l
    public final JSONObject d() {
        return this.f60463a.impressionData$mediationsdk_release();
    }

    @oy.l
    public final String e() {
        return this.f60463a.getAuctionId();
    }

    @oy.l
    public final String f() {
        return this.f60463a.getCountry();
    }

    @oy.l
    public final String g() {
        return this.f60463a.getCreativeId();
    }

    @oy.l
    public final String h() {
        return this.f60463a.getEncryptedCPM();
    }

    @oy.l
    public final String i() {
        return this.f60463a.getInstanceId();
    }

    @oy.l
    public final String j() {
        return this.f60463a.getInstanceName();
    }

    @oy.l
    public final String k() {
        return this.f60463a.getAdUnitId();
    }

    @oy.l
    public final String l() {
        return this.f60463a.getAdUnitName();
    }

    @oy.l
    public final String m() {
        return this.f60463a.getPlacementName();
    }

    @oy.l
    public final String n() {
        return this.f60463a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.f60463a.getImpressionRevenue$mediationsdk_release();
    }

    @oy.l
    public final String p() {
        return this.f60463a.getSegmentName();
    }

    @oy.l
    public String toString() {
        String strE = e();
        String strL = l();
        String strK = k();
        String strB = b();
        String strF = f();
        String strA = a();
        String strP = p();
        String strM = m();
        String strC = c();
        String strJ = j();
        String strI = i();
        o();
        return "auctionId: '" + strE + "', mediationAdUnitName: '" + strL + "', mediationAdUnitId: '" + strK + "', adFormat: '" + strB + "', country: '" + strF + "', ab: '" + strA + "', segmentName: '" + strP + "', placement: '" + strM + "', adNetwork: '" + strC + "', instanceName: '" + strJ + "', instanceId: '" + strI + "', revenue: " + this.f60464b.format(o()) + ", precision: '" + n() + "', encryptedCPM: '" + h() + "', creativeId: '" + g() + "'";
    }
}
