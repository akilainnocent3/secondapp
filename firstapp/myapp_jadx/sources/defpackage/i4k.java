package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i4k {
    public final sr10 a;

    public i4k(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, x1b x1bVar) {
        h4k h4kVar;
        if (x1bVar instanceof h4k) {
            h4kVar = (h4k) x1bVar;
            int i2 = h4kVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h4kVar.c = i2 - Integer.MIN_VALUE;
            } else {
                h4kVar = new h4k(this, x1bVar);
            }
        } else {
            h4kVar = new h4k(this, x1bVar);
        }
        Object objD = h4kVar.a;
        y5b y5bVar = y5b.a;
        int i3 = h4kVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                h4kVar.c = 1;
                objD = sr10Var.d(i, h4kVar);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objD);
            }
            List list = (List) n52.b((BaseResponse) objD);
            zi50.a aVar2 = zi50.b;
            return list;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
