package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.viewmodel.AccountLoginViewModel$checkShouldShowBiometricLoginOption$1", f = "AccountLoginViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
public final class u9 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aa b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(aa aaVar, String str, v1b<? super u9> v1bVar) {
        super(2, v1bVar);
        this.b = aaVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u9(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u9) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        aa aaVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            oc4 oc4Var = aaVar.f;
            String str = this.c;
            if (str == null) {
                str = "";
            }
            this.a = 1;
            obj = oc4Var.d(str, this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        wwd0 wwd0Var = aaVar.C;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, q74.a((q74) value, null, zBooleanValue, null, null, false, null, null, 0L, 253)));
        return Unit.a;
    }
}
