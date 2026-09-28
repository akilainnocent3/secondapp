package com.sportybet.android.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.RestrictionActivity;
import com.sportybet.android.widget.LoadingView;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.cw;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.f1i;
import defpackage.h5e;
import defpackage.ha8;
import defpackage.haj;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.jxf0;
import defpackage.ki50;
import defpackage.lfy;
import defpackage.lsd;
import defpackage.m850;
import defpackage.myh;
import defpackage.nae0;
import defpackage.ni50;
import defpackage.paj;
import defpackage.pi50;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qi50;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.si50;
import defpackage.sn5;
import defpackage.tc10;
import defpackage.td;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.ui50;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.w1m;
import defpackage.wsm;
import defpackage.y5b;
import defpackage.yrh0;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/home/RestrictionActivity;", "Lpy1;", "Lpwx;", "Lcw;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RestrictionActivity extends w1m implements pwx, cw, bb40 {
    public static final /* synthetic */ int f = 0;
    public td b;
    public final q8i0 c = new q8i0(jq40.a(ui50.class), new e(), new d(), new f());
    public wsm d;
    public jxf0 e;

    @c0d(c = "com.sportybet.android.home.RestrictionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1", f = "RestrictionActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RestrictionActivity b;
        public final /* synthetic */ RestrictionActivity c;

        /* JADX INFO: renamed from: com.sportybet.android.home.RestrictionActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.home.RestrictionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1$1", f = "RestrictionActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class C0251a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ RestrictionActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0251a(v1b v1bVar, RestrictionActivity restrictionActivity) {
                super(2, v1bVar);
                this.c = restrictionActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0251a c0251a = new C0251a(v1bVar, this.c);
                c0251a.b = obj;
                return c0251a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0251a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = RestrictionActivity.f;
                    RestrictionActivity restrictionActivity = this.c;
                    f1i f1iVar = restrictionActivity.z1().D;
                    b bVar = restrictionActivity.new b();
                    this.b = null;
                    this.a = 1;
                    if (f1iVar.collect(bVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RestrictionActivity restrictionActivity, v1b v1bVar, RestrictionActivity restrictionActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = restrictionActivity;
            this.c = restrictionActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                C0251a c0251a = new C0251a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0251a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class b<T> implements myh {
        public b() {
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            si50 si50Var = (si50) obj;
            boolean z = si50Var instanceof si50.c;
            RestrictionActivity restrictionActivity = RestrictionActivity.this;
            if (z) {
                int i = RestrictionActivity.f;
                restrictionActivity.B1(R.string.app_common__emulator_restriction_dialog_content);
            } else if (si50Var instanceof si50.e) {
                int i2 = RestrictionActivity.f;
                restrictionActivity.B1(R.string.app_common__rooted_restriction_dialog_content);
            } else if (si50Var instanceof si50.d) {
                int i3 = RestrictionActivity.f;
                ki50 ki50Var = new ki50();
                if (!restrictionActivity.isFinishing()) {
                    new AlertDialog.Builder(restrictionActivity).setCancelable(false).setMessage(sn5.b(restrictionActivity, R.string.app_common__proxy_or_vpn_usage_dialog_content, new Object[0])).setPositiveButton(sn5.b(restrictionActivity, R.string.common_functions__ok, new Object[0]), ki50Var).create().show();
                }
            } else if (si50Var instanceof si50.a) {
                boolean z2 = ((si50.a) si50Var).a;
                int i4 = RestrictionActivity.f;
                if (z2) {
                    jxf0 jxf0Var = restrictionActivity.e;
                    if (jxf0Var == null) {
                        Intrinsics.n("timeToFirstDisplayReporter");
                        throw null;
                    }
                    jxf0Var.a();
                }
                yrh0.s(restrictionActivity, new Intent(null, restrictionActivity.getIntent().getData(), restrictionActivity, MainActivity.class), true);
                restrictionActivity.overridePendingTransition(0, 0);
                restrictionActivity.finish();
            } else {
                if (!(si50Var instanceof si50.b)) {
                    uhc.a();
                    return null;
                }
                int i5 = RestrictionActivity.f;
                restrictionActivity.B1(R.string.app_common__changes_were_detected_in_the_device);
            }
            return Unit.a;
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ tc10 a;

        public c(tc10 tc10Var) {
            this.a = tc10Var;
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

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return RestrictionActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return RestrictionActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return RestrictionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void A1() {
        if (isFinishing()) {
            return;
        }
        if (yrh0.a.getAccountHelper().isLogin()) {
            z1().z1();
            return;
        }
        if (getCountryManager().W()) {
            StringUiText stringUiText = vch0.a;
            ha8.a.a(new ResourceUiText(R.string.common_feedback__age_gate_confirm_title), new ResourceUiText(R.string.common_feedback__age_gate_confirm_body), Integer.valueOf(R.drawable.ic__tips), Integer.valueOf(R.color.icon_secondary), new ResourceUiText(R.string.common_feedback__age_gate_confirm_cta_1), new ResourceUiText(R.string.common_feedback__age_gate_confirm_cta_2), new pi50(0, z1(), ui50.class, "onAllRestrictionsPassed", "onAllRestrictionsPassed()V", 0), new qi50(0, this, RestrictionActivity.class, "onCloseApp", "onCloseApp()V", 0)).show(getSupportFragmentManager(), ha8.class.getName());
            return;
        }
        String cMSString = getCMSString(R.string.common_functions__yes, new Object[0]);
        Locale locale = Locale.ROOT;
        String upperCase = cMSString.toUpperCase(locale);
        upperCase.getClass();
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this).setCancelable(false).setMessage(getCMSString(R.string.app_common__age_verification_dialog_content, upperCase)).setPositiveButton(upperCase, new DialogInterface.OnClickListener() { // from class: mi50
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = RestrictionActivity.f;
                this.a.z1().z1();
            }
        });
        String upperCase2 = getCMSString(R.string.common_functions__no, new Object[0]).toUpperCase(locale);
        upperCase2.getClass();
        positiveButton.setNegativeButton(upperCase2, new ni50()).create().show();
    }

    public final void B1(int i) {
        new AlertDialog.Builder(this).setCancelable(false).setTitle(getCMSString(R.string.app_common__geo_restriction_dialog_title, new Object[0])).setMessage(getCMSString(i, new Object[0])).setPositiveButton(getCMSString(R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: li50
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = RestrictionActivity.f;
                this.a.getClass();
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                System.exit(0);
            }
        }).create().show();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_restriction, (ViewGroup) null, false);
        int i = R.id.loading;
        LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
        if (loadingView != null) {
            i = R.id.restrict_copy_right;
            TextView textView = (TextView) h5e.a(R.id.restrict_copy_right, viewInflate);
            if (textView != null) {
                this.b = new td((ConstraintLayout) viewInflate, loadingView, textView);
                int i2 = 1;
                textView.setText(nae0.a(getCMSString(R.string.main_footer__year_copy_right, String.valueOf(Calendar.getInstance().get(1)))));
                td tdVar = this.b;
                if (tdVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                setContentView(tdVar.a);
                jxf0 jxf0Var = this.e;
                if (jxf0Var == null) {
                    Intrinsics.n("timeToFirstDisplayReporter");
                    throw null;
                }
                td tdVar2 = this.b;
                if (tdVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout = tdVar2.a;
                constraintLayout.getClass();
                jxf0Var.b(constraintLayout);
                z1().B.f(this, new c(new tc10(this, i2)));
                td tdVar3 = this.b;
                if (tdVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                tdVar3.b.setOnClickListener(new lsd(this, i2));
                td tdVar4 = this.b;
                if (tdVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                tdVar4.b.K();
                z1().y1();
                s9s.b bVar = s9s.b.a;
                ej5.c(ebs.a(getLifecycle()), null, null, new a(this, null, this), 3);
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final ui50 z1() {
        return (ui50) this.c.getValue();
    }
}
