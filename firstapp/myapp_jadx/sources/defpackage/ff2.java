package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.betpanel.BetAmountInputViewKt$AutoSizeText$1$1", f = "BetAmountInputView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ff2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ long a;
    public final /* synthetic */ ytw<imf0> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff2(long j, ytw<imf0> ytwVar, v1b<? super ff2> v1bVar) {
        super(2, v1bVar);
        this.a = j;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ff2(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ff2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<imf0> ytwVar = this.b;
        ytwVar.setValue(imf0.b(ytwVar.getValue(), this.a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214));
        return Unit.a;
    }
}
