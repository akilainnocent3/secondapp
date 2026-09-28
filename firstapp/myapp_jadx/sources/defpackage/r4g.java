package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r4g implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r4g(hvk hvkVar, Function0 function0) {
        this.b = hvkVar;
        this.c = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s4g.c((String) obj4, (String) obj3, (a) obj, qj40.a(7));
                break;
            default:
                hvk hvkVar = (hvk) obj4;
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                int i3 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(hvkVar.a(), aVar, 0, 7);
                    boolean zA = aVar.A(hvkVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new kuk(hvkVar, 0);
                        aVar.r(objY);
                    }
                    final chp chpVar = (chp) objY;
                    ovk ovkVar = (ovk) ytwVarC.getValue();
                    boolean zM = aVar.M(chpVar);
                    Object objY2 = aVar.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: qtk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ((Function1) chpVar).invoke(lvk.f.a);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zM2 = aVar.M(chpVar);
                    Object objY3 = aVar.y();
                    if (zM2 || objY3 == c0042a) {
                        objY3 = new rtk(chpVar, 0);
                        aVar.r(objY3);
                    }
                    Function1 function2 = (Function1) objY3;
                    boolean zM3 = aVar.M(chpVar);
                    Object objY4 = aVar.y();
                    if (zM3 || objY4 == c0042a) {
                        objY4 = new rhb(chpVar, i3);
                        aVar.r(objY4);
                    }
                    Function1 function3 = (Function1) objY4;
                    boolean zM4 = aVar.M(chpVar) | aVar.M(function0);
                    Object objY5 = aVar.y();
                    if (zM4 || objY5 == c0042a) {
                        objY5 = new ni2(1, chpVar, function0);
                        aVar.r(objY5);
                    }
                    Function0 function4 = (Function0) objY5;
                    boolean zM5 = aVar.M(chpVar);
                    Object objY6 = aVar.y();
                    if (zM5 || objY6 == c0042a) {
                        objY6 = new vhb(chpVar, i2);
                        aVar.r(objY6);
                    }
                    Function0 function5 = (Function0) objY6;
                    boolean zM6 = aVar.M(chpVar);
                    Object objY7 = aVar.y();
                    if (zM6 || objY7 == c0042a) {
                        objY7 = new vtk(chpVar, 0);
                        aVar.r(objY7);
                    }
                    ovk ovkVar2 = ovk.f;
                    muk.c(ovkVar, function1, function2, function3, function4, function5, (Function0) objY7, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ r4g(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
    }
}
