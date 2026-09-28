package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "Please using `MutableStateFlow<CommonUiEvent>.showAlertDialog()` and `CommonUiEventProcessor` to instead this custom dialog fragment.")
public class e9h extends r02 {
    public int a;
    public String b;
    public TextView c;
    public TextView d;

    public static e9h j0(int i, String str) {
        e9h e9hVar = new e9h();
        Bundle bundle = new Bundle();
        bundle.putInt("param1", i);
        bundle.putString("param2", str);
        e9hVar.setArguments(bundle);
        return e9hVar;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.a = getArguments().getInt("param1");
            this.b = getArguments().getString("param2");
        }
        setCancelable(false);
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        b.a aVar = new b.a(getActivity());
        aVar.e(R.layout.spr_betslip_info_dialog);
        aVar.c(sn5.d(this, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: d9h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                e9h e9hVar = this.a;
                if (e9hVar.a == 10 && (e9hVar.getActivity() instanceof BetslipActivity)) {
                    e9hVar.getActivity().finish();
                }
                dialogInterface.dismiss();
            }
        });
        aVar.a.k = false;
        b bVarCreate = aVar.create();
        Button buttonF = bVarCreate.f(-2);
        if (buttonF != null) {
            buttonF.setTextAppearance(bVarCreate.getContext(), R.style.CustomTabAppearance);
        }
        Button buttonF2 = bVarCreate.f(-1);
        if (buttonF2 != null) {
            buttonF2.setTextAppearance(bVarCreate.getContext(), R.style.CustomTabAppearance);
        }
        e activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && !bVarCreate.isShowing()) {
            bVarCreate.show();
        }
        this.c = (TextView) bVarCreate.findViewById(R.id.title);
        TextView textView = (TextView) bVarCreate.findViewById(R.id.content);
        this.d = textView;
        TextView textView2 = this.c;
        if (textView2 != null && textView != null) {
            int i = this.a;
            if (i == 4100) {
                textView2.setText(sn5.d(this, R.string.common_feedback__submission_failed, new Object[0]));
                this.d.setText(!TextUtils.isEmpty(this.b) ? this.b : sn5.d(this, R.string.app_common__failed_cash_not_enough, new Object[0]));
                return bVarCreate;
            }
            if (i != 4300 && i != 4400 && i != 4220) {
                if (i == 10) {
                    textView2.setText(sn5.d(this, R.string.common_feedback__request_pending, new Object[0]));
                    this.d.setText(sn5.d(this, R.string.common_feedback__your_order_has_been_submitted_awaiting_for_confirmation, new Object[0]));
                    return bVarCreate;
                }
                if (i == -1000) {
                    textView2.setText("");
                    this.d.setText(sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                    return bVarCreate;
                }
                if (i == -1001) {
                    textView2.setText(sn5.d(this, R.string.component_betslip__what_is_a_banker, new Object[0]));
                    this.d.setText(sn5.d(this, R.string.component_betslip__banker_is_a_selection_tip, new Object[0]));
                    return bVarCreate;
                }
                if (i == -1002) {
                    textView2.setText(sn5.d(this, R.string.common_functions__note, new Object[0]));
                    this.d.setText(sn5.d(this, R.string.component_betslip__there_cannot_be_over_15_selections_tip, new Object[0]));
                    return bVarCreate;
                }
                if (i == 4210) {
                    textView2.setText(sn5.d(this, R.string.component_betslip__gift_unavailable, new Object[0]));
                    this.d.setText(!TextUtils.isEmpty(this.b) ? this.b : sn5.d(this, R.string.component_betslip__gift_unavailable_tip, new Object[0]));
                    return bVarCreate;
                }
                if (i == -1003) {
                    bVarCreate.findViewById(R.id.word_FD).setVisibility(0);
                    this.c.setText(sn5.d(this, R.string.component_betslip__what_is_this, new Object[0]));
                    this.d.setText(sn5.d(this, R.string.component_betslip__ticket_wins_if_a_certain_number_selections_tip, new Object[0]));
                    return bVarCreate;
                }
                if (i == 42001) {
                    textView2.setText(sn5.d(this, R.string.component_betslip__insufficient_sportycoins, new Object[0]));
                    this.d.setText(sn5.d(this, R.string.component_betslip__coins_insufficient_content, new Object[0]));
                    return bVarCreate;
                }
                textView2.setText(sn5.d(this, R.string.common_feedback__submission_failed, new Object[0]));
                this.d.setText(!TextUtils.isEmpty(this.b) ? this.b : sn5.d(this, R.string.common_feedback__order_did_not_go_through_for_some_reason, new Object[0]));
                return bVarCreate;
            }
            textView2.setText(sn5.d(this, R.string.common_feedback__submission_failed, new Object[0]));
            this.d.setText(!TextUtils.isEmpty(this.b) ? this.b : sn5.d(this, R.string.common_feedback__order_did_not_go_through_for_some_reason, new Object[0]));
        }
        return bVarCreate;
    }
}
