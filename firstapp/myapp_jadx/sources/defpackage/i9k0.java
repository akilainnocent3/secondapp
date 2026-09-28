package defpackage;

import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import com.sporty.android.core.model.security.otp.RegisterCompleteBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.zaaccount.register.ZAAccountRegisterViewModel$submit$3", f = "ZAAccountRegisterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i9k0 extends tje0 implements Function2<lk50<? extends PreRegisterResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ j9k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9k0(j9k0 j9k0Var, v1b<? super i9k0> v1bVar) {
        super(2, v1bVar);
        this.b = j9k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i9k0 i9k0Var = new i9k0(this.b, v1bVar);
        i9k0Var.a = obj;
        return i9k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends PreRegisterResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((i9k0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        j9k0 j9k0Var = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = j9k0.C;
            j9k0Var.A1(nak0.a(j9k0Var.x1(), null, false, false, uxs.LOADING, sx40.c.a, null, 2559));
        } else if (lk50Var instanceof lk50.c) {
            if (Intrinsics.g(((PreRegisterResponse) ((lk50.c) lk50Var).a).getIgnoreVerificationCode(), Boolean.TRUE)) {
                ohp<Object>[] ohpVarArr2 = j9k0.C;
                kzh.d(new g1i(bm50.a(new e9k0(j9k0Var.c.i(new RegisterCompleteBody("", "", j9k0Var.a.P(), j9k0Var.x1().f.a.b)))), new f9k0(j9k0Var, null)), o8i0.d(j9k0Var));
            } else {
                ohp<Object>[] ohpVarArr3 = j9k0.C;
                j9k0Var.A1(nak0.a(j9k0Var.x1(), null, false, false, uxs.ENABLE, sx40.b.a, null, 2559));
                ku90<t8k0> ku90Var = j9k0Var.y;
                ku90Var.a.a(new t8k0.e(j9k0Var.a.P(), j9k0Var.x1().f.a.b));
            }
            j9k0Var.d.a(ts40.n.a, k00.a);
            j9k0Var.d.a(ts40.m.a, k00.b);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            Throwable th = ((lk50.a) lk50Var).a;
            ohp<Object>[] ohpVarArr4 = j9k0.C;
            j9k0Var.y1(th);
        }
        return Unit.a;
    }
}
