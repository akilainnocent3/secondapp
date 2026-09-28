package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$initLoadCodeViewModel$4", f = "RealBetHistoryFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d540 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ o540 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d540(o540 o540Var, v1b<? super d540> v1bVar) {
        super(2, v1bVar);
        this.b = o540Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d540 d540Var = new d540(this.b, v1bVar);
        d540Var.a = obj;
        return d540Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((d540) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        o540 o540Var = this.b;
        Context contextRequireContext = o540Var.requireContext();
        contextRequireContext.getClass();
        Context contextRequireContext2 = o540Var.requireContext();
        contextRequireContext2.getClass();
        uiText.getClass();
        js.d(contextRequireContext, R.string.common_functions__error, uiText.e(contextRequireContext2).toString(), null, null, 48);
        o540Var.o0().y.setValue(null);
        return Unit.a;
    }
}
