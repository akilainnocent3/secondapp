package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f98798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98799c;

    public v(@oy.l String str, @oy.l s sVar, @oy.l String str2) {
        this.f98797a = str;
        this.f98798b = sVar;
        this.f98799c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(@oy.l Context context, @oy.l PermissionExtractor permissionExtractor, @oy.l IHandlerExecutor iHandlerExecutor, @oy.l LocationListener locationListener) {
        return new u(context, this.f98798b.a(permissionExtractor), locationListener, this.f98797a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @oy.l
    public final String getIdentifier() {
        return this.f98799c;
    }
}
