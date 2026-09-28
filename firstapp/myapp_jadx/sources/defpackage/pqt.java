package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.ui.components.theme.LoyaltyAnimatedProgressHintKt$LoyaltyAnimatedProgressHint$1$1", f = "LoyaltyAnimatedProgressHint.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pqt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ fmt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqt(Function0 function0, fmt fmtVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = function0;
        this.b = fmtVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pqt(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pqt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.b.getValue().floatValue() >= 1.0f && (function0 = this.a) != null) {
            function0.invoke();
        }
        return Unit.a;
    }
}
