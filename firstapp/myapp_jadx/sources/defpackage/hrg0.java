package defpackage;

import android.app.ProgressDialog;
import com.sporty.android.core.model.pocket.withdraw.bvn.BvnData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.payment.security.nameconfirm.bvn.presentation.activity.TransferBvnActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class hrg0 implements lfy<BvnData> {
    public final /* synthetic */ TransferBvnActivity a;

    public hrg0(TransferBvnActivity transferBvnActivity) {
        this.a = transferBvnActivity;
    }

    @Override // defpackage.lfy
    public final void u1(BvnData bvnData) {
        BvnData bvnData2 = bvnData;
        TransferBvnActivity.a aVar = TransferBvnActivity.A;
        TransferBvnActivity transferBvnActivity = this.a;
        ProgressDialog progressDialog = transferBvnActivity.y;
        if (progressDialog != null && progressDialog.isShowing()) {
            transferBvnActivity.z1();
            transferBvnActivity.y.dismiss();
        }
        if (bvnData2 == null) {
            transferBvnActivity.M1("");
        } else {
            transferBvnActivity.L1(bvnData2);
        }
        int bvnState = bvnData2 == null ? 109 : bvnData2.getBvnState();
        if (bvnState == -2) {
            zyf0.c(1, transferBvnActivity.getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
            return;
        }
        if (bvnState == 101) {
            a92.b bVar = new a92.b(R.string.component_bvn__success, R.string.component_bvn__your_bonuses_are_now_available_to_use);
            bVar.h = xib0.IMAGE_BVN_GIFT_CLOSE;
            bVar.g = new krg0(transferBvnActivity);
            bVar.j = true;
            bVar.l = R.dimen.bvngift_gift_width;
            bVar.m = R.dimen.bvngift_gift_height;
            a92.j0(bVar).show(transferBvnActivity.getSupportFragmentManager(), "bvngift_verify_success");
            return;
        }
        if (bvnState != 105) {
            if (bvnState == 109) {
                String cMSString = transferBvnActivity.getCMSString(R.string.component_bvn__your_verification_has_failed_please_check_your_information_tip, new Object[0]);
                String cMSString2 = transferBvnActivity.getCMSString(R.string.page_transaction__verification_failed, new Object[0]);
                String cMSString3 = transferBvnActivity.getCMSString(R.string.common_functions__u_retry, new Object[0]);
                String cMSString4 = transferBvnActivity.getCMSString(R.string.common_functions__cancel, new Object[0]);
                jrg0 jrg0Var = new jrg0();
                wie wieVar = new wie();
                wieVar.a = cMSString;
                wieVar.c = cMSString4;
                wieVar.b = cMSString3;
                wieVar.f = true;
                wieVar.e = true;
                wieVar.w = jrg0Var;
                wieVar.v = null;
                wieVar.i = true;
                wieVar.d = cMSString2;
                wieVar.z = R.color.brand_secondary;
                wieVar.y = R.color.brand_secondary;
                wieVar.A = R.color.text_type1_primary;
                wieVar.B = 0;
                wieVar.C = 1;
                wieVar.D = false;
                wieVar.E = false;
                wieVar.F = false;
                wieVar.show(transferBvnActivity.getSupportFragmentManager(), "bvngift_verify_fail");
                return;
            }
            if (bvnState != 110) {
                transferBvnActivity.M1(bvnData2.getMessage());
                return;
            }
        }
        transferBvnActivity.L1(bvnData2);
    }
}
