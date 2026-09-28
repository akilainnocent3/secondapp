package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class vvj0 implements p5f0 {
    public final xd80 a;
    public final k5b b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final a d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            vvj0.this.c.post(runnable);
        }
    }

    public vvj0(ExecutorService executorService) {
        xd80 xd80Var = new xd80(executorService);
        this.a = xd80Var;
        this.b = gf8.a(xd80Var);
    }

    @Override // defpackage.p5f0
    public final a a() {
        return this.d;
    }

    @Override // defpackage.p5f0
    public final k5b b() {
        return this.b;
    }

    @Override // defpackage.p5f0
    public final xd80 c() {
        return this.a;
    }
}
