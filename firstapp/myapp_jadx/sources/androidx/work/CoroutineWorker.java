package androidx.work;

import android.content.Context;
import defpackage.b6b;
import defpackage.fse;
import defpackage.i9p;
import defpackage.k5b;
import defpackage.nv5;
import defpackage.pfd;
import defpackage.v1b;
import defpackage.wis;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/d;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineWorker extends d {
    public final WorkerParameters e;
    public final a f;

    public static final class a extends k5b {
        public static final a b = new a();
        public static final pfd c = fse.a;

        @Override // defpackage.k5b
        public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
            coroutineContext.getClass();
            runnable.getClass();
            c.d0(coroutineContext, runnable);
        }

        @Override // defpackage.k5b
        public final boolean f0(CoroutineContext coroutineContext) {
            coroutineContext.getClass();
            c.getClass();
            return !false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = a.b;
    }

    @Override // androidx.work.d
    public final nv5.d a() {
        return wis.a(this.f.plus(i9p.a()), new b6b(this, null));
    }

    @Override // androidx.work.d
    public final nv5.d b() {
        a aVar = a.b;
        CoroutineContext coroutineContext = this.f;
        if (Intrinsics.g(coroutineContext, aVar)) {
            coroutineContext = this.e.d;
        }
        coroutineContext.getClass();
        return wis.a(coroutineContext.plus(i9p.a()), new b(this, null));
    }

    public abstract Object c(v1b<? super d.a> v1bVar);
}
