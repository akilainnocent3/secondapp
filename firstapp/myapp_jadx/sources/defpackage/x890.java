package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.orders.SOrder;
import com.sporty.android.core.model.orders.SOrderEntity;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes.dex */
public final class x890 {
    public final g3z a;
    public final k650 b;
    public final mpe0 c = hwr.b(new b1d(this, 1));

    public x890(g3z g3zVar, k650 k650Var) {
        this.a = g3zVar;
        this.b = k650Var;
    }

    public final long a() {
        return ((Number) this.c.getValue()).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        w890 w890Var;
        Object bVar;
        if (x1bVar instanceof w890) {
            w890Var = (w890) x1bVar;
            int i = w890Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w890Var.c = i - Integer.MIN_VALUE;
            } else {
                w890Var = new w890(this, x1bVar);
            }
        } else {
            w890Var = new w890(this, x1bVar);
        }
        Object objS = w890Var.a;
        y5b y5bVar = y5b.a;
        int i2 = w890Var.c;
        boolean z = true;
        char c = 1;
        try {
            if (i2 == 0) {
                uj50.b(objS);
                zi50.a aVar = zi50.b;
                g3z g3zVar = this.a;
                w890Var.c = 1;
                objS = g3zVar.s(w890Var);
                if (objS == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objS);
            }
            SOrder sOrder = (SOrder) n52.b((BaseResponse) objS);
            mpe0 mpe0VarB = hwr.b(new a1d(hwr.b(new v890()), c == true ? 1 : 0));
            List<SOrderEntity> list = sOrder.orders;
            if (list != null && !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    SOrderEntity sOrderEntity = (SOrderEntity) it.next();
                    if (sOrderEntity.bizType == 30 && sOrderEntity.winningStatus == 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long jA = a();
                        long j = sOrderEntity.createTime;
                        b.a aVar2 = b.b;
                        if (jCurrentTimeMillis <= j + b.e(c.i(jA, rgf.DAYS)) + ((long) ((TimeZone) mpe0VarB.getValue()).getRawOffset())) {
                            break;
                        }
                    }
                }
            } else {
                z = false;
                break;
            }
            bVar = Boolean.valueOf(z);
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        Boolean bool = (Boolean) (bVar instanceof zi50.b ? null : bVar);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
