package okhttp3.internal.ws;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.bc5;
import defpackage.hb5;
import defpackage.i08;
import defpackage.lb5;
import defpackage.rl5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "Lbc5;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLbc5;Ljava/util/Random;ZZJ)V", "Lrl5;", EventKeys.PAYLOAD, "", "writePing", "(Lrl5;)V", "writePong", "", EventKeys.ERROR_CODE, "reason", "writeClose", "(ILrl5;)V", "formatOpcode", "data", "writeMessageFrame", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "b", "Lbc5;", "getSink", "()Lbc5;", "c", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebSocketWriter implements Closeable {
    public final lb5.c A;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final bc5 sink;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Random random;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final lb5 i;
    public final lb5 v;
    public boolean w;
    public MessageDeflater y;
    public final byte[] z;

    public WebSocketWriter(boolean z, bc5 bc5Var, Random random, boolean z2, boolean z3, long j) {
        bc5Var.getClass();
        random.getClass();
        this.a = z;
        this.sink = bc5Var;
        this.random = random;
        this.d = z2;
        this.e = z3;
        this.f = j;
        this.i = new lb5();
        this.v = bc5Var.e();
        this.z = z ? new byte[4] : null;
        this.A = z ? new lb5.c() : null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.y;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.sink);
    }

    public final void d(int i, rl5 rl5Var) throws IOException {
        if (this.w) {
            i08.a("closed");
            return;
        }
        int iD = rl5Var.d();
        if (iD > 125) {
            hb5.a("Payload size must be less than or equal to 125");
            return;
        }
        lb5 lb5Var = this.v;
        lb5Var.d0(i | 128);
        if (this.a) {
            lb5Var.d0(iD | 128);
            byte[] bArr = this.z;
            bArr.getClass();
            this.random.nextBytes(bArr);
            lb5Var.m104write(bArr, 0, bArr.length);
            if (iD > 0) {
                long j = lb5Var.b;
                lb5Var.c0(rl5Var);
                lb5.c cVar = this.A;
                cVar.getClass();
                lb5Var.H(cVar);
                cVar.f(j);
                WebSocketProtocol.INSTANCE.toggleMask(cVar, bArr);
                cVar.close();
            }
        } else {
            lb5Var.d0(iD);
            lb5Var.c0(rl5Var);
        }
        this.sink.flush();
    }

    public final Random getRandom() {
        return this.random;
    }

    public final bc5 getSink() {
        return this.sink;
    }

    public final void writeClose(int code, rl5 reason) throws EOFException {
        rl5 rl5VarB0 = rl5.d;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            lb5 lb5Var = new lb5();
            lb5Var.l0(code);
            if (reason != null) {
                lb5Var.c0(reason);
            }
            rl5VarB0 = lb5Var.B0(lb5Var.b);
        }
        try {
            d(8, rl5VarB0);
        } finally {
            this.w = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, rl5 data) throws IOException {
        data.getClass();
        if (this.w) {
            i08.a("closed");
            return;
        }
        lb5 lb5Var = this.i;
        lb5Var.c0(data);
        int i = formatOpcode | 128;
        if (this.d && data.d() >= this.f) {
            MessageDeflater messageDeflater = this.y;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.e);
                this.y = messageDeflater;
            }
            messageDeflater.deflate(lb5Var);
            i = formatOpcode | 192;
        }
        long j = lb5Var.b;
        lb5 lb5Var2 = this.v;
        lb5Var2.d0(i);
        boolean z = this.a;
        int i2 = z ? 128 : 0;
        if (j <= 125) {
            lb5Var2.d0(i2 | ((int) j));
        } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            lb5Var2.d0(i2 | WebSocketProtocol.PAYLOAD_SHORT);
            lb5Var2.l0((int) j);
        } else {
            lb5Var2.d0(i2 | 127);
            lb5Var2.h0(j);
        }
        if (z) {
            byte[] bArr = this.z;
            bArr.getClass();
            this.random.nextBytes(bArr);
            lb5Var2.m104write(bArr, 0, bArr.length);
            if (j > 0) {
                lb5.c cVar = this.A;
                cVar.getClass();
                lb5Var.H(cVar);
                cVar.f(0L);
                WebSocketProtocol.INSTANCE.toggleMask(cVar, bArr);
                cVar.close();
            }
        }
        lb5Var2.write(lb5Var, j);
        this.sink.flush();
    }

    public final void writePing(rl5 payload) {
        payload.getClass();
        d(9, payload);
    }

    public final void writePong(rl5 payload) throws IOException {
        payload.getClass();
        d(10, payload);
    }
}
