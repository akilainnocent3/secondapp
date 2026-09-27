package com.vungle.ads.internal.platform;

import com.vungle.ads.internal.model.AdvertisingInfo;
import e2.e;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Platform {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private Companion() {
        }
    }

    @m
    AdvertisingInfo getAdvertisingInfo();

    @m
    String getAppSetId();

    @m
    Integer getAppSetIdScope();

    long getBuildTime();

    @l
    String getCarrierName();

    @m
    String getGPVersion();

    long getLastBootTime();

    long getOSInstallationTime();

    long getSDKInstallationTime();

    @m
    String getUserAgent();

    void getUserAgentLazy(@l e<String> eVar);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isProblematicMaliDevice();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
