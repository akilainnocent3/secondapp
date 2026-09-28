package com.sportybet.android.ugpay.deposit;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.ugpay.deposit.CommonDepositActivity;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.c0e;
import defpackage.cyb;
import defpackage.ej5;
import defpackage.h5e;
import defpackage.haj;
import defpackage.jq40;
import defpackage.k00;
import defpackage.lfy;
import defpackage.lop;
import defpackage.lsm;
import defpackage.mc8;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.paj;
import defpackage.pc;
import defpackage.pc8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rnd;
import defpackage.sh8;
import defpackage.sx90;
import defpackage.tj5;
import defpackage.v8i0;
import defpackage.vol;
import defpackage.wae;
import defpackage.wc8;
import defpackage.xym;
import defpackage.yc8;
import defpackage.zc8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/ugpay/deposit/CommonDepositActivity;", "Lyz1;", "Lbb40;", "Lxym;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CommonDepositActivity extends vol implements bb40, xym {
    public static final /* synthetic */ int D = 0;
    public long A;
    public rdd0 e;
    public c0e f;
    public pc i;
    public String w;
    public String y;
    public long z;
    public final q8i0 v = new q8i0(jq40.a(zc8.class), new d(), new c(), new e());
    public final a B = new a();
    public final mc8 C = new View.OnClickListener() { // from class: mc8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = CommonDepositActivity.D;
            view.getClass();
            int id = view.getId();
            if (id == R.id.back) {
                this.a.B1();
                return;
            }
            if (id == R.id.deposit_help_center_btn) {
                sh8.c().e(bjb0.S(WebViewActivityUtils.URL_HOW_TO_PLAY_DEPOSIT));
            } else if (id == R.id.home) {
                sh8.c().e(o7d.a(wae.HOME));
            }
        }
    };

    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
            gVar.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            wc8 wc8Var;
            gVar.getClass();
            int i = CommonDepositActivity.D;
            CommonDepositActivity commonDepositActivity = CommonDepositActivity.this;
            List list = (List) commonDepositActivity.C1().z.d();
            if (list == null || (wc8Var = (wc8) CollectionsKt.V(gVar.e, list)) == null) {
                return;
            }
            commonDepositActivity.C1().z1(wc8Var);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
            gVar.getClass();
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return CommonDepositActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CommonDepositActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CommonDepositActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.yz1
    public final void A1(boolean z) {
        pc pcVar = this.i;
        if (pcVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        pcVar.f.a();
        pc pcVar2 = this.i;
        if (z) {
            if (pcVar2 != null) {
                pcVar2.i.setVisibility(0);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        if (pcVar2 != null) {
            pcVar2.i.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void B1() {
        if (tj5.c(this)) {
            sh8.c().e(o7d.a(wae.ME));
        }
        pc pcVar = this.i;
        if (pcVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = pcVar.a;
        constraintLayout.getClass();
        lop.b(constraintLayout, Boolean.FALSE);
        finish();
    }

    public final zc8 C1() {
        return (zc8) this.v.getValue();
    }

    @Override // defpackage.fth
    public final void N() {
        if (this.a == 300) {
            A1(true);
            getConfirmNameStatus(new lsm() { // from class: rc8
                @Override // defpackage.lsm
                public final void a(Object obj) {
                    NameConfirmationStatus nameConfirmationStatus = (NameConfirmationStatus) obj;
                    int i = CommonDepositActivity.D;
                    nameConfirmationStatus.getClass();
                    CommonDepositActivity commonDepositActivity = this.a;
                    commonDepositActivity.A1(false);
                    int i2 = nameConfirmationStatus.status;
                    commonDepositActivity.a = i2;
                    if (i2 == 5000) {
                        pc pcVar = commonDepositActivity.i;
                        if (pcVar == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        pcVar.i.setVisibility(8);
                        pc pcVar2 = commonDepositActivity.i;
                        if (pcVar2 != null) {
                            pcVar2.f.c(commonDepositActivity.getCMSString(R.string.common_feedback__something_went_wrong_please_try_again, new Object[0]));
                            return;
                        } else {
                            Intrinsics.n("binding");
                            throw null;
                        }
                    }
                    if (i2 != 330) {
                        String lastAccessToken = commonDepositActivity.getAccountHelper().getLastAccessToken();
                        if (TextUtils.isEmpty(lastAccessToken)) {
                            commonDepositActivity.onRegistrationKYCResult(false);
                            return;
                        } else {
                            commonDepositActivity.showRegistrationKYCPageWithAccessToken(lastAccessToken);
                            return;
                        }
                    }
                    if (commonDepositActivity.isFinishing() || commonDepositActivity.b) {
                        return;
                    }
                    commonDepositActivity.b = true;
                    FragmentManager supportFragmentManager = commonDepositActivity.getSupportFragmentManager();
                    psm countryManager = commonDepositActivity.getCountryManager();
                    sc8 sc8Var = new sc8(commonDepositActivity);
                    int i3 = countryManager.n() ? R.string.page_payment__you_deposit_request_has_been_submitted_tip__wait_for_bank__NG : R.string.page_payment__you_deposit_request_has_been_submitted_tip;
                    vke vkeVar = new vke(sc8Var);
                    if (((s8n) supportFragmentManager.H("bvn_pending_request_dialog")) == null) {
                        s8n s8nVar = new s8n();
                        Bundle bundle = new Bundle();
                        bundle.putInt("arg_title_res_id", R.string.page_payment__pending_request);
                        bundle.putInt("arg_description_res_id", i3);
                        bundle.putString("arg_description", null);
                        bundle.putInt("arg_positive_text_res_id", R.string.common_functions__home);
                        bundle.putInt("arg_negative_text_res_id", R.string.common_functions__transactions);
                        bundle.putString("arg_image", "");
                        s8nVar.setArguments(bundle);
                        s8nVar.A = vkeVar;
                        s8nVar.show(supportFragmentManager, "bvn_pending_request_dialog");
                    }
                }
            });
            return;
        }
        String lastAccessToken = getAccountHelper().getLastAccessToken();
        if (TextUtils.isEmpty(lastAccessToken)) {
            onRegistrationKYCResult(false);
        } else {
            showRegistrationKYCPageWithAccessToken(lastAccessToken);
        }
    }

    @Override // defpackage.fth
    public final boolean j1() {
        int i = this.a;
        return i == 310 || i == 320 || i == 325;
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        B1();
        return true;
    }

    @Override // defpackage.yz1, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_common_deposit, (ViewGroup) null, false);
        int i2 = R.id.back;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
        if (imageButton != null) {
            i2 = R.id.back_title;
            if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                i2 = R.id.deposit_frame;
                if (((FrameLayout) h5e.a(R.id.deposit_frame, viewInflate)) != null) {
                    i2 = R.id.deposit_help_center_btn;
                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.deposit_help_center_btn, viewInflate);
                    if (imageButton2 != null) {
                        i2 = R.id.deposit_tab;
                        TabLayout tabLayout = (TabLayout) h5e.a(R.id.deposit_tab, viewInflate);
                        if (tabLayout != null) {
                            i2 = R.id.home;
                            ImageButton imageButton3 = (ImageButton) h5e.a(R.id.home, viewInflate);
                            if (imageButton3 != null) {
                                i2 = R.id.init_failed_mask;
                                LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                if (loadingViewNew != null) {
                                    i2 = R.id.init_mask;
                                    ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                    if (composeView != null) {
                                        i2 = R.id.line;
                                        View viewA = h5e.a(R.id.line, viewInflate);
                                        if (viewA != null) {
                                            i2 = R.id.swipe;
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                            if (swipeRefreshLayout != null) {
                                                i2 = R.id.title_bar;
                                                if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                    this.i = new pc(constraintLayout, imageButton, imageButton2, tabLayout, imageButton3, loadingViewNew, composeView, viewA, swipeRefreshLayout);
                                                    setContentView(constraintLayout);
                                                    Intent intent = getIntent();
                                                    if (intent == null) {
                                                        finish();
                                                        return;
                                                    }
                                                    String stringExtra = intent.getStringExtra("mobileMoneyMethodId");
                                                    if (stringExtra == null) {
                                                        stringExtra = "";
                                                    }
                                                    this.w = stringExtra;
                                                    String stringExtra2 = intent.getStringExtra("paybillMethodId");
                                                    this.y = stringExtra2 != null ? stringExtra2 : "";
                                                    this.z = intent.getLongExtra("minDepositAmount", 0L);
                                                    this.A = intent.getLongExtra("maxDepositAmount", 0L);
                                                    rdd0 rdd0Var = this.e;
                                                    if (rdd0Var == null) {
                                                        Intrinsics.n("sportyTrackingUseCase");
                                                        throw null;
                                                    }
                                                    rdd0Var.a(new rnd(tj5.a(getIntent()), null, null, 13), k00.d);
                                                    c0e c0eVar = this.f;
                                                    if (c0eVar == null) {
                                                        Intrinsics.n("depositFlowStartHandler");
                                                        throw null;
                                                    }
                                                    c0eVar.b();
                                                    pc pcVar = this.i;
                                                    if (pcVar == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    pcVar.w.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: nc8
                                                        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                                        public final void i() {
                                                            int i3 = CommonDepositActivity.D;
                                                            CommonDepositActivity commonDepositActivity = this.a;
                                                            commonDepositActivity.C1().x1(false);
                                                            commonDepositActivity.C1().y1();
                                                            pc pcVar2 = commonDepositActivity.i;
                                                            if (pcVar2 != null) {
                                                                pcVar2.w.setRefreshing(false);
                                                            } else {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                        }
                                                    });
                                                    pcVar.i.setContent(new op8(1874041668, new sx90(true), true));
                                                    pcVar.f.setOnClickListener(new View.OnClickListener() { // from class: oc8
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i3 = CommonDepositActivity.D;
                                                            this.a.C1().x1(true);
                                                        }
                                                    });
                                                    pcVar.d.a(this.B);
                                                    ImageButton imageButton4 = pcVar.b;
                                                    mc8 mc8Var = this.C;
                                                    imageButton4.setOnClickListener(mc8Var);
                                                    pcVar.c.setOnClickListener(mc8Var);
                                                    pcVar.e.setOnClickListener(mc8Var);
                                                    zc8 zc8VarC1 = C1();
                                                    String str = this.w;
                                                    if (str == null) {
                                                        Intrinsics.n("mMobileMoneyMethodId");
                                                        throw null;
                                                    }
                                                    String str2 = this.y;
                                                    if (str2 == null) {
                                                        Intrinsics.n("mPaybillMethodId");
                                                        throw null;
                                                    }
                                                    zc8VarC1.B = str2;
                                                    zc8VarC1.C = str;
                                                    ej5.c(o8i0.d(zc8VarC1), null, null, new yc8(zc8VarC1, null), 3);
                                                    zc8VarC1.z.f(this, new b(new pc8(this, i)));
                                                    zc8VarC1.v.f(this, new b(new Function1() { // from class: qc8
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            g9e g9eVar = (g9e) obj;
                                                            int i3 = CommonDepositActivity.D;
                                                            boolean zG = Intrinsics.g(g9eVar, g9e.b.a);
                                                            CommonDepositActivity commonDepositActivity = this.a;
                                                            if (zG) {
                                                                pc pcVar2 = commonDepositActivity.i;
                                                                if (pcVar2 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                pcVar2.f.a();
                                                                pc pcVar3 = commonDepositActivity.i;
                                                                if (pcVar3 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                pcVar3.i.setVisibility(0);
                                                            } else if (g9eVar instanceof g9e.a) {
                                                                String cMSString = commonDepositActivity.getCMSString(((g9e.a) g9eVar).a, new Object[0]);
                                                                pc pcVar4 = commonDepositActivity.i;
                                                                if (pcVar4 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                pcVar4.f.c(cMSString);
                                                                pc pcVar5 = commonDepositActivity.i;
                                                                if (pcVar5 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                pcVar5.i.setVisibility(8);
                                                            } else {
                                                                if (!(g9eVar instanceof g9e.c)) {
                                                                    uhc.a();
                                                                    return null;
                                                                }
                                                                pc pcVar6 = commonDepositActivity.i;
                                                                if (pcVar6 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                pcVar6.f.a();
                                                                pc pcVar7 = commonDepositActivity.i;
                                                                if (pcVar7 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                pcVar7.i.setVisibility(8);
                                                                g9e.c cVar = (g9e.c) g9eVar;
                                                                int i4 = cVar.a;
                                                                t5e t5eVar = cVar.c;
                                                                pc pcVar8 = commonDepositActivity.i;
                                                                if (pcVar8 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                TabLayout.g gVarK = pcVar8.d.k(i4);
                                                                if (gVarK == null) {
                                                                    return Unit.a;
                                                                }
                                                                if (!gVarK.a()) {
                                                                    pc pcVar9 = commonDepositActivity.i;
                                                                    if (pcVar9 != null) {
                                                                        pcVar9.d.s(gVarK, true);
                                                                        return Unit.a;
                                                                    }
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                if (t5eVar instanceof t5e.a) {
                                                                    rdd0 rdd0Var2 = commonDepositActivity.e;
                                                                    if (rdd0Var2 == null) {
                                                                        Intrinsics.n("sportyTrackingUseCase");
                                                                        throw null;
                                                                    }
                                                                    rdd0Var2.a(new pnd("mobilemoney"), k00.d);
                                                                    re8.a aVar = re8.P;
                                                                    t5e.a aVar2 = (t5e.a) t5eVar;
                                                                    PayHintData payHintData = aVar2.a;
                                                                    long j = commonDepositActivity.z;
                                                                    long j2 = commonDepositActivity.A;
                                                                    PaymentChannel paymentChannel = aVar2.b;
                                                                    aVar.getClass();
                                                                    paymentChannel.getClass();
                                                                    re8 re8Var = new re8();
                                                                    re8Var.setArguments(vj5.a(new Pair("notifyContent", payHintData), new Pair("payChannel", paymentChannel), new Pair("minDepositAmount", Long.valueOf(j)), new Pair("maxDepositAmount", Long.valueOf(j2))));
                                                                    FragmentManager supportFragmentManager = commonDepositActivity.getSupportFragmentManager();
                                                                    supportFragmentManager.getClass();
                                                                    a aVar3 = new a(supportFragmentManager);
                                                                    aVar3.f(R.id.deposit_frame, re8Var, "CommonDepositFragment");
                                                                    aVar3.k(true, true);
                                                                } else if (t5eVar instanceof t5e.b) {
                                                                    rdd0 rdd0Var3 = commonDepositActivity.e;
                                                                    if (rdd0Var3 == null) {
                                                                        Intrinsics.n("sportyTrackingUseCase");
                                                                        throw null;
                                                                    }
                                                                    rdd0Var3.a(new pnd("paybill"), k00.d);
                                                                    dh8.a aVar4 = dh8.y;
                                                                    t5e.b bVar = (t5e.b) t5eVar;
                                                                    PayHintData payHintData2 = bVar.a;
                                                                    PaymentChannel paymentChannel2 = bVar.b;
                                                                    aVar4.getClass();
                                                                    paymentChannel2.getClass();
                                                                    dh8 dh8Var = new dh8();
                                                                    dh8Var.setArguments(vj5.a(new Pair("notifyContent", payHintData2), new Pair("payChannel", paymentChannel2)));
                                                                    FragmentManager supportFragmentManager2 = commonDepositActivity.getSupportFragmentManager();
                                                                    supportFragmentManager2.getClass();
                                                                    a aVar5 = new a(supportFragmentManager2);
                                                                    aVar5.f(R.id.deposit_frame, dh8Var, "CommonPaybillFragment");
                                                                    aVar5.k(true, true);
                                                                }
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }));
                                                    getConfirmNameStatus(new lsm() { // from class: lc8
                                                        @Override // defpackage.lsm
                                                        public final void a(Object obj) {
                                                            int i3;
                                                            NameConfirmationStatus nameConfirmationStatus = (NameConfirmationStatus) obj;
                                                            int i4 = CommonDepositActivity.D;
                                                            if (nameConfirmationStatus == null || (i3 = nameConfirmationStatus.status) == 5000) {
                                                                return;
                                                            }
                                                            this.a.a = i3;
                                                        }
                                                    });
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        c0e c0eVar = this.f;
        if (c0eVar == null) {
            Intrinsics.n("depositFlowStartHandler");
            throw null;
        }
        c0eVar.a = 0L;
        super.onDestroy();
    }

    @Override // defpackage.pw40
    public final void onRegistrationKYCResult(RegistrationKYC$Result registrationKYC$Result) {
        registrationKYC$Result.getClass();
        C1().f.m(registrationKYC$Result);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        C1().y1();
    }
}
