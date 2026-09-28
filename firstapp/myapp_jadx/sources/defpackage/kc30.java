package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kc30 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kc30(mc30 mc30Var, Function0 function0, int i) {
        this.b = mc30Var;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc30.a((mc30) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                znf0 znf0Var = (znf0) obj4;
                twd0 twd0Var = (twd0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m0f0 m0f0Var = (m0f0) twd0Var.getValue();
                    aof0 aof0VarM0 = znf0Var.m0();
                    boolean zA = aVar.A(aof0VarM0);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        znf0.b bVar = new znf0.b(1, aof0VarM0, aof0.class, "handleEvent", "handleEvent(Lcom/sportygames/goldmine/data/presentation/TGEvent;)V", 0);
                        aVar.r(bVar);
                        objY = bVar;
                    }
                    Function1 function1 = (Function1) ((chp) objY);
                    boolean zA2 = aVar.A(znf0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new wfz(znf0Var, 2);
                        aVar.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    aof0 aof0VarM1 = znf0Var.m0();
                    boolean zA3 = aVar.A(aof0VarM1);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        znf0.c cVar = new znf0.c(1, aof0VarM1, aof0.class, "onErrorEncountered", "onErrorEncountered(Ljava/lang/Throwable;)V", 0);
                        aVar.r(cVar);
                        objY3 = cVar;
                    }
                    z0f0.a(m0f0Var, function1, function0, (Function1) ((chp) objY3), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kc30(znf0 znf0Var, ytw ytwVar) {
        this.b = znf0Var;
        this.c = ytwVar;
    }
}
