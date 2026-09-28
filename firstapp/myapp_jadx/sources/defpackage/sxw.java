package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.MyFavoriteOddRange;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsxw;", "Liww;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sxw extends iww {
    public final mpe0 f;
    public final qxw i;
    public final mo0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxw(vxw vxwVar, xxz xxzVar) {
        super(vxwVar);
        vxwVar.getClass();
        xxzVar.getClass();
        this.f = hwr.b(new rxw());
        ssw<hqc> sswVar = this.a;
        sswVar.getClass();
        this.i = new qxw(sswVar, xxzVar);
        this.v = l840.a();
    }

    @Override // defpackage.iww
    public final su5<BaseResponse<Object>> A1() {
        su5<BaseResponse<Object>> su5VarI = this.v.i((MyFavoriteOddRange) this.f.getValue());
        su5VarI.getClass();
        return su5VarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iww
    public final void B1(pvw<?> pvwVar) {
        T t = pvwVar.a;
        MyFavoriteOddRange myFavoriteOddRange = t instanceof MyFavoriteOddRange ? (MyFavoriteOddRange) t : null;
        if (myFavoriteOddRange != null) {
            mpe0 mpe0Var = this.f;
            ((MyFavoriteOddRange) mpe0Var.getValue()).max = myFavoriteOddRange.max;
            ((MyFavoriteOddRange) mpe0Var.getValue()).min = myFavoriteOddRange.min;
        }
        x1();
    }

    @Override // defpackage.iww
    public final void z1() {
        qxw qxwVar = this.i;
        qxwVar.a.m(qxwVar.c);
        su5<BaseResponse<MyFavoriteOddRange>> su5Var = qxwVar.d;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<MyFavoriteOddRange>> su5VarW1 = qxwVar.b.w1();
        su5VarW1.G(new pxw(qxwVar));
        qxwVar.d = su5VarW1;
    }
}
