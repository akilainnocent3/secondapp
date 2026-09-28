package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.viewmodel.AccountLoginViewModel$onAuthSuccess$1", f = "AccountLoginViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class y9 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aa b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qd4.c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(aa aaVar, String str, qd4.c cVar, v1b<? super y9> v1bVar) {
        super(2, v1bVar);
        this.b = aaVar;
        this.c = str;
        this.d = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y9(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y9) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        aa aaVar = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                oc4 oc4Var = aaVar.f;
                String str = this.c;
                qd4.c cVar = this.d;
                this.a = 1;
                obj = oc4Var.b(str, cVar, this);
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
            aaVar.getClass();
            ej5.c(o8i0.d(aaVar), null, null, new x9(aaVar, (String) obj, null), 3);
        } catch (Exception e) {
            itf0.a.d("Decrypt token failed: " + e, new Object[0]);
        }
        return Unit.a;
    }
}
