package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.matchtracker.component.IbLottiePlayerKt$LottiePlayerInternal$2$1", f = "IbLottiePlayer.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m2n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ont a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2n(ont ontVar, Function0 function0, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ontVar;
        this.b = function0;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m2n(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m2n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.b()) {
            ytw<Boolean> ytwVar = this.c;
            if (!ytwVar.getValue().booleanValue()) {
                ytwVar.setValue(Boolean.TRUE);
                Function0<Unit> function0 = this.b;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        return Unit.a;
    }
}
