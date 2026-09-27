package a9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.s1({"SMAP\nTransactionExecutor.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.android.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class n2 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Executor f4233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ArrayDeque<Runnable> f4234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public Runnable f4235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final Object f4236e;

    public n2(@oy.l Executor executor) {
        kotlin.jvm.internal.m0.p(executor, "executor");
        this.f4233b = executor;
        this.f4234c = new ArrayDeque<>();
        this.f4236e = new Object();
    }

    public static final void b(Runnable runnable, n2 n2Var) {
        try {
            runnable.run();
        } finally {
            n2Var.c();
        }
    }

    public final void c() {
        synchronized (this.f4236e) {
            try {
                Runnable runnablePoll = this.f4234c.poll();
                Runnable runnable = runnablePoll;
                this.f4235d = runnable;
                if (runnablePoll != null) {
                    this.f4233b.execute(runnable);
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@oy.l final Runnable command) {
        kotlin.jvm.internal.m0.p(command, "command");
        synchronized (this.f4236e) {
            try {
                this.f4234c.offer(new Runnable() { // from class: a9.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        n2.b(command, this);
                    }
                });
                if (this.f4235d == null) {
                    c();
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
