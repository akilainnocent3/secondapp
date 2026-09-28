package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Long l = (Long) obj2;
                if (i980.a((g980) obj3, l.longValue())) {
                    return l;
                }
                return null;
            default:
                Function1 function1 = (Function1) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strA = cb40.a(R.string.common_functions__lucky_wheel, new Object[0], aVar);
                    boolean zM = aVar.M(function1);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zM || objY == c0042a) {
                        objY = new ob2(function1, 1);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zM2 = aVar.M(function1);
                    Object objY2 = aVar.y();
                    if (zM2 || objY2 == c0042a) {
                        objY2 = new ucb(function1, i2);
                        aVar.r(objY2);
                    }
                    odd0.c(null, strA, function0, (Function0) objY2, aVar, 0, 1);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
