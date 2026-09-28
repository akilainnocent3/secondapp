package okhttp3.internal.ws;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.twilio.voice.EventKeys;
import defpackage.ddk0;
import defpackage.dq40;
import defpackage.fja0;
import defpackage.hb5;
import defpackage.r2z;
import defpackage.rl5;
import defpackage.uw90;
import defpackage.zdf0;
import defpackage.zk1;
import defpackage.zpa0;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.connection.BufferedSocketKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004cdebBI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#J%\u0010*\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020)¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0018¢\u0006\u0004\b0\u0010\u001aJ\r\u00101\u001a\u00020\u0018¢\u0006\u0004\b1\u0010\u001aJ\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u000202¢\u0006\u0004\b5\u00104J\r\u00106\u001a\u000202¢\u0006\u0004\b6\u00104J\u0017\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b8\u0010<J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020\u00182\u0006\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010<J\u001f\u0010B\u001a\u00020\u00182\u0006\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020%H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020)2\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\u00020)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bD\u0010FJ\u0015\u0010G\u001a\u00020)2\u0006\u0010=\u001a\u00020:¢\u0006\u0004\bG\u0010FJ!\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bH\u0010IJ'\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010%2\u0006\u0010J\u001a\u00020\f¢\u0006\u0004\bH\u0010KJ\u000f\u0010M\u001a\u00020)H\u0000¢\u0006\u0004\bL\u0010/J\u000f\u0010O\u001a\u00020\u0018H\u0000¢\u0006\u0004\bN\u0010\u001aJ/\u0010T\u001a\u00020\u00182\n\u0010R\u001a\u00060Pj\u0002`Q2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010S\u001a\u00020)¢\u0006\u0004\bT\u0010UR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "webSocketCloseTimeout", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;JJ)V", "request", "()Lokhttp3/Request;", "queueSize", "()J", "", "cancel", "()V", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Lfja0;", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;)Lfja0;", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/connection/BufferedSocket;Z)V", "loopReader", "(Lokhttp3/Response;)V", "processNextFrame", "()Z", "finishReader", "tearDown", "", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "(Ljava/lang/String;)V", "Lrl5;", "bytes", "(Lrl5;)V", EventKeys.PAYLOAD, "onReadPing", "onReadPong", EventKeys.ERROR_CODE, "reason", "onReadClose", "(ILjava/lang/String;)V", "send", "(Ljava/lang/String;)Z", "(Lrl5;)Z", "pong", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "isWriter", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;Z)V", "b", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Lokhttp3/Call;", "w", "Lokhttp3/Call;", "getCall$okhttp", "()Lokhttp3/Call;", "setCall$okhttp", "(Lokhttp3/Call;)V", "call", "Companion", "Message", "Close", "WriterTask", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    public WebSocketWriter A;
    public final TaskQueue B;
    public String C;
    public BufferedSocket D;
    public final ArrayDeque<rl5> E;
    public final ArrayDeque<Object> F;
    public long G;
    public boolean H;
    public int I;
    public String J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public final Request a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final WebSocketListener listener;
    public final Random c;
    public final long d;
    public WebSocketExtensions e;
    public final long f;
    public final long i;
    public final String v;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public Call call;
    public Task y;
    public WebSocketReader z;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final List<Protocol> P = a.c(Protocol.HTTP_1_1);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", EventKeys.ERROR_CODE, "Lrl5;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILrl5;J)V", "a", "I", "getCode", "()I", "b", "Lrl5;", "getReason", "()Lrl5;", "c", "J", "getCancelAfterCloseMillis", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Close {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final rl5 reason;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long cancelAfterCloseMillis;

        public Close(int i, rl5 rl5Var, long j) {
            this.code = i;
            this.reason = rl5Var;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final rl5 getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "<init>", "()V", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "MAX_QUEUE_SIZE", "", "CANCEL_AFTER_CLOSE_MILLIS", "DEFAULT_MINIMUM_DEFLATE_SIZE", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "Lrl5;", "data", "<init>", "(ILrl5;)V", "a", "I", "getFormatOpcode", "()I", "b", "Lrl5;", "getData", "()Lrl5;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Message {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int formatOpcode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final rl5 data;

        public Message(int i, rl5 rl5Var) {
            rl5Var.getClass();
            this.formatOpcode = i;
            this.data = rl5Var;
        }

        public final rl5 getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.C + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2, long j3) {
        taskRunner.getClass();
        request.getClass();
        webSocketListener.getClass();
        random.getClass();
        this.a = request;
        this.listener = webSocketListener;
        this.c = random;
        this.d = j;
        this.e = webSocketExtensions;
        this.f = j2;
        this.i = j3;
        this.B = taskRunner.newQueue();
        this.E = new ArrayDeque<>();
        this.F = new ArrayDeque<>();
        this.I = -1;
        if (!"GET".equals(request.method())) {
            r2z.a(request.method(), "Request must be GET: ");
            throw null;
        }
        rl5 rl5Var = rl5.d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.a;
        this.v = rl5.a.d(bArr).a();
    }

    public static final boolean access$isValid(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        realWebSocket.getClass();
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        return 8 <= iIntValue && iIntValue < 16;
    }

    public static /* synthetic */ void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            response = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        realWebSocket.failWebSocket(exc, response, z);
    }

    public final void a() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        Task task = this.y;
        if (task != null) {
            TaskQueue.schedule$default(this.B, task, 0L, 2, null);
        }
    }

    public final synchronized boolean b(int i, rl5 rl5Var) {
        if (!this.K && !this.H) {
            if (this.G + ((long) rl5Var.d()) > 16777216) {
                close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null);
                return false;
            }
            this.G += (long) rl5Var.d();
            this.F.add(new Message(i, rl5Var));
            a();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        call.getClass();
        call.cancel();
    }

    public final fja0 checkUpgradeSuccess$okhttp(Response response) throws ProtocolException {
        response.getClass();
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!"Upgrade".equalsIgnoreCase(strHeader$default)) {
            throw new ProtocolException(zdf0.a('\'', "Expected 'Connection' header value 'Upgrade' but was '", strHeader$default));
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!"websocket".equalsIgnoreCase(strHeader$default2)) {
            throw new ProtocolException(zdf0.a('\'', "Expected 'Upgrade' header value 'websocket' but was '", strHeader$default2));
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        rl5 rl5Var = rl5.d;
        String strA = rl5.a.c(this.v + WebSocketProtocol.ACCEPT_MAGIC).c("SHA-1").a();
        if (Intrinsics.g(strA, strHeader$default3)) {
            fja0 socket = response.getSocket();
            if (socket != null) {
                return socket;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strHeader$default3 + '\'');
    }

    public final synchronized boolean close(int code, String reason, long cancelAfterCloseMillis) {
        rl5 rl5VarC;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(code);
            if (reason != null) {
                rl5 rl5Var = rl5.d;
                rl5VarC = rl5.a.c(reason);
                if (rl5VarC.a.length > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(reason).toString());
                }
            } else {
                rl5VarC = null;
            }
            if (!this.K && !this.H) {
                this.H = true;
                this.F.add(new Close(code, rl5VarC, cancelAfterCloseMillis));
                a();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    public final void failWebSocket(Exception e, Response response, boolean isWriter) {
        WebSocketWriter webSocketWriter;
        e.getClass();
        final dq40 dq40Var = new dq40();
        synchronized (this) {
            try {
                if (this.K) {
                    return;
                }
                this.K = true;
                BufferedSocket bufferedSocket = this.D;
                ?? r0 = this.A;
                dq40Var.a = r0;
                this.A = null;
                if (!isWriter && r0 != 0) {
                    TaskQueue.execute$default(this.B, this.C + " writer close", 0L, false, new Function0() { // from class: ab40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RealWebSocket.Companion companion = RealWebSocket.INSTANCE;
                            _UtilCommonKt.closeQuietly((Closeable) dq40Var.a);
                            return Unit.a;
                        }
                    }, 2, null);
                }
                this.B.shutdown();
                Unit unit = Unit.a;
                try {
                    this.listener.onFailure(this, e, response);
                } finally {
                    if (bufferedSocket != null) {
                        bufferedSocket.cancel();
                    }
                    if (isWriter && (webSocketWriter = (WebSocketWriter) dq40Var.a) != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finishReader() {
        int i;
        String str;
        WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            try {
                i = this.I;
                str = this.J;
                webSocketReader = this.z;
                this.z = null;
                if (this.H && this.F.isEmpty()) {
                    final WebSocketWriter webSocketWriter = this.A;
                    if (webSocketWriter != null) {
                        this.A = null;
                        TaskQueue.execute$default(this.B, this.C + " writer close", 0L, false, new Function0() { // from class: ya40
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                RealWebSocket.Companion companion = RealWebSocket.INSTANCE;
                                _UtilCommonKt.closeQuietly(webSocketWriter);
                                return Unit.a;
                            }
                        }, 2, null);
                    }
                    this.B.shutdown();
                }
                z = (this.K || this.A != null || this.I == -1) ? false : true;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            WebSocketListener webSocketListener = this.listener;
            str.getClass();
            webSocketListener.onClosed(this, i, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final Call getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(String name, BufferedSocket socket, boolean client) {
        name.getClass();
        socket.getClass();
        WebSocketExtensions webSocketExtensions = this.e;
        webSocketExtensions.getClass();
        synchronized (this) {
            try {
                this.C = name;
                this.D = socket;
                this.A = new WebSocketWriter(client, socket.getSink(), this.c, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(client), this.f);
                this.y = new WriterTask();
                long j = this.d;
                if (j != 0) {
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.B.schedule(name.concat(" ping"), nanos, new Function0() { // from class: za40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RealWebSocket.Companion companion = RealWebSocket.INSTANCE;
                            this.a.writePingFrame$okhttp();
                            return Long.valueOf(nanos);
                        }
                    });
                }
                if (!this.F.isEmpty()) {
                    a();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.z = new WebSocketReader(client, socket.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!client));
    }

    public final void loopReader(Response response) throws Throwable {
        Throwable th;
        RealWebSocket realWebSocket;
        response.getClass();
        try {
            this.listener.onOpen(this, response);
            while (this.I == -1) {
                WebSocketReader webSocketReader = this.z;
                webSocketReader.getClass();
                webSocketReader.processNextFrame();
            }
            finishReader();
        } catch (Exception e) {
            realWebSocket = this;
            try {
                failWebSocket$default(realWebSocket, e, null, false, 6, null);
                realWebSocket.finishReader();
            } catch (Throwable th2) {
                th = th2;
                realWebSocket.finishReader();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            realWebSocket = this;
            realWebSocket.finishReader();
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, String reason) {
        reason.getClass();
        if (code == -1) {
            hb5.a("Failed requirement.");
            return;
        }
        synchronized (this) {
            if (this.I != -1) {
                throw new IllegalStateException("already closed");
            }
            this.I = code;
            this.J = reason;
            Unit unit = Unit.a;
        }
        this.listener.onClosing(this, code, reason);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String text) {
        text.getClass();
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(rl5 payload) {
        try {
            payload.getClass();
            if (!this.K && (!this.H || !this.F.isEmpty())) {
                this.E.add(payload);
                a();
                this.M++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(rl5 payload) {
        payload.getClass();
        this.N++;
        this.O = false;
    }

    public final synchronized boolean pong(rl5 payload) {
        try {
            payload.getClass();
            if (!this.K && (!this.H || !this.F.isEmpty())) {
                this.E.add(payload);
                a();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.z;
            webSocketReader.getClass();
            webSocketReader.processNextFrame();
            return this.I == -1;
        } catch (Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.G;
    }

    public final synchronized int receivedPingCount() {
        return this.M;
    }

    public final synchronized int receivedPongCount() {
        return this.N;
    }

    @Override // okhttp3.WebSocket
    /* JADX INFO: renamed from: request, reason: from getter */
    public Request getA() {
        return this.a;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String text) {
        text.getClass();
        rl5 rl5Var = rl5.d;
        return b(1, rl5.a.c(text));
    }

    public final synchronized int sentPingCount() {
        return this.L;
    }

    public final void setCall$okhttp(Call call) {
        this.call = call;
    }

    public final void tearDown() throws InterruptedException {
        TaskQueue taskQueue = this.B;
        taskQueue.shutdown();
        taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() {
        String str;
        int i;
        WebSocketWriter webSocketWriter;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.K) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.A;
                rl5 rl5VarPoll = this.E.poll();
                Object obj = null;
                if (rl5VarPoll == null) {
                    Object objPoll = this.F.poll();
                    if (objPoll instanceof Close) {
                        i = this.I;
                        str = this.J;
                        if (i != -1) {
                            webSocketWriter = this.A;
                            this.A = null;
                            if (webSocketWriter != null && this.z == null) {
                                z = true;
                            }
                            this.B.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                            TaskQueue.execute$default(this.B, this.C + " cancel", TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new Function0() { // from class: xa40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    RealWebSocket.Companion companion = RealWebSocket.INSTANCE;
                                    this.a.cancel();
                                    return Unit.a;
                                }
                            }, 4, null);
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        webSocketWriter = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    webSocketWriter = null;
                }
                Unit unit = Unit.a;
                try {
                    if (rl5VarPoll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writePong(rl5VarPoll);
                    } else if (obj instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeMessageFrame(((Message) obj).getFormatOpcode(), ((Message) obj).getData());
                        synchronized (this) {
                            this.G -= (long) ((Message) obj).getData().d();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeClose(((Close) obj).getCode(), ((Close) obj).getReason());
                        if (z) {
                            WebSocketListener webSocketListener = this.listener;
                            str.getClass();
                            webSocketListener.onClosed(this, i, str);
                        }
                    }
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                    return true;
                } catch (Throwable th) {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.K) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.A;
                if (webSocketWriter == null) {
                    return;
                }
                int i = this.O ? this.L : -1;
                this.L++;
                this.O = true;
                Unit unit = Unit.a;
                if (i != -1) {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.d);
                    sb.append("ms (after ");
                    failWebSocket$default(this, new SocketTimeoutException(zk1.a(i - 1, " successful ping/pongs)", sb)), null, true, 2, null);
                    return;
                }
                try {
                    webSocketWriter.writePing(rl5.d);
                } catch (IOException e) {
                    failWebSocket$default(this, e, null, true, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void connect(OkHttpClient client) {
        client.getClass();
        Request request = this.a;
        if (request.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(P).build();
        final Request requestBuild = request.newBuilder().header("Upgrade", rarBonoqWB.mdSFOPKWAH).header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.v).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                call.getClass();
                e.getClass();
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, false, 6, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws Throwable {
                zpa0 source;
                uw90 sink;
                call.getClass();
                response.getClass();
                try {
                    fja0 fja0VarCheckUpgradeSuccess$okhttp = RealWebSocket.this.checkUpgradeSuccess$okhttp(response);
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.e = webSocketExtensions;
                    if (!RealWebSocket.access$isValid(RealWebSocket.this, webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.F.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    RealWebSocket.this.initReaderAndWriter(_UtilJvmKt.okHttpName + " WebSocket " + requestBuild.url().redact(), BufferedSocketKt.asBufferedSocket(fja0VarCheckUpgradeSuccess$okhttp), true);
                    RealWebSocket.this.loopReader(response);
                } catch (IOException e) {
                    RealWebSocket.failWebSocket$default(RealWebSocket.this, e, response, false, 4, null);
                    _UtilCommonKt.closeQuietly(response);
                    fja0 socket = response.getSocket();
                    if (socket != null && (sink = socket.getSink()) != null) {
                        _UtilCommonKt.closeQuietly(sink);
                    }
                    fja0 socket2 = response.getSocket();
                    if (socket2 == null || (source = socket2.getSource()) == null) {
                        return;
                    }
                    _UtilCommonKt.closeQuietly(source);
                }
            }
        });
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(rl5 bytes) {
        bytes.getClass();
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(rl5 bytes) {
        bytes.getClass();
        return b(2, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean close(int code, String reason) {
        return close(code, reason, this.i);
    }
}
