package com.sportybet.android.sportypin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import defpackage.gr0;
import defpackage.gym;
import defpackage.iwh0;
import defpackage.iym;
import defpackage.psm;
import defpackage.q1m;
import defpackage.vm80;

/* JADX INFO: loaded from: classes6.dex */
public class g extends q1m implements View.OnClickListener {
    public View B;
    public TextView C;
    public TextView D;
    public ProgressButton E;
    public int F;
    public int G;
    public String H;
    public boolean I;
    public psm J;
    public iym K;
    public a L;

    public interface a {
        void K(int i);

        void Y(int i, String str);
    }

    public g() {
        this.z = false;
        this.A = false;
        this.F = 62;
    }

    public final int n0(int i) {
        Context context = getContext();
        if (context == null) {
            return 0;
        }
        return context.getColor(i);
    }

    public final void o0(int i) {
        if (i == 61) {
            this.C.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(this.B.getContext(), R.drawable.ic_check_circle_green_24dp, n0(R.color.brand_secondary)), (Drawable) null, iwh0.a(this.B.getContext(), R.drawable.withdraw_every_withdraw, n0(R.color.text_type1_secondary)), (Drawable) null);
            this.D.setCompoundDrawablesWithIntrinsicBounds(gr0.a(requireActivity(), R.drawable.shape_circle_24dp), (Drawable) null, iwh0.a(this.B.getContext(), R.drawable.ic_payment_account, n0(R.color.text_type1_secondary)), (Drawable) null);
            this.E.setEnabled(true);
            return;
        }
        TextView textView = this.C;
        if (i != 62) {
            textView.setCompoundDrawablesWithIntrinsicBounds(gr0.a(requireActivity(), R.drawable.shape_circle_24dp), (Drawable) null, iwh0.a(this.B.getContext(), R.drawable.withdraw_every_withdraw, n0(R.color.text_type1_secondary)), (Drawable) null);
            this.D.setCompoundDrawablesWithIntrinsicBounds(gr0.a(requireActivity(), R.drawable.shape_circle_24dp), (Drawable) null, iwh0.a(this.B.getContext(), R.drawable.ic_payment_account, n0(R.color.text_type1_secondary)), (Drawable) null);
            this.E.setEnabled(false);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(gr0.a(requireActivity(), R.drawable.shape_circle_24dp), (Drawable) null, iwh0.a(this.B.getContext(), R.drawable.withdraw_every_withdraw, n0(R.color.text_type1_secondary)), (Drawable) null);
            this.D.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(this.B.getContext(), R.drawable.ic_check_circle_green_24dp, n0(R.color.brand_secondary)), (Drawable) null, iwh0.a(this.B.getContext(), R.drawable.ic_payment_account, n0(R.color.text_type1_secondary)), (Drawable) null);
            this.E.setEnabled(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q1m, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.L = (a) context;
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.every_withdraw) {
            this.F = 61;
            o0(61);
            return;
        }
        if (id == R.id.new_withdraw_account) {
            this.F = 62;
            o0(62);
            return;
        }
        if (id == R.id.btn_continue) {
            int i = this.G;
            if (i == 40) {
                this.L.K(this.F);
                int i2 = this.F;
                if (i2 == 62) {
                    gym.a(this.K, new vm80(vm80.a.a));
                } else if (i2 == 61) {
                    gym.a(this.K, new vm80(vm80.a.b));
                }
            } else if (i == 50) {
                this.L.Y(this.F, this.H);
            }
            getActivity().getFragmentManager().popBackStack();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.B == null) {
            View viewInflate = layoutInflater.inflate(R.layout.fragment_require_pin, viewGroup, false);
            this.B = viewInflate;
            TextView textView = (TextView) viewInflate.findViewById(R.id.every_withdraw);
            this.C = textView;
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) this.B.findViewById(R.id.new_withdraw_account);
            this.D = textView2;
            textView2.setOnClickListener(this);
            ProgressButton progressButton = (ProgressButton) this.B.findViewById(R.id.btn_continue);
            this.E = progressButton;
            progressButton.setOnClickListener(this);
            TextView textView3 = (TextView) this.B.findViewById(R.id.every_deposit);
            if (this.J.getCountryCode().equals(CountryCodeName.SOUTH_AFRICA)) {
                textView3.setVisibility(8);
            } else {
                textView3.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(this.B.getContext(), R.drawable.ic_check_circle_green_24dp, n0(R.color.text_type1_secondary)), (Drawable) null, iwh0.a(this.B.getContext(), R.drawable.ic_deposit_icon, n0(R.color.text_type1_secondary)), (Drawable) null);
            }
            if (getArguments() != null) {
                this.G = getArguments().getInt("Status");
                this.I = getArguments().getBoolean("isUseOtpReset", false);
                if (this.J.x()) {
                    this.F = getArguments().getInt("option", 61);
                } else if (this.J.n()) {
                    this.F = getArguments().getInt("option", 62);
                }
                int i = this.G;
                if (i == 40) {
                    boolean z = this.I;
                    ProgressButton progressButton2 = this.E;
                    if (z) {
                        progressButton2.setButtonText(R.string.common_functions__update);
                    } else {
                        progressButton2.setButtonText(R.string.common_functions__confirm);
                    }
                } else if (i == 50) {
                    this.H = getArguments().getString("token");
                    this.E.setButtonText(R.string.common_functions__update);
                }
            }
            o0(this.F);
        }
        return this.B;
    }
}
