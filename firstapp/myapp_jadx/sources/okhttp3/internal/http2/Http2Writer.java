package okhttp3.internal.http2;

import com.google.protobuf.Reader;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventGroupType;
import defpackage.bc5;
import defpackage.hce0;
import defpackage.kb5;
import defpackage.lb5;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\u001d\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\t2\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u000fJ%\u0010-\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J%\u00102\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J-\u0010:\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u000bJ+\u0010>\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b>\u0010?R\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lbc5;", "sink", "", "client", "<init>", "(Lbc5;Z)V", "", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "", "streamId", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Llb5;", "source", "byteCount", "data", "(ZILlb5;I)V", "flags", "buffer", "dataFrame", "(IILlb5;I)V", EventGroupType.SETTINGS_GROUP, "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "length", "type", "frameHeader", "(IIII)V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "headerBlock", "headers", "(ZILjava/util/List;)V", "Lokhttp3/internal/http2/Hpack$Writer;", "f", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Http2Writer implements Closeable, Lockable {
    public static final Logger i = Logger.getLogger(Http2.class.getName());
    public final bc5 a;
    public final boolean b;
    public final lb5 c;
    public int d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Hpack.Writer hpackWriter;

    public Http2Writer(bc5 bc5Var, boolean z) {
        bc5Var.getClass();
        this.a = bc5Var;
        this.b = z;
        lb5 lb5Var = new lb5();
        this.c = lb5Var;
        this.d = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, lb5Var, 3, null);
    }

    public final void applyAndAckSettings(Settings peerSettings) {
        peerSettings.getClass();
        synchronized (this) {
            try {
                if (this.e) {
                    throw new IOException("closed");
                }
                this.d = peerSettings.getMaxFrameSize(this.d);
                if (peerSettings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.a.flush();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.e = true;
            this.a.close();
            Unit unit = Unit.a;
        }
    }

    public final void connectionPreface() {
        synchronized (this) {
            try {
                if (this.e) {
                    throw new IOException("closed");
                }
                if (this.b) {
                    Logger logger = i;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.e(), new Object[0]));
                    }
                    this.a.o0(Http2.CONNECTION_PREFACE);
                    this.a.flush();
                    Unit unit = Unit.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i2, long j) {
        while (j > 0) {
            long jMin = Math.min(this.d, j);
            j -= jMin;
            frameHeader(i2, (int) jMin, 9, j == 0 ? 4 : 0);
            this.a.write(this.c, jMin);
        }
    }

    public final void data(boolean outFinished, int streamId, lb5 source, int byteCount) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
            Unit unit = Unit.a;
        }
    }

    public final void dataFrame(int streamId, int flags, lb5 buffer, int byteCount) {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            buffer.getClass();
            this.a.write(buffer, byteCount);
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void frameHeader(int streamId, int length, int type, int flags) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (type != 8) {
            Level level = Level.FINE;
            Logger logger = i;
            if (logger.isLoggable(level)) {
                i2 = streamId;
                i3 = length;
                i4 = type;
                i5 = flags;
                logger.fine(Http2.INSTANCE.frameLog(false, i2, i3, i4, i5));
            } else {
                i2 = streamId;
                i3 = length;
                i4 = type;
                i5 = flags;
            }
        } else {
            i2 = streamId;
            i3 = length;
            i4 = type;
            i5 = flags;
        }
        if (i3 > this.d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.d + ": " + i3).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            kb5.a(hce0.a(i2, "reserved bit set: "));
            return;
        }
        bc5 bc5Var = this.a;
        _UtilCommonKt.writeMedium(bc5Var, i3);
        bc5Var.writeByte(i4 & 255);
        bc5Var.writeByte(i5 & 255);
        bc5Var.writeInt(Integer.MAX_VALUE & i2);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) {
        errorCode.getClass();
        debugData.getClass();
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, debugData.length + 8, 7, 0);
            this.a.writeInt(lastGoodStreamId);
            this.a.writeInt(errorCode.getHttpCode());
            if (debugData.length != 0) {
                this.a.write(debugData);
            }
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    public final void headers(boolean outFinished, int streamId, List<Header> headerBlock) {
        headerBlock.getClass();
        synchronized (this) {
            try {
                if (this.e) {
                    throw new IOException("closed");
                }
                this.hpackWriter.writeHeaders(headerBlock);
                long j = this.c.b;
                long jMin = Math.min(this.d, j);
                int i2 = j == jMin ? 4 : 0;
                if (outFinished) {
                    i2 |= 1;
                }
                frameHeader(streamId, (int) jMin, 1, i2);
                this.a.write(this.c, jMin);
                if (j > jMin) {
                    d(streamId, j - jMin);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: maxDataLength, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final void ping(boolean ack, int payload1, int payload2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, 6, ack ? 1 : 0);
            this.a.writeInt(payload1);
            this.a.writeInt(payload2);
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    public final void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) {
        requestHeaders.getClass();
        synchronized (this) {
            try {
                if (this.e) {
                    throw new IOException("closed");
                }
                this.hpackWriter.writeHeaders(requestHeaders);
                long j = this.c.b;
                int iMin = (int) Math.min(((long) this.d) - 4, j);
                long j2 = iMin;
                frameHeader(streamId, iMin + 4, 5, j == j2 ? 4 : 0);
                this.a.writeInt(promisedStreamId & Reader.READ_DONE);
                this.a.write(this.c, j2);
                if (j > j2) {
                    d(streamId, j - j2);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void rstStream(int streamId, ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            frameHeader(streamId, 4, 3, 0);
            this.a.writeInt(errorCode.getHttpCode());
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    public final void settings(Settings settings) {
        settings.getClass();
        synchronized (this) {
            try {
                if (this.e) {
                    throw new IOException("closed");
                }
                frameHeader(0, settings.size() * 6, 4, 0);
                for (int i2 = 0; i2 < 10; i2++) {
                    if (settings.isSet(i2)) {
                        this.a.writeShort(i2);
                        this.a.writeInt(settings.get(i2));
                    }
                }
                this.a.flush();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void windowUpdate(int streamId, long windowSizeIncrement) {
        int i2;
        long j;
        synchronized (this) {
            try {
                if (this.e) {
                    throw new IOException("closed");
                }
                if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
                }
                Logger logger = i;
                if (logger.isLoggable(Level.FINE)) {
                    i2 = streamId;
                    j = windowSizeIncrement;
                    logger.fine(Http2.INSTANCE.frameLogWindowUpdate(false, i2, 4, j));
                } else {
                    i2 = streamId;
                    j = windowSizeIncrement;
                }
                frameHeader(i2, 4, 8, 0);
                this.a.writeInt((int) j);
                this.a.flush();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
