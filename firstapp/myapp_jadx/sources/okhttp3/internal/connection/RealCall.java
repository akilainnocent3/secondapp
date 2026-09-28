package okhttp3.internal.connection;

import com.twilio.voice.EventGroupType;
import defpackage.ddk0;
import defpackage.i08;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.p48;
import defpackage.sxf0;
import defpackage.tgp;
import defpackage.y01;
import defpackage.ygp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Tags;
import okhttp3.internal.TagsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002wxB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u0019J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010#J\u000f\u0010-\u001a\u00020$H\u0000¢\u0006\u0004\b,\u0010&J%\u00101\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002032\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00109\u001a\u00020\u001f2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:JK\u0010D\u001a\u0004\u0018\u00010@2\u0006\u0010;\u001a\u0002032\b\b\u0002\u0010<\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\b2\b\b\u0002\u0010>\u001a\u00020\b2\b\b\u0002\u0010?\u001a\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010G\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\bE\u0010FJ\u0011\u0010K\u001a\u0004\u0018\u00010HH\u0000¢\u0006\u0004\bI\u0010JJ\r\u0010L\u001a\u00020\u001f¢\u0006\u0004\bL\u0010!J\r\u0010M\u001a\u00020\u001f¢\u0006\u0004\bM\u0010!J\u0017\u0010Q\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\bH\u0000¢\u0006\u0004\bO\u0010PJ\r\u0010R\u001a\u00020\b¢\u0006\u0004\bR\u0010#J\u000f\u0010V\u001a\u00020SH\u0000¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010#R\u001a\u0010e\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010b\u001a\u0004\bc\u0010dR(\u00108\u001a\u0004\u0018\u0001072\b\u0010f\u001a\u0004\u0018\u0001078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR(\u0010o\u001a\u0004\u0018\u0001032\b\u0010f\u001a\u0004\u0018\u0001038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR \u0010v\u001a\b\u0012\u0004\u0012\u00020q0p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010u¨\u0006y"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "Lsxf0;", "timeout", "()Lsxf0;", "", "T", "Lygp;", "type", "tag", "(Lygp;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function0;", "computeIfAbsent", "(Lygp;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "clone", "()Lokhttp3/Call;", "request", "()Lokhttp3/Request;", "", "cancel", "()V", "isCanceled", "()Z", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "isExecuted", "getResponseWithInterceptorChain$okhttp", "getResponseWithInterceptorChain", "newRoutePlanner", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "enterNetworkInterceptorExchange", "(Lokhttp3/Request;ZLokhttp3/internal/http/RealInterceptorChain;)V", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", EventGroupType.CONNECTION_EVENT_GROUP, "acquireConnectionNoEvents", "(Lokhttp3/internal/connection/RealConnection;)V", "exchange", "requestDone", "responseDone", "socketSourceDone", "socketSinkDone", "Ljava/io/IOException;", "e", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "(Ljava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "upgradeToSocket", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "a", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "b", "Lokhttp3/Request;", "getOriginalRequest", "c", "Z", "getForWebSocket", "Lokhttp3/EventListener;", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "eventListener", "value", "y", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "A", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "interceptorScopedExchange", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "I", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlansToCancel$okhttp", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "plansToCancel", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealCall implements Call, Cloneable, Lockable {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public Exchange interceptorScopedExchange;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public volatile boolean G;
    public volatile Exchange H;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final CopyOnWriteArrayList<RoutePlanner.Plan> plansToCancel;
    public final AtomicReference<Tags> J;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final OkHttpClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Request originalRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean forWebSocket;
    public final RealConnectionPool d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final EventListener eventListener;
    public final AnonymousClass1 f;
    public final AtomicBoolean i;
    public Object v;
    public ExchangeFinder w;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public RealConnection connection;
    public boolean z;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "Lokhttp3/internal/connection/RealCall;", "other", "", "reuseCallsPerHostFrom", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "(Ljava/util/concurrent/ExecutorService;)V", "Ljava/util/concurrent/RejectedExecutionException;", "e", "failRejected$okhttp", "(Ljava/util/concurrent/RejectedExecutionException;)V", "failRejected", "run", "()V", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class AsyncCall implements Runnable {
        public final Callback a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public volatile AtomicInteger callsPerHost;
        public final /* synthetic */ RealCall c;

        public AsyncCall(RealCall realCall, Callback callback) {
            callback.getClass();
            this.c = realCall;
            this.a = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public static /* synthetic */ void failRejected$okhttp$default(AsyncCall asyncCall, RejectedExecutionException rejectedExecutionException, int i, Object obj) {
            if ((i & 1) != 0) {
                rejectedExecutionException = null;
            }
            asyncCall.failRejected$okhttp(rejectedExecutionException);
        }

        public final void executeOn(ExecutorService executorService) {
            executorService.getClass();
            RealCall realCall = this.c;
            _UtilJvmKt.assertLockNotHeld(realCall.getClient().dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    failRejected$okhttp(e);
                    realCall.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                realCall.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final void failRejected$okhttp(RejectedExecutionException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(e);
            RealCall realCall = this.c;
            realCall.noMoreExchanges$okhttp(interruptedIOException);
            this.a.onFailure(realCall, interruptedIOException);
        }

        /* JADX INFO: renamed from: getCall, reason: from getter */
        public final RealCall getC() {
            return this.c;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.c.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.c.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall other) {
            other.getClass();
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            OkHttpClient client;
            Callback callback = this.a;
            StringBuilder sb = new StringBuilder("OkHttp ");
            RealCall realCall = this.c;
            sb.append(realCall.redactedUrl$okhttp());
            String string = sb.toString();
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                realCall.f.enter();
                boolean z = false;
                try {
                    try {
                        try {
                            callback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            client = realCall.getClient();
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Platform.INSTANCE.get().log("Callback failure for " + RealCall.access$toLoggableString(realCall), 4, e);
                            } else {
                                callback.onFailure(realCall, e);
                            }
                            client = realCall.getClient();
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                callback.onFailure(realCall, iOException);
                            }
                            if (!(th instanceof InterruptedException)) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            client = realCall.getClient();
                        }
                    } catch (Throwable th2) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                client.dispatcher().finished$okhttp(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "", "callStackTrace", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            realCall.getClass();
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [okhttp3.internal.connection.RealCall$timeout$1, sxf0] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        okHttpClient.getClass();
        request.getClass();
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.d = okHttpClient.connectionPool().getDelegate();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r5 = new y01() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            @Override // defpackage.y01
            public final void b() {
                RealCall.this.cancel();
            }
        };
        r5.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f = r5;
        this.i = new AtomicBoolean();
        this.F = true;
        this.plansToCancel = new CopyOnWriteArrayList<>();
        this.J = new AtomicReference<>(request.getTags());
    }

    public static final String access$toLoggableString(RealCall realCall) {
        StringBuilder sb = new StringBuilder(realCall.getG() ? "canceled " : "");
        sb.append(realCall.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(realCall.redactedUrl$okhttp());
        return sb.toString();
    }

    public static /* synthetic */ IOException messageDone$okhttp$default(RealCall realCall, Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        return realCall.messageDone$okhttp(exchange, z, z2, z3, z4, iOException);
    }

    public final IOException a(IOException iOException) {
        IOException interruptedIOException;
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z = _UtilJvmKt.assertionsEnabled;
        if (z && Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return null;
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                ddk0.a(Thread.currentThread().getName(), " MUST NOT hold lock on ", realConnection);
                return null;
            }
            synchronized (realConnection) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
                realConnection.getConnectionListener().connectionReleased(realConnection, this);
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    realConnection.getConnectionListener().connectionClosed(realConnection);
                }
            } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                ib5.a("Check failed.");
                return null;
            }
        }
        if (!this.z && exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        EventListener eventListener = this.eventListener;
        if (iOException == null) {
            eventListener.callEnd(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        eventListener.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void acquireConnectionNoEvents(RealConnection connection) {
        connection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", connection);
        } else if (this.connection != null) {
            ib5.a("Check failed.");
        } else {
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.v));
        }
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.G) {
            return;
        }
        this.G = true;
        Exchange exchange = this.H;
        if (exchange != null) {
            exchange.cancel();
        }
        Iterator<RoutePlanner.Plan> it = this.plansToCancel.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().mo249cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public Call clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    public void enqueue(Callback responseCallback) {
        responseCallback.getClass();
        if (!this.i.compareAndSet(false, true)) {
            ib5.a("Already Executed");
            return;
        }
        this.v = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean newRoutePlanner, RealInterceptorChain chain) {
        request.getClass();
        chain.getClass();
        if (this.interceptorScopedExchange != null) {
            ib5.a("Check failed.");
            return;
        }
        synchronized (this) {
            if (this.C) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.B || this.E || this.D) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.a;
        }
        if (newRoutePlanner) {
            RealRoutePlanner realRoutePlanner = new RealRoutePlanner(this.client.getTaskRunner(), this.d, this.client.readTimeoutMillis(), this.client.writeTimeoutMillis(), chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), this.client.pingIntervalMillis(), this.client.retryOnConnectionFailure(), this.client.getFastFallback(), this.client.address(request.url()), this.client.getRouteDatabase(), this, request);
            this.w = this.client.getFastFallback() ? new FastFallbackExchangeFinder(realRoutePlanner, this.client.getTaskRunner()) : new SequentialExchangeFinder(realRoutePlanner);
        }
    }

    @Override // okhttp3.Call
    public Response execute() {
        OkHttpClient okHttpClient = this.client;
        if (!this.i.compareAndSet(false, true)) {
            ib5.a("Already Executed");
            return null;
        }
        enter();
        this.v = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
        try {
            okHttpClient.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            okHttpClient.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        Exchange exchange;
        synchronized (this) {
            if (!this.F) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.a;
        }
        if (closeExchange && (exchange = this.H) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* JADX INFO: renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final CopyOnWriteArrayList<RoutePlanner.Plan> getPlansToCancel$okhttp() {
        return this.plansToCancel;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    public final Response getResponseWithInterceptorChain$okhttp() {
        ArrayList arrayList = new ArrayList();
        OkHttpClient okHttpClient = this.client;
        p48.w(okHttpClient.interceptors(), arrayList);
        arrayList.add(new RetryAndFollowUpInterceptor(okHttpClient));
        arrayList.add(new BridgeInterceptor(okHttpClient.cookieJar()));
        arrayList.add(new CacheInterceptor(okHttpClient.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            p48.w(okHttpClient.networkInterceptors(), arrayList);
        }
        arrayList.add(CallServerInterceptor.INSTANCE);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis());
        boolean z = false;
        try {
            try {
                Response responseProceed = realInterceptorChain.proceed(this.originalRequest);
                if (getG()) {
                    _UtilCommonKt.closeQuietly(responseProceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return responseProceed;
            } catch (IOException e) {
                z = true;
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                iOExceptionNoMoreExchanges$okhttp.getClass();
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (!z) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
        if (!z) {
            noMoreExchanges$okhttp(null);
        }
        throw th;
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain chain) throws IOException {
        chain.getClass();
        synchronized (this) {
            if (!this.F) {
                throw new IllegalStateException("released");
            }
            if (this.C || this.B || this.E || this.D) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.a;
        }
        ExchangeFinder exchangeFinder = this.w;
        exchangeFinder.getClass();
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find().newCodec$okhttp(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.H = exchange;
        synchronized (this) {
            this.B = true;
            this.C = true;
        }
        if (!this.G) {
            return exchange;
        }
        i08.a("Canceled");
        return null;
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: isCanceled, reason: from getter */
    public boolean getG() {
        return this.G;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.i.get();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:8:0x0011, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:58:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:8:0x0011, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:58:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0035 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:8:0x0011, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:58:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:8:0x0011, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x0040, B:34:0x0044, B:36:0x0048, B:41:0x0051, B:46:0x005b, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:58:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004e  */
    public final IOException messageDone$okhttp(Exchange exchange, boolean requestDone, boolean responseDone, boolean socketSourceDone, boolean socketSinkDone, IOException e) {
        boolean z;
        boolean z2;
        boolean z3;
        exchange.getClass();
        if (exchange.equals(this.H)) {
            synchronized (this) {
                z = false;
                if (requestDone) {
                    try {
                        if (this.B) {
                            if (requestDone) {
                                this.B = false;
                            }
                            if (responseDone) {
                                this.C = false;
                            }
                            if (socketSinkDone) {
                                this.D = false;
                            }
                            if (socketSourceDone) {
                                this.E = false;
                            }
                            if (this.B) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z = true;
                            }
                            boolean z4 = z3;
                            z2 = z;
                            z = z4;
                        } else if ((!responseDone && this.C) || ((socketSinkDone && this.D) || (socketSourceDone && this.E))) {
                            if (requestDone) {
                                this.B = false;
                            }
                            if (responseDone) {
                                this.C = false;
                            }
                            if (socketSinkDone) {
                                this.D = false;
                            }
                            if (socketSourceDone) {
                                this.E = false;
                            }
                            if (this.B || this.C || this.D || this.E) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3 && !this.F) {
                                z = true;
                            }
                            boolean z5 = z3;
                            z2 = z;
                            z = z5;
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z2 = !responseDone ? false : false;
                    Unit unit2 = Unit.a;
                }
            }
            if (z) {
                this.H = null;
                RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    realConnection.incrementSuccessCount$okhttp();
                }
            }
            if (z2) {
                return a(e);
            }
        }
        return e;
    }

    public final IOException noMoreExchanges$okhttp(IOException e) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.F) {
                    this.F = false;
                    if (!this.B && !this.C && !this.D && !this.E) {
                        z = true;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? a(e) : e;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return null;
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.g(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            ib5.a("Check failed.");
            return null;
        }
        calls.remove(i);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs(System.nanoTime());
            if (this.d.connectionBecameIdle(realConnection)) {
                return realConnection.getE();
            }
        }
        return null;
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        Exchange exchange = this.H;
        if (exchange == null || !exchange.getHasFailure()) {
            return false;
        }
        ExchangeFinder exchangeFinder = this.w;
        exchangeFinder.getClass();
        RoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
        Exchange exchange2 = this.H;
        return routePlanner.hasNext(exchange2 != null ? exchange2.getConnection$okhttp() : null);
    }

    @Override // okhttp3.Call
    public <T> T tag(ygp<T> type) {
        type.getClass();
        return (T) tgp.b(type).cast(this.J.get().get(type));
    }

    @Override // okhttp3.Call
    public sxf0 timeout() {
        return this.f;
    }

    public final void timeoutEarlyExit() {
        if (this.z) {
            ib5.a("Check failed.");
        } else {
            this.z = true;
            exit();
        }
    }

    public final void upgradeToSocket() {
        timeoutEarlyExit();
        synchronized (this) {
            if (this.H == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.D || this.E) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.B) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.C) {
                throw new IllegalStateException("Check failed.");
            }
            this.C = false;
            this.D = true;
            this.E = true;
            Unit unit = Unit.a;
        }
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<? extends T> type) {
        type.getClass();
        return (T) tag(jq40.a(type));
    }

    @Override // okhttp3.Call
    public <T> T tag(ygp<T> type, Function0<? extends T> computeIfAbsent) {
        type.getClass();
        computeIfAbsent.getClass();
        return (T) TagsKt.computeIfAbsent(this.J, type, computeIfAbsent);
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<T> type, Function0<? extends T> computeIfAbsent) {
        type.getClass();
        computeIfAbsent.getClass();
        return (T) TagsKt.computeIfAbsent(this.J, jq40.a(type), computeIfAbsent);
    }
}
