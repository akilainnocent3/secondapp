package okhttp3.internal.connection;

import defpackage.gx0;
import defpackage.i08;
import defpackage.ib5;
import defpackage.tug;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 J/\u0010)\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0000¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0000¢\u0006\u0004\b+\u0010,J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "fastFallback", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/Request;", "request", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZZLokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;)V", "isCanceled", "()Z", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/ConnectPlan;", "planConnect$okhttp", "()Lokhttp3/internal/connection/ConnectPlan;", "planConnect", "planToReplace", "", "Lokhttp3/Route;", "routes", "Lokhttp3/internal/connection/ReusePlan;", "planReusePooledConnection$okhttp", "(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;", "planReusePooledConnection", "route", "planConnectToRoute$okhttp", "(Lokhttp3/Route;Ljava/util/List;)Lokhttp3/internal/connection/ConnectPlan;", "planConnectToRoute", "Lokhttp3/internal/connection/RealConnection;", "failedConnection", "hasNext", "(Lokhttp3/internal/connection/RealConnection;)Z", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "j", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "Lgx0;", "q", "Lgx0;", "getDeferredPlans", "()Lgx0;", "deferredPlans", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealRoutePlanner implements RoutePlanner {
    public final TaskRunner a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final Address address;
    public final RouteDatabase k;
    public final RealCall l;
    public final boolean m;
    public RouteSelector.Selection n;
    public RouteSelector o;
    public Route p;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final gx0<RoutePlanner.Plan> deferredPlans;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Address address, RouteDatabase routeDatabase, RealCall realCall, Request request) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        address.getClass();
        routeDatabase.getClass();
        realCall.getClass();
        request.getClass();
        this.a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.address = address;
        this.k = routeDatabase;
        this.l = realCall;
        this.m = !Intrinsics.g(request.method(), "GET");
        this.deferredPlans = new gx0<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectPlan planConnectToRoute$okhttp$default(RealRoutePlanner realRoutePlanner, Route route, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planConnectToRoute$okhttp(route, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReusePlan planReusePooledConnection$okhttp$default(RealRoutePlanner realRoutePlanner, ConnectPlan connectPlan, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            connectPlan = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planReusePooledConnection$okhttp(connectPlan, list);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public Address getAddress() {
        return this.address;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public gx0<RoutePlanner.Plan> getDeferredPlans() {
        return this.deferredPlans;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean hasNext(RealConnection failedConnection) {
        RouteSelector routeSelector;
        Route route;
        if (!getDeferredPlans().isEmpty() || this.p != null) {
            return true;
        }
        if (failedConnection != null) {
            synchronized (failedConnection) {
                route = null;
                if (failedConnection.getRouteFailureCount() == 0 && failedConnection.getNoNewExchanges() && _UtilJvmKt.canReuseConnectionFor(failedConnection.route().address().url(), getAddress().url())) {
                    route = failedConnection.route();
                }
            }
            if (route != null) {
                this.p = route;
                return true;
            }
        }
        RouteSelector.Selection selection = this.n;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.o) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean isCanceled() {
        return this.l.getG();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public RoutePlanner.Plan plan() throws IOException {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z;
        ReusePlan reusePlan;
        RealConnection connection = this.l.getCom.twilio.voice.EventGroupType.CONNECTION_EVENT_GROUP java.lang.String();
        if (connection == null) {
            reusePlan = null;
        } else {
            boolean zIsHealthy = connection.isHealthy(this.m);
            synchronized (connection) {
                try {
                    if (!zIsHealthy) {
                        z = !connection.getNoNewExchanges();
                        connection.setNoNewExchanges(true);
                        socketReleaseConnectionNoEvents$okhttp = this.l.releaseConnectionNoEvents$okhttp();
                    } else if (connection.getNoNewExchanges() || !sameHostAndPort(connection.route().address().url())) {
                        socketReleaseConnectionNoEvents$okhttp = this.l.releaseConnectionNoEvents$okhttp();
                        z = false;
                    } else {
                        z = false;
                        socketReleaseConnectionNoEvents$okhttp = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l.getCom.twilio.voice.EventGroupType.CONNECTION_EVENT_GROUP java.lang.String() == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.l.getEventListener().connectionReleased(this.l, connection);
                connection.getConnectionListener().connectionReleased(connection, this.l);
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    connection.getConnectionListener().connectionClosed(connection);
                } else if (z) {
                    connection.getConnectionListener().noNewExchanges(connection);
                }
                reusePlan = null;
            } else {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    ib5.a("Check failed.");
                    return null;
                }
                reusePlan = new ReusePlan(connection);
            }
        }
        if (reusePlan != null) {
            return reusePlan;
        }
        ReusePlan reusePlanPlanReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (reusePlanPlanReusePooledConnection$okhttp$default != null) {
            return reusePlanPlanReusePooledConnection$okhttp$default;
        }
        if (!getDeferredPlans().isEmpty()) {
            return getDeferredPlans().removeFirst();
        }
        ConnectPlan connectPlanPlanConnect$okhttp = planConnect$okhttp();
        ReusePlan reusePlanPlanReusePooledConnection$okhttp = planReusePooledConnection$okhttp(connectPlanPlanConnect$okhttp, connectPlanPlanConnect$okhttp.getRoutes$okhttp());
        return reusePlanPlanReusePooledConnection$okhttp != null ? reusePlanPlanReusePooledConnection$okhttp : connectPlanPlanConnect$okhttp;
    }

    public final ConnectPlan planConnect$okhttp() throws IOException {
        Route route = this.p;
        if (route != null) {
            this.p = null;
            return planConnectToRoute$okhttp$default(this, route, null, 2, null);
        }
        RouteSelector.Selection selection = this.n;
        if (selection != null && selection.hasNext()) {
            return planConnectToRoute$okhttp$default(this, selection.next(), null, 2, null);
        }
        RouteSelector routeSelector = this.o;
        if (routeSelector == null) {
            routeSelector = new RouteSelector(getAddress(), this.k, this.l, this.i);
            this.o = routeSelector;
        }
        if (!routeSelector.hasNext()) {
            i08.a("exhausted all routes");
            return null;
        }
        RouteSelector.Selection next = routeSelector.next();
        this.n = next;
        if (!isCanceled()) {
            return planConnectToRoute$okhttp(next.next(), next.getRoutes());
        }
        i08.a("Canceled");
        return null;
    }

    public final ConnectPlan planConnectToRoute$okhttp(Route route, List<Route> routes) throws UnknownServiceException {
        Route route2;
        route.getClass();
        if (route.address().sslSocketFactory() == null) {
            if (!route.address().connectionSpecs().contains(ConnectionSpec.CLEARTEXT)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strHost = route.address().url().host();
            if (!Platform.INSTANCE.get().isCleartextTrafficPermitted(strHost)) {
                throw new UnknownServiceException(tug.a("CLEARTEXT communication to ", strHost, " not permitted by network security policy"));
            }
        } else if (route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request requestAuthenticate = null;
        if (route.requiresTunnel()) {
            Request requestBuild = new Request.Builder().url(route.address().url()).method("CONNECT", null).header("Host", _UtilJvmKt.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", _UtilCommonKt.USER_AGENT).build();
            route2 = route;
            requestAuthenticate = route.address().proxyAuthenticator().authenticate(route2, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
            if (requestAuthenticate == null) {
                requestAuthenticate = requestBuild;
            }
        } else {
            route2 = route;
        }
        return new ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, route2, routes, 0, requestAuthenticate, -1, false);
    }

    public final ReusePlan planReusePooledConnection$okhttp(ConnectPlan planToReplace, List<Route> routes) {
        RealConnection realConnectionCallAcquirePooledConnection$okhttp = this.b.callAcquirePooledConnection$okhttp(this.m, getAddress(), this.l, routes, planToReplace != null && planToReplace.isReady());
        if (realConnectionCallAcquirePooledConnection$okhttp == null) {
            return null;
        }
        if (planToReplace != null) {
            this.p = planToReplace.getRoute();
            planToReplace.closeQuietly();
        }
        RealCall realCall = this.l;
        realCall.getEventListener().connectionAcquired(realCall, realConnectionCallAcquirePooledConnection$okhttp);
        realConnectionCallAcquirePooledConnection$okhttp.getConnectionListener().connectionAcquired(realConnectionCallAcquirePooledConnection$okhttp, realCall);
        return new ReusePlan(realConnectionCallAcquirePooledConnection$okhttp);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean sameHostAndPort(HttpUrl url) {
        url.getClass();
        HttpUrl httpUrlUrl = getAddress().url();
        return url.port() == httpUrlUrl.port() && Intrinsics.g(url.host(), httpUrlUrl.host());
    }
}
