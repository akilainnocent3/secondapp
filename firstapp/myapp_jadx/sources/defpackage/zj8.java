package defpackage;

import com.sportybet.android.basepay.data.CommonConfigRepository;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class zj8 extends CommonConfigRepository<wj8> implements xj8 {
    @Override // com.sportybet.android.basepay.data.CommonConfigRepository
    public final List<dc8.a> buildParams() {
        return b.k(new dc8.a("pocket", "withdraw.fee.range"), new dc8.a("pocket", "fee.withdrawOnce.amount"), new dc8.a("pocket", "fee.withdrawOnce.type"), new dc8.a("pocket", "fee.withdrawOnce.free"));
    }

    @Override // com.sportybet.android.basepay.data.CommonConfigRepository
    public final wj8 convert(Object obj) {
        obj.getClass();
        bcp bcpVarC = qva.c(new eal().j(obj)).c();
        wj8 wj8Var = new wj8();
        if (bcpVarC.a.size() == 4) {
            String strF = dc8.f(0, bcpVarC, null);
            if (strF != null && strF.length() != 0) {
                wj8Var.a = (List) new eal().f(strF, new yj8().getType());
            }
            String strF2 = dc8.f(1, bcpVarC, "0");
            if (strF2 != null && strF2.length() != 0) {
                wj8Var.b = BigDecimal.valueOf(Long.parseLong(strF2)).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP);
            }
            String strF3 = dc8.f(2, bcpVarC, "0");
            if (strF2 != null && strF2.length() != 0) {
                strF3.getClass();
                Integer.parseInt(strF3);
            }
            String strF4 = dc8.f(3, bcpVarC, "0");
            if (strF4 != null && strF4.length() != 0) {
                wj8Var.c = BigDecimal.valueOf(Long.parseLong(strF4)).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP);
            }
        }
        return wj8Var;
    }
}
