package okhttp3.internal.ws;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.twilio.voice.EventKeys;
import defpackage.cc5;
import defpackage.i08;
import defpackage.lb5;
import defpackage.rl5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "isClient", "Lcc5;", "source", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLcc5;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "", "processNextFrame", "()V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "b", "Lcc5;", "getSource", "()Lcc5;", "FrameCallback", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebSocketReader implements Closeable {
    public final lb5 A;
    public final lb5 B;
    public MessageInflater C;
    public final byte[] D;
    public final lb5.c E;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final cc5 source;
    public final FrameCallback c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public int i;
    public long v;
    public boolean w;
    public boolean y;
    public boolean z;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "text", "", "onReadMessage", "(Ljava/lang/String;)V", "Lrl5;", "bytes", "(Lrl5;)V", EventKeys.PAYLOAD, "onReadPing", "onReadPong", "", EventKeys.ERROR_CODE, "reason", "onReadClose", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface FrameCallback {
        void onReadClose(int code, String reason);

        void onReadMessage(String text);

        void onReadMessage(rl5 bytes);

        void onReadPing(rl5 payload);

        void onReadPong(rl5 payload);
    }

    public WebSocketReader(boolean z, cc5 cc5Var, FrameCallback frameCallback, boolean z2, boolean z3) {
        cc5Var.getClass();
        frameCallback.getClass();
        this.a = z;
        this.source = cc5Var;
        this.c = frameCallback;
        this.d = z2;
        this.e = z3;
        this.A = new lb5();
        this.B = new lb5();
        this.D = z ? null : new byte[4];
        this.E = z ? null : new lb5.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.C;
        if (messageInflater != null) {
            _UtilCommonKt.closeQuietly(messageInflater);
        }
        _UtilCommonKt.closeQuietly(this.source);
    }

    public final void d() throws ProtocolException, EOFException {
        short s;
        String strY;
        long j = this.v;
        lb5 lb5Var = this.A;
        if (j > 0) {
            this.source.v0(lb5Var, j);
            if (!this.a) {
                lb5.c cVar = this.E;
                cVar.getClass();
                lb5Var.H(cVar);
                cVar.f(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                byte[] bArr = this.D;
                bArr.getClass();
                webSocketProtocol.toggleMask(cVar, bArr);
                cVar.close();
            }
        }
        int i = this.i;
        FrameCallback frameCallback = this.c;
        switch (i) {
            case 8:
                long j2 = lb5Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = lb5Var.readShort();
                    strY = lb5Var.Y();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s = 1005;
                    strY = "";
                }
                frameCallback.onReadClose(s, strY);
                this.f = true;
                return;
            case 9:
                frameCallback.onReadPing(lb5Var.B0(lb5Var.b));
                return;
            case 10:
                frameCallback.onReadPong(lb5Var.B0(lb5Var.b));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + _UtilJvmKt.toHexString(this.i));
        }
    }

    public final cc5 getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        f();
        if (this.y) {
            d();
            return;
        }
        int i = this.i;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + _UtilJvmKt.toHexString(i));
        }
        while (!this.f) {
            long j = this.v;
            lb5 lb5Var = this.B;
            if (j > 0) {
                this.source.v0(lb5Var, j);
                if (!this.a) {
                    lb5.c cVar = this.E;
                    cVar.getClass();
                    lb5Var.H(cVar);
                    cVar.f(lb5Var.b - this.v);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    byte[] bArr = this.D;
                    bArr.getClass();
                    webSocketProtocol.toggleMask(cVar, bArr);
                    cVar.close();
                }
            }
            if (this.w) {
                if (this.z) {
                    MessageInflater messageInflater = this.C;
                    if (messageInflater == null) {
                        messageInflater = new MessageInflater(this.e);
                        this.C = messageInflater;
                    }
                    messageInflater.inflate(lb5Var);
                }
                FrameCallback frameCallback = this.c;
                if (i == 1) {
                    frameCallback.onReadMessage(lb5Var.Y());
                    return;
                } else {
                    frameCallback.onReadMessage(lb5Var.B0(lb5Var.b));
                    return;
                }
            }
            while (!this.f) {
                f();
                if (!this.y) {
                    break;
                } else {
                    d();
                }
            }
            if (this.i != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + _UtilJvmKt.toHexString(this.i));
            }
        }
        i08.a("closed");
    }

    public final void f() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f) {
            i08.a("closed");
            return;
        }
        cc5 cc5Var = this.source;
        long c = cc5Var.getA().getC();
        cc5Var.getA().clearTimeout();
        try {
            int iAnd = _UtilCommonKt.and(cc5Var.readByte(), 255);
            cc5Var.getA().timeout(c, timeUnit);
            int i = iAnd & 15;
            this.i = i;
            boolean z2 = (iAnd & 128) != 0;
            this.w = z2;
            boolean z3 = (iAnd & 8) != 0;
            this.y = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (iAnd & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.z = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException(qUnCRF.Qxe);
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = _UtilCommonKt.and(cc5Var.readByte(), 255);
            boolean z5 = (iAnd2 & 128) != 0;
            boolean z6 = this.a;
            if (z5 == z6) {
                throw new ProtocolException(z6 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long jAnd = iAnd2 & 127;
            this.v = jAnd;
            if (jAnd == 126) {
                jAnd = _UtilCommonKt.and(cc5Var.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                this.v = jAnd;
            } else if (jAnd == 127) {
                jAnd = cc5Var.readLong();
                this.v = jAnd;
                if (jAnd < 0) {
                    throw new ProtocolException("Frame length 0x" + _UtilJvmKt.toHexString(this.v) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.y && jAnd > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr = this.D;
                bArr.getClass();
                cc5Var.readFully(bArr);
            }
        } catch (Throwable th) {
            cc5Var.getA().timeout(c, timeUnit);
            throw th;
        }
    }
}
