package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class tuw extends xb80 implements quw {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(tuw.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long y = s0o.a.objectFieldOffset(tuw.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public final class a implements zb6<Unit>, bwi0 {
        public final bc6<Unit> a;

        public a(bc6 bc6Var) {
            this.a = bc6Var;
        }

        @Override // defpackage.bwi0
        public final void a(f580<?> f580Var, int i) {
            this.a.a(f580Var, i);
        }

        @Override // defpackage.zb6
        public final boolean cancel(Throwable th) {
            return this.a.cancel(th);
        }

        @Override // defpackage.v1b
        public final CoroutineContext getContext() {
            return this.a.e;
        }

        @Override // defpackage.zb6
        public final toe0 i(Object obj, gaj gajVar) {
            tuw tuwVar = tuw.this;
            suw suwVar = new suw(tuwVar, this);
            toe0 toe0VarF = this.a.F((Unit) obj, suwVar);
            if (toe0VarF != null) {
                tuw.w.set(tuwVar, null);
            }
            return toe0VarF;
        }

        @Override // defpackage.zb6
        public final boolean isActive() {
            return this.a.p() instanceof bzx;
        }

        @Override // defpackage.v1b
        public final void resumeWith(Object obj) {
            this.a.resumeWith(obj);
        }

        @Override // defpackage.zb6
        public final void s(Object obj, gaj gajVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tuw.w;
            tuw tuwVar = tuw.this;
            atomicReferenceFieldUpdater.set(tuwVar, null);
            y7s y7sVar = new y7s(tuwVar, this);
            this.a.B((Unit) obj, y7sVar);
        }

        @Override // defpackage.zb6
        public final void x(Object obj) {
            this.a.x(obj);
        }
    }

    public tuw(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : uuw.a;
    }

    @Override // defpackage.quw
    public final Object d(v1b v1bVar) throws Throwable {
        if (g()) {
            return Unit.a;
        }
        bc6 bc6VarA = dc6.a(yzo.b(v1bVar));
        try {
            a aVar = new a(bc6VarA);
            while (true) {
                int andDecrement = xb80.e.getAndDecrement(this);
                if (andDecrement <= this.a) {
                    if (andDecrement > 0) {
                        aVar.s(Unit.a, this.b);
                        break;
                    }
                    if (b(aVar)) {
                        break;
                    }
                }
            }
            Object objO = bc6VarA.o();
            y5b y5bVar = y5b.a;
            if (objO != y5bVar) {
                objO = Unit.a;
            }
            return objO == y5bVar ? objO : Unit.a;
        } catch (Throwable th) {
            bc6VarA.A();
            throw th;
        }
    }

    public final boolean e() {
        return Math.max(s0o.a.getIntVolatile(this, xb80.f), 0) == 0;
    }

    @Override // defpackage.quw
    public final void f(Object obj) {
        while (this.e()) {
            Unsafe unsafe = s0o.a;
            long j = y;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            toe0 toe0Var = uuw.a;
            if (objectVolatile != toe0Var) {
                if (objectVolatile != obj && obj != null) {
                    ruw.b(objectVolatile, "This mutex is locked by ", ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    tuw tuwVar = this;
                    if (s0o.a.compareAndSwapObject(tuwVar, y, objectVolatile, toe0Var)) {
                        tuwVar.c();
                        return;
                    } else {
                        if (s0o.a.getObjectVolatile(tuwVar, j) != objectVolatile) {
                            this = tuwVar;
                            break;
                        }
                        this = tuwVar;
                    }
                }
            }
        }
        ib5.a("This mutex is not locked");
    }

    public final boolean g() {
        tuw tuwVar;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = xb80.f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = s0o.a;
                    long j2 = xb80.f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.a;
                    if (intVolatile2 <= i) {
                        tuwVar = this;
                        break;
                    }
                    tuw tuwVar2 = this;
                    tuwVar = tuwVar2;
                    if (unsafe2.compareAndSwapInt(tuwVar2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = tuwVar;
                }
            } else {
                tuwVar = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(tuwVar, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(tuwVar, y, (Object) null);
                    return true;
                }
            }
            this = tuwVar;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(x2d.b(this));
        sb.append("[isLocked=");
        sb.append(e());
        sb.append(",owner=");
        return ekw.a(sb, s0o.a.getObjectVolatile(this, y), ']');
    }
}
