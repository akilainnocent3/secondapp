package defpackage;

import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$1", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k3e extends tje0 implements Function2<lk50<? extends vw<BigDecimal>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3e(u3e u3eVar, v1b<? super k3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k3e k3eVar = new k3e(this.b, v1bVar);
        k3eVar.a = obj;
        return k3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends vw<BigDecimal>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((k3e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vw vwVar;
        BigDecimal bigDecimal;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar != null && (vwVar = (vw) cVar.a) != null && (bigDecimal = (BigDecimal) vwVar.a) != null) {
            u3e u3eVar = this.b;
            lke lkeVar = u3eVar.i;
            if (lkeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            lkeVar.e.c.setHint(sn5.d(u3eVar, R.string.page_payment__min_vnum, n4d.a(bigDecimal)));
        }
        return Unit.a;
    }
}
