package com.sportybet.android.user;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.ChangeUserInfoActivity;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a67;
import defpackage.au7;
import defpackage.b67;
import defpackage.bb40;
import defpackage.bi50;
import defpackage.ct90;
import defpackage.cyb;
import defpackage.d67;
import defpackage.dq7;
import defpackage.ej5;
import defpackage.ema;
import defpackage.gr0;
import defpackage.gv5;
import defpackage.h67;
import defpackage.hb5;
import defpackage.hol;
import defpackage.i67;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.lfy;
import defpackage.lop;
import defpackage.nsm;
import defpackage.o8i0;
import defpackage.psm;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.su5;
import defpackage.to20;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.vym;
import defpackage.wm70;
import defpackage.xdp;
import defpackage.xxz;
import defpackage.y8j;
import defpackage.z57;
import defpackage.zyf0;
import java.net.ConnectException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeUserInfoActivity extends hol implements View.OnClickListener, TextView.OnEditorActionListener, vym, ClearEditText.b, k9j, to20, bb40 {
    public static final /* synthetic */ int L = 0;
    public psm A;
    public xxz B;
    public RelativeLayout E;
    public LinearLayout F;
    public TextView G;
    public TextView H;
    public i67 J;
    public au7 K;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public ProgressButton i;
    public ClearEditText v;
    public TextView w;
    public nsm y;
    public y8j z;
    public final InputFilter[] C = {new InputFilter.LengthFilter(60)};
    public final InputFilter[] D = {new a67(), new InputFilter.LengthFilter(15)};
    public final ema I = new ema();

    public class a implements gv5<BaseResponse<String>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<String>> su5Var, Throwable th) {
            ChangeUserInfoActivity changeUserInfoActivity = ChangeUserInfoActivity.this;
            changeUserInfoActivity.i.setLoading(false);
            changeUserInfoActivity.A1(changeUserInfoActivity.getCMSString(R.string.common_feedback__something_went_wrong_tip, new Object[0]));
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<String>> su5Var, bi50<BaseResponse<String>> bi50Var) {
            ChangeUserInfoActivity changeUserInfoActivity = ChangeUserInfoActivity.this;
            changeUserInfoActivity.i.setLoading(false);
            BaseResponse<String> baseResponse = bi50Var.b;
            if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
                changeUserInfoActivity.A1(changeUserInfoActivity.getCMSString(R.string.common_feedback__something_went_wrong_tip, new Object[0]));
                return;
            }
            int i = baseResponse.bizCode;
            if (i == 10000) {
                Intent intent = new Intent();
                int intExtra = changeUserInfoActivity.getIntent().getIntExtra("requestCode", -1);
                intent.putExtra("save_value", changeUserInfoActivity.C1());
                intent.putExtra("requestCode", intExtra);
                changeUserInfoActivity.setResult(-1, intent);
                if (changeUserInfoActivity.e != 0) {
                    zyf0.c(1, changeUserInfoActivity.getCMSString(R.string.common_feedback__succeeded, new Object[0]));
                } else {
                    zyf0.c(1, changeUserInfoActivity.getCMSString(R.string.common_info_setting__username_saved, new Object[0]));
                }
                changeUserInfoActivity.finish();
                return;
            }
            if (i == 19003) {
                changeUserInfoActivity.A1(baseResponse.message);
                return;
            }
            switch (i) {
                case 11011:
                    changeUserInfoActivity.v.setError(TextUtils.isEmpty(baseResponse.message) ? changeUserInfoActivity.getCMSString(R.string.common_info_setting__user_name_already_exists, new Object[0]) : baseResponse.message);
                    break;
                case 11012:
                    changeUserInfoActivity.v.setError(TextUtils.isEmpty(baseResponse.message) ? changeUserInfoActivity.getCMSString(R.string.common_info_setting__username_over_max_length, new Object[0]) : baseResponse.message);
                    break;
                case 11013:
                    changeUserInfoActivity.v.setError(TextUtils.isEmpty(baseResponse.message) ? changeUserInfoActivity.getCMSString(R.string.common_info_setting__username_not_match_format, new Object[0]) : baseResponse.message);
                    break;
                default:
                    changeUserInfoActivity.v.setError(TextUtils.isEmpty(baseResponse.message) ? changeUserInfoActivity.getCMSString(R.string.common_feedback__something_went_wrong_tip, new Object[0]) : baseResponse.message);
                    break;
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            int i2 = ChangeUserInfoActivity.L;
            ChangeUserInfoActivity changeUserInfoActivity = ChangeUserInfoActivity.this;
            intent.putExtra("save_value", changeUserInfoActivity.C1());
            changeUserInfoActivity.setResult(-1, intent);
            changeUserInfoActivity.finish();
        }
    }

    public final void A1(String str) {
        if (isFinishing()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
        }
        if (isFinishing()) {
            return;
        }
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
        AlertController.b bVar = aVar.a;
        bVar.f = str;
        bVar.k = false;
        aVar.setPositiveButton(R.string.common_functions__ok, null).f();
    }

    public final void B1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!(TextUtils.isEmpty(str) ? false : Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*").matcher(str).matches())) {
            this.v.setError(getCMSString(R.string.my_account__please_enter_a_vaild_email_address, new Object[0]));
            return;
        }
        this.i.setLoading(true);
        i67 i67Var = this.J;
        j6c j6cVar = j6c.INITIAL;
        i67Var.getClass();
        str.getClass();
        xdp xdpVar = new xdp();
        xdpVar.i("mail", str);
        ej5.c(o8i0.d(i67Var), null, null, new h67(i67Var, str, xdpVar.toString(), null), 3);
    }

    public final String C1() {
        return !TextUtils.isEmpty(this.v.getText()) ? this.v.getText().toString() : "";
    }

    public final void D1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.y.isConnected()) {
            A1(null);
        } else {
            this.i.setLoading(true);
            this.B.L(this.f, str, null, null).G(new a());
        }
    }

    @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
    public final void l(CharSequence charSequence) {
        this.v.setError((String) null);
        this.i.setEnabled(charSequence.length() > 0);
        if (charSequence.length() == 0) {
            lop.d(this.v);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.activity_root) {
            lop.a(this.v);
            return;
        }
        if (id == R.id.back_icon) {
            getOnBackPressedDispatcher().d();
            lop.a(this.v);
        } else if (id == R.id.save_btn) {
            lop.a(this.v);
            int i = this.e;
            if (i == 5 || i == 6) {
                B1(this.v.getText().toString());
            } else {
                D1(C1());
            }
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reset_info);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(au7.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.K = (au7) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(i67.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        i67 i67Var = (i67) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.J = i67Var;
        i67Var.i.f(this, new lfy() { // from class: y57
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                int i = ChangeUserInfoActivity.L;
                boolean z = lk50Var instanceof lk50.c;
                ChangeUserInfoActivity changeUserInfoActivity = this.a;
                if (!z) {
                    if (lk50Var instanceof lk50.a) {
                        changeUserInfoActivity.i.setLoading(false);
                        Throwable th = ((lk50.a) lk50Var).a;
                        if (th instanceof ConnectException) {
                            changeUserInfoActivity.A1(null);
                            return;
                        } else if (th instanceof CaptchaError) {
                            changeUserInfoActivity.A1(((CaptchaError) th).getErrorString(changeUserInfoActivity));
                            return;
                        } else {
                            changeUserInfoActivity.A1(changeUserInfoActivity.getCMSString(R.string.common_feedback__something_went_wrong_tip, new Object[0]));
                            return;
                        }
                    }
                    return;
                }
                BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                changeUserInfoActivity.i.setLoading(false);
                if (baseResponse == null) {
                    changeUserInfoActivity.A1(null);
                    return;
                }
                int i2 = baseResponse.bizCode;
                if (i2 == 10000) {
                    changeUserInfoActivity.z1(changeUserInfoActivity.getCMSString(R.string.component_supporter__an_email_has_been_sent_to_the_address_above_tip, new Object[0]));
                    return;
                }
                switch (i2) {
                    case 12000:
                        zyf0.c(1, TextUtils.isEmpty(baseResponse.message) ? changeUserInfoActivity.getCMSString(R.string.common_info_setting__user_already_bind_email, new Object[0]) : baseResponse.message);
                        break;
                    case 12001:
                        changeUserInfoActivity.v.setError(TextUtils.isEmpty(baseResponse.message) ? changeUserInfoActivity.getCMSString(R.string.my_account__this_email_is_linked_to_another_account_etc, new Object[0]) : baseResponse.message);
                        break;
                    case 12002:
                    case 12003:
                        changeUserInfoActivity.z1(baseResponse.message);
                        break;
                    default:
                        changeUserInfoActivity.A1(TextUtils.isEmpty(baseResponse.message) ? changeUserInfoActivity.getCMSString(R.string.common_feedback__something_went_wrong_tip, new Object[0]) : baseResponse.message);
                        break;
                }
            }
        });
        this.e = getIntent().getIntExtra("title_property", -1);
        this.c = getIntent().getStringExtra("key_name");
        int i = this.e;
        if (i == -1) {
            finish();
            return;
        }
        if (i == 0) {
            String cMSString = getCMSString(R.string.wap_profile__username, new Object[0]);
            this.d = cMSString;
            this.b = cMSString;
            this.f = "nickname";
            if (!TextUtils.isEmpty(this.c)) {
                this.c = this.c.replaceAll(" ", "");
            }
        } else if (i == 1) {
            String cMSString2 = getCMSString(R.string.wap_profile__firstname, new Object[0]);
            this.d = cMSString2;
            this.b = cMSString2;
            this.f = "firstName";
        } else if (i == 2) {
            this.d = getCMSString(R.string.wap_profile__lastname, new Object[0]);
            if (this.A.O()) {
                this.d = getCMSString(R.string.wap_profile__lastname__ZA, new Object[0]);
            }
            this.b = this.d;
            this.f = "lastName";
        } else if (i == 4) {
            String cMSString3 = getCMSString(R.string.wap_profile__phone, new Object[0]);
            this.d = cMSString3;
            this.b = cMSString3;
            this.f = "phone";
        } else if (i == 5) {
            this.K.x1(j6c.VERIFY_EMAIL);
            this.d = getCMSString(R.string.wap_profile__email, new Object[0]);
            this.b = getCMSString(R.string.my_account__email_address, new Object[0]);
            this.f = "email";
        } else if (i == 6) {
            this.K.x1(j6c.VERIFY_EMAIL);
            this.d = getCMSString(R.string.common_functions__withdraw, new Object[0]);
            this.b = getCMSString(R.string.my_account__email_address, new Object[0]);
            this.f = "email";
        }
        this.i = (ProgressButton) findViewById(R.id.save_btn);
        this.w = (TextView) findViewById(R.id.left_number);
        this.i.setEnabled(true);
        int i2 = this.e;
        if (i2 == 5 || i2 == 6) {
            this.i.setButtonText(R.string.identity_verification__verify);
            this.i.setLoadingText(R.string.common_functions__submitting_with_dot);
        } else {
            this.i.setButtonText(R.string.common_functions__save);
        }
        this.i.setOnClickListener(this);
        ClearEditText clearEditText = (ClearEditText) findViewById(R.id.edit_text);
        this.v = clearEditText;
        this.z.d(clearEditText, "fs-mask");
        this.v.setErrorView((TextView) findViewById(R.id.error));
        this.v.setCanCopy(this.e != 5);
        if (this.e == 0) {
            this.v.addTextChangedListener(new b67(this));
            this.v.setFilters(this.D);
            boolean zIsEmpty = TextUtils.isEmpty(this.c);
            TextView textView = this.w;
            if (zIsEmpty) {
                textView.setText("0/15");
            } else {
                textView.setText(this.c.length() + "/15");
            }
        }
        this.v.setTextChangedListener(this);
        this.v.setHint(this.b);
        if (!TextUtils.isEmpty(this.c)) {
            this.v.setText(this.c);
        }
        ClearEditText clearEditText2 = this.v;
        int i3 = this.e;
        clearEditText2.setInputType((i3 == 5 || i3 == 6) ? 32 : 96);
        this.v.setOnEditorActionListener(this);
        int i4 = this.e;
        if (i4 != 6 && i4 != 0) {
            this.v.setFilters(this.C);
        }
        int i5 = this.e;
        if (i5 != 5 && i5 != 6) {
            this.v.requestFocus();
            lop.d(this.v);
        }
        ((TextView) findViewById(R.id.back_title)).setText(this.d);
        ImageView imageView = (ImageView) findViewById(R.id.back_icon);
        imageView.setOnClickListener(this);
        Drawable drawableA = gr0.a(this, R.drawable.ic_action_bar_back);
        if (drawableA != null) {
            drawableA.mutate();
            drawableA.setTint(-1);
        }
        imageView.setImageDrawable(drawableA);
        findViewById(R.id.activity_root).setOnClickListener(this);
        this.E = (RelativeLayout) findViewById(R.id.input_container);
        this.F = (LinearLayout) findViewById(R.id.verified_container);
        this.G = (TextView) findViewById(R.id.verified_email);
        this.H = (TextView) findViewById(R.id.verified_notes);
        findViewById(R.id.home).setOnClickListener(new z57());
        int i6 = this.e;
        if (i6 != 5 && i6 != 6) {
            this.E.setVisibility(0);
            return;
        }
        ct90<BaseResponse<Boolean>> ct90VarB = this.B.f1().d(wm70.c).b(va0.a());
        d67 d67Var = new d67(this);
        ct90VarB.a(d67Var);
        this.I.b(d67Var);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.I.d();
        super.onDestroy();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        lop.a(this.v);
        int i2 = this.e;
        if (i2 == 5 || i2 == 6) {
            B1(this.v.getText().toString());
            return true;
        }
        D1(C1());
        return true;
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        lop.a(this.v);
    }

    public final void z1(String str) {
        if (TextUtils.isEmpty(str) || isFinishing()) {
            return;
        }
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
        AlertController.b bVar = aVar.a;
        bVar.f = str;
        bVar.k = false;
        aVar.setPositiveButton(R.string.common_functions__ok, new b()).f();
    }
}
