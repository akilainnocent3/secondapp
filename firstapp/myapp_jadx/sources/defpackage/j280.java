package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$onQueryChanged$1", f = "SearchViewModel.kt", l = {238}, m = "invokeSuspend", v = 2)
public final class j280 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l280 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j280(l280 l280Var, v1b<? super j280> v1bVar) {
        super(2, v1bVar);
        this.b = l280Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j280(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j280) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            l280 l280Var = this.b;
            b390 b390Var = l280Var.P;
            Object[] objArr = {new Integer(l280Var.D.getMaxQueryLength())};
            StringUiText stringUiText = vch0.a;
            p080.e eVar = new p080.e(new ResourceUiText(R.string.common_functions__new_search_feature_microhint_max_chars, ay0.S(objArr)));
            this.a = 1;
            if (b390Var.emit(eVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
