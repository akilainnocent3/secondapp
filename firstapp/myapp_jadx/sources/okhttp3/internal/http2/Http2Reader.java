package okhttp3.internal.http2;

import com.google.protobuf.Reader;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import defpackage.cc5;
import defpackage.hce0;
import defpackage.i08;
import defpackage.lb5;
import defpackage.m58;
import defpackage.pe4;
import defpackage.rl5;
import defpackage.sxf0;
import defpackage.whs;
import defpackage.wnm;
import defpackage.zpa0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.c;
import kotlin.ranges.f;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u0014\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lcc5;", "source", "", "client", "<init>", "(Lcc5;Z)V", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "readConnectionPreface", "(Lokhttp3/internal/http2/Http2Reader$Handler;)V", "requireSettings", "nextFrame", "(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Logger e;
    public final cc5 a;
    public final boolean b;
    public final ContinuationSource c;
    public final Hpack.Reader d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.e;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            i08.a(whs.b(padding, length, "PROTOCOL_ERROR padding ", " > remaining length "));
            return 0;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010)\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018¨\u0006*"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lzpa0;", "Lcc5;", "source", "<init>", "(Lcc5;)V", "Llb5;", "sink", "", "byteCount", "read", "(Llb5;J)J", "Lsxf0;", "timeout", "()Lsxf0;", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "", "b", "I", "getLength", "()I", "setLength", "(I)V", "length", "c", "getFlags", "setFlags", "flags", "d", "getStreamId", "setStreamId", "streamId", "e", "getLeft", "setLeft", "left", "f", "getPadding", "setPadding", "padding", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContinuationSource implements zpa0 {
        public final cc5 a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int flags;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int streamId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public int left;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int padding;

        public ContinuationSource(cc5 cc5Var) {
            cc5Var.getClass();
            this.a = cc5Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // defpackage.zpa0
        public long read(lb5 sink, long byteCount) throws IOException {
            int i;
            int i2;
            sink.getClass();
            do {
                int i3 = this.left;
                cc5 cc5Var = this.a;
                if (i3 != 0) {
                    long j = cc5Var.read(sink, Math.min(byteCount, i3));
                    if (j == -1) {
                        return -1L;
                    }
                    this.left -= (int) j;
                    return j;
                }
                cc5Var.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                i = this.streamId;
                int medium = _UtilCommonKt.readMedium(cc5Var);
                this.left = medium;
                this.length = medium;
                int iAnd = _UtilCommonKt.and(cc5Var.readByte(), 255);
                this.flags = _UtilCommonKt.and(cc5Var.readByte(), 255);
                Companion companion = Http2Reader.INSTANCE;
                if (companion.getLogger().isLoggable(Level.FINE)) {
                    companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
                }
                i2 = cc5Var.readInt() & Reader.READ_DONE;
                this.streamId = i2;
                if (iAnd != 9) {
                    i08.a(m58.a(iAnd, " != TYPE_CONTINUATION"));
                    return 0L;
                }
            } while (i2 == i);
            i08.a("TYPE_CONTINUATION streamId changed");
            return 0L;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // defpackage.zpa0
        /* JADX INFO: renamed from: timeout */
        public sxf0 getA() {
            return this.a.getA();
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b1\u00102J?\u00109\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020&H&¢\u0006\u0004\b9\u0010:¨\u0006;À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "inFinished", "", "streamId", "Lcc5;", "source", "length", "", "data", "(ZILcc5;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", EventGroupType.SETTINGS_GROUP, "(ZLokhttp3/internal/http2/Settings;)V", "ackSettings", "()V", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lrl5;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lrl5;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", EventKeys.PRIORITY, "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", EventKeys.PROTOCOL, "host", EventKeys.PORT, "maxAge", "alternateService", "(ILjava/lang/String;Lrl5;Ljava/lang/String;IJ)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Handler {
        void ackSettings();

        void alternateService(int streamId, String origin, rl5 protocol, String host, int port, long maxAge);

        void data(boolean inFinished, int streamId, cc5 source, int length);

        void goAway(int lastGoodStreamId, ErrorCode errorCode, rl5 debugData);

        void headers(boolean inFinished, int streamId, int associatedStreamId, List<Header> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders);

        void rstStream(int streamId, ErrorCode errorCode);

        void settings(boolean clearPrevious, Settings settings);

        void windowUpdate(int streamId, long windowSizeIncrement);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        logger.getClass();
        e = logger;
    }

    public Http2Reader(cc5 cc5Var, boolean z) {
        cc5Var.getClass();
        this.a = cc5Var;
        this.b = z;
        ContinuationSource continuationSource = new ContinuationSource(cc5Var);
        this.c = continuationSource;
        this.d = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public final List<Header> d(int i, int i2, int i3, int i4) throws IOException {
        ContinuationSource continuationSource = this.c;
        continuationSource.setLeft(i);
        continuationSource.setLength(continuationSource.getLeft());
        continuationSource.setPadding(i2);
        continuationSource.setFlags(i3);
        continuationSource.setStreamId(i4);
        Hpack.Reader reader = this.d;
        reader.readHeaders();
        return reader.getAndResetHeaderList();
    }

    public final void f(Handler handler, int i) {
        cc5 cc5Var = this.a;
        int i2 = cc5Var.readInt();
        handler.priority(i, i2 & Reader.READ_DONE, _UtilCommonKt.and(cc5Var.readByte(), 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean nextFrame(boolean requireSettings, Handler handler) throws Exception {
        int i;
        long j;
        cc5 cc5Var = this.a;
        handler.getClass();
        try {
            cc5Var.q0(9L);
            int medium = _UtilCommonKt.readMedium(cc5Var);
            if (medium > 16384) {
                i08.a(hce0.a(medium, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int iAnd = _UtilCommonKt.and(cc5Var.readByte(), 255);
            int iAnd2 = _UtilCommonKt.and(cc5Var.readByte(), 255);
            int i2 = cc5Var.readInt() & Reader.READ_DONE;
            Logger logger = e;
            if (iAnd != 8 && logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.INSTANCE.frameLog(true, i2, medium, iAnd, iAnd2));
            }
            if (requireSettings && iAnd != 4) {
                wnm.a(Http2.INSTANCE.formattedType$okhttp(iAnd), "Expected a SETTINGS frame but was ");
                return false;
            }
            switch (iAnd) {
                case 0:
                    if (i2 == 0) {
                        i08.a("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        return false;
                    }
                    boolean z = (iAnd2 & 1) != 0;
                    if ((iAnd2 & 32) != 0) {
                        i08.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                        return false;
                    }
                    int iAnd3 = (iAnd2 & 8) != 0 ? _UtilCommonKt.and(cc5Var.readByte(), 255) : 0;
                    handler.data(z, i2, cc5Var, INSTANCE.lengthWithoutPadding(medium, iAnd2, iAnd3));
                    cc5Var.skip(iAnd3);
                    return true;
                case 1:
                    if (i2 == 0) {
                        i08.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        return false;
                    }
                    boolean z2 = (iAnd2 & 1) != 0;
                    int iAnd4 = (iAnd2 & 8) != 0 ? _UtilCommonKt.and(cc5Var.readByte(), 255) : 0;
                    if ((iAnd2 & 32) != 0) {
                        f(handler, i2);
                        medium -= 5;
                    }
                    handler.headers(z2, i2, -1, d(INSTANCE.lengthWithoutPadding(medium, iAnd2, iAnd4), iAnd4, iAnd2, i2));
                    return true;
                case 2:
                    if (medium != 5) {
                        i08.a(pe4.b(medium, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i2 != 0) {
                        f(handler, i2);
                        return true;
                    }
                    i08.a("TYPE_PRIORITY streamId == 0");
                    return false;
                case 3:
                    if (medium != 4) {
                        i08.a(pe4.b(medium, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i2 == 0) {
                        i08.a("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i3 = cc5Var.readInt();
                    ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(i3);
                    if (errorCodeFromHttp2 != null) {
                        handler.rstStream(i2, errorCodeFromHttp2);
                        return true;
                    }
                    i08.a(hce0.a(i3, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                case 4:
                    if (i2 != 0) {
                        i08.a("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((iAnd2 & 1) != 0) {
                        if (medium == 0) {
                            handler.ackSettings();
                            return true;
                        }
                        i08.a("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    if (medium % 6 != 0) {
                        i08.a(hce0.a(medium, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    Settings settings = new Settings();
                    c cVarL = f.l(6, f.n(0, medium));
                    int i4 = cVarL.a;
                    int i5 = cVarL.b;
                    int i6 = cVarL.c;
                    if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                        while (true) {
                            int iAnd5 = _UtilCommonKt.and(cc5Var.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            i = cc5Var.readInt();
                            if (iAnd5 != 2) {
                                if (iAnd5 != 4) {
                                    if (iAnd5 == 5 && (i < 16384 || i > 16777215)) {
                                    }
                                } else if (i < 0) {
                                    i08.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (i != 0 && i != 1) {
                                i08.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            settings.set(iAnd5, i);
                            if (i4 != i5) {
                                i4 += i6;
                            }
                        }
                        i08.a(hce0.a(i, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        return false;
                    }
                    handler.settings(false, settings);
                    return true;
                case 5:
                    if (i2 == 0) {
                        i08.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        return false;
                    }
                    int iAnd6 = (iAnd2 & 8) != 0 ? _UtilCommonKt.and(cc5Var.readByte(), 255) : 0;
                    handler.pushPromise(i2, cc5Var.readInt() & Reader.READ_DONE, d(INSTANCE.lengthWithoutPadding(medium - 4, iAnd2, iAnd6), iAnd6, iAnd2, i2));
                    return true;
                case 6:
                    if (medium != 8) {
                        i08.a(hce0.a(medium, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        i08.a("TYPE_PING streamId != 0");
                        return false;
                    }
                    handler.ping((iAnd2 & 1) != 0, cc5Var.readInt(), cc5Var.readInt());
                    return true;
                case 7:
                    if (medium < 8) {
                        i08.a(hce0.a(medium, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        i08.a("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i7 = cc5Var.readInt();
                    int i8 = cc5Var.readInt();
                    int i9 = medium - 8;
                    ErrorCode errorCodeFromHttp3 = ErrorCode.INSTANCE.fromHttp2(i8);
                    if (errorCodeFromHttp3 == null) {
                        i08.a(hce0.a(i8, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    rl5 rl5VarB0 = rl5.d;
                    if (i9 > 0) {
                        rl5VarB0 = cc5Var.B0(i9);
                    }
                    handler.goAway(i7, errorCodeFromHttp3, rl5VarB0);
                    return true;
                case 8:
                    try {
                        if (medium != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + medium);
                        }
                        long jAnd = _UtilCommonKt.and(cc5Var.readInt(), 2147483647L);
                        if (jAnd == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        if (logger.isLoggable(Level.FINE)) {
                            j = jAnd;
                            logger.fine(Http2.INSTANCE.frameLogWindowUpdate(true, i2, medium, j));
                        } else {
                            j = jAnd;
                        }
                        handler.windowUpdate(i2, j);
                        return true;
                    } catch (Exception e2) {
                        logger.fine(Http2.INSTANCE.frameLog(true, i2, medium, 8, iAnd2));
                        throw e2;
                    }
                default:
                    cc5Var.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        handler.getClass();
        if (this.b) {
            if (nextFrame(true, handler)) {
                return;
            }
            i08.a("Required SETTINGS preface not received");
            return;
        }
        rl5 rl5Var = Http2.CONNECTION_PREFACE;
        rl5 rl5VarB0 = this.a.B0(rl5Var.d());
        Level level = Level.FINE;
        Logger logger = e;
        if (logger.isLoggable(level)) {
            logger.fine(_UtilJvmKt.format("<< CONNECTION " + rl5VarB0.e(), new Object[0]));
        }
        if (rl5Var.equals(rl5VarB0)) {
            return;
        }
        i08.a("Expected a connection header but was ".concat(rl5VarB0.s()));
    }
}
