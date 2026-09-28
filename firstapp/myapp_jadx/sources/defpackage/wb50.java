package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class wb50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wb50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                xb50 xb50Var = (xb50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                xb50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) xb50Var.B1(), oTPResult);
                break;
            default:
                final vad0 vad0Var = (vad0) obj2;
                final int iIntValue = ((Integer) obj).intValue();
                gvi gviVar = vad0Var.z;
                if (gviVar != null) {
                    gviVar.V.setVisibility(0);
                }
                gvi gviVar2 = vad0Var.z;
                if (gviVar2 != null) {
                    final ComposeView composeView = gviVar2.V;
                    composeView.setViewCompositionStrategy(u6i0.c.a);
                    composeView.setContent(new op8(-2136608628, new Function2() { // from class: aad0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final vad0 vad0Var2 = vad0Var;
                                Integer num = (Integer) ((x5a0) vad0Var2.A2).getValue();
                                d dVarE = j.e(d.a.b, 1.0f);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar.m());
                                ne00 ne00VarO = aVar.o();
                                d dVarC = c.c(aVar, dVarE);
                                yka.k.getClass();
                                tsr.a aVar2 = yka.a.b;
                                if (aVar.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar.D();
                                if (aVar.g()) {
                                    aVar.F(aVar2);
                                } else {
                                    aVar.p();
                                }
                                hlh0.a(aVar, aivVarC, yka.a.f);
                                hlh0.a(aVar, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar, iHashCode, c1350a);
                                }
                                hlh0.a(aVar, dVarC, yka.a.d);
                                int i2 = iIntValue;
                                if (i2 != 0 || num == null) {
                                    if (i2 != 1 || num == null) {
                                        aVar.N(1046391472);
                                    } else {
                                        aVar.N(1123465997);
                                        Object value = ((x5a0) vad0Var2.R0().T).getValue();
                                        z83 z83Var = z83.b;
                                        if (value == z83Var || ((x5a0) vad0Var2.S0().T).getValue() == z83Var) {
                                            aVar.N(1123676704);
                                            x6a.b((String) ((x5a0) vad0Var2.c1().z).getValue(), (String) ((x5a0) vad0Var2.c1().v).getValue(), vad0Var2.b1(), vad0Var2.B1, vad0Var2.C1, ((Boolean) ((x5a0) vad0Var2.c1().i0).getValue()).booleanValue(), num.intValue(), vad0Var2.R0().b, null, false, aVar, 0, 768);
                                            aVar = aVar;
                                        } else {
                                            aVar.N(1046391472);
                                        }
                                        aVar.H();
                                    }
                                    aVar.H();
                                } else {
                                    aVar.N(1122654293);
                                    String str = (String) ((x5a0) vad0Var2.c1().v).getValue();
                                    mz1 mz1VarB1 = vad0Var2.b1();
                                    int iIntValue3 = num.intValue();
                                    final ComposeView composeView2 = composeView;
                                    boolean zA = aVar.A(composeView2) | aVar.A(vad0Var2);
                                    Object objY = aVar.y();
                                    if (zA || objY == a.C0041a.a) {
                                        objY = new Function0() { // from class: had0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Context context = composeView2.getContext();
                                                context.getClass();
                                                vad0 vad0Var3 = vad0Var2;
                                                sny.c(context, vad0Var3.J, 0, (String) ((x5a0) vad0Var3.c1().z).getValue());
                                                gvi gviVar3 = vad0Var3.z;
                                                if (gviVar3 != null) {
                                                    gviVar3.V.setVisibility(8);
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        aVar.r(objY);
                                    }
                                    x6a.a(str, mz1VarB1, iIntValue3, (Function0) objY, aVar, 0);
                                    aVar.H();
                                }
                                aVar.s();
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                break;
        }
        return Unit.a;
    }
}
