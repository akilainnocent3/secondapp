package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.luckynumber.featurematch.presentation.g;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p99 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p99(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                szr szrVar = (szr) obj;
                szrVar.getClass();
                Iterator<E> it = ((qcn) obj2).iterator();
                while (it.hasNext()) {
                    final int iIntValue = ((Number) it.next()).intValue();
                    szrVar.i(hce0.a(iIntValue, "ball_"), "ball", new op8(664744288, new gaj() { // from class: q99
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            a aVar = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((gwr) obj3).getClass();
                            if (aVar.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                g.a(iIntValue, 0, aVar);
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                return Unit.a;
            default:
                vx00 vx00Var = (vx00) obj2;
                ((use) obj).getClass();
                vx00Var.getClass();
                vx00Var.L = ej5.c(o8i0.d(vx00Var), null, null, new gy00(vx00Var, null), 3);
                return new sw00.h(vx00Var);
        }
    }
}
