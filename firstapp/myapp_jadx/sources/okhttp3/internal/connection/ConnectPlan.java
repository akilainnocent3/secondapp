package okhttp3.internal.connection;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hb5;
import defpackage.i08;
import defpackage.ib5;
import defpackage.iua;
import defpackage.qae0;
import defpackage.sxf0;
import defpackage.zmm;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0093\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\"\u0010 J%\u0010*\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00152\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J'\u0010,\u001a\u0004\u0018\u00010\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00152\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b+\u0010)J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000202H\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u0001H\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u000202¢\u0006\u0004\b:\u00106R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u001b\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u0010R\u001a\u0004\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010J¨\u0006U"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealRoutePlanner;", "routePlanner", "Lokhttp3/Route;", "route", "", "routes", "attempt", "Lokhttp3/Request;", "tunnelRequest", "connectionSpecIndex", "isTlsFallback", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZ)V", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "connectTunnel$okhttp", "connectTunnel", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "planWithCurrentOrInitialConnectionSpec$okhttp", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;", "planWithCurrentOrInitialConnectionSpec", "nextConnectionSpec$okhttp", "nextConnectionSpec", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "()Lokhttp3/internal/connection/RealConnection;", "Ljava/io/IOException;", "e", "", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "noNewExchanges", "()V", "cancel", "retry", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "closeQuietly", "z", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "A", "Ljava/util/List;", "getRoutes$okhttp", "()Ljava/util/List;", "D", "I", "getConnectionSpecIndex$okhttp", "()I", "E", "Z", "isTlsFallback$okhttp", "()Z", "Ljava/net/Socket;", "H", "Ljava/net/Socket;", "getJavaNetSocket$okhttp", "()Ljava/net/Socket;", "setJavaNetSocket$okhttp", "(Ljava/net/Socket;)V", "javaNetSocket", "isReady", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final List<Route> routes;
    public final int B;
    public final Request C;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final int connectionSpecIndex;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final boolean isTlsFallback;
    public volatile boolean F;
    public Socket G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Socket javaNetSocket;
    public Handshake I;
    public Protocol J;
    public BufferedSocket K;
    public RealConnection L;
    public final TaskRunner a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int i;
    public final boolean v;
    public final RealCall w;
    public final RealRoutePlanner y;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final Route route;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan$Companion;", "", "<init>", "()V", "NPE_THROW_WITH_NULL", "", "MAX_TUNNEL_ATTEMPTS", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List<Route> list, int i6, Request request, int i7, boolean z2) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        realCall.getClass();
        realRoutePlanner.getClass();
        route.getClass();
        this.a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.i = i5;
        this.v = z;
        this.w = realCall;
        this.y = realRoutePlanner;
        this.route = route;
        this.routes = list;
        this.B = i6;
        this.C = request;
        this.connectionSpecIndex = i7;
        this.isTlsFallback = z2;
    }

    public static ConnectPlan c(ConnectPlan connectPlan, int i, Request request, int i2, boolean z, int i3) {
        return new ConnectPlan(connectPlan.a, connectPlan.b, connectPlan.c, connectPlan.d, connectPlan.e, connectPlan.f, connectPlan.i, connectPlan.v, connectPlan.w, connectPlan.y, connectPlan.getRoute(), connectPlan.routes, (i3 & 1) != 0 ? connectPlan.B : i, (i3 & 2) != 0 ? connectPlan.C : request, (i3 & 4) != 0 ? connectPlan.connectionSpecIndex : i2, (i3 & 8) != 0 ? connectPlan.isTlsFallback : z);
    }

    public final void a() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = getRoute().proxy().type();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = getRoute().address().socketFactory().createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(getRoute().proxy());
        }
        this.G = socketCreateSocket;
        if (this.F) {
            i08.a("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            Platform.INSTANCE.get().connectSocket(socketCreateSocket, getRoute().socketAddress(), this.e);
            try {
                this.K = BufferedSocketKt.asBufferedSocket(socketCreateSocket);
            } catch (NullPointerException e) {
                if (Intrinsics.g(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void b(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        final Address address = getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.INSTANCE.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.INSTANCE;
            session.getClass();
            final Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(address.url().host(), session)) {
                final CertificatePinner certificatePinner = address.certificatePinner();
                certificatePinner.getClass();
                Handshake handshake2 = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new Function0() { // from class: hua
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ConnectPlan.Companion companion2 = ConnectPlan.INSTANCE;
                        CertificateChainCleaner certificateChainCleaner = certificatePinner.getCertificateChainCleaner();
                        certificateChainCleaner.getClass();
                        return certificateChainCleaner.clean(handshake.peerCertificates(), address.url().host());
                    }
                });
                this.I = handshake2;
                certificatePinner.check$okhttp(address.url().host(), new iua(handshake2, 0));
                String selectedProtocol = connectionSpec.supportsTlsExtensions() ? Platform.INSTANCE.get().getSelectedProtocol(sSLSocket) : null;
                this.javaNetSocket = sSLSocket;
                this.K = BufferedSocketKt.asBufferedSocket(sSLSocket);
                this.J = selectedProtocol != null ? Protocol.INSTANCE.get(selectedProtocol) : Protocol.HTTP_1_1;
                Platform.INSTANCE.get().afterHandshake(sSLSocket);
                return;
            }
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            if (listPeerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            Certificate certificate = listPeerCertificates.get(0);
            certificate.getClass();
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(qae0.d("\n            |Hostname " + address.url().host() + " not verified:\n            |    certificate: " + CertificatePinner.INSTANCE.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n            "));
        } catch (Throwable th) {
            Platform.INSTANCE.get().afterHandshake(sSLSocket);
            _UtilJvmKt.closeQuietly(sSLSocket);
            throw th;
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: cancel */
    public void mo249cancel() {
        this.F = true;
        Socket socket = this.G;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    public final void closeQuietly() {
        Socket socket = this.javaNetSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTcp */
    public RoutePlanner.ConnectResult getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_RESULT java.lang.String() throws Throwable {
        IOException iOException;
        boolean z;
        Socket socket;
        Socket socket2;
        RealConnectionPool realConnectionPool = this.b;
        if (this.G != null) {
            ib5.a("TCP already connected");
            return null;
        }
        RealCall realCall = this.w;
        realCall.getPlansToCancel$okhttp().add(this);
        boolean z2 = false;
        try {
            realCall.getEventListener().connectStart(realCall, getRoute().socketAddress(), getRoute().proxy());
            realConnectionPool.getConnectionListener().connectStart(getRoute(), realCall);
            a();
            try {
                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                realCall.getPlansToCancel$okhttp().remove(this);
                return connectResult;
            } catch (IOException e) {
                iOException = e;
                z = true;
                try {
                    if (getRoute().address().proxy() == null && getRoute().proxy().type() != Proxy.Type.DIRECT) {
                        getRoute().address().proxySelector().connectFailed(getRoute().address().url().uri(), getRoute().proxy().address(), iOException);
                    }
                    realCall.getEventListener().connectFailed(this.w, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                    realConnectionPool.getConnectionListener().connectFailed(getRoute(), realCall, iOException);
                    RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, iOException, 2, null);
                    realCall.getPlansToCancel$okhttp().remove(this);
                    if (!z && (socket2 = this.G) != null) {
                        _UtilJvmKt.closeQuietly(socket2);
                    }
                    return connectResult2;
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    realCall.getPlansToCancel$okhttp().remove(this);
                    if (!z2 && (socket = this.G) != null) {
                        _UtilJvmKt.closeQuietly(socket);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
                realCall.getPlansToCancel$okhttp().remove(this);
                if (!z2) {
                    _UtilJvmKt.closeQuietly(socket);
                }
                throw th;
            }
        } catch (IOException e2) {
            iOException = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cb A[Catch: all -> 0x01d2, TryCatch #3 {all -> 0x01d2, blocks: (B:80:0x019f, B:82:0x01cb, B:88:0x01d6, B:74:0x0193, B:75:0x0196), top: B:109:0x0193 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f8  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTlsEtc */
    public RoutePlanner.ConnectResult mo253connectTlsEtc() throws Throwable {
        IOException iOException;
        ConnectPlan connectPlanNextConnectionSpec$okhttp;
        Socket socket;
        Socket socket2;
        ConnectPlan connectPlan;
        boolean z;
        RealConnectionPool realConnectionPool = this.b;
        Socket socket3 = this.G;
        if (socket3 == null) {
            hb5.a("TCP not connected");
            return null;
        }
        if (isReady()) {
            ib5.a("already connected");
            return null;
        }
        List<ConnectionSpec> listConnectionSpecs = getRoute().address().connectionSpecs();
        RealCall realCall = this.w;
        realCall.getPlansToCancel$okhttp().add(this);
        boolean z2 = false;
        try {
            try {
                if (this.C != null) {
                    try {
                        RoutePlanner.ConnectResult connectResultConnectTunnel$okhttp = connectTunnel$okhttp();
                        if (connectResultConnectTunnel$okhttp.getNextPlan() != null || connectResultConnectTunnel$okhttp.getThrowable() != null) {
                            realCall.getPlansToCancel$okhttp().remove(this);
                            Socket socket4 = this.javaNetSocket;
                            if (socket4 != null) {
                                _UtilJvmKt.closeQuietly(socket4);
                            }
                            _UtilJvmKt.closeQuietly(socket3);
                            return connectResultConnectTunnel$okhttp;
                        }
                    } catch (IOException e) {
                        iOException = e;
                        connectPlanNextConnectionSpec$okhttp = null;
                    }
                }
                if (getRoute().address().sslSocketFactory() != null) {
                    BufferedSocket bufferedSocket = this.K;
                    if (bufferedSocket == null) {
                        Intrinsics.n("socket");
                        throw null;
                    }
                    if (bufferedSocket.getSource().e().N0()) {
                        BufferedSocket bufferedSocket2 = this.K;
                        if (bufferedSocket2 == null) {
                            Intrinsics.n("socket");
                            throw null;
                        }
                        if (bufferedSocket2.getSink().e().N0()) {
                            realCall.getEventListener().secureConnectStart(realCall);
                            Socket socketCreateSocket = getRoute().address().sslSocketFactory().createSocket(socket3, getRoute().address().url().host(), getRoute().address().url().port(), true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            ConnectPlan connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(listConnectionSpecs, sSLSocket);
                            ConnectionSpec connectionSpec = listConnectionSpecs.get(connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            connectPlanNextConnectionSpec$okhttp = connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(listConnectionSpecs, sSLSocket);
                            try {
                                connectionSpec.apply$okhttp(sSLSocket, connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                                b(sSLSocket, connectionSpec);
                                realCall.getEventListener().secureConnectEnd(realCall, this.I);
                                connectPlan = connectPlanNextConnectionSpec$okhttp;
                            } catch (IOException e2) {
                                iOException = e2;
                                realCall = realCall;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket3;
                List<Protocol> listProtocols = getRoute().address().protocols();
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!listProtocols.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.J = protocol;
                connectPlan = null;
                try {
                    TaskRunner taskRunner = this.a;
                    RealConnectionPool realConnectionPool2 = this.b;
                    Route route = getRoute();
                    Socket socket5 = this.javaNetSocket;
                    socket5.getClass();
                    Handshake handshake = this.I;
                    Protocol protocol2 = this.J;
                    protocol2.getClass();
                    BufferedSocket bufferedSocket3 = this.K;
                    if (bufferedSocket3 == null) {
                        realCall = realCall;
                        try {
                            try {
                                Intrinsics.n("socket");
                                throw null;
                            } catch (IOException e3) {
                                e = e3;
                                iOException = e;
                                connectPlanNextConnectionSpec$okhttp = connectPlan;
                                realCall.getEventListener().connectFailed(this.w, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                                IOException iOException2 = iOException;
                                realConnectionPool.getConnectionListener().connectFailed(getRoute(), realCall, iOException2);
                                if (this.v) {
                                    connectPlanNextConnectionSpec$okhttp = null;
                                } else {
                                    connectPlanNextConnectionSpec$okhttp = null;
                                }
                                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, connectPlanNextConnectionSpec$okhttp, iOException2);
                                realCall.getPlansToCancel$okhttp().remove(this);
                                if (!z2) {
                                    socket2 = this.javaNetSocket;
                                    if (socket2 != null) {
                                        _UtilJvmKt.closeQuietly(socket2);
                                    }
                                    _UtilJvmKt.closeQuietly(socket3);
                                }
                                return connectResult;
                            }
                        } catch (Throwable th) {
                            th = th;
                            realCall.getPlansToCancel$okhttp().remove(this);
                            if (!z2) {
                                socket = this.javaNetSocket;
                                if (socket != null) {
                                    _UtilJvmKt.closeQuietly(socket);
                                }
                                _UtilJvmKt.closeQuietly(socket3);
                            }
                            throw th;
                        }
                    }
                    RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool2, route, socket3, socket5, handshake, protocol2, bufferedSocket3, this.i, realConnectionPool.getConnectionListener());
                    this.L = realConnection;
                    realConnection.start();
                    realCall.getEventListener().connectEnd(realCall, getRoute().socketAddress(), getRoute().proxy(), this.J);
                    try {
                        realCall = realCall;
                        z = true;
                        try {
                            RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                            realCall.getPlansToCancel$okhttp().remove(this);
                            return connectResult2;
                        } catch (IOException e4) {
                            e = e4;
                            iOException = e;
                            z2 = z;
                            connectPlanNextConnectionSpec$okhttp = connectPlan;
                            realCall.getEventListener().connectFailed(this.w, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                            IOException iOException3 = iOException;
                            realConnectionPool.getConnectionListener().connectFailed(getRoute(), realCall, iOException3);
                            if (this.v) {
                                connectPlanNextConnectionSpec$okhttp = null;
                            } else {
                                connectPlanNextConnectionSpec$okhttp = null;
                            }
                            RoutePlanner.ConnectResult connectResult3 = new RoutePlanner.ConnectResult(this, connectPlanNextConnectionSpec$okhttp, iOException3);
                            realCall.getPlansToCancel$okhttp().remove(this);
                            if (!z2) {
                                socket2 = this.javaNetSocket;
                                if (socket2 != null) {
                                    _UtilJvmKt.closeQuietly(socket2);
                                }
                                _UtilJvmKt.closeQuietly(socket3);
                            }
                            return connectResult3;
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = z;
                            realCall.getPlansToCancel$okhttp().remove(this);
                            if (!z2) {
                                socket = this.javaNetSocket;
                                if (socket != null) {
                                    _UtilJvmKt.closeQuietly(socket);
                                }
                                _UtilJvmKt.closeQuietly(socket3);
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        realCall = realCall;
                        z = true;
                    } catch (Throwable th3) {
                        th = th3;
                        realCall = realCall;
                        z = true;
                    }
                } catch (IOException e6) {
                    e = e6;
                    realCall = realCall;
                }
                iOException = e;
                connectPlanNextConnectionSpec$okhttp = connectPlan;
            } catch (IOException e7) {
                iOException = e7;
            }
        } catch (Throwable th4) {
            th = th4;
            realCall = realCall;
        }
        realCall.getEventListener().connectFailed(this.w, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
        IOException iOException4 = iOException;
        realConnectionPool.getConnectionListener().connectFailed(getRoute(), realCall, iOException4);
        if (this.v || !RetryTlsHandshakeKt.retryTlsHandshake(iOException4)) {
            connectPlanNextConnectionSpec$okhttp = null;
        }
        RoutePlanner.ConnectResult connectResult4 = new RoutePlanner.ConnectResult(this, connectPlanNextConnectionSpec$okhttp, iOException4);
        realCall.getPlansToCancel$okhttp().remove(this);
        if (!z2) {
            socket2 = this.javaNetSocket;
            if (socket2 != null) {
                _UtilJvmKt.closeQuietly(socket2);
            }
            _UtilJvmKt.closeQuietly(socket3);
        }
        return connectResult4;
    }

    public final RoutePlanner.ConnectResult connectTunnel$okhttp() throws IOException {
        Request request;
        Request request2 = this.C;
        request2.getClass();
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            BufferedSocket bufferedSocket = this.K;
            if (bufferedSocket == null) {
                Intrinsics.n("socket");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocket);
            BufferedSocket bufferedSocket2 = this.K;
            if (bufferedSocket2 == null) {
                Intrinsics.n("socket");
                throw null;
            }
            sxf0 a = bufferedSocket2.getSource().getA();
            long j = this.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a.timeout(j, timeUnit);
            BufferedSocket bufferedSocket3 = this.K;
            if (bufferedSocket3 == null) {
                Intrinsics.n("socket");
                throw null;
            }
            bufferedSocket3.getSink().timeout().timeout(this.d, timeUnit);
            http1ExchangeCodec.writeRequest(request2.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            responseHeaders.getClass();
            Response responseBuild = responseHeaders.request(request2).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                request = null;
                break;
            }
            if (iCode != 407) {
                zmm.a(responseBuild.code(), "Unexpected response code for CONNECT: ");
                return null;
            }
            Request requestAuthenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), responseBuild);
            if (requestAuthenticate == null) {
                i08.a("Failed to authenticate with proxy");
                return null;
            }
            if (AnalyticsParam.STORY_SKIP_REASON_CLOSE.equalsIgnoreCase(Response.header$default(responseBuild, "Connection", null, 2, null))) {
                request = requestAuthenticate;
                break;
            }
            request2 = requestAuthenticate;
        }
        if (request == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.G;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
        int i = this.B + 1;
        RealCall realCall = this.w;
        if (i < 21) {
            realCall.getEventListener().connectEnd(realCall, getRoute().socketAddress(), getRoute().proxy(), null);
            return new RoutePlanner.ConnectResult(this, c(this, i, request, 0, false, 12), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        realCall.getEventListener().connectFailed(this.w, getRoute().socketAddress(), getRoute().proxy(), null, protocolException);
        this.b.getConnectionListener().connectFailed(getRoute(), realCall, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    /* JADX INFO: renamed from: getConnectionSpecIndex$okhttp, reason: from getter */
    public final int getConnectionSpecIndex() {
        return this.connectionSpecIndex;
    }

    /* JADX INFO: renamed from: getJavaNetSocket$okhttp, reason: from getter */
    public final Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        return this.route;
    }

    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: handleSuccess */
    public RealConnection mo250handleSuccess() {
        this.w.getClient().getRouteDatabase().connected(getRoute());
        RealConnection realConnection = this.L;
        realConnection.getClass();
        realConnection.getConnectionListener().connectEnd(realConnection, getRoute(), this.w);
        ReusePlan reusePlanPlanReusePooledConnection$okhttp = this.y.planReusePooledConnection$okhttp(this, this.routes);
        if (reusePlanPlanReusePooledConnection$okhttp != null) {
            return reusePlanPlanReusePooledConnection$okhttp.getCom.twilio.voice.EventGroupType.CONNECTION_EVENT_GROUP java.lang.String();
        }
        synchronized (realConnection) {
            this.b.put(realConnection);
            this.w.acquireConnectionNoEvents(realConnection);
            Unit unit = Unit.a;
        }
        this.w.getEventListener().connectionAcquired(this.w, realConnection);
        realConnection.getConnectionListener().connectionAcquired(realConnection, this.w);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public boolean isReady() {
        return this.J != null;
    }

    /* JADX INFO: renamed from: isTlsFallback$okhttp, reason: from getter */
    public final boolean getIsTlsFallback() {
        return this.isTlsFallback;
    }

    public final ConnectPlan nextConnectionSpec$okhttp(List<ConnectionSpec> connectionSpecs, SSLSocket sslSocket) {
        connectionSpecs.getClass();
        sslSocket.getClass();
        int i = this.connectionSpecIndex;
        int size = connectionSpecs.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (connectionSpecs.get(i2).isCompatible(sslSocket)) {
                return c(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
    }

    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(List<ConnectionSpec> connectionSpecs, SSLSocket sslSocket) throws UnknownServiceException {
        connectionSpecs.getClass();
        sslSocket.getClass();
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan connectPlanNextConnectionSpec$okhttp = nextConnectionSpec$okhttp(connectionSpecs, sslSocket);
        if (connectPlanNextConnectionSpec$okhttp != null) {
            return connectPlanNextConnectionSpec$okhttp;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isTlsFallback);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: retry */
    public RoutePlanner.Plan mo251retry() {
        return new ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, getRoute(), this.routes, this.B, this.C, this.connectionSpecIndex, this.isTlsFallback);
    }

    public final void setJavaNetSocket$okhttp(Socket socket) {
        this.javaNetSocket = socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(RealCall call, IOException e) {
        call.getClass();
    }
}
