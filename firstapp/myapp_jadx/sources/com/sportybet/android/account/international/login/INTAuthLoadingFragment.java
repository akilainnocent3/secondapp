package com.sportybet.android.account.international.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;
import com.sportybet.android.auth.AuthActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.bc;
import defpackage.bvm;
import defpackage.c0d;
import defpackage.cvm;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ehx;
import defpackage.ej5;
import defpackage.esl;
import defpackage.g1i;
import defpackage.hwr;
import defpackage.iel;
import defpackage.ivm;
import defpackage.jq40;
import defpackage.k59;
import defpackage.kzh;
import defpackage.o8i0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.t340;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v8i0;
import defpackage.vxo;
import defpackage.w8i0;
import defpackage.y5b;
import defpackage.yfx;
import defpackage.yum;
import defpackage.zum;
import defpackage.zyh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/account/international/login/INTAuthLoadingFragment;", "Lm12;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class INTAuthLoadingFragment extends esl {
    public final q8i0 B;

    @c0d(c = "com.sportybet.android.account.international.login.INTAuthLoadingFragment$onViewCreated$1", f = "INTAuthLoadingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<ivm, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = INTAuthLoadingFragment.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ivm ivmVar, v1b<? super Unit> v1bVar) {
            return ((a) create(ivmVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ehx zumVar;
            Intent intent;
            Intent intent2;
            Intent intent3;
            ivm ivmVar = (ivm) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = ivmVar instanceof ivm.b;
            INTAuthLoadingFragment iNTAuthLoadingFragment = INTAuthLoadingFragment.this;
            if (z) {
                zumVar = new bc(R.id.to_int_login_fragment);
            } else {
                String stringExtra = null;
                if (ivmVar instanceof ivm.c) {
                    androidx.fragment.app.e activity = iNTAuthLoadingFragment.getActivity();
                    RegistrationStatusResponse registrationStatusResponse = (activity == null || (intent3 = activity.getIntent()) == null) ? null : (RegistrationStatusResponse) vxo.a(intent3, "key_registration_status", RegistrationStatusResponse.class);
                    androidx.fragment.app.e activity2 = iNTAuthLoadingFragment.getActivity();
                    String stringExtra2 = (activity2 == null || (intent2 = activity2.getIntent()) == null) ? null : intent2.getStringExtra("key_email");
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    androidx.fragment.app.e activity3 = iNTAuthLoadingFragment.getActivity();
                    if (activity3 != null && (intent = activity3.getIntent()) != null) {
                        stringExtra = intent.getStringExtra("key_password");
                    }
                    zumVar = new yum(registrationStatusResponse, stringExtra2, stringExtra != null ? stringExtra : "");
                } else {
                    if (ivmVar instanceof ivm.a) {
                        iNTAuthLoadingFragment.requireContext().getClass();
                        throw null;
                    }
                    if (!Intrinsics.g(ivmVar, ivm.d.a)) {
                        uhc.a();
                        return null;
                    }
                    zumVar = new zum("");
                }
            }
            yfx yfxVarA = NavHostFragment.a.a(iNTAuthLoadingFragment);
            yfxVarA.getClass();
            yfxVarA.f(zumVar.b(), zumVar.a());
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return INTAuthLoadingFragment.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
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

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? INTAuthLoadingFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public INTAuthLoadingFragment() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.B = new q8i0(jq40.a(cvm.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(k59.b);
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        Intent intent;
        Intent intent2;
        Intent intent3;
        super.onStart();
        androidx.fragment.app.e activity = getActivity();
        boolean booleanExtra = false;
        boolean booleanExtra2 = (activity == null || (intent3 = activity.getIntent()) == null) ? false : intent3.getBooleanExtra(AuthActivity.KEY_IS_SIGN_UP, false);
        androidx.fragment.app.e activity2 = getActivity();
        boolean booleanExtra3 = (activity2 == null || (intent2 = activity2.getIntent()) == null) ? false : intent2.getBooleanExtra(AuthActivity.KEY_IS_FORGET_PASSWORD, false);
        androidx.fragment.app.e activity3 = getActivity();
        if (activity3 != null && (intent = activity3.getIntent()) != null) {
            booleanExtra = intent.getBooleanExtra(AuthActivity.KEY_IS_IDENTITY_VERIFY, false);
        }
        cvm cvmVar = (cvm) this.B.getValue();
        ej5.c(o8i0.d(cvmVar), null, null, new bvm(booleanExtra3, booleanExtra, booleanExtra2, cvmVar, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        t340 t340Var = ((cvm) this.B.getValue()).c;
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        kzh.d(new g1i(zyh.a(t340Var, lifecycle, s9s.b.c), new a(null)), ebs.a(getLifecycle()));
    }
}
