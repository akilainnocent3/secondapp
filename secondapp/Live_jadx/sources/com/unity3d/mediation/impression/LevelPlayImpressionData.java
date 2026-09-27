package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nLevelPlayImpressionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPlayImpressionData.kt\ncom/unity3d/mediation/impression/LevelPlayImpressionData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public final class LevelPlayImpressionData {

    @l
    public static final a Companion = new a(null);

    @l
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";

    @l
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";

    @l
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";

    @l
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";

    @l
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";

    @l
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";

    @l
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";

    @l
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";

    @l
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";

    @l
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";

    @l
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";

    @l
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";

    @l
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";

    @l
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";

    @l
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final JSONObject f76312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final DecimalFormat f76313b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(@l JSONObject allData) {
        m0.p(allData, "allData");
        this.f76312a = allData;
        this.f76313b = new DecimalFormat("#.#####");
    }

    @m
    public final String getAb() {
        String it = this.f76312a.optString("ab", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getAdFormat() {
        String it = this.f76312a.optString("adFormat", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getAdNetwork() {
        String it = this.f76312a.optString("adNetwork", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @l
    public final JSONObject getAllData() {
        return this.f76312a;
    }

    @m
    public final String getAuctionId() {
        String it = this.f76312a.optString("auctionId", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getCountry() {
        String it = this.f76312a.optString("country", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getCreativeId() {
        String it = this.f76312a.optString("creativeId", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getEncryptedCPM() {
        String it = this.f76312a.optString("encryptedCPM", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getInstanceId() {
        String it = this.f76312a.optString("instanceId", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getInstanceName() {
        String it = this.f76312a.optString("instanceName", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getMediationAdUnitId() {
        String it = this.f76312a.optString("mediationAdUnitId", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getMediationAdUnitName() {
        String it = this.f76312a.optString("mediationAdUnitName", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getPlacement() {
        String it = this.f76312a.optString("placement", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final String getPrecision() {
        String it = this.f76312a.optString("precision", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @m
    public final Double getRevenue() {
        double dOptDouble = this.f76312a.optDouble("revenue");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Double.isNaN(dOptDouble)) {
            return null;
        }
        return dValueOf;
    }

    @m
    public final String getSegmentName() {
        String it = this.f76312a.optString("segmentName", "");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    @l
    public String toString() {
        LevelPlayImpressionData levelPlayImpressionData;
        String str;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab2 = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            str = null;
            levelPlayImpressionData = this;
        } else {
            levelPlayImpressionData = this;
            str = levelPlayImpressionData.f76313b.format(levelPlayImpressionData.getRevenue());
        }
        return "auctionId: '" + auctionId + "', mediationAdUnitName: '" + mediationAdUnitName + "', mediationAdUnitId: '" + mediationAdUnitId + "', adFormat: '" + adFormat + "', country: '" + country + "', ab: '" + ab2 + "', segmentName: '" + segmentName + "', placement: '" + placement + "', adNetwork: '" + adNetwork + "', instanceName: '" + instanceName + "', instanceId: '" + instanceId + "', revenue: " + str + ", precision: '" + levelPlayImpressionData.getPrecision() + "', encryptedCPM: '" + levelPlayImpressionData.getEncryptedCPM() + "', creativeId: '" + levelPlayImpressionData.getCreativeId() + "'";
    }
}
