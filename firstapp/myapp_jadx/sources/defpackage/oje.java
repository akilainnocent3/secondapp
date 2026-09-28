package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oje implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oje(xv xvVar, omd0 omd0Var, int i) {
        this.b = xvVar;
        this.c = omd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ike.a((xv) obj4, (omd0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                hmi0 hmi0Var = (hmi0) obj4;
                f fVar = (f) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l0u.c(null, null, null, false, pp8.b(-530625336, new pje(fVar, hmi0Var, wyh.c(hmi0Var.D, aVar, 0, 7)), aVar), aVar, 24576, 15);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oje(hmi0 hmi0Var, f fVar) {
        this.b = hmi0Var;
        this.c = fVar;
    }
}
