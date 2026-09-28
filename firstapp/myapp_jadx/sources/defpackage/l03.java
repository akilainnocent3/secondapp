package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.chip.betslider.BetSliderKt$BetSlider$1$1", f = "BetSlider.kt", l = {}, m = "invokeSuspend", v = 1)
public final class l03 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ u03 a;
    public final /* synthetic */ s03 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l03(u03 u03Var, s03 s03Var, v1b<? super l03> v1bVar) {
        super(2, v1bVar);
        this.a = u03Var;
        this.b = s03Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l03(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l03) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.x1(new xz2.b(this.b));
        return Unit.a;
    }
}
