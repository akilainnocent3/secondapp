package defpackage;

import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j9p extends uet implements wse, uen {
    public m9p d;

    @Override // defpackage.uen
    public final exx a() {
        return null;
    }

    @Override // defpackage.wse
    public final void dispose() {
        j9p j9pVar;
        Unsafe unsafe;
        long j;
        m9p m9pVarJ = j();
        while (true) {
            Object objK = m9pVarJ.K();
            if (objK instanceof j9p) {
                if (objK != this) {
                    return;
                }
                do {
                    unsafe = s0o.a;
                    j = m9p.b;
                    if (unsafe.compareAndSwapObject(m9pVarJ, j, objK, p9p.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(m9pVarJ, j) == objK);
            } else {
                if (!(objK instanceof uen) || ((uen) objK).a() == null) {
                    return;
                }
                while (true) {
                    Object objF = this.f();
                    if (objF instanceof k750) {
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    objF.getClass();
                    uet uetVar = (uet) objF;
                    Unsafe unsafe2 = s0o.a;
                    long j2 = uet.c;
                    k750 k750Var = (k750) unsafe2.getObjectVolatile(uetVar, j2);
                    if (k750Var == null) {
                        k750Var = new k750(uetVar);
                        unsafe2.putObjectVolatile(uetVar, j2, k750Var);
                    }
                    k750 k750Var2 = k750Var;
                    while (true) {
                        Unsafe unsafe3 = s0o.a;
                        long j3 = uet.a;
                        j9pVar = this;
                        if (unsafe3.compareAndSwapObject(j9pVar, j3, objF, k750Var2)) {
                            uetVar.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(j9pVar, j3) != objF) {
                            break;
                        } else {
                            this = j9pVar;
                        }
                    }
                    this = j9pVar;
                }
            }
        }
    }

    public c9p getParent() {
        return j();
    }

    @Override // defpackage.uen
    public final boolean isActive() {
        return true;
    }

    public final m9p j() {
        m9p m9pVar = this.d;
        if (m9pVar != null) {
            return m9pVar;
        }
        Intrinsics.n("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.uet
    public final String toString() {
        return getClass().getSimpleName() + '@' + x2d.b(this) + "[job@" + x2d.b(j()) + ']';
    }
}
