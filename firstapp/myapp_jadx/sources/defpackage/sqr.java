package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.signup.presentation.LatamSignUpEmailViewModel$onScreenShown$4", f = "LatamSignUpEmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sqr extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ lqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqr(lqr lqrVar, v1b<? super sqr> v1bVar) {
        super(2, v1bVar);
        this.b = lqrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sqr sqrVar = new sqr(this.b, v1bVar);
        sqrVar.a = obj;
        return sqrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((sqr) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, null, null, null, null, null, null, null, uiText, null, 0, null, null, null, false, false, false, false, false, false, false, false, 12581887)));
        return Unit.a;
    }
}
