package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface Qc extends InterfaceC5300pd {
    @oy.l
    List<ModuleServicesDatabase> b();

    @oy.l
    /* synthetic */ Map c();

    @oy.l
    /* synthetic */ Map d();

    @oy.l
    List<Consumer<Location>> e();

    @oy.m
    ModuleLocationSourcesServiceController f();

    @oy.m
    Toggle g();

    @oy.l
    /* synthetic */ List h();
}
