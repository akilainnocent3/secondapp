package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sporty.android.common.network.data.ResultsKt$combineResultsFlow$1", f = "Results.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ll50 extends tje0 implements gaj<lk50<Object>, lk50<Object>, v1b<? super lk50<Object>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;
    public final /* synthetic */ di7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll50(di7 di7Var, v1b v1bVar) {
        super(3, v1bVar);
        this.c = di7Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(lk50<Object> lk50Var, lk50<Object> lk50Var2, v1b<? super lk50<Object>> v1bVar) {
        ll50 ll50Var = new ll50(this.c, v1bVar);
        ll50Var.a = lk50Var;
        ll50Var.b = lk50Var2;
        return ll50Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List listK = b.k(lk50Var, lk50Var2);
        Iterator it = listK.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((lk50) next) instanceof lk50.a));
        lk50.a aVar = next instanceof lk50.a ? (lk50.a) next : null;
        if (!listK.isEmpty()) {
            Iterator it2 = listK.iterator();
            while (it2.hasNext()) {
                if (((lk50) it2.next()) instanceof lk50.b) {
                    return lk50.b.a;
                }
            }
        }
        if (aVar != null) {
            return new lk50.a(aVar.a);
        }
        lk50Var.getClass();
        Object obj2 = ((lk50.c) lk50Var).a;
        lk50Var2.getClass();
        return new lk50.c(this.c.invoke(obj2, ((lk50.c) lk50Var2).a));
    }
}
