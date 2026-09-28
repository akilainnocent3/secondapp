package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$getSocialShareCode$4", f = "SocialShareUseCase.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class jia0 extends tje0 implements Function2<uha0, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2<uha0, v1b<? super Unit>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jia0(Function2<? super uha0, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super jia0> v1bVar) {
        super(2, v1bVar);
        this.c = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jia0 jia0Var = new jia0(this.c, v1bVar);
        jia0Var.b = obj;
        return jia0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(uha0 uha0Var, v1b<? super Unit> v1bVar) {
        return ((jia0) create(uha0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uha0 uha0Var = (uha0) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.invoke(uha0Var, this) == y5bVar) {
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
