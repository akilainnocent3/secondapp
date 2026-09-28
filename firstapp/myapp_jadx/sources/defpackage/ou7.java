package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ou7 {
    public final wo5 a;
    public final mgb0 b;

    public ou7(wo5 wo5Var, mgb0 mgb0Var) {
        wo5Var.getClass();
        mgb0Var.getClass();
        this.a = wo5Var;
        this.b = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        mu7 mu7Var;
        List<CMSResponse> list;
        if (x1bVar instanceof mu7) {
            mu7Var = (mu7) x1bVar;
            int i = mu7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mu7Var.c = i - Integer.MIN_VALUE;
            } else {
                mu7Var = new mu7(this, x1bVar);
            }
        } else {
            mu7Var = new mu7(this, x1bVar);
        }
        Object objE = mu7Var.a;
        y5b y5bVar = y5b.a;
        int i2 = mu7Var.c;
        Object bVar = null;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                zi50.a aVar = zi50.b;
                nu7 nu7Var = new nu7(wo5.b(this.a, str, this.b.getLanguageCode(null), 2));
                mu7Var.c = 1;
                objE = s0i.e(nu7Var, mu7Var);
                if (objE == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objE);
            }
            lk50 lk50Var = (lk50) objE;
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            if (cVar != null && (list = (List) cVar.a) != null) {
                ArrayList arrayList = new ArrayList();
                for (CMSResponse cMSResponse : list) {
                    String key = cMSResponse.getKey();
                    String value = cMSResponse.getValue();
                    Pair pair = (key == null || StringsKt.U(key) || value == null || StringsKt.U(value)) ? null : new Pair(key, value);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                bVar = kpu.k(arrayList);
            }
            if (bVar == null) {
                bVar = o2g.a;
                bVar.getClass();
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return bVar instanceof zi50.b ? o2gVar : bVar;
    }
}
