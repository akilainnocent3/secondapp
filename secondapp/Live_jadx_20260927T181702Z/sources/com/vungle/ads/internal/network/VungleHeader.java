package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VungleHeader {

    @l
    public static final VungleHeader INSTANCE;

    @m
    private static String appId;

    @m
    private static String appVersion;

    @l
    private static String headerUa;

    static {
        VungleHeader vungleHeader = new VungleHeader();
        INSTANCE = vungleHeader;
        headerUa = vungleHeader.defaultHeader();
    }

    private VungleHeader() {
    }

    private final String defaultHeader() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m0.g("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb2.append(BuildConfig.VERSION_NAME);
        return sb2.toString();
    }

    @m
    public final String getAppId() {
        return appId;
    }

    @m
    public final String getAppVersion() {
        return appVersion;
    }

    @l
    public final String getHeaderUa() {
        return headerUa;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }

    public final void setAppId(@m String str) {
        appId = str;
    }

    public final void setAppVersion(@m String str) {
        appVersion = str;
    }

    public final void setHeaderUa(@l String str) {
        m0.p(str, "<set-?>");
        headerUa = str;
    }
}
