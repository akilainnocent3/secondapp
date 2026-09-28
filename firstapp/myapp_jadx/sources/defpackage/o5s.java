package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class o5s extends q5s.a<BaseResponse<PreRegisterResponse>> {
    public final /* synthetic */ q5s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5s(q5s q5sVar, vu90 vu90Var) {
        super(vu90Var);
        this.b = q5sVar;
    }

    @Override // q5s.a
    public final void a() {
        this.b.C = null;
    }

    @Override // q5s.a, defpackage.gv5
    public final void onResponse(su5<BaseResponse<PreRegisterResponse>> su5Var, bi50<BaseResponse<PreRegisterResponse>> bi50Var) {
        super.onResponse(su5Var, bi50Var);
        if (bi50Var.a.getIsSuccessful()) {
            q5s q5sVar = this.b;
            q5sVar.e.a(ts40.n.a, k00.a);
            q5sVar.e.a(ts40.m.a, k00.b);
        }
    }
}
