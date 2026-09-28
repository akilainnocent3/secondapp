package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.twofa.TwoFAIndicatorPage;
import com.sporty.android.core.model.security.twofa.UpdateTwoFAIndicatorStatusBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateTwoFAHintStatus$2", f = "PatronRepositoryImpl.kt", l = {689}, m = "invokeSuspend", v = 2)
public final class czz extends tje0 implements Function2<v5b, v1b<? super lk50<? extends String>>, Object> {
    public int a;
    public final /* synthetic */ nyz b;
    public final /* synthetic */ TwoFAIndicatorPage c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czz(nyz nyzVar, TwoFAIndicatorPage twoFAIndicatorPage, v1b<? super czz> v1bVar) {
        super(2, v1bVar);
        this.b = nyzVar;
        this.c = twoFAIndicatorPage;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new czz(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends String>> v1bVar) {
        return ((czz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                xxz xxzVar = this.b.a;
                UpdateTwoFAIndicatorStatusBody updateTwoFAIndicatorStatusBody = new UpdateTwoFAIndicatorStatusBody(this.c.getValue());
                this.a = 1;
                obj = xxzVar.J0(updateTwoFAIndicatorStatusBody, this);
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
            return new lk50.c(n52.b((BaseResponse) obj));
        } catch (Exception e) {
            itf0.a.f(e, "Failed to update TwoFA hint status", new Object[0]);
            return new lk50.a(e);
        }
    }
}
