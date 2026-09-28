package okhttp3.internal.http2;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import defpackage.cc5;
import defpackage.ddk0;
import defpackage.dq40;
import defpackage.ib5;
import defpackage.inm;
import defpackage.lb5;
import defpackage.rl5;
import defpackage.uf80;
import defpackage.yk10;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Header;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 µ\u00012\u00020\u00012\u00020\u0002:\b¶\u0001·\u0001¸\u0001µ\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00100\u001a\u00020+H\u0000¢\u0006\u0004\b1\u0010.J\u001f\u00106\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00105J%\u0010:\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0013¢\u0006\u0004\b<\u0010=J\r\u0010:\u001a\u00020\u0013¢\u0006\u0004\b:\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00020\u0013¢\u0006\u0004\b?\u0010=J\u0015\u0010@\u001a\u00020\u00132\u0006\u00100\u001a\u00020+¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\bB\u0010=J)\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020+2\b\u0010F\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\u00132\b\b\u0002\u0010I\u001a\u00020\u001bH\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u0011¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0013H\u0000¢\u0006\u0004\bS\u0010=J\u0017\u0010W\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\bU\u0010VJ%\u0010Z\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\bX\u0010YJ-\u0010^\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010[\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\\\u0010]J/\u0010c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u001bH\u0000¢\u0006\u0004\ba\u0010bJ\u001f\u0010e\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\bd\u0010.R\u001a\u0010j\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010p\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR&\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010|\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R%\u0010\u0082\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0004\b\u007f\u0010\t\"\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0086\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010~\u001a\u0005\b\u0084\u0001\u0010\t\"\u0006\b\u0085\u0001\u0010\u0081\u0001R\u001f\u0010\u008b\u0001\u001a\u00030\u0087\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b~\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u0090\u0001\u001a\u00020L8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R(\u0010\u0094\u0001\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u008d\u0001\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001\"\u0005\b\u0093\u0001\u0010OR\u001d\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010\u009f\u0001\u001a\u00020\u00112\u0007\u0010\u009b\u0001\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u008c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010¢\u0001\u001a\u00020\u00112\u0007\u0010\u009b\u0001\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010\u008c\u0001\u001a\u0006\b¡\u0001\u0010\u009e\u0001R \u0010¨\u0001\u001a\u00030£\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001d\u0010®\u0001\u001a\u00030©\u00018\u0006¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010´\u0001\u001a\u00070¯\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006¹\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "", "openStreamCount", "()I", AnalyticsParam.EVENT_PARAM_ID, "Lokhttp3/internal/http2/Http2Stream;", "getStream", "(I)Lokhttp3/internal/http2/Http2Stream;", "streamId", "removeStream$okhttp", "removeStream", "", "read", "", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "pushStream", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "newStream", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Llb5;", "buffer", "byteCount", "writeData", "(IZLlb5;J)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", "statusCode", "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "(ZII)V", "writePingAndAwaitPong", "()V", "awaitPong", "flush", "shutdown", "(Lokhttp3/internal/http2/ErrorCode;)V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "start", "(Z)V", "Lokhttp3/internal/http2/Settings;", EventGroupType.SETTINGS_GROUP, "setSettings", "(Lokhttp3/internal/http2/Settings;)V", "nowNs", "isHealthy", "(J)Z", "sendDegradedPingLater$okhttp", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lcc5;", "source", "pushDataLater$okhttp", "(ILcc5;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "a", "Z", "getClient$okhttp", "()Z", "client", "Lokhttp3/internal/http2/Http2Connection$Listener;", "b", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "", "c", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "streams", "", "d", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "connectionName", "e", "I", "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "lastGoodStreamId", "f", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "nextStreamId", "Lokhttp3/internal/http2/FlowControlListener;", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "flowControlListener", "J", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "okHttpSettings", "K", "getPeerSettings", "setPeerSettings", "peerSettings", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "L", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "getReadBytes", "()Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "readBytes", "value", "M", "getWriteBytesTotal", "()J", "writeBytesTotal", "N", "getWriteBytesMaximum", "writeBytesMaximum", "Lokhttp3/internal/connection/BufferedSocket;", "O", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket$okhttp", "()Lokhttp3/internal/connection/BufferedSocket;", "socket", "Lokhttp3/internal/http2/Http2Writer;", "P", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Q", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Companion", "Builder", "ReaderRunnable", "Listener", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Http2Connection implements Closeable, Lockable {
    public static final int AWAIT_PING = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    public static final Settings S;
    public final PushObserver A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final FlowControlListener flowControlListener;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final Settings okHttpSettings;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Settings peerSettings;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final WindowCounter readBytes;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public long writeBytesTotal;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public long writeBytesMaximum;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final BufferedSocket socket;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final Http2Writer writer;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final ReaderRunnable readerRunnable;
    public final LinkedHashSet R;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Listener listener;
    public final LinkedHashMap c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String connectionName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int lastGoodStreamId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int nextStreamId;
    public boolean i;
    public final TaskRunner v;
    public final TaskQueue w;
    public final TaskQueue y;
    public final TaskQueue z;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\t\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "", "client", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "", "peerName", "(Lokhttp3/internal/connection/BufferedSocket;Ljava/lang/String;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "(Lokhttp3/internal/http2/Http2Connection$Listener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "(Lokhttp3/internal/http2/PushObserver;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "(I)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/FlowControlListener;", "flowControlListener", "(Lokhttp3/internal/http2/FlowControlListener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection;", "build", "()Lokhttp3/internal/http2/Http2Connection;", "a", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "b", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket$okhttp", "()Lokhttp3/internal/connection/BufferedSocket;", "setSocket$okhttp", "(Lokhttp3/internal/connection/BufferedSocket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "c", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "d", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "e", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "f", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "setFlowControlListener$okhttp", "(Lokhttp3/internal/http2/FlowControlListener;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean client;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final TaskRunner taskRunner;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public Listener listener;
        public String connectionName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public PushObserver pushObserver;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public int pingIntervalMillis;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public FlowControlListener flowControlListener;
        public BufferedSocket socket;

        public Builder(boolean z, TaskRunner taskRunner) {
            taskRunner.getClass();
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
            this.flowControlListener = FlowControlListener.None.INSTANCE;
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final Builder flowControlListener(FlowControlListener flowControlListener) {
            flowControlListener.getClass();
            this.flowControlListener = flowControlListener;
            return this;
        }

        /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.n("connectionName");
            throw null;
        }

        /* JADX INFO: renamed from: getFlowControlListener$okhttp, reason: from getter */
        public final FlowControlListener getFlowControlListener() {
            return this.flowControlListener;
        }

        /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
        public final Listener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        /* JADX INFO: renamed from: getPushObserver$okhttp, reason: from getter */
        public final PushObserver getPushObserver() {
            return this.pushObserver;
        }

        public final BufferedSocket getSocket$okhttp() {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket != null) {
                return bufferedSocket;
            }
            Intrinsics.n("socket");
            throw null;
        }

        /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            str.getClass();
            this.connectionName = str;
        }

        public final void setFlowControlListener$okhttp(FlowControlListener flowControlListener) {
            flowControlListener.getClass();
            this.flowControlListener = flowControlListener;
        }

        public final void setListener$okhttp(Listener listener) {
            listener.getClass();
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
        }

        public final void setSocket$okhttp(BufferedSocket bufferedSocket) {
            bufferedSocket.getClass();
            this.socket = bufferedSocket;
        }

        public final Builder socket(BufferedSocket socket, String peerName) {
            String strA;
            socket.getClass();
            peerName.getClass();
            setSocket$okhttp(socket);
            if (this.client) {
                strA = _UtilJvmKt.okHttpName + ' ' + peerName;
            } else {
                strA = inm.a("MockWebServer ", peerName);
            }
            setConnectionName$okhttp(strA);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "OKHTTP_CLIENT_WINDOW_SIZE", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.S;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "onStream", "", "stream", "Lokhttp3/internal/http2/Http2Stream;", "onSettings", EventGroupType.CONNECTION_EVENT_GROUP, "Lokhttp3/internal/http2/Http2Connection;", EventGroupType.SETTINGS_GROUP, "Lokhttp3/internal/http2/Settings;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) {
                stream.getClass();
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(Http2Connection connection, Settings settings) {
            connection.getClass();
            settings.getClass();
        }

        public abstract void onStream(Http2Stream stream);
    }

    static {
        Settings settings = new Settings();
        settings.set(4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        S = settings;
    }

    public Http2Connection(Builder builder) {
        builder.getClass();
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.c = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.v = taskRunner;
        TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        this.w = taskQueueNewQueue;
        this.y = taskRunner.newQueue();
        this.z = taskRunner.newQueue();
        this.A = builder.getPushObserver();
        this.flowControlListener = builder.getFlowControlListener();
        Settings settings = new Settings();
        if (builder.getClient()) {
            settings.set(4, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = S;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.getInitialWindowSize();
        BufferedSocket socket$okhttp = builder.getSocket$okhttp();
        this.socket = socket$okhttp;
        this.writer = new Http2Writer(socket$okhttp.getSink(), client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(socket$okhttp.getSource(), client));
        this.R = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            taskQueueNewQueue.schedule(yk10.a(connectionName$okhttp, " ping"), nanos, new Function0() { // from class: lnm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    Http2Connection http2Connection = this.a;
                    long j = nanos;
                    Http2Connection.Companion companion = Http2Connection.INSTANCE;
                    synchronized (http2Connection) {
                        long j2 = http2Connection.C;
                        long j3 = http2Connection.B;
                        if (j2 < j3) {
                            z = true;
                        } else {
                            http2Connection.B = j3 + 1;
                            z = false;
                        }
                    }
                    if (z) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.close$okhttp(errorCode, errorCode, null);
                        j = -1;
                    } else {
                        http2Connection.writePing(false, 1, 0);
                    }
                    return Long.valueOf(j);
                }
            });
        }
    }

    public static final void access$failConnection(Http2Connection http2Connection, IOException iOException) {
        http2Connection.getClass();
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        http2Connection.close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        http2Connection.start(z);
    }

    public final void awaitPong() {
        synchronized (this) {
            while (this.G < this.F) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException cause) {
        int i;
        Object[] array;
        connectionCode.getClass();
        streamCode.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.c.isEmpty()) {
                    array = null;
                } else {
                    array = this.c.values().toArray(new Http2Stream[0]);
                    this.c.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.cancel();
        } catch (IOException unused4) {
        }
        this.w.shutdown();
        this.y.shutdown();
        this.z.shutdown();
    }

    public final Http2Stream d(int i, List<Header> list, boolean z) {
        Throwable th;
        Http2Stream http2Stream;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (this.nextStreamId > 1073741823) {
                            try {
                                shutdown(ErrorCode.REFUSED_STREAM);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        try {
                            if (this.i) {
                                throw new ConnectionShutdownException();
                            }
                            int i2 = this.nextStreamId;
                            this.nextStreamId = i2 + 2;
                            http2Stream = new Http2Stream(i2, this, z3, false, null);
                            z2 = !z || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                            if (http2Stream.isOpen()) {
                                this.c.put(Integer.valueOf(i2), http2Stream);
                            }
                            Unit unit = Unit.a;
                            if (i == 0) {
                                this.writer.headers(z3, i2, list);
                            } else {
                                if (this.client) {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                                this.writer.pushPromise(i, i2, list);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th;
                    throw th;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (z2) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void flush() {
        this.writer.flush();
    }

    /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: getConnectionName$okhttp, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* JADX INFO: renamed from: getFlowControlListener$okhttp, reason: from getter */
    public final FlowControlListener getFlowControlListener() {
        return this.flowControlListener;
    }

    /* JADX INFO: renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    /* JADX INFO: renamed from: getSocket$okhttp, reason: from getter */
    public final BufferedSocket getSocket() {
        return this.socket;
    }

    public final Http2Stream getStream(int id) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.c.get(Integer.valueOf(id));
        }
        return http2Stream;
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.c;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final boolean isHealthy(long nowNs) {
        synchronized (this) {
            if (this.i) {
                return false;
            }
            return this.E >= this.D || nowNs < this.H;
        }
    }

    public final Http2Stream newStream(List<Header> requestHeaders, boolean out) {
        requestHeaders.getClass();
        return d(0, requestHeaders, out);
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.c.size();
        }
        return size;
    }

    public final void pushDataLater$okhttp(final int streamId, cc5 source, final int byteCount, final boolean inFinished) {
        source.getClass();
        final lb5 lb5Var = new lb5();
        long j = byteCount;
        source.q0(j);
        source.read(lb5Var, j);
        TaskQueue.execute$default(this.y, this.connectionName + '[' + streamId + "] onData", 0L, false, new Function0() { // from class: knm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Http2Connection http2Connection = this.a;
                int i = streamId;
                lb5 lb5Var2 = lb5Var;
                int i2 = byteCount;
                boolean z = inFinished;
                Http2Connection.Companion companion = Http2Connection.INSTANCE;
                try {
                    boolean zOnData = http2Connection.A.onData(i, lb5Var2, i2, z);
                    if (zOnData) {
                        http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
                    }
                    if (zOnData || z) {
                        synchronized (http2Connection) {
                            http2Connection.R.remove(Integer.valueOf(i));
                            Unit unit = Unit.a;
                        }
                    }
                } catch (IOException unused) {
                }
                return Unit.a;
            }
        }, 6, null);
    }

    public final void pushHeadersLater$okhttp(final int streamId, final List<Header> requestHeaders, final boolean inFinished) {
        requestHeaders.getClass();
        TaskQueue.execute$default(this.y, this.connectionName + '[' + streamId + "] onHeaders", 0L, false, new Function0() { // from class: qnm
            /* JADX WARN: Code duplicated, block: B:17:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:7:0x001b A[Catch: IOException -> 0x002c, TRY_LEAVE, TryCatch #1 {IOException -> 0x002c, blocks: (B:4:0x0010, B:7:0x001b, B:9:0x0027, B:12:0x002a, B:13:0x002b, B:8:0x001c), top: B:19:0x0010, inners: #0 }] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Http2Connection http2Connection = this.a;
                int i = streamId;
                List<Header> list = requestHeaders;
                boolean z = inFinished;
                boolean zOnHeaders = http2Connection.A.onHeaders(i, list, z);
                if (zOnHeaders) {
                    try {
                        http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
                        if (zOnHeaders || z) {
                            synchronized (http2Connection) {
                                http2Connection.R.remove(Integer.valueOf(i));
                                Unit unit = Unit.a;
                            }
                        }
                    } catch (IOException unused) {
                    }
                } else if (zOnHeaders) {
                    synchronized (http2Connection) {
                        http2Connection.R.remove(Integer.valueOf(i));
                        Unit unit2 = Unit.a;
                    }
                } else {
                    synchronized (http2Connection) {
                        http2Connection.R.remove(Integer.valueOf(i));
                        Unit unit3 = Unit.a;
                    }
                }
                return Unit.a;
            }
        }, 6, null);
    }

    public final void pushRequestLater$okhttp(final int streamId, final List<Header> requestHeaders) {
        requestHeaders.getClass();
        synchronized (this) {
            if (this.R.contains(Integer.valueOf(streamId))) {
                writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.R.add(Integer.valueOf(streamId));
            TaskQueue.execute$default(this.y, this.connectionName + '[' + streamId + "] onRequest", 0L, false, new Function0() { // from class: pnm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Http2Connection http2Connection = this.a;
                    int i = streamId;
                    if (http2Connection.A.onRequest(i, requestHeaders)) {
                        try {
                            http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
                            synchronized (http2Connection) {
                                http2Connection.R.remove(Integer.valueOf(i));
                                Unit unit = Unit.a;
                            }
                        } catch (IOException unused) {
                        }
                    }
                    return Unit.a;
                }
            }, 6, null);
        }
    }

    public final void pushResetLater$okhttp(final int streamId, final ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue.execute$default(this.y, this.connectionName + '[' + streamId + "] onReset", 0L, false, new Function0() { // from class: rnm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Http2Connection http2Connection = this.a;
                int i = streamId;
                http2Connection.A.onReset(i, errorCode);
                synchronized (http2Connection) {
                    http2Connection.R.remove(Integer.valueOf(i));
                }
                return Unit.a;
            }
        }, 6, null);
    }

    public final Http2Stream pushStream(int associatedStreamId, List<Header> requestHeaders, boolean out) {
        requestHeaders.getClass();
        if (!this.client) {
            return d(associatedStreamId, requestHeaders, out);
        }
        ib5.a("Client cannot push requests.");
        return null;
    }

    public final boolean pushedStream$okhttp(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final Http2Stream removeStream$okhttp(int streamId) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.c.remove(Integer.valueOf(streamId));
            notifyAll();
        }
        return http2Stream;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.E;
            long j2 = this.D;
            if (j < j2) {
                return;
            }
            this.D = j2 + 1;
            this.H = System.nanoTime() + 1000000000;
            Unit unit = Unit.a;
            TaskQueue.execute$default(this.w, uf80.a(new StringBuilder(), this.connectionName, " ping"), 0L, false, new Function0() { // from class: nnm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Http2Connection.Companion companion = Http2Connection.INSTANCE;
                    this.a.writePing(false, 2, 0);
                    return Unit.a;
                }
            }, 6, null);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        settings.getClass();
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        settings.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.i) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                Unit unit = Unit.a;
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode statusCode) {
        statusCode.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.i) {
                    return;
                }
                this.i = true;
                int i = this.lastGoodStreamId;
                Unit unit = Unit.a;
                this.writer.goAway(i, statusCode, _UtilCommonKt.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start(boolean sendConnectionPreface) {
        if (sendConnectionPreface) {
            Http2Writer http2Writer = this.writer;
            http2Writer.connectionPreface();
            Settings settings = this.okHttpSettings;
            http2Writer.settings(settings);
            int initialWindowSize = settings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                http2Writer.windowUpdate(0, initialWindowSize - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        TaskQueue.execute$default(this.v.newQueue(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    public final void updateConnectionFlowControl$okhttp(long read) {
        synchronized (this) {
            try {
                WindowCounter.update$default(this.readBytes, read, 0L, 2, null);
                long unacknowledged = this.readBytes.getUnacknowledged();
                if (unacknowledged >= this.okHttpSettings.getInitialWindowSize() / 2) {
                    writeWindowUpdateLater$okhttp(0, unacknowledged);
                    WindowCounter.update$default(this.readBytes, 0L, unacknowledged, 1, null);
                }
                this.flowControlListener.receivingConnectionWindowChanged(this.readBytes);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void writeData(int streamId, boolean outFinished, lb5 buffer, long byteCount) {
        long j;
        long j2;
        int iMin;
        long j3;
        if (byteCount == 0) {
            this.writer.data(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j = this.writeBytesTotal;
                            j2 = this.writeBytesMaximum;
                            if (j >= j2) {
                                if (!this.c.containsKey(Integer.valueOf(streamId))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(byteCount, j2 - j), this.writer.getD());
                j3 = iMin;
                this.writeBytesTotal += j3;
                Unit unit = Unit.a;
            }
            byteCount -= j3;
            this.writer.data(outFinished && byteCount == 0, streamId, buffer, iMin);
        }
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, List<Header> alternating) {
        alternating.getClass();
        this.writer.headers(outFinished, streamId, alternating);
    }

    public final void writePing() {
        synchronized (this) {
            this.F++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int streamId, ErrorCode statusCode) {
        statusCode.getClass();
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int streamId, final ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue.execute$default(this.w, this.connectionName + '[' + streamId + "] writeSynReset", 0L, false, new Function0() { // from class: onm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Http2Connection http2Connection = this.a;
                int i = streamId;
                ErrorCode errorCode2 = errorCode;
                Http2Connection.Companion companion = Http2Connection.INSTANCE;
                try {
                    http2Connection.writeSynReset$okhttp(i, errorCode2);
                } catch (IOException e) {
                    ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.close$okhttp(errorCode3, errorCode3, e);
                }
                return Unit.a;
            }
        }, 6, null);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        TaskQueue.execute$default(this.w, this.connectionName + '[' + streamId + "] windowUpdate", 0L, false, new Function0() { // from class: mnm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Http2Connection http2Connection = this.a;
                int i = streamId;
                long j = unacknowledgedBytesRead;
                Http2Connection.Companion companion = Http2Connection.INSTANCE;
                try {
                    http2Connection.writer.windowUpdate(i, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.close$okhttp(errorCode, errorCode, e);
                }
                return Unit.a;
            }
        }, 6, null);
    }

    public final void writePing(boolean reply, int payload1, int payload2) {
        try {
            this.writer.ping(reply, payload1, payload2);
        } catch (IOException e) {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            close$okhttp(errorCode, errorCode, e);
        }
    }

    public final void start() {
        start$default(this, false, 1, null);
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\tJ'\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J/\u00104\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J-\u00108\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b8\u00109J?\u0010@\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "Lokhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "invoke", "()V", "", "inFinished", "", "streamId", "Lcc5;", "source", "length", "data", "(ZILcc5;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", EventGroupType.SETTINGS_GROUP, "(ZLokhttp3/internal/http2/Settings;)V", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lrl5;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lrl5;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", EventKeys.PRIORITY, "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", EventKeys.PROTOCOL, "host", EventKeys.PORT, "maxAge", "alternateService", "(ILjava/lang/String;Lrl5;Ljava/lang/String;IJ)V", "a", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Http2Reader reader;
        public final /* synthetic */ Http2Connection b;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            http2Reader.getClass();
            this.b = http2Connection;
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int streamId, String origin, rl5 protocol, String host, int port, long maxAge) {
            origin.getClass();
            protocol.getClass();
            host.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v2, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r15v3 */
        public final void applyAndAckSettings(boolean clearPrevious, Settings settings) {
            ?? r15;
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            settings.getClass();
            final dq40 dq40Var = new dq40();
            Http2Writer writer = this.b.getWriter();
            final Http2Connection http2Connection = this.b;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (clearPrevious) {
                            r15 = settings;
                        } else {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            r15 = settings2;
                        }
                        dq40Var.a = r15;
                        initialWindowSize = ((long) r15.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                        http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) dq40Var.a);
                        TaskQueue.execute$default(http2Connection.z, http2Connection.getConnectionName() + " onSettings", 0L, false, new Function0() { // from class: vnm
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Http2Connection http2Connection2 = http2Connection;
                                http2Connection2.getListener().onSettings(http2Connection2, (Settings) dq40Var.a);
                                return Unit.a;
                            }
                        }, 6, null);
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) dq40Var.a);
                } catch (IOException e) {
                    Http2Connection.access$failConnection(http2Connection, e);
                }
                Unit unit2 = Unit.a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        Unit unit3 = Unit.a;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean inFinished, int streamId, cc5 source, int length) {
            source.getClass();
            Http2Connection http2Connection = this.b;
            if (http2Connection.pushedStream$okhttp(streamId)) {
                http2Connection.pushDataLater$okhttp(streamId, source, length, inFinished);
                return;
            }
            Http2Stream stream = http2Connection.getStream(streamId);
            if (stream == null) {
                http2Connection.writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                long j = length;
                http2Connection.updateConnectionFlowControl$okhttp(j);
                source.skip(j);
                return;
            }
            stream.receiveData(source, length);
            if (inFinished) {
                stream.receiveHeaders(Headers.EMPTY, true);
            }
        }

        /* JADX INFO: renamed from: getReader$okhttp, reason: from getter */
        public final Http2Reader getReader() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int lastGoodStreamId, ErrorCode errorCode, rl5 debugData) {
            int i;
            Object[] array;
            errorCode.getClass();
            debugData.getClass();
            debugData.d();
            Http2Connection http2Connection = this.b;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.i = true;
                Unit unit = Unit.a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.b.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean inFinished, int streamId, int associatedStreamId, List<Header> headerBlock) {
            headerBlock.getClass();
            boolean zPushedStream$okhttp = this.b.pushedStream$okhttp(streamId);
            final Http2Connection http2Connection = this.b;
            if (zPushedStream$okhttp) {
                http2Connection.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(streamId);
                if (stream != null) {
                    Unit unit = Unit.a;
                    stream.receiveHeaders(_UtilJvmKt.toHeaders(headerBlock), inFinished);
                    return;
                }
                if (http2Connection.i) {
                    return;
                }
                if (streamId <= http2Connection.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(streamId, http2Connection, false, inFinished, _UtilJvmKt.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(streamId);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(streamId), http2Stream);
                TaskQueue.execute$default(http2Connection.v.newQueue(), http2Connection.getConnectionName() + '[' + streamId + "] onStream", 0L, false, new Function0() { // from class: tnm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Http2Connection http2Connection2 = http2Connection;
                        Http2Stream http2Stream2 = http2Stream;
                        try {
                            http2Connection2.getListener().onStream(http2Stream2);
                        } catch (IOException e) {
                            Platform.INSTANCE.get().log("Http2Connection.Listener failure for " + http2Connection2.getConnectionName(), 4, e);
                            try {
                                http2Stream2.close(ErrorCode.PROTOCOL_ERROR, e);
                            } catch (IOException unused) {
                            }
                        }
                        return Unit.a;
                    }
                }, 6, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() throws Throwable {
            Http2Connection http2Connection = this.b;
            Http2Reader http2Reader = this.reader;
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    http2Reader.readConnectionPreface(this);
                    while (http2Reader.nextFrame(false, this)) {
                    }
                    ErrorCode errorCode2 = ErrorCode.NO_ERROR;
                    try {
                        errorCode = ErrorCode.CANCEL;
                        http2Connection.close$okhttp(errorCode2, errorCode, null);
                        this = errorCode2;
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.close$okhttp(errorCode3, errorCode3, e);
                        this = errorCode3;
                    }
                } catch (Throwable th) {
                    th = th;
                    http2Connection.close$okhttp(this, errorCode, e);
                    _UtilCommonKt.closeQuietly(http2Reader);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                this = errorCode;
                http2Connection.close$okhttp(this, errorCode, e);
                _UtilCommonKt.closeQuietly(http2Reader);
                throw th;
            }
            _UtilCommonKt.closeQuietly(http2Reader);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean ack, final int payload1, final int payload2) {
            Http2Connection http2Connection = this.b;
            if (!ack) {
                TaskQueue taskQueue = http2Connection.w;
                String str = this.b.getConnectionName() + " ping";
                final Http2Connection http2Connection2 = this.b;
                TaskQueue.execute$default(taskQueue, str, 0L, false, new Function0() { // from class: snm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        http2Connection2.writePing(true, payload1, payload2);
                        return Unit.a;
                    }
                }, 6, null);
                return;
            }
            synchronized (http2Connection) {
                try {
                    if (payload1 == 1) {
                        http2Connection.C++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            http2Connection.G++;
                            http2Connection.notifyAll();
                        }
                        Unit unit = Unit.a;
                    } else {
                        http2Connection.E++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) {
            requestHeaders.getClass();
            this.b.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int streamId, ErrorCode errorCode) {
            errorCode.getClass();
            Http2Connection http2Connection = this.b;
            if (http2Connection.pushedStream$okhttp(streamId)) {
                http2Connection.pushResetLater$okhttp(streamId, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = http2Connection.removeStream$okhttp(streamId);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean clearPrevious, final Settings settings) {
            settings.getClass();
            Http2Connection http2Connection = this.b;
            TaskQueue.execute$default(http2Connection.w, http2Connection.getConnectionName() + " applyAndAckSettings", 0L, false, new Function0() { // from class: unm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.a.applyAndAckSettings(clearPrevious, settings);
                    return Unit.a;
                }
            }, 6, null);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int streamId, long windowSizeIncrement) {
            Http2Connection http2Connection = this.b;
            if (streamId == 0) {
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    http2Connection.notifyAll();
                    Unit unit = Unit.a;
                }
                return;
            }
            Http2Stream stream = http2Connection.getStream(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(windowSizeIncrement);
                    Unit unit2 = Unit.a;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.a;
        }
    }
}
