package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.GetWithdrawBankHintBundleUseCase$invoke$withdrawAlertConfigFlow$2$1", f = "GetWithdrawBankHintBundleUseCase.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class xgk extends tje0 implements Function2<jw1, v1b<? super WithdrawAlertHintStatus>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ygk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgk(ygk ygkVar, v1b<? super xgk> v1bVar) {
        super(2, v1bVar);
        this.c = ygkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xgk xgkVar = new xgk(this.c, v1bVar);
        xgkVar.b = obj;
        return xgkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jw1 jw1Var, v1b<? super WithdrawAlertHintStatus> v1bVar) {
        return ((xgk) create(jw1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jw1 jw1Var = (jw1) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (jw1Var != null) {
                phj0 phj0Var = this.c.a;
                at.a aVar = new at.a(new iw1.b(jw1Var.a), jw1Var.c);
                this.b = null;
                this.a = 1;
                obj = phj0Var.c(aVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            return WithdrawAlertHintStatus.Gone.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        WithdrawAlertHintStatus withdrawAlertHintStatus = (WithdrawAlertHintStatus) obj;
        if (withdrawAlertHintStatus != null) {
            return withdrawAlertHintStatus;
        }
        return WithdrawAlertHintStatus.Gone.a;
    }
}
