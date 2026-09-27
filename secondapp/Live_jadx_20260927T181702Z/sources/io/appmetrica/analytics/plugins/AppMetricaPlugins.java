package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface AppMetricaPlugins {
    void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str);

    void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails);
}
