package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s94 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s94(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object[] objArr = 0;
        int i2 = 1;
        switch (i) {
            case 0:
                y94 y94Var = (y94) obj4;
                yfx yfxVar = (yfx) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1471823392, new t94(objArr == true ? 1 : 0, y94Var, yfxVar), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
            default:
                jqc0 jqc0Var = (jqc0) obj4;
                Function1 function1 = (Function1) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strA = cb40.a(R.string.page_instant_virtual__or_click_lucky_pick_to_quickly_generate_a_match, new Object[0], aVar2);
                    d dVarG = h.g(g3w.k(d.a.b, jqc0Var.b == kqc0.b), 8.0f, 4.0f);
                    boolean zM = aVar2.M(function1);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zM || objY == c0042a) {
                        objY = new mbw(function1, i2);
                        aVar2.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zM2 = aVar2.M(function1);
                    Object objY2 = aVar2.y();
                    if (zM2 || objY2 == c0042a) {
                        objY2 = new p3n(function1, i2);
                        aVar2.r(objY2);
                    }
                    Function0 function2 = (Function0) objY2;
                    boolean zM3 = aVar2.M(function1);
                    Object objY3 = aVar2.y();
                    if (zM3 || objY3 == c0042a) {
                        objY3 = new q3n(i2, function1);
                        aVar2.r(objY3);
                    }
                    iqc0.b(dVarG, 2, strA, function0, function2, (Function0) objY3, 0L, aVar2, 432, 128);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
