package com.sportybet.android.account.mfa;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common_ui.widgets.CountdownButton;
import com.sporty.android.common_ui.widgets.SmsInputView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.sportypin.e;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import defpackage.au7;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.h5e;
import defpackage.hb5;
import defpackage.hyh0;
import defpackage.ibs;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.lop;
import defpackage.nsm;
import defpackage.ocu;
import defpackage.pd7;
import defpackage.psm;
import defpackage.q6h;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rvi;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sd7;
import defpackage.sn5;
import defpackage.snb0;
import defpackage.tyi;
import defpackage.u6h;
import defpackage.ud;
import defpackage.v6m;
import defpackage.v8i0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/account/mfa/Verify2FAFragment;", "Lm12;", "Landroid/view/View$OnClickListener;", "Lcom/sporty/android/common_ui/widgets/SmsInputView$c;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Verify2FAFragment extends v6m implements View.OnClickListener, SmsInputView.c {
    public tyi B;
    public ocu C;
    public final q8i0 D = new q8i0(jq40.a(au7.class), new a(), new c(), new b());
    public psm E;
    public d0n F;
    public nsm G;
    public ee<u6h> H;

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return Verify2FAFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return Verify2FAFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return Verify2FAFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void O(CharSequence charSequence) {
        charSequence.getClass();
        p0(charSequence.toString());
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void W0() {
        tyi tyiVar = this.B;
        if (tyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (tyiVar.v.getCurrentNumber().length() == 6) {
            tyi tyiVar2 = this.B;
            if (tyiVar2 != null) {
                p0(tyiVar2.v.getCurrentNumber().toString());
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void b0(CharSequence charSequence) {
        charSequence.getClass();
    }

    public final void n0() {
        psm psmVar = this.E;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        if (psmVar.r()) {
            NavHostFragment.a.a(this).k();
        } else {
            requireActivity().getSupportFragmentManager().a0();
        }
    }

    public final void o0(String str, String str2, String str3, e.a aVar) {
        tyi tyiVar = this.B;
        if (tyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        tyiVar.e.setVisibility(8);
        androidx.fragment.app.e eVarA = rvi.a(this);
        FragmentManager supportFragmentManager = eVarA != null ? eVarA.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
            }
            e eVar = new e();
            eVar.a = str;
            eVar.b = str2;
            eVar.c = str3;
            eVar.d = aVar;
            eVar.show(supportFragmentManager, "alertDialog");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.back) {
            lop.a(view);
            n0();
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != R.id.countdown) {
            if (numValueOf != null && numValueOf.intValue() == R.id.customer_service) {
                n0();
                if (getContext() != null) {
                    d0n d0nVar = this.F;
                    if (d0nVar == null) {
                        Intrinsics.n("utils");
                        throw null;
                    }
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    d0nVar.b(contextRequireContext, snb0.TWO_FA);
                    return;
                }
                return;
            }
            return;
        }
        nsm nsmVar = this.G;
        if (nsmVar == null) {
            Intrinsics.n("connectivityMonitor");
            throw null;
        }
        if (!nsmVar.isConnected()) {
            o0(null, null, null, null);
            return;
        }
        ((au7) this.D.getValue()).x1(j6c.TWO_FA_LOGIN);
        tyi tyiVar = this.B;
        if (tyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        tyiVar.i.b();
        ocu ocuVar = this.C;
        if (ocuVar != null) {
            ocu.z1(ocuVar, ocuVar.I, null, 10);
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_verify_2fa, (ViewGroup) null, false);
        int i = R.id.back;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
        if (imageButton != null) {
            i = R.id.customer_service;
            TextView textView = (TextView) h5e.a(R.id.customer_service, viewInflate);
            if (textView != null) {
                i = R.id.divider;
                View viewA = h5e.a(R.id.divider, viewInflate);
                if (viewA != null) {
                    i = R.id.dnd_tint;
                    if (((TextView) h5e.a(R.id.dnd_tint, viewInflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.progress_bar;
                        ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progress_bar, viewInflate);
                        if (progressBar != null) {
                            i = R.id.remaining_count;
                            TextView textView2 = (TextView) h5e.a(R.id.remaining_count, viewInflate);
                            if (textView2 != null) {
                                i = R.id.resend;
                                CountdownButton countdownButton = (CountdownButton) h5e.a(R.id.resend, viewInflate);
                                if (countdownButton != null) {
                                    i = R.id.title;
                                    if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                        i = R.id.title2;
                                        if (((TextView) h5e.a(R.id.title2, viewInflate)) != null) {
                                            i = R.id.two_fa_code;
                                            SmsInputView smsInputView = (SmsInputView) h5e.a(R.id.two_fa_code, viewInflate);
                                            if (smsInputView != null) {
                                                this.B = new tyi(constraintLayout, imageButton, textView, viewA, progressBar, textView2, countdownButton, smsInputView);
                                                constraintLayout.getClass();
                                                return constraintLayout;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ocu ocuVar = this.C;
        if (ocuVar == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        ocuVar.a.a();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(ocu.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.C = (ocu) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        tyi tyiVar = this.B;
        if (tyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        tyiVar.i.a(60);
        tyi tyiVar2 = this.B;
        if (tyiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        tyiVar2.i.setOnClickListener(this);
        tyi tyiVar3 = this.B;
        if (tyiVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        tyiVar3.b.setOnClickListener(this);
        tyi tyiVar4 = this.B;
        if (tyiVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        tyiVar4.v.setInputListener(this);
        psm psmVar = this.E;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        if (psmVar.r()) {
            tyi tyiVar5 = this.B;
            if (tyiVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            tyiVar5.v.setCustomInputType(1);
        }
        tyi tyiVar6 = this.B;
        if (tyiVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        tyiVar6.c.setOnClickListener(this);
        tyi tyiVar7 = this.B;
        if (tyiVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        lop.c(tyiVar7.v);
        s9s.b bVar = s9s.b.a;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new hyh0(this, null, this), 3);
        ee<u6h> eeVarRegisterForActivityResult = registerForActivityResult(new q6h(), new ud() { // from class: yxh0
            @Override // defpackage.ud
            public final void a(Object obj) {
                FacialRecognitionResult facialRecognitionResult = (FacialRecognitionResult) obj;
                if (facialRecognitionResult != null) {
                    ocu ocuVar = this.a.C;
                    if (ocuVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    FacialRecognitionResult.b bVar2 = facialRecognitionResult.a;
                    bVar2.getClass();
                    int iOrdinal = bVar2.ordinal();
                    if (iOrdinal == 0) {
                        ej5.c(o8i0.d(ocuVar), null, null, new scu(ocuVar, null), 3);
                    } else if (iOrdinal != 2) {
                        ej5.c(o8i0.d(ocuVar), null, null, new ucu(ocuVar, null), 3);
                    } else {
                        ej5.c(o8i0.d(ocuVar), null, null, new tcu(ocuVar, null), 3);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.H = eeVarRegisterForActivityResult;
        q0();
    }

    public final void p0(String str) {
        nsm nsmVar = this.G;
        if (nsmVar == null) {
            Intrinsics.n("connectivityMonitor");
            throw null;
        }
        if (!nsmVar.isConnected()) {
            o0(null, null, null, null);
            return;
        }
        if (isAdded()) {
            tyi tyiVar = this.B;
            if (tyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            tyiVar.e.setVisibility(0);
            ocu ocuVar = this.C;
            if (ocuVar == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            str.getClass();
            ocuVar.a.b(ocuVar.I, ocuVar.G, str, new pd7(ocuVar, 1));
        }
    }

    public final void q0() {
        String strD;
        tyi tyiVar = this.B;
        if (tyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = tyiVar.f;
        ocu ocuVar = this.C;
        if (ocuVar == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        int i = ocuVar.K;
        if (i > 0) {
            String strValueOf = String.valueOf(i);
            ocu ocuVar2 = this.C;
            if (ocuVar2 == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            strD = sn5.d(this, R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one, strValueOf, ocuVar2.K > 1 ? sn5.d(this, R.string.common_otp_verify__l_times, new Object[0]) : sn5.d(this, R.string.common_otp_verify__l_time, new Object[0]));
        } else {
            strD = sn5.d(this, R.string.no_remaining_count, new Object[0]);
        }
        textView.setText(strD);
    }
}
