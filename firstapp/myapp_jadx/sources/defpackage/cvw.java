package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.base.mvvm.MvvmBaseViewModel$launchWithErrorHandler$1$1", f = "MvvmBaseViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class cvw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ avw<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvw(avw<Object> avwVar, v1b<? super cvw> v1bVar) {
        super(2, v1bVar);
        this.b = avwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cvw(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cvw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.c;
            StringUiText stringUiText = vch0.a;
            o990 o990Var = new o990(new ResourceUiText(R.string.common_feedback__sorry_something_went_wrong));
            this.a = 1;
            if (b390Var.emit(o990Var, this) == y5bVar) {
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
