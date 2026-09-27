package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocationFilter f98788a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Location f98791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f98792e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f98790c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f98789b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f98788a = locationFilter;
    }
}
