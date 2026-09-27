package com.ironsource.adapters.inmobi;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adapters.inmobi.InMobiAdapter;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.unity3d.mediation.LevelPlay;
import cs.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import org.json.JSONException;
import org.json.JSONObject;
import oy.l;
import oy.m;
import sr.a;
import sr.c;
import wc.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class InMobiAdapter extends AbstractAdapter implements INetworkInitCallbackListener {

    /* JADX INFO: renamed from: zv, reason: collision with root package name */
    private static String f60851zv;

    /* JADX INFO: renamed from: zw, reason: collision with root package name */
    private static Boolean f60852zw;

    /* JADX INFO: renamed from: zx, reason: collision with root package name */
    private static Boolean f60853zx;
    public static final zz zz = new zz(null);

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private static AtomicBoolean f60847zr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private static AtomicBoolean f60848zs = new AtomicBoolean(false);

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private static zr f60849zt = zr.INIT_STATE_NONE;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private static final HashSet f60850zu = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum zr {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_ERROR;


        /* JADX INFO: renamed from: zv, reason: collision with root package name */
        private static final /* synthetic */ a f60858zv = c.c(zz());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class zz {
        private zz() {
        }

        public final Boolean zr() {
            return InMobiAdapter.f60852zw;
        }

        public final HashSet zs() {
            return InMobiAdapter.f60850zu;
        }

        public final zr zt() {
            return InMobiAdapter.f60849zt;
        }

        public final void zz(zr zrVar) {
            m0.p(zrVar, "<set-?>");
            InMobiAdapter.f60849zt = zrVar;
        }

        public /* synthetic */ zz(x xVar) {
            this();
        }

        public final InMobiAdapter zz(String providerName) {
            m0.p(providerName, "providerName");
            return new InMobiAdapter(providerName);
        }

        public final IntegrationData zz(Context context) {
            m0.p(context, "context");
            return new IntegrationData(d.f142723h, "5.3.0");
        }

        public final String zz() {
            return InMobiSdk.getVersion();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAdapter(@l String providerName) {
        super(providerName);
        m0.p(providerName, "providerName");
        setRewardedVideoAdapter(new com.ironsource.adapters.inmobi.rewardedvideo.zr(this));
        setInterstitialAdapter(new com.ironsource.adapters.inmobi.interstitial.zz(this));
        setBannerAdapter(new com.ironsource.adapters.inmobi.banner.zr(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @l
    @o
    public static final String getAdapterSDKVersion() {
        return zz.zz();
    }

    @l
    @o
    public static final IntegrationData getIntegrationData(@l Context context) {
        return zz.zz(context);
    }

    @l
    @o
    public static final InMobiAdapter startAdapter(@l String str) {
        return zz.zz(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zz(Context context, String str, InMobiAdapter inMobiAdapter, com.ironsource.adapters.inmobi.zz zzVar) {
        InMobiSdk.init(context, str, inMobiAdapter.zz(), zzVar);
    }

    @m
    public final Map<String, Object> getBiddingData() {
        if (f60849zt != zr.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.verbose("returning null as token since init did not finish");
            return null;
        }
        String str = "";
        String token = InMobiSdk.getToken(getExtrasMap(), "");
        if (token != null && token.length() != 0) {
            str = token;
        }
        IronLog.ADAPTER_API.verbose("token = " + str);
        HashMap map = new HashMap();
        map.put("token", str);
        return map;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @l
    public String getCoreSDKVersion() {
        return zz.zz();
    }

    @l
    public final Map<String, String> getExtrasMap() {
        HashMap map = new HashMap();
        map.put("tp", "c_supersonic");
        map.put("tp-ver", getVersion());
        Boolean bool = f60853zx;
        if (bool != null) {
            map.put(com.ironsource.mediationsdk.metadata.a.f62740a, bool.booleanValue() ? "1" : "0");
        }
        return map;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @l
    public String getVersion() {
        return "5.3.0";
    }

    public final void initSDK(@l final Context context, @l final String accountId) {
        m0.p(context, "context");
        m0.p(accountId, "accountId");
        if (f60849zt == zr.INIT_STATE_NONE || f60849zt == zr.INIT_STATE_IN_PROGRESS) {
            f60850zu.add(this);
        }
        if (f60847zr.compareAndSet(false, true)) {
            IronLog.ADAPTER_API.verbose("accountId = " + accountId);
            f60849zt = zr.INIT_STATE_IN_PROGRESS;
            InMobiSdk.setLogLevel(isAdaptersDebugEnabled() ? InMobiSdk.LogLevel.DEBUG : InMobiSdk.LogLevel.NONE);
            final com.ironsource.adapters.inmobi.zz zzVar = new com.ironsource.adapters.inmobi.zz();
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: qm.a
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiAdapter.zz(context, accountId, this, zzVar);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@l LevelPlay.AdFormat adFormat) {
        m0.p(adFormat, "adFormat");
        return false;
    }

    public final void setAgeRestricted(boolean z10) {
        if (f60849zt != zr.INIT_STATE_SUCCESS) {
            f60852zw = Boolean.valueOf(z10);
            return;
        }
        IronLog.ADAPTER_API.verbose("isAgeRestricted = " + z10);
        InMobiSdk.setIsAgeRestricted(z10);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        f60851zv = String.valueOf(z10);
        if (f60849zt == zr.INIT_STATE_SUCCESS) {
            IronLog.ADAPTER_API.verbose(getProviderName() + " consent = " + z10);
            InMobiSdk.updateGDPRConsent(zz());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(@l String key, @l List<String> values) {
        m0.p(key, "key");
        m0.p(values, "values");
        if (values.isEmpty()) {
            return;
        }
        String str = values.get(0);
        IronLog.ADAPTER_API.verbose("key = " + key + ", value = " + str);
        if (MetaDataUtils.isValidCCPAMetaData(key, str)) {
            f60853zx = Boolean.valueOf(MetaDataUtils.getMetaDataBooleanValue(str));
            return;
        }
        String valueForType = MetaDataUtils.formatValueForType(str, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(key, "inMobi_AgeRestricted", valueForType) || MetaDataUtils.isValidMetaData(key, "LevelPlay_Child_Directed", valueForType)) {
            setAgeRestricted(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }

    public final boolean shouldSetAgeRestrictedOnInitSuccess() {
        return f60848zs.compareAndSet(false, true) && f60852zw != null;
    }

    private final JSONObject zz() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = f60851zv;
            if (str != null && str.length() != 0) {
                jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, f60851zv);
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e10) {
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
