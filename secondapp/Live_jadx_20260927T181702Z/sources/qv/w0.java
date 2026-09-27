package qv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jv.d3;
import kotlin.jvm.internal.s1;
import qv.w0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
public abstract class w0<S extends w0<S>> extends f<S> implements d3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f123044e = AtomicIntegerFieldUpdater.newUpdater(w0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cs.g
    public final long f123045d;

    public w0(long j10, @oy.m S s10, int i10) {
        super(s10);
        this.f123045d = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    public final void A() {
        if (f123044e.incrementAndGet(this) == y()) {
            q();
        }
    }

    public final /* synthetic */ void B(int i10) {
        this.cleanedAndPointers$volatile = i10;
    }

    public final boolean C() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f123044e;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == y() && !n()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }

    @Override // qv.f
    public boolean m() {
        return f123044e.get(this) == y() && !n();
    }

    public final boolean v() {
        return f123044e.addAndGet(this, p1.a.f120313c) == y() && !n();
    }

    public final /* synthetic */ int w() {
        return this.cleanedAndPointers$volatile;
    }

    public abstract int y();

    public abstract void z(int i10, @oy.m Throwable th2, @oy.l or.j jVar);
}
