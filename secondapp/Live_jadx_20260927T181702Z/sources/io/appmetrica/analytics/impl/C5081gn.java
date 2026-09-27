package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5081gn implements InterfaceC5385t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5435v f97467b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5410u f97466a = new C5410u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dr.i0 f97468c = dr.k0.b(new C5055fn(this));

    public C5081gn(@oy.l Context context) {
        this.f97467b = new C5435v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5385t
    @oy.l
    public final Map<String, String> a(@oy.l Map<String, String> map) {
        map.putAll((Map) this.f97468c.getValue());
        return map;
    }
}
