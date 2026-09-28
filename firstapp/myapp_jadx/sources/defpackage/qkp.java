package defpackage;

import android.view.View;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qkp implements lfy {
    public final /* synthetic */ KeWithdrawActivity a;

    public /* synthetic */ qkp(KeWithdrawActivity keWithdrawActivity) {
        this.a = keWithdrawActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(Object obj) {
        String cMSString;
        String cMSString2;
        lk50 lk50Var = (lk50) obj;
        int i = KeWithdrawActivity.Z;
        if (lk50Var instanceof lk50.c) {
            AssetsInfo assetsInfo = (AssetsInfo) ((lk50.c) lk50Var).a;
            final KeWithdrawActivity keWithdrawActivity = this.a;
            keWithdrawActivity.c.setRefreshing(false);
            keWithdrawActivity.z = BigDecimal.valueOf(assetsInfo.balance).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP);
            keWithdrawActivity.b.setText(bjb0.U(assetsInfo.balance, Locale.US));
            int i2 = assetsInfo.auditStatus;
            if (i2 == 11 || i2 == 12 || i2 == 13) {
                keWithdrawActivity.f.setVisibility(8);
                keWithdrawActivity.J.a.setVisibility(0);
                String cMSString3 = null;
                switch (i2) {
                    case 11:
                        cMSString3 = keWithdrawActivity.getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]);
                        cMSString = keWithdrawActivity.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_tip, new Object[0]);
                        cMSString2 = keWithdrawActivity.getCMSString(R.string.identity_verification__verify, new Object[0]);
                        keWithdrawActivity.J.d.setOnClickListener(new tkp());
                        keWithdrawActivity.J.d.setVisibility(0);
                        break;
                    case 12:
                        String str = keWithdrawActivity.getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]) + "(" + keWithdrawActivity.getCMSString(R.string.page_transaction__pending_verification, new Object[0]) + ")";
                        String cMSString4 = keWithdrawActivity.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip, new Object[0]);
                        keWithdrawActivity.J.d.setVisibility(8);
                        cMSString2 = null;
                        cMSString3 = str;
                        cMSString = cMSString4;
                        break;
                    case 13:
                        cMSString3 = keWithdrawActivity.getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]) + "(" + keWithdrawActivity.getCMSString(R.string.page_payment__verification_failed, new Object[0]) + ")";
                        cMSString = keWithdrawActivity.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip, new Object[0]);
                        cMSString2 = keWithdrawActivity.getCMSString(R.string.common_functions__contact_us, new Object[0]);
                        keWithdrawActivity.J.d.setOnClickListener(new View.OnClickListener() { // from class: ukp
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i3 = KeWithdrawActivity.Z;
                                keWithdrawActivity.V.b(view.getContext(), snb0.WITHDRAW);
                            }
                        });
                        keWithdrawActivity.J.d.setVisibility(0);
                        break;
                    default:
                        keWithdrawActivity.J.a.setVisibility(8);
                        cMSString = null;
                        cMSString2 = null;
                        break;
                }
                keWithdrawActivity.J.c.setText(cMSString3);
                keWithdrawActivity.J.b.setText(cMSString);
                keWithdrawActivity.J.d.setText(cMSString2);
            } else {
                keWithdrawActivity.J.a.setVisibility(8);
            }
            keWithdrawActivity.I = assetsInfo.auditStatus;
        }
    }
}
