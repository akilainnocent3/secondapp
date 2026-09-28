package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class cjk0 implements kd00.a {
    public final /* synthetic */ kd00 a;
    public final /* synthetic */ TaskCompletionSource b;

    public cjk0(kd00 kd00Var, TaskCompletionSource taskCompletionSource, jjk0 jjk0Var) {
        this.a = kd00Var;
        this.b = taskCompletionSource;
    }

    @Override // kd00.a
    public final void a(Status status) {
        bj50 bj50Var;
        if (status.a > 0) {
            this.b.setException(status.c != null ? new ag50(status) : new nm0(status));
            return;
        }
        kd00 kd00Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) kd00Var;
        hm20.j("Result has already been consumed.", !basePendingResult.g);
        try {
            if (!basePendingResult.b.await(0L, timeUnit)) {
                basePendingResult.c(Status.v);
            }
        } catch (InterruptedException unused) {
            basePendingResult.c(Status.f);
        }
        hm20.j("Result is not ready.", basePendingResult.d());
        synchronized (basePendingResult.a) {
            hm20.j("Result has already been consumed.", !basePendingResult.g);
            hm20.j("Result is not ready.", basePendingResult.d());
            bj50Var = basePendingResult.e;
            basePendingResult.e = null;
            basePendingResult.g = true;
        }
        if (((shk0) basePendingResult.d.getAndSet(null)) != null) {
            throw null;
        }
        hm20.h(bj50Var);
        this.b.setResult(null);
    }
}
