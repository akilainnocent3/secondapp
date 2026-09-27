package com.unity3d.services.core.di;

import dr.i0;
import dr.k0;
import ds.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.m1;
import kotlin.jvm.internal.s1;
import ns.d;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nServicesRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServicesRegistry.kt\ncom/unity3d/services/core/di/ServicesRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class ServicesRegistry implements IServicesRegistry {

    @l
    private final ConcurrentHashMap<ServiceKey, i0<?>> _services = new ConcurrentHashMap<>();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        m0.p(named, "named");
        m0.p(instance, "instance");
        m0.y(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, m1.d(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        m0.p(named, "named");
        m0.y(4, "T");
        return servicesRegistry.resolveService(new ServiceKey(named, m1.d(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        m0.p(named, "named");
        m0.y(4, "T");
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(named, m1.d(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        m0.p(named, "named");
        m0.p(instance, "instance");
        m0.y(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, m1.d(Object.class));
        servicesRegistry.updateService(serviceKey, k0.b(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String named, a<? extends T> instance) {
        m0.p(named, "named");
        m0.p(instance, "instance");
        m0.y(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, m1.d(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        m0.p(named, "named");
        m0.y(4, "T");
        return (T) resolveService(new ServiceKey(named, m1.d(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        m0.p(named, "named");
        m0.y(4, "T");
        return (T) resolveServiceOrNull(new ServiceKey(named, m1.d(Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(@l String named, @l d<?> instance) {
        m0.p(named, "named");
        m0.p(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @l
    public Map<ServiceKey, i0<?>> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(@l ServiceKey key) {
        m0.p(key, "key");
        i0<?> i0Var = getServices().get(key);
        if (i0Var != null) {
            return (T) i0Var.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @m
    public <T> T resolveServiceOrNull(@l ServiceKey key) {
        m0.p(key, "key");
        i0<?> i0Var = getServices().get(key);
        if (i0Var == null) {
            return null;
        }
        return (T) i0Var.getValue();
    }

    public final /* synthetic */ <T> ServiceKey single(String named, a<? extends T> instance) {
        m0.p(named, "named");
        m0.p(instance, "instance");
        m0.y(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, m1.d(Object.class));
        updateService(serviceKey, k0.b(instance));
        return serviceKey;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(@l ServiceKey key, @l i0<? extends T> instance) {
        m0.p(key, "key");
        m0.p(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
            return;
        }
        throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
    }
}
