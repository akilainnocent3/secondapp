package okhttp3.internal.http;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cc5;
import defpackage.ib5;
import defpackage.rtg;
import defpackage.x740;
import defpackage.z7b;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TrailersSource;
import okhttp3.internal.UnreadableResponseBody;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallServerInterceptor implements Interceptor {
    public static final CallServerInterceptor INSTANCE = new CallServerInterceptor();

    private CallServerInterceptor() {
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a6 A[Catch: IOException -> 0x0077, TRY_LEAVE, TryCatch #1 {IOException -> 0x0077, blocks: (B:21:0x0062, B:23:0x0068, B:34:0x00a0, B:36:0x00a6, B:26:0x0079, B:27:0x0088, B:29:0x0095), top: B:100:0x003b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r4v8, types: [okhttp3.Response$Builder] */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        ?? r4;
        ?? responseHeaders;
        Response responseBuild;
        int iCode;
        Response responseBuild2;
        Response.Builder builder;
        chain.getClass();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        final Exchange exchange = realInterceptorChain.getExchange();
        exchange.getClass();
        Request request = realInterceptorChain.getRequest();
        RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        ?? r5 = (!HttpMethod.permitsRequestBody(request.method()) || requestBodyBody == null) ? 0 : 1;
        boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(request.header("Connection"));
        try {
            exchange.writeRequestHeaders(request);
            try {
                if (r5 != 0) {
                    if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                        exchange.flushRequest();
                        Response.Builder responseHeaders2 = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z = false;
                            builder = responseHeaders2;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            r4 = responseHeaders2;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                responseHeaders = r4;
                                throw e;
                            }
                        }
                    } else {
                        z = true;
                        builder = null;
                    }
                    if (builder != null) {
                        exchange.noRequestBody();
                        if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                            r5 = builder;
                            exchange.noNewExchangesOnConnection();
                            r5 = builder;
                        }
                    } else if (requestBodyBody.isDuplex()) {
                        exchange.flushRequest();
                        requestBodyBody.writeTo(z7b.a(exchange.createRequestBody(request, true)));
                    } else {
                        x740 x740VarA = z7b.a(exchange.createRequestBody(request, false));
                        requestBodyBody.writeTo(x740VarA);
                        x740VarA.close();
                    }
                } else {
                    exchange.noRequestBody();
                    z = true;
                    r5 = 0;
                }
                if (requestBodyBody != null) {
                    r5 = builder;
                    if (!requestBodyBody.isDuplex()) {
                        r5 = builder;
                        r5 = builder;
                        r5 = builder;
                        exchange.finishRequest();
                    }
                } else {
                    r5 = builder;
                    r5 = builder;
                    r5 = builder;
                    exchange.finishRequest();
                }
                r5 = builder;
                e = null;
                responseHeaders = r5;
                while (true) {
                    if (iCode != 100 && (102 > iCode || iCode >= 200)) {
                        break;
                    }
                    Response.Builder responseHeaders3 = exchange.readResponseHeaders(false);
                    responseHeaders3.getClass();
                    if (z) {
                        exchange.responseHeadersStart();
                    }
                    responseBuild = responseHeaders3.request(request).handshake(exchange.getConnection$okhttp().getF()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                    iCode = responseBuild.code();
                }
            } catch (IOException e2) {
                e = e2;
                r4 = r5;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            r4 = 0;
        }
        if (responseHeaders == 0) {
            try {
                responseHeaders = exchange.readResponseHeaders(false);
                responseHeaders.getClass();
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e4) {
                if (e == null) {
                    throw e4;
                }
                rtg.a(e, e4);
                throw e;
            }
        }
        responseBuild = responseHeaders.request(request).handshake(exchange.getConnection$okhttp().getF()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        iCode = responseBuild.code();
        exchange.responseHeadersEnd(responseBuild);
        boolean z3 = iCode == 101;
        if (z3 && exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
        }
        if (z3 && "upgrade".equalsIgnoreCase(Response.header$default(responseBuild, "Connection", null, 2, null))) {
            z2 = true;
        }
        if (zEqualsIgnoreCase && z2) {
            responseBuild2 = responseBuild.newBuilder().body(new UnreadableResponseBody(responseBuild.body().getB(), responseBuild.body().getC())).socket(exchange.upgradeToSocket()).build();
        } else {
            final ResponseBody responseBodyOpenResponseBody = exchange.openResponseBody(responseBuild);
            responseBuild2 = responseBuild.newBuilder().body(responseBodyOpenResponseBody).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor.intercept.1
                @Override // okhttp3.TrailersSource
                public Headers get() {
                    cc5 d = responseBodyOpenResponseBody.getD();
                    if (d.isOpen()) {
                        _UtilJvmKt.skipAll(d);
                    }
                    Headers headersPeek = peek();
                    if (headersPeek != null) {
                        return headersPeek;
                    }
                    ib5.a("null trailers after exhausting response body?!");
                    return null;
                }

                @Override // okhttp3.TrailersSource
                public Headers peek() {
                    return exchange.peekTrailers();
                }
            }).build();
        }
        if (AnalyticsParam.STORY_SKIP_REASON_CLOSE.equalsIgnoreCase(responseBuild2.request().header("Connection")) || AnalyticsParam.STORY_SKIP_REASON_CLOSE.equalsIgnoreCase(Response.header$default(responseBuild2, "Connection", null, 2, null))) {
            exchange.noNewExchangesOnConnection();
        }
        if ((iCode != 204 && iCode != 205) || responseBuild2.body().getC() <= 0) {
            return responseBuild2;
        }
        throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + responseBuild2.body().getC());
    }
}
