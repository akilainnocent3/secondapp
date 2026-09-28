package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$clickUseNewCard$1", f = "DepositCardViewModel.kt", l = {769}, m = "invokeSuspend", v = 2)
public final class jtd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtd(tud tudVar, v1b<? super jtd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jtd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jtd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        tud tudVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            wl50 wl50VarV = tudVar.r0.v();
            this.a = 1;
            obj = bm50.p(wl50VarV, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        ut60 ut60Var = cVar != null ? (ut60) cVar.a : null;
        if ((ut60Var instanceof ut60.a) && ((List) tudVar.F0.a.getValue()).size() >= ((ut60.a) ut60Var).a) {
            ku90<a> ku90Var = tudVar.f;
            StringUiText stringUiText = vch0.a;
            b.e(ku90Var, new ResourceUiText(R.string.page_payment__card_limit_reached), null, new ResourceUiText(R.string.page_payment__you_can_only_have_a_limited_number_of_cards_tip), null, null, null, null, 506);
            return Unit.a;
        }
        tudVar.R1("");
        ku90<Unit> ku90Var2 = tudVar.n1;
        Unit unit = Unit.a;
        ku90Var2.a(unit);
        return unit;
    }
}
