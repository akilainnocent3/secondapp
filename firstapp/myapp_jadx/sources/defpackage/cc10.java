package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cc10 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Double d;
        final h hVar = (h) this.receiver;
        hVar.getClass();
        try {
            final p610 p610Var = hVar.J;
            if (p610Var != null && (d = hVar.I) != null) {
                double dDoubleValue = d.doubleValue();
                xsm xsmVar = hVar.f;
                String str = (String) hVar.C.a.b("pix_btg_withdraw_current_amount");
                if (str == null) {
                    str = "";
                }
                final double dC = xsmVar.c(str);
                final double d2 = dDoubleValue - dC;
                hVar.D1(new Function1() { // from class: wc10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        jme jmeVar = (jme) obj;
                        jmeVar.getClass();
                        h hVar2 = hVar;
                        String strE = hVar2.f.e(d2);
                        p610 p610Var2 = p610Var;
                        return jme.a(jmeVar, false, new zlj0(strE, p610Var2.e, p610Var2.c, fsa0.c(p610Var2.g), hVar2.f.i(dC, false), true), false, false, false, null, null, 125);
                    }
                });
            }
        } catch (Exception e) {
            itf0.a.f(e, "Failed to make withdraw", new Object[0]);
            hVar.D1(new xc10(0));
        }
        return Unit.a;
    }
}
