package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i1u implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ i1u(int i, Function0 function0, Function0 function1) {
        this.b = function0;
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
                l1u.a((Function0) obj3, (Function0) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                gxe0.a aVar = (gxe0.a) obj3;
                final Function1 function1 = (Function1) hajVar;
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jv1 jv1Var = aVar.e;
                    boolean zM = aVar2.M(function1);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zM || objY == c0042a) {
                        objY = new bab0(function1, 1);
                        aVar2.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zM2 = aVar2.M(function1);
                    Object objY2 = aVar2.y();
                    if (zM2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: bze0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(qve0.w.a);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY2);
                    }
                    ize0.d(jv1Var, function0, (Function0) objY2, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i1u(gxe0.a aVar, Function1 function1) {
        this.b = aVar;
        this.c = function1;
    }
}
