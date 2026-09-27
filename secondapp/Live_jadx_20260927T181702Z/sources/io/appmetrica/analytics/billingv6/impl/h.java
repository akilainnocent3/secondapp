package io.appmetrica.analytics.billingv6.impl;

import dr.w2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f95147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f95148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f95149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f95147a = linkedHashMap;
        this.f95148b = map;
        this.f95149c = iVar;
    }

    @Override // ds.a
    public final Object invoke() {
        Map map = this.f95147a;
        Map map2 = this.f95148b;
        i iVar = this.f95149c;
        m.a(map, map2, iVar.f95153d, iVar.f95152c.getBillingInfoManager());
        return w2.f79517a;
    }
}
