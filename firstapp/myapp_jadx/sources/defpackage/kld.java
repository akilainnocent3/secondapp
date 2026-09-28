package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class kld extends tj90 implements kee0 {
    public final ree0 n;

    public kld(ree0 ree0Var) {
        super(new nee0[2], new oee0[2]);
        int i = this.g;
        g5d[] g5dVarArr = this.e;
        ly0.f(i == g5dVarArr.length);
        for (g5d g5dVar : g5dVarArr) {
            g5dVar.l(1024);
        }
        this.n = ree0Var;
    }

    @Override // defpackage.tj90
    public final g5d g() {
        return new nee0();
    }

    @Override // defpackage.tj90
    public final h5d h() {
        return new tk90(this);
    }

    @Override // defpackage.tj90
    public final f5d i(Throwable th) {
        return new lee0("Unexpected decode error", th);
    }

    @Override // defpackage.tj90
    public final f5d j(g5d g5dVar, h5d h5dVar, boolean z) {
        nee0 nee0Var = (nee0) g5dVar;
        oee0 oee0Var = (oee0) h5dVar;
        try {
            ByteBuffer byteBuffer = nee0Var.d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            ree0 ree0Var = this.n;
            if (z) {
                ree0Var.reset();
            }
            jee0 jee0VarB = ree0Var.b(bArrArray, 0, iLimit);
            long j = nee0Var.f;
            long j2 = nee0Var.w;
            oee0Var.b = j;
            oee0Var.d = jee0VarB;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            oee0Var.e = j;
            oee0Var.c = false;
            return null;
        } catch (lee0 e) {
            return e;
        }
    }

    @Override // defpackage.kee0
    public final void a(long j) {
    }
}
