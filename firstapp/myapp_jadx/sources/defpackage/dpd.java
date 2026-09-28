package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dpd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dpd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                jpd jpdVar = (jpd) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(jpdVar.P0().E0, aVar, 0, 7);
                    rry rryVar = ((x3e) ytwVarC.getValue()).c;
                    if (rryVar == null) {
                        aVar.N(-1103669212);
                        aVar.H();
                    } else {
                        aVar.N(-1103669211);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = new xod();
                            aVar.r(objY);
                        }
                        d dVarB = xa80.b(d.a.b, false, (Function1) objY);
                        boolean z = ((x3e) ytwVarC.getValue()).d;
                        fqd fqdVarP0 = jpdVar.P0();
                        boolean zA = aVar.A(fqdVarP0);
                        Object objY2 = aVar.y();
                        if (zA || objY2 == c0042a) {
                            hpd hpdVar = new hpd(1, fqdVarP0, fqd.class, "onAction", "onAction$impl(Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/DepositOneTimeAccountUiAction;)V", 0);
                            aVar.r(hpdVar);
                            objY2 = hpdVar;
                        }
                        k0e.a(dVarB, rryVar, z, (Function1) ((chp) objY2), aVar, 64);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                break;
            default:
                crz crzVar = (crz) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h6n.b(crzVar, null, null, c68.a(R.color.text_inverse_primary, aVar2), aVar2, 48, 4);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
