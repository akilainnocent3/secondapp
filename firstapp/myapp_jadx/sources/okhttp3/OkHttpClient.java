package okhttp3;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.avg;
import defpackage.dmy;
import defpackage.emy;
import defpackage.fae;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.kb5;
import defpackage.p48;
import defpackage.r2z;
import j$.time.Duration;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 ·\u00012\u00020\u00012\u00020\u0002:\u0004¸\u0001·\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0007¢\u0006\u0004\b&\u0010$J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010/\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00103\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00105\u001a\u00020,H\u0007¢\u0006\u0004\b4\u0010.J\u000f\u00107\u001a\u00020,H\u0007¢\u0006\u0004\b6\u0010.J\u000f\u0010;\u001a\u000208H\u0007¢\u0006\u0004\b9\u0010:J\u0011\u0010?\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010C\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BJ\u0011\u0010G\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010K\u001a\u00020HH\u0007¢\u0006\u0004\bI\u0010JJ\u000f\u0010M\u001a\u000200H\u0007¢\u0006\u0004\bL\u00102J\u000f\u0010Q\u001a\u00020NH\u0007¢\u0006\u0004\bO\u0010PJ\u000f\u0010U\u001a\u00020RH\u0007¢\u0006\u0004\bS\u0010TJ\u0015\u0010X\u001a\b\u0012\u0004\u0012\u00020V0!H\u0007¢\u0006\u0004\bW\u0010$J\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0!H\u0007¢\u0006\u0004\bZ\u0010$J\u000f\u0010_\u001a\u00020\\H\u0007¢\u0006\u0004\b]\u0010^J\u000f\u0010c\u001a\u00020`H\u0007¢\u0006\u0004\ba\u0010bJ\u000f\u0010g\u001a\u00020dH\u0007¢\u0006\u0004\be\u0010fJ\u000f\u0010i\u001a\u00020dH\u0007¢\u0006\u0004\bh\u0010fJ\u000f\u0010k\u001a\u00020dH\u0007¢\u0006\u0004\bj\u0010fJ\u000f\u0010m\u001a\u00020dH\u0007¢\u0006\u0004\bl\u0010fJ\u000f\u0010o\u001a\u00020dH\u0007¢\u0006\u0004\bn\u0010fR\u0017\u0010\u001c\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0007¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\b%\u0010$R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0007¢\u0006\f\n\u0004\bt\u0010s\u001a\u0004\b'\u0010$R\u0017\u0010+\u001a\u00020(8\u0007¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\b+\u0010*R\u0017\u0010/\u001a\u00020,8\u0007¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\b/\u0010.R\u0017\u0010z\u001a\u00020,8\u0007¢\u0006\f\n\u0004\by\u0010x\u001a\u0004\bz\u0010.R\u0017\u00103\u001a\u0002008\u0007¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b3\u00102R\u0017\u00105\u001a\u00020,8\u0007¢\u0006\f\n\u0004\b}\u0010x\u001a\u0004\b5\u0010.R\u0017\u00107\u001a\u00020,8\u0007¢\u0006\f\n\u0004\b~\u0010x\u001a\u0004\b7\u0010.R\u0018\u0010;\u001a\u0002088\u0007¢\u0006\r\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0004\b;\u0010:R\u001b\u0010?\u001a\u0004\u0018\u00010<8\u0007¢\u0006\u000e\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0004\b?\u0010>R\u0019\u0010C\u001a\u00020@8\u0007¢\u0006\u000e\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0004\bC\u0010BR\u001b\u0010G\u001a\u0004\u0018\u00010D8\u0007¢\u0006\u000e\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0004\bG\u0010FR\u0019\u0010K\u001a\u00020H8\u0007¢\u0006\u000e\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0004\bK\u0010JR\u0018\u0010M\u001a\u0002008\u0007¢\u0006\r\n\u0005\b\u0089\u0001\u0010|\u001a\u0004\bM\u00102R\u0019\u0010Q\u001a\u00020N8\u0007¢\u0006\u000e\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0004\bQ\u0010PR\u001f\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0007¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001e\u0010X\u001a\b\u0012\u0004\u0012\u00020V0!8\u0007¢\u0006\r\n\u0005\b\u0091\u0001\u0010s\u001a\u0004\bX\u0010$R\u001e\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0!8\u0007¢\u0006\r\n\u0005\b\u0092\u0001\u0010s\u001a\u0004\b[\u0010$R\u0019\u0010_\u001a\u00020\\8\u0007¢\u0006\u000e\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0004\b_\u0010^R\u0019\u0010c\u001a\u00020`8\u0007¢\u0006\u000e\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0004\bc\u0010bR\u001f\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0007¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010g\u001a\u00020d8\u0007¢\u0006\u000e\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0004\bg\u0010fR\u0019\u0010i\u001a\u00020d8\u0007¢\u0006\u000e\n\u0006\b\u009e\u0001\u0010\u009d\u0001\u001a\u0004\bi\u0010fR\u0019\u0010k\u001a\u00020d8\u0007¢\u0006\u000e\n\u0006\b\u009f\u0001\u0010\u009d\u0001\u001a\u0004\bk\u0010fR\u0019\u0010m\u001a\u00020d8\u0007¢\u0006\u000e\n\u0006\b \u0001\u0010\u009d\u0001\u001a\u0004\bm\u0010fR\u0019\u0010o\u001a\u00020d8\u0007¢\u0006\u000e\n\u0006\b¡\u0001\u0010\u009d\u0001\u001a\u0004\bo\u0010fR\u001b\u0010£\u0001\u001a\u00020d8\u0007¢\u0006\u000f\n\u0006\b¢\u0001\u0010\u009d\u0001\u001a\u0005\b£\u0001\u0010fR\u001d\u0010§\u0001\u001a\u00030¤\u00018\u0007¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R \u0010®\u0001\u001a\u00030©\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010´\u0001\u001a\u00030¯\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u0019\u0010 \u001a\u00020\u001d8\u0007¢\u0006\u000e\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0004\b \u0010\u001fR\u0011\u0010U\u001a\u00020R8G¢\u0006\u0006\u001a\u0004\bU\u0010T¨\u0006¹\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lokhttp3/OkHttpClient$Builder;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "address", "(Lokhttp3/HttpUrl;)Lokhttp3/Address;", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;", "newBuilder", "()Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "a", "Lokhttp3/Dispatcher;", "b", "Ljava/util/List;", "c", "d", "Lokhttp3/EventListener$Factory;", "e", "Z", "f", "fastFallback", "g", "Lokhttp3/Authenticator;", "h", "i", "j", "Lokhttp3/CookieJar;", "k", "Lokhttp3/Cache;", "l", "Lokhttp3/Dns;", "m", "Ljava/net/Proxy;", "n", "Ljava/net/ProxySelector;", "o", "p", "Ljavax/net/SocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "s", "t", "u", "Ljavax/net/ssl/HostnameVerifier;", "v", "Lokhttp3/CertificatePinner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "w", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "x", "I", "y", "z", "A", "B", "C", "webSocketCloseTimeout", "", "D", "J", "minWebSocketMessageToCompress", "()J", "Lokhttp3/internal/connection/RouteDatabase;", "E", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/concurrent/TaskRunner;", "F", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "G", "Lokhttp3/ConnectionPool;", "Companion", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class OkHttpClient implements Call.Factory, WebSocket.Factory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final List<Protocol> H = _UtilJvmKt.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<ConnectionSpec> I = _UtilJvmKt.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final int writeTimeoutMillis;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final int pingIntervalMillis;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final int webSocketCloseTimeout;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final long minWebSocketMessageToCompress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final RouteDatabase routeDatabase;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final TaskRunner taskRunner;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final ConnectionPool connectionPool;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Dispatcher dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<Interceptor> interceptors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final List<Interceptor> networkInterceptors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final EventListener.Factory eventListenerFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean retryOnConnectionFailure;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean fastFallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Authenticator authenticator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean followRedirects;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean followSslRedirects;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final CookieJar cookieJar;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Cache cache;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final Dns dns;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final Proxy proxy;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final ProxySelector proxySelector;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final Authenticator proxyAuthenticator;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final SocketFactory socketFactory;
    public final SSLSocketFactory q;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final List<ConnectionSpec> connectionSpecs;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final List<Protocol> protocols;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final CertificateChainCleaner certificateChainCleaner;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final int callTimeoutMillis;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final int connectTimeoutMillis;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final int readTimeoutMillis;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "DEFAULT_PROTOCOLS", "", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "()Ljava/util/List;", "DEFAULT_CONNECTION_SPECS", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.I;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.H;
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        X509TrustManager x509TrustManagerPlatformTrustManager;
        SSLSocketFactory sSLSocketFactoryNewSslSocketFactory;
        CertificateChainCleaner certificateChainCleaner;
        builder.getClass();
        this.dispatcher = builder.getDispatcher();
        this.interceptors = _UtilJvmKt.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = _UtilJvmKt.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.fastFallback = builder.getFastFallback();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.webSocketCloseTimeout = builder.getWebSocketCloseTimeout();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner == null ? TaskRunner.INSTANCE : taskRunner;
        ConnectionPool connectionPool = builder.getConnectionPool();
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            builder.setConnectionPool$okhttp(connectionPool);
        }
        this.connectionPool = connectionPool;
        if (connectionSpecs$okhttp != null && connectionSpecs$okhttp.isEmpty()) {
            this.q = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
            sSLSocketFactoryNewSslSocketFactory = null;
            certificateChainCleaner = null;
            x509TrustManagerPlatformTrustManager = null;
            break;
        }
        Iterator<T> it = connectionSpecs$okhttp.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.q = null;
                this.certificateChainCleaner = null;
                this.x509TrustManager = null;
                this.certificatePinner = CertificatePinner.DEFAULT;
                sSLSocketFactoryNewSslSocketFactory = null;
                certificateChainCleaner = null;
                x509TrustManagerPlatformTrustManager = null;
                break;
            }
            if (((ConnectionSpec) it.next()).getIsTls()) {
                if (builder.getSslSocketFactoryOrNull() == null) {
                    Platform.Companion companion = Platform.INSTANCE;
                    x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
                    this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                    sSLSocketFactoryNewSslSocketFactory = companion.get().newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                    this.q = sSLSocketFactoryNewSslSocketFactory;
                    certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(x509TrustManagerPlatformTrustManager);
                    this.certificateChainCleaner = certificateChainCleaner;
                    this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    break;
                }
                sSLSocketFactoryNewSslSocketFactory = builder.getSslSocketFactoryOrNull();
                this.q = sSLSocketFactoryNewSslSocketFactory;
                certificateChainCleaner = builder.getCertificateChainCleaner();
                certificateChainCleaner.getClass();
                this.certificateChainCleaner = certificateChainCleaner;
                x509TrustManagerPlatformTrustManager = builder.getX509TrustManagerOrNull();
                x509TrustManagerPlatformTrustManager.getClass();
                this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                break;
            }
        }
        List<Interceptor> list = this.networkInterceptors;
        List<Interceptor> list2 = this.interceptors;
        list2.getClass();
        if (list2.contains(null)) {
            dmy.a(list2, "Null interceptor: ");
            throw null;
        }
        list.getClass();
        if (list.contains(null)) {
            dmy.a(list, "Null network interceptor: ");
            throw null;
        }
        List<ConnectionSpec> list3 = this.connectionSpecs;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).getIsTls()) {
                    if (sSLSocketFactoryNewSslSocketFactory == null) {
                        ib5.a("sslSocketFactory == null");
                        throw null;
                    }
                    if (certificateChainCleaner == null) {
                        ib5.a("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManagerPlatformTrustManager != null) {
                        return;
                    }
                    ib5.a("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactoryNewSslSocketFactory != null) {
            ib5.a("Check failed.");
            throw null;
        }
        if (certificateChainCleaner != null) {
            ib5.a("Check failed.");
            throw null;
        }
        if (x509TrustManagerPlatformTrustManager != null) {
            ib5.a("Check failed.");
            throw null;
        }
        if (Intrinsics.g(this.certificatePinner, CertificatePinner.DEFAULT)) {
            Unit unit = Unit.a;
        } else {
            ib5.a("Check failed.");
            throw null;
        }
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m198deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m206deprecated_interceptors() {
        return this.interceptors;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m207deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m209deprecated_protocols() {
        return this.protocols;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m216deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Address address(HttpUrl url) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        url.getClass();
        if (url.isHttps()) {
            sslSocketFactory = sslSocketFactory();
            hostnameVerifier = this.hostnameVerifier;
            certificatePinner = this.certificatePinner;
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(url.host(), url.port(), this.dns, this.socketFactory, sslSocketFactory, hostnameVerifier, certificatePinner, this.proxyAuthenticator, this.proxy, this.protocols, this.connectionSpecs, this.proxySelector);
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* JADX INFO: renamed from: certificateChainCleaner, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* JADX INFO: renamed from: fastFallback, reason: from getter */
    public final boolean getFastFallback() {
        return this.fastFallback;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    /* JADX INFO: renamed from: getRouteDatabase$okhttp, reason: from getter */
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    /* JADX INFO: renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        request.getClass();
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        request.getClass();
        listener.getClass();
        RealWebSocket realWebSocket = new RealWebSocket(this.taskRunner, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        ib5.a("CLEARTEXT-only client");
        return null;
    }

    /* JADX INFO: renamed from: webSocketCloseTimeout, reason: from getter */
    public final int getWebSocketCloseTimeout() {
        return this.webSocketCloseTimeout;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* JADX INFO: renamed from: x509TrustManager, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @Metadata(d1 = {"\u0000ý\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u0085\u0001\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0013J)\u0010\u001b\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b*\u0010%J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020#¢\u0006\u0004\b,\u0010%J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020'¢\u0006\u0004\b@\u0010)J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010FJ\u001d\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bE\u0010IJ\u001b\u0010L\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010MJ\u001b\u0010O\u001a\u00020\u00002\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0J¢\u0006\u0004\bO\u0010MJ\u0015\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bT\u0010UJ\u001d\u0010Z\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0017\u0010Z\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bZ\u0010^J\u0015\u0010Z\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bb\u0010[J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bb\u0010^J\u0015\u0010b\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bc\u0010aJ\u001d\u0010d\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bd\u0010[J\u0017\u0010d\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bd\u0010^J\u0015\u0010d\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\be\u0010aJ\u001d\u0010f\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bf\u0010[J\u0017\u0010f\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bf\u0010^J\u0015\u0010f\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bg\u0010aJ\u001d\u0010i\u001a\u00020\u00002\u0006\u0010h\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bi\u0010[J\u0017\u0010i\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bi\u0010^J\u0015\u0010i\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bj\u0010aJ\u001d\u0010k\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bk\u0010[J\u0017\u0010k\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bk\u0010^J\u0015\u0010k\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bl\u0010aJ\u0015\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020V¢\u0006\u0004\bn\u0010aJ\r\u0010o\u001a\u00020\u0004¢\u0006\u0004\bo\u0010pR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b\u007f\u0010\u0010R\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010~\u001a\u0005\b\u0081\u0001\u0010\u0010R(\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010$\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R(\u0010&\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0089\u0001\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001\"\u0006\b\u0090\u0001\u0010\u008d\u0001R(\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R(\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0089\u0001\u001a\u0006\b\u0098\u0001\u0010\u008b\u0001\"\u0006\b\u0099\u0001\u0010\u008d\u0001R(\u0010,\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u0089\u0001\u001a\u0006\b\u009b\u0001\u0010\u008b\u0001\"\u0006\b\u009c\u0001\u0010\u008d\u0001R(\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u00101\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R(\u00108\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010;\u001a\u0004\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010>\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R(\u0010@\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010\u0092\u0001\u001a\u0006\b¼\u0001\u0010\u0094\u0001\"\u0006\b½\u0001\u0010\u0096\u0001R(\u0010B\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R+\u0010Ê\u0001\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R+\u0010Ñ\u0001\u001a\u0004\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R,\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bÒ\u0001\u0010~\u001a\u0005\bÓ\u0001\u0010\u0010\"\u0006\bÔ\u0001\u0010Õ\u0001R,\u0010O\u001a\b\u0012\u0004\u0012\u00020N0J8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bÖ\u0001\u0010~\u001a\u0005\b×\u0001\u0010\u0010\"\u0006\bØ\u0001\u0010Õ\u0001R(\u0010Q\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R(\u0010T\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R,\u0010ì\u0001\u001a\u0005\u0018\u00010å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R)\u0010Z\u001a\u00030í\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R)\u0010b\u001a\u00030í\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bô\u0001\u0010ï\u0001\u001a\u0006\bõ\u0001\u0010ñ\u0001\"\u0006\bö\u0001\u0010ó\u0001R)\u0010d\u001a\u00030í\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b÷\u0001\u0010ï\u0001\u001a\u0006\bø\u0001\u0010ñ\u0001\"\u0006\bù\u0001\u0010ó\u0001R)\u0010f\u001a\u00030í\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bú\u0001\u0010ï\u0001\u001a\u0006\bû\u0001\u0010ñ\u0001\"\u0006\bü\u0001\u0010ó\u0001R)\u0010i\u001a\u00030í\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bý\u0001\u0010ï\u0001\u001a\u0006\bþ\u0001\u0010ñ\u0001\"\u0006\bÿ\u0001\u0010ó\u0001R)\u0010k\u001a\u00030í\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010ï\u0001\u001a\u0006\b\u0081\u0002\u0010ñ\u0001\"\u0006\b\u0082\u0002\u0010ó\u0001R(\u0010n\u001a\u00020V8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002\"\u0006\b\u0087\u0002\u0010\u0088\u0002R,\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u0089\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R*\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0097\u0002"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "(Z)Lokhttp3/OkHttpClient$Builder;", "fastFallback", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Cache;", "cache", "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "taskRunner$okhttp", "(Lokhttp3/internal/concurrent/TaskRunner;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "j$/time/Duration", AnalyticsParam.KEY_BI_DURATION, "(Lj$/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/time/b;", "callTimeout-LRDsOJo", "(J)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "connectTimeout-LRDsOJo", "readTimeout", "readTimeout-LRDsOJo", "writeTimeout", "writeTimeout-LRDsOJo", "interval", "pingInterval", "pingInterval-LRDsOJo", "webSocketCloseTimeout", "webSocketCloseTimeout-LRDsOJo", "bytes", "minWebSocketMessageToCompress", "build", "()Lokhttp3/OkHttpClient;", "a", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "b", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "c", "Ljava/util/List;", "getInterceptors$okhttp", "d", "getNetworkInterceptors$okhttp", "e", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "f", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "g", "getFastFallback$okhttp", "setFastFallback$okhttp", "h", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "i", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "j", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "k", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "l", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "m", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "n", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "o", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "p", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "q", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "r", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "s", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "t", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "u", "getProtocols$okhttp", "setProtocols$okhttp", "v", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "w", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "x", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "certificateChainCleaner", "", "y", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "z", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "A", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "B", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "C", "getPingInterval$okhttp", "setPingInterval$okhttp", "D", "getWebSocketCloseTimeout$okhttp", "setWebSocketCloseTimeout$okhttp", "E", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "F", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "routeDatabase", "G", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "setTaskRunner$okhttp", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public int readTimeout;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        public int writeTimeout;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        public int pingInterval;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        public int webSocketCloseTimeout;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        public long minWebSocketMessageToCompress;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        public RouteDatabase routeDatabase;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        public TaskRunner taskRunner;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public Dispatcher dispatcher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public ConnectionPool connectionPool;
        public final ArrayList c;
        public final ArrayList d;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public EventListener.Factory eventListenerFactory;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean retryOnConnectionFailure;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean fastFallback;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public Authenticator authenticator;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean followRedirects;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public boolean followSslRedirects;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public CookieJar cookieJar;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public Cache cache;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public Dns dns;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public Proxy proxy;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public ProxySelector proxySelector;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public Authenticator proxyAuthenticator;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public SocketFactory socketFactory;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public SSLSocketFactory sslSocketFactoryOrNull;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public X509TrustManager x509TrustManagerOrNull;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public List<ConnectionSpec> connectionSpecs;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        public List<? extends Protocol> protocols;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        public HostnameVerifier hostnameVerifier;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        public CertificatePinner certificatePinner;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        public CertificateChainCleaner certificateChainCleaner;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        public int callTimeout;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        public int connectTimeout;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            okHttpClient.getClass();
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            p48.w(okHttpClient.interceptors(), this.c);
            p48.w(okHttpClient.networkInterceptors(), this.d);
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.fastFallback = okHttpClient.getFastFallback();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.q;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.webSocketCloseTimeout = okHttpClient.getWebSocketCloseTimeout();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
            this.taskRunner = okHttpClient.getTaskRunner();
        }

        /* JADX INFO: renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m218addInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
            block.getClass();
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return block.invoke(chain);
                }
            });
        }

        /* JADX INFO: renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m219addNetworkInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
            block.getClass();
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return block.invoke(chain);
                }
            });
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            interceptor.getClass();
            this.c.add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            interceptor.getClass();
            this.d.add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            authenticator.getClass();
            this.authenticator = authenticator;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public final Builder callTimeout(Duration duration) {
            duration.getClass();
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: callTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m220callTimeoutLRDsOJo(long duration) {
            this.callTimeout = _UtilJvmKt.m248checkDurationHG0u8IE(AnalyticsParam.KEY_BI_DURATION, duration);
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            certificatePinner.getClass();
            if (!Intrinsics.g(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder connectTimeout(Duration duration) {
            duration.getClass();
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: connectTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m221connectTimeoutLRDsOJo(long duration) {
            this.connectTimeout = _UtilJvmKt.m248checkDurationHG0u8IE(AnalyticsParam.KEY_BI_DURATION, duration);
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            connectionPool.getClass();
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> connectionSpecs) {
            connectionSpecs.getClass();
            if (!Intrinsics.g(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = _UtilJvmKt.toImmutableList(connectionSpecs);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            cookieJar.getClass();
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            dispatcher.getClass();
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder dns(Dns dns) {
            dns.getClass();
            if (!Intrinsics.g(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            eventListener.getClass();
            this.eventListenerFactory = _UtilJvmKt.asFactory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory eventListenerFactory) {
            eventListenerFactory.getClass();
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final Builder fastFallback(boolean fastFallback) {
            this.fastFallback = fastFallback;
            return this;
        }

        public final Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        /* JADX INFO: renamed from: getAuthenticator$okhttp, reason: from getter */
        public final Authenticator getAuthenticator() {
            return this.authenticator;
        }

        /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
        public final Cache getCache() {
            return this.cache;
        }

        /* JADX INFO: renamed from: getCallTimeout$okhttp, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
        public final CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        /* JADX INFO: renamed from: getCertificatePinner$okhttp, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        /* JADX INFO: renamed from: getConnectTimeout$okhttp, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* JADX INFO: renamed from: getConnectionPool$okhttp, reason: from getter */
        public final ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        /* JADX INFO: renamed from: getCookieJar$okhttp, reason: from getter */
        public final CookieJar getCookieJar() {
            return this.cookieJar;
        }

        /* JADX INFO: renamed from: getDispatcher$okhttp, reason: from getter */
        public final Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        /* JADX INFO: renamed from: getDns$okhttp, reason: from getter */
        public final Dns getDns() {
            return this.dns;
        }

        /* JADX INFO: renamed from: getEventListenerFactory$okhttp, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* JADX INFO: renamed from: getFastFallback$okhttp, reason: from getter */
        public final boolean getFastFallback() {
            return this.fastFallback;
        }

        /* JADX INFO: renamed from: getFollowRedirects$okhttp, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* JADX INFO: renamed from: getFollowSslRedirects$okhttp, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        /* JADX INFO: renamed from: getHostnameVerifier$okhttp, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.c;
        }

        /* JADX INFO: renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.d;
        }

        /* JADX INFO: renamed from: getPingInterval$okhttp, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        /* JADX INFO: renamed from: getProxy$okhttp, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* JADX INFO: renamed from: getProxyAuthenticator$okhttp, reason: from getter */
        public final Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* JADX INFO: renamed from: getProxySelector$okhttp, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* JADX INFO: renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        /* JADX INFO: renamed from: getRouteDatabase$okhttp, reason: from getter */
        public final RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        /* JADX INFO: renamed from: getSocketFactory$okhttp, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        /* JADX INFO: renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        /* JADX INFO: renamed from: getWebSocketCloseTimeout$okhttp, reason: from getter */
        public final int getWebSocketCloseTimeout() {
            return this.webSocketCloseTimeout;
        }

        /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* JADX INFO: renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            hostnameVerifier.getClass();
            if (!Intrinsics.g(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.c;
        }

        public final Builder minWebSocketMessageToCompress(long bytes) {
            if (bytes >= 0) {
                this.minWebSocketMessageToCompress = bytes;
                return this;
            }
            kb5.a(avg.a(bytes, "minWebSocketMessageToCompress must be positive: "));
            return null;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.d;
        }

        public final Builder pingInterval(Duration duration) {
            duration.getClass();
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: pingInterval-LRDsOJo, reason: not valid java name */
        public final Builder m222pingIntervalLRDsOJo(long duration) {
            this.pingInterval = _UtilJvmKt.m248checkDurationHG0u8IE(AnalyticsParam.KEY_BI_DURATION, duration);
            return this;
        }

        public final Builder protocols(List<? extends Protocol> protocols) {
            protocols.getClass();
            ArrayList arrayList = new ArrayList(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                r2z.a(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return null;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                r2z.a(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return null;
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                r2z.a(arrayList, "protocols must not contain http/1.0: ");
                return null;
            }
            if (arrayList.contains(null)) {
                hb5.a("protocols must not contain null");
                return null;
            }
            arrayList.remove(Protocol.SPDY_3);
            if (!arrayList.equals(this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final Builder proxy(Proxy proxy) {
            if (!Intrinsics.g(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator proxyAuthenticator) {
            proxyAuthenticator.getClass();
            if (!Intrinsics.g(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            proxySelector.getClass();
            if (!Intrinsics.g(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final Builder readTimeout(Duration duration) {
            duration.getClass();
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: readTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m223readTimeoutLRDsOJo(long duration) {
            this.readTimeout = _UtilJvmKt.m248checkDurationHG0u8IE(AnalyticsParam.KEY_BI_DURATION, duration);
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            authenticator.getClass();
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            certificatePinner.getClass();
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            list.getClass();
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            cookieJar.getClass();
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            dispatcher.getClass();
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(Dns dns) {
            dns.getClass();
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            factory.getClass();
            this.eventListenerFactory = factory;
        }

        public final void setFastFallback$okhttp(boolean z) {
            this.fastFallback = z;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            hostnameVerifier.getClass();
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            list.getClass();
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            authenticator.getClass();
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            socketFactory.getClass();
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setTaskRunner$okhttp(TaskRunner taskRunner) {
            this.taskRunner = taskRunner;
        }

        public final void setWebSocketCloseTimeout$okhttp(int i) {
            this.webSocketCloseTimeout = i;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            socketFactory.getClass();
            if (socketFactory instanceof SSLSocketFactory) {
                hb5.a("socketFactory instanceof SSLSocketFactory");
                return null;
            }
            if (!Intrinsics.g(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @fae
        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory) {
            sslSocketFactory.getClass();
            if (!Intrinsics.g(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
                sb.append(companion.get());
                emy.a(sb, ", sslSocketFactory is ", sslSocketFactory.getClass());
                return null;
            }
            this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
            Platform platform = companion.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            x509TrustManager.getClass();
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        public final Builder taskRunner$okhttp(TaskRunner taskRunner) {
            taskRunner.getClass();
            this.taskRunner = taskRunner;
            return this;
        }

        public final Builder webSocketCloseTimeout(Duration duration) {
            duration.getClass();
            webSocketCloseTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: webSocketCloseTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m224webSocketCloseTimeoutLRDsOJo(long duration) {
            this.webSocketCloseTimeout = _UtilJvmKt.m248checkDurationHG0u8IE(AnalyticsParam.KEY_BI_DURATION, duration);
            return this;
        }

        public final Builder writeTimeout(Duration duration) {
            duration.getClass();
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: writeTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m225writeTimeoutLRDsOJo(long duration) {
            this.writeTimeout = _UtilJvmKt.m248checkDurationHG0u8IE(AnalyticsParam.KEY_BI_DURATION, duration);
            return this;
        }

        public final Builder callTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.callTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder connectTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.connectTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder pingInterval(long interval, TimeUnit unit) {
            unit.getClass();
            this.pingInterval = _UtilJvmKt.checkDuration("interval", interval, unit);
            return this;
        }

        public final Builder readTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.readTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder webSocketCloseTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.webSocketCloseTimeout = _UtilJvmKt.checkDuration("webSocketCloseTimeout", timeout, unit);
            return this;
        }

        public final Builder writeTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.writeTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            sslSocketFactory.getClass();
            trustManager.getClass();
            if (!Intrinsics.g(sslSocketFactory, this.sslSocketFactoryOrNull) || !Intrinsics.g(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.eventListenerFactory = _UtilJvmKt.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.INSTANCE;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
