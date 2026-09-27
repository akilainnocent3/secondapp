package io.appmetrica.analytics.billingv8.impl;

import dr.w2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f95200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f95201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f95202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f95200a = linkedHashMap;
        this.f95201b = map;
        this.f95202c = iVar;
    }

    @Override // ds.a
    public final Object invoke() {
        Map map = this.f95200a;
        Map map2 = this.f95201b;
        i iVar = this.f95202c;
        m.a(map, map2, iVar.f95206d, iVar.f95205c.getBillingInfoManager());
        return w2.f79517a;
    }
}
