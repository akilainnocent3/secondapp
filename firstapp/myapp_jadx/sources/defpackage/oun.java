package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oun implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ oun(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final Function1 function1 = this.b;
        switch (i) {
            case 0:
                zrd0 zrd0Var = (zrd0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zrd0Var.getClass();
                function1.invoke(new c.q.C0311c(zrd0Var, zBooleanValue));
                function1.invoke(c.r.b.a);
                break;
            default:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM = aVar.M(function1);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: res
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(rcs.TIME);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    mb90.b(null, (Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
