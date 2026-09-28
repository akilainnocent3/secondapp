package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.Spanned;
import android.view.View;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.user.kyc.KYCActivity;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y6h0 implements gv5<BaseResponse<KYCReminder>> {
    public final /* synthetic */ TxListActivity a;
    public final /* synthetic */ int b;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KYCReminder.Reminder.values().length];
            try {
                iArr[KYCReminder.Reminder.VERIFICATION_FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KYCReminder.Reminder.USER_TIER_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KYCReminder.Reminder.DEPOSIT_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public y6h0(int i, TxListActivity txListActivity) {
        this.a = txListActivity;
        this.b = i;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<KYCReminder>> su5Var, Throwable th) {
        th.getClass();
        ze zeVar = this.a.d;
        if (zeVar != null) {
            zeVar.f.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<KYCReminder>> su5Var, bi50<BaseResponse<KYCReminder>> bi50Var) {
        final BaseResponse<KYCReminder> baseResponse;
        Spanned spannedA;
        if (bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null && baseResponse.isSuccessful()) {
            final TxListActivity txListActivity = this.a;
            String cMSString = txListActivity.getCMSString(R.string.identity_verification__click_here, new Object[0]);
            cMSString.getClass();
            String str = "<u>" + cMSString + "</u>";
            String cMSString2 = txListActivity.getCMSString(R.string.identity_verification__tap_here, new Object[0]);
            cMSString2.getClass();
            String str2 = "<u>" + cMSString2 + "</u>";
            int i = a.a[baseResponse.data.getReminder().ordinal()];
            final int i2 = this.b;
            if (i == 1) {
                spannedA = nae0.a(String.format(txListActivity.getCMSString(R.string.identity_verification__kyc_reminder_02, new Object[0]), Arrays.copyOf(new Object[]{str2}, 1)));
            } else if (i == 2) {
                spannedA = nae0.a(txListActivity.getCMSString(R.string.identity_verification__kyc_reminder_03, String.valueOf(baseResponse.data.getReminderLevel()), str));
            } else {
                if (i != 3) {
                    ze zeVar = txListActivity.d;
                    if (zeVar != null) {
                        zeVar.f.setVisibility(8);
                        return;
                    } else {
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
                spannedA = nae0.a(String.format(txListActivity.getCMSString(R.string.identity_verification__kyc_reminder_04, new Object[0]), Arrays.copyOf(new Object[]{str}, 1)));
                ime.b(txListActivity, new ple(txListActivity.getCMSString(R.string.page_transaction__verify_identity_content, new Object[0]), txListActivity.getCMSString(R.string.common_functions__verify, new Object[0]), new DialogInterface.OnClickListener() { // from class: v6h0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        yrh0.t(txListActivity, KYCActivity.class, true);
                    }
                }, txListActivity.getCMSString(R.string.common_functions__skip, new Object[0]), (DialogInterface.OnClickListener) null, txListActivity.getCMSString(R.string.page_withdraw__verify_identity, new Object[0]), Integer.valueOf(i2)));
            }
            ze zeVar2 = txListActivity.d;
            if (zeVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zeVar2.f.setOnClickListener(new View.OnClickListener() { // from class: w6h0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseResponse baseResponse2 = baseResponse;
                    KYCReminder.Reminder reminder = ((KYCReminder) baseResponse2.data).getReminder();
                    KYCReminder.Reminder reminder2 = KYCReminder.Reminder.VERIFICATION_FAIL;
                    final TxListActivity txListActivity2 = txListActivity;
                    if (reminder != reminder2) {
                        yrh0.t(txListActivity2, KYCActivity.class, true);
                        return;
                    }
                    final Intent intent = new Intent(txListActivity2, (Class<?>) KYCActivity.class);
                    intent.putExtra("direct", true);
                    ime.b(txListActivity2, new ple(txListActivity2.getCMSString(R.string.identity_verification__verification_failed_content, ((KYCReminder) baseResponse2.data).getRejectReason()), txListActivity2.getCMSString(R.string.identity_verification__resubmit, new Object[0]), new DialogInterface.OnClickListener() { // from class: x6h0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            yrh0.s(txListActivity2, intent, true);
                        }
                    }, txListActivity2.getCMSString(R.string.common_functions__cancel, new Object[0]), (DialogInterface.OnClickListener) null, txListActivity2.getCMSString(R.string.component_bvn__verification_failed, new Object[0]), Integer.valueOf(i2)));
                }
            });
            ze zeVar3 = txListActivity.d;
            if (zeVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zeVar3.f.setText(spannedA);
            ze zeVar4 = txListActivity.d;
            if (zeVar4 != null) {
                zeVar4.f.setVisibility(0);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }
}
