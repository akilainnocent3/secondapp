package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.BaseDepositViewModel$proceedNameConfirm$1", f = "BaseDepositViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class p02 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m02 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p02(m02 m02Var, v1b<? super p02> v1bVar) {
        super(2, v1bVar);
        this.b = m02Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p02(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p02) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        m02 m02Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ku90<m480> ku90Var = m02Var.y;
            String lastAccessToken = m02Var.c0.getLastAccessToken();
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__deposit);
            this.a = 1;
            bc6 bc6Var = new bc6(1, yzo.b(this));
            bc6Var.q();
            ku90Var.a(new m480.c(lastAccessToken, resourceUiText, bc6Var));
            obj = bc6Var.o();
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
        if (Intrinsics.g((mcx) obj, mcx.c.a)) {
            ku90<a> ku90Var2 = m02Var.f;
            StringUiText stringUiText2 = vch0.a;
            gi8.c(ku90Var2, null, new ResourceUiText(R.string.page_payment__you_deposit_request_has_been_submitted_tip), null, null, new o02(m02Var, 0), 29);
        }
        return Unit.a;
    }
}
