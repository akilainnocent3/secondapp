package okhttp3.internal.http1;

import com.google.protobuf.Reader;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.avg;
import defpackage.bc5;
import defpackage.i08;
import defpackage.ib5;
import defpackage.inm;
import defpackage.iyi;
import defpackage.kb5;
import defpackage.lb5;
import defpackage.lui;
import defpackage.sxf0;
import defpackage.uw90;
import defpackage.zpa0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 82\u00020\u0001:\u00079:;<=>8B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006?"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lokhttp3/internal/connection/BufferedSocket;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Luw90;", "createRequestBody", "(Lokhttp3/Request;J)Luw90;", "", "cancel", "()V", "writeRequestHeaders", "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lzpa0;", "openResponseBodySource", "(Lokhttp3/Response;)Lzpa0;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "skipConnectBody", "(Lokhttp3/Response;)V", "b", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "c", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket", "()Lokhttp3/internal/connection/BufferedSocket;", "isResponseComplete", "()Z", "Companion", "KnownLengthSink", "ChunkedSink", "AbstractSource", "FixedLengthSource", "ChunkedSource", "UnknownLengthSource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Headers g = Headers.INSTANCE.of("OkHttp-Response-Body", "Truncated");
    public final OkHttpClient a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final ExchangeCodec.Carrier carrier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final BufferedSocket socket;
    public int d;
    public final HeadersReader e;
    public Headers f;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lzpa0;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Lsxf0;", "timeout", "()Lsxf0;", "Llb5;", "sink", "", "byteCount", "read", "(Llb5;J)J", "Lokhttp3/Headers;", "trailers", "", "responseBodyComplete", "(Lokhttp3/Headers;)V", "a", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public abstract class AbstractSource implements zpa0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final HttpUrl url;
        public final lui b;
        public boolean c;
        public final /* synthetic */ Http1ExchangeCodec d;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            httpUrl.getClass();
            this.d = http1ExchangeCodec;
            this.url = httpUrl;
            this.b = new lui(http1ExchangeCodec.getSocket().getSource().getA());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        public final HttpUrl getUrl() {
            return this.url;
        }

        @Override // defpackage.zpa0
        public long read(lb5 sink, long byteCount) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = this.d;
            sink.getClass();
            try {
                return http1ExchangeCodec.getSocket().getSource().read(sink, byteCount);
            } catch (IOException e) {
                http1ExchangeCodec.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.g);
                throw e;
            }
        }

        public final void responseBodyComplete(Headers trailers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            trailers.getClass();
            Http1ExchangeCodec http1ExchangeCodec = this.d;
            if (http1ExchangeCodec.d == 6) {
                return;
            }
            if (http1ExchangeCodec.d != 5) {
                iyi.a(http1ExchangeCodec.d, "state: ");
                return;
            }
            Http1ExchangeCodec.access$detachTimeout(http1ExchangeCodec, this.b);
            http1ExchangeCodec.f = trailers;
            http1ExchangeCodec.d = 6;
            if (trailers.size() <= 0 || (okHttpClient = http1ExchangeCodec.a) == null || (cookieJar = okHttpClient.cookieJar()) == null) {
                return;
            }
            HttpHeaders.receiveHeaders(cookieJar, this.url, trailers);
        }

        @Override // defpackage.zpa0
        /* JADX INFO: renamed from: timeout */
        public sxf0 getA() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Luw90;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lsxf0;", "timeout", "()Lsxf0;", "Llb5;", "source", "", "byteCount", "", "write", "(Llb5;J)V", "flush", "()V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ChunkedSink implements uw90 {
        public final lui a;
        public boolean b;

        public ChunkedSink() {
            this.a = new lui(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1ExchangeCodec.this.getSocket().getSink().R("0\r\n\r\n");
            Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.a);
            Http1ExchangeCodec.this.d = 3;
        }

        @Override // defpackage.uw90, java.io.Flushable
        public synchronized void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // defpackage.uw90
        public sxf0 timeout() {
            return this.a;
        }

        @Override // defpackage.uw90
        public void write(lb5 source, long byteCount) {
            source.getClass();
            if (this.b) {
                ib5.a("closed");
                return;
            }
            if (byteCount == 0) {
                return;
            }
            bc5 sink = Http1ExchangeCodec.this.getSocket().getSink();
            sink.j1(byteCount);
            sink.R("\r\n");
            sink.write(source, byteCount);
            sink.R("\r\n");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Llb5;", "sink", "", "byteCount", "read", "(Llb5;J)J", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ChunkedSource extends AbstractSource {
        public long e;
        public boolean f;
        public final /* synthetic */ Http1ExchangeCodec i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.i = http1ExchangeCodec;
            this.e = -1L;
            this.f = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            if (this.f && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.i.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.g);
            }
            this.c = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        
            if (r10.f == false) goto L27;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.zpa0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(defpackage.lb5 r11, long r12) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.read(lb5, long):long");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;J)V", "Llb5;", "sink", "byteCount", "read", "(Llb5;J)J", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class FixedLengthSource extends AbstractSource {
        public long e;
        public final /* synthetic */ Http1ExchangeCodec f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.f = http1ExchangeCodec;
            this.e = j;
            if (j == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            if (this.e != 0 && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.f.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.g);
            }
            this.c = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.zpa0
        public long read(lb5 sink, long byteCount) throws IOException {
            sink.getClass();
            if (byteCount < 0) {
                kb5.a(avg.a(byteCount, "byteCount < 0: "));
                return 0L;
            }
            if (this.c) {
                ib5.a("closed");
                return 0L;
            }
            long j = this.e;
            if (j == 0) {
                return -1L;
            }
            long j2 = super.read(sink, Math.min(j, byteCount));
            if (j2 == -1) {
                this.f.getCarrier().noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete(Http1ExchangeCodec.g);
                throw protocolException;
            }
            long j3 = this.e - j2;
            this.e = j3;
            if (j3 == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
            return j2;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Luw90;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lsxf0;", "timeout", "()Lsxf0;", "Llb5;", "source", "", "byteCount", "", "write", "(Llb5;J)V", "flush", "()V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class KnownLengthSink implements uw90 {
        public final lui a;
        public boolean b;

        public KnownLengthSink() {
            this.a = new lui(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            lui luiVar = this.a;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            Http1ExchangeCodec.access$detachTimeout(http1ExchangeCodec, luiVar);
            http1ExchangeCodec.d = 3;
        }

        @Override // defpackage.uw90, java.io.Flushable
        public void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // defpackage.uw90
        public sxf0 timeout() {
            return this.a;
        }

        @Override // defpackage.uw90
        public void write(lb5 source, long byteCount) {
            source.getClass();
            if (this.b) {
                ib5.a("closed");
            } else {
                _UtilCommonKt.checkOffsetAndCount(source.b, 0L, byteCount);
                Http1ExchangeCodec.this.getSocket().getSink().write(source, byteCount);
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Llb5;", "sink", "", "byteCount", "read", "(Llb5;J)J", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class UnknownLengthSource extends AbstractSource {
        public boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            if (!this.e) {
                responseBodyComplete(Http1ExchangeCodec.g);
            }
            this.c = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.zpa0
        public long read(lb5 sink, long byteCount) throws IOException {
            sink.getClass();
            if (byteCount < 0) {
                kb5.a(avg.a(byteCount, "byteCount < 0: "));
                return 0L;
            }
            if (this.c) {
                ib5.a("closed");
                return 0L;
            }
            if (this.e) {
                return -1L;
            }
            long j = super.read(sink, byteCount);
            if (j != -1) {
                return j;
            }
            this.e = true;
            responseBodyComplete(Headers.EMPTY);
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, BufferedSocket bufferedSocket) {
        carrier.getClass();
        bufferedSocket.getClass();
        this.a = okHttpClient;
        this.carrier = carrier;
        this.socket = bufferedSocket;
        this.e = new HeadersReader(getSocket().getSource());
    }

    public static final void access$detachTimeout(Http1ExchangeCodec http1ExchangeCodec, lui luiVar) {
        http1ExchangeCodec.getClass();
        sxf0 sxf0Var = luiVar.e;
        sxf0 sxf0Var2 = sxf0.NONE;
        sxf0Var2.getClass();
        luiVar.e = sxf0Var2;
        sxf0Var.clearDeadline();
        sxf0Var.clearTimeout();
    }

    public final zpa0 a(HttpUrl httpUrl, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new FixedLengthSource(this, httpUrl, j);
        }
        ai50.b(this.d, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getCarrier().mo249cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public uw90 createRequestBody(Request request, long contentLength) throws ProtocolException {
        request.getClass();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null && requestBodyBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new ChunkedSink();
            }
            ai50.b(this.d, "state: ");
            return null;
        }
        if (contentLength == -1) {
            ib5.a("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new KnownLengthSink();
        }
        ai50.b(this.d, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public boolean isResponseComplete() {
        return this.d == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public zpa0 openResponseBodySource(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return a(response.request().url(), 0L);
        }
        if ("chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) {
            HttpUrl httpUrlUrl = response.request().url();
            if (this.d == 4) {
                this.d = 5;
                return new ChunkedSource(this, httpUrlUrl);
            }
            ai50.b(this.d, "state: ");
            return null;
        }
        long jHeadersContentLength = _UtilJvmKt.headersContentLength(response);
        if (jHeadersContentLength != -1) {
            return a(response.request().url(), jHeadersContentLength);
        }
        HttpUrl httpUrlUrl2 = response.request().url();
        if (this.d != 4) {
            ai50.b(this.d, "state: ");
            return null;
        }
        this.d = 5;
        getCarrier().noNewExchanges();
        return new UnknownLengthSource(this, httpUrlUrl2);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers peekTrailers() throws IOException {
        Headers headers = this.f;
        if (headers == g) {
            i08.a("Trailers cannot be read because the response body was truncated");
            return null;
        }
        int i = this.d;
        if (i == 5 || i == 6) {
            return headers;
        }
        ai50.b(this.d, "Trailers cannot be read because the state is ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        HeadersReader headersReader = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            ai50.b(this.d, "state: ");
            return null;
        }
        try {
            StatusLine statusLine = StatusLine.INSTANCE.parse(headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(headersReader.readHeaders());
            if (expectContinue && statusLine.code == 100) {
                return null;
            }
            int i2 = statusLine.code;
            if (i2 == 100) {
                this.d = 3;
                return builderHeaders;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return builderHeaders;
            }
            this.d = 3;
            return builderHeaders;
        } catch (EOFException e) {
            throw new IOException(inm.a("unexpected end of stream on ", getCarrier().getRoute().address().url().redact()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) {
            return -1L;
        }
        return _UtilJvmKt.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) throws IOException {
        response.getClass();
        long jHeadersContentLength = _UtilJvmKt.headersContentLength(response);
        if (jHeadersContentLength == -1) {
            return;
        }
        zpa0 zpa0VarA = a(response.request().url(), jHeadersContentLength);
        _UtilJvmKt.skipAll(zpa0VarA, Reader.READ_DONE, TimeUnit.MILLISECONDS);
        zpa0VarA.close();
    }

    public final void writeRequest(Headers headers, String requestLine) {
        headers.getClass();
        requestLine.getClass();
        if (this.d != 0) {
            ai50.b(this.d, "state: ");
            return;
        }
        getSocket().getSink().R(requestLine).R("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            getSocket().getSink().R(headers.name(i)).R(": ").R(headers.value(i)).R("\r\n");
        }
        getSocket().getSink().R("\r\n");
        this.d = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        request.getClass();
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getCarrier().getRoute().proxy().type();
        type.getClass();
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public BufferedSocket getSocket() {
        return this.socket;
    }
}
