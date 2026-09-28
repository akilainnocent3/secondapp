package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hi20 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hi20(gz4 gz4Var, md20 md20Var) {
        this.b = gz4Var;
        this.c = md20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final gz4 gz4Var = (gz4) obj4;
                final gi20.c cVar = (gi20.c) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    umz umzVar = new umz(12.0f, 4.0f, 12.0f, 4.0f);
                    boolean zA = aVar.A(cVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        ji20 ji20Var = new ji20(2, cVar, gi20.c.class, "onStatisticClick", "onStatisticClick(Ljava/lang/String;Ljava/lang/String;)V", 0);
                        aVar.r(ji20Var);
                        objY = ji20Var;
                    }
                    Function2 function2 = (Function2) ((chp) objY);
                    boolean zA2 = aVar.A(cVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new ki20(1, cVar, gi20.c.class, "onShareCodeClick", "onShareCodeClick(Ljava/lang/String;)V", 0);
                        aVar.r(objY2);
                    }
                    Function1 function1 = (Function1) ((chp) objY2);
                    boolean zA3 = aVar.A(cVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        li20 li20Var = new li20(1, cVar, gi20.c.class, "onAddToMultiMakerClick", "onAddToMultiMakerClick(Ljava/lang/String;)V", 0);
                        aVar.r(li20Var);
                        objY3 = li20Var;
                    }
                    Function1 function3 = (Function1) ((chp) objY3);
                    boolean zA4 = aVar.A(cVar) | aVar.A(gz4Var);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new Function1() { // from class: ii20
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                String str = (String) obj5;
                                str.getClass();
                                cVar.a(gz4Var.d.size(), str);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY4);
                    }
                    nz4.a(gz4Var, umzVar, function2, function1, function3, (Function1) objY4, aVar, 48);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                obj0.g((d) obj4, (rbj0) obj3, (a) obj, qj40.a(7));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hi20(d dVar, rbj0 rbj0Var, int i) {
        this.b = dVar;
        this.c = rbj0Var;
    }
}
