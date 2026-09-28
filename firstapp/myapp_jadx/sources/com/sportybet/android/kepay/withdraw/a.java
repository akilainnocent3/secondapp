package com.sportybet.android.kepay.withdraw;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a8b;
import defpackage.ap0;
import defpackage.bjb0;
import defpackage.bo8;
import defpackage.c8b;
import defpackage.cny;
import defpackage.hlj0;
import defpackage.hu1;
import defpackage.hwr;
import defpackage.psm;
import defpackage.sn5;
import defpackage.su5;
import defpackage.tug;
import defpackage.vox;
import defpackage.zyf0;
import java.math.BigDecimal;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends d implements View.OnClickListener {
    public static final psm B = (psm) hwr.b(new c8b(0)).getValue();
    public C0350a A;
    public TextView a;
    public ProgressButton b;
    public long c;
    public long d;
    public String e;
    public long f;
    public long i;
    public int v = 10;
    public su5<BaseResponse<BankTradeResponse>> w;
    public su5<BaseResponse<BankTradeData>> y;
    public b z;

    /* JADX INFO: renamed from: com.sportybet.android.kepay.withdraw.a$a, reason: collision with other inner class name */
    public class C0350a extends cny {
        @Override // defpackage.cny
        public final void b() {
        }
    }

    public interface b {
        void a1(int i, String str);

        void m0(String str);
    }

    public final void j0(int i, String str) {
        e activity = getActivity();
        if (activity == null || activity.isFinishing() || isDetached()) {
            return;
        }
        this.b.setLoading(false);
        this.a.setEnabled(true);
        C0350a c0350a = this.A;
        if (c0350a != null) {
            c0350a.f(false);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        b bVar = this.z;
        if (bVar != null) {
            bVar.a1(i, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.z = (b) context;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e activity;
        int id = view.getId();
        if (id == R.id.cancel) {
            getDialog().dismiss();
            return;
        }
        if (id != R.id.confirm || (activity = getActivity()) == null || activity.isFinishing() || isDetached()) {
            return;
        }
        if (!vox.d(activity)) {
            zyf0.c(1, sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
            return;
        }
        this.b.setLoading(true);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        this.a.setEnabled(false);
        C0350a c0350a = this.A;
        if (c0350a != null) {
            c0350a.f(true);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("phoneNo", a8b.b().substring(1).concat(this.e.substring(1)));
            jSONObject.put("payAmount", new BigDecimal(this.c));
            jSONObject.put("feeAmount", new BigDecimal(this.f));
            jSONObject.put("taxAmount", new BigDecimal(this.i));
            jSONObject.put("payChId", this.v);
            jSONObject.put("isConfirmAudit", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        su5<BaseResponse<BankTradeResponse>> su5Var = this.w;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<BankTradeResponse>> su5VarN0 = ap0.g().n0(jSONObject.toString());
        this.w = su5VarN0;
        su5VarN0.G(new hlj0(this));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = getArguments().getLong("withdraw_amount");
            this.d = getArguments().getLong("remain_amount");
            this.e = getArguments().getString("phone_number");
            this.f = getArguments().getLong("additional_fee");
            this.i = getArguments().getLong("tax_amount");
            this.v = getArguments().getInt("payChId");
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        bo8 bo8Var = new bo8(requireContext(), R.style.BottomDialog);
        bo8Var.requestWindowFeature(1);
        bo8Var.setContentView(R.layout.fragment_transaction_confirm);
        bo8Var.setCanceledOnTouchOutside(true);
        Window window = bo8Var.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(R.style.AnimBottom);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        this.a = (TextView) bo8Var.findViewById(R.id.cancel);
        this.b = (ProgressButton) bo8Var.findViewById(R.id.confirm);
        TextView textView = (TextView) bo8Var.findViewById(R.id.withdraw_amount_text);
        TextView textView2 = (TextView) bo8Var.findViewById(R.id.withdraw_amount);
        long j = this.c;
        Locale locale = Locale.US;
        textView2.setText(bjb0.U(j, locale));
        ((TextView) bo8Var.findViewById(R.id.remain_amount)).setText(bjb0.U(this.d, locale));
        String strA = tug.a("(", B.B(), ")");
        hu1.b(sn5.d(this, R.string.page_withdraw__withdrawal_tax, new Object[0]), " ", strA, (TextView) bo8Var.findViewById(R.id.tax));
        hu1.b(sn5.d(this, R.string.page_withdraw__withdrawal_fee, new Object[0]), " ", strA, (TextView) bo8Var.findViewById(R.id.fees));
        ((TextView) bo8Var.findViewById(R.id.fees_count)).setText(bjb0.U(this.f, locale));
        ((TextView) bo8Var.findViewById(R.id.tax_count)).setText(bjb0.U(this.i, locale));
        ((LinearLayout) bo8Var.findViewById(R.id.fee_layout)).setVisibility(this.f == 0 ? 8 : 0);
        ((LinearLayout) bo8Var.findViewById(R.id.tax_layout)).setVisibility(this.i != 0 ? 0 : 8);
        this.a.setOnClickListener(this);
        this.b.setLoading(false);
        this.b.setOnClickListener(this);
        textView.setText(sn5.d(this, R.string.page_withdraw__amount_label, sn5.d(this, R.string.app_common__kes, new Object[0])));
        C0350a c0350a = new C0350a(false);
        this.A = c0350a;
        bo8Var.c.a(bo8Var, c0350a);
        return bo8Var;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.z = null;
    }
}
