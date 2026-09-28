package okhttp3.internal.publicsuffix;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ft7;
import defpackage.rl5;
import defpackage.y740;
import defpackage.z7b;
import defpackage.zpa0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "()V", "Lzpa0;", "listSource", "()Lzpa0;", "", "ensureLoaded", "Lrl5;", "bytes", "Lrl5;", "getBytes", "()Lrl5;", "setBytes", "(Lrl5;)V", "exceptionBytes", "getExceptionBytes", "setExceptionBytes", "", "getPath", "()Ljava/lang/Object;", AnalyticsParam.EVENT_PATH, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public rl5 bytes;
    public IOException c;
    public rl5 exceptionBytes;

    public final void a() {
        try {
            y740 y740VarB = z7b.b(listSource());
            try {
                rl5 rl5VarB0 = y740VarB.B0(y740VarB.readInt());
                rl5 rl5VarB1 = y740VarB.B0(y740VarB.readInt());
                Unit unit = Unit.a;
                y740VarB.close();
                synchronized (this) {
                    rl5VarB0.getClass();
                    setBytes(rl5VarB0);
                    rl5VarB1.getClass();
                    setExceptionBytes(rl5VarB1);
                }
                this.b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(y740VarB, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            this.b.await();
        } else {
            boolean z = false;
            if (atomicBoolean.compareAndSet(false, true)) {
                while (true) {
                    try {
                        try {
                            a();
                            break;
                        } catch (InterruptedIOException unused) {
                            Thread.interrupted();
                            z = true;
                        } catch (IOException e) {
                            this.c = e;
                            if (z) {
                            }
                        }
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            } else {
                try {
                    this.b.await();
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (this.bytes != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PATH java.lang.String() + " resource.");
        illegalStateException.initCause(this.c);
        throw illegalStateException;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public rl5 getBytes() {
        rl5 rl5Var = this.bytes;
        if (rl5Var != null) {
            return rl5Var;
        }
        Intrinsics.n("bytes");
        throw null;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public rl5 getExceptionBytes() {
        rl5 rl5Var = this.exceptionBytes;
        if (rl5Var != null) {
            return rl5Var;
        }
        Intrinsics.n("exceptionBytes");
        throw null;
    }

    /* JADX INFO: renamed from: getPath */
    public abstract Object getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PATH java.lang.String();

    public abstract zpa0 listSource();

    public void setBytes(rl5 rl5Var) {
        rl5Var.getClass();
        this.bytes = rl5Var;
    }

    public void setExceptionBytes(rl5 rl5Var) {
        rl5Var.getClass();
        this.exceptionBytes = rl5Var;
    }
}
