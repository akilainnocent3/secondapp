package okhttp3.internal.connection;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventGroupType;
import defpackage.fja0;
import defpackage.ib5;
import defpackage.iui;
import defpackage.jui;
import defpackage.lb5;
import defpackage.q6a0;
import defpackage.uw90;
import defpackage.y740;
import defpackage.zpa0;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002RSB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u0017J\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u0017J\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u0017J?\u00105\u001a\u0004\u0018\u0001032\b\b\u0002\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00112\b\b\u0002\u00101\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010H\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\bF\u0010GR$\u0010K\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR\u0014\u0010O\u001a\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010G¨\u0006T"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "Lokhttp3/Request;", "request", "", "writeRequestHeaders", "(Lokhttp3/Request;)V", "", "duplex", "Luw90;", "createRequestBody", "(Lokhttp3/Request;Z)Luw90;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "Lfja0;", "upgradeToSocket", "()Lfja0;", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "", "bytesRead", "isSocket", "responseDone", "requestDone", "Ljava/io/IOException;", "e", "bodyComplete", "(JZZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "a", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "b", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "c", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "value", "Z", "isDuplex$okhttp", "()Z", "isDuplex", "f", "getHasFailure$okhttp", "hasFailure", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", EventGroupType.CONNECTION_EVENT_GROUP, "isCoalescedConnection$okhttp", "isCoalescedConnection", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Exchange {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final RealCall call;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final EventListener eventListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final ExchangeFinder finder;
    public final ExchangeCodec d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isDuplex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasFailure;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Liui;", "Luw90;", "delegate", "", "contentLength", "", "isSocket", "<init>", "(Lokhttp3/internal/connection/Exchange;Luw90;JZ)V", "Llb5;", "source", "byteCount", "", "write", "(Llb5;J)V", "flush", "()V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class RequestBodySink extends iui {
        public final long b;
        public final boolean c;
        public boolean d;
        public long e;
        public boolean f;
        public boolean i;
        public final /* synthetic */ Exchange v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, uw90 uw90Var, long j, boolean z) {
            super(uw90Var);
            uw90Var.getClass();
            this.v = exchange;
            this.b = j;
            this.c = z;
            this.f = z;
        }

        @Override // defpackage.iui, defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.i) {
                return;
            }
            this.i = true;
            long j = this.b;
            if (j != -1 && this.e != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                d(null);
            } catch (IOException e) {
                IOException iOExceptionD = d(e);
                iOExceptionD.getClass();
                throw iOExceptionD;
            }
        }

        public final IOException d(IOException iOException) {
            if (this.d) {
                return iOException;
            }
            this.d = true;
            return Exchange.bodyComplete$default(this.v, this.e, this.c, false, true, iOException, 4, null);
        }

        @Override // defpackage.iui, defpackage.uw90, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                IOException iOExceptionD = d(e);
                iOExceptionD.getClass();
                throw iOExceptionD;
            }
        }

        @Override // defpackage.iui, defpackage.uw90
        public void write(lb5 source, long byteCount) throws IOException {
            Exchange exchange = this.v;
            source.getClass();
            if (this.i) {
                ib5.a("closed");
                return;
            }
            long j = this.b;
            if (j != -1 && this.e + byteCount > j) {
                StringBuilder sbA = q6a0.a(j, "expected ", " bytes but received ");
                sbA.append(this.e + byteCount);
                throw new ProtocolException(sbA.toString());
            }
            try {
                if (this.f) {
                    this.f = false;
                    exchange.getEventListener().requestBodyStart(exchange.getCall());
                }
                super.write(source, byteCount);
                this.e += byteCount;
            } catch (IOException e) {
                IOException iOExceptionD = d(e);
                iOExceptionD.getClass();
                throw iOExceptionD;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Ljui;", "Lzpa0;", "delegate", "", "contentLength", "", "isSocket", "<init>", "(Lokhttp3/internal/connection/Exchange;Lzpa0;JZ)V", "Llb5;", "sink", "byteCount", "read", "(Llb5;J)J", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "Ljava/io/IOException;", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ResponseBodySource extends jui {
        public final long b;
        public final boolean c;
        public long d;
        public boolean e;
        public boolean f;
        public boolean i;
        public final /* synthetic */ Exchange v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, zpa0 zpa0Var, long j, boolean z) {
            super(zpa0Var);
            zpa0Var.getClass();
            this.v = exchange;
            this.b = j;
            this.c = z;
            this.e = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // defpackage.jui, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.i) {
                return;
            }
            this.i = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException iOExceptionComplete = complete(e);
                iOExceptionComplete.getClass();
                throw iOExceptionComplete;
            }
        }

        public final IOException complete(IOException e) {
            if (this.f) {
                return e;
            }
            this.f = true;
            if (e == null && this.e) {
                this.e = false;
                Exchange exchange = this.v;
                exchange.getEventListener().responseBodyStart(exchange.getCall());
            }
            return Exchange.bodyComplete$default(this.v, this.d, this.c, true, false, e, 8, null);
        }

        @Override // defpackage.jui, defpackage.zpa0
        public long read(lb5 sink, long byteCount) throws IOException {
            sink.getClass();
            if (this.i) {
                ib5.a("closed");
                return 0L;
            }
            try {
                long j = delegate().read(sink, byteCount);
                boolean z = this.e;
                Exchange exchange = this.v;
                if (z) {
                    this.e = false;
                    exchange.getEventListener().responseBodyStart(exchange.getCall());
                }
                if (j == -1) {
                    complete(null);
                    return -1L;
                }
                long j2 = this.d + j;
                long j3 = this.b;
                if (j3 == -1 || j2 <= j3) {
                    this.d = j2;
                    if (exchange.d.isResponseComplete()) {
                        complete(null);
                    }
                    return j;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                IOException iOExceptionComplete = complete(e);
                iOExceptionComplete.getClass();
                throw iOExceptionComplete;
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        realCall.getClass();
        eventListener.getClass();
        exchangeFinder.getClass();
        exchangeCodec.getClass();
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.d = exchangeCodec;
    }

    public static /* synthetic */ IOException bodyComplete$default(Exchange exchange, long j, boolean z, boolean z2, boolean z3, IOException iOException, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        return exchange.bodyComplete(j, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, iOException);
    }

    public final void a(IOException iOException) {
        this.hasFailure = true;
        this.d.getCarrier().trackFailure(this.call, iOException);
    }

    public final IOException bodyComplete(long bytesRead, boolean isSocket, boolean responseDone, boolean requestDone, IOException e) {
        if (e != null) {
            a(e);
        }
        EventListener eventListener = this.eventListener;
        RealCall realCall = this.call;
        if (requestDone) {
            if (e != null) {
                eventListener.requestFailed(realCall, e);
            } else {
                eventListener.requestBodyEnd(realCall, bytesRead);
            }
        }
        if (responseDone) {
            if (e != null) {
                eventListener.responseFailed(realCall, e);
            } else {
                eventListener.responseBodyEnd(realCall, bytesRead);
            }
        }
        return this.call.messageDone$okhttp(this, requestDone && !isSocket, responseDone && !isSocket, responseDone && isSocket, requestDone && isSocket, e);
    }

    public final void cancel() {
        this.d.cancel();
    }

    public final uw90 createRequestBody(Request request, boolean duplex) {
        request.getClass();
        this.isDuplex = duplex;
        RequestBody requestBodyBody = request.body();
        requestBodyBody.getClass();
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.d.createRequestBody(request, jContentLength), jContentLength, false);
    }

    public final void detachWithViolence() {
        this.d.cancel();
        this.call.messageDone$okhttp(this, true, true, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.d.finishRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            a(e);
            throw e;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.d.flushRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        ExchangeCodec.Carrier carrier = this.d.getCarrier();
        RealConnection realConnection = carrier instanceof RealConnection ? (RealConnection) carrier : null;
        if (realConnection != null) {
            return realConnection;
        }
        ib5.a("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: getFinder$okhttp, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    /* JADX INFO: renamed from: getHasFailure$okhttp, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !Intrinsics.g(this.finder.getRoutePlanner().getAddress().url().host(), this.d.getCarrier().getRoute().address().url().host());
    }

    /* JADX INFO: renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final void noNewExchangesOnConnection() {
        this.d.getCarrier().noNewExchanges();
    }

    public final void noRequestBody() {
        RealCall.messageDone$okhttp$default(this.call, this, true, false, false, false, null, 28, null);
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        Exchange exchange;
        ExchangeCodec exchangeCodec = this.d;
        response.getClass();
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = exchangeCodec.reportedContentLength(response);
            exchange = this;
            try {
                return new RealResponseBody(strHeader$default, jReportedContentLength, new y740(new ResponseBodySource(exchange, exchangeCodec.openResponseBodySource(response), jReportedContentLength, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                exchange.eventListener.responseFailed(exchange.call, iOException);
                exchange.a(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            exchange = this;
        }
    }

    public final Headers peekTrailers() {
        return this.d.peekTrailers();
    }

    public final Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        try {
            Response.Builder responseHeaders = this.d.readResponseHeaders(expectContinue);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.initExchange$okhttp(this);
            return responseHeaders;
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            a(e);
            throw e;
        }
    }

    public final void responseHeadersEnd(Response response) {
        response.getClass();
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final fja0 upgradeToSocket() throws SocketException {
        this.call.upgradeToSocket();
        ExchangeCodec.Carrier carrier = this.d.getCarrier();
        carrier.getClass();
        ((RealConnection) carrier).useAsSocket$okhttp();
        return new fja0() { // from class: okhttp3.internal.connection.Exchange.upgradeToSocket.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final RequestBodySink sink;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final ResponseBodySource source;

            {
                this.sink = new RequestBodySink(Exchange.this, Exchange.this.d.getSocket().getSink(), -1L, true);
                this.source = new ResponseBodySource(Exchange.this, Exchange.this.d.getSocket().getSource(), -1L, true);
            }

            @Override // defpackage.fja0
            public void cancel() {
                Exchange.this.cancel();
            }

            @Override // defpackage.fja0
            public RequestBodySink getSink() {
                return this.sink;
            }

            @Override // defpackage.fja0
            public ResponseBodySource getSource() {
                return this.source;
            }
        };
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        RealCall realCall = this.call;
        EventListener eventListener = this.eventListener;
        request.getClass();
        try {
            eventListener.requestHeadersStart(realCall);
            this.d.writeRequestHeaders(request);
            eventListener.requestHeadersEnd(realCall, request);
        } catch (IOException e) {
            eventListener.requestFailed(realCall, e);
            a(e);
            throw e;
        }
    }
}
