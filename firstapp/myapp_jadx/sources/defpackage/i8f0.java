package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.common.uievent.b;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i8f0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i8f0(Object obj, int i) {
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
                ytw ytwVar = (ytw) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.G();
                } else if (StringsKt.U(((ijf0) ytwVar.getValue()).a.b)) {
                    aVar.N(1750465244);
                    aVar.H();
                } else {
                    aVar.N(1749860775);
                    Object objY = aVar.y();
                    if (objY == a.C0041a.a) {
                        objY = new y8f0(ytwVar, 0);
                        aVar.r(objY);
                    }
                    c6n.a((Function0) objY, j.r(d.a.b, 20.0f), false, null, null, ow9.b, aVar, 1572918, 60);
                    aVar.H();
                }
                break;
            default:
                hqj0 hqj0Var = (hqj0) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                int i2 = hqj0.E0;
                str2.getClass();
                ku90<spg0> ku90Var = hqj0Var.v;
                log0 log0Var = log0.b;
                m8h0 m8h0Var = m8h0.a;
                String strF = hqj0Var.j0.f();
                BigDecimal bigDecimal = hqj0Var.S.c;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                vpg0.c(ku90Var, new TxSuccessParams.Transfer(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, false, str2));
                b.b(hqj0Var.f);
                break;
        }
        return Unit.a;
    }
}
