package okhttp3.internal.connection;

import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import defpackage.ddk0;
import defpackage.lb5;
import defpackage.sxf0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0085\u0001B[\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010 \u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\r\u0010!\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\u001cJ'\u0010)\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$H\u0000¢\u0006\u0004\b'\u0010(J\u001f\u00101\u001a\u00020.2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00103\u001a\u00020\u001aH\u0000¢\u0006\u0004\b2\u0010\u001cJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u00104J\u000f\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u0010\u001cJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u00106J\u0015\u00108\u001a\u00020&2\u0006\u00107\u001a\u00020&¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010DJ'\u0010J\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*2\u0006\u0010E\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0000¢\u0006\u0004\bH\u0010IJ!\u0010N\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u00104R\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\"\u0010\u001b\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010o\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010s\u001a\u00020\u00142\u0006\u0010p\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bq\u0010j\u001a\u0004\br\u0010lR#\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0u0t8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020&8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010f¨\u0006\u0086\u0001"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "rawSocket", "javaNetSocket", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Protocol;", EventKeys.PROTOCOL, "Lokhttp3/internal/connection/BufferedSocket;", "socket", "", "pingIntervalMillis", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/Handshake;Lokhttp3/Protocol;Lokhttp3/internal/connection/BufferedSocket;ILokhttp3/internal/connection/ConnectionListener;)V", "", "noNewExchanges", "()V", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "start", "Lokhttp3/Address;", "address", "", "routes", "", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "useAsSocket$okhttp", "useAsSocket", "()Lokhttp3/Route;", "cancel", "()Ljava/net/Socket;", "doExtensiveChecks", "isHealthy", "(Z)Z", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", EventGroupType.CONNECTION_EVENT_GROUP, "Lokhttp3/internal/http2/Settings;", EventGroupType.SETTINGS_GROUP, "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "()Lokhttp3/Handshake;", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "call", "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "()Lokhttp3/Protocol;", "", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner", "()Lokhttp3/internal/concurrent/TaskRunner;", "b", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "c", "Lokhttp3/Route;", "getRoute", "y", "Lokhttp3/internal/connection/ConnectionListener;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "A", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "C", "I", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "value", "F", "getAllocationLimit$okhttp", "allocationLimit", "", "Ljava/lang/ref/Reference;", "G", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "calls", "", "H", "J", "getIdleAtNs", "()J", "setIdleAtNs", "(J)V", "idleAtNs", "isMultiplexed$okhttp", "isMultiplexed", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean noNewExchanges;
    public boolean B;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int routeFailureCount;
    public int D;
    public int E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int allocationLimit;
    public final ArrayList G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public long idleAtNs;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final TaskRunner taskRunner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final RealConnectionPool connectionPool;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Route route;
    public final Socket d;
    public final Socket e;
    public final Handshake f;
    public final Protocol i;
    public final BufferedSocket v;
    public final int w;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final ConnectionListener connectionListener;
    public Http2Connection z;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RealConnection newTestConnection(TaskRunner taskRunner, RealConnectionPool connectionPool, Route route, Socket socket, long idleAtNs) {
            taskRunner.getClass();
            connectionPool.getClass();
            route.getClass();
            socket.getClass();
            RealConnection realConnection = new RealConnection(taskRunner, connectionPool, route, new Socket(), socket, null, Protocol.HTTP_2, new BufferedSocket() { // from class: okhttp3.internal.connection.RealConnection$Companion$newTestConnection$bufferedSocket$1

                /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                public final lb5 sink = new lb5();

                /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                public final lb5 source = new lb5();

                @Override // okhttp3.internal.connection.BufferedSocket, defpackage.fja0
                public void cancel() {
                }

                @Override // okhttp3.internal.connection.BufferedSocket, defpackage.fja0
                public lb5 getSink() {
                    return this.sink;
                }

                @Override // okhttp3.internal.connection.BufferedSocket, defpackage.fja0
                public lb5 getSource() {
                    return this.source;
                }
            }, 0, ConnectionListener.INSTANCE.getNONE());
            realConnection.setIdleAtNs(idleAtNs);
            return realConnection;
        }

        private Companion() {
        }
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool realConnectionPool, Route route, Socket socket, Socket socket2, Handshake handshake, Protocol protocol, BufferedSocket bufferedSocket, int i, ConnectionListener connectionListener) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        bufferedSocket.getClass();
        connectionListener.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.d = socket;
        this.e = socket2;
        this.f = handshake;
        this.i = protocol;
        this.v = bufferedSocket;
        this.w = i;
        this.connectionListener = connectionListener;
        this.allocationLimit = 1;
        this.G = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: cancel */
    public void mo249cancel() {
        _UtilJvmKt.closeQuietly(this.d);
    }

    public final void connectFailed$okhttp(OkHttpClient client, Route failedRoute, IOException failure) {
        client.getClass();
        failedRoute.getClass();
        failure.getClass();
        if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    /* JADX INFO: renamed from: getAllocationLimit$okhttp, reason: from getter */
    public final int getAllocationLimit() {
        return this.allocationLimit;
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.G;
    }

    /* JADX INFO: renamed from: getConnectionListener$okhttp, reason: from getter */
    public final ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        return this.route;
    }

    /* JADX INFO: renamed from: getRouteFailureCount$okhttp, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: handshake, reason: from getter */
    public Handshake getF() {
        return this.f;
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            this.D++;
        }
    }

    public final boolean isEligible$okhttp(Address address, List<Route> routes) {
        Handshake handshake;
        address.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return false;
        }
        if (this.G.size() < this.allocationLimit && !this.noNewExchanges && getRoute().address().equalsNonHost$okhttp(address)) {
            if (Intrinsics.g(address.url().host(), route().address().url().host())) {
                return true;
            }
            if (this.z != null && routes != null && !routes.isEmpty()) {
                for (Route route : routes) {
                    Proxy.Type type = route.proxy().type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && getRoute().proxy().type() == type2 && Intrinsics.g(getRoute().socketAddress(), route.socketAddress())) {
                        HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
                        if (hostnameVerifier != okHostnameVerifier) {
                            break;
                        }
                        HttpUrl httpUrlUrl = address.url();
                        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
                            return false;
                        }
                        HttpUrl httpUrlUrl2 = getRoute().address().url();
                        if (httpUrlUrl.port() != httpUrlUrl2.port()) {
                            break;
                        }
                        if (!Intrinsics.g(httpUrlUrl.host(), httpUrlUrl2.host())) {
                            if (!this.B && (handshake = this.f) != null) {
                                List<Certificate> listPeerCertificates = handshake.peerCertificates();
                                if (listPeerCertificates.isEmpty()) {
                                    break;
                                }
                                String strHost = httpUrlUrl.host();
                                Certificate certificate = listPeerCertificates.get(0);
                                certificate.getClass();
                                if (!okHostnameVerifier.verify(strHost, (X509Certificate) certificate)) {
                                    break;
                                }
                            } else {
                                break;
                                break;
                            }
                        }
                        try {
                            CertificatePinner certificatePinner = address.certificatePinner();
                            certificatePinner.getClass();
                            String strHost2 = address.url().host();
                            Handshake f = getF();
                            f.getClass();
                            certificatePinner.check(strHost2, f.peerCertificates());
                            return true;
                        } catch (SSLPeerUnverifiedException unused) {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean isHealthy(boolean doExtensiveChecks) {
        long j;
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.z;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.idleAtNs;
        }
        if (j < IDLE_CONNECTION_HEALTHY_NS || !doExtensiveChecks) {
            return true;
        }
        return _UtilJvmKt.isHealthy(this.e, this.v.getSource());
    }

    public final boolean isMultiplexed$okhttp() {
        return this.z != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient client, RealInterceptorChain chain) {
        client.getClass();
        chain.getClass();
        Http2Connection http2Connection = this.z;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        this.e.setSoTimeout(chain.readTimeoutMillis());
        BufferedSocket bufferedSocket = this.v;
        sxf0 sxf0VarTimeout = bufferedSocket.getSource().timeout();
        long readTimeoutMillis$okhttp = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sxf0VarTimeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        bufferedSocket.getSink().timeout().timeout(chain.getWriteTimeoutMillis(), timeUnit);
        return new Http1ExchangeCodec(client, this, bufferedSocket);
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.B = true;
            Unit unit = Unit.a;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
        synchronized (this) {
            this.noNewExchanges = true;
            Unit unit = Unit.a;
        }
        this.connectionListener.noNewExchanges(this);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(Http2Connection connection, Settings settings) {
        connection.getClass();
        settings.getClass();
        synchronized (this) {
            this.allocationLimit = settings.getMaxConcurrentStreams();
            Unit unit = Unit.a;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream stream) {
        stream.getClass();
        stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: protocol, reason: from getter */
    public Protocol getI() {
        return this.i;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return getRoute();
    }

    public final void setIdleAtNs(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: socket, reason: from getter */
    public Socket getE() {
        return this.e;
    }

    public final void start() throws SocketException {
        this.idleAtNs = System.nanoTime();
        Protocol protocol = Protocol.HTTP_2;
        Protocol protocol2 = this.i;
        if (protocol2 == protocol || protocol2 == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            Object obj = this.connectionListener;
            FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
            if (flowControlListener == null) {
                flowControlListener = FlowControlListener.None.INSTANCE;
            }
            Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, this.taskRunner).socket(this.v, getRoute().address().url().host()).listener(this).pingIntervalMillis(this.w).flowControlListener(flowControlListener).build();
            this.z = http2ConnectionBuild;
            this.allocationLimit = Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
            Http2Connection.start$default(http2ConnectionBuild, false, 1, null);
        }
    }

    public String toString() {
        Object objCipherSuite;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(getRoute().address().url().host());
        sb.append(':');
        sb.append(getRoute().address().url().port());
        sb.append(", proxy=");
        sb.append(getRoute().proxy());
        sb.append(" hostAddress=");
        sb.append(getRoute().socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f;
        if (handshake == null || (objCipherSuite = handshake.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        sb.append(objCipherSuite);
        sb.append(" protocol=");
        sb.append(this.i);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(RealCall call, IOException e) {
        boolean z;
        call.getClass();
        synchronized (this) {
            try {
                if (e instanceof StreamResetException) {
                    if (((StreamResetException) e).errorCode == ErrorCode.REFUSED_STREAM) {
                        int i = this.E + 1;
                        this.E = i;
                        if (i > 1) {
                            z = !this.noNewExchanges;
                            this.noNewExchanges = true;
                            this.routeFailureCount++;
                        } else {
                            z = false;
                        }
                    } else if (((StreamResetException) e).errorCode == ErrorCode.CANCEL && call.getG()) {
                        z = false;
                    } else {
                        z = !this.noNewExchanges;
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (!isMultiplexed$okhttp() || (e instanceof ConnectionShutdownException)) {
                    boolean z2 = !this.noNewExchanges;
                    this.noNewExchanges = true;
                    if (this.D == 0) {
                        if (e != null) {
                            connectFailed$okhttp(call.getClient(), getRoute(), e);
                        }
                        this.routeFailureCount++;
                    }
                    z = z2;
                } else {
                    z = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.connectionListener.noNewExchanges(this);
        }
    }

    public final void useAsSocket$okhttp() throws SocketException {
        this.e.setSoTimeout(0);
        noNewExchanges();
    }
}
