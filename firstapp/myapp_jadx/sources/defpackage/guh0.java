package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.globalpay.data.CPFStatus;
import com.sportybet.android.globalpay.data.CPFValidateResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class guh0 {
    public final u1l a;

    public guh0(u1l u1lVar) {
        u1lVar.getClass();
        this.a = u1lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable a(String str, x1b x1bVar) {
        fuh0 fuh0Var;
        Object bVar;
        if (x1bVar instanceof fuh0) {
            fuh0Var = (fuh0) x1bVar;
            int i = fuh0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fuh0Var.c = i - Integer.MIN_VALUE;
            } else {
                fuh0Var = new fuh0(this, x1bVar);
            }
        } else {
            fuh0Var = new fuh0(this, x1bVar);
        }
        Object objD = fuh0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = fuh0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                u1l u1lVar = this.a;
                fuh0Var.c = 1;
                objD = u1lVar.d(str, fuh0Var);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objD);
            }
            bVar = (BaseResponse) objD;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            return new zi50.b(thA);
        }
        BaseResponse baseResponse = (BaseResponse) bVar;
        return Boolean.valueOf(baseResponse.isSuccessful() && CPFStatus.INSTANCE.isValid(((CPFValidateResult) baseResponse.data).getStatus()));
    }
}
