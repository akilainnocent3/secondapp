package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.math.BigDecimal;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class rmw {
    public final k5b a;

    public rmw(@Dispatcher(sportyDispatcher = SportyDispatchers.Default) k5b k5bVar) {
        this.a = k5bVar;
    }

    public static BigDecimal a(BigDecimal bigDecimal, m780 m780Var) {
        String str;
        BigDecimal bigDecimalG;
        bigDecimal.getClass();
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null) {
            BigDecimal bigDecimalSubtract = bigDecimal.compareTo(bigDecimalG) == 1 ? bigDecimal.subtract(bigDecimalG) : BigDecimal.ZERO;
            if (bigDecimalSubtract != null) {
                return bigDecimalSubtract;
            }
        }
        return bigDecimal;
    }
}
