package sv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.s1;
import nj.z2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n77#2:252\n77#2:253\n77#2:254\n77#2:257\n77#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f135598b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f135599c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f135600d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f135601e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final AtomicReferenceArray<i> f135602a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public static /* synthetic */ i b(m mVar, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return mVar.a(iVar, z10);
    }

    public final i A(int i10, boolean z10) {
        int i11 = i10 & 127;
        i iVar = this.f135602a.get(i11);
        if (iVar == null || iVar.f135587c != z10 || !z2.a(this.f135602a, i11, iVar, null)) {
            return null;
        }
        if (z10) {
            f135601e.decrementAndGet(this);
        }
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long B(int i10, @oy.l l1.h<i> hVar) {
        i iVarZ;
        T t10;
        i iVarR;
        if (i10 == 3) {
            iVarR = r();
        } else {
            iVarZ = z(i10);
        }
        if (t10 == 0) {
            t10 = iVarZ;
            t10 = iVarR;
            return C(i10, hVar);
        }
        t10 = iVarZ;
        t10 = iVarR;
        hVar.f102749b = t10;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, sv.i] */
    public final long C(int i10, l1.h<i> hVar) {
        ?? r10;
        do {
            r10 = (i) f135598b.get(this);
            if (r10 == 0) {
                return -2L;
            }
            if (((r10.f135587c ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = k.f135594f.a() - r10.f135586b;
            long j10 = k.f135590b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!h0.b.a(f135598b, this, r10, null));
        hVar.f102749b = r10;
        return -1L;
    }

    @oy.m
    public final i a(@oy.l i iVar, boolean z10) {
        if (z10) {
            return c(iVar);
        }
        i iVar2 = (i) f135598b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final i c(i iVar) {
        if (g() == 127) {
            return iVar;
        }
        if (iVar.f135587c) {
            f135601e.incrementAndGet(this);
        }
        int i10 = f135599c.get(this) & 127;
        while (this.f135602a.get(i10) != null) {
            Thread.yield();
        }
        this.f135602a.lazySet(i10, iVar);
        f135599c.incrementAndGet(this);
        return null;
    }

    public final void d(i iVar) {
        if (iVar == null || !iVar.f135587c) {
            return;
        }
        f135601e.decrementAndGet(this);
    }

    public final /* synthetic */ int e() {
        return this.blockingTasksInBuffer$volatile;
    }

    public final int g() {
        return f135599c.get(this) - f135600d.get(this);
    }

    public final /* synthetic */ int h() {
        return this.consumerIndex$volatile;
    }

    public final /* synthetic */ Object j() {
        return this.lastScheduledTask$volatile;
    }

    public final /* synthetic */ int l() {
        return this.producerIndex$volatile;
    }

    public final int n() {
        return f135598b.get(this) != null ? g() + 1 : g();
    }

    public final void o(@oy.l e eVar) {
        i iVar = (i) f135598b.getAndSet(this, null);
        if (iVar != null) {
            eVar.a(iVar);
        }
        while (t(eVar)) {
        }
    }

    @oy.m
    public final i p() {
        i iVar = (i) f135598b.getAndSet(this, null);
        return iVar == null ? r() : iVar;
    }

    @oy.m
    public final i q() {
        return u(true);
    }

    public final i r() {
        i andSet;
        while (true) {
            int i10 = f135600d.get(this);
            if (i10 - f135599c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f135600d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f135602a.getAndSet(i11, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    @oy.m
    public final i s() {
        return u(false);
    }

    public final boolean t(e eVar) {
        i iVarR = r();
        if (iVarR == null) {
            return false;
        }
        eVar.a(iVarR);
        return true;
    }

    public final i u(boolean z10) {
        i iVar;
        do {
            iVar = (i) f135598b.get(this);
            if (iVar == null || iVar.f135587c != z10) {
                int i10 = f135600d.get(this);
                int i11 = f135599c.get(this);
                while (i10 != i11) {
                    if (z10 && f135601e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    i iVarA = A(i11, z10);
                    if (iVarA != null) {
                        return iVarA;
                    }
                }
                return null;
            }
        } while (!h0.b.a(f135598b, this, iVar, null));
        return iVar;
    }

    public final /* synthetic */ void v(int i10) {
        this.blockingTasksInBuffer$volatile = i10;
    }

    public final /* synthetic */ void w(int i10) {
        this.consumerIndex$volatile = i10;
    }

    public final /* synthetic */ void x(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    public final /* synthetic */ void y(int i10) {
        this.producerIndex$volatile = i10;
    }

    public final i z(int i10) {
        int i11 = f135600d.get(this);
        int i12 = f135599c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f135601e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            i iVarA = A(i11, z10);
            if (iVarA != null) {
                return iVarA;
            }
            i11 = i13;
        }
        return null;
    }
}
