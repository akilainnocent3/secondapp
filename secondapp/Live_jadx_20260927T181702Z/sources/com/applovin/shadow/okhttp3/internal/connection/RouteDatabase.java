package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Route;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class RouteDatabase {

    @l
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@l Route route) {
        m0.p(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(@l Route failedRoute) {
        m0.p(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean shouldPostpone(@l Route route) {
        m0.p(route, "route");
        return this.failedRoutes.contains(route);
    }
}
