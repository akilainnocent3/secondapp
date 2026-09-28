package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.data.NCResponse;
import com.sportybet.feature.notificationcenter.db.NCDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class s3x extends r650<Integer, h3x> {
    public final int a;
    public final k3x b;
    public final NCDatabase c;

    public s3x(int i, k3x k3xVar, NCDatabase nCDatabase) {
        this.a = i;
        this.b = k3xVar;
        this.c = nCDatabase;
    }

    @Override // defpackage.r650
    public final Object b(kxs kxsVar, xqz xqzVar, tje0 tje0Var) {
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            return c(xqzVar.c.a, true, tje0Var);
        }
        if (iOrdinal == 1) {
            return new r650.b.C1034b(true);
        }
        if (iOrdinal == 2) {
            return c(xqzVar.c.a, false, tje0Var);
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(int i, boolean z, x1b x1bVar) {
        q3x q3xVar;
        int i2;
        boolean z2;
        String str;
        u2x u2xVar;
        int i3;
        boolean z3;
        NCResponse nCResponse;
        r3x r3xVar;
        NCResponse nCResponse2;
        if (x1bVar instanceof q3x) {
            q3xVar = (q3x) x1bVar;
            int i4 = q3xVar.i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                q3xVar.i = i4 - Integer.MIN_VALUE;
            } else {
                q3xVar = new q3x(this, x1bVar);
            }
        } else {
            q3xVar = new q3x(this, x1bVar);
        }
        q3x q3xVar2 = q3xVar;
        Object objD = q3xVar2.e;
        y5b y5bVar = y5b.a;
        int i5 = q3xVar2.i;
        int i6 = this.a;
        NCDatabase nCDatabase = this.c;
        try {
            if (i5 == 0) {
                uj50.b(objD);
                o2x o2xVarX = nCDatabase.x();
                i2 = i;
                q3xVar2.a = i2;
                z2 = z;
                q3xVar2.b = z2;
                q3xVar2.i = 1;
                objD = o2xVarX.d(i6, q3xVar2);
                if (objD == y5bVar) {
                }
                return y5bVar;
            }
            if (i5 == 1) {
                boolean z4 = q3xVar2.b;
                int i7 = q3xVar2.a;
                uj50.b(objD);
                z2 = z4;
                i2 = i7;
            } else {
                if (i5 == 2) {
                    z3 = q3xVar2.b;
                    int i8 = q3xVar2.a;
                    u2xVar = q3xVar2.c;
                    uj50.b(objD);
                    i3 = i8;
                    nCResponse = (NCResponse) n52.b((BaseResponse) objD);
                    r3xVar = new r3x(z3, this, nCResponse, u2xVar, null);
                    q3xVar2.c = null;
                    q3xVar2.d = nCResponse;
                    q3xVar2.a = i3;
                    q3xVar2.b = z3;
                    q3xVar2.i = 3;
                    if (qv50.b(nCDatabase, r3xVar, q3xVar2) != y5bVar) {
                        nCResponse2 = nCResponse;
                    }
                    return y5bVar;
                }
                if (i5 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nCResponse2 = q3xVar2.d;
                uj50.b(objD);
            }
            return new r650.b.C1034b(!nCResponse2.getPageInfo().getHasNextPage());
            u2x u2xVar2 = (u2x) objD;
            if (z2 || u2xVar2 == null || (str = u2xVar2.c) == null || str.length() <= 0) {
                str = null;
            }
            k3x k3xVar = this.b;
            q3xVar2.c = u2xVar2;
            q3xVar2.a = i2;
            q3xVar2.b = z2;
            q3xVar2.i = 2;
            Object objA = k3xVar.a(i6, i2, str, q3xVar2);
            if (objA != y5bVar) {
                u2xVar = u2xVar2;
                i3 = i2;
                objD = objA;
                z3 = z2;
                nCResponse = (NCResponse) n52.b((BaseResponse) objD);
                r3xVar = new r3x(z3, this, nCResponse, u2xVar, null);
                q3xVar2.c = null;
                q3xVar2.d = nCResponse;
                q3xVar2.a = i3;
                q3xVar2.b = z3;
                q3xVar2.i = 3;
                if (qv50.b(nCDatabase, r3xVar, q3xVar2) != y5bVar) {
                    nCResponse2 = nCResponse;
                    return new r650.b.C1034b(!nCResponse2.getPageInfo().getHasNextPage());
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            return new r650.b.a(th);
        }
    }
}
