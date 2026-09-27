package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public abstract class s1 extends n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f100873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f100874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    public fr.m<i1<?>> f100875f;

    public static /* synthetic */ void A0(s1 s1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s1Var.z0(z10);
    }

    public static /* synthetic */ void L0(s1 s1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s1Var.J0(z10);
    }

    public final long B0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void E0(@oy.l i1<?> i1Var) {
        fr.m<i1<?>> mVar = this.f100875f;
        if (mVar == null) {
            mVar = new fr.m<>();
            this.f100875f = mVar;
        }
        mVar.addLast(i1Var);
    }

    public long I0() {
        fr.m<i1<?>> mVar = this.f100875f;
        return (mVar == null || mVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void J0(boolean z10) {
        this.f100873d += B0(z10);
        if (z10) {
            return;
        }
        this.f100874e = true;
    }

    public boolean P0() {
        return W0();
    }

    public final boolean R0() {
        return this.f100873d >= B0(true);
    }

    public final boolean W0() {
        fr.m<i1<?>> mVar = this.f100875f;
        if (mVar != null) {
            return mVar.isEmpty();
        }
        return true;
    }

    public long Y0() {
        return !Z0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean Z0() {
        i1<?> i1VarW;
        fr.m<i1<?>> mVar = this.f100875f;
        if (mVar == null || (i1VarW = mVar.w()) == null) {
            return false;
        }
        i1VarW.run();
        return true;
    }

    public boolean d1() {
        return false;
    }

    public final boolean isActive() {
        return this.f100873d > 0;
    }

    @Override // jv.n0
    @oy.l
    public final n0 p0(int i10, @oy.m String str) {
        qv.a0.a(i10);
        return qv.a0.b(this, str);
    }

    public final void z0(boolean z10) {
        long jB0 = this.f100873d - B0(z10);
        this.f100873d = jB0;
        if (jB0 <= 0 && this.f100874e) {
            shutdown();
        }
    }

    public void shutdown() {
    }
}
