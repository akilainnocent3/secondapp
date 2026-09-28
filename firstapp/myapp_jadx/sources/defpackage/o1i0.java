package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.sportypin.VerifyResetPinActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class o1i0 implements lfy<bi50<BaseResponse<xdp>>> {
    public final /* synthetic */ VerifyResetPinActivity a;

    public o1i0(VerifyResetPinActivity verifyResetPinActivity) {
        this.a = verifyResetPinActivity;
    }

    @Override // defpackage.lfy
    public final void u1(bi50<BaseResponse<xdp>> bi50Var) {
        bi50<BaseResponse<xdp>> bi50Var2 = bi50Var;
        int i = VerifyResetPinActivity.H;
        VerifyResetPinActivity verifyResetPinActivity = this.a;
        ProgressDialog progressDialog = verifyResetPinActivity.B;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (verifyResetPinActivity.isFinishing()) {
            return;
        }
        if (bi50Var2 == null) {
            verifyResetPinActivity.z1(null, null, null);
            return;
        }
        BaseResponse<xdp> baseResponse = bi50Var2.b;
        if (!bi50Var2.a.getIsSuccessful() || baseResponse == null) {
            verifyResetPinActivity.z1(null, null, null);
            return;
        }
        int i2 = baseResponse.bizCode;
        if (i2 == 10000) {
            Intent intent = new Intent();
            intent.putExtra("pinToken", lal.b(baseResponse.data, "pinToken"));
            verifyResetPinActivity.setResult(UserCertConstants.REQUEST_CODE_BVN, intent);
            verifyResetPinActivity.finish();
            return;
        }
        if (i2 != 11701) {
            if (i2 == 11708) {
                verifyResetPinActivity.A1(2, baseResponse.message);
                return;
            }
            if (i2 == 11710) {
                String cMSString = TextUtils.isEmpty(baseResponse.message) ? verifyResetPinActivity.getCMSString(R.string.common_otp_verify__incorrect_code_attemp, oAudzpbdOhCI.birhYY) : baseResponse.message;
                verifyResetPinActivity.b.b();
                verifyResetPinActivity.z1(verifyResetPinActivity.getCMSString(R.string.common_otp_verify__incorrect_code, new Object[0]), cMSString, new DialogInterface.OnClickListener() { // from class: m1i0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        lop.d(this.a.a.b);
                    }
                });
                return;
            } else if (i2 != 11810) {
                verifyResetPinActivity.z1(null, baseResponse.message, null);
                return;
            }
        }
        verifyResetPinActivity.b.b();
        verifyResetPinActivity.z1(verifyResetPinActivity.getCMSString(R.string.common_otp_verify__code_expired, new Object[0]), TextUtils.isEmpty(baseResponse.message) ? verifyResetPinActivity.getCMSString(R.string.common_otp_verify__code_expired_desc, new Object[0]) : baseResponse.message, new DialogInterface.OnClickListener() { // from class: n1i0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                lop.d(this.a.a.b);
            }
        });
    }
}
