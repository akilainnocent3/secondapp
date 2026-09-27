package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class N9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wm f96209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X2 f96210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f96211d;

    public N9(Context context, Wm wm2, X2 x10, SafePackageManager safePackageManager) {
        this.f96208a = context;
        this.f96209b = wm2;
        this.f96210c = x10;
        this.f96211d = safePackageManager;
    }

    public N9(Context context) {
        this(context, new Wm(context, "io.appmetrica.analytics.build_id"), new X2(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
