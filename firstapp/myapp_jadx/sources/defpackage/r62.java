package defpackage;

import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.BaseTradingFragment$initTradingSharedViewModel$1$1", f = "BaseTradingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r62 extends tje0 implements Function2<lk50<? extends BigDecimal>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ s62 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r62(s62 s62Var, v1b<? super r62> v1bVar) {
        super(2, v1bVar);
        this.b = s62Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r62 r62Var = new r62(this.b, v1bVar);
        r62Var.a = obj;
        return r62Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BigDecimal> lk50Var, v1b<? super Unit> v1bVar) {
        return ((r62) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        s62 s62Var = this.b;
        Iterator<T> it = s62Var.q0().iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setText(lk50Var instanceof lk50.c ? n4d.a((BigDecimal) ((lk50.c) lk50Var).a) : sn5.d(s62Var, R.string.app_common__no_cash, new Object[0]));
        }
        return Unit.a;
    }
}
