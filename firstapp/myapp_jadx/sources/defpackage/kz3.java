package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import cn00.g;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legends.b;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kz3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kz3(d dVar, int i) {
        this.a = 1;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                cz3 cz3Var = (cz3) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    lkf0.d(pwo.e(cz3Var.a, aVar), null, c68.a(R.color.text_type1_primary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar), aVar, 0, 0, 131066);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ker.a((d) obj3, (a) obj, qj40.a(1));
                break;
            case 2:
                cn00 cn00Var = (cn00) obj3;
                String str = (String) obj;
                str.getClass();
                ej5.c(ebs.a(cn00Var.getLifecycle()), null, null, cn00Var.new g(str, (z7a0.d) obj2, null), 3);
                break;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                BigDecimal bigDecimal = (BigDecimal) obj2;
                zrd0Var.getClass();
                bigDecimal.getClass();
                ((Function1) obj3).invoke(new b.r.d(zrd0Var, bigDecimal));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kz3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
