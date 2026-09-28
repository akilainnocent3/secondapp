package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initLoadCodeViewModel$4", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qk6 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk6(b bVar, v1b<? super qk6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qk6 qk6Var = new qk6(this.b, v1bVar);
        qk6Var.a = obj;
        return qk6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((qk6) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b bVar = this.b;
        Context contextRequireContext = bVar.requireContext();
        contextRequireContext.getClass();
        Context contextRequireContext2 = bVar.requireContext();
        contextRequireContext2.getClass();
        uiText.getClass();
        js.d(contextRequireContext, R.string.common_functions__error, uiText.e(contextRequireContext2).toString(), null, null, 48);
        bVar.C0().y.setValue(null);
        return Unit.a;
    }
}
