package okhttp3.internal.ws;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dkd;
import defpackage.ft7;
import defpackage.hb5;
import defpackage.l;
import defpackage.lb5;
import defpackage.rl5;
import defpackage.x740;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Llb5;", "buffer", "", "deflate", "(Llb5;)V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessageDeflater implements Closeable {
    public final boolean a;
    public final lb5 b;
    public final Deflater c;
    public final dkd d;

    public MessageDeflater(boolean z) {
        this.a = z;
        lb5 lb5Var = new lb5();
        this.b = lb5Var;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new dkd(new x740(lb5Var), deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.d.close();
    }

    public final void deflate(lb5 buffer) throws IOException {
        buffer.getClass();
        lb5 lb5Var = this.b;
        if (lb5Var.b != 0) {
            hb5.a("Failed requirement.");
            return;
        }
        if (this.a) {
            this.c.reset();
        }
        long j = buffer.b;
        dkd dkdVar = this.d;
        dkdVar.write(buffer, j);
        dkdVar.flush();
        rl5 rl5Var = MessageDeflaterKt.a;
        if (lb5Var.F(rl5Var.d(), rl5Var, lb5Var.b - ((long) rl5Var.d()))) {
            long j2 = lb5Var.b - 4;
            lb5.c cVarH = lb5Var.H(l.a);
            try {
                cVarH.d(j2);
                cVarH.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(cVarH, th);
                    throw th2;
                }
            }
        } else {
            lb5Var.d0(0);
        }
        buffer.write(lb5Var, lb5Var.b);
    }
}
