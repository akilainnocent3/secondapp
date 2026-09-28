package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class esk implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ esk(re70 re70Var, int i) {
        this.b = re70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6n.a(function0, g3w.h(d.a.b, "back_button"), false, null, null, com.sportybet.feature.gift.gift.presentation.a.a, aVar, 1572912, 60);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qe70.d((re70) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
