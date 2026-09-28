package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.MyFavoriteOddRange;

/* JADX INFO: loaded from: classes6.dex */
public final class pxw implements gv5<BaseResponse<MyFavoriteOddRange>> {
    public final /* synthetic */ qxw a;

    public pxw(qxw qxwVar) {
        this.a = qxwVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<MyFavoriteOddRange>> su5Var, Throwable th) {
        th.getClass();
        this.a.a.m(new kqc());
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<MyFavoriteOddRange>> su5Var, bi50<BaseResponse<MyFavoriteOddRange>> bi50Var) {
        BaseResponse<MyFavoriteOddRange> baseResponse;
        if (bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null) {
            ssw<hqc> sswVar = this.a.a;
            MyFavoriteOddRange myFavoriteOddRange = baseResponse.data;
            sswVar.m(myFavoriteOddRange != null ? new nqc(myFavoriteOddRange) : new jqc());
        }
    }
}
