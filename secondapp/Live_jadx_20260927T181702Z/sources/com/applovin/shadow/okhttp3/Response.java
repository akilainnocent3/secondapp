package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.Source;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.ui.AdActivity;
import cs.j;
import cs.k;
import dr.g1;
import dr.o;
import dr.q;
import eq.c;
import fr.h0;
import fw.b;
import gp.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class Response implements Closeable {

    @m
    private final ResponseBody body;

    @m
    private final Response cacheResponse;
    private final int code;

    @m
    private final Exchange exchange;

    @m
    private final Handshake handshake;

    @l
    private final Headers headers;

    @m
    private CacheControl lazyCacheControl;

    @l
    private final String message;

    @m
    private final Response networkResponse;

    @m
    private final Response priorResponse;

    @l
    private final Protocol protocol;
    private final long receivedResponseAtMillis;

    @l
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(@l Request request, @l Protocol protocol, @l String message, int i10, @m Handshake handshake, @l Headers headers, @m ResponseBody responseBody, @m Response response, @m Response response2, @m Response response3, long j10, long j11, @m Exchange exchange) {
        m0.p(request, "request");
        m0.p(protocol, "protocol");
        m0.p(message, "message");
        m0.p(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @j(name = "-deprecated_body")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "body", imports = {}))
    @m
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m119deprecated_body() {
        return this.body;
    }

    @j(name = "-deprecated_cacheControl")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "cacheControl", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m120deprecated_cacheControl() {
        return cacheControl();
    }

    @j(name = "-deprecated_cacheResponse")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "cacheResponse", imports = {}))
    @m
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m121deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @j(name = "-deprecated_code")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = e.f87280s, imports = {}))
    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name */
    public final int m122deprecated_code() {
        return this.code;
    }

    @j(name = "-deprecated_handshake")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "handshake", imports = {}))
    @m
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m123deprecated_handshake() {
        return this.handshake;
    }

    @j(name = "-deprecated_headers")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = c.f81518h, imports = {}))
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m124deprecated_headers() {
        return this.headers;
    }

    @j(name = "-deprecated_message")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = PglCryptUtils.KEY_MESSAGE, imports = {}))
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name */
    public final String m125deprecated_message() {
        return this.message;
    }

    @j(name = "-deprecated_networkResponse")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "networkResponse", imports = {}))
    @m
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m126deprecated_networkResponse() {
        return this.networkResponse;
    }

    @j(name = "-deprecated_priorResponse")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "priorResponse", imports = {}))
    @m
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m127deprecated_priorResponse() {
        return this.priorResponse;
    }

    @j(name = "-deprecated_protocol")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "protocol", imports = {}))
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m128deprecated_protocol() {
        return this.protocol;
    }

    @j(name = "-deprecated_receivedResponseAtMillis")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "receivedResponseAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m129deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @j(name = "-deprecated_request")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = AdActivity.REQUEST_KEY_EXTRA, imports = {}))
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name */
    public final Request m130deprecated_request() {
        return this.request;
    }

    @j(name = "-deprecated_sentRequestAtMillis")
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "sentRequestAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m131deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @j(name = "body")
    @m
    public final ResponseBody body() {
        return this.body;
    }

    @j(name = "cacheControl")
    @l
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @j(name = "cacheResponse")
    @m
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @l
    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return h0.J();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    @j(name = e.f87280s)
    public final int code() {
        return this.code;
    }

    @j(name = "exchange")
    @m
    public final Exchange exchange() {
        return this.exchange;
    }

    @j(name = "handshake")
    @m
    public final Handshake handshake() {
        return this.handshake;
    }

    @k
    @m
    public final String header(@l String name) {
        m0.p(name, "name");
        return header$default(this, name, null, 2, null);
    }

    @j(name = c.f81518h)
    @l
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i10 = this.code;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    @j(name = PglCryptUtils.KEY_MESSAGE)
    @l
    public final String message() {
        return this.message;
    }

    @j(name = "networkResponse")
    @m
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @l
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @l
    public final ResponseBody peekBody(long j10) throws IOException {
        ResponseBody responseBody = this.body;
        m0.m(responseBody);
        BufferedSource bufferedSourcePeek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(j10);
        buffer.write((Source) bufferedSourcePeek, Math.min(j10, bufferedSourcePeek.getBuffer().size()));
        return ResponseBody.Companion.create(buffer, this.body.contentType(), buffer.size());
    }

    @j(name = "priorResponse")
    @m
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @j(name = "protocol")
    @l
    public final Protocol protocol() {
        return this.protocol;
    }

    @j(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @j(name = AdActivity.REQUEST_KEY_EXTRA)
    @l
    public final Request request() {
        return this.request;
    }

    @j(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @l
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + b.f85383j;
    }

    @l
    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    @k
    @m
    public final String header(@l String name, @m String str) {
        m0.p(name, "name");
        String str2 = this.headers.get(name);
        return str2 == null ? str : str2;
    }

    @l
    public final List<String> headers(@l String name) {
        m0.p(name, "name");
        return this.headers.values(name);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    public static class Builder {

        @m
        private ResponseBody body;

        @m
        private Response cacheResponse;
        private int code;

        @m
        private Exchange exchange;

        @m
        private Handshake handshake;

        @l
        private Headers.Builder headers;

        @m
        private String message;

        @m
        private Response networkResponse;

        @m
        private Response priorResponse;

        @m
        private Protocol protocol;
        private long receivedResponseAtMillis;

        @m
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null && response.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (response.body() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (response.networkResponse() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (response.cacheResponse() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (response.priorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @l
        public Builder addHeader(@l String name, @l String value) {
            m0.p(name, "name");
            m0.p(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @l
        public Builder body(@m ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        @l
        public Response build() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        @l
        public Builder cacheResponse(@m Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        @l
        public Builder code(int i10) {
            this.code = i10;
            return this;
        }

        @m
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @m
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @m
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        @m
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @l
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @m
        public final String getMessage$okhttp() {
            return this.message;
        }

        @m
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @m
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @m
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @m
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @l
        public Builder handshake(@m Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @l
        public Builder header(@l String name, @l String value) {
            m0.p(name, "name");
            m0.p(value, "value");
            this.headers.set(name, value);
            return this;
        }

        @l
        public Builder headers(@l Headers headers) {
            m0.p(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@l Exchange deferredTrailers) {
            m0.p(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        @l
        public Builder message(@l String message) {
            m0.p(message, "message");
            this.message = message;
            return this;
        }

        @l
        public Builder networkResponse(@m Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        @l
        public Builder priorResponse(@m Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        @l
        public Builder protocol(@l Protocol protocol) {
            m0.p(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @l
        public Builder receivedResponseAtMillis(long j10) {
            this.receivedResponseAtMillis = j10;
            return this;
        }

        @l
        public Builder removeHeader(@l String name) {
            m0.p(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        @l
        public Builder request(@l Request request) {
            m0.p(request, "request");
            this.request = request;
            return this;
        }

        @l
        public Builder sentRequestAtMillis(long j10) {
            this.sentRequestAtMillis = j10;
            return this;
        }

        public final void setBody$okhttp(@m ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@m Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i10) {
            this.code = i10;
        }

        public final void setExchange$okhttp(@m Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(@m Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(@l Headers.Builder builder) {
            m0.p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@m String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@m Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@m Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@m Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j10) {
            this.receivedResponseAtMillis = j10;
        }

        public final void setRequest$okhttp(@m Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j10) {
            this.sentRequestAtMillis = j10;
        }

        public Builder(@l Response response) {
            m0.p(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
