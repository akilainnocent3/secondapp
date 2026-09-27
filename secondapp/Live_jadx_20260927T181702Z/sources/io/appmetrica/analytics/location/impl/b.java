package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f98746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f98747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f98748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f98749e = new d();

    public b(@oy.l Context context, @oy.l PermissionResolutionStrategy permissionResolutionStrategy, @oy.l LocationListener locationListener, @oy.l IHandlerExecutor iHandlerExecutor) {
        this.f98745a = context;
        this.f98746b = permissionResolutionStrategy;
        this.f98747c = locationListener;
        this.f98748d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f98746b.hasNecessaryPermissions(this.f98745a)) {
            try {
                d dVar = this.f98749e;
                Context context = this.f98745a;
                LocationListener locationListener = this.f98747c;
                IHandlerExecutor iHandlerExecutor = this.f98748d;
                dVar.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                        gplLibraryWrapper = new a();
                    }
                } else {
                    gplLibraryWrapper = new a();
                }
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
