package com.sportybet.android.globalpay.mobileMoney;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.sportybet.android.globalpay.mobileMoney.CmMobileMoneyDepositActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.cyb;
import defpackage.gu7;
import defpackage.h5e;
import defpackage.jq40;
import defpackage.k00;
import defpackage.nc;
import defpackage.nol;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rnd;
import defpackage.v8i0;
import defpackage.wr2;
import defpackage.yr2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/globalpay/mobileMoney/CmMobileMoneyDepositActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CmMobileMoneyDepositActivity extends nol implements bb40 {
    public static final /* synthetic */ int f = 0;
    public nc b;
    public final q8i0 c = new q8i0(jq40.a(gu7.class), new b(), new a(), new c());
    public bnh0 d;
    public azm e;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return CmMobileMoneyDepositActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CmMobileMoneyDepositActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CmMobileMoneyDepositActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_cm_mobile_money_deposit, (ViewGroup) null, false);
        int i = R.id.back;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
        if (imageButton != null) {
            i = R.id.back_title;
            if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                i = R.id.deposit_help_center_btn;
                ImageButton imageButton2 = (ImageButton) h5e.a(R.id.deposit_help_center_btn, viewInflate);
                if (imageButton2 != null) {
                    i = R.id.fragment_container;
                    if (((FragmentContainerView) h5e.a(R.id.fragment_container, viewInflate)) != null) {
                        i = R.id.home;
                        ImageButton imageButton3 = (ImageButton) h5e.a(R.id.home, viewInflate);
                        if (imageButton3 != null) {
                            i = R.id.title_bar;
                            if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.b = new nc(constraintLayout, imageButton, imageButton2, imageButton3);
                                setContentView(constraintLayout);
                                gu7 gu7Var = (gu7) this.c.getValue();
                                gu7Var.a.a(new rnd(gu7Var.c, null, null, 13), k00.d);
                                gu7Var.b.b();
                                nc ncVar = this.b;
                                if (ncVar == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                int i2 = 1;
                                ncVar.b.setOnClickListener(new wr2(this, i2));
                                ncVar.d.setOnClickListener(new View.OnClickListener() { // from class: eu7
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i3 = CmMobileMoneyDepositActivity.f;
                                        azm azmVar = this.a.e;
                                        if (azmVar != null) {
                                            azmVar.d(wae.HOME);
                                        } else {
                                            Intrinsics.n("router");
                                            throw null;
                                        }
                                    }
                                });
                                ncVar.c.setOnClickListener(new yr2(this, i2));
                                return;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
    }
}
