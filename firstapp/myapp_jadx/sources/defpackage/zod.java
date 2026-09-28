package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zod implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zod(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final jpd jpdVar = (jpd) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(2061361070, new Function2() { // from class: cpd
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                jpd jpdVar2 = jpdVar;
                                ytw ytwVarC = wyh.c(jpdVar2.P0().E0, aVar2, 0, 7);
                                if (((x3e) ytwVarC.getValue()).a.a) {
                                    aVar2.N(565419421);
                                    Object objY = aVar2.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (objY == c0042a) {
                                        objY = new wod();
                                        aVar2.r(objY);
                                    }
                                    d dVarB = xa80.b(d.a.b, false, (Function1) objY);
                                    x3e x3eVar = (x3e) ytwVarC.getValue();
                                    fqd fqdVarP0 = jpdVar2.P0();
                                    boolean zA = aVar2.A(fqdVarP0);
                                    Object objY2 = aVar2.y();
                                    if (zA || objY2 == c0042a) {
                                        objY2 = new ipd(1, fqdVarP0, fqd.class, "onAction", "onAction$impl(Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/DepositOneTimeAccountUiAction;)V", 0);
                                        aVar2.r(objY2);
                                    }
                                    o6e.a(dVarB, x3eVar, (Function1) ((chp) objY2), aVar2, 0);
                                    aVar2.H();
                                } else {
                                    aVar2.N(565687540);
                                    aVar2.H();
                                }
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                jzn jznVar = (jzn) obj;
                String str = (String) obj2;
                jznVar.getClass();
                str.getClass();
                ((Function1) obj3).invoke(new c.u(jznVar, str));
                break;
        }
        return Unit.a;
    }
}
