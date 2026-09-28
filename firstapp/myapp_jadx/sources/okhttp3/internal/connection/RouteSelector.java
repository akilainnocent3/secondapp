package okhttp3.internal.connection;

import defpackage.lrh0;
import defpackage.m2g;
import defpackage.p48;
import defpackage.r2z;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RealCall;", "call", "", "fastFallback", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Z)V", "hasNext", "()Z", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "()Lokhttp3/internal/connection/RouteSelector$Selection;", "Companion", "Selection", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RouteSelector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Address a;
    public final RouteDatabase b;
    public final RealCall c;
    public final boolean d;
    public final List<? extends Proxy> e;
    public int f;
    public List<? extends InetSocketAddress> g;
    public final ArrayList h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "<init>", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            inetSocketAddress.getClass();
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                hostName.getClass();
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            hostAddress.getClass();
            return hostAddress;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "", "Lokhttp3/Route;", "routes", "<init>", "(Ljava/util/List;)V", "", "hasNext", "()Z", "next", "()Lokhttp3/Route;", "a", "Ljava/util/List;", "getRoutes", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Selection {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final List<Route> routes;
        public int b;

        public Selection(List<Route> list) {
            list.getClass();
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.b < this.routes.size();
        }

        public final Route next() {
            if (!hasNext()) {
                lrh0.a();
                return null;
            }
            int i = this.b;
            this.b = i + 1;
            return this.routes.get(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall realCall, boolean z) {
        List<? extends Proxy> listImmutableListOf;
        address.getClass();
        routeDatabase.getClass();
        realCall.getClass();
        this.a = address;
        this.b = routeDatabase;
        this.c = realCall;
        this.d = z;
        m2g m2gVar = m2g.a;
        this.e = m2gVar;
        this.g = m2gVar;
        this.h = new ArrayList();
        HttpUrl httpUrlUrl = address.url();
        Proxy proxy = address.proxy();
        realCall.getEventListener().proxySelectStart(realCall, httpUrlUrl);
        if (proxy != null) {
            listImmutableListOf = a.c(proxy);
        } else {
            URI uri = httpUrlUrl.uri();
            if (uri.getHost() == null) {
                listImmutableListOf = _UtilJvmKt.immutableListOf(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = address.proxySelector().select(uri);
                listImmutableListOf = (listSelect == null || listSelect.isEmpty()) ? _UtilJvmKt.immutableListOf(Proxy.NO_PROXY) : _UtilJvmKt.toImmutableList(listSelect);
            }
        }
        this.e = listImmutableListOf;
        this.f = 0;
        realCall.getEventListener().proxySelectEnd(realCall, httpUrlUrl, this.e);
    }

    public final boolean hasNext() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }

    public final Selection next() {
        ArrayList arrayList;
        String strHost;
        int iPort;
        List<InetAddress> listReorderForHappyEyeballs;
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            int i = this.f;
            List<? extends Proxy> list = this.e;
            int size = list.size();
            arrayList = this.h;
            if (i >= size) {
                break;
            }
            int i2 = this.f;
            int size2 = list.size();
            Address address = this.a;
            if (i2 >= size2) {
                throw new SocketException("No route to " + address.url().host() + "; exhausted proxy configurations: " + list);
            }
            int i3 = this.f;
            this.f = i3 + 1;
            Proxy proxy = list.get(i3);
            ArrayList arrayList3 = new ArrayList();
            this.g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strHost = address.url().host();
                iPort = address.url().port();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    r2z.a(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                    return null;
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strHost = INSTANCE.getSocketHost(inetSocketAddress);
                iPort = inetSocketAddress.getPort();
            }
            if (1 > iPort || iPort >= 65536) {
                throw new SocketException("No route to " + strHost + ':' + iPort + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(strHost, iPort));
            } else {
                if (_HostnamesCommonKt.canParseAsIpAddress(strHost)) {
                    listReorderForHappyEyeballs = a.c(InetAddress.getByName(strHost));
                } else {
                    RealCall realCall = this.c;
                    realCall.getEventListener().dnsStart(realCall, strHost);
                    List<InetAddress> listLookup = address.dns().lookup(strHost);
                    if (listLookup.isEmpty()) {
                        throw new UnknownHostException(address.dns() + " returned no addresses for " + strHost);
                    }
                    realCall.getEventListener().dnsEnd(realCall, strHost, listLookup);
                    listReorderForHappyEyeballs = listLookup;
                }
                if (this.d) {
                    listReorderForHappyEyeballs = InetAddressOrderKt.reorderForHappyEyeballs(listReorderForHappyEyeballs);
                }
                Iterator<InetAddress> it = listReorderForHappyEyeballs.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new InetSocketAddress(it.next(), iPort));
                }
            }
            Iterator<? extends InetSocketAddress> it2 = this.g.iterator();
            while (it2.hasNext()) {
                Route route = new Route(address, proxy, it2.next());
                if (this.b.shouldPostpone(route)) {
                    arrayList.add(route);
                } else {
                    arrayList2.add(route);
                }
            }
        } while (arrayList2.isEmpty());
        if (arrayList2.isEmpty()) {
            p48.w(arrayList, arrayList2);
            arrayList.clear();
        }
        return new Selection(arrayList2);
    }
}
