package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$addOrEditSocialShareCode$2", f = "SocialShareUseCase.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class bia0 extends tje0 implements gaj<myh<? super a8a0>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ Function2<Throwable, v1b<? super Unit>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bia0(Function2<? super Throwable, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super bia0> v1bVar) {
        super(3, v1bVar);
        this.c = function2;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super a8a0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        bia0 bia0Var = new bia0(this.c, v1bVar);
        bia0Var.b = th;
        return bia0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.invoke(th, this) == y5bVar) {
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
