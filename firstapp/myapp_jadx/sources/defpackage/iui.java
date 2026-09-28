package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0019"}, d2 = {"Liui;", "Luw90;", "delegate", "<init>", "(Luw90;)V", "Llb5;", "source", "", "byteCount", "", "write", "(Llb5;J)V", "flush", "()V", "Lsxf0;", "timeout", "()Lsxf0;", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Luw90;", "a", "Luw90;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class iui implements uw90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final uw90 delegate;

    public iui(uw90 uw90Var) {
        uw90Var.getClass();
        this.delegate = uw90Var;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final uw90 getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final uw90 delegate() {
        return this.delegate;
    }

    @Override // defpackage.uw90, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // defpackage.uw90
    public sxf0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // defpackage.uw90
    public void write(lb5 source, long byteCount) {
        source.getClass();
        this.delegate.write(source, byteCount);
    }
}
