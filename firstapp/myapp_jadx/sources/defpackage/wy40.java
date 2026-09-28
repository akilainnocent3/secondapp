package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulScreenKt$RegistrationSuccessfulScreen$5$1", f = "RegistrationSuccessfulScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wy40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wy40(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wy40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        f00 f00Var = vgb0.a;
        vgb0.a(AnalyticsEvent.DEPOSIT_BUTTON_SHOWN);
        return Unit.a;
    }
}
