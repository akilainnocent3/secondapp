package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5055fn extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5081gn f97392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5055fn(C5081gn c5081gn) {
        super(0);
        this.f97392a = c5081gn;
    }

    @Override // ds.a
    public final Object invoke() {
        HashMap map = new HashMap();
        C5081gn c5081gn = this.f97392a;
        String strA = c5081gn.f97466a.a();
        if (strA != null) {
        }
        String strA2 = c5081gn.f97467b.a();
        if (strA2 != null) {
            map.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, strA2);
        }
        return map;
    }
}
