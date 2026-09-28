package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nfi implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ nfi(qfi qfiVar, Function1 function1, int i) {
        this.b = qfiVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pfi.c((qfi) obj3, (Function1) hajVar, (a) obj, qj40.a(9));
                break;
            default:
                fn90 fn90Var = (fn90) obj3;
                vf3 vf3Var = (vf3) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-569438122, new ofi(fn90Var, vf3Var), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nfi(fn90 fn90Var, vf3 vf3Var) {
        this.b = fn90Var;
        this.c = vf3Var;
    }
}
