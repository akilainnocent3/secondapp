package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0002\u0010\u0015¨\u0006\u0018"}, d2 = {"Ljui;", "Lzpa0;", "delegate", "<init>", "(Lzpa0;)V", "Llb5;", "sink", "", "byteCount", "read", "(Llb5;J)J", "Lsxf0;", "timeout", "()Lsxf0;", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lzpa0;", "a", "Lzpa0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class jui implements zpa0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final zpa0 delegate;

    public jui(zpa0 zpa0Var) {
        zpa0Var.getClass();
        this.delegate = zpa0Var;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final zpa0 getDelegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final zpa0 delegate() {
        return this.delegate;
    }

    @Override // defpackage.zpa0
    public long read(lb5 sink, long byteCount) {
        sink.getClass();
        return this.delegate.read(sink, byteCount);
    }

    @Override // defpackage.zpa0
    public sxf0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
