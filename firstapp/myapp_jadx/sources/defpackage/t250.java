package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class t250 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ fu5 b;

    public t250(ExecutorService executorService, fu5 fu5Var) {
        this.a = executorService;
        this.b = fu5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
