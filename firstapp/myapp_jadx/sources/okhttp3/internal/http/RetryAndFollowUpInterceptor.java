package okhttp3.internal.http;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.google.protobuf.Reader;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import defpackage.m2g;
import defpackage.ogx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public final OkHttpClient a;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = okHttpClient;
    }

    public static int b(Response response, int i) {
        String strHeader$default = Response.header$default(response, "Retry-After", null, 2, null);
        if (strHeader$default == null) {
            return i;
        }
        if (!ogx.a("\\d+", strHeader$default)) {
            return Reader.READ_DONE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x014d  */
    /* JADX WARN: Code duplicated, block: B:99:0x015a  */
    public final Request a(Response response, Exchange exchange) throws ProtocolException {
        String strHeader$default;
        HttpUrl httpUrlResolve;
        Request.Builder builderNewBuilder;
        HttpMethod httpMethod;
        boolean z;
        RequestBody requestBodyBody;
        Response responsePriorResponse;
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int iCode = response.code();
        String strMethod = response.request().method();
        OkHttpClient okHttpClient = this.a;
        if (iCode == 307 || iCode == 308) {
            if (okHttpClient.followRedirects() && (strHeader$default = Response.header$default(response, "Location", null, 2, null)) != null && (httpUrlResolve = response.request().url().resolve(strHeader$default)) != null && (Intrinsics.g(httpUrlResolve.scheme(), response.request().url().scheme()) || okHttpClient.followSslRedirects())) {
                builderNewBuilder = response.request().newBuilder();
                if (HttpMethod.permitsRequestBody(strMethod)) {
                    int iCode2 = response.code();
                    httpMethod = HttpMethod.INSTANCE;
                    z = !httpMethod.redirectsWithBody(strMethod) || iCode2 == 308 || iCode2 == 307;
                    if (httpMethod.redirectsToGet(strMethod) || iCode2 == 308 || iCode2 == 307) {
                        builderNewBuilder.method(strMethod, z ? response.request().body() : null);
                    } else {
                        builderNewBuilder.method("GET", null);
                    }
                    if (!z) {
                        builderNewBuilder.removeHeader("Transfer-Encoding");
                        builderNewBuilder.removeHeader(TEFcJcMqR.pFFTZNyekcmwFk);
                        builderNewBuilder.removeHeader(rarBonoqWB.juJbeAyxzMSZ);
                    }
                }
                if (!_UtilJvmKt.canReuseConnectionFor(response.request().url(), httpUrlResolve)) {
                    builderNewBuilder.removeHeader("Authorization");
                }
                return builderNewBuilder.url(httpUrlResolve).build();
            }
        } else {
            if (iCode == 401) {
                return okHttpClient.authenticator().authenticate(route, response);
            }
            if (iCode == 421) {
                RequestBody requestBodyBody2 = response.request().body();
                if ((requestBodyBody2 == null || !requestBodyBody2.isOneShot()) && exchange != null && exchange.isCoalescedConnection$okhttp()) {
                    exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return response.request();
                }
            } else if (iCode == 503) {
                Response responsePriorResponse2 = response.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 503) && b(response, Reader.READ_DONE) == 0) {
                    return response.request();
                }
            } else {
                if (iCode == 407) {
                    route.getClass();
                    if (route.proxy().type() == Proxy.Type.HTTP) {
                        return okHttpClient.proxyAuthenticator().authenticate(route, response);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (iCode != 408) {
                    switch (iCode) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (okHttpClient.followRedirects()) {
                                builderNewBuilder = response.request().newBuilder();
                                if (HttpMethod.permitsRequestBody(strMethod)) {
                                    int iCode3 = response.code();
                                    httpMethod = HttpMethod.INSTANCE;
                                    if (httpMethod.redirectsWithBody(strMethod)) {
                                    }
                                    if (httpMethod.redirectsToGet(strMethod)) {
                                        builderNewBuilder.method(strMethod, z ? response.request().body() : null);
                                    } else {
                                        builderNewBuilder.method(strMethod, z ? response.request().body() : null);
                                    }
                                    if (!z) {
                                        builderNewBuilder.removeHeader("Transfer-Encoding");
                                        builderNewBuilder.removeHeader(TEFcJcMqR.pFFTZNyekcmwFk);
                                        builderNewBuilder.removeHeader(rarBonoqWB.juJbeAyxzMSZ);
                                    }
                                }
                                if (!_UtilJvmKt.canReuseConnectionFor(response.request().url(), httpUrlResolve)) {
                                    builderNewBuilder.removeHeader("Authorization");
                                }
                                return builderNewBuilder.url(httpUrlResolve).build();
                            }
                        default:
                            return null;
                    }
                } else if (okHttpClient.retryOnConnectionFailure() && (((requestBodyBody = response.request().body()) == null || !requestBodyBody.isOneShot()) && (((responsePriorResponse = response.priorResponse()) == null || responsePriorResponse.code() != 408) && b(response, 0) <= 0))) {
                    return response.request();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Throwable {
        boolean z;
        RequestBody requestBodyBody;
        chain.getClass();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.getRequest();
        RealCall call = realInterceptorChain.getCall();
        List listJ0 = m2g.a;
        boolean z2 = false;
        int i = 0;
        Response responseBuild = null;
        while (true) {
            boolean z3 = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z3, realInterceptorChain);
                try {
                    if (call.getG()) {
                        throw new IOException("Canceled");
                    }
                    try {
                    } catch (IOException e) {
                        boolean z4 = e instanceof ConnectionShutdownException;
                        if (this.a.retryOnConnectionFailure() && (z4 || (((requestBodyBody = request.body()) == null || !requestBodyBody.isOneShot()) && !(e instanceof FileNotFoundException)))) {
                            if (!(e instanceof ProtocolException)) {
                                if (!(e instanceof InterruptedIOException)) {
                                    if ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException)) {
                                    }
                                    z = false;
                                } else if (!(e instanceof SocketTimeoutException) || !z4) {
                                    z = false;
                                }
                                if (call.retryAfterFailure()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            z = false;
                        } else {
                            z = false;
                        }
                        call.getEventListener().retryDecision(call, e, z);
                        if (!z) {
                            throw _UtilCommonKt.withSuppressed(e, listJ0);
                        }
                        listJ0 = CollectionsKt.j0(listJ0, e);
                        call.exitNetworkInterceptorExchange$okhttp(true);
                        z3 = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                }
                call.exitNetworkInterceptorExchange$okhttp(z2);
                throw th;
            }
            responseBuild = realInterceptorChain.proceed(request).newBuilder().request(request).priorResponse(responseBuild != null ? UnreadableResponseBodyKt.stripBody(responseBuild) : null).build();
            Exchange interceptorScopedExchange = call.getInterceptorScopedExchange();
            Request requestA = a(responseBuild, interceptorScopedExchange);
            try {
                if (requestA == null) {
                    if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                        call.timeoutEarlyExit();
                    }
                    call.getEventListener().followUpDecision(call, responseBuild, null);
                    call.exitNetworkInterceptorExchange$okhttp(false);
                    return responseBuild;
                }
                RequestBody requestBodyBody2 = requestA.body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    call.getEventListener().followUpDecision(call, responseBuild, null);
                    call.exitNetworkInterceptorExchange$okhttp(false);
                    return responseBuild;
                }
                _UtilCommonKt.closeQuietly(responseBuild.body());
                i++;
                if (i > 20) {
                    call.getEventListener().followUpDecision(call, responseBuild, null);
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
                call.getEventListener().followUpDecision(call, responseBuild, requestA);
                call.exitNetworkInterceptorExchange$okhttp(true);
                request = requestA;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
