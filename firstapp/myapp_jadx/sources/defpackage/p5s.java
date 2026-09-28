package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;

/* JADX INFO: loaded from: classes5.dex */
public final class p5s extends q5s.a<BaseResponse<OTPCompleteResult>> {
    public final /* synthetic */ q5s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5s(q5s q5sVar, vu90 vu90Var) {
        super(vu90Var);
        this.b = q5sVar;
    }

    @Override // q5s.a
    public final void a() {
        this.b.D = null;
    }
}
