package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s1n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                f3n f3nVar = (f3n) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h9n.a(erz.a(f3nVar.i.a ? R.drawable.ic__feature__match_status_won : R.drawable.ic__feature__play__fill, 0, aVar), null, g3w.h(j.r(d.a.b, 16.0f), "ib_header_highlight_icon"), null, null, 0.0f, null, aVar, 432, 120);
                } else {
                    aVar.G();
                }
                break;
            default:
                haw hawVar = (haw) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = haw.E;
                if (aVar2.q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    boolean zA = aVar2.A(hawVar);
                    Object objY = aVar2.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new x9w(hawVar, i2);
                        aVar2.r(objY);
                    }
                    n9w.a(0, aVar2, null, (Function0) objY);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
