package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sporty.android.core.model.pocket.common.WhTaxData;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.BaseWithdrawFragment$initTradingSharedViewModel$1$1", f = "BaseWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i82 extends tje0 implements Function2<lk50<? extends WithDrawInfo>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ j82 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i82(j82 j82Var, v1b<? super i82> v1bVar) {
        super(2, v1bVar);
        this.b = j82Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i82 i82Var = new i82(this.b, v1bVar);
        i82Var.a = obj;
        return i82Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends WithDrawInfo> lk50Var, v1b<? super Unit> v1bVar) {
        return ((i82) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        WhTaxData whTaxData;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        final WithDrawInfo withDrawInfo = cVar != null ? (WithDrawInfo) cVar.a : null;
        final j82 j82Var = this.b;
        int i = 8;
        if (withDrawInfo == null || !withDrawInfo.hasInfo) {
            TextView textViewP0 = j82Var.P0();
            if (textViewP0 != null) {
                textViewP0.setVisibility(8);
            }
            View viewR0 = j82Var.R0();
            if (viewR0 != null) {
                viewR0.setVisibility(8);
            }
            TextView textViewQ0 = j82Var.Q0();
            if (textViewQ0 != null) {
                textViewQ0.setVisibility(8);
            }
        } else {
            TextView textViewP1 = j82Var.P0();
            if (textViewP1 != null) {
                textViewP1.setVisibility(0);
            }
            View viewR1 = j82Var.R0();
            if (viewR1 != null) {
                viewR1.setVisibility(0);
            }
            TextView textViewQ1 = j82Var.Q0();
            if (textViewQ1 != null) {
                textViewQ1.setVisibility(0);
            }
            TextView textViewP2 = j82Var.P0();
            if (textViewP2 != null) {
                textViewP2.setText(n4d.a(xzf.b(withDrawInfo)));
            }
            View viewR2 = j82Var.R0();
            if (viewR2 != null) {
                viewR2.setOnClickListener(new View.OnClickListener() { // from class: g82
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j82Var.T0(withDrawInfo);
                    }
                });
            }
        }
        TextView textViewO0 = j82Var.O0();
        if (textViewO0 != null) {
            if (withDrawInfo != null && (whTaxData = withDrawInfo.whTaxData) != null && whTaxData.isActive) {
                i = 0;
            }
            textViewO0.setVisibility(i);
        }
        return Unit.a;
    }
}
