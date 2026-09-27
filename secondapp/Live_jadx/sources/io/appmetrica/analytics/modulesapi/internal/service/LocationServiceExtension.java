package io.appmetrica.analytics.modulesapi.internal.service;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class LocationServiceExtension {
    @m
    public abstract Consumer<Location> getLocationConsumer();

    @m
    public abstract Toggle getLocationControllerAppStateToggle();

    @m
    public abstract ModuleLocationSourcesServiceController getLocationSourcesController();
}
