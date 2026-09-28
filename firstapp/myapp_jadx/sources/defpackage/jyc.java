package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jyc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ guc a;
    public final /* synthetic */ iu5 b;
    public final /* synthetic */ du5 c;
    public final /* synthetic */ List<a6c> d;
    public final /* synthetic */ gtc e;

    public jyc(guc gucVar, iu5 iu5Var, du5 du5Var, List<a6c> list, gtc gtcVar) {
        this.a = gucVar;
        this.b = iu5Var;
        this.c = du5Var;
        this.d = list;
        this.e = gtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strA = this.a.a(Long.valueOf(this.b.e), this.c.a);
            if (strA == null) {
                strA = "-";
            }
            d dVarE = h.e(d.a.b, byc.a);
            final List<a6c> list = this.d;
            boolean zA = aVar2.A(list);
            Object objY = aVar2.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function1() { // from class: iyc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ohp<Object>[] ohpVarArr = lb80.a;
                        ob80<List<a6c>> ob80Var = ra80.w;
                        ohp<Object> ohpVar = lb80.a[28];
                        ((pb80) obj).b(ob80Var, list);
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            lkf0.d(strA, xa80.b(dVarE, false, (Function1) objY), this.e.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262136);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
