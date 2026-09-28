package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.sportypin.WithdrawalPinActivity;
import com.sportybet.android.user.LineTextViewPanel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhaw;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Lk9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class haw extends zwl implements View.OnClickListener, k9j {
    public static final /* synthetic */ ohp<Object>[] E = {new d630(0, haw.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentMultiFactorAuthenticationBinding;")};
    public bnh0 A;
    public iym B;
    public final ee<Intent> C;
    public final ee<Intent> D;
    public final i6i0 f = g5e.a(a.a);
    public final q8i0 i;
    public final q8i0 v;
    public psm w;
    public uqm y;
    public nel z;

    public static final /* synthetic */ class a extends saj implements Function1<View, owi> {
        public static final a a = new a(1, owi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentMultiFactorAuthenticationBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final owi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.back_icon;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, view2);
            if (imageButton != null) {
                i = R.id.back_title;
                if (((TextView) h5e.a(R.id.back_title, view2)) != null) {
                    i = R.id.bio_auth_compose_view;
                    ComposeView composeView = (ComposeView) h5e.a(R.id.bio_auth_compose_view, view2);
                    if (composeView != null) {
                        i = R.id.home;
                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, view2);
                        if (imageButton2 != null) {
                            i = R.id.multi_factor_auth_dialog;
                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.multi_factor_auth_dialog, view2);
                            if (composeView2 != null) {
                                i = R.id.sporty_pin;
                                LineTextViewPanel lineTextViewPanel = (LineTextViewPanel) h5e.a(R.id.sporty_pin, view2);
                                if (lineTextViewPanel != null) {
                                    i = R.id.title_bar;
                                    if (((ConstraintLayout) h5e.a(R.id.title_bar, view2)) != null) {
                                        i = R.id.two_factor_auth_compose_view;
                                        ComposeView composeView3 = (ComposeView) h5e.a(R.id.two_factor_auth_compose_view, view2);
                                        if (composeView3 != null) {
                                            i = R.id.verified_email_compose_view;
                                            ComposeView composeView4 = (ComposeView) h5e.a(R.id.verified_email_compose_view, view2);
                                            if (composeView4 != null) {
                                                return new owi((ConstraintLayout) view2, imageButton, composeView, imageButton2, composeView2, lineTextViewPanel, composeView3, composeView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ zxc a;

        public b(zxc zxcVar) {
            this.a = zxcVar;
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
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? haw.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return haw.this;
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? haw.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class i extends qlr implements Function0<Fragment> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return haw.this;
        }
    }

    public static final class j extends qlr implements Function0<w8i0> {
        public final /* synthetic */ i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.a = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class k extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class l extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public haw() {
        d dVar = new d();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new e(dVar));
        this.i = new q8i0(jq40.a(tz00.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new j(new i()));
        this.v = new q8i0(jq40.a(ocu.class), new k(ttrVarA2), new c(ttrVarA2), new l(ttrVarA2));
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: daw
            @Override // defpackage.ud
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                ohp<Object>[] ohpVarArr = haw.E;
                activityResult.getClass();
                int i2 = activityResult.a;
                haw hawVar = this.a;
                if (i2 == 2100) {
                    hawVar.m0().f.setRightText(R.string.common_functions__edit);
                } else if (i2 == 2400) {
                    hawVar.m0().f.setRightText(R.string.wap_profile__create);
                }
                if (i2 == 2100 || i2 == 2400) {
                    hawVar.m0().f.setEnabled(true);
                    Intent intent = activityResult.b;
                    if (intent != null && intent.getStringExtra("EXTRA_VERIFY_TOKEN") == null) {
                        if (hawVar.z != null) {
                            nel.a(String.valueOf(intent.getStringExtra("EXTRA_FINGERPRINT_TOKEN")));
                        } else {
                            Intrinsics.n("hashFingerprintTokenUseCase");
                            throw null;
                        }
                    }
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.C = eeVarRegisterForActivityResult;
        ee<Intent> eeVarRegisterForActivityResult2 = registerForActivityResult(new ce(), new ud() { // from class: eaw
            @Override // defpackage.ud
            public final void a(Object obj) {
                ohp<Object>[] ohpVarArr = haw.E;
                ((ActivityResult) obj).getClass();
                ocu ocuVarN0 = this.a.n0();
                ej5.c(o8i0.d(ocuVarN0), null, null, new rcu(ocuVarN0, null), 3);
            }
        });
        eeVarRegisterForActivityResult2.getClass();
        this.D = eeVarRegisterForActivityResult2;
    }

    public final owi m0() {
        return (owi) this.f.a(this, E[0]);
    }

    public final ocu n0() {
        return (ocu) this.v.getValue();
    }

    public final void o0() {
        if (!a8b.c().w()) {
            m0().f.setVisibility(8);
            return;
        }
        ssw<WithdrawalPinStatusInfo> sswVar = ((tz00) this.i.getValue()).b;
        if (sswVar != null) {
            sswVar.f(getViewLifecycleOwner(), new b(new zxc(this, 1)));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        if (view.getId() == R.id.sporty_pin) {
            ssw<WithdrawalPinStatusInfo> sswVar = ((tz00) this.i.getValue()).b;
            WithdrawalPinStatusInfo withdrawalPinStatusInfoD = sswVar != null ? sswVar.d() : null;
            SportyPinStatus sportyPinStatus = withdrawalPinStatusInfoD != null ? withdrawalPinStatusInfoD.getSportyPinStatus() : null;
            SportyPinStatus sportyPinStatus2 = SportyPinStatus.Disabled;
            ee<Intent> eeVar = this.C;
            if (sportyPinStatus == sportyPinStatus2) {
                Intent intent = new Intent(requireContext(), (Class<?>) WithdrawalPinActivity.class);
                intent.putExtra("REQUEST_CODE", 1100);
                intent.putExtra("isWithdrawing", false);
                intent.putExtra("EXTRA_SHOW_TITLE_ICON", true);
                intent.putExtra("EXTRA_VERIFIED_USER", false);
                eeVar.b(intent);
                return;
            }
            if (withdrawalPinStatusInfoD != null) {
                int usage = withdrawalPinStatusInfoD.getUsage();
                Intent intent2 = new Intent(requireContext(), (Class<?>) WithdrawalPinActivity.class);
                intent2.putExtra("REQUEST_CODE", 1200);
                intent2.putExtra("option", usage);
                intent2.putExtra("isWithdrawing", false);
                eeVar.b(intent2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (a8b.c().w()) {
            tz00 tz00Var = (tz00) this.i.getValue();
            tz00Var.z.y1().G(new vz00(tz00Var));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        m0().b.setOnClickListener(new View.OnClickListener() { // from class: aaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = haw.E;
                NavHostFragment.a.a(this.a).k();
            }
        });
        m0().d.setOnClickListener(new baw());
        m0().f.setRightColor(requireContext().getColor(R.color.brand_quaternary));
        m0().f.setRightText("");
        m0().f.setEnabled(false);
        m0().f.setOnClickListener(this);
        ComposeView composeView = m0().i;
        psm psmVar = this.w;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        composeView.setVisibility(psmVar.r() ? 8 : 0);
        o0();
        o0();
        v340 v340Var = n0().D;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new jaw(viewLifecycleOwner, v340Var, null, this), 3);
        t340 t340Var = n0().F;
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new iaw(viewLifecycleOwner2, t340Var, null, this), 3);
        ocu ocuVarN0 = n0();
        ej5.c(o8i0.d(ocuVarN0), null, null, new rcu(ocuVarN0, null), 3);
        ocu ocuVarN1 = n0();
        ej5.c(o8i0.d(ocuVarN1), null, null, new qcu(ocuVarN1, null), 3);
    }
}
