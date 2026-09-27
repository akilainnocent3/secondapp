package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface IModuleReporter {
    void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10);

    void reportEvent(@NonNull ModuleEvent moduleEvent);

    void sendEventsBuffer();

    void setSessionExtra(@NonNull String str, @Nullable byte[] bArr);
}
