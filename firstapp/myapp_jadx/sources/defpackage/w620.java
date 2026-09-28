package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.component.animation.postanimation.PostAnimationKt$PostAnimation$1$1", f = "PostAnimation.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class w620 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ ytw<z7n> c;
    public final /* synthetic */ ytw<g0w> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w620(Function0<Unit> function0, ytw<z7n> ytwVar, ytw<g0w> ytwVar2, v1b<? super w620> v1bVar) {
        super(2, v1bVar);
        this.b = function0;
        this.c = ytwVar;
        this.d = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w620(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w620) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            u620 u620Var = new u620(this.c, 0);
            v620 v620Var = new v620(this.d, 0);
            this.a = 1;
            if (y620.f(u620Var, v620Var, this.b, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
