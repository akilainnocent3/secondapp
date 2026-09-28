package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.data.dto.TGPayTableDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b58 implements ksm {
    public final d4l a;
    public List<? extends List<Float>> b;

    public b58(d4l d4lVar) {
        d4lVar.getClass();
        this.a = d4lVar;
        this.b = m2g.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ksm
    public final Object a(x1b x1bVar) {
        z48 z48Var;
        if (x1bVar instanceof z48) {
            z48Var = (z48) x1bVar;
            int i = z48Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z48Var.c = i - Integer.MIN_VALUE;
            } else {
                z48Var = new z48(this, x1bVar);
            }
        } else {
            z48Var = new z48(this, x1bVar);
        }
        Object objJ = z48Var.a;
        y5b y5bVar = y5b.a;
        int i2 = z48Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objJ);
                d4l d4lVar = this.a;
                z48Var.c = 1;
                objJ = d4lVar.j(z48Var);
                if (objJ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objJ);
            }
            Iterable<List> iterable = (Iterable) em50.b((HTTPResponse) objJ);
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            for (List list : iterable) {
                ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boolean.valueOf(((Number) it.next()).intValue() == 1));
                }
                arrayList.add(arrayList2);
            }
            return new h48(arrayList);
        } catch (Throwable th) {
            return new i48(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ksm
    public final Object b(x1b x1bVar) {
        a58 a58Var;
        if (x1bVar instanceof a58) {
            a58Var = (a58) x1bVar;
            int i = a58Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a58Var.c = i - Integer.MIN_VALUE;
            } else {
                a58Var = new a58(this, x1bVar);
            }
        } else {
            a58Var = new a58(this, x1bVar);
        }
        Object objE = a58Var.a;
        y5b y5bVar = y5b.a;
        int i2 = a58Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                if (this.b.isEmpty()) {
                    d4l d4lVar = this.a;
                    a58Var.c = 1;
                    objE = d4lVar.e(a58Var);
                    if (objE == y5bVar) {
                        return y5bVar;
                    }
                }
                return new w48(this.b);
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objE);
            List<List<Double>> multipliers = ((TGPayTableDTO) em50.b((HTTPResponse) objE)).getMultipliers();
            ArrayList arrayList = new ArrayList(l48.r(multipliers, 10));
            Iterator<T> it = multipliers.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Float((float) ((Number) it2.next()).doubleValue()));
                }
                arrayList.add(arrayList2);
            }
            this.b = arrayList;
            return new w48(this.b);
        } catch (Throwable th) {
            return new x48(th);
        }
    }
}
