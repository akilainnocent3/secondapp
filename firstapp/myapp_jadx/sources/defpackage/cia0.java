package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$addOrEditSocialShareCode$3", f = "SocialShareUseCase.kt", l = {171}, m = "invokeSuspend", v = 2)
public final class cia0 extends tje0 implements Function2<a8a0, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2<a8a0, v1b<? super Unit>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cia0(Function2<? super a8a0, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super cia0> v1bVar) {
        super(2, v1bVar);
        this.c = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cia0 cia0Var = new cia0(this.c, v1bVar);
        cia0Var.b = obj;
        return cia0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a8a0 a8a0Var, v1b<? super Unit> v1bVar) {
        return ((cia0) create(a8a0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a8a0 a8a0Var = (a8a0) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.invoke(a8a0Var, this) == y5bVar) {
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
