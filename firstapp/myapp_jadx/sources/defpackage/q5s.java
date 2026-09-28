package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatusLegacy;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class q5s extends j8i0 {
    public su5<BaseResponse<xdp>> A;
    public su5<BaseResponse<TransferStatusLegacy>> B;
    public su5<BaseResponse<PreRegisterResponse>> C;
    public su5<BaseResponse<OTPCompleteResult>> D;
    public final q4z a;
    public final xxz b;
    public final pr10 c;
    public final psm d;
    public final rdd0 e;
    public final ssw<bi50<BaseResponse<xdp>>> f = new ssw<>();
    public final ssw<bi50<BaseResponse<xdp>>> i = new ssw<>();
    public final ssw<bi50<BaseResponse<TransferStatusLegacy>>> v = new ssw<>();
    public final vu90 w = new vu90();
    public final vu90 y = new vu90();
    public su5<BaseResponse<xdp>> z;

    public static abstract class a<T> implements gv5<T> {
        public final WeakReference<ssw<bi50<T>>> a;

        public a(ssw<bi50<T>> sswVar) {
            this.a = new WeakReference<>(sswVar);
        }

        public abstract void a();

        @Override // defpackage.gv5
        public final void onFailure(su5<T> su5Var, Throwable th) {
            ssw<bi50<T>> sswVar;
            if (!su5Var.isCanceled() && (sswVar = this.a.get()) != null) {
                sswVar.m(null);
            }
            a();
        }

        @Override // defpackage.gv5
        public void onResponse(su5<T> su5Var, bi50<T> bi50Var) {
            ssw<bi50<T>> sswVar;
            if (!su5Var.isCanceled() && (sswVar = this.a.get()) != null) {
                sswVar.m(bi50Var);
            }
            a();
        }
    }

    public q5s(q4z q4zVar, xxz xxzVar, pr10 pr10Var, psm psmVar, rdd0 rdd0Var) {
        this.a = q4zVar;
        this.b = xxzVar;
        this.c = pr10Var;
        this.d = psmVar;
        this.e = rdd0Var;
    }
}
