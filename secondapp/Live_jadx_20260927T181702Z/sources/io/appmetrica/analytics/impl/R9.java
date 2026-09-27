package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class R9 {
    public final S9 a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i10 = featureInfo.reqGlEsVersion;
        if (i10 == 0) {
            return b(featureInfo);
        }
        return new S9("openGlFeature", i10, (featureInfo.flags & 1) != 0);
    }

    public abstract S9 b(FeatureInfo featureInfo);
}
