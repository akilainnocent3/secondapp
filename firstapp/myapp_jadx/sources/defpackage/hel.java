package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.FirstDepositSuccessData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class hel {
    public final sr10 a;
    public final mus b;

    public hel(sr10 sr10Var, mus musVar) {
        sr10Var.getClass();
        musVar.getClass();
        this.a = sr10Var;
        this.b = musVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(x1b x1bVar) {
        fel felVar;
        Serializable bVar;
        if (x1bVar instanceof fel) {
            felVar = (fel) x1bVar;
            int i = felVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                felVar.c = i - Integer.MIN_VALUE;
            } else {
                felVar = new fel(this, x1bVar);
            }
        } else {
            felVar = new fel(this, x1bVar);
        }
        Object objU = felVar.a;
        y5b y5bVar = y5b.a;
        int i2 = felVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objU);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                felVar.c = 1;
                objU = sr10Var.U(felVar);
                if (objU == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objU);
            }
            bVar = Boolean.valueOf(((FirstDepositSuccessData) n52.b((BaseResponse) objU)).getHasFirstDeposit());
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        return bVar instanceof zi50.b ? Boolean.FALSE : bVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        gel gelVar;
        if (x1bVar instanceof gel) {
            gelVar = (gel) x1bVar;
            int i = gelVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gelVar.d = i - Integer.MIN_VALUE;
            } else {
                gelVar = new gel(this, x1bVar);
            }
        } else {
            gelVar = new gel(this, x1bVar);
        }
        Object objB = gelVar.b;
        y5b y5bVar = y5b.a;
        int i2 = gelVar.d;
        mus musVar = this.b;
        if (i2 == 0) {
            uj50.b(objB);
            gelVar.d = 1;
            objB = musVar.b(gelVar);
            if (objB != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objB);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj = gelVar.a;
                uj50.b(objB);
                return obj;
            }
            uj50.b(objB);
        }
        if (((Boolean) objB).booleanValue()) {
            gelVar.a = objB;
            gelVar.d = 3;
            if (musVar.a(gelVar) == y5bVar) {
                return y5bVar;
            }
        }
        return objB;
        if (((Boolean) objB).booleanValue()) {
            return Boolean.TRUE;
        }
        gelVar.d = 2;
        objB = a(gelVar);
        if (objB != y5bVar) {
            if (((Boolean) objB).booleanValue()) {
                gelVar.a = objB;
                gelVar.d = 3;
                if (musVar.a(gelVar) == y5bVar) {
                }
            }
            return objB;
        }
        return y5bVar;
    }
}
