package nu;

import dr.w2;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Runnable f117604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final ds.l<InterruptedException, w2> f117605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@oy.l Lock lock, @oy.l Runnable checkCancelled, @oy.l ds.l<? super InterruptedException, w2> interruptedExceptionHandler) {
        super(lock);
        m0.p(lock, "lock");
        m0.p(checkCancelled, "checkCancelled");
        m0.p(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f117604c = checkCancelled;
        this.f117605d = interruptedExceptionHandler;
    }

    @Override // nu.d, nu.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f117604c.run();
            } catch (InterruptedException e10) {
                this.f117605d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@oy.l Runnable checkCancelled, @oy.l ds.l<? super InterruptedException, w2> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        m0.p(checkCancelled, "checkCancelled");
        m0.p(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
