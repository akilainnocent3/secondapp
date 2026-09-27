package com.cleveradssolutions.adapters;

import androidx.annotation.Keep;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AudienceNetworkSettings {
    public static void setDataProcessingOptions(String[] strArr) {
        AdInternalSettings.setDataProcessingOptions(strArr, null, null);
    }

    public static void setDataProcessingOptions(String[] strArr, int i10, int i11) {
        AdInternalSettings.setDataProcessingOptions(strArr, Integer.valueOf(i10), Integer.valueOf(i11));
    }
}
