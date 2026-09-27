package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class NativeCrashClientModule {
    public abstract void initHandling(@l Context context, @l NativeCrashClientConfig nativeCrashClientConfig);

    public abstract void updateAppMetricaMetadata(@l String str);
}
