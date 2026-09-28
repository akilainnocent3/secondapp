package androidx.work;

import android.content.Context;
import defpackage.nv5;
import defpackage.rxj0;
import defpackage.wxj0;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/d;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Worker extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.d
    public final nv5.d a() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return wxj0.a(executorService, new rxj0(0));
    }

    @Override // androidx.work.d
    public final nv5.d b() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return wxj0.a(executorService, new e(this));
    }

    public abstract d.a.c c();
}
