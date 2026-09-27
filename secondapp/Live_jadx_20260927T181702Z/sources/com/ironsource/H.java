package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final AbstractC4566w0 f59121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final NetworkSettings f59122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final dr.i0 f59123c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a<BaseAdAdapter<?, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ W0 f59124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f59125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W0 w10, H h10) {
            super(0);
            this.f59124a = w10;
            this.f59125b = h10;
        }

        @Override // ds.a
        @oy.m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f59124a.a(this.f59125b.e(), this.f59125b.a(), this.f59125b.d());
        }
    }

    public H(@oy.l W0 adTools, @oy.l AbstractC4566w0 adUnitData, @oy.l NetworkSettings providerSettings) {
        kotlin.jvm.internal.m0.p(adTools, "adTools");
        kotlin.jvm.internal.m0.p(adUnitData, "adUnitData");
        kotlin.jvm.internal.m0.p(providerSettings, "providerSettings");
        this.f59121a = adUnitData;
        this.f59122b = providerSettings;
        this.f59123c = dr.k0.b(new a(adTools, this));
    }

    @oy.l
    public final IronSource.a a() {
        return this.f59121a.b().a();
    }

    @oy.m
    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f59123c.getValue();
    }

    @oy.l
    public final String c() {
        String providerName = this.f59122b.getProviderName();
        kotlin.jvm.internal.m0.o(providerName, "providerSettings.providerName");
        return providerName;
    }

    @oy.l
    public final UUID d() {
        return this.f59121a.b().b();
    }

    @oy.l
    public final NetworkSettings e() {
        return this.f59122b;
    }
}
