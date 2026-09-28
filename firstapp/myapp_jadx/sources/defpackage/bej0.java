package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.component.winningpopup.doubleornothing.WinningPopupDoubleOrNothingSuccessKt$WinningPopupDoubleOrNothingSuccess$1$1", f = "WinningPopupDoubleOrNothingSuccess.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bej0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ mdj0 a;
    public final /* synthetic */ Function1<String, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bej0(mdj0 mdj0Var, Function1<? super String, Unit> function1, v1b<? super bej0> v1bVar) {
        super(2, v1bVar);
        this.a = mdj0Var;
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bej0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bej0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.a > 0) {
            this.b.invoke("https://s.sporty.net/cms/Laliga_penalty_Win_the_prize_65ed154510.mp3");
        }
        return Unit.a;
    }
}
