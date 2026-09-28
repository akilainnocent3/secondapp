package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.b;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.PasswordEditText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.a;
import com.sportybet.android.account.international.INTAuthActivity;
import com.sportybet.android.auth.AuthActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public class z8g extends tql implements View.OnClickListener, TextView.OnEditorActionListener, TextWatcher, k9j, j9j {
    public PasswordEditText C;
    public ProgressButton D;
    public View E;
    public su5<BaseResponse<xdp>> F;
    public String G;
    public nsm H;
    public y8j I;
    public a J;
    public psm K;
    public avz L;
    public fi80 M;
    public xxz N;
    public rx20 O;
    public final ee<Intent> P;

    public z8g() {
        super(0);
        this.P = registerForActivityResult(new ce(), new ud() { // from class: x8g
            @Override // defpackage.ud
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.g("[Info] result.getResultCode() = %s", Integer.valueOf(activityResult.a));
                if (activityResult.a == 0) {
                    this.a.getActivity().finish();
                }
            }
        });
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getB() {
        return "EnterOldPasswordFragment";
    }

    public final void o0(String str) {
        if (TextUtils.isEmpty(str)) {
            this.C.setError(sn5.d(this, R.string.my_account__old_password_is_required, new Object[0]));
            return;
        }
        if (this.H.isConnected()) {
            this.D.setLoading(true);
            su5<BaseResponse<xdp>> su5VarK0 = this.N.k0(this.O.a(str));
            this.F = su5VarK0;
            su5VarK0.G(new y8g(this));
            return;
        }
        String strD = TextUtils.isEmpty(null) ? sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]) : null;
        b.a aVar = new b.a(getContext());
        aVar.a.f = strD;
        b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, null).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.E.setOnClickListener(this);
        this.E.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back) {
            getActivity().getOnBackPressedDispatcher().d();
            lop.a(this.C);
            return;
        }
        if (id == R.id.close) {
            getActivity().finish();
            lop.a(this.C);
            return;
        }
        if (id == R.id.fragment_root) {
            lop.a(this.C);
            return;
        }
        if (id == R.id.log_in) {
            o0(this.C.getText().toString());
            lop.a(this.C);
            return;
        }
        if (id == R.id.forgot_password) {
            if (this.K.b0()) {
                Intent intent = new Intent(getContext(), (Class<?>) INTAuthActivity.class);
                intent.putExtra(AuthActivity.KEY_IS_FORGET_PASSWORD, true);
                this.P.b(intent);
                return;
            }
            lop.a(this.C);
            String str = this.G;
            if (str == null) {
                zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, 0);
                return;
            }
            a aVar = this.J;
            String strP = this.K.P();
            aVar.getClass();
            OtpModule otpModuleD = a.d(str, strP);
            vqx vqxVar = new vqx();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key - module", otpModuleD);
            vqxVar.setArguments(bundle);
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
            String str2 = vqxVar.A;
            aVar2.f(android.R.id.content, vqxVar, str2);
            aVar2.c(str2);
            aVar2.k(true, true);
        }
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G = this.i.getLastAccount();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_enter_passwd, viewGroup, false);
        this.E = viewInflate.findViewById(R.id.back);
        viewInflate.findViewById(R.id.close).setOnClickListener(this);
        viewInflate.findViewById(R.id.log_in).setOnClickListener(this);
        viewInflate.findViewById(R.id.forgot_password).setOnClickListener(this);
        viewInflate.setOnClickListener(this);
        ProgressButton progressButton = (ProgressButton) viewInflate.findViewById(R.id.log_in);
        this.D = progressButton;
        progressButton.setEnabled(false);
        this.D.setOnClickListener(this);
        PasswordEditText passwordEditText = (PasswordEditText) viewInflate.findViewById(R.id.password_edit_text);
        this.C = passwordEditText;
        this.I.d(passwordEditText, "fs-mask");
        this.C.setErrorView((TextView) viewInflate.findViewById(R.id.error));
        this.C.setOnEditorActionListener(this);
        this.C.setHint(sn5.d(this, R.string.my_account__old_password, new Object[0]));
        lop.d(this.C);
        this.C.b.addTextChangedListener(this);
        ((ProgressButton) viewInflate.findViewById(R.id.forgot_password)).setOnClickListener(this);
        return viewInflate;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        o0(this.C.getText().toString());
        lop.a(this.C);
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ProgressButton progressButton = this.D;
        if (!progressButton.isLoading) {
            progressButton.setEnabled(!TextUtils.isEmpty(charSequence));
        }
        this.C.setError(null);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
