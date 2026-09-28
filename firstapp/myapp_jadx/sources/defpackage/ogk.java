package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class ogk {
    public final eac a;

    public ogk(eac eacVar) {
        eacVar.getClass();
        this.a = eacVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        ngk ngkVar;
        Object cVar;
        if (x1bVar instanceof ngk) {
            ngkVar = (ngk) x1bVar;
            int i = ngkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ngkVar.d = i - Integer.MIN_VALUE;
            } else {
                ngkVar = new ngk(this, x1bVar);
            }
        } else {
            ngkVar = new ngk(this, x1bVar);
        }
        Object objD = ngkVar.b;
        y5b y5bVar = y5b.a;
        int i2 = ngkVar.d;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                eac eacVar = this.a;
                ngkVar.a = this;
                ngkVar.d = 1;
                objD = eacVar.d(ngkVar);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = ngkVar.a;
                uj50.b(objD);
            }
            et etVar = (et) n52.b((BaseResponse) objD);
            this.getClass();
            if (!etVar.getCanEditUsername() || etVar.getActiveCodes() > 0) {
                cVar = mqh0.b.a;
            } else {
                cVar = etVar.getEmptyCodes() > 0 ? new mqh0.c(etVar.getEmptyCodes()) : mqh0.a.a;
            }
            zi50.a aVar2 = zi50.b;
            return cVar;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
