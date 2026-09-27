package pa;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f120544c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Runnable f120546e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<a> f120543b = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f120545d = new Object();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f120547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f120548c;

        public a(@NonNull n serialExecutor, @NonNull Runnable runnable) {
            this.f120547b = serialExecutor;
            this.f120548c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f120548c.run();
            } finally {
                this.f120547b.c();
            }
        }
    }

    public n(@NonNull Executor executor) {
        this.f120544c = executor;
    }

    @NonNull
    @h1
    public Executor a() {
        return this.f120544c;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f120545d) {
            z10 = !this.f120543b.isEmpty();
        }
        return z10;
    }

    public void c() {
        synchronized (this.f120545d) {
            try {
                a aVarPoll = this.f120543b.poll();
                this.f120546e = aVarPoll;
                if (aVarPoll != null) {
                    this.f120544c.execute(this.f120546e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable command) {
        synchronized (this.f120545d) {
            try {
                this.f120543b.add(new a(this, command));
                if (this.f120546e == null) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
