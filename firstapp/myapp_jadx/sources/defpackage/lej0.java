package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initTrackingEventCollector$6", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lej0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ afj0 a;
    public final /* synthetic */ wwd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lej0(afj0 afj0Var, wwd0 wwd0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.a = afj0Var;
        this.b = wwd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lej0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((lej0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = ((v1f) this.b.getValue()) != null ? "sr:sport:3" : null;
        if (str == null) {
            str = "";
        }
        this.a.f.a(new s5f(str), k00.d, k00.c);
        return Unit.a;
    }
}
