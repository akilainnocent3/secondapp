package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97221a = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.0", "50145656");

    public final String a() {
        return this.f97221a;
    }
}
