package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4474q9;
import com.ironsource.C4560vb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import cs.o;
import java.util.List;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlay {

    @l
    public static final LevelPlay INSTANCE = new LevelPlay();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        private final String f76270a;

        AdFormat(String str) {
            this.f76270a = str;
        }

        @l
        public final String getValue() {
            return this.f76270a;
        }
    }

    private LevelPlay() {
    }

    @o
    public static final void addImpressionDataListener(@l LevelPlayImpressionDataListener listener) {
        m0.p(listener, "listener");
        IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        C4560vb.f64312a.a(listener);
    }

    @l
    @o
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.2.0";
    }

    @o
    public static final void init(@l Context context, @l LevelPlayInitRequest initRequest, @l LevelPlayInitListener listener) {
        m0.p(context, "context");
        m0.p(initRequest, "initRequest");
        m0.p(listener, "listener");
        C4560vb.f64312a.a(context, initRequest, listener);
    }

    @o
    public static final void launchTestSuite(@l Context context) {
        m0.p(context, "context");
        IronLog.API.info("");
        r.m().c(context);
    }

    @o
    public static final void removeImpressionDataListener(@l LevelPlayImpressionDataListener listener) {
        m0.p(listener, "listener");
        IronLog.API.info("removing listener: " + listener.getClass().getSimpleName());
        C4560vb.f64312a.b(listener);
    }

    @o
    public static final void setAdaptersDebug(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    @o
    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    @o
    public static final boolean setDynamicUserId(@l String dynamicUserId) {
        m0.p(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return r.m().b(dynamicUserId);
    }

    @o
    public static final void setMetaData(@l String key, @l String value) {
        m0.p(key, "key");
        m0.p(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        C4560vb.f64312a.a(key, value);
    }

    @o
    public static final void setNetworkData(@l String networkKey, @l JSONObject networkData) {
        m0.p(networkKey, "networkKey");
        m0.p(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        r.m().b(networkKey, networkData);
    }

    @o
    public static final void setSegment(@l LevelPlaySegment segment) {
        m0.p(segment, "segment");
        IronLog.API.info("");
        C4560vb.f64312a.b(segment);
    }

    @o
    public static final void validateIntegration(@l Context context) {
        m0.p(context, "context");
        IronLog.API.info("");
        C4474q9.f63404a.a(context);
    }

    @o
    public static final void setMetaData(@l String key, @l List<String> values) {
        m0.p(key, "key");
        m0.p(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        C4560vb.f64312a.a(key, values);
    }
}
