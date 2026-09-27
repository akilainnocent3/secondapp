package com.unity3d.services.core.di;

import dr.w2;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ServicesRegistryKt {
    @l
    public static final ServicesRegistry registry(@l ds.l<? super ServicesRegistry, w2> registry) {
        m0.p(registry, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
