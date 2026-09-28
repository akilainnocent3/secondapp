package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.navigation.fragment.NavHostFragment;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpnh;", "Lm12;", "Landroid/view/View$OnClickListener;", "Landroid/widget/TextView$OnEditorActionListener;", "Landroid/text/TextWatcher;", "Lk9j;", "Lj9j;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pnh extends yql implements View.OnClickListener, TextView.OnEditorActionListener, TextWatcher, k9j, j9j {
    public static final /* synthetic */ ohp<Object>[] Q = {new d630(0, pnh.class, "binding", "getBinding()Lcom/sporty/android/platform/databinding/FragmentFindAccountBinding;")};
    public final i6i0 B;
    public final q8i0 C;
    public yfx D;
    public nnh E;
    public ProgressButton F;
    public ImageButton G;
    public ClearEditText H;
    public y8j I;
    public com.sporty.android.platform.features.newotp.util.a J;
    public psm K;
    public nsm L;
    public azm M;
    public fi80 N;
    public ee<OtpModule<OtpData.RestPassword>> O;
    public final String P;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a extends saj implements Function1<View, svi> {
        public static final a a = new a(1, svi.class, "bind", "bind(Landroid/view/View;)Lcom/sporty/android/platform/databinding/FragmentFindAccountBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final svi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.back;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.back, view2);
            if (imageButton != null) {
                i = R.id.error;
                TextView textView = (TextView) h5e.a(R.id.error, view2);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                    i = R.id.log_in;
                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.log_in, view2);
                    if (progressButton != null) {
                        i = R.id.mobile;
                        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.mobile, view2);
                        if (clearEditText != null) {
                            i = R.id.mobile_container;
                            if (((FrameLayout) h5e.a(R.id.mobile_container, view2)) != null) {
                                i = R.id.prefix;
                                TextView textView2 = (TextView) h5e.a(R.id.prefix, view2);
                                if (textView2 != null) {
                                    i = R.id.title;
                                    TextView textView3 = (TextView) h5e.a(R.id.title, view2);
                                    if (textView3 != null) {
                                        i = R.id.title2;
                                        TextView textView4 = (TextView) h5e.a(R.id.title2, view2);
                                        if (textView4 != null) {
                                            i = R.id.toolbar;
                                            if (((LinearLayout) h5e.a(R.id.toolbar, view2)) != null) {
                                                return new svi(relativeLayout, imageButton, textView, progressButton, clearEditText, textView2, textView3, textView4);
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return pnh.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? pnh.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public pnh() {
        super(R.layout.fragment_find_account);
        this.z = false;
        this.A = false;
        this.B = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.C = new q8i0(jq40.a(tnh.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        this.P = "FindAccountFragment";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getD() {
        return this.P;
    }

    public final void n0(int i) {
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(requireContext());
        aVar.a(i);
        androidx.appcompat.app.b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, null).create();
        bVarCreate.getClass();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final svi o0() {
        return (svi) this.B.a(this, Q[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (requireActivity().getSupportFragmentManager().L() > 0) {
            ImageButton imageButton = this.G;
            if (imageButton == null) {
                Intrinsics.n("backButton");
                throw null;
            }
            imageButton.setOnClickListener(this);
            ImageButton imageButton2 = this.G;
            if (imageButton2 == null) {
                Intrinsics.n("backButton");
                throw null;
            }
            imageButton2.setVisibility(0);
        }
        p0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        int id = view.getId();
        if (id == R.id.back) {
            androidx.fragment.app.e eVarRequireActivity = requireActivity();
            eVarRequireActivity.getClass();
            eVarRequireActivity.getOnBackPressedDispatcher().d();
            return;
        }
        if (id == R.id.fragment_root) {
            lop.b(view, Boolean.FALSE);
            return;
        }
        if (id == R.id.log_in) {
            ClearEditText clearEditText = this.H;
            if (clearEditText == null) {
                Intrinsics.n("mobileView");
                throw null;
            }
            String strValueOf = String.valueOf(clearEditText.getText());
            if (StringsKt.U(strValueOf)) {
                return;
            }
            psm psmVar = this.K;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            if (psmVar.E() && !kotlin.text.c.u(strValueOf, "0", false) && strValueOf.length() < getResources().getInteger(R.integer.mobile_max_length)) {
                strValueOf = "0".concat(strValueOf);
                ClearEditText clearEditText2 = this.H;
                if (clearEditText2 == null) {
                    Intrinsics.n("mobileView");
                    throw null;
                }
                int selectionStart = clearEditText2.getSelectionStart();
                ClearEditText clearEditText3 = this.H;
                if (clearEditText3 == null) {
                    Intrinsics.n("mobileView");
                    throw null;
                }
                clearEditText3.setText(strValueOf);
                if (selectionStart >= 0) {
                    ClearEditText clearEditText4 = this.H;
                    if (clearEditText4 == null) {
                        Intrinsics.n("mobileView");
                        throw null;
                    }
                    clearEditText4.setSelection(selectionStart + 1);
                }
            }
            nsm nsmVar = this.L;
            if (nsmVar == null) {
                Intrinsics.n("connectivityMonitor");
                throw null;
            }
            if (!nsmVar.isConnected()) {
                n0(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
                return;
            }
            if (this.J == null) {
                Intrinsics.n("otpModuleFactory");
                throw null;
            }
            psm psmVar2 = this.K;
            if (psmVar2 == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            OtpModule otpModuleD = com.sporty.android.platform.features.newotp.util.a.d(strValueOf, psmVar2.P());
            ((tnh) this.C.getValue()).x1(strValueOf);
            ee<OtpModule<OtpData.RestPassword>> eeVar = this.O;
            if (eeVar != null) {
                eeVar.b(otpModuleD);
            } else {
                Intrinsics.n("otpLauncher");
                throw null;
            }
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        textView.getClass();
        return i == 6;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ClearEditText clearEditText = this.H;
        if (clearEditText != null) {
            lop.b(clearEditText, Boolean.FALSE);
        } else {
            Intrinsics.n("mobileView");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        p0();
        ClearEditText clearEditText = this.H;
        if (clearEditText != null) {
            clearEditText.setError((String) null);
        } else {
            Intrinsics.n("mobileView");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    public final void p0() {
        boolean z;
        ProgressButton progressButton = this.F;
        if (progressButton == null) {
            Intrinsics.n("progressButton");
            throw null;
        }
        if (progressButton.isLoading) {
            return;
        }
        if (progressButton == null) {
            Intrinsics.n("progressButton");
            throw null;
        }
        ClearEditText clearEditText = this.H;
        if (clearEditText == null) {
            Intrinsics.n("mobileView");
            throw null;
        }
        if (TextUtils.isEmpty(clearEditText.getText())) {
            z = false;
        } else {
            ClearEditText clearEditText2 = this.H;
            if (clearEditText2 == null) {
                Intrinsics.n("mobileView");
                throw null;
            }
            if (TextUtils.isEmpty(clearEditText2.getText())) {
                z = false;
            } else {
                z = true;
            }
        }
        progressButton.setEnabled(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        yfx yfxVarA;
        nnh nnhVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        this.G = o0().b;
        ClearEditText clearEditText = o0().e;
        this.H = clearEditText;
        y8j y8jVar = this.I;
        if (y8jVar != null) {
            y8jVar.d(clearEditText, "fs-mask");
            ClearEditText clearEditText2 = this.H;
            if (clearEditText2 != null) {
                clearEditText2.addTextChangedListener(this);
                ClearEditText clearEditText3 = this.H;
                if (clearEditText3 != null) {
                    clearEditText3.setErrorView(o0().c);
                    TextView textView = o0().f;
                    psm psmVar = this.K;
                    if (psmVar != null) {
                        textView.setText(psmVar.M());
                        o0().a.setOnClickListener(this);
                        ProgressButton progressButton = o0().d;
                        this.F = progressButton;
                        progressButton.setEnabled(false);
                        ProgressButton progressButton2 = this.F;
                        if (progressButton2 != null) {
                            progressButton2.setButtonText(R.string.common_functions__next);
                            ProgressButton progressButton3 = this.F;
                            if (progressButton3 != null) {
                                progressButton3.setOnClickListener(this);
                                ClearEditText clearEditText4 = this.H;
                                if (clearEditText4 != null) {
                                    if (TextUtils.isEmpty(String.valueOf(clearEditText4.getText()))) {
                                        ClearEditText clearEditText5 = this.H;
                                        if (clearEditText5 != null) {
                                            clearEditText5.requestFocus();
                                        } else {
                                            Intrinsics.n("mobileView");
                                            throw null;
                                        }
                                    }
                                    ClearEditText clearEditText6 = this.H;
                                    if (clearEditText6 != null) {
                                        lop.d(clearEditText6);
                                        f00 f00Var = vgb0.a;
                                        vgb0.a("Reg_2_3");
                                        try {
                                            yfxVarA = NavHostFragment.a.a(this);
                                        } catch (IllegalStateException unused) {
                                            yfxVarA = null;
                                        }
                                        this.D = yfxVarA;
                                        q8i0 q8i0Var = this.C;
                                        if (yfxVarA != null) {
                                            nnhVar = (nnh) mfx.a(yfxVarA.b(jq40.a(nnh.class)), jq40.a(nnh.class));
                                        } else {
                                            Bundle arguments = getArguments();
                                            if (arguments == null) {
                                                arguments = new Bundle();
                                            }
                                            String string = arguments.getString("mobile", "");
                                            boolean z = arguments.getBoolean("allowPhoneChange", true);
                                            boolean z2 = arguments.getBoolean("allowBack", true);
                                            String string2 = arguments.getString("title");
                                            String string3 = arguments.getString("description");
                                            string.getClass();
                                            if (string.length() > 0) {
                                                ((tnh) q8i0Var.getValue()).x1(string);
                                            }
                                            nnhVar = new nnh(z, z2, string2, string3);
                                        }
                                        this.E = nnhVar;
                                        ImageButton imageButton = this.G;
                                        if (imageButton != null) {
                                            if (nnhVar != null) {
                                                c8i0.o(imageButton, nnhVar.b);
                                                ClearEditText clearEditText7 = this.H;
                                                if (clearEditText7 != null) {
                                                    nnh nnhVar2 = this.E;
                                                    if (nnhVar2 != null) {
                                                        clearEditText7.setEnabled(nnhVar2.a);
                                                        nnh nnhVar3 = this.E;
                                                        if (nnhVar3 != null) {
                                                            String str = nnhVar3.c;
                                                            if (str != null) {
                                                                o0().i.setText(str);
                                                            }
                                                            nnh nnhVar4 = this.E;
                                                            if (nnhVar4 != null) {
                                                                String str2 = nnhVar4.d;
                                                                if (str2 != null) {
                                                                    o0().v.setText(str2);
                                                                }
                                                                v340 v340VarB = e1i.b(((tnh) q8i0Var.getValue()).b);
                                                                ibs viewLifecycleOwner = getViewLifecycleOwner();
                                                                viewLifecycleOwner.getClass();
                                                                s9s.b bVar = s9s.b.a;
                                                                ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new qnh(viewLifecycleOwner, v340VarB, null, this), 3);
                                                                this.O = com.sporty.android.platform.features.newotp.agent.b.b(this, new Function1() { // from class: onh
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        OtpData.RestPassword restPassword = (OtpData.RestPassword) obj;
                                                                        ohp<Object>[] ohpVarArr = pnh.Q;
                                                                        restPassword.getClass();
                                                                        OTPResult<OTPGeneralResult> oTPResult = restPassword.d;
                                                                        pnh pnhVar = this.a;
                                                                        String str3 = ((snh) e1i.b(((tnh) pnhVar.C.getValue()).b).a.getValue()).a;
                                                                        boolean z3 = oTPResult instanceof OTPResult.Success;
                                                                        if (!z3 || str3 == null || StringsKt.U(str3)) {
                                                                            if (z3) {
                                                                                itf0.a aVar = itf0.a;
                                                                                aVar.q("FindAccountFragment");
                                                                                aVar.d("Mobile is null/blank after OTP success", new Object[0]);
                                                                            }
                                                                            pnhVar.n0(R.string.common_feedback__something_went_wrong_please_try_again_later);
                                                                        } else {
                                                                            String token = ((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken();
                                                                            nnh nnhVar5 = pnhVar.E;
                                                                            if (nnhVar5 == null) {
                                                                                Intrinsics.n("findAccountRoute");
                                                                                throw null;
                                                                            }
                                                                            boolean z4 = nnhVar5.b;
                                                                            boolean z5 = !z4;
                                                                            fi80 fi80Var = pnhVar.N;
                                                                            if (fi80Var == null) {
                                                                                Intrinsics.n("setPasswordV2Manager");
                                                                                throw null;
                                                                            }
                                                                            if (fi80Var.a()) {
                                                                                azm azmVar = pnhVar.M;
                                                                                if (azmVar == null) {
                                                                                    Intrinsics.n("router");
                                                                                    throw null;
                                                                                }
                                                                                azmVar.f(wae.RESET_PASSWORD, b.k(new Pair("mobile", str3), new Pair("token", token), new Pair("isForced", String.valueOf(z5)), new Pair("isSkippable", String.valueOf(z4))));
                                                                            } else {
                                                                                yfx yfxVar = pnhVar.D;
                                                                                if (yfxVar != null) {
                                                                                    token.getClass();
                                                                                    yfx.h(yfxVar, new qb50(str3, token, z5), bjx.a(new ea(0)), 4);
                                                                                } else {
                                                                                    fc50 fc50Var = new fc50();
                                                                                    Bundle bundle2 = new Bundle();
                                                                                    bundle2.putString("mobile", str3);
                                                                                    bundle2.putString("token", token);
                                                                                    fc50Var.setArguments(bundle2);
                                                                                    FragmentManager supportFragmentManager = pnhVar.requireActivity().getSupportFragmentManager();
                                                                                    supportFragmentManager.getClass();
                                                                                    a aVar2 = new a(supportFragmentManager);
                                                                                    aVar2.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                                                                                    aVar2.f(android.R.id.content, fc50Var, null);
                                                                                    aVar2.c(null);
                                                                                    aVar2.k(true, true);
                                                                                }
                                                                            }
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                            Intrinsics.n("findAccountRoute");
                                                            throw null;
                                                        }
                                                        Intrinsics.n("findAccountRoute");
                                                        throw null;
                                                    }
                                                    Intrinsics.n("findAccountRoute");
                                                    throw null;
                                                }
                                                Intrinsics.n("mobileView");
                                                throw null;
                                            }
                                            Intrinsics.n("findAccountRoute");
                                            throw null;
                                        }
                                        Intrinsics.n(TEFcJcMqR.pCeZjwGWCyUOcn);
                                        throw null;
                                    }
                                    Intrinsics.n("mobileView");
                                    throw null;
                                }
                                Intrinsics.n("mobileView");
                                throw null;
                            }
                            Intrinsics.n("progressButton");
                            throw null;
                        }
                        Intrinsics.n("progressButton");
                        throw null;
                    }
                    Intrinsics.n("countryManager");
                    throw null;
                }
                Intrinsics.n("mobileView");
                throw null;
            }
            Intrinsics.n("mobileView");
            throw null;
        }
        Intrinsics.n("fullStoryCommonManager");
        throw null;
    }
}
