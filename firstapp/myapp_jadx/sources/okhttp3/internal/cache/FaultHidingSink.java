package okhttp3.internal.cache;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.iui;
import defpackage.lb5;
import defpackage.uw90;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Liui;", "Luw90;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "", "onException", "<init>", "(Luw90;Lkotlin/jvm/functions/Function1;)V", "Llb5;", "source", "", "byteCount", "write", "(Llb5;J)V", "flush", "()V", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "b", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class FaultHidingSink extends iui {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Function1<IOException, Unit> onException;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(uw90 uw90Var, Function1<? super IOException, Unit> function1) {
        super(uw90Var);
        uw90Var.getClass();
        function1.getClass();
        this.onException = function1;
    }

    @Override // defpackage.iui, defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.iui, defpackage.uw90, java.io.Flushable
    public void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.onException.invoke(e);
        }
    }

    public final Function1<IOException, Unit> getOnException() {
        return this.onException;
    }

    @Override // defpackage.iui, defpackage.uw90
    public void write(lb5 source, long byteCount) throws EOFException {
        source.getClass();
        if (this.c) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e) {
            this.c = true;
            this.onException.invoke(e);
        }
    }
}
