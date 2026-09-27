package com.inmobi.unification.sdk.model.initialization;

import androidx.annotation.Keep;
import com.inmobi.media.AbstractC3948qk;
import com.inmobi.media.C3972rk;
import com.inmobi.media.Xh;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import ds.p;
import java.io.Serializable;
import java.util.Iterator;
import k.h1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class TimeoutConfigurations implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;

    @l
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;

    @l
    public static final C3972rk Companion = new C3972rk();

    @l
    private static final String APPLOVIN_KEY = "c_applovin";

    @l
    private static final JSONObject defaultNonABBannerloadTimeout = AbstractC3948qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABBannerMuttTimeout = AbstractC3948qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABBannerMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABBannerRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABIntloadTimeout = AbstractC3948qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABIntMuttTimeout = AbstractC3948qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABIntMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABIntRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABNativeloadTimeout = AbstractC3948qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABNativeMuttTimeout = AbstractC3948qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABNativeMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABNativeRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABAudioloadTimeout = AbstractC3948qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABAudioMuttTimeout = AbstractC3948qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABAudioMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultNonABAudioRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABBannerloadTimeout = AbstractC3948qk.a(14500, 9500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABBannerMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABBannerRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABIntloadTimeout = AbstractC3948qk.a(29500, 29500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABIntMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABIntRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABNativeloadTimeout = AbstractC3948qk.a(14500, 14500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABNativeMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABNativeRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABAudioloadTimeout = AbstractC3948qk.a(14500, 9500, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABAudioMaxRetries = AbstractC3948qk.a(3, 3, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultABAudioRetryInterval = AbstractC3948qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @l
    private static final JSONObject defaultPreloadBannerPreloadTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadBannerMuttTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadBannerLoadTimeout = Xh.a("default", 14500);

    @l
    private static final JSONObject defaultPreloadBannerMaxRetries = Xh.a("default", 3);

    @l
    private static final JSONObject defaultPreloadBannerRetryInterval = Xh.a("default", 1000);

    @l
    private static final JSONObject defaultPreloadIntPreloadTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadIntMuttTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadIntloadTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadIntMaxRetries = Xh.a("default", 3);

    @l
    private static final JSONObject defaultPreloadIntRetryInterval = Xh.a("default", 1000);

    @l
    private static final JSONObject defaultPreloadNativePreloadTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadNativeMuttTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadNativeloadTimeout = Xh.a("default", 14500);

    @l
    private static final JSONObject defaultPreloadNativeMaxRetries = Xh.a("default", 3);

    @l
    private static final JSONObject defaultPreloadNativeRetryInterval = Xh.a("default", 1000);

    @l
    private static final JSONObject defaultPreloadAudioPreloadTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadAudioMuttTimeout = Xh.a("default", 29500);

    @l
    private static final JSONObject defaultPreloadAudioloadTimeout = Xh.a("default", 14500);

    @l
    private static final JSONObject defaultPreloadAudioMaxRetries = Xh.a("default", 3);

    @l
    private static final JSONObject defaultPreloadAudioRetryInterval = Xh.a("default", 1000);

    @l
    private static final p<JSONObject, Integer, Boolean> validator = new p() { // from class: nm.a
        @Override // ds.p
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
        }
    };
    private int step4s = 15000;

    @l
    private MediationConfig mediationConfig = new MediationConfig();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class ABConfig {

        @l
        private AdABConfig audio;

        @l
        private AdABConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @l
        private AdABConfig f4int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        @l
        private AdABConfig f5native;

        public ABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdABConfig(TimeoutConfigurations.defaultABBannerloadTimeout, TimeoutConfigurations.defaultABBannerRetryInterval, TimeoutConfigurations.defaultABBannerMaxRetries);
            this.f4int = new AdABConfig(TimeoutConfigurations.defaultABIntloadTimeout, TimeoutConfigurations.defaultABIntRetryInterval, TimeoutConfigurations.defaultABIntMaxRetries);
            this.f5native = new AdABConfig(TimeoutConfigurations.defaultABNativeloadTimeout, TimeoutConfigurations.defaultABNativeRetryInterval, TimeoutConfigurations.defaultABNativeMaxRetries);
            this.audio = new AdABConfig(TimeoutConfigurations.defaultABAudioloadTimeout, TimeoutConfigurations.defaultABAudioRetryInterval, TimeoutConfigurations.defaultABAudioMaxRetries);
        }

        @l
        public final AdABConfig getAudio() {
            return this.audio;
        }

        @l
        public final AdABConfig getBanner() {
            return this.banner;
        }

        @l
        public final AdABConfig getInterstitial() {
            return this.f4int;
        }

        @l
        public final AdABConfig getNative() {
            return this.f5native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f4int.isValid() && this.f5native.isValid() && this.audio.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class MediationConfig {

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        @l
        private ABConfig f58318ab = new ABConfig();

        @l
        private NonABConfig nonAb = new NonABConfig();

        @l
        private PreloadConfig preload = new PreloadConfig();

        @l
        public final ABConfig getABConfig() {
            return this.f58318ab;
        }

        @l
        public final NonABConfig getNonABConfig() {
            return this.nonAb;
        }

        @l
        public final PreloadConfig getPreloadConfig() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.f58318ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class NonABConfig {

        @l
        private AdNonABConfig audio;

        @l
        private AdNonABConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @l
        private AdNonABConfig f6int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        @l
        private AdNonABConfig f7native;

        public NonABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdNonABConfig(TimeoutConfigurations.defaultNonABBannerloadTimeout, TimeoutConfigurations.defaultNonABBannerMuttTimeout, TimeoutConfigurations.defaultNonABBannerRetryInterval, TimeoutConfigurations.defaultNonABBannerMaxRetries);
            this.f6int = new AdNonABConfig(TimeoutConfigurations.defaultNonABIntloadTimeout, TimeoutConfigurations.defaultNonABIntMuttTimeout, TimeoutConfigurations.defaultNonABIntRetryInterval, TimeoutConfigurations.defaultNonABIntMaxRetries);
            this.f7native = new AdNonABConfig(TimeoutConfigurations.defaultNonABNativeloadTimeout, TimeoutConfigurations.defaultNonABNativeMuttTimeout, TimeoutConfigurations.defaultNonABNativeRetryInterval, TimeoutConfigurations.defaultNonABNativeMaxRetries);
            this.audio = new AdNonABConfig(TimeoutConfigurations.defaultNonABAudioloadTimeout, TimeoutConfigurations.defaultNonABAudioMuttTimeout, TimeoutConfigurations.defaultNonABAudioRetryInterval, TimeoutConfigurations.defaultNonABAudioMaxRetries);
        }

        @l
        public final AdNonABConfig getAudio() {
            return this.audio;
        }

        @l
        public final AdNonABConfig getBanner() {
            return this.banner;
        }

        @l
        public final AdNonABConfig getInterstitial() {
            return this.f6int;
        }

        @l
        public final AdNonABConfig getNative() {
            return this.f7native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f6int.isValid() && this.f7native.isValid() && this.audio.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class PreloadConfig {

        @l
        private AdPreloadConfig audio;

        @l
        private AdPreloadConfig banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @l
        private AdPreloadConfig f8int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        @l
        private AdPreloadConfig f9native;

        public PreloadConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, TimeoutConfigurations.defaultPreloadBannerMuttTimeout, TimeoutConfigurations.defaultPreloadBannerLoadTimeout, TimeoutConfigurations.defaultPreloadBannerRetryInterval, TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.f8int = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadIntPreloadTimeout, TimeoutConfigurations.defaultPreloadIntMuttTimeout, TimeoutConfigurations.defaultPreloadIntloadTimeout, TimeoutConfigurations.defaultPreloadIntRetryInterval, TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.f9native = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadNativePreloadTimeout, TimeoutConfigurations.defaultPreloadNativeMuttTimeout, TimeoutConfigurations.defaultPreloadNativeloadTimeout, TimeoutConfigurations.defaultPreloadNativeRetryInterval, TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, TimeoutConfigurations.defaultPreloadAudioMuttTimeout, TimeoutConfigurations.defaultPreloadAudioloadTimeout, TimeoutConfigurations.defaultPreloadAudioRetryInterval, TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }

        @l
        public final AdPreloadConfig getAudio() {
            return this.audio;
        }

        @l
        public final AdPreloadConfig getBanner() {
            return this.banner;
        }

        @l
        public final AdPreloadConfig getInterstitial() {
            return this.f8int;
        }

        @l
        public final AdPreloadConfig getNative() {
            return this.f9native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.f8int.isValid() && this.f9native.isValid() && this.audio.isValid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class RenderTimeoutByType {

        @l
        public static final a Companion = new a();
        private int audio;
        private int banner;

        /* JADX INFO: renamed from: int, reason: not valid java name */
        private int f10int;

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private int f11native;

        public /* synthetic */ RenderTimeoutByType(x xVar) {
            this();
        }

        public final int getAudio$media_release() {
            return this.audio;
        }

        public final int getBanner$media_release() {
            return this.banner;
        }

        public final int getInt$media_release() {
            return this.f10int;
        }

        public final int getNative$media_release() {
            return this.f11native;
        }

        public final int getTimeoutByType$media_release(@l String adType, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            m0.p(adType, "adType");
            int iHashCode = adType.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && adType.equals("audio") && (i14 = this.audio) > 0) {
                            return i14;
                        }
                    } else if (adType.equals("int") && (i13 = this.f10int) > 0) {
                        return i13;
                    }
                } else if (adType.equals("native") && (i12 = this.f11native) > 0) {
                    return i12;
                }
            } else if (adType.equals("banner") && (i11 = this.banner) > 0) {
                return i11;
            }
            return i10;
        }

        public final void setAudio$media_release(int i10) {
            this.audio = i10;
        }

        public final void setBanner$media_release(int i10) {
            this.banner = i10;
        }

        public final void setInt$media_release(int i10) {
            this.f10int = i10;
        }

        public final void setNative$media_release(int i10) {
            this.f11native = i10;
        }

        @h1(otherwise = 5)
        public final void setTimeoutByType(@l String adType, int i10) {
            m0.p(adType, "adType");
            int iHashCode = adType.hashCode();
            if (iHashCode == -1396342996) {
                if (adType.equals("banner")) {
                    this.banner = i10;
                }
            } else if (iHashCode == -1052618729) {
                if (adType.equals("native")) {
                    this.f11native = i10;
                }
            } else if (iHashCode == 104431) {
                if (adType.equals("int")) {
                    this.f10int = i10;
                }
            } else if (iHashCode == 93166550 && adType.equals("audio")) {
                this.audio = i10;
            }
        }

        private RenderTimeoutByType() {
        }
    }

    public final MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = 15000;
        }
        this.step4s = i10;
    }

    public static final boolean a(JSONObject param, int i10) {
        m0.p(param, "param");
        Iterator<String> itKeys = param.keys();
        m0.o(itKeys, "keys(...)");
        boolean z10 = true;
        while (itKeys.hasNext()) {
            if (param.getInt(itKeys.next()) < i10) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class AdABConfig {

        @l
        private JSONObject loadRetryInterval;

        @l
        private JSONObject loadTimeout;

        @l
        private JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        @l
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @l
        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        @l
        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(@l JSONObject loadTimeout, @l JSONObject retryInterval, @l JSONObject maxRetries) {
            this();
            m0.p(loadTimeout, "loadTimeout");
            m0.p(retryInterval, "retryInterval");
            m0.p(maxRetries, "maxRetries");
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class AdNonABConfig {

        @l
        private JSONObject loadRetryInterval;

        @l
        private JSONObject loadTimeout;

        @l
        private JSONObject maxLoadRetries;

        @l
        private JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        @l
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @l
        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        @l
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @l
        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.muttTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(@l JSONObject loadTimeout, @l JSONObject muttTimeout, @l JSONObject retryInterval, @l JSONObject maxRetries) {
            this();
            m0.p(loadTimeout, "loadTimeout");
            m0.p(muttTimeout, "muttTimeout");
            m0.p(retryInterval, "retryInterval");
            m0.p(maxRetries, "maxRetries");
            this.loadTimeout = loadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public static final class AdPreloadConfig {

        @l
        private JSONObject loadRetryInterval;

        @l
        private JSONObject loadTimeout;

        @l
        private JSONObject maxLoadRetries;

        @l
        private JSONObject muttTimeout;

        @l
        private JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        @l
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @l
        public final JSONObject getMaxRetries() {
            return this.maxLoadRetries;
        }

        @l
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @l
        public final JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        @l
        public final JSONObject getRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(@l JSONObject preloadTimeout, @l JSONObject muttTimeout, @l JSONObject loadTimeout, @l JSONObject retryInterval, @l JSONObject maxRetries) {
            this();
            m0.p(preloadTimeout, "preloadTimeout");
            m0.p(muttTimeout, "muttTimeout");
            m0.p(loadTimeout, "loadTimeout");
            m0.p(retryInterval, "retryInterval");
            m0.p(maxRetries, "maxRetries");
            this.preloadTimeout = preloadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }
}
