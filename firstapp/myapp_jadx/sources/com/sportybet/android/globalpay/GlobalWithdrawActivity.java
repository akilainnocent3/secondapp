package com.sportybet.android.globalpay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import defpackage.a3l;
import defpackage.ad;
import defpackage.b3l;
import defpackage.bag;
import defpackage.bb40;
import defpackage.bhj0;
import defpackage.bmy;
import defpackage.c3l;
import defpackage.cw;
import defpackage.cyb;
import defpackage.e3l;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.gym;
import defpackage.h3l;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.ku90;
import defpackage.mpe0;
import defpackage.o3l;
import defpackage.o800;
import defpackage.o8i0;
import defpackage.p3l;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.tj5;
import defpackage.url;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.vr2;
import defpackage.x2l;
import defpackage.y2l;
import defpackage.z2l;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/globalpay/GlobalWithdrawActivity;", "Lszz;", "Lpwx;", "Lcw;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GlobalWithdrawActivity extends url implements pwx, cw, bb40 {
    public static final /* synthetic */ int y = 0;
    public ad d;
    public List<o800> e;
    public final mpe0 f = hwr.b(new z2l(this, 0));
    public final q8i0 i = new q8i0(jq40.a(h3l.class), new b(), new a(), new c());
    public boolean v;
    public a3l w;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return GlobalWithdrawActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return GlobalWithdrawActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return GlobalWithdrawActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final h3l A1() {
        return (h3l) this.i.getValue();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a3l a3lVar = this.w;
        if (a3lVar != null) {
            ad adVar = this.d;
            if (adVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            adVar.y.f(a3lVar);
        }
        this.w = null;
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

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        h3l h3lVarA1 = A1();
        if (((String) this.f.getValue()) != null) {
            return;
        }
        jvd0 jvd0Var = h3lVarA1.B;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        h3lVarA1.B = ej5.c(o8i0.d(h3lVarA1), null, null, new p3l(h3lVarA1, null), 3);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_global_withdraw, (ViewGroup) null, false);
        int i = R.id.back;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
        if (imageButton != null) {
            i = R.id.back_title;
            TextView textView = (TextView) h5e.a(R.id.back_title, viewInflate);
            if (textView != null) {
                i = R.id.coming_soon_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.coming_soon_container, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.coming_soon_content;
                    TextView textView2 = (TextView) h5e.a(R.id.coming_soon_content, viewInflate);
                    if (textView2 != null) {
                        i = R.id.coming_soon_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.coming_soon_icon, viewInflate);
                        if (appCompatImageView != null) {
                            i = R.id.coming_soon_title;
                            TextView textView3 = (TextView) h5e.a(R.id.coming_soon_title, viewInflate);
                            if (textView3 != null) {
                                i = R.id.divider_line;
                                View viewA = h5e.a(R.id.divider_line, viewInflate);
                                if (viewA != null) {
                                    i = R.id.home;
                                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, viewInflate);
                                    if (imageButton2 != null) {
                                        i = R.id.title_bar;
                                        if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                            i = R.id.viewPager;
                                            ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.viewPager, viewInflate);
                                            if (viewPager2 != null) {
                                                i = R.id.withdraw_help_center_btn;
                                                ImageButton imageButton3 = (ImageButton) h5e.a(R.id.withdraw_help_center_btn, viewInflate);
                                                if (imageButton3 != null) {
                                                    i = R.id.withdraw_tab;
                                                    TabLayout tabLayout = (TabLayout) h5e.a(R.id.withdraw_tab, viewInflate);
                                                    if (tabLayout != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                        this.d = new ad(constraintLayout2, imageButton, textView, constraintLayout, textView2, appCompatImageView, textView3, viewA, imageButton2, viewPager2, imageButton3, tabLayout);
                                                        setContentView(constraintLayout2);
                                                        String str = (String) this.f.getValue();
                                                        if (str != null) {
                                                            Intent intent = getIntent();
                                                            Parcelable[] parcelableArrayExtra = intent != null ? intent.getParcelableArrayExtra("KYC_REJECT_REASON_KEY") : null;
                                                            com.sportybet.android.globalpay.kyc.za.a aVar = new com.sportybet.android.globalpay.kyc.za.a();
                                                            aVar.setArguments(vj5.a(new Pair("KYC_STATUS", str), new Pair("REJECT_REASONS", parcelableArrayExtra)));
                                                            aVar.a = new e3l(this);
                                                            aVar.show(getSupportFragmentManager(), UccrWswQGaIj.nuY);
                                                            return;
                                                        }
                                                        ad adVar = this.d;
                                                        if (adVar == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        final TextView textView4 = adVar.c;
                                                        textView4.post(new Runnable() { // from class: g6
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                View view = textView4;
                                                                view.performAccessibilityAction(64, null);
                                                                view.sendAccessibilityEvent(4);
                                                            }
                                                        });
                                                        ad adVar2 = this.d;
                                                        if (adVar2 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        adVar2.b.setOnClickListener(new vr2(this, 1));
                                                        ad adVar3 = this.d;
                                                        if (adVar3 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        adVar3.w.setOnClickListener(new x2l());
                                                        ad adVar4 = this.d;
                                                        if (adVar4 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        adVar4.z.setOnClickListener(new y2l());
                                                        ku90 ku90Var = A1().z;
                                                        s9s.b bVar = s9s.b.a;
                                                        ej5.c(ebs.a(getLifecycle()), null, null, new b3l(this, ku90Var, null, this), 3);
                                                        ej5.c(ebs.a(getLifecycle()), null, null, new c3l(this, A1().v, null, this), 3);
                                                        h3l h3lVarA1 = A1();
                                                        bag bagVarA = tj5.a(getIntent());
                                                        if (h3lVarA1.A) {
                                                            return;
                                                        }
                                                        h3lVarA1.A = true;
                                                        gym.a(h3lVarA1.e, new bhj0(bagVarA, null, 5));
                                                        if (h3lVarA1.b.O()) {
                                                            return;
                                                        }
                                                        ej5.c(o8i0.d(h3lVarA1), null, null, new o3l(2, null), 3);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
