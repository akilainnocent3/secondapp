package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final class l7l0 extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ p7l0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7l0(p7l0 p7l0Var, Callable callable, boolean z) {
        super(callable);
        this.d = p7l0Var;
        long andIncrement = p7l0.k.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            y4l0 y4l0Var = p7l0Var.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l7l0 l7l0Var = (l7l0) obj;
        boolean z = l7l0Var.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = l7l0Var.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        y4l0 y4l0Var = this.d.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.g.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        y4l0 y4l0Var = this.d.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.f.b(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7l0(p7l0 p7l0Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = p7l0Var;
        long andIncrement = p7l0.k.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            y4l0 y4l0Var = p7l0Var.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Tasks index overflow");
        }
    }
}
