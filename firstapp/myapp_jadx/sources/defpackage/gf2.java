package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.betpanel.BetAmountInputViewKt$NumberTextField$2$1", f = "BetAmountInputView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class gf2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ b5i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf2(b5i b5iVar, v1b<? super gf2> v1bVar) {
        super(2, v1bVar);
        this.a = b5iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gf2(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gf2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b5i.b(this.a);
        return Unit.a;
    }
}
