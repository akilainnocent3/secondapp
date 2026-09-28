package com.sporty.android.core.model.appupdate;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionAutoUpdateConfig;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN_NETWORK", "ENABLED_MOBILE_NETWORK", "ENABLED_WIFI_NETWORK", "DISABLED_MOBILE_NETWORK", "DISABLED_WIFI_NETWORK", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum VersionAutoUpdateConfig {
    UNKNOWN_NETWORK,
    ENABLED_MOBILE_NETWORK,
    ENABLED_WIFI_NETWORK,
    DISABLED_MOBILE_NETWORK,
    DISABLED_WIFI_NETWORK;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<VersionAutoUpdateConfig> getEntries() {
        return $ENTRIES;
    }
}
