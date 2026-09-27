package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C4485r4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class NetworkSettings {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f62754r = "customNetwork";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f62755s = "customNetworkPackage";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f62756t = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f62759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f62760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f62761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f62762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f62763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f62765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f62767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f62768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f62769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f62770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f62771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f62772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f62773q;

    public NetworkSettings(String str) {
        this.f62757a = str;
        this.f62767k = str;
        this.f62758b = str;
        this.f62772p = str;
        this.f62773q = str;
        this.f62760d = new JSONObject();
        this.f62761e = new JSONObject();
        this.f62762f = new JSONObject();
        this.f62763g = new JSONObject();
        this.f62759c = new JSONObject();
        this.f62768l = -1;
        this.f62769m = -1;
        this.f62770n = -1;
        this.f62771o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f62765i;
    }

    public JSONObject getApplicationSettings() {
        return this.f62759c;
    }

    public int getBannerPriority() {
        return this.f62770n;
    }

    public JSONObject getBannerSettings() {
        return this.f62762f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f62759c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.f62759c) != null) {
            return jSONObject5.optString(f62756t);
        }
        if (aVar.equals(IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.f62760d) != null) {
            return jSONObject4.optString(f62756t);
        }
        if (aVar.equals(IronSource.a.INTERSTITIAL) && (jSONObject3 = this.f62761e) != null) {
            return jSONObject3.optString(f62756t);
        }
        if (aVar.equals(IronSource.a.BANNER) && (jSONObject2 = this.f62762f) != null) {
            return jSONObject2.optString(f62756t);
        }
        if (!aVar.equals(IronSource.a.NATIVE_AD) || (jSONObject = this.f62763g) == null) {
            return null;
        }
        return jSONObject.optString(f62756t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f62759c;
        return jSONObject != null ? jSONObject.optString(f62755s, "") : "";
    }

    public int getInstanceType(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.f62769m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f62761e;
    }

    public int getMaxAdsPerSession(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("maxAdsPerSession", 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.f62771o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f62763g;
    }

    public String getProviderDefaultInstance() {
        return this.f62772p;
    }

    public String getProviderInstanceName() {
        return this.f62767k;
    }

    public String getProviderName() {
        return this.f62757a;
    }

    public String getProviderNetworkKey() {
        return this.f62773q;
    }

    public String getProviderTypeForReflection() {
        return this.f62758b;
    }

    public int getRewardedVideoPriority() {
        return this.f62768l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f62760d;
    }

    public String getSubProviderId() {
        return this.f62764h;
    }

    public boolean isBidder(IronSource.a aVar) {
        return !isCustomNetwork() && getInstanceType(aVar) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f62766j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f62765i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f62759c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f62770n = i10;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f62762f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f62769m = i10;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f62761e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f62766j = z10;
    }

    public void setNativeAdPriority(int i10) {
        this.f62771o = i10;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f62763g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.f62773q = str;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f62768l = i10;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f62760d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f62764h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f62759c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f62762f.put(str, obj);
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f62761e.put(str, obj);
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f62763g.put(str, obj);
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f62760d.put(str, obj);
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f62757a = str;
        this.f62767k = str;
        this.f62758b = str2;
        this.f62772p = str3;
        this.f62773q = str4;
        this.f62760d = jSONObject2;
        this.f62761e = jSONObject3;
        this.f62762f = jSONObject4;
        this.f62763g = jSONObject5;
        this.f62759c = jSONObject;
        this.f62768l = -1;
        this.f62769m = -1;
        this.f62770n = -1;
        this.f62771o = -1;
    }

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f62757a = networkSettings.getProviderName();
        this.f62767k = networkSettings.getProviderName();
        this.f62758b = networkSettings.getProviderTypeForReflection();
        this.f62760d = networkSettings.getRewardedVideoSettings();
        this.f62761e = networkSettings.getInterstitialSettings();
        this.f62762f = networkSettings.getBannerSettings();
        this.f62763g = networkSettings.getNativeAdSettings();
        this.f62759c = networkSettings.getApplicationSettings();
        this.f62768l = networkSettings.getRewardedVideoPriority();
        this.f62769m = networkSettings.getInterstitialPriority();
        this.f62770n = networkSettings.getBannerPriority();
        this.f62771o = networkSettings.getNativeAdPriority();
        this.f62772p = networkSettings.getProviderDefaultInstance();
        this.f62773q = networkSettings.getProviderNetworkKey();
    }
}
