package com.inmobi.media;

import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3840mc {
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x014d  */
    public static C3865nc a(TimeoutConfigurations.MediationConfig mediationConfig, String placementType, String adTypes, String str) {
        TimeoutConfigurations.AdNonABConfig banner;
        TimeoutConfigurations.AdPreloadConfig banner2;
        TimeoutConfigurations.AdABConfig banner3;
        kotlin.jvm.internal.m0.p(mediationConfig, "mediationConfig");
        kotlin.jvm.internal.m0.p(placementType, "placementType");
        kotlin.jvm.internal.m0.p(adTypes, "adTypes");
        if (placementType.equals("AB")) {
            TimeoutConfigurations.ABConfig aBConfig = mediationConfig.getABConfig();
            int iHashCode = adTypes.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && adTypes.equals("audio")) {
                            banner3 = aBConfig.getAudio();
                        } else {
                            banner3 = aBConfig.getBanner();
                        }
                    } else if (adTypes.equals("int")) {
                        banner3 = aBConfig.getInterstitial();
                    } else {
                        banner3 = aBConfig.getBanner();
                    }
                } else if (adTypes.equals("native")) {
                    banner3 = aBConfig.getNative();
                } else {
                    banner3 = aBConfig.getBanner();
                }
            } else if (adTypes.equals("banner")) {
                banner3 = aBConfig.getBanner();
            } else {
                banner3 = aBConfig.getBanner();
            }
            return new C3865nc(a(str, banner3.getRetryInterval()), a(str, banner3.getMaxRetries()), a(str, banner3.getLoadTimeout()), (Integer) null, 24);
        }
        if (placementType.equals("Preload")) {
            TimeoutConfigurations.PreloadConfig preloadConfig = mediationConfig.getPreloadConfig();
            int iHashCode2 = adTypes.hashCode();
            if (iHashCode2 != -1396342996) {
                if (iHashCode2 != -1052618729) {
                    if (iHashCode2 != 104431) {
                        if (iHashCode2 == 93166550 && adTypes.equals("audio")) {
                            banner2 = preloadConfig.getAudio();
                        } else {
                            banner2 = preloadConfig.getBanner();
                        }
                    } else if (adTypes.equals("int")) {
                        banner2 = preloadConfig.getInterstitial();
                    } else {
                        banner2 = preloadConfig.getBanner();
                    }
                } else if (adTypes.equals("native")) {
                    banner2 = preloadConfig.getNative();
                } else {
                    banner2 = preloadConfig.getBanner();
                }
            } else if (adTypes.equals("banner")) {
                banner2 = preloadConfig.getBanner();
            } else {
                banner2 = preloadConfig.getBanner();
            }
            return new C3865nc(a(str, banner2.getRetryInterval()), a(str, banner2.getMaxRetries()), a(str, banner2.getLoadTimeout()), Integer.valueOf(a(str, banner2.getMuttTimeout())), Integer.valueOf(a(str, banner2.getPreloadTimeout())));
        }
        TimeoutConfigurations.NonABConfig nonABConfig = mediationConfig.getNonABConfig();
        int iHashCode3 = adTypes.hashCode();
        if (iHashCode3 != -1396342996) {
            if (iHashCode3 != -1052618729) {
                if (iHashCode3 != 104431) {
                    if (iHashCode3 == 93166550 && adTypes.equals("audio")) {
                        banner = nonABConfig.getAudio();
                    } else {
                        banner = nonABConfig.getBanner();
                    }
                } else if (adTypes.equals("int")) {
                    banner = nonABConfig.getInterstitial();
                } else {
                    banner = nonABConfig.getBanner();
                }
            } else if (adTypes.equals("native")) {
                banner = nonABConfig.getNative();
            } else {
                banner = nonABConfig.getBanner();
            }
        } else if (adTypes.equals("banner")) {
            banner = nonABConfig.getBanner();
        } else {
            banner = nonABConfig.getBanner();
        }
        return new C3865nc(a(str, banner.getRetryInterval()), a(str, banner.getMaxRetries()), a(str, banner.getLoadTimeout()), Integer.valueOf(a(str, banner.getMuttTimeout())), 16);
    }

    public static int a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.optInt("default", 0);
    }
}
