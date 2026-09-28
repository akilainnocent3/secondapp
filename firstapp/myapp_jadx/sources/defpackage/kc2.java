package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
public final class kc2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ b1g0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc2(b1g0 b1g0Var, v1b<? super kc2> v1bVar) {
        super(2, v1bVar);
        this.a = b1g0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kc2(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kc2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.a();
        return Unit.a;
    }
}
