package com.sportybet.android.account.international.resetpwd;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.account.international.resetpwd.ResetPwdConfirmFragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a1s;
import defpackage.bmy;
import defpackage.cfx;
import defpackage.cq40;
import defpackage.cyb;
import defpackage.d630;
import defpackage.ef50;
import defpackage.fxo;
import defpackage.g5e;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.i6i0;
import defpackage.iel;
import defpackage.jq40;
import defpackage.lx5;
import defpackage.lyh;
import defpackage.ohp;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.saj;
import defpackage.t1m;
import defpackage.ttr;
import defpackage.v8i0;
import defpackage.ve50;
import defpackage.w8i0;
import defpackage.we50;
import defpackage.wwd0;
import defpackage.xwd0;
import defpackage.ye50;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/account/international/resetpwd/ResetPwdConfirmFragment;", "Lhvm;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResetPwdConfirmFragment extends t1m {
    public static final /* synthetic */ ohp<Object>[] z = {new d630(0, ResetPwdConfirmFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/IntResetPwdConfirmFragmentBinding;")};
    public final i6i0 i;
    public final q8i0 v;
    public final cfx w;
    public final wwd0 y;

    public static final /* synthetic */ class a extends saj implements Function1<View, fxo> {
        public static final a a = new a(1, fxo.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/IntResetPwdConfirmFragmentBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final fxo invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.back;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.back, view2);
            if (imageButton != null) {
                i = R.id.close;
                ImageButton imageButton2 = (ImageButton) h5e.a(R.id.close, view2);
                if (imageButton2 != null) {
                    i = R.id.email;
                    ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.email, view2);
                    if (clearEditText != null) {
                        i = R.id.error;
                        TextView textView = (TextView) h5e.a(R.id.error, view2);
                        if (textView != null) {
                            i = R.id.next;
                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, view2);
                            if (progressButton != null) {
                                i = R.id.reset_confirm_hint;
                                if (((TextView) h5e.a(R.id.reset_confirm_hint, view2)) != null) {
                                    i = R.id.title;
                                    if (((TextView) h5e.a(R.id.title, view2)) != null) {
                                        return new fxo((ConstraintLayout) view2, imageButton, imageButton2, clearEditText, textView, progressButton);
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

    public static final class b implements Function0<Bundle> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            ResetPwdConfirmFragment resetPwdConfirmFragment = ResetPwdConfirmFragment.this;
            Bundle arguments = resetPwdConfirmFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(resetPwdConfirmFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ResetPwdConfirmFragment.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
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

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ResetPwdConfirmFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ResetPwdConfirmFragment() {
        super(R.layout.int_reset_pwd_confirm_fragment);
        this.i = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.v = new q8i0(jq40.a(ef50.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        this.w = new cfx(jq40.a(ye50.class), new b());
        this.y = xwd0.a(Boolean.FALSE);
    }

    @Override // defpackage.hvm
    public final lyh<Boolean> j0() {
        return this.y;
    }

    @Override // defpackage.hvm
    public final View m0() {
        return q0().f;
    }

    @Override // defpackage.hvm, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        fxo fxoVarQ0 = q0();
        fxoVarQ0.b.setOnClickListener(new View.OnClickListener() { // from class: se50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = ResetPwdConfirmFragment.z;
                ResetPwdConfirmFragment resetPwdConfirmFragment = this.a;
                if (NavHostFragment.a.a(resetPwdConfirmFragment).k()) {
                    NavHostFragment.a.a(resetPwdConfirmFragment).j();
                } else {
                    resetPwdConfirmFragment.requireActivity().setResult(-1);
                    resetPwdConfirmFragment.requireActivity().finish();
                }
            }
        });
        fxoVarQ0.c.setOnClickListener(new View.OnClickListener() { // from class: te50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = ResetPwdConfirmFragment.z;
                this.a.requireActivity().finish();
            }
        });
        ClearEditText clearEditText = q0().d;
        clearEditText.setCanCopy(false);
        clearEditText.setErrorView(q0().e);
        clearEditText.addTextChangedListener(new ve50(clearEditText, this));
        cfx cfxVar = this.w;
        if (!StringsKt.U(((ye50) cfxVar.getValue()).a)) {
            clearEditText.setText(((ye50) cfxVar.getValue()).a);
        }
        fxo fxoVarQ1 = q0();
        fxoVarQ1.f.setButtonText(R.string.common_functions__next);
        fxoVarQ1.f.setOnClickListener(new we50(new cq40(), fxoVarQ1, this));
    }

    public final fxo q0() {
        return (fxo) this.i.a(this, z[0]);
    }
}
