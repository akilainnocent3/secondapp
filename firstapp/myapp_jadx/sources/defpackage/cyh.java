package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cyh implements Function2 {
    public final /* synthetic */ twd0 a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ cyh(twd0 twd0Var, Function0 function0) {
        this.a = twd0Var;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            aVar.G();
        } else if (((Boolean) this.a.getValue()).booleanValue()) {
            aVar.N(1803691693);
            gyh.a(6, aVar, j.e(d.a.b, 1.0f), this.b);
            aVar.H();
        } else {
            aVar.N(1803831999);
            aVar.H();
        }
        return Unit.a;
    }
}
