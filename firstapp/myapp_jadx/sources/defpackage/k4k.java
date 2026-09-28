package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.ClabeResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class k4k {
    public final sr10 a;

    public k4k(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        j4k j4kVar;
        if (x1bVar instanceof j4k) {
            j4kVar = (j4k) x1bVar;
            int i = j4kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4kVar.c = i - Integer.MIN_VALUE;
            } else {
                j4kVar = new j4k(this, x1bVar);
            }
        } else {
            j4kVar = new j4k(this, x1bVar);
        }
        Object objH = j4kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = j4kVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objH);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                j4kVar.c = 1;
                objH = sr10Var.H(j4kVar);
                if (objH == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objH);
            }
            ClabeResponse clabeResponse = (ClabeResponse) n52.b((BaseResponse) objH);
            zi50.a aVar2 = zi50.b;
            return clabeResponse;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
