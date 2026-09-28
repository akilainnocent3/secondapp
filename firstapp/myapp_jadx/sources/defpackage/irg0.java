package defpackage;

import android.app.ProgressDialog;
import com.sporty.android.core.model.pocket.withdraw.bvn.BvnData;
import com.sportybet.android.payment.security.nameconfirm.bvn.presentation.activity.TransferBvnActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class irg0 implements lfy<BvnData> {
    public final /* synthetic */ TransferBvnActivity a;

    public irg0(TransferBvnActivity transferBvnActivity) {
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
    }
}
