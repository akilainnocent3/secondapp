package defpackage;

import com.sportygames.speedybingo.data.dto.SBBetRequest;
import com.sportygames.speedybingo.data.dto.SBTicketDTO;
import com.sportygames.speedybingo.data.dto.SBUserSelectionDTO;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class la60 implements ja60 {
    public final iua0 a;

    public la60(iua0 iua0Var) {
        iua0Var.getClass();
        this.a = iua0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.String] */
    @Override // defpackage.ja60
    public final yzh a(na60 na60Var, na60 na60Var2, d860 d860Var, long j) {
        Double dValueOf;
        qcn<qcn<Integer>> qcnVar;
        na60Var.getClass();
        na60Var2.getClass();
        d860Var.getClass();
        dq40 dq40Var = new dq40();
        Double dValueOf2 = Double.valueOf(d860Var.a().doubleValue());
        qcn<qcn<Integer>> qcnVar2 = null;
        if (d860Var instanceof d860.a) {
            dValueOf = null;
        } else {
            if (!(d860Var instanceof d860.b)) {
                uhc.a();
                return null;
            }
            d860.b bVar = (d860.b) d860Var;
            dq40Var.a = bVar.a.getGiftId();
            dValueOf = Double.valueOf(bVar.b.doubleValue());
        }
        if (na60Var instanceof na60.a) {
            qcnVar = ((na60.a) na60Var).a;
        } else {
            if (!Intrinsics.g(na60Var, na60.b.a)) {
                uhc.a();
                return null;
            }
            qcnVar = null;
        }
        if (na60Var2 instanceof na60.a) {
            qcnVar2 = ((na60.a) na60Var2).a;
        } else if (!Intrinsics.g(na60Var2, na60.b.a)) {
            uhc.a();
            return null;
        }
        int i = 0;
        ArrayList arrayListV = ay0.v(new List[]{qcnVar, qcnVar2});
        ArrayList arrayList = new ArrayList(l48.r(arrayListV, 10));
        int size = arrayListV.size();
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            arrayList.add(new SBTicketDTO((List) obj));
        }
        return em50.a(new ka60(this.a.h(new SBBetRequest(new SBUserSelectionDTO(arrayList), dValueOf2, dValueOf, (String) dq40Var.a, j)), this, dq40Var));
    }
}
