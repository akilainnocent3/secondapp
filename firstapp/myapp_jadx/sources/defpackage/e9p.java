package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public class e9p extends m9p {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9p(c9p c9pVar) {
        super(true);
        boolean z = true;
        N(c9pVar);
        Unsafe unsafe = s0o.a;
        long j = m9p.a;
        zj7 zj7Var = (zj7) unsafe.getObjectVolatile(this, j);
        ak7 ak7Var = zj7Var instanceof ak7 ? (ak7) zj7Var : null;
        if (ak7Var == null) {
            z = false;
            break;
        }
        m9p m9pVarJ = ak7Var.j();
        while (!m9pVarJ.D()) {
            zj7 zj7Var2 = (zj7) s0o.a.getObjectVolatile(m9pVarJ, j);
            ak7 ak7Var2 = zj7Var2 instanceof ak7 ? (ak7) zj7Var2 : null;
            if (ak7Var2 == null) {
                z = false;
                break;
            }
            m9pVarJ = ak7Var2.j();
        }
        this.d = z;
    }

    @Override // defpackage.m9p
    public final boolean D() {
        return this.d;
    }

    @Override // defpackage.m9p
    public final boolean E() {
        return true;
    }
}
