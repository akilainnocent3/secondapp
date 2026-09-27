package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class J0 implements AppMetricaPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0 f95965a;

    public J0(@oy.l L0 l10) {
        this.f95965a = l10;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@oy.l PluginErrorDetails pluginErrorDetails, @oy.m String str) {
        this.f95965a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(@oy.l PluginErrorDetails pluginErrorDetails) {
        this.f95965a.a(pluginErrorDetails);
    }

    public J0() {
        this(new L0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@oy.l String str, @oy.m String str2, @oy.m PluginErrorDetails pluginErrorDetails) {
        this.f95965a.a(str, str2, pluginErrorDetails);
    }
}
