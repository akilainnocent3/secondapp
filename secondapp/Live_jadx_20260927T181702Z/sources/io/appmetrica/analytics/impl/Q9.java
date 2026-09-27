package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Q9 extends R9 {
    @Override // io.appmetrica.analytics.impl.R9
    public final S9 b(@NonNull FeatureInfo featureInfo) {
        return new S9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
