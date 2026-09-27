package b9;

import dr.w2;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nCloseBarrier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrier\n+ 2 Synchronized.jvmAndroid.kt\nandroidx/room/concurrent/Synchronized_jvmAndroidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Atomics.kt\nandroidx/room/concurrent/AtomicsKt\n*L\n1#1,106:1\n22#2:107\n22#2:108\n22#2:110\n1#3:109\n40#4,2:111\n*S KotlinDebug\n*F\n+ 1 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrier\n*L\n53#1:107\n69#1:108\n83#1:110\n89#1:111,2\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final ds.a<w2> f20890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final AtomicInteger f20891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final AtomicBoolean f20892c;

    public c(@l ds.a<w2> closeAction) {
        m0.p(closeAction, "closeAction");
        this.f20890a = closeAction;
        this.f20891b = new AtomicInteger(0);
        this.f20892c = new AtomicBoolean(false);
    }

    public final boolean a() {
        synchronized (this) {
            if (c()) {
                return false;
            }
            this.f20891b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.f20892c.compareAndSet(false, true)) {
                w2 w2Var = w2.f79517a;
                while (this.f20891b.get() != 0) {
                }
                this.f20890a.invoke();
            }
        }
    }

    public final boolean c() {
        return this.f20892c.get();
    }

    public final void d() {
        synchronized (this) {
            this.f20891b.decrementAndGet();
            if (this.f20891b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            w2 w2Var = w2.f79517a;
        }
    }
}
