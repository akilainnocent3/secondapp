package defpackage;

import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class id50 implements Function0 {
    public final /* synthetic */ rd50 a;
    public final /* synthetic */ OTPCompleteResult b;

    public /* synthetic */ id50(rd50 rd50Var, OTPCompleteResult oTPCompleteResult) {
        this.a = rd50Var;
        this.b = oTPCompleteResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rd50 rd50Var = this.a;
        rd50Var.e.a(new xuz.f(rd50Var.i, this.b, rd50Var.y, rd50Var.w));
        return Unit.a;
    }
}
