package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yet implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ yet(yva0 yva0Var) {
        this.b = yva0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                aft.c((d) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                yva0 yva0Var = (yva0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                yva0.a aVar2 = yva0.c0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(yva0Var.c1().F, aVar, 0, 7);
                    od9 od9Var = yva0Var.Z;
                    if (od9Var == null) {
                        Intrinsics.n("accountNumberFormatter");
                        throw null;
                    }
                    fa faVar = new fa(od9Var);
                    wwa0 wwa0Var = (wwa0) ytwVarC.getValue();
                    zwa0 zwa0VarC1 = yva0Var.c1();
                    boolean zA = aVar.A(zwa0VarC1);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        hwa0 hwa0Var = new hwa0(1, zwa0VarC1, zwa0.class, "onAccountNumberChanged", "onAccountNumberChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                        aVar.r(hwa0Var);
                        objY = hwa0Var;
                    }
                    Function1 function1 = (Function1) ((chp) objY);
                    zwa0 zwa0VarC2 = yva0Var.c1();
                    boolean zA2 = aVar.A(zwa0VarC2);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        iwa0 iwa0Var = new iwa0(0, zwa0VarC2, zwa0.class, "onRecentAccountRowClicked", "onRecentAccountRowClicked()V", 0);
                        aVar.r(iwa0Var);
                        objY2 = iwa0Var;
                    }
                    vwa0.d(wwa0Var, function1, faVar, (Function0) ((chp) objY2), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ yet(d dVar, int i) {
        this.b = dVar;
    }
}
