package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n23 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        BigDecimal bigDecimal = (BigDecimal) obj2;
        int i = BetSlipFooter.j0;
        num.getClass();
        bigDecimal.getClass();
        return new Pair(num, bigDecimal);
    }
}
