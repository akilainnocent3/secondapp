package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.viewmodel.AccountLoginViewModel$login$2", f = "AccountLoginViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
public final class w9 extends tje0 implements Function2<lk50<? extends sit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(aa aaVar, v1b<? super w9> v1bVar) {
        super(2, v1bVar);
        this.c = aaVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w9 w9Var = new w9(this.c, v1bVar);
        w9Var.b = obj;
        return w9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends sit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((w9) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<sit> lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            aa aaVar = this.c;
            aaVar.z.m(lk50Var);
            ohb0 ohb0Var = aaVar.e;
            this.b = lk50Var;
            this.a = 1;
            if (ohb0Var.a.b(this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (lk50Var instanceof lk50.a) {
            aa.A1(this.c, "network_error", "password", null, ((lk50.a) lk50Var).a, 4);
        }
        return Unit.a;
    }
}
