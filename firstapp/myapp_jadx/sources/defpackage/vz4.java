package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vz4 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ vz4(gz4 gz4Var, Function2 function2, int i) {
        this.b = gz4Var;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zz4.a((gz4) obj3, (Function2) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                Function0 function0 = (Function0) obj3;
                Function0 function1 = (Function0) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xc50.a(function0, function1, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vz4(Function0 function0, Function0 function1) {
        this.b = function0;
        this.c = function1;
    }
}
