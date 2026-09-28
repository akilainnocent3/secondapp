package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fwb implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fwb(k8 k8Var, Function0 function0) {
        this.c = k8Var;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        crz crzVarA;
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                k8 k8Var = (k8) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (Intrinsics.g(k8Var, k8.c.a)) {
                        aVar.N(1129025206);
                        aVar.H();
                        crzVarA = null;
                    } else {
                        aVar.N(-933410734);
                        crzVarA = erz.a(R.drawable.spr_ic_close_black_24dp, 0, aVar);
                        aVar.H();
                    }
                    odd0.d(d.a.b, cb40.a(R.string.page_payment__add_new_bank, new Object[0], aVar), 0L, crzVarA, "back_icon", this.b, null, aVar, 24582, 68);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                yy70.b((l280) obj3, this.b, (a) obj, qj40.a(9));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fwb(l280 l280Var, Function0 function0, int i) {
        this.c = l280Var;
        this.b = function0;
    }
}
