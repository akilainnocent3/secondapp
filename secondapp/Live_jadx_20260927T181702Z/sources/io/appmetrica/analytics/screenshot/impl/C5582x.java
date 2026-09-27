package io.appmetrica.analytics.screenshot.impl;

import dr.v1;
import fr.m1;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5582x implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f99121a;

    public C5582x(@oy.l ClientContext clientContext) {
        this.f99121a = clientContext;
    }

    public final void a(@oy.l String str) {
        this.f99121a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(m1.k(v1.a("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
