package defpackage;

import android.util.Base64;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.WithdrawalPinVerifyResponse;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;

/* JADX INFO: loaded from: classes6.dex */
public class tz00 extends j8i0 {
    public final ssw<BaseResponse<xdp>> a = new ssw<>();
    public final ssw<WithdrawalPinStatusInfo> b = new ssw<>();
    public final ssw<WithdrawalPinVerifyResponse> c = new ssw<>();
    public final ssw<BaseResponse<xdp>> d = new ssw<>();
    public final ssw<BaseResponse<xdp>> e = new ssw<>();
    public final ssw<UiText> f = new ssw<>();
    public final ssw<BaseResponse<xdp>> i = new ssw<>();
    public final ssw<BaseResponse<xdp>> v = new ssw<>();
    public su5<BaseResponse<Object>> w;
    public final psm y;
    public final xxz z;

    public class a implements gv5<BaseResponse<xdp>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<xdp>> su5Var, Throwable th) {
            tz00.this.d.m(null);
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<xdp>> su5Var, bi50<BaseResponse<xdp>> bi50Var) {
            BaseResponse<xdp> baseResponse = bi50Var.b;
            ssw<BaseResponse<xdp>> sswVar = tz00.this.d;
            if (baseResponse != null) {
                sswVar.m(baseResponse);
            } else {
                sswVar.m(null);
            }
        }
    }

    public tz00(psm psmVar, xxz xxzVar) {
        this.y = psmVar;
        this.z = xxzVar;
    }

    public final void x1(int i, String str, String str2) {
        this.z.W(str, Base64.encodeToString(str2.getBytes(), 2), i).G(new a());
    }
}
