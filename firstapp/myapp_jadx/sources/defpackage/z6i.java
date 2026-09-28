package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z6i implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z6i(chw chwVar, Function0 function0) {
        this.c = chwVar;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r7i.b(this.b, (op8) obj3, (a) obj, qj40.a(391));
                break;
            default:
                final chw chwVar = (chw) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nk5.b(this.b, g3w.h(j.e(d.a.b, 1.0f), "spin_button"), chwVar.c, j060.c(2.0f), null, null, new umz(0.0f, 0.0f, 0.0f, 0.0f), pp8.b(1324969881, new gaj() { // from class: ahw
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            a aVar2 = (a) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((e160) obj4).getClass();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                h6n.b(erz.a(R.drawable.spr_ic_multi_maker_spin, 0, aVar2), "Spin Icon", h.f(j.e(d.a.b, 1.0f), 10.0f), c68.a(chwVar.c ? R.color.icon_inverse_primary : R.color.icon_disable, aVar2), aVar2, 432, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 819462192, 304);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z6i(Function0 function0, op8 op8Var, int i) {
        this.b = function0;
        this.c = op8Var;
    }
}
