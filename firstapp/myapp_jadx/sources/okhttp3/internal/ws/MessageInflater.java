package okhttp3.internal.ws;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hb5;
import defpackage.lb5;
import defpackage.lgn;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Llb5;", "buffer", "", "inflate", "(Llb5;)V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessageInflater implements Closeable {
    public final boolean a;
    public final lb5 b = new lb5();
    public Inflater c;
    public lgn d;

    public MessageInflater(boolean z) {
        this.a = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        lgn lgnVar = this.d;
        if (lgnVar != null) {
            lgnVar.close();
        }
        this.d = null;
        this.c = null;
    }

    public final void inflate(lb5 buffer) throws IOException {
        buffer.getClass();
        lb5 lb5Var = this.b;
        if (lb5Var.b != 0) {
            hb5.a("Failed requirement.");
            return;
        }
        Inflater inflater = this.c;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.c = inflater;
        }
        lgn lgnVar = this.d;
        if (lgnVar == null) {
            lgnVar = new lgn(lb5Var, inflater);
            this.d = lgnVar;
        }
        if (this.a) {
            inflater.reset();
        }
        lb5Var.R0(buffer);
        lb5Var.g0(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = inflater.getBytesRead() + lb5Var.b;
        do {
            lgnVar.d(buffer, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            lb5Var.d();
            lgnVar.close();
            this.d = null;
            this.c = null;
        }
    }
}
