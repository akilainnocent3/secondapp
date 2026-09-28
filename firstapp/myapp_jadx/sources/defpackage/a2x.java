package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.MyFavoriteStake;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La2x;", "Liww;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a2x extends iww {
    public final u1x f;
    public final mo0 i;
    public final mpe0 v;
    public MyFavoriteStake w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2x(vxw vxwVar, xxz xxzVar) {
        super(vxwVar);
        xxzVar.getClass();
        vxwVar.getClass();
        ssw<hqc> sswVar = this.a;
        sswVar.getClass();
        this.f = new u1x(sswVar, xxzVar);
        this.i = l840.a();
        this.v = hwr.b(new z1x());
        this.w = new MyFavoriteStake(null, null, null, null, 15, null);
    }

    public static Double D1(Double d, boolean z) {
        double dDoubleValue;
        if (d != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
            BigDecimal bigDecimal = new BigDecimal(10000L);
            if (z) {
                dDoubleValue = bigDecimalValueOf.multiply(bigDecimal).doubleValue();
            } else if (z) {
                uhc.a();
            } else {
                dDoubleValue = bigDecimalValueOf.divide(bigDecimal).doubleValue();
            }
            return Double.valueOf(dDoubleValue);
        }
        return null;
    }

    @Override // defpackage.iww
    public final su5<BaseResponse<Object>> A1() {
        su5<BaseResponse<Object>> su5VarJ = this.i.j((MyFavoriteStake) this.v.getValue());
        su5VarJ.getClass();
        return su5VarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iww
    public final void B1(pvw<?> pvwVar) {
        T t = pvwVar.a;
        MyFavoriteStake myFavoriteStake = t instanceof MyFavoriteStake ? (MyFavoriteStake) t : null;
        if (myFavoriteStake != null) {
            mpe0 mpe0Var = this.v;
            ((MyFavoriteStake) mpe0Var.getValue()).setDefaultStake(myFavoriteStake.getDefaultStake());
            ((MyFavoriteStake) mpe0Var.getValue()).setQuickAddStake1(myFavoriteStake.getQuickAddStake1());
            ((MyFavoriteStake) mpe0Var.getValue()).setQuickAddStake2(myFavoriteStake.getQuickAddStake2());
            ((MyFavoriteStake) mpe0Var.getValue()).setQuickAddStake3(myFavoriteStake.getQuickAddStake3());
        }
        x1();
        this.e.d(true);
    }

    public final void E1(MyFavoriteStake myFavoriteStake, boolean z) {
        myFavoriteStake.getClass();
        myFavoriteStake.setDefaultStake(D1(myFavoriteStake.getDefaultStake(), z));
        myFavoriteStake.setQuickAddStake1(D1(myFavoriteStake.getQuickAddStake1(), z));
        myFavoriteStake.setQuickAddStake2(D1(myFavoriteStake.getQuickAddStake2(), z));
        myFavoriteStake.setQuickAddStake3(D1(myFavoriteStake.getQuickAddStake3(), z));
        if (z) {
            return;
        }
        this.w = myFavoriteStake;
    }

    @Override // defpackage.iww
    public final void z1() {
        jvd0 jvd0Var;
        et7 et7VarD = o8i0.d(this);
        u1x u1xVar = this.f;
        u1xVar.getClass();
        jvd0 jvd0Var2 = u1xVar.d;
        if (jvd0Var2 == null || !jvd0Var2.isActive() || (jvd0Var = u1xVar.d) == null || jvd0Var.isCompleted()) {
            u1xVar.a.m(u1xVar.c);
            jvd0 jvd0Var3 = u1xVar.d;
            if (jvd0Var3 != null) {
                jvd0Var3.cancel((CancellationException) null);
            }
            u1xVar.d = ej5.c(et7VarD, null, null, new t1x(u1xVar, null), 3);
        }
    }
}
