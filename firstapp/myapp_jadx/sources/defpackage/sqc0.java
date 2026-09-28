package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.presentation.legends.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$observeSessionDataStatusFlow$4", f = "SportyLegendsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sqc0 extends tje0 implements Function2<ii2, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqc0(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sqc0 sqc0Var = new sqc0(v1bVar, this.b);
        sqc0Var.a = obj;
        return sqc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ii2 ii2Var, v1b<? super Unit> v1bVar) {
        return ((sqc0) create(ii2Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        Object value;
        BetBuilderConfig betBuilderConfig;
        Object value2;
        d dVar = this.b;
        wwd0 wwd0Var = dVar.V;
        ii2 ii2Var = (ii2) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zh2 zh2Var = ii2Var.a;
        if (zh2Var instanceof zh2.a) {
            do {
                value2 = wwd0Var.getValue();
                StringUiText stringUiText = vch0.a;
            } while (!wwd0Var.g(value2, new zs.b(new ResourceUiText(R.string.common_feedback__connection_error), new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again), new ResourceUiText(R.string.common_functions__ok), 8)));
        } else if (zh2Var instanceof zh2.d) {
            pg2 pg2Var = ((zh2.d) zh2Var).a;
            if (!pg2Var.c && !pg2Var.d) {
                pjc0 pjc0VarA = dVar.H.a();
                if (pjc0VarA == null || (betBuilderConfig = pjc0VarA.d) == null || (str = betBuilderConfig.maxOdds) == null) {
                    str = "200";
                }
                do {
                    value = wwd0Var.getValue();
                    StringUiText stringUiText2 = vch0.a;
                } while (!wwd0Var.g(value, new zs.b(new ResourceUiText(R.string.page_instant_virtual__warning), new ResourceUiText(R.string.page_instant_virtual__you_ve_reached_the_maximum_odds_vnum_of_bet_builder_tip, ay0.S(new Object[]{gky.a.a(str, false)})), new ResourceUiText(R.string.common_functions__ok), 8)));
            }
        }
        return Unit.a;
    }
}
