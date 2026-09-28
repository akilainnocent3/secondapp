package defpackage;

import com.sporty.android.core.model.account.CpfData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.viewmodel.SelfExclusionConfirmViewModel$onFacialRecognitionDialogVerifyClick$1", f = "SelfExclusionConfirmViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class ca80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ z980 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca80(z980 z980Var, v1b<? super ca80> v1bVar) {
        super(2, v1bVar);
        this.b = z980Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ca80(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ca80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        z980 z980Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            z980Var.c.m(z980.a.e.a);
            kgk kgkVar = z980Var.b;
            this.a = 1;
            obj = s0i.a(new sl50(bm50.b(kgkVar.a.j(null), vch0.b)), this);
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
        lk50 lk50Var = (lk50) obj;
        String cpf = lk50Var instanceof lk50.c ? ((CpfData) ((lk50.c) lk50Var).a).getCpf() : null;
        if (cpf == null || cpf.length() == 0) {
            z980Var.c.m(z980.a.b.a);
            return Unit.a;
        }
        z980Var.c.m(new z980.a.c(new u6h(cpf, q7h.SELF_EXCLUSION)));
        return Unit.a;
    }
}
