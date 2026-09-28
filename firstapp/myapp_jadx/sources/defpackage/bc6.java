package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public class bc6<T> extends bse<T> implements zb6<T>, z5b, bwi0 {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final v1b<T> d;
    public final CoroutineContext e;

    static {
        Unsafe unsafe = s0o.a;
        f = unsafe.objectFieldOffset(bc6.class.getDeclaredField("_decisionAndIndex$volatile"));
        v = unsafe.objectFieldOffset(bc6.class.getDeclaredField("_state$volatile"));
        i = unsafe.objectFieldOffset(bc6.class.getDeclaredField("_parentHandle$volatile"));
    }

    public bc6(int i2, v1b v1bVar) {
        super(i2);
        this.d = v1bVar;
        this.e = v1bVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = fc.a;
    }

    public static Object E(bzx bzxVar, Object obj, int i2, gaj gajVar) {
        if (obj instanceof dn8) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (gajVar != null || (bzxVar instanceof ob6)) {
            return new bn8(obj, bzxVar instanceof ob6 ? (ob6) bzxVar : null, gajVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(bzx bzxVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + bzxVar + ", already has " + obj).toString());
    }

    public final void A() {
        bc6<T> bc6Var;
        v1b<T> v1bVar = this.d;
        Throwable th = null;
        yre yreVar = v1bVar instanceof yre ? (yre) v1bVar : null;
        if (yreVar != null) {
            long j = yre.v;
            loop0: while (true) {
                Object objectVolatile = s0o.a.getObjectVolatile(yreVar, j);
                toe0 toe0Var = zre.b;
                if (objectVolatile == toe0Var) {
                    while (true) {
                        Unsafe unsafe = s0o.a;
                        bc6<T> bc6Var2 = this;
                        bc6Var = bc6Var2;
                        if (unsafe.compareAndSwapObject(yreVar, yre.v, toe0Var, bc6Var2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(yreVar, j) != toe0Var) {
                            break;
                        } else {
                            this = bc6Var;
                        }
                    }
                    this = bc6Var;
                } else {
                    bc6Var = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        ogf.a(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = s0o.a;
                        if (unsafe2.compareAndSwapObject(yreVar, yre.v, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(yreVar, j) != objectVolatile) {
                            hb5.a("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            bc6Var.l();
            bc6Var.cancel(th);
        }
    }

    public final void B(T t, final Function1<? super Throwable, Unit> function1) {
        C(t, this.c, function1 != null ? new gaj() { // from class: ac6
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                function1.invoke((Throwable) obj);
                return Unit.a;
            }
        } : null);
    }

    public final <R> void C(R r, int i2, gaj<? super Throwable, ? super R, ? super CoroutineContext, Unit> gajVar) {
        bc6<T> bc6Var;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof bzx)) {
                bc6<T> bc6Var2 = this;
                if (objectVolatile instanceof ic6) {
                    ic6 ic6Var = (ic6) objectVolatile;
                    if (unsafe.compareAndSwapInt(ic6Var, ic6.c, 0, 1)) {
                        if (gajVar != null) {
                            bc6Var2.j(gajVar, ic6Var.a, r);
                            return;
                        }
                        return;
                    }
                }
                ogf.a(r, "Already resumed, but proposed with update ");
                return;
            }
            Object objE = E((bzx) objectVolatile, r, i2, gajVar);
            while (true) {
                Unsafe unsafe2 = s0o.a;
                bc6Var = this;
                if (unsafe2.compareAndSwapObject(bc6Var, v, objectVolatile, objE)) {
                    if (!bc6Var.w()) {
                        bc6Var.l();
                    }
                    bc6Var.m(i2);
                    return;
                } else if (unsafe2.getObjectVolatile(bc6Var, j) != objectVolatile) {
                    break;
                } else {
                    this = bc6Var;
                }
            }
            this = bc6Var;
        }
    }

    public final void D(k5b k5bVar, Unit unit) {
        v1b<T> v1bVar = this.d;
        yre yreVar = v1bVar instanceof yre ? (yre) v1bVar : null;
        C(unit, (yreVar != null ? yreVar.d : null) == k5bVar ? 4 : this.c, null);
    }

    public final toe0 F(Object obj, gaj gajVar) {
        bc6<T> bc6Var;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof bzx)) {
                return null;
            }
            Object objE = E((bzx) objectVolatile, obj, this.c, gajVar);
            while (true) {
                Unsafe unsafe2 = s0o.a;
                bc6Var = this;
                if (unsafe2.compareAndSwapObject(bc6Var, v, objectVolatile, objE)) {
                    boolean zW = bc6Var.w();
                    toe0 toe0Var = cc6.a;
                    if (!zW) {
                        bc6Var.l();
                    }
                    return toe0Var;
                }
                if (unsafe2.getObjectVolatile(bc6Var, j) != objectVolatile) {
                    break;
                }
                this = bc6Var;
            }
            this = bc6Var;
        }
    }

    @Override // defpackage.bwi0
    public final void a(f580<?> f580Var, int i2) {
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                ib5.a("invokeOnCancellation should be called at most once");
                return;
            }
            bc6<T> bc6Var = this;
            if (unsafe.compareAndSwapInt(bc6Var, j, intVolatile, ((intVolatile >> 29) << 29) + i2)) {
                bc6Var.u(f580Var);
                return;
            }
            this = bc6Var;
        }
    }

    @Override // defpackage.bse
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        bc6<T> bc6Var;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof bzx) {
                ib5.a("Not completed");
                return;
            }
            if (objectVolatile instanceof dn8) {
                return;
            }
            if (objectVolatile instanceof bn8) {
                bn8 bn8Var = (bn8) objectVolatile;
                if (bn8Var.e != null) {
                    ib5.a("Must be called at most once");
                    return;
                }
                bn8 bn8VarA = bn8.a(bn8Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = s0o.a;
                    bc6<T> bc6Var2 = this;
                    if (unsafe2.compareAndSwapObject(bc6Var2, v, objectVolatile, bn8VarA)) {
                        ob6 ob6Var = bn8Var.b;
                        if (ob6Var != null) {
                            bc6Var2.h(ob6Var, cancellationException);
                        }
                        gaj<Throwable, R, CoroutineContext, Unit> gajVar = bn8Var.c;
                        if (gajVar != 0) {
                            bc6Var2.j(gajVar, cancellationException, bn8Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(bc6Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        bc6Var = bc6Var2;
                        break;
                    }
                    this = bc6Var2;
                }
            } else {
                bc6<T> bc6Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                bn8 bn8Var2 = new bn8(objectVolatile, (ob6) null, (gaj) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    bn8 bn8Var3 = bn8Var2;
                    Unsafe unsafe3 = s0o.a;
                    bc6Var = bc6Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(bc6Var, v, objectVolatile, bn8Var3);
                    bn8Var2 = bn8Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(bc6Var, j) != objectVolatile) {
                        break;
                    } else {
                        bc6Var3 = bc6Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = bc6Var;
        }
    }

    @Override // defpackage.bse
    public final v1b<T> c() {
        return this.d;
    }

    @Override // defpackage.zb6
    public final boolean cancel(Throwable th) {
        Throwable cancellationException;
        bc6<T> bc6Var;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof bzx)) {
                return false;
            }
            boolean z = (objectVolatile instanceof ob6) || (objectVolatile instanceof f580);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            ic6 ic6Var = new ic6(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = s0o.a;
                bc6Var = this;
                if (unsafe2.compareAndSwapObject(bc6Var, v, objectVolatile, ic6Var)) {
                    bzx bzxVar = (bzx) objectVolatile;
                    if (bzxVar instanceof ob6) {
                        bc6Var.h((ob6) objectVolatile, th);
                    } else if (bzxVar instanceof f580) {
                        bc6Var.k((f580) objectVolatile, th);
                    }
                    if (!bc6Var.w()) {
                        bc6Var.l();
                    }
                    bc6Var.m(bc6Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(bc6Var, j) != objectVolatile) {
                    break;
                }
                this = bc6Var;
            }
            this = bc6Var;
        }
    }

    @Override // defpackage.bse
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bse
    public final <T> T e(Object obj) {
        return obj instanceof bn8 ? (T) ((bn8) obj).a : obj;
    }

    @Override // defpackage.bse
    public final Object g() {
        return p();
    }

    @Override // defpackage.z5b
    public final z5b getCallerFrame() {
        v1b<T> v1bVar = this.d;
        if (v1bVar instanceof z5b) {
            return (z5b) v1bVar;
        }
        return null;
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return this.e;
    }

    public final void h(ob6 ob6Var, Throwable th) {
        try {
            ob6Var.b(th);
        } catch (Throwable th2) {
            o5b.a(this.e, new fn8("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.zb6
    public final toe0 i(Object obj, gaj gajVar) {
        return F(obj, gajVar);
    }

    @Override // defpackage.zb6
    public final boolean isActive() {
        return p() instanceof bzx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void j(gaj<? super Throwable, ? super R, ? super CoroutineContext, Unit> gajVar, Throwable th, R r) {
        CoroutineContext coroutineContext = this.e;
        try {
            gajVar.invoke(th, r, coroutineContext);
        } catch (Throwable th2) {
            o5b.a(coroutineContext, new fn8("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(f580<?> f580Var, Throwable th) {
        CoroutineContext coroutineContext = this.e;
        int intVolatile = s0o.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile == 536870911) {
            ib5.a("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            f580Var.h(intVolatile, coroutineContext);
        } catch (Throwable th2) {
            o5b.a(coroutineContext, new fn8("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l() {
        Unsafe unsafe = s0o.a;
        long j = i;
        wse wseVar = (wse) unsafe.getObjectVolatile(this, j);
        if (wseVar == null) {
            return;
        }
        wseVar.dispose();
        unsafe.putObjectVolatile(this, j, lxx.a);
    }

    public final void m(int i2) {
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i3 = intVolatile >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    ib5.a("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                v1b<T> v1bVar = this.d;
                if (!z && (v1bVar instanceof yre)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i4 = this.c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        yre yreVar = (yre) v1bVar;
                        k5b k5bVar = yreVar.d;
                        CoroutineContext context = yreVar.e.getContext();
                        if (zre.d(k5bVar, context)) {
                            zre.c(k5bVar, context, this);
                            return;
                        }
                        tpg tpgVarA = xof0.a();
                        if (tpgVarA.b >= 4294967296L) {
                            tpgVarA.l0(this);
                            return;
                        }
                        tpgVarA.n0(true);
                        try {
                            cse.a(this, v1bVar, true);
                            do {
                            } while (tpgVarA.z0());
                        } catch (Throwable th) {
                            try {
                                this.f(th);
                            } finally {
                                tpgVarA.h0(true);
                            }
                        }
                        return;
                    }
                }
                cse.a(this, v1bVar, z);
                return;
            }
            bc6<T> bc6Var = this;
            if (unsafe.compareAndSwapInt(bc6Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = bc6Var;
            }
        }
    }

    public Throwable n(m9p m9pVar) {
        return m9pVar.getCancellationException();
    }

    public final Object o() throws Throwable {
        c9p c9pVar;
        boolean zW = w();
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    ib5.a("Already suspended");
                    return null;
                }
                if (zW) {
                    this.A();
                }
                Object objP = this.p();
                if (objP instanceof dn8) {
                    throw ((dn8) objP).a;
                }
                int i3 = this.c;
                if ((i3 != 1 && i3 != 2) || (c9pVar = (c9p) this.e.get(c9p.b.a)) == null || c9pVar.isActive()) {
                    return this.e(objP);
                }
                CancellationException cancellationException = c9pVar.getCancellationException();
                this.b(cancellationException);
                throw cancellationException;
            }
            bc6<T> bc6Var = this;
            if (unsafe.compareAndSwapInt(bc6Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((wse) unsafe.getObjectVolatile(bc6Var, i)) == null) {
                    bc6Var.r();
                }
                if (zW) {
                    bc6Var.A();
                }
                return y5b.a;
            }
            this = bc6Var;
        }
    }

    public final Object p() {
        return s0o.a.getObjectVolatile(this, v);
    }

    public final void q() {
        wse wseVarR = r();
        if (wseVarR != null && v()) {
            wseVarR.dispose();
            s0o.a.putObjectVolatile(this, i, lxx.a);
        }
    }

    public final wse r() {
        c9p c9pVar = (c9p) this.e.get(c9p.b.a);
        if (c9pVar == null) {
            return null;
        }
        wse wseVarG = i9p.g(c9pVar, new yj7(this));
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = i;
            bc6<T> bc6Var = this;
            if (unsafe.compareAndSwapObject(bc6Var, j, (Object) null, wseVarG) || unsafe.getObjectVolatile(bc6Var, j) != null) {
                break;
            }
            this = bc6Var;
        }
        return wseVarG;
    }

    @Override // defpackage.v1b
    public final void resumeWith(Object obj) {
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            obj = new dn8(thA, false);
        }
        C(obj, this.c, null);
    }

    @Override // defpackage.zb6
    public final <R extends T> void s(R r, gaj<? super Throwable, ? super R, ? super CoroutineContext, Unit> gajVar) {
        C(r, this.c, gajVar);
    }

    public final void t(Function1<? super Throwable, Unit> function1) {
        u(new ob6.a(function1));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(z());
        sb.append('(');
        sb.append(x2d.e(this.d));
        sb.append("){");
        Object objP = p();
        if (objP instanceof bzx) {
            str = "Active";
        } else {
            str = objP instanceof ic6 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(x2d.b(this));
        return sb.toString();
    }

    public final void u(bzx bzxVar) {
        bzx bzxVar2;
        bc6<T> bc6Var;
        bc6<T> bc6Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = s0o.a;
            long j = v;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof fc) {
                while (true) {
                    Unsafe unsafe3 = s0o.a;
                    bc6<T> bc6Var3 = this;
                    bzx bzxVar3 = bzxVar;
                    bc6Var = bc6Var3;
                    bzxVar2 = bzxVar3;
                    if (unsafe3.compareAndSwapObject(bc6Var3, v, objectVolatile, bzxVar3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(bc6Var, j) != objectVolatile) {
                        break;
                    }
                    this = bc6Var;
                    bzxVar = bzxVar2;
                }
            } else {
                bzxVar2 = bzxVar;
                bc6Var = this;
                if ((objectVolatile instanceof ob6) || (objectVolatile instanceof f580)) {
                    y(bzxVar2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof dn8) {
                    dn8 dn8Var = (dn8) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(dn8Var, dn8.b, 0, 1)) {
                        y(bzxVar2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof ic6) {
                        Throwable th = dn8Var.a;
                        if (bzxVar2 instanceof ob6) {
                            bc6Var.h((ob6) bzxVar2, th);
                            return;
                        } else {
                            bc6Var.k((f580) bzxVar2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof bn8) {
                    bn8 bn8Var = (bn8) objectVolatile;
                    if (bn8Var.b != null) {
                        y(bzxVar2, objectVolatile);
                        throw null;
                    }
                    if (bzxVar2 instanceof f580) {
                        return;
                    }
                    ob6 ob6Var = (ob6) bzxVar2;
                    Throwable th2 = bn8Var.e;
                    if (th2 != null) {
                        bc6Var.h(ob6Var, th2);
                        return;
                    }
                    bn8 bn8VarA = bn8.a(bn8Var, ob6Var, null, 29);
                    do {
                        unsafe = s0o.a;
                        if (unsafe.compareAndSwapObject(bc6Var, v, objectVolatile, bn8VarA)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(bc6Var, j) == objectVolatile);
                } else {
                    if (bzxVar2 instanceof f580) {
                        return;
                    }
                    bn8 bn8Var2 = new bn8(objectVolatile, (ob6) bzxVar2, (gaj) null, (Throwable) null, 28);
                    while (true) {
                        bn8 bn8Var3 = bn8Var2;
                        Unsafe unsafe4 = s0o.a;
                        bc6Var2 = bc6Var;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(bc6Var2, v, objectVolatile, bn8Var3);
                        bn8Var2 = bn8Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(bc6Var2, j) != objectVolatile) {
                            break;
                        } else {
                            bc6Var = bc6Var2;
                        }
                    }
                }
                this = bc6Var2;
                bzxVar = bzxVar2;
            }
            bc6Var2 = bc6Var;
            this = bc6Var2;
            bzxVar = bzxVar2;
        }
    }

    public final boolean v() {
        return !(p() instanceof bzx);
    }

    public final boolean w() {
        if (this.c != 2) {
            return false;
        }
        v1b<T> v1bVar = this.d;
        v1bVar.getClass();
        return s0o.a.getObjectVolatile((yre) v1bVar, yre.v) != null;
    }

    @Override // defpackage.zb6
    public final void x(Object obj) {
        m(this.c);
    }

    public String z() {
        return "CancellableContinuation";
    }
}
