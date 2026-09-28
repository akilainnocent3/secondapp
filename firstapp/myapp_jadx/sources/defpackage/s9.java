package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.PasswordEditText;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sportybet.android.account.mfa.Verify2FAFragment;
import com.sportybet.android.auth.AuthActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.country.ChangeRegionActivity;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public class s9 extends mll implements View.OnClickListener, TextView.OnEditorActionListener, TextWatcher, k9j, j9j {
    public static final /* synthetic */ int P = 0;
    public boolean B;
    public ocu C;
    public aa D;
    public rlr E;
    public au7 F;
    public nsm G;
    public num H;
    public y8j I;
    public psm J;
    public d0n K;
    public uy0 L;
    public fbh0 M;
    public azm N;
    public qvi O;

    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[fcu.values().length];
            b = iArr;
            try {
                iArr[fcu.SEND_TWO_FA_CODE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[fcu.SEND_TWO_FA_CODE_EXCEED_RATE_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[fcu.RETRY_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[fcu.CUSTOM_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[fcu.NETWORK_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[CountryCodeName.values().length];
            a = iArr2;
            try {
                iArr2[CountryCodeName.CAMEROON.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[CountryCodeName.GHANA.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[CountryCodeName.SOUTH_AFRICA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[CountryCodeName.MOZAMBIQUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public s9() {
        this.z = false;
        this.A = false;
        this.B = true;
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return "AccountLoginFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        e activity = getActivity();
        if (activity != null && activity.getSupportFragmentManager().L() > 0) {
            this.O.c.setOnClickListener(this);
            this.O.c.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.O.y.getLayoutParams();
            layoutParams.setMargins(bqe.a(10.0f), bqe.a(8.0f), 0, 0);
            this.O.y.setLayoutParams(layoutParams);
        }
        r0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment ybjVar;
        int id = view.getId();
        if (id == R.id.change_region) {
            yrh0.s(requireActivity(), ChangeRegionActivity.z1(requireActivity()), true);
            return;
        }
        if (id == R.id.back) {
            e activity = getActivity();
            if (activity != null) {
                activity.getOnBackPressedDispatcher().d();
                return;
            }
            return;
        }
        if (id == R.id.close) {
            this.H.a(new jdt(jdt.a.b));
            e activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        if (id == R.id.fragment_root) {
            lop.b(view, Boolean.FALSE);
            return;
        }
        if (id != R.id.create_new) {
            if (id == R.id.log_in) {
                s0(this.O.C.getText());
                return;
            }
            if (id == R.id.forgot_password) {
                this.F.x1(j6c.RESET_PASSWORD);
                pnh pnhVar = new pnh();
                Bundle bundle = new Bundle();
                bundle.putString("mobile", this.O.B.getText() != null ? this.O.B.getText().toString() : "");
                pnhVar.setArguments(bundle);
                e activity3 = getActivity();
                if (activity3 != null) {
                    FragmentManager supportFragmentManager = activity3.getSupportFragmentManager();
                    androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
                    aVarA.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                    aVarA.f(android.R.id.content, pnhVar, null);
                    aVarA.c(null);
                    aVarA.k(true, true);
                }
                lop.b(this.O.B, Boolean.FALSE);
                return;
            }
            return;
        }
        this.F.x1(j6c.REGISTER);
        this.D.y.a(new ts40.a(0), (k00[]) Arrays.copyOf(new k00[]{k00.d}, 1));
        if (this.J.x()) {
            this.D.y.a(new ts40.z("log_in"), (k00[]) Arrays.copyOf(new k00[]{k00.c}, 1));
        }
        lop.b(this.O.C, Boolean.FALSE);
        m12.w = true;
        e activity4 = getActivity();
        if (activity4 != null) {
            activity4.getSupportFragmentManager().b0(-1, 1, null);
            m12.w = false;
            int i = b.a[this.J.getCountryCode().ordinal()];
            if (i == 1) {
                RegisterRevampConfig.Revamp revamp = new RegisterRevampConfig.Revamp(fv40.b);
                za zaVar = new za();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("key_register_revamp_config", revamp);
                zaVar.setArguments(bundle2);
                ybjVar = zaVar;
            } else if (i == 2) {
                ybjVar = new ybj();
            } else if (i != 3) {
                ybjVar = i != 4 ? new za() : new xgu();
            } else {
                ybjVar = new v8k0();
            }
            FragmentManager supportFragmentManager2 = activity4.getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager2);
            aVar.f(android.R.id.content, ybjVar, null);
            aVar.k(true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x03ea A[PHI: r7
      0x03ea: PHI (r7v3 int) = 
      (r7v2 int)
      (r7v4 int)
      (r7v5 int)
      (r7v6 int)
      (r7v7 int)
      (r7v8 int)
      (r7v9 int)
      (r7v10 int)
      (r7v11 int)
      (r7v12 int)
      (r7v13 int)
      (r7v14 int)
      (r7v15 int)
     binds: [B:15:0x0062, B:17:0x006e, B:19:0x0079, B:21:0x0085, B:23:0x0091, B:25:0x009e, B:27:0x00ab, B:29:0x00b8, B:31:0x00c3, B:33:0x00ce, B:35:0x00db, B:37:0x00e8, B:39:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_enter_password, viewGroup, false);
        int i2 = R.id.account_activation_container;
        if (((LinearLayout) h5e.a(R.id.account_activation_container, viewInflate)) != null) {
            i2 = R.id.account_login_dialog_compose_view;
            ComposeView composeView = (ComposeView) h5e.a(R.id.account_login_dialog_compose_view, viewInflate);
            if (composeView != null) {
                i2 = R.id.back;
                ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
                if (imageButton != null) {
                    i2 = R.id.biometric_login_compose_view;
                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.biometric_login_compose_view, viewInflate);
                    if (composeView2 != null) {
                        i2 = R.id.btn_account_activation;
                        if (((ConstraintLayout) h5e.a(R.id.btn_account_activation, viewInflate)) != null) {
                            if (((TextView) h5e.a(R.id.btn_link, viewInflate)) != null) {
                                int i3 = R.id.change_region;
                                TextView textView = (TextView) h5e.a(R.id.change_region, viewInflate);
                                if (textView != null) {
                                    i3 = R.id.close;
                                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.close, viewInflate);
                                    if (imageButton2 != null) {
                                        i3 = R.id.container_create_new;
                                        if (((LinearLayout) h5e.a(R.id.container_create_new, viewInflate)) != null) {
                                            i3 = R.id.create_new;
                                            TextView textView2 = (TextView) h5e.a(R.id.create_new, viewInflate);
                                            if (textView2 != null) {
                                                i3 = R.id.error;
                                                TextView textView3 = (TextView) h5e.a(R.id.error, viewInflate);
                                                if (textView3 != null) {
                                                    i3 = R.id.error2;
                                                    TextView textView4 = (TextView) h5e.a(R.id.error2, viewInflate);
                                                    if (textView4 != null) {
                                                        i3 = R.id.flag;
                                                        TextView textView5 = (TextView) h5e.a(R.id.flag, viewInflate);
                                                        if (textView5 != null) {
                                                            i3 = R.id.forgot_password;
                                                            TextView textView6 = (TextView) h5e.a(R.id.forgot_password, viewInflate);
                                                            if (textView6 != null) {
                                                                i3 = R.id.fragment_root;
                                                                if (((RelativeLayout) h5e.a(R.id.fragment_root, viewInflate)) != null) {
                                                                    i3 = R.id.input_container;
                                                                    if (((LinearLayout) h5e.a(R.id.input_container, viewInflate)) != null) {
                                                                        i3 = R.id.log_in;
                                                                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.log_in, viewInflate);
                                                                        if (progressButton != null) {
                                                                            i3 = R.id.mobile;
                                                                            ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.mobile, viewInflate);
                                                                            if (clearEditText != null) {
                                                                                i3 = R.id.mobile_container;
                                                                                if (((FrameLayout) h5e.a(R.id.mobile_container, viewInflate)) == null) {
                                                                                    i2 = i3;
                                                                                } else if (((LinearLayout) h5e.a(R.id.ng_deactive_reactivie_divider, viewInflate)) != null) {
                                                                                    int i4 = R.id.password_edit_text;
                                                                                    PasswordEditText passwordEditText = (PasswordEditText) h5e.a(R.id.password_edit_text, viewInflate);
                                                                                    if (passwordEditText != null) {
                                                                                        i4 = R.id.prefix;
                                                                                        TextView textView7 = (TextView) h5e.a(R.id.prefix, viewInflate);
                                                                                        if (textView7 != null) {
                                                                                            i4 = R.id.terms_and_conditions;
                                                                                            TextView textView8 = (TextView) h5e.a(R.id.terms_and_conditions, viewInflate);
                                                                                            if (textView8 != null) {
                                                                                                i4 = R.id.text_account_activation;
                                                                                                if (((TextView) h5e.a(R.id.text_account_activation, viewInflate)) != null) {
                                                                                                    this.O = new qvi((ScrollView) viewInflate, composeView, imageButton, composeView2, textView, imageButton2, textView2, textView3, textView4, textView5, textView6, progressButton, clearEditText, passwordEditText, textView7, textView8);
                                                                                                    this.I.d(clearEditText, "fs-mask");
                                                                                                    this.O.B.addTextChangedListener(new a());
                                                                                                    this.O.B.setMaxLength(this.J.l());
                                                                                                    qvi qviVar = this.O;
                                                                                                    qviVar.B.setErrorView(qviVar.w);
                                                                                                    this.O.D.setText(a8b.b());
                                                                                                    this.O.y.setText(getString(this.J.Z()));
                                                                                                    this.O.y.setCompoundDrawablesWithIntrinsicBounds(a8b.c().j(), 0, 0, 0);
                                                                                                    this.O.e.setOnClickListener(this);
                                                                                                    this.O.e.setVisibility(this.J.i(context) ? 0 : 4);
                                                                                                    this.O.f.setOnClickListener(this);
                                                                                                    this.O.A.setOnClickListener(this);
                                                                                                    this.O.i.setOnClickListener(this);
                                                                                                    this.O.z.setOnClickListener(this);
                                                                                                    this.O.A.setEnabled(false);
                                                                                                    this.O.A.setOnClickListener(this);
                                                                                                    qvi qviVar2 = this.O;
                                                                                                    qviVar2.C.setErrorView(qviVar2.v);
                                                                                                    this.O.C.setOnEditorActionListener(this);
                                                                                                    this.O.C.b.addTextChangedListener(this);
                                                                                                    final String string = getArguments() != null ? getArguments().getString("mobile") : "";
                                                                                                    boolean zIsEmpty = TextUtils.isEmpty(string);
                                                                                                    qvi qviVar3 = this.O;
                                                                                                    if (zIsEmpty) {
                                                                                                        qviVar3.B.requestFocus();
                                                                                                    } else {
                                                                                                        qviVar3.B.setText(string);
                                                                                                        this.O.C.requestFocus();
                                                                                                    }
                                                                                                    ScrollView scrollView = this.O.a;
                                                                                                    LinearLayout linearLayout = (LinearLayout) scrollView.findViewById(R.id.ng_deactive_reactivie_divider);
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) scrollView.findViewById(R.id.btn_account_activation);
                                                                                                    TextView textView9 = (TextView) scrollView.findViewById(R.id.btn_link);
                                                                                                    textView9.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                    textView9.setOnClickListener(new p9());
                                                                                                    constraintLayout.setVisibility(y7.b ? 0 : 8);
                                                                                                    linearLayout.setVisibility(y7.b ? 0 : 4);
                                                                                                    f00 f00Var = vgb0.a;
                                                                                                    vgb0.a("Reg_2_3");
                                                                                                    v8i0 viewModelStore = getViewModelStore();
                                                                                                    r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
                                                                                                    cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
                                                                                                    viewModelStore.getClass();
                                                                                                    defaultViewModelProviderFactory.getClass();
                                                                                                    defaultViewModelCreationExtras.getClass();
                                                                                                    s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                                                                                                    dq7 dq7VarA = jq40.a(aa.class);
                                                                                                    String strI = dq7VarA.i();
                                                                                                    if (strI == null) {
                                                                                                        hb5.a("Local and anonymous classes can not be ViewModels");
                                                                                                        return null;
                                                                                                    }
                                                                                                    aa aaVar = (aa) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                                                                                                    this.D = aaVar;
                                                                                                    aaVar.A.f(getViewLifecycleOwner(), new lfy() { // from class: l9
                                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                                        @Override // defpackage.lfy
                                                                                                        public final void u1(Object obj) {
                                                                                                            lk50 lk50Var = (lk50) obj;
                                                                                                            boolean z = lk50Var instanceof lk50.b;
                                                                                                            final s9 s9Var = this.a;
                                                                                                            if (z) {
                                                                                                                s9Var.O.A.setLoading(true);
                                                                                                            }
                                                                                                            int i5 = 0;
                                                                                                            if (!(lk50Var instanceof lk50.c)) {
                                                                                                                if (lk50Var instanceof lk50.a) {
                                                                                                                    s9Var.O.A.setLoading(false);
                                                                                                                    qvi qviVar4 = s9Var.O;
                                                                                                                    qviVar4.A.setEnabled(!TextUtils.isEmpty(qviVar4.C.getText()));
                                                                                                                    s9Var.o0();
                                                                                                                    return;
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            s9Var.O.A.setLoading(false);
                                                                                                            qvi qviVar5 = s9Var.O;
                                                                                                            qviVar5.A.setEnabled(!TextUtils.isEmpty(qviVar5.C.getText()));
                                                                                                            sit sitVar = (sit) ((lk50.c) lk50Var).a;
                                                                                                            String str = sitVar.a;
                                                                                                            BaseResponse<LoginResponse> baseResponse = sitVar.b;
                                                                                                            int i6 = baseResponse.bizCode;
                                                                                                            if (i6 == 10000) {
                                                                                                                LoginResponse loginResponse = baseResponse.data;
                                                                                                                if (loginResponse == null || TextUtils.isEmpty(loginResponse.getAccessToken()) || TextUtils.isEmpty(baseResponse.data.getRefreshToken()) || TextUtils.isEmpty(baseResponse.data.getUserId())) {
                                                                                                                    s9Var.o0();
                                                                                                                    return;
                                                                                                                }
                                                                                                                s9Var.B = false;
                                                                                                                s9Var.i.saveToken((AuthActivity) s9Var.getActivity(), vqm.a.a(baseResponse.data, str, sitVar.c));
                                                                                                                f00 f00Var2 = vgb0.a;
                                                                                                                vgb0.a(AnalyticsEvent.LOGIN);
                                                                                                                e activity = s9Var.getActivity();
                                                                                                                if (activity != null) {
                                                                                                                    activity.finish();
                                                                                                                    return;
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            if (i6 == 11000) {
                                                                                                                aa aaVar2 = s9Var.D;
                                                                                                                Integer numValueOf = Integer.valueOf(i6);
                                                                                                                aaVar2.getClass();
                                                                                                                aaVar2.z1("incorrect_phone_number_or_code_expired", "password", numValueOf, null);
                                                                                                                s9Var.O.B.setError(baseResponse.message);
                                                                                                                return;
                                                                                                            }
                                                                                                            if (i6 == 11623) {
                                                                                                                aa aaVar3 = s9Var.D;
                                                                                                                Integer numValueOf2 = Integer.valueOf(i6);
                                                                                                                aaVar3.getClass();
                                                                                                                aaVar3.z1("password_expired", "password", numValueOf2, null);
                                                                                                                s9Var.O.C.setError(baseResponse.message);
                                                                                                                s9Var.O.z.setText(sn5.d(s9Var, R.string.page_login__reset_password, new Object[0]));
                                                                                                                return;
                                                                                                            }
                                                                                                            if (i6 == 11644) {
                                                                                                                s9Var.m0(R.string.page_login__account_locked, baseResponse.message, R.string.common_functions__customer_service, new DialogInterface.OnClickListener() { // from class: g9
                                                                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                                                                    public final void onClick(DialogInterface dialogInterface, int i7) {
                                                                                                                        s9 s9Var2 = s9Var;
                                                                                                                        s9Var2.K.b(s9Var2.requireActivity(), snb0.ACCOUNT_ACTIVATION);
                                                                                                                    }
                                                                                                                });
                                                                                                                return;
                                                                                                            }
                                                                                                            if (i6 == 12400) {
                                                                                                                aa aaVar4 = s9Var.D;
                                                                                                                Integer numValueOf3 = Integer.valueOf(i6);
                                                                                                                aaVar4.getClass();
                                                                                                                aaVar4.z1("need_two_fa_verify", "password", numValueOf3, null);
                                                                                                                s9Var.F.x1(j6c.TWO_FA_LOGIN);
                                                                                                                s9Var.O.A.setLoading(true);
                                                                                                                ocu ocuVar = s9Var.C;
                                                                                                                ocuVar.getClass();
                                                                                                                ocuVar.I = str;
                                                                                                                ocuVar.G = false;
                                                                                                                ocuVar.H = "";
                                                                                                                ocuVar.a.c(ocuVar.b, str, false, new mcu(ocuVar, false));
                                                                                                                return;
                                                                                                            }
                                                                                                            if (i6 == 18304) {
                                                                                                                aa aaVar5 = s9Var.D;
                                                                                                                Integer numValueOf4 = Integer.valueOf(i6);
                                                                                                                aaVar5.getClass();
                                                                                                                aaVar5.z1("device_blocked", "password", numValueOf4, null);
                                                                                                                final String str2 = baseResponse.message;
                                                                                                                e activity2 = s9Var.getActivity();
                                                                                                                if (activity2 == null || activity2.isFinishing()) {
                                                                                                                    return;
                                                                                                                }
                                                                                                                final String strD = sn5.d(s9Var, R.string.common_feedback__something_went_wrong, new Object[0]);
                                                                                                                final String strD2 = sn5.d(s9Var, R.string.common_functions__ok, new Object[0]);
                                                                                                                final String strD3 = sn5.d(s9Var, R.string.common_functions__contact_support, new Object[0]);
                                                                                                                final h9 h9Var = new h9();
                                                                                                                final i9 i9Var = new i9(s9Var);
                                                                                                                str2.getClass();
                                                                                                                op8 op8Var = new op8(-1579662091, new gaj() { // from class: tyj
                                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                    @Override // defpackage.gaj
                                                                                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                                                                        final maa maaVar = (maa) obj2;
                                                                                                                        a aVar = (a) obj3;
                                                                                                                        int iIntValue = ((Integer) obj4).intValue();
                                                                                                                        maaVar.getClass();
                                                                                                                        if ((iIntValue & 6) == 0) {
                                                                                                                            iIntValue |= (iIntValue & 8) == 0 ? aVar.M(maaVar) : aVar.A(maaVar) ? 4 : 2;
                                                                                                                        }
                                                                                                                        boolean z2 = false;
                                                                                                                        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                                                                                            Object objY = aVar.y();
                                                                                                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                                                                                                            if (objY == c0042a) {
                                                                                                                                objY = m.b(Boolean.TRUE);
                                                                                                                                aVar.r(objY);
                                                                                                                            }
                                                                                                                            final ytw ytwVar = (ytw) objY;
                                                                                                                            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                                                                                                                aVar.N(243443244);
                                                                                                                                int i7 = iIntValue & 14;
                                                                                                                                boolean zA = aVar.A(null) | (i7 == 4 || ((iIntValue & 8) != 0 && aVar.A(maaVar)));
                                                                                                                                Object objY2 = aVar.y();
                                                                                                                                if (zA || objY2 == c0042a) {
                                                                                                                                    objY2 = new uyj(0, maaVar, ytwVar);
                                                                                                                                    aVar.r(objY2);
                                                                                                                                }
                                                                                                                                Function0 function0 = (Function0) objY2;
                                                                                                                                h9 h9Var2 = h9Var;
                                                                                                                                boolean zA2 = aVar.A(h9Var2) | (i7 == 4 || ((iIntValue & 8) != 0 && aVar.A(maaVar)));
                                                                                                                                Object objY3 = aVar.y();
                                                                                                                                if (zA2 || objY3 == c0042a) {
                                                                                                                                    objY3 = new vyj(h9Var2, maaVar, ytwVar);
                                                                                                                                    aVar.r(objY3);
                                                                                                                                }
                                                                                                                                Function0 function1 = (Function0) objY3;
                                                                                                                                final i9 i9Var2 = i9Var;
                                                                                                                                boolean zA3 = aVar.A(i9Var2);
                                                                                                                                if (i7 == 4 || ((iIntValue & 8) != 0 && aVar.A(maaVar))) {
                                                                                                                                    z2 = true;
                                                                                                                                }
                                                                                                                                boolean z3 = zA3 | z2;
                                                                                                                                Object objY4 = aVar.y();
                                                                                                                                if (z3 || objY4 == c0042a) {
                                                                                                                                    objY4 = new Function0() { // from class: wyj
                                                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                                                        public final Object invoke() {
                                                                                                                                            ytwVar.setValue(Boolean.FALSE);
                                                                                                                                            i9Var2.run();
                                                                                                                                            maaVar.dismiss();
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                    };
                                                                                                                                    aVar.r(objY4);
                                                                                                                                }
                                                                                                                                nzj.d(strD, str2, null, null, strD2, strD3, null, null, null, null, function0, function1, (Function0) objY4, null, aVar, 0, 0, 18332);
                                                                                                                                aVar.H();
                                                                                                                            } else {
                                                                                                                                aVar.N(244305261);
                                                                                                                                aVar.H();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            aVar.G();
                                                                                                                        }
                                                                                                                        return Unit.a;
                                                                                                                    }
                                                                                                                }, true);
                                                                                                                if (activity2.isFinishing()) {
                                                                                                                    return;
                                                                                                                }
                                                                                                                ComposeView composeView3 = new ComposeView(activity2, null, 6, 0);
                                                                                                                composeView3.setTag(R.id.view_tree_lifecycle_owner, activity2);
                                                                                                                composeView3.setTag(R.id.view_tree_view_model_store_owner, activity2);
                                                                                                                composeView3.setTag(R.id.view_tree_saved_state_registry_owner, activity2);
                                                                                                                composeView3.setContent(new op8(-1105491711, new kaa(i5, op8Var, new naa(composeView3)), true));
                                                                                                                ViewGroup viewGroup2 = (ViewGroup) activity2.findViewById(android.R.id.content);
                                                                                                                if (viewGroup2 != null) {
                                                                                                                    try {
                                                                                                                        viewGroup2.setTag(R.id.view_tree_lifecycle_owner, activity2);
                                                                                                                        viewGroup2.setTag(R.id.view_tree_view_model_store_owner, activity2);
                                                                                                                        viewGroup2.setTag(R.id.view_tree_saved_state_registry_owner, activity2);
                                                                                                                    } catch (Exception unused) {
                                                                                                                    }
                                                                                                                    viewGroup2.addView(composeView3);
                                                                                                                    return;
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            if (i6 == 11639) {
                                                                                                                aa aaVar6 = s9Var.D;
                                                                                                                Integer numValueOf5 = Integer.valueOf(i6);
                                                                                                                aaVar6.getClass();
                                                                                                                aaVar6.z1("account_self_deactivated", "password", numValueOf5, null);
                                                                                                                s9Var.m0(R.string.page_login__self_deactivated_dialog_title, baseResponse.message, R.string.common_functions__continue, new DialogInterface.OnClickListener() { // from class: q9
                                                                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                                                                    public final void onClick(DialogInterface dialogInterface, int i7) {
                                                                                                                        s9Var.M.e(o7d.a(wae.ACCOUNT_DEACTIVATE_REACTIVATE));
                                                                                                                    }
                                                                                                                });
                                                                                                                return;
                                                                                                            }
                                                                                                            if (i6 == 11640) {
                                                                                                                aa aaVar7 = s9Var.D;
                                                                                                                Integer numValueOf6 = Integer.valueOf(i6);
                                                                                                                aaVar7.getClass();
                                                                                                                aaVar7.z1("account_ops_deactivated", "password", numValueOf6, null);
                                                                                                                s9Var.m0(R.string.page_login__youre_temporarily_locked, baseResponse.message, R.string.common_functions__customer_service, new DialogInterface.OnClickListener() { // from class: r9
                                                                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                                                                    public final void onClick(DialogInterface dialogInterface, int i7) {
                                                                                                                        s9 s9Var2 = s9Var;
                                                                                                                        s9Var2.K.b(s9Var2.requireActivity(), snb0.ACCOUNT_ACTIVATION);
                                                                                                                    }
                                                                                                                });
                                                                                                                return;
                                                                                                            }
                                                                                                            switch (i6) {
                                                                                                                case 11601:
                                                                                                                case 11603:
                                                                                                                    aa aaVar8 = s9Var.D;
                                                                                                                    Integer numValueOf7 = Integer.valueOf(i6);
                                                                                                                    aaVar8.getClass();
                                                                                                                    aaVar8.z1("invalid_credentials", "password", numValueOf7, null);
                                                                                                                    s9Var.O.C.setError(sn5.d(s9Var, R.string.my_account__the_password_is_incorrect_please_try_again, new Object[0]));
                                                                                                                    break;
                                                                                                                case 11602:
                                                                                                                    aa aaVar9 = s9Var.D;
                                                                                                                    Integer numValueOf8 = Integer.valueOf(i6);
                                                                                                                    aaVar9.getClass();
                                                                                                                    aaVar9.z1("account_frozen", "password", numValueOf8, null);
                                                                                                                    s9Var.n0(baseResponse.message);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    aa aaVar10 = s9Var.D;
                                                                                                                    Integer numValueOf9 = Integer.valueOf(i6);
                                                                                                                    aaVar10.getClass();
                                                                                                                    aaVar10.z1("unknown_biz_code", "password", numValueOf9, null);
                                                                                                                    zyf0.c(1, baseResponse.message);
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    e eVarRequireActivity = requireActivity();
                                                                                                    eVarRequireActivity.getClass();
                                                                                                    v8i0 viewModelStore2 = eVarRequireActivity.getViewModelStore();
                                                                                                    r8i0.c defaultViewModelProviderFactory2 = eVarRequireActivity.getDefaultViewModelProviderFactory();
                                                                                                    s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVarRequireActivity, viewModelStore2, defaultViewModelProviderFactory2));
                                                                                                    dq7 dq7VarA2 = jq40.a(au7.class);
                                                                                                    String strI2 = dq7VarA2.i();
                                                                                                    if (strI2 == null) {
                                                                                                        hb5.a("Local and anonymous classes can not be ViewModels");
                                                                                                        return null;
                                                                                                    }
                                                                                                    this.F = (au7) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
                                                                                                    e eVarRequireActivity2 = requireActivity();
                                                                                                    eVarRequireActivity2.getClass();
                                                                                                    v8i0 viewModelStore3 = eVarRequireActivity2.getViewModelStore();
                                                                                                    r8i0.c defaultViewModelProviderFactory3 = eVarRequireActivity2.getDefaultViewModelProviderFactory();
                                                                                                    s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, sd7.a(eVarRequireActivity2, viewModelStore3, defaultViewModelProviderFactory3));
                                                                                                    dq7 dq7VarA3 = jq40.a(ocu.class);
                                                                                                    String strI3 = dq7VarA3.i();
                                                                                                    if (strI3 == null) {
                                                                                                        hb5.a("Local and anonymous classes can not be ViewModels");
                                                                                                        return null;
                                                                                                    }
                                                                                                    ocu ocuVar = (ocu) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
                                                                                                    this.C = ocuVar;
                                                                                                    xdy xdyVar = ocuVar.z;
                                                                                                    pya pyaVar = new pya() { // from class: m9
                                                                                                        @Override // defpackage.pya
                                                                                                        public final void accept(Object obj) {
                                                                                                            fcu fcuVar = (fcu) obj;
                                                                                                            int iOrdinal = fcuVar.ordinal();
                                                                                                            s9 s9Var = this.a;
                                                                                                            if (iOrdinal == 0) {
                                                                                                                lop.b(s9Var.O.C, Boolean.FALSE);
                                                                                                                Verify2FAFragment verify2FAFragment = new Verify2FAFragment();
                                                                                                                FragmentManager supportFragmentManager = s9Var.requireActivity().getSupportFragmentManager();
                                                                                                                supportFragmentManager.getClass();
                                                                                                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                                                                                                aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                                                                                                                aVar.f(android.R.id.content, verify2FAFragment, null);
                                                                                                                aVar.c(null);
                                                                                                                aVar.k(true, true);
                                                                                                            } else if (iOrdinal == 2) {
                                                                                                                Context contextRequireContext = s9Var.requireContext();
                                                                                                                contextRequireContext.getClass();
                                                                                                                String strG = fcuVar.a.g(contextRequireContext);
                                                                                                                if (TextUtils.isEmpty(strG)) {
                                                                                                                    strG = sn5.d(s9Var, R.string.page_login__two_fa_rate_limit_exceeded, new Object[0]);
                                                                                                                }
                                                                                                                e activity = s9Var.getActivity();
                                                                                                                if (activity != null && !activity.isFinishing() && ((wie) activity.getSupportFragmentManager().H("account_limit_dialog")) == null) {
                                                                                                                    String strD = sn5.d(s9Var, R.string.common_functions__ok, new Object[0]);
                                                                                                                    String strD2 = sn5.d(s9Var, R.string.page_withdraw__account_limit, new Object[0]);
                                                                                                                    wie wieVar = new wie();
                                                                                                                    wieVar.a = strG;
                                                                                                                    wieVar.c = "Cancel";
                                                                                                                    wieVar.b = strD;
                                                                                                                    wieVar.f = false;
                                                                                                                    wieVar.e = true;
                                                                                                                    wieVar.w = null;
                                                                                                                    wieVar.v = null;
                                                                                                                    wieVar.i = true;
                                                                                                                    wieVar.d = strD2;
                                                                                                                    wieVar.z = R.color.text_type1_secondary;
                                                                                                                    wieVar.y = R.color.brand_secondary;
                                                                                                                    wieVar.A = R.color.text_type1_primary;
                                                                                                                    wieVar.B = 0;
                                                                                                                    wieVar.C = 1;
                                                                                                                    wieVar.D = false;
                                                                                                                    wieVar.E = true;
                                                                                                                    wieVar.F = false;
                                                                                                                    wieVar.show(activity.getSupportFragmentManager(), "account_limit_dialog");
                                                                                                                }
                                                                                                            } else if (iOrdinal == 6) {
                                                                                                                s9Var.s0(s9Var.C.J);
                                                                                                            } else if (iOrdinal == 7) {
                                                                                                                e activity2 = s9Var.getActivity();
                                                                                                                if (activity2 != null && !activity2.isFinishing()) {
                                                                                                                    UiText uiText = fcuVar.a;
                                                                                                                    uiText.getClass();
                                                                                                                    zyf0.c(1, uiText.e(activity2).toString());
                                                                                                                }
                                                                                                            } else if (iOrdinal == 8) {
                                                                                                                s9Var.o0();
                                                                                                            }
                                                                                                            s9Var.O.A.setLoading(false);
                                                                                                            qvi qviVar4 = s9Var.O;
                                                                                                            qviVar4.A.setEnabled(!TextUtils.isEmpty(qviVar4.C.getText()));
                                                                                                        }
                                                                                                    };
                                                                                                    pya pyaVar2 = new pya() { // from class: n9
                                                                                                        @Override // defpackage.pya
                                                                                                        public final void accept(Object obj) {
                                                                                                            this.a.o0();
                                                                                                        }
                                                                                                    };
                                                                                                    xdyVar.getClass();
                                                                                                    rlr rlrVar = new rlr(pyaVar, pyaVar2, taj.c);
                                                                                                    xdyVar.a(rlrVar);
                                                                                                    this.E = rlrVar;
                                                                                                    aa aaVar2 = this.D;
                                                                                                    aaVar2.getClass();
                                                                                                    ej5.c(o8i0.d(aaVar2), null, null, new u9(aaVar2, string, null), 3);
                                                                                                    ComposeView composeView3 = this.O.d;
                                                                                                    final f9 f9Var = new f9(this, i);
                                                                                                    final aa aaVar3 = this.D;
                                                                                                    aaVar3.getClass();
                                                                                                    mla.i(composeView3, new op8(-1565365691, new Function2() { // from class: i74
                                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                                                            a aVar = (a) obj;
                                                                                                            int iIntValue = ((Integer) obj2).intValue();
                                                                                                            int i5 = 0;
                                                                                                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                                final aa aaVar4 = aaVar3;
                                                                                                                q74 q74Var = (q74) wyh.c(aaVar4.D, aVar, 0, 7).getValue();
                                                                                                                boolean zA = aVar.A(aaVar4);
                                                                                                                final String str = string;
                                                                                                                boolean zM = zA | aVar.M(str);
                                                                                                                Object objY = aVar.y();
                                                                                                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                                                                                                if (zM || objY == c0042a) {
                                                                                                                    objY = new Function1() { // from class: j74
                                                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                                                        public final Object invoke(Object obj3) {
                                                                                                                            qd4.c cVar = (qd4.c) obj3;
                                                                                                                            String str2 = str;
                                                                                                                            if (str2 == null) {
                                                                                                                                str2 = "";
                                                                                                                            }
                                                                                                                            aa aaVar5 = aaVar4;
                                                                                                                            aaVar5.getClass();
                                                                                                                            itf0.a.g("On Auth Succeeded " + cVar, new Object[0]);
                                                                                                                            ej5.c(o8i0.d(aaVar5), null, null, new y9(aaVar5, str2, cVar, null), 3);
                                                                                                                            return Unit.a;
                                                                                                                        }
                                                                                                                    };
                                                                                                                    aVar.r(objY);
                                                                                                                }
                                                                                                                Function1 function1 = (Function1) objY;
                                                                                                                boolean zA2 = aVar.A(aaVar4);
                                                                                                                Object objY2 = aVar.y();
                                                                                                                if (zA2 || objY2 == c0042a) {
                                                                                                                    objY2 = new k74(aaVar4, i5);
                                                                                                                    aVar.r(objY2);
                                                                                                                }
                                                                                                                Function1 function2 = (Function1) objY2;
                                                                                                                boolean zA3 = aVar.A(aaVar4);
                                                                                                                Object objY3 = aVar.y();
                                                                                                                if (zA3 || objY3 == c0042a) {
                                                                                                                    objY3 = new l74(aaVar4, i5);
                                                                                                                    aVar.r(objY3);
                                                                                                                }
                                                                                                                p74.a(null, q74Var, f9Var, function1, function2, (Function0) objY3, aVar, 64);
                                                                                                            } else {
                                                                                                                aVar.G();
                                                                                                            }
                                                                                                            return Unit.a;
                                                                                                        }
                                                                                                    }, true));
                                                                                                    ComposeView composeView4 = this.O.b;
                                                                                                    aa aaVar4 = this.D;
                                                                                                    aaVar4.getClass();
                                                                                                    mla.i(composeView4, new op8(-1796449654, new h74(aaVar4, i), true));
                                                                                                    if (this.J.O()) {
                                                                                                        TextView textView10 = this.O.E;
                                                                                                        textView10.setVisibility(0);
                                                                                                        String strD = sn5.d(this, R.string.page_login__terms_conditions, new Object[0]);
                                                                                                        textView10.setText(sn5.d(this, R.string.page_login__by_logging_in_you_accept_and_agree_to_our_vterms, strD));
                                                                                                        Pair[] pairArr = {new Pair(strD, new o9())};
                                                                                                        SpannableString spannableString = new SpannableString(textView10.getText());
                                                                                                        Pair pair = pairArr[0];
                                                                                                        gi7 gi7Var = new gi7(textView10, pair);
                                                                                                        int iT = StringsKt.T(textView10.getText().toString(), (String) pair.a, 0, false, 4);
                                                                                                        spannableString.setSpan(gi7Var, iT, ((String) pair.a).length() + iT, 33);
                                                                                                        textView10.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                        textView10.setText(spannableString, TextView.BufferType.SPANNABLE);
                                                                                                    }
                                                                                                    return this.O.a;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    i2 = i4;
                                                                                } else {
                                                                                    i2 = R.id.ng_deactive_reactivie_divider;
                                                                                }
                                                                            } else {
                                                                                i2 = i3;
                                                                            }
                                                                        } else {
                                                                            i2 = i3;
                                                                        }
                                                                    } else {
                                                                        i2 = i3;
                                                                    }
                                                                } else {
                                                                    i2 = i3;
                                                                }
                                                            } else {
                                                                i2 = i3;
                                                            }
                                                        } else {
                                                            i2 = i3;
                                                        }
                                                    } else {
                                                        i2 = i3;
                                                    }
                                                } else {
                                                    i2 = i3;
                                                }
                                            } else {
                                                i2 = i3;
                                            }
                                        } else {
                                            i2 = i3;
                                        }
                                    } else {
                                        i2 = i3;
                                    }
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                i2 = R.id.btn_link;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        qvi qviVar = this.O;
        if (qviVar != null) {
            qviVar.B.removeTextChangedListener(this);
        }
        this.C.a.a();
        this.O = null;
        super.onDestroyView();
        rlr rlrVar = this.E;
        if (rlrVar == null || rlrVar.isDisposed()) {
            return;
        }
        rlr rlrVar2 = this.E;
        rlrVar2.getClass();
        xse.a(rlrVar2);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        s0(this.O.C.getText());
        return true;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        lop.b(this.O.C, Boolean.FALSE);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        r0();
        this.O.C.setError(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        yyh.b(this.D.D, getViewLifecycleOwner(), s9s.b.d, new j9(this, 0));
        i2i.b(this.L.h(pu0.b.a)).f(getViewLifecycleOwner(), new lfy() { // from class: k9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                e activity;
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    AssetsInfo assetsInfo = (AssetsInfo) ((lk50.c) lk50Var).a;
                    s9 s9Var = this.a;
                    if (!s9Var.B || assetsInfo == null || (activity = s9Var.getActivity()) == null) {
                        return;
                    }
                    activity.finish();
                }
            }
        });
    }

    public final void r0() {
        qvi qviVar = this.O;
        if (qviVar == null) {
            return;
        }
        ProgressButton progressButton = qviVar.A;
        if (progressButton.isLoading) {
            return;
        }
        progressButton.setEnabled((TextUtils.isEmpty(qviVar.B.getText()) || TextUtils.isEmpty(this.O.C.getText())) ? false : true);
    }

    public final void s0(CharSequence charSequence) {
        String string = this.O.B.getText() != null ? this.O.B.getText().toString() : "";
        if (TextUtils.isEmpty(string)) {
            this.O.C.setError(sn5.d(this, R.string.my_account__the_password_is_incorrect_please_try_again, new Object[0]));
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (!this.G.isConnected()) {
            aa aaVar = this.D;
            aaVar.getClass();
            aaVar.z1("network_unavailable", "password", null, null);
            p0();
            return;
        }
        this.O.A.setLoading(true);
        ocu ocuVar = this.C;
        String string2 = charSequence.toString();
        ocuVar.getClass();
        string2.getClass();
        ocuVar.J = string2;
        aa aaVar2 = this.D;
        String strC = uel.c(charSequence.toString());
        aaVar2.getClass();
        string.getClass();
        jvd0 jvd0Var = aaVar2.B;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        aaVar2.B = kzh.d(new g1i(bm50.a(new v9(aaVar2.d.h(string, strC), string)), new w9(aaVar2, null)), o8i0.d(aaVar2));
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            s9 s9Var = s9.this;
            if (s9Var.O != null) {
                s9Var.r0();
                s9Var.O.B.setError((String) null);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
