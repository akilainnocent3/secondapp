package com.unity3d.mediation;

import com.ironsource.Bb;
import com.ironsource.C4414n2;
import com.ironsource.C4485r4;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import fr.n1;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import org.json.JSONObject;
import oy.l;
import oy.m;
import zu.k0;
import zu.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nLevelPlayAdInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlayAdInfo.kt\ncom/unity3d/mediation/LevelPlayAdInfo\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,145:1\n90#1,2:146\n90#1,2:148\n90#1,2:150\n90#1,2:152\n90#1,2:154\n90#1,2:156\n90#1,2:158\n90#1,2:160\n90#1,2:162\n90#1,2:164\n90#1,2:166\n90#1,2:168\n90#1,2:170\n37#2,2:172\n*S KotlinDebug\n*F\n+ 1 LevelPlayAdInfo.kt\ncom/unity3d/mediation/LevelPlayAdInfo\n*L\n40#1:146,2\n44#1:148,2\n50#1:150,2\n56#1:152,2\n59#1:154,2\n62#1:156,2\n65#1:158,2\n68#1:160,2\n71#1:162,2\n74#1:164,2\n81#1:166,2\n84#1:168,2\n95#1:170,2\n118#1:172,2\n*E\n"})
public final class LevelPlayAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final String f76274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private final String f76276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    private final C4414n2 f76277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m
    private final LevelPlayAdSize f76278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @m
    private final String f76279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    private final Map<String, Object> f76280g;

    public LevelPlayAdInfo(@l String adId, @l String adUnitId, @l String adFormat, @m C4414n2 c4414n2, @m LevelPlayAdSize levelPlayAdSize, @m String str, @l Map<String, ? extends Object> adapterData) {
        m0.p(adId, "adId");
        m0.p(adUnitId, "adUnitId");
        m0.p(adFormat, "adFormat");
        m0.p(adapterData, "adapterData");
        this.f76274a = adId;
        this.f76275b = adUnitId;
        this.f76276c = adFormat;
        this.f76277d = c4414n2;
        this.f76278e = levelPlayAdSize;
        this.f76279f = str;
        this.f76280g = adapterData;
    }

    private final String a() {
        return this.f76274a;
    }

    private final String b() {
        return this.f76275b;
    }

    private final String c() {
        return this.f76276c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C4414n2 c4414n2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = levelPlayAdInfo.f76274a;
        }
        if ((i10 & 2) != 0) {
            str2 = levelPlayAdInfo.f76275b;
        }
        if ((i10 & 4) != 0) {
            str3 = levelPlayAdInfo.f76276c;
        }
        if ((i10 & 8) != 0) {
            c4414n2 = levelPlayAdInfo.f76277d;
        }
        if ((i10 & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f76278e;
        }
        if ((i10 & 32) != 0) {
            str4 = levelPlayAdInfo.f76279f;
        }
        if ((i10 & 64) != 0) {
            map = levelPlayAdInfo.f76280g;
        }
        String str5 = str4;
        Map map2 = map;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, c4414n2, levelPlayAdSize2, str5, map2);
    }

    private final C4414n2 d() {
        return this.f76277d;
    }

    private final LevelPlayAdSize e() {
        return this.f76278e;
    }

    private final String f() {
        return this.f76279f;
    }

    private final Map<String, Object> g() {
        return this.f76280g;
    }

    @l
    public final LevelPlayAdInfo copy(@l String adId, @l String adUnitId, @l String adFormat, @m C4414n2 c4414n2, @m LevelPlayAdSize levelPlayAdSize, @m String str, @l Map<String, ? extends Object> adapterData) {
        m0.p(adId, "adId");
        m0.p(adUnitId, "adUnitId");
        m0.p(adFormat, "adFormat");
        m0.p(adapterData, "adapterData");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, c4414n2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return m0.g(this.f76274a, levelPlayAdInfo.f76274a) && m0.g(this.f76275b, levelPlayAdInfo.f76275b) && m0.g(this.f76276c, levelPlayAdInfo.f76276c) && m0.g(this.f76277d, levelPlayAdInfo.f76277d) && m0.g(this.f76278e, levelPlayAdInfo.f76278e) && m0.g(this.f76279f, levelPlayAdInfo.f76279f) && m0.g(this.f76280g, levelPlayAdInfo.f76280g);
    }

    @l
    public final String getAb() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("ab");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @l
    public final String getAdFormat() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("adFormat");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f76276c : str;
    }

    @l
    public final String getAdId() {
        return this.f76274a;
    }

    @l
    public final String getAdNetwork() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("adNetwork");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @m
    public final LevelPlayAdSize getAdSize() {
        return this.f76278e;
    }

    @l
    public final String getAdUnitId() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f76275b : str;
    }

    @l
    public final String getAdUnitName() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @l
    public final String getAuctionId() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("auctionId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @l
    public final String getCountry() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("country");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @l
    public final String getCreativeId() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("creativeId");
        if (!(objOpt instanceof String)) {
            objOpt = null;
        }
        String str = (String) objOpt;
        if (str != null) {
            return str;
        }
        Object obj = this.f76280g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    @l
    public final String getEncryptedCPM() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("encryptedCPM");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @l
    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("precision");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Double dValueOf = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : Double.valueOf(jSONObjectM.optDouble("revenue"));
        if (m0.c(dValueOf, Double.NaN) || dValueOf == null) {
            return 0.0d;
        }
        return dValueOf.doubleValue();
    }

    @l
    public final String getInstanceId() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("instanceId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @l
    public final String getInstanceName() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("instanceName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @l
    public final String getPlacementName() {
        String str = this.f76279f;
        return str == null ? "" : str;
    }

    @l
    public final String getPrecision() {
        Bb bbD;
        String strC;
        C4414n2 c4414n2 = this.f76277d;
        return (c4414n2 == null || (bbD = c4414n2.d()) == null || (strC = bbD.c()) == null) ? getImpressionPrecision$mediationsdk_release() : strC;
    }

    public final double getRevenue() {
        Bb bbD;
        C4414n2 c4414n2 = this.f76277d;
        return (c4414n2 == null || (bbD = c4414n2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : bbD.d();
    }

    @l
    public final String getSegmentName() {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        Object objOpt = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : jSONObjectM.opt("segmentName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int iHashCode = ((((this.f76274a.hashCode() * 31) + this.f76275b.hashCode()) * 31) + this.f76276c.hashCode()) * 31;
        C4414n2 c4414n2 = this.f76277d;
        int iHashCode2 = (iHashCode + (c4414n2 == null ? 0 : c4414n2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f76278e;
        int iHashCode3 = (iHashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f76279f;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f76280g.hashCode();
    }

    @l
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectM;
        try {
            C4414n2 c4414n2 = this.f76277d;
            if (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> itKeys = jSONObjectM.keys();
                m0.o(itKeys, "it.keys()");
                jSONObject = new JSONObject(jSONObjectM, (String[]) k0.I3(x.j(itKeys)).toArray(new String[0]));
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e10);
            C4485r4.d().a(e10);
            jSONObject = new JSONObject();
        }
        try {
            String placement = jSONObject.optString("placement");
            m0.o(placement, "placement");
            if (placement.length() > 0 && (str = this.f76279f) != null) {
                jSONObject.put("placement", cv.k0.z2(placement, d.f62467r, str, false, 4, null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e11) {
            IronLog.INTERNAL.error("failed to put impression values", e11);
            C4485r4.d().a(e11);
        }
        return jSONObject;
    }

    @l
    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f76278e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    private final /* synthetic */ <T> T a(String str) {
        JSONObject jSONObjectM;
        C4414n2 c4414n2 = this.f76277d;
        T t10 = (c4414n2 == null || (jSONObjectM = c4414n2.m()) == null) ? null : (T) jSONObjectM.opt(str);
        m0.y(2, "T");
        return t10;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C4414n2 c4414n2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, kotlin.jvm.internal.x xVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : c4414n2, (i10 & 16) != 0 ? null : levelPlayAdSize, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? n1.z() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(@l LevelPlayAdInfo adInfo, @m String str) {
        this(adInfo.f76274a, adInfo.f76275b, adInfo.f76276c, adInfo.f76277d, adInfo.f76278e, str, adInfo.f76280g);
        m0.p(adInfo, "adInfo");
    }
}
