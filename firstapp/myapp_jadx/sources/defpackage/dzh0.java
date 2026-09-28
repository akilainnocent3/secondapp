package defpackage;

import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.BirthdayVerifyData;
import com.sporty.android.core.model.pocket.withdraw.bvn.BvnData;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.twilio.voice.EventKeys;

/* JADX INFO: loaded from: classes5.dex */
public class dzh0 extends j8i0 {
    public final ssw<BvnData> a = new ssw<>();
    public final ssw<BvnData> b = new ssw<>();
    public su5<BaseResponse<xdp>> c;
    public su5<BaseResponse<xdp>> d;
    public final xxz e;

    public class a extends SimpleResponseWrapper<xdp> {
        public a() {
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            dzh0.this.a.m(null);
        }

        @Override // com.sportybet.android.data.CallbackWrapper
        public final void onResponseComplete() {
            dzh0.this.d = null;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(xdp xdpVar) {
            dzh0.this.a.m(new BvnData(lal.a(xdpVar, AnalyticsParam.EVENT_PARAM_RESULT, -1), getBizCode(), getMessage()));
        }
    }

    public class b extends SimpleResponseWrapper<xdp> {
        public b() {
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            dzh0.this.b.m(null);
        }

        @Override // com.sportybet.android.data.CallbackWrapper
        public final void onResponseComplete() {
            dzh0.this.c = null;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(xdp xdpVar) {
            xdp xdpVar2 = xdpVar;
            dzh0.this.b.m(new BvnData(lal.a(xdpVar2, AnalyticsParam.EVENT_PARAM_RESULT, -1), getBizCode(), lal.b(xdpVar2, EventKeys.ERROR_MESSAGE)));
        }
    }

    public dzh0(xxz xxzVar) {
        this.e = xxzVar;
    }

    public final void x1() {
        su5<BaseResponse<xdp>> su5Var = this.c;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<xdp>> su5VarA1 = this.e.A1();
        this.c = su5VarA1;
        su5VarA1.G(new b());
    }

    public final void y1(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        su5<BaseResponse<xdp>> su5Var = this.d;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<xdp>> su5VarH0 = this.e.h0(new BirthdayVerifyData(str, str2));
        this.d = su5VarH0;
        su5VarH0.G(new a());
    }
}
