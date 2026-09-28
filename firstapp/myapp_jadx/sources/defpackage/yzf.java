package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.EmailChangeVerifyIdentityViewModel$handleAction$5", f = "EmailChangeVerifyIdentityViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class yzf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a0g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzf(a0g a0gVar, v1b<? super yzf> v1bVar) {
        super(2, v1bVar);
        this.b = a0gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yzf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yzf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        a0g a0gVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            mgb0 mgb0Var = a0gVar.b;
            this.a = 1;
            obj = mgb0Var.getLastAccount(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            a0gVar.w.a(new vzf.b(str, a0gVar.f.a));
        }
        return Unit.a;
    }
}
