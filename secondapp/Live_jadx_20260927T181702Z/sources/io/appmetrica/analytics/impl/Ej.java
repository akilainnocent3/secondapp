package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ej implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f95778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f95780c;

    public Ej(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f95778a = str;
        this.f95779b = str2;
        this.f95780c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.getPluginExtension().reportError(this.f95778a, this.f95779b, this.f95780c);
    }
}
