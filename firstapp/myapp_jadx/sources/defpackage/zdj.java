package defpackage;

import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import com.sporty.android.core.model.security.otp.RegisterCompleteBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.ghaccount.password.GHSetPasswordViewModel$preRegister$3", f = "GHSetPasswordViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zdj extends tje0 implements Function2<lk50<? extends PreRegisterResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ eej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdj(eej eejVar, v1b<? super zdj> v1bVar) {
        super(2, v1bVar);
        this.b = eejVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zdj zdjVar = new zdj(this.b, v1bVar);
        zdjVar.a = obj;
        return zdjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends PreRegisterResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((zdj) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        eej eejVar = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = eej.B;
            eejVar.z1(awz.a(eejVar.x1(), null, null, wh80.c.a, null, 11));
        } else if (lk50Var instanceof lk50.c) {
            a990 a990Var = eejVar.e;
            rdd0 rdd0Var = eejVar.f;
            PreRegisterResponse preRegisterResponse = (PreRegisterResponse) ((lk50.c) lk50Var).a;
            Boolean ignoreVerificationCode = preRegisterResponse.getIgnoreVerificationCode();
            Boolean bool = Boolean.TRUE;
            a990Var.b = Intrinsics.g(ignoreVerificationCode, bool);
            uf00<Integer> uf00VarA = eejVar.b.a();
            if (Intrinsics.g(preRegisterResponse.getIgnoreVerificationCode(), bool)) {
                eejVar.z1(awz.a(eejVar.x1(), null, null, null, uf00VarA, 7));
                kzh.d(new g1i(new xzh(bm50.a(new aej(eejVar.d.i(new RegisterCompleteBody("", "", eejVar.c.P(), eejVar.A)))), new bej(2, null)), new dej(eejVar, null)), o8i0.d(eejVar));
            } else {
                eejVar.z1(awz.a(eejVar.x1(), null, null, wh80.b.a, uf00VarA, 3));
                ku90<ycj> ku90Var = eejVar.y;
                ku90Var.a.a(new ycj.c(eejVar.A));
            }
            rdd0Var.a(ts40.n.a, k00.a);
            rdd0Var.a(ts40.m.a, k00.b);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            Throwable th = ((lk50.a) lk50Var).a;
            ohp<Object>[] ohpVarArr2 = eej.B;
            eejVar.y1(th);
        }
        return Unit.a;
    }
}
