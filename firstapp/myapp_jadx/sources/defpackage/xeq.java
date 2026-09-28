package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.gift.presentation.LNGiftTabKt$LNGiftTab$1$1", f = "LNGiftTab.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xeq extends tje0 implements gaj<v5b, ccr, v1b<? super Unit>, Object> {
    public /* synthetic */ ccr a;
    public final /* synthetic */ Function1<nvp, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xeq(Function1<? super nvp, Unit> function1, v1b<? super xeq> v1bVar) {
        super(3, v1bVar);
        this.b = function1;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, ccr ccrVar, v1b<? super Unit> v1bVar) {
        xeq xeqVar = new xeq(this.b, v1bVar);
        xeqVar.a = ccrVar;
        return xeqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ccr ccrVar = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(ccrVar.a);
        return Unit.a;
    }
}
