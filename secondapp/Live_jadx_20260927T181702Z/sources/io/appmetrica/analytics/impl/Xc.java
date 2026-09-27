package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Xc implements ModuleEventServiceHandlerContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f96733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModulePreferences f96734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModuleEventServiceHandlerReporter f96735c;

    public Xc(@oy.l ModulePreferences modulePreferences, @oy.l ModulePreferences modulePreferences2, @oy.l ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f96733a = modulePreferences;
        this.f96734b = modulePreferences2;
        this.f96735c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @oy.l
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f96735c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @oy.l
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f96734b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @oy.l
    public final ModulePreferences getModulePreferences() {
        return this.f96733a;
    }
}
