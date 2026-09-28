package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.fragment.BetslipFragment$initView$2", f = "BetslipFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class np3 extends tje0 implements Function2<TaxConfigs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ jp3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np3(jp3 jp3Var, v1b<? super np3> v1bVar) {
        super(2, v1bVar);
        this.b = jp3Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        np3 np3Var = new np3(this.b, v1bVar);
        np3Var.a = obj;
        return np3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TaxConfigs taxConfigs, v1b<? super Unit> v1bVar) {
        return ((np3) create(taxConfigs, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TaxConfigs taxConfigs = (TaxConfigs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jp3.a aVar = jp3.c0;
        jp3 jp3Var = this.b;
        final r4p r4pVarQ0 = jp3Var.q0();
        jp3Var.D = taxConfigs.getVirtualTaxConfig();
        jp3Var.I0();
        r4p r4pVarQ1 = jp3Var.q0();
        if (jp3Var.z != null) {
            jp3Var.O0();
            o4p o4pVar = jp3Var.z;
            o4pVar.getClass();
            if (TextUtils.equals(o4pVar.a, YAzniTbXHYQ.TedtnHwav)) {
                InstantWinFooterLayout instantWinFooterLayout = r4pVarQ1.e;
                o4p o4pVar2 = jp3Var.z;
                o4pVar2.getClass();
                o4p o4pVar3 = jp3Var.z;
                o4pVar3.getClass();
                BigDecimal bigDecimal = o4pVar3.n;
                instantWinFooterLayout.setupFooter(o4pVar2, bigDecimal != null ? bigDecimal.toPlainString() : "", jp3Var, jp3Var.D, jp3Var.V, jp3Var.W, jp3Var.t0());
            } else {
                InstantWinFooterLayout instantWinFooterLayout2 = r4pVarQ1.e;
                o4p o4pVar4 = jp3Var.z;
                o4pVar4.getClass();
                BigDecimal bigDecimal2 = jp3Var.i;
                bigDecimal2.getClass();
                instantWinFooterLayout2.setupFooter(o4pVar4, bigDecimal2.toPlainString(), jp3Var, jp3Var.D, jp3Var.V, jp3Var.W, jp3Var.t0());
            }
        }
        r4pVarQ1.e.getViewTreeObserver().addOnGlobalLayoutListener(new rp3(jp3Var, r4pVarQ1));
        r4pVarQ0.f.postDelayed(new Runnable() { // from class: mp3
            @Override // java.lang.Runnable
            public final void run() {
                r4pVarQ0.f.e(130);
            }
        }, 100L);
        jp3Var.H0();
        jp3Var.G0();
        return Unit.a;
    }
}
