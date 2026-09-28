package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckProcessor;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u4k {
    public final h940 a;

    public u4k(h940 h940Var) {
        h940Var.getClass();
        this.a = h940Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, x1b x1bVar) {
        t4k t4kVar;
        Object bVar;
        if (x1bVar instanceof t4k) {
            t4kVar = (t4k) x1bVar;
            int i = t4kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t4kVar.d = i - Integer.MIN_VALUE;
            } else {
                t4kVar = new t4k(this, x1bVar);
            }
        } else {
            t4kVar = new t4k(this, x1bVar);
        }
        Object objJ = t4kVar.b;
        y5b y5bVar = y5b.a;
        int i2 = t4kVar.d;
        try {
            if (i2 == 0) {
                uj50.b(objJ);
                zi50.a aVar = zi50.b;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l8s.a((Selection) it.next()));
                }
                h940 h940Var = this.a;
                Set setB = wi80.b(LiabilityCheckProcessor.BOOKING_CODE_LIABILITY_CHECK);
                t4kVar.a = list;
                t4kVar.d = 1;
                objJ = h940Var.J(arrayList, setB, t4kVar);
                if (objJ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = t4kVar.a;
                uj50.b(objJ);
            }
            bVar = k8s.a((BaseResponse) objJ, m8s.b, list);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            bVar = new j8s.d(m8s.b, thA);
        }
        j8s j8sVar = (j8s) (bVar instanceof zi50.b ? null : bVar);
        return j8sVar == null ? new j8s.d(m8s.b) : j8sVar;
    }
}
