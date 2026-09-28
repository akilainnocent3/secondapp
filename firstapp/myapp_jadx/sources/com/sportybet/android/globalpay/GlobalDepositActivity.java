package com.sportybet.android.globalpay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulActivity;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.a1l;
import defpackage.bag;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.e1l;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.f1i;
import defpackage.f1l;
import defpackage.g1l;
import defpackage.gym;
import defpackage.h5e;
import defpackage.i0l;
import defpackage.i2k0;
import defpackage.j0l;
import defpackage.jq40;
import defpackage.js40;
import defpackage.k00;
import defpackage.ku90;
import defpackage.lnd;
import defpackage.o0l;
import defpackage.o800;
import defpackage.o8i0;
import defpackage.p0l;
import defpackage.q0l;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r0l;
import defpackage.r8i0;
import defpackage.rnd;
import defpackage.s0l;
import defpackage.s9s;
import defpackage.srl;
import defpackage.tj5;
import defpackage.v0l;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.wwd0;
import defpackage.zc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/globalpay/GlobalDepositActivity;", "Lszz;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GlobalDepositActivity extends srl implements bb40 {
    public static final /* synthetic */ int w = 0;
    public zc d;
    public List<o800> e;
    public final q8i0 f = new q8i0(jq40.a(a1l.class), new b(), new a(), new c());
    public boolean i;
    public o0l v;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return GlobalDepositActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return GlobalDepositActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return GlobalDepositActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final a1l A1() {
        return (a1l) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01df  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        Bundle extras;
        String string;
        boolean z2;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_global_deposit, (ViewGroup) null, false);
        int i = R.id.back;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
        if (imageButton != null) {
            i = R.id.back_title;
            if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                i = R.id.coming_soon_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.coming_soon_container, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.coming_soon_content;
                    if (((TextView) h5e.a(R.id.coming_soon_content, viewInflate)) != null) {
                        i = R.id.coming_soon_icon;
                        if (((AppCompatImageView) h5e.a(R.id.coming_soon_icon, viewInflate)) != null) {
                            i = R.id.coming_soon_title;
                            if (((TextView) h5e.a(R.id.coming_soon_title, viewInflate)) != null) {
                                i = R.id.deposit_help_center_btn;
                                ImageButton imageButton2 = (ImageButton) h5e.a(R.id.deposit_help_center_btn, viewInflate);
                                if (imageButton2 != null) {
                                    i = R.id.deposit_tab_all;
                                    TextView textView = (TextView) h5e.a(R.id.deposit_tab_all, viewInflate);
                                    if (textView != null) {
                                        i = R.id.deposit_tabs;
                                        TabLayout tabLayout = (TabLayout) h5e.a(R.id.deposit_tabs, viewInflate);
                                        if (tabLayout != null) {
                                            i = R.id.divider;
                                            View viewA = h5e.a(R.id.divider, viewInflate);
                                            if (viewA != null) {
                                                i = R.id.home;
                                                ImageButton imageButton3 = (ImageButton) h5e.a(R.id.home, viewInflate);
                                                if (imageButton3 != null) {
                                                    i = R.id.title_bar;
                                                    if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                                        i = R.id.viewPager;
                                                        ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.viewPager, viewInflate);
                                                        if (viewPager2 != null) {
                                                            i = R.id.world_cup_pass_hint;
                                                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.world_cup_pass_hint, viewInflate);
                                                            if (linearLayout != null) {
                                                                i = R.id.world_cup_pass_hint_text;
                                                                TextView textView2 = (TextView) h5e.a(R.id.world_cup_pass_hint_text, viewInflate);
                                                                if (textView2 != null) {
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                    this.d = new zc(constraintLayout2, imageButton, constraintLayout, imageButton2, textView, tabLayout, viewA, imageButton3, viewPager2, linearLayout, textView2);
                                                                    setContentView(constraintLayout2);
                                                                    Intent intent = getIntent();
                                                                    if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("KYC_STATUS_KEY")) == null) {
                                                                        z = true;
                                                                    } else {
                                                                        com.sportybet.android.globalpay.kyc.za.b.a.getClass();
                                                                        if (com.sportybet.android.globalpay.kyc.za.b.a.a(string) == com.sportybet.android.globalpay.kyc.za.b.i) {
                                                                            z2 = false;
                                                                        } else {
                                                                            Intent intent2 = getIntent();
                                                                            Parcelable[] parcelableArrayExtra = intent2 != null ? intent2.getParcelableArrayExtra("KYC_REJECT_REASON_KEY") : null;
                                                                            com.sportybet.android.globalpay.kyc.za.a aVar = new com.sportybet.android.globalpay.kyc.za.a();
                                                                            aVar.setArguments(vj5.a(new Pair("KYC_STATUS", string), new Pair("REJECT_REASONS", parcelableArrayExtra)));
                                                                            aVar.a = new v0l(this);
                                                                            aVar.show(getSupportFragmentManager(), "ZAKycReminderDialog");
                                                                            z2 = true;
                                                                        }
                                                                        z = !z2;
                                                                    }
                                                                    if (z) {
                                                                        zc zcVar = this.d;
                                                                        if (zcVar == null) {
                                                                            Intrinsics.n("binding");
                                                                            throw null;
                                                                        }
                                                                        zcVar.b.setOnClickListener(new View.OnClickListener() { // from class: h0l
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i2 = GlobalDepositActivity.w;
                                                                                this.a.finish();
                                                                            }
                                                                        });
                                                                        zcVar.v.setOnClickListener(new i0l());
                                                                        zcVar.d.setOnClickListener(new j0l());
                                                                        ku90 ku90Var = A1().G;
                                                                        s9s.b bVar = s9s.b.a;
                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new p0l(this, ku90Var, null, this), 3);
                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new q0l(this, new f1i(A1().C), null, this), 3);
                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new r0l(this, A1().A, null, this), 3);
                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new s0l(this, new f1i(A1().E), null, this), 3);
                                                                        a1l a1lVarA1 = A1();
                                                                        bag bagVarA = tj5.a(getIntent());
                                                                        if (!a1lVarA1.H) {
                                                                            a1lVarA1.H = true;
                                                                            if (a1lVarA1.i.O()) {
                                                                                wwd0 wwd0Var = a1lVarA1.D;
                                                                                i2k0.a aVar2 = a1lVarA1.y.a;
                                                                                if (aVar2 == null) {
                                                                                    str = null;
                                                                                } else {
                                                                                    str = aVar2.b;
                                                                                    long jCurrentTimeMillis = System.currentTimeMillis() - aVar2.a;
                                                                                    if (0 > jCurrentTimeMillis || jCurrentTimeMillis > 900000) {
                                                                                        str = null;
                                                                                    }
                                                                                }
                                                                                if (str == null || StringsKt.U(str)) {
                                                                                    str = null;
                                                                                }
                                                                                wwd0Var.setValue(str);
                                                                            }
                                                                            gym.a(a1lVarA1.e, new rnd(bagVarA, null, null, 13));
                                                                            if (!a1lVarA1.i.O()) {
                                                                                ej5.c(o8i0.d(a1lVarA1), null, null, new e1l(2, null), 3);
                                                                            }
                                                                            ej5.c(o8i0.d(a1lVarA1), null, null, new f1l(a1lVarA1, null), 3);
                                                                            ej5.c(o8i0.d(a1lVarA1), null, null, new g1l(a1lVarA1, null), 3);
                                                                        }
                                                                    }
                                                                    Bundle extras2 = getIntent().getExtras();
                                                                    if (extras2 == null || !extras2.getBoolean("show_registration_successful_dialog", false)) {
                                                                        return;
                                                                    }
                                                                    RegistrationSuccessfulActivity.a aVar3 = RegistrationSuccessfulActivity.d;
                                                                    js40 js40Var = js40.CURRENT;
                                                                    aVar3.getClass();
                                                                    RegistrationSuccessfulActivity.a.a(this, js40Var, false, false);
                                                                    return;
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
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o0l o0lVar = this.v;
        if (o0lVar != null) {
            zc zcVar = this.d;
            if (zcVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zcVar.w.f(o0lVar);
        }
        this.v = null;
        A1().f.c.a = 0L;
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

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        a1l a1lVarA1 = A1();
        if (a1lVarA1.w.a()) {
            a1lVarA1.v.a(new lnd(a1lVarA1.I), k00.d);
        }
        super.onStop();
    }
}
