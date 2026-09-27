package com.inmobi.media.core.config.models;

import android.webkit.URLUtil;
import androidx.annotation.Keep;
import com.android.billingclient.BuildConfig;
import fr.h0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.h1;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class SignalsConfig extends Config {

    @m
    private JSONObject ext;

    @l
    private IceConfig ice = new IceConfig();

    @l
    private UnifiedIdServiceConfig unifiedIdServiceConfig = new UnifiedIdServiceConfig();

    @l
    private NovatiqConfig novatiqConfig = new NovatiqConfig();

    @l
    private SessionConfig session = new SessionConfig();

    @l
    private PublisherConfig publisher = new PublisherConfig();

    @l
    private String kA = "wWFMAWbSEtvl5VxZbQGMK7";
    private int vAK = 1;
    private int lowMemoryFreq = 300;

    @l
    private BootTimeConfig bts = new BootTimeConfig();

    @l
    private Purchases purchases = new Purchases();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class BootTimeConfig {
        private final boolean enabled;
        private final int maxEntries = 3;
        private final int threshold = 120;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getThreshold() {
            return this.threshold;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z10) {
            this.cce = z10;
        }

        public final void setCof(int i10) {
            this.cof = i10;
        }

        public final void setVce(boolean z10) {
            this.vce = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class IceConfig {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        private CellIceConfig f56226c = new CellIceConfig();
        private boolean locationEnabled;
        private boolean sessionEnabled;

        public final int getCellOperatorFlag() {
            return this.f56226c.getCof();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.f56226c.getCce();
        }

        public final boolean isLocationEnabled() {
            return this.locationEnabled;
        }

        public final boolean isSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            return getCellOperatorFlag() >= 0;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.f56226c.getVce();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;

        @l
        private List<String> carrierNames = h0.J();

        @l
        private String beaconUrl = "https://spadsync.com/sync";

        @l
        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        @l
        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        public final boolean isNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }

        @h1(otherwise = 2)
        public final void setBeaconUrl(@l String str) {
            m0.p(str, "<set-?>");
            this.beaconUrl = str;
        }

        @h1(otherwise = 2)
        public final void setCarrierNames(@l List<String> list) {
            m0.p(list, "<set-?>");
            this.carrierNames = list;
        }

        @h1(otherwise = 2)
        public final void setNovatiqEnabled(boolean z10) {
            this.isNovatiqEnabled = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;

        @l
        private final Map<String, String> generalKeys = new LinkedHashMap();

        @l
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = 6000;

        @l
        private final AutoInputData auto = new AutoInputData();

        @l
        private final ObjInputData obj = new ObjInputData();

        @l
        private final DirectInputData direct = new DirectInputData();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Keep
        public static final class AutoInputData extends BaseInputData {

            @l
            private final Map<String, KeyData> allowedKeys = new LinkedHashMap();

            @l
            private final List<String> incompatibleSdkVer = h0.J();

            @l
            private final String topic = "";

            @l
            public final Map<String, KeyData> getAllowedKeys() {
                return this.allowedKeys;
            }

            @l
            public final List<String> getIncompatibleSdkVer() {
                return this.incompatibleSdkVer;
            }

            @l
            public final String getTopic() {
                return this.topic;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Keep
        public static class BaseInputData {
            private final boolean enabled;
            private final int expiry = 604800;
            private final int count = 5;
            private final int precision = 6;
            private final int strLen = 3;

            @l
            private final DepthData depth = new DepthData();

            public final int getCount() {
                return this.count;
            }

            @l
            public final DepthData getDepth() {
                return this.depth;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getExpiry() {
                return this.expiry;
            }

            public final int getPrecision() {
                return this.precision;
            }

            public final int getStrLen() {
                return this.strLen;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Keep
        public static final class DepthData {
            private final boolean enabled;

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Keep
        public static final class DirectInputData extends BaseInputData {

            @l
            private final Map<String, String> allowedKeys = new LinkedHashMap();

            @l
            public final Map<String, String> getAllowedKeys() {
                return this.allowedKeys;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Keep
        public static final class KeyData {

            @l
            private final String name = "";

            @l
            private final String type = "";

            @l
            public final String getName() {
                return this.name;
            }

            @l
            public final String getType() {
                return this.type;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Keep
        public static final class ObjInputData extends BaseInputData {

            @l
            private final Map<String, KeyData> allowedKeysAnd = new LinkedHashMap();

            @l
            public final Map<String, KeyData> getAllowedKeysAnd() {
                return this.allowedKeysAnd;
            }
        }

        @l
        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        @l
        public final AutoInputData getAuto() {
            return this.auto;
        }

        @l
        public final DirectInputData getDirect() {
            return this.direct;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        @l
        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        @l
        public final ObjInputData getObj() {
            return this.obj;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class Purchases {
        private boolean inapp;

        @l
        private List<String> versionList = h0.Q("7.0.0", "7.1.0", BuildConfig.VERSION_NAME);

        public final boolean getInapp() {
            return this.inapp;
        }

        @l
        public final List<String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z10) {
            this.inapp = z10;
        }

        public final void setVersionList(@l List<String> list) {
            m0.p(list, "<set-?>");
            this.versionList = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class SessionConfig {

        @l
        private List<Integer> control = h0.Q(0, 1, 2, 3, 4, 5, 6);

        @l
        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;

        @l
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        @l
        public final String getUrl() {
            return this.url;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setMaxRetries(int i10) {
            this.maxRetries = i10;
        }

        public final void setRetryInterval(int i10) {
            this.retryInterval = i10;
        }

        public final void setTimeout(int i10) {
            this.timeout = i10;
        }

        public final void setUrl(@l String str) {
            m0.p(str, "<set-?>");
            this.url = str;
        }
    }

    @l
    public final String getAK() {
        return this.kA;
    }

    public final int getAKV() {
        return this.vAK;
    }

    @l
    public final BootTimeConfig getBts() {
        return this.bts;
    }

    @m
    public final JSONObject getExt() {
        return this.ext;
    }

    @l
    public final IceConfig getIceConfig() {
        return this.ice;
    }

    public final int getLowMemoryFreq() {
        return this.lowMemoryFreq;
    }

    @l
    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    @l
    public final PublisherConfig getPublisherConfig() {
        return this.publisher;
    }

    @l
    public final Purchases getPurchases() {
        return this.purchases;
    }

    @l
    public final SessionConfig getSessionConfig() {
        return this.session;
    }

    @Override // com.inmobi.media.core.config.models.Config
    @l
    public String getType() {
        return "signals";
    }

    @l
    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setBts(@l BootTimeConfig bootTimeConfig) {
        m0.p(bootTimeConfig, "<set-?>");
        this.bts = bootTimeConfig;
    }

    public final void setLowMemoryFreq(int i10) {
        this.lowMemoryFreq = i10;
    }

    public final void setPurchases(@l Purchases purchases) {
        m0.p(purchases, "<set-?>");
        this.purchases = purchases;
    }
}
