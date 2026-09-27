package com.unity3d.services.core.di;

import dr.i0;
import java.util.Map;
import ns.d;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface IServicesRegistry {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i10 & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, dVar);
        }
    }

    <T> T getService(@l String str, @l d<?> dVar);

    @l
    Map<ServiceKey, i0<?>> getServices();

    <T> T resolveService(@l ServiceKey serviceKey);

    @m
    <T> T resolveServiceOrNull(@l ServiceKey serviceKey);

    <T> void updateService(@l ServiceKey serviceKey, @l i0<? extends T> i0Var);
}
