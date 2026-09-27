package com.cleveradssolutions.adapters.exchange.rendering.mraid;

import ae.d;
import com.chartboost.sdk.privacy.model.COPPA;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static String a() {
        return "window.MRAID_ENV = {" + b("version", "3.0") + b("sdk", "prebid-mobile-sdk-rendering") + b("sdkVersion", d.f4848d) + b("appId", l.b()) + b("ifa", l.f()) + c("limitAdTracking", l.e(), ",") + c(COPPA.COPPA_STANDARD, l.d(), "") + "};";
    }

    public static String b(String str, String str2) {
        return String.format("%s: \"%s\"%s", str, str2, ",");
    }

    public static String c(String str, boolean z10, String str2) {
        return String.format("%s: %s%s", str, Boolean.valueOf(z10), str2);
    }
}
