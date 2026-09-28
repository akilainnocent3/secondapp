package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q2o implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2o(v2o v2oVar, int i) {
        this.a = 0;
        this.b = v2oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                t2o.b((v2o) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                final qo50 qo50Var = (qo50) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(311913286, new Function2() { // from class: po50
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                qo50 qo50Var2 = qo50Var;
                                sq50 sq50Var = (sq50) wyh.c(qo50Var2.u0().i, aVar2, 0, 7).getValue();
                                nq50<? super OtpData> nq50VarU0 = qo50Var2.u0();
                                boolean zA = aVar2.A(nq50VarU0);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new qo50.c(1, nq50VarU0, nq50.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/newotp/channel/reverse/ReversedEvent;)V", 0);
                                    aVar2.r(objY);
                                }
                                cq50.g(sq50Var, (Function1) ((chp) objY), aVar2, 8);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
            default:
                op8 op8Var = (op8) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    op8Var.invoke(aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ q2o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
