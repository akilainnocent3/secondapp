package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dut implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dut(ytw ytwVar, Function0 function0) {
        this.b = function0;
        this.c = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj4;
                ytw ytwVar = (ytw) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gtt gttVar = ((myt) ytwVar.getValue()).a;
                    if (!(gttVar instanceof gtt.b)) {
                        gttVar = null;
                    }
                    gtt.b bVar = (gtt.b) gttVar;
                    if (bVar == null || bVar.f || !(bVar.e instanceof tyt.c)) {
                        aVar.N(889243713);
                        aVar.H();
                    } else {
                        aVar.N(889172599);
                        wit.a(0, aVar, null, function0);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                bse0.b((d) obj4, (op8) obj3, (a) obj, qj40.a(49));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dut(d dVar, op8 op8Var, int i) {
        this.b = dVar;
        this.c = op8Var;
    }
}
