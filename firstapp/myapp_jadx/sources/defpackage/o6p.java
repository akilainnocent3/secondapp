package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public class o6p extends d {
    public static final /* synthetic */ int c = 0;
    public int a;
    public String b;

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.a = getArguments().getInt("jackpot_param1");
            this.b = getArguments().getString("jackpot_param2");
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        b.a aVar = new b.a(getActivity());
        aVar.e(R.layout.jap_betslip_info_dialog);
        if (this.a == 4200) {
            aVar.b(sn5.d(this, R.string.common_functions__later, new Object[0]), new k6p());
            aVar.c(sn5.d(this, R.string.common_functions__deposit, new Object[0]), new l6p());
        } else {
            aVar.c(sn5.d(this, R.string.common_functions__ok, new Object[0]), new m6p());
        }
        b bVarCreate = aVar.create();
        bVarCreate.show();
        TextView textView = (TextView) bVarCreate.findViewById(R.id.title);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.content);
        int i = this.a;
        if (i == 4100) {
            textView.setText(sn5.b(bVarCreate.getContext(), R.string.common_feedback__submission_failed, new Object[0]));
            if (TextUtils.isEmpty(this.b)) {
                textView2.setText(sn5.b(bVarCreate.getContext(), R.string.app_common__failed_cash_not_enough, new Object[0]));
                return bVarCreate;
            }
            textView2.setText(this.b);
            return bVarCreate;
        }
        if (i == 4200) {
            textView.setText(sn5.b(bVarCreate.getContext(), R.string.common_functions__balance_insufficient, new Object[0]));
            if (TextUtils.isEmpty(this.b)) {
                textView2.setText(sn5.b(bVarCreate.getContext(), R.string.common_feedback__your_account_balance_is_insufficient_tip, new Object[0]));
                return bVarCreate;
            }
            textView2.setText(this.b);
            return bVarCreate;
        }
        if (i == 10) {
            textView.setText(sn5.b(bVarCreate.getContext(), R.string.common_feedback__request_pending, new Object[0]));
            if (TextUtils.isEmpty(this.b)) {
                textView2.setText(sn5.b(bVarCreate.getContext(), R.string.jackpot__your_order_has_been_submitted_awaiting_for_confirmation, new Object[0]));
                return bVarCreate;
            }
            textView2.setText(this.b);
            return bVarCreate;
        }
        if (i == -1000) {
            textView.setText("");
            if (TextUtils.isEmpty(this.b)) {
                textView2.setText(sn5.b(bVarCreate.getContext(), R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                return bVarCreate;
            }
            textView2.setText(this.b);
            return bVarCreate;
        }
        if (i == 4210) {
            textView.setText(sn5.b(bVarCreate.getContext(), R.string.common_feedback__submission_failed, new Object[0]));
            if (TextUtils.isEmpty(this.b)) {
                textView.setText(sn5.b(bVarCreate.getContext(), R.string.component_betslip__gift_unavailable, new Object[0]));
                return bVarCreate;
            }
            textView2.setText(this.b);
            return bVarCreate;
        }
        textView.setText(sn5.b(bVarCreate.getContext(), R.string.common_feedback__submission_failed, new Object[0]));
        if (TextUtils.isEmpty(this.b)) {
            textView2.setText(sn5.b(bVarCreate.getContext(), R.string.common_feedback__order_did_not_go_through_for_some_reason, new Object[0]));
            return bVarCreate;
        }
        textView2.setText(this.b);
        return bVarCreate;
    }
}
