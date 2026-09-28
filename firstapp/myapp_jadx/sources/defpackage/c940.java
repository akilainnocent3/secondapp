package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.model.cashOut.CashOutPageResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class c940 implements v840 {
    public final u840 a;
    public lk50<? extends BaseResponse<CashOutPageResponse>> b;

    public c940(u840 u840Var) {
        u840Var.getClass();
        this.a = u840Var;
        this.b = lk50.b.a;
    }

    @Override // defpackage.v840
    public final vl50 a() {
        lk50<? extends BaseResponse<CashOutPageResponse>> lk50Var = this.b;
        return (!(lk50Var instanceof lk50.c) || bm50.k((lk50.c) lk50Var, 5000L)) ? bm50.f(new z840(bm50.a(new or60(new b940(this, null))), this)) : bm50.f(new or60(new a940(this, null)));
    }

    @Override // defpackage.v840
    public final or60 b(String str) {
        return new or60(new y840(this, str, null));
    }
}
