package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.PasswordEditText;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.a;
import com.sportybet.android.auth.AuthActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class bi80 extends dol implements View.OnClickListener, TextView.OnEditorActionListener, TextWatcher, k9j, j9j {
    public ProgressButton C;
    public PasswordEditText D;
    public String E;
    public q5s F;
    public lu40 G;
    public nsm H;
    public y8j I;
    public com.sporty.android.platform.features.newotp.util.a J;
    public psm K;
    public v5 L;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putString("title", bi80.this.getString(R.string.common_helps__t_and_c));
            sh8.c().c(bjb0.S("/m/help#/about/terms-and-conditions"), bundle);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public bi80() {
        super(2);
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_STEP, "set_password")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) == null) {
            vgb0.c(AnalyticsEvent.SIGN_UP, Collections.unmodifiableMap(map), true);
        } else {
            hb5.a(wga.a(key, "duplicate key: "));
            throw null;
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getA() {
        return "SetPasswordFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.fragment_root) {
            lop.b(view, Boolean.FALSE);
            return;
        }
        if (id == R.id.back) {
            getActivity().getOnBackPressedDispatcher().d();
        } else if (id == R.id.close) {
            getActivity().finish();
        } else if (id == R.id.sign_up) {
            q0(this.D.getText().toString());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_set_password, viewGroup, false);
        if (getArguments() != null && getArguments().containsKey("mobile")) {
            this.E = getArguments().getString("mobile");
        }
        viewInflate.findViewById(R.id.close).setOnClickListener(this);
        ProgressButton progressButton = (ProgressButton) viewInflate.findViewById(R.id.sign_up);
        this.C = progressButton;
        progressButton.setEnabled(false);
        this.C.setButtonText(R.string.page_login__create_account);
        this.C.setOnClickListener(this);
        viewInflate.findViewById(R.id.back).setOnClickListener(this);
        viewInflate.setOnClickListener(this);
        PasswordEditText passwordEditText = (PasswordEditText) viewInflate.findViewById(R.id.password_edit_text);
        this.D = passwordEditText;
        this.I.d(passwordEditText, "fs-mask");
        this.D.setErrorView((TextView) viewInflate.findViewById(R.id.error));
        this.D.setOnEditorActionListener(this);
        this.D.b.addTextChangedListener(this);
        this.D.requestFocus();
        lop.d(this.D);
        SpannableString spannableString = new SpannableString(getString(R.string.page_login__by_creating_an_account_you_agree_to_our_vterms_and_confirm_tip, getString(R.string.common_helps__t_and_c)));
        spannableString.setSpan(new a(), 41, 59, 17);
        TextView textView = (TextView) viewInflate.findViewById(R.id.terms);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        getActivity().getWindow().setSoftInputMode(32);
        f00 f00Var = vgb0.a;
        vgb0.a("Reg_2");
        this.I.e(this.C, "register__create_account_btn");
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(q5s.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.F = (q5s) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(lu40.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.G = (lu40) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.F.w.f(getViewLifecycleOwner(), new lfy() { // from class: yh80
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                bi50 bi50Var = (bi50) obj;
                String string = "";
                bi80 bi80Var = this.a;
                e activity = bi80Var.getActivity();
                if (activity == null || activity.isFinishing() || bi80Var.isDetached() || bi80Var.getLifecycle().b() != s9s.b.e) {
                    return;
                }
                bi80Var.C.setLoading(false);
                bi80Var.C.setEnabled(!TextUtils.isEmpty(bi80Var.D.getText()));
                if (bi50Var == null) {
                    bi80Var.p0(null);
                    return;
                }
                BaseResponse baseResponse = (BaseResponse) bi50Var.b;
                if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
                    bi80Var.p0(null);
                    return;
                }
                int i = baseResponse.bizCode;
                if (i != 10000) {
                    if (i == 10110) {
                        bi80Var.p0(bi80Var.getString(R.string.register_login_int__error_create_account_10110));
                        return;
                    } else if (i != 11000) {
                        bi80Var.p0(baseResponse.message);
                        return;
                    } else {
                        bi80Var.p0(bi80Var.getString(R.string.common_feedback__please_enter_a_valid_mobile_number));
                        return;
                    }
                }
                T t = baseResponse.data;
                if (t == 0 || ((PreRegisterResponse) t).getIgnoreVerificationCode() == null) {
                    return;
                }
                if (((PreRegisterResponse) baseResponse.data).getIgnoreVerificationCode().booleanValue()) {
                    bi80Var.C.setLoading(true);
                    q5s q5sVar = bi80Var.F;
                    String strP = bi80Var.K.P();
                    String str = bi80Var.E;
                    if (q5sVar.D != null) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("otpToken", "");
                        jSONObject.put("otpCode", "");
                        jSONObject.put("phoneCountryCode", strP);
                        jSONObject.put("phone", str);
                        string = jSONObject.toString();
                    } catch (JSONException unused) {
                    }
                    su5<BaseResponse<OTPCompleteResult>> su5VarA = q5sVar.a.a(string);
                    q5sVar.D = su5VarA;
                    su5VarA.G(new p5s(q5sVar, q5sVar.y));
                    return;
                }
                if (TextUtils.isEmpty(bi80Var.E)) {
                    bi80Var.p0(bi80Var.getString(R.string.common_feedback__please_enter_a_valid_mobile_number));
                    return;
                }
                lu40 lu40Var = bi80Var.G;
                RegisterRevampConfig registerRevampConfig = lu40Var.b;
                String str2 = bi80Var.E;
                String strP2 = bi80Var.K.P();
                String string2 = bi80Var.D.getText().toString();
                str2.getClass();
                strP2.getClass();
                string2.getClass();
                registerRevampConfig.getClass();
                if (registerRevampConfig instanceof RegisterRevampConfig.Revamp) {
                    nm5 nm5Var = lu40Var.a;
                    nm5Var.getClass();
                    nm5Var.a = new nm5.a(strP2, str2, string2, registerRevampConfig);
                }
                a aVar = bi80Var.J;
                String str3 = bi80Var.E;
                String strP3 = bi80Var.K.P();
                aVar.getClass();
                OtpModule otpModuleB = a.b(str3, strP3, registerRevampConfig);
                vqx vqxVar = new vqx();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("key - module", otpModuleB);
                vqxVar.setArguments(bundle2);
                FragmentManager supportFragmentManager = bi80Var.getActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                aVar2.f(android.R.id.content, vqxVar, "NewOtpSelectorFragment");
                aVar2.c("NewOtpSelectorFragment");
                aVar2.k(true, true);
            }
        });
        this.F.y.f(getViewLifecycleOwner(), new lfy() { // from class: ai80
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                bi50 bi50Var = (bi50) obj;
                bi80 bi80Var = this.a;
                e activity = bi80Var.getActivity();
                if (activity == null || activity.isFinishing() || bi80Var.isDetached() || !bi80Var.isVisible() || bi80Var.getLifecycle().b() != s9s.b.e) {
                    return;
                }
                bi80Var.C.setLoading(false);
                bi80Var.C.setEnabled(!TextUtils.isEmpty(bi80Var.D.getText()));
                if (bi50Var == null) {
                    bi80Var.p0(null);
                    return;
                }
                BaseResponse baseResponse = (BaseResponse) bi50Var.b;
                if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
                    bi80Var.p0(null);
                    return;
                }
                OTPCompleteResult oTPCompleteResult = (OTPCompleteResult) baseResponse.data;
                String string = baseResponse.message;
                int i = baseResponse.bizCode;
                if (i == 10000) {
                    if (bi80Var.L.b((AuthActivity) bi80Var.getActivity(), oTPCompleteResult, bi80Var.E)) {
                        return;
                    }
                    bi80Var.p0(null);
                    return;
                }
                if (i == 11601) {
                    bi80Var.p0(bi80Var.getString(R.string.app_common__mobile_number_has_not_been_registered));
                    return;
                }
                if (i == 11611) {
                    bi80Var.p0(string);
                } else {
                    if (i != 11810) {
                        zyf0.c(1, string);
                        return;
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = bi80Var.getString(R.string.common_otp_verify__code_expired_desc);
                    }
                    bi80Var.p0(string);
                }
            }
        });
        return viewInflate;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        q0(this.D.getText().toString());
        return true;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        lop.a(this.D);
        super.onPause();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ProgressButton progressButton = this.C;
        if (!progressButton.isLoading) {
            progressButton.setEnabled(!TextUtils.isEmpty(charSequence));
        }
        this.D.setError(null);
    }

    public final void p0(String str) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        b.a aVar = new b.a(context);
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
        }
        aVar.a.f = str;
        b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, null).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void q0(String str) {
        f00 f00Var = vgb0.a;
        vgb0.a("Reg_2_1");
        this.F.e.a(new ts40.v(0), k00.d);
        if (!TextUtils.isEmpty(str) && twz.b(str, this.D)) {
            String string = getArguments() != null ? getArguments().getString("mobile") : null;
            vgb0.a("Reg_2_2");
            if (!this.H.isConnected()) {
                p0(null);
                return;
            }
            this.C.setLoading(true);
            if (!TextUtils.isEmpty(string)) {
                this.E = string;
            } else if (TextUtils.isEmpty(this.E)) {
                p0(getString(R.string.common_feedback__please_enter_a_valid_mobile_number));
                this.C.setLoading(false);
                return;
            }
            q5s q5sVar = this.F;
            String str2 = this.E;
            if (q5sVar.C != null) {
                return;
            }
            su5<BaseResponse<PreRegisterResponse>> su5VarB = q5sVar.a.b(q5sVar.d.P(), str2, uel.c(str));
            q5sVar.C = su5VarB;
            su5VarB.G(new o5s(q5sVar, q5sVar.w));
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
