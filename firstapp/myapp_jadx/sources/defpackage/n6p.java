package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public class n6p extends d {
    public int a;
    public TextView b;
    public TextView c;
    public String d;

    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            fbh0 fbh0VarC = sh8.c();
            String strA = o7d.a(wae.DEPOSIT);
            dag dagVar = dag.INSUFFICIENT_BALANCE;
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_ENTRANCE", dagVar);
            fbh0VarC.c(strA, bundle);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.a = getArguments().getInt("jackpot_param1");
            this.d = getArguments().getString("jackpot_param2");
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(getActivity());
        aVar.e(R.layout.spr_betslip_info_dialog);
        if (this.a == 4200) {
            aVar.b(sn5.d(this, R.string.common_functions__later, new Object[0]), new a());
            aVar.c(sn5.d(this, R.string.common_functions__deposit, new Object[0]), new b());
        } else {
            aVar.c(sn5.d(this, R.string.common_functions__ok, new Object[0]), new c());
        }
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.show();
        this.b = (TextView) bVarCreate.findViewById(R.id.title);
        this.c = (TextView) bVarCreate.findViewById(R.id.content);
        int i = this.a;
        if (i == 4100) {
            this.b.setText(sn5.d(this, R.string.common_feedback__submission_failed, new Object[0]));
            boolean zIsEmpty = TextUtils.isEmpty(this.d);
            TextView textView = this.c;
            if (zIsEmpty) {
                textView.setText(sn5.d(this, R.string.app_common__failed_cash_not_enough, new Object[0]));
                return bVarCreate;
            }
            textView.setText(this.d);
            return bVarCreate;
        }
        if (i == 4200) {
            this.b.setText(sn5.d(this, R.string.common_functions__balance_insufficient, new Object[0]));
            boolean zIsEmpty2 = TextUtils.isEmpty(this.d);
            TextView textView2 = this.c;
            if (zIsEmpty2) {
                textView2.setText(sn5.d(this, R.string.common_feedback__your_account_balance_is_insufficient_tip, new Object[0]));
                return bVarCreate;
            }
            textView2.setText(this.d);
            return bVarCreate;
        }
        TextView textView3 = this.b;
        if (i == 10) {
            textView3.setText(sn5.d(this, R.string.common_feedback__request_pending, new Object[0]));
            boolean zIsEmpty3 = TextUtils.isEmpty(this.d);
            TextView textView4 = this.c;
            if (zIsEmpty3) {
                textView4.setText(sn5.d(this, R.string.jackpot__your_order_has_been_submitted_awaiting_for_confirmation, new Object[0]));
                return bVarCreate;
            }
            textView4.setText(this.d);
            return bVarCreate;
        }
        if (i == -1000) {
            textView3.setText("");
            boolean zIsEmpty4 = TextUtils.isEmpty(this.d);
            TextView textView5 = this.c;
            if (zIsEmpty4) {
                textView5.setText(sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                return bVarCreate;
            }
            textView5.setText(this.d);
            return bVarCreate;
        }
        if (i == 4210) {
            textView3.setText(sn5.d(this, R.string.common_feedback__submission_failed, new Object[0]));
            if (TextUtils.isEmpty(this.d)) {
                this.b.setText(sn5.d(this, R.string.component_betslip__gift_unavailable, new Object[0]));
                return bVarCreate;
            }
            this.c.setText(this.d);
            return bVarCreate;
        }
        textView3.setText(sn5.d(this, R.string.common_feedback__submission_failed, new Object[0]));
        boolean zIsEmpty5 = TextUtils.isEmpty(this.d);
        TextView textView6 = this.c;
        if (zIsEmpty5) {
            textView6.setText(sn5.d(this, R.string.common_feedback__order_did_not_go_through_for_some_reason, new Object[0]));
            return bVarCreate;
        }
        textView6.setText(this.d);
        return bVarCreate;
    }
}
